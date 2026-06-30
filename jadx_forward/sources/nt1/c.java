package nt1;

/* loaded from: classes12.dex */
public interface c {
    static boolean a(java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, int i17) {
        return c(list, f9Var, str, i17, 0, null);
    }

    static boolean c(java.util.List list, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, int i17, int i18, java.lang.String str2) {
        com.p314xaae8f345.mm.vfs.x1 m17 = com.p314xaae8f345.mm.vfs.w6.m(str);
        if (m17 == null) {
            return false;
        }
        ot1.h hVar = new ot1.h();
        hVar.f68223x297eb4f7 = f9Var.m124847x74d37ac6();
        hVar.f68225xc4aab016 = f9Var.mo78013xfb85f7b0();
        hVar.f68230xdec927b = f9Var.Q0();
        hVar.f68226xc4b8ff89 = f9Var.mo78012x3fdd41df();
        hVar.f68220x2918cf02 = f9Var.A0() == 1 ? 1L : 0L;
        hVar.f68224x169c833e = i17;
        com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z7 d17 = b3Var.d(a17);
        if (d17 != null) {
            java.lang.String str4 = d17.f294812f;
            if (str4 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
                if (!str4.equals(l18)) {
                    d17 = new com.p314xaae8f345.mm.vfs.z7(d17.f294810d, d17.f294811e, l18, d17.f294813g, d17.f294814h);
                }
            }
            hVar.f68227x2260084a = d17.m82499x9616526c();
        } else {
            hVar.f68227x2260084a = str;
        }
        hVar.f68228x22618426 = m17.f294766c;
        hVar.f68219x9f7e1864 = m17.f294767d;
        hVar.f68229x10aee742 = i18;
        hVar.f68218xf63d4736 = str2;
        java.lang.String str5 = hVar.f68227x2260084a;
        if (str5 == null || str5.startsWith("wcf://c2c_origin_image/") || hVar.f68227x2260084a.startsWith("wcf://c2c_origin_video/")) {
            return false;
        }
        if (m17 instanceof com.p314xaae8f345.mm.vfs.k5) {
            try {
                hVar.y0(((com.p314xaae8f345.mm.vfs.k5) m17).f294562h);
            } catch (java.lang.Exception e17) {
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.CalcWxNewService", e17, "Failed to set UUID", new java.lang.Object[0]);
            }
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (com.p314xaae8f345.mm.vfs.e8.f(((ot1.h) it.next()).f68227x2260084a, hVar.f68227x2260084a)) {
                return false;
            }
        }
        list.add(hVar);
        return true;
    }

    java.util.List b(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);
}
