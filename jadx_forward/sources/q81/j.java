package q81;

/* loaded from: classes4.dex */
public final class j extends q81.a {
    @Override // q81.a
    public java.lang.Object b(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        long e17;
        r45.cf7 cf7Var;
        r45.if7 if7Var = (r45.if7) obj;
        t81.s sVar = (t81.s) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.s.class);
        boolean z17 = false;
        int i17 = (if7Var == null || (cf7Var = if7Var.f458542d) == null) ? 0 : cf7Var.f453064f;
        sVar.getClass();
        if (!(str2 == null || str2.length() == 0)) {
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
            t81.g gVar = new t81.g();
            gVar.f66271x28d45f97 = str2;
            gVar.f66273x9de75411 = j17;
            gVar.f66272x44eeb14 = i17;
            z17 = sVar.f497908b.mo11260x413cb2b4(gVar);
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CmdInvalidCode", "call appId:" + str2 + ", ret:" + valueOf.booleanValue());
        return valueOf;
    }

    @Override // q81.a
    public r45.cf7 d(java.lang.Object obj) {
        r45.if7 if7Var = (r45.if7) obj;
        if (if7Var != null) {
            return if7Var.f458542d;
        }
        return null;
    }

    @Override // q81.a
    public java.lang.String e() {
        return "CmdInvalidCode";
    }
}
