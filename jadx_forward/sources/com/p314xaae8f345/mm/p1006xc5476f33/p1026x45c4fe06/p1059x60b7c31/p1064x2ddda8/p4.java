package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km5.b f161217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 f161218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f161219g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161220h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.n24 f161221i;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, km5.b bVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var, int i17, java.lang.String str, r45.n24 n24Var) {
        this.f161216d = yVar;
        this.f161217e = bVar;
        this.f161218f = u4Var;
        this.f161219g = i17;
        this.f161220h = str;
        this.f161221i = n24Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xi1.g r0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f161216d;
        if (!yVar.mo50262x39e05d35()) {
            this.f161217e.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.s.f161257d);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o4 o4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.o4(this.f161219g, this.f161217e, this.f161216d, this.f161218f, this.f161220h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.u4 u4Var = this.f161218f;
        android.content.Context b17 = u4Var.b(yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = yVar.t3();
        if (t37 == null || (r0Var = t37.mo48803xee5260a9()) == null) {
            r0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0();
        }
        fl1.o oVar = new fl1.o(b17, r0Var, o4Var);
        r45.n24 n24Var = this.f161221i;
        oVar.mo2026xce3d2713(n24Var.f462551g);
        oVar.mo2039xb4c13ffe(n24Var.f462550f.f459665e);
        oVar.mo2027xea2586cc(n24Var.f462557p);
        oVar.mo2036xc499c596(n24Var.f462555n);
        oVar.mo2038xd611ee5a(n24Var.f462556o);
        oVar.mo2033x12ec1b74(n24Var.f462552h);
        oVar.mo2030x8f8b3d79("");
        xi1.g mo50261xee5260a9 = yVar.mo50261xee5260a9();
        boolean z17 = false;
        if (mo50261xee5260a9 != null && mo50261xee5260a9.mo51618xbcb3824d()) {
            z17 = true;
        }
        if (z17) {
            oVar.s(1);
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("scope.userInfo", n24Var.f462550f.f459664d)) {
            bf.i iVar = (bf.i) i95.n0.c(bf.i.class);
            if (iVar == null) {
                iVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n4(n24Var);
            }
            u4Var.e(u4Var.b(yVar), null, iVar.fi(), "scope.userInfo", oVar);
            iVar.Oa(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.l4(u4Var, yVar, iVar, oVar));
        } else {
            java.lang.String Scope = n24Var.f462550f.f459664d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Scope, "Scope");
            oVar.f345368z = Scope;
        }
        fl1.g2 mo50353x784fb1e3 = yVar.mo50353x784fb1e3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50353x784fb1e3);
        mo50353x784fb1e3.c(oVar);
    }
}
