package androidx.camera.core.streamsharing;

/* loaded from: classes14.dex */
public class DynamicRangeUtils {
    private DynamicRangeUtils() {
    }

    private static androidx.camera.core.DynamicRange intersectDynamicRange(java.util.List<androidx.camera.core.DynamicRange> list) {
        if (list.isEmpty()) {
            return null;
        }
        androidx.camera.core.DynamicRange dynamicRange = list.get(0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(dynamicRange.getEncoding());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(dynamicRange.getBitDepth());
        for (int i17 = 1; i17 < list.size(); i17++) {
            androidx.camera.core.DynamicRange dynamicRange2 = list.get(i17);
            valueOf = intersectDynamicRangeEncoding(valueOf, java.lang.Integer.valueOf(dynamicRange2.getEncoding()));
            valueOf2 = intersectDynamicRangeBitDepth(valueOf2, java.lang.Integer.valueOf(dynamicRange2.getBitDepth()));
            if (valueOf == null || valueOf2 == null) {
                return null;
            }
        }
        return new androidx.camera.core.DynamicRange(valueOf.intValue(), valueOf2.intValue());
    }

    private static java.lang.Integer intersectDynamicRangeBitDepth(java.lang.Integer num, java.lang.Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0) || num.equals(num2)) {
            return num;
        }
        return null;
    }

    private static java.lang.Integer intersectDynamicRangeEncoding(java.lang.Integer num, java.lang.Integer num2) {
        if (num.equals(0)) {
            return num2;
        }
        if (num2.equals(0)) {
            return num;
        }
        if (num.equals(2) && !num2.equals(1)) {
            return num2;
        }
        if ((!num2.equals(2) || num.equals(1)) && !num.equals(num2)) {
            return null;
        }
        return num;
    }

    public static androidx.camera.core.DynamicRange resolveDynamicRange(java.util.Set<androidx.camera.core.impl.UseCaseConfig<?>> set) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<androidx.camera.core.impl.UseCaseConfig<?>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getDynamicRange());
        }
        return intersectDynamicRange(arrayList);
    }
}
