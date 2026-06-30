package cv5;

/* loaded from: classes12.dex */
public abstract class e {
    public static int a(java.lang.Object... objArr) {
        int hashCode;
        if (objArr == null || objArr.length == 0) {
            return 0;
        }
        int i17 = 0;
        for (java.lang.Object obj : objArr) {
            if (obj != null) {
                if (obj instanceof java.lang.Number) {
                    hashCode = obj.hashCode();
                } else if (obj instanceof boolean[]) {
                    hashCode = java.util.Arrays.hashCode((boolean[]) obj);
                } else if (obj instanceof byte[]) {
                    hashCode = java.util.Arrays.hashCode((byte[]) obj);
                } else if (obj instanceof char[]) {
                    hashCode = java.util.Arrays.hashCode((char[]) obj);
                } else if (obj instanceof short[]) {
                    hashCode = java.util.Arrays.hashCode((short[]) obj);
                } else if (obj instanceof int[]) {
                    hashCode = java.util.Arrays.hashCode((int[]) obj);
                } else if (obj instanceof long[]) {
                    hashCode = java.util.Arrays.hashCode((long[]) obj);
                } else if (obj instanceof float[]) {
                    hashCode = java.util.Arrays.hashCode((float[]) obj);
                } else if (obj instanceof double[]) {
                    hashCode = java.util.Arrays.hashCode((double[]) obj);
                } else if (obj instanceof java.lang.Object[]) {
                    hashCode = java.util.Arrays.hashCode((java.lang.Object[]) obj);
                } else if (obj.getClass().isArray()) {
                    for (int i18 = 0; i18 < java.lang.reflect.Array.getLength(obj); i18++) {
                        i17 += a(java.lang.reflect.Array.get(obj, i18));
                    }
                } else {
                    hashCode = obj.hashCode();
                }
                i17 += hashCode;
            }
        }
        return i17;
    }
}
