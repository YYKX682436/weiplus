package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class e4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f159521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 f159522b;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.j3 j3Var, java.lang.String str) {
        this.f159522b = j3Var;
        this.f159521a = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.f170693a;
        if (!com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.y0()) {
            this.f159522b.h("doAheadPreloadPageView INTERRUPTED by kernel(%s)", com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.m120125x97d401de().name());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.b(this.f159521a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35258xdd302f1b);
        } else if (this.f159522b.f159985d) {
            this.f159522b.g("doAheadPreloadPageView INTERRUPTED by runtime destroyed", new java.lang.Object[0]);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 S2 = this.f159522b.f159983b.S2(false);
            if (S2 != null) {
                if (this.f159522b.f159983b.u0().d()) {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.a8.f156548a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSkylineBootGuard", "<clinit>");
                    gf.l0 l0Var = gf.l0.f352648a;
                    n7Var = (l0Var.a(S2) && l0Var.b()) ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7.I3(this.f159522b.f159983b.M2("preload_skyline")) : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7();
                } else {
                    n7Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7();
                }
                n7Var.L0(S2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0 o0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.o0.PreloadBeforeRuntimeInit;
                n7Var.A3(o0Var);
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.b(this.f159521a, true).E = o0Var;
                } catch (java.lang.Exception unused) {
                    this.f159522b.g("doAheadPreloadPageView DONE but get NULL session", new java.lang.Object[0]);
                }
                this.f159522b.h("doAheadPreloadPageView DONE", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.w.e(this.f159521a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1193x3606cc.C12595xe6b43f9f.f35258xdd302f1b);
                return n7Var;
            }
            this.f159522b.g("doAheadPreloadPageView get NULL LibReader from Runtime", new java.lang.Object[0]);
        }
        return null;
    }
}
