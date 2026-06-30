package com.tencent.mm.platformtools;

/* loaded from: classes9.dex */
public class SpellMap {
    static {
        new java.util.HashMap();
    }

    public static java.lang.String a(char c17) {
        int i17;
        if (c17 <= 128) {
            i17 = c17;
        } else {
            try {
                byte[] bytes = java.lang.String.valueOf(c17).getBytes("GBK");
                if (bytes != 0 && bytes.length <= 2 && bytes.length > 0) {
                    if (bytes.length == 1) {
                        i17 = bytes[0];
                    } else if (bytes.length == 2) {
                        i17 = ((bytes[0] + 256) << 16) + bytes[1] + 256;
                    }
                }
            } catch (java.io.UnsupportedEncodingException unused) {
            }
            i17 = 0;
        }
        if (i17 < 65536) {
            return "" + c17;
        }
        int i18 = i17 >> 16;
        int i19 = i17 & 255;
        java.lang.String spellGetJni = (i18 < 129 || i18 > 253 || i19 < 63 || i19 > 254) ? null : spellGetJni(i18 - 129, i19 - 63);
        if (spellGetJni == null) {
            return null;
        }
        java.lang.String[] split = spellGetJni.split(",");
        return (split == null || split.length < 2) ? spellGetJni : split[0];
    }

    public static native java.lang.String spellGetJni(int i17, int i18);
}
