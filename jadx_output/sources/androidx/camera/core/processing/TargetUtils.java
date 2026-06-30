package androidx.camera.core.processing;

/* loaded from: classes13.dex */
public class TargetUtils {
    private TargetUtils() {
    }

    public static void checkSupportedTargets(java.util.Collection<java.lang.Integer> collection, int i17) {
        m3.h.b(collection.contains(java.lang.Integer.valueOf(i17)), java.lang.String.format(java.util.Locale.US, "Effects target %s is not in the supported list %s.", getHumanReadableName(i17), getHumanReadableNames(collection)));
    }

    public static java.lang.String getHumanReadableName(int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((i17 & 4) != 0) {
            arrayList.add("IMAGE_CAPTURE");
        }
        if ((i17 & 1) != 0) {
            arrayList.add("PREVIEW");
        }
        if ((i17 & 2) != 0) {
            arrayList.add("VIDEO_CAPTURE");
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb6.append((java.lang.CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb6.append((java.lang.CharSequence) "|");
            }
        }
        return sb6.toString();
    }

    private static java.lang.String getHumanReadableNames(java.util.Collection<java.lang.Integer> collection) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.Integer> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(getHumanReadableName(it.next().intValue()));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        java.util.Iterator it6 = arrayList.iterator();
        if (it6.hasNext()) {
            while (true) {
                sb7.append((java.lang.CharSequence) it6.next());
                if (!it6.hasNext()) {
                    break;
                }
                sb7.append((java.lang.CharSequence) ", ");
            }
        }
        sb6.append(sb7.toString());
        sb6.append("]");
        return sb6.toString();
    }

    public static int getNumberOfTargets(int i17) {
        int i18 = 0;
        while (i17 != 0) {
            i18 += i17 & 1;
            i17 >>= 1;
        }
        return i18;
    }

    public static boolean isSuperset(int i17, int i18) {
        return (i17 & i18) == i18;
    }
}
