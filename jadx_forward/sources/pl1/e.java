package pl1;

/* loaded from: classes7.dex */
public abstract class e {
    public static java.lang.Enum a(java.lang.String str, java.lang.Class cls) {
        int i17;
        if (cls.isEnum()) {
            i17 = 0;
            for (java.lang.Object obj : cls.getEnumConstants()) {
                i17 = java.lang.Math.max(((java.lang.Enum) obj).name().length(), i17);
            }
        } else {
            i17 = 0;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && str.length() <= i17) {
            java.lang.String upperCase = str.toUpperCase();
            for (java.lang.Enum r37 : (java.lang.Enum[]) cls.getEnumConstants()) {
                if (upperCase.equals(r37.name())) {
                    return r37;
                }
            }
        }
        return null;
    }

    public static java.lang.Integer b(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof java.lang.Integer) {
            return (java.lang.Integer) obj;
        }
        if (obj instanceof java.lang.Number) {
            return java.lang.Integer.valueOf(((java.lang.Number) obj).intValue());
        }
        if (obj instanceof java.lang.String) {
            try {
                return java.lang.Integer.valueOf((int) java.lang.Double.parseDouble((java.lang.String) obj));
            } catch (java.lang.NumberFormatException unused) {
            }
        }
        return null;
    }
}
