package c01;

/* loaded from: classes9.dex */
public abstract class t1 {
    public static boolean a(java.lang.String str) {
        java.util.ArrayList P1;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || (P1 = com.tencent.mm.sdk.platformtools.t8.P1(str.split(","))) == null) {
            return false;
        }
        java.util.Iterator it = P1.iterator();
        while (it.hasNext()) {
            if (!com.tencent.mm.storage.z3.O4((java.lang.String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static java.lang.String b(com.tencent.mm.storage.z3 z3Var) {
        java.lang.String a17;
        boolean z17 = false;
        if (z3Var != null && com.tencent.mm.storage.z3.m4(z3Var.d1()) && !com.tencent.mm.sdk.platformtools.t8.K0(z3Var.Q0()) && "3552365301".equals(z3Var.Q0())) {
            z17 = true;
        }
        if (z17 && (a17 = t41.g.a(z3Var)) != null) {
            return z3Var.g2() + a17;
        }
        return z3Var.g2();
    }

    public static void c(java.lang.String str, java.util.List list, java.lang.String str2, boolean z17, java.lang.String str3) {
        d(str, list, str2, z17, str3, 2);
    }

    public static void d(java.lang.String str, java.util.List list, java.lang.String str2, boolean z17, java.lang.String str3, int i17) {
        com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
        f9Var.u1(str);
        f9Var.setType(10000);
        f9Var.e1(java.lang.System.currentTimeMillis());
        f9Var.r1(4);
        f9Var.j1(i17);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        if (list != null) {
            java.lang.String r17 = c01.z1.r();
            java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.b08);
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str4 = (java.lang.String) it.next();
                if (!str4.equals(r17)) {
                    com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str4, true);
                    if (n17 == null || ((int) n17.E2) == 0) {
                        if (z17) {
                            stringBuffer.append("<a href=\"" + str3 + str4 + "\">" + str4 + "</a>" + string);
                        } else {
                            stringBuffer.append(str4 + string);
                        }
                    } else if (z17) {
                        stringBuffer.append("<a href=\"" + str3 + str4 + "\">" + b(n17) + "</a>" + string);
                    } else {
                        stringBuffer.append(b(n17) + string);
                    }
                }
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.lastIndexOf(string));
            }
        }
        f9Var.d1(str2.replace("%s", stringBuffer));
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List e(java.util.List r18) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.t1.e(java.util.List):java.util.List");
    }
}
