package q81;

/* loaded from: classes4.dex */
public final class k extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        long e17;
        r45.cf7 cf7Var;
        r45.jf7 jf7Var = (r45.jf7) obj;
        t81.s sVar = (t81.s) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class);
        boolean z17 = false;
        int i17 = (jf7Var == null || (cf7Var = jf7Var.f459322d) == null) ? 0 : cf7Var.f453064f;
        sVar.getClass();
        if (!(str == null || str.length() == 0)) {
            long j17 = -1;
            if (t81.s.f497905e != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    try {
                        e17 = c01.id.e();
                    } catch (java.lang.Exception unused) {
                    }
                } else {
                    e17 = c01.id.b() / 1000;
                }
                j17 = e17;
            }
            if (j17 <= 0) {
                j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
            }
            t81.h hVar = new t81.h();
            hVar.f66424xdec927b = str;
            hVar.f66423x9de75411 = j17;
            hVar.f66422x44eeb14 = i17;
            z17 = sVar.f497909c.mo11260x413cb2b4(hVar);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CmdInvalidContact", "call username:" + str + ", ret:" + valueOf.booleanValue());
        return valueOf;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.jf7 jf7Var = (r45.jf7) obj;
        if (jf7Var != null) {
            return jf7Var.f459322d;
        }
        return null;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdInvalidContact";
    }
}
