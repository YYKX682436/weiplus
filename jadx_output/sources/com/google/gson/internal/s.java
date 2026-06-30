package com.google.gson.internal;

/* loaded from: classes5.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final int f44823a;

    static {
        int i17;
        java.lang.String property = java.lang.System.getProperty("java.version");
        try {
            java.lang.String[] split = property.split("[._]");
            i17 = java.lang.Integer.parseInt(split[0]);
            if (i17 == 1 && split.length > 1) {
                i17 = java.lang.Integer.parseInt(split[1]);
            }
        } catch (java.lang.NumberFormatException unused) {
            i17 = -1;
        }
        if (i17 == -1) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                for (int i18 = 0; i18 < property.length(); i18++) {
                    char charAt = property.charAt(i18);
                    if (!java.lang.Character.isDigit(charAt)) {
                        break;
                    }
                    sb6.append(charAt);
                }
                i17 = java.lang.Integer.parseInt(sb6.toString());
            } catch (java.lang.NumberFormatException unused2) {
                i17 = -1;
            }
        }
        if (i17 == -1) {
            i17 = 6;
        }
        f44823a = i17;
    }
}
