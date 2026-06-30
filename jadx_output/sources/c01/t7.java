package c01;

/* loaded from: classes9.dex */
public abstract class t7 {
    public static c01.s7 a(java.lang.String str) {
        return new c01.s7("@black.android", null, str, null, true, true);
    }

    public static c01.s7 b(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.storage.ja m07;
        java.lang.String str3;
        c01.s7 s7Var = null;
        if (str != null && str.length() > 0 && (m07 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0(str)) != null) {
            if (m07.f195061e == 1) {
                java.lang.String str4 = m07.f195058b;
                java.lang.String str5 = m07.f195059c.f195036a;
                if (str5 == null) {
                    str5 = "";
                }
                java.lang.String str6 = "" + str5.replace("@", "");
                if (str2 != null) {
                    str3 = str6 + str2;
                } else {
                    str3 = str6;
                }
                java.lang.String str7 = m07.f195059c.f195036a;
                s7Var = new c01.s7("@domain.android", str4, str3, str7 != null ? str7 : "", m07.c(), true);
            }
        }
        return s7Var;
    }

    public static c01.s7 c(java.lang.String str) {
        com.tencent.mm.storage.ja m07 = ((com.tencent.mm.storage.ka) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).hj()).m0("@t.qq.com");
        if (m07 == null) {
            return null;
        }
        return new c01.s7("@t.qq.com", null, str, null, m07.c(), (m07.f195060d & 2) != 0);
    }
}
