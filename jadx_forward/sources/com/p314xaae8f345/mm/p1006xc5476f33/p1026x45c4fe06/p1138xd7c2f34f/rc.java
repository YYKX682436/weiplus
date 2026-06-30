package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f166658a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea f166659b;

    public rc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 runtime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        this.f166658a = runtime;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea c11563x992ab6ea = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea(0, false, false, null, null, 0, "", l81.y0.f398615d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12567x34ba321 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(this.f166658a);
        if (a17 != null) {
            c11563x992ab6ea.f156507d = (int) a17.a();
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.b(this.f166658a.f156338p.f158814g)) {
            c11563x992ab6ea.f156512i = this.f166658a.u0().L;
            java.lang.String str = this.f166658a.u0().N.f158978e;
            if (str == null) {
                str = "";
            }
            c11563x992ab6ea.f156513m = str;
        }
        return c11563x992ab6ea;
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar, long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11563x992ab6ea c11563x992ab6ea;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07 = this.f166658a.u0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12354xf2fbb9c8 c12354xf2fbb9c8 = u07 != null ? u07.f158846z2 : null;
        if (c12354xf2fbb9c8 == null || (c11563x992ab6ea = this.f166659b) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WeAppExportLaunchInfoHelper", "publishWarmLaunchInfoIfNeed appId:" + this.f166658a.f156336n + ", type:" + wdVar + ", stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        l81.a1 a1Var = l81.a1.f398539d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f c11564xab6b880f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.api.C11564xab6b880f(0L, 0L, a1Var, 0L);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        c11564xab6b880f.f156516e = java.lang.System.currentTimeMillis();
        if (wdVar != null) {
            int ordinal = wdVar.ordinal();
            if (ordinal == 1) {
                a1Var = l81.a1.f398541f;
            } else if (ordinal == 6) {
                a1Var = l81.a1.f398540e;
            }
            c11564xab6b880f.f156517f = a1Var;
            c11564xab6b880f.f156518g = j17;
        }
        c11563x992ab6ea.f156511h = c11564xab6b880f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 N2 = this.f166658a.N2();
        c11563x992ab6ea.f156514n = N2 != null ? N2 instanceof pa1.o ? l81.y0.f398618g : N2.p2() ? l81.y0.f398617f : l81.y0.f398616e : l81.y0.f398615d;
        com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.h hVar = c12354xf2fbb9c8.f166012g;
        if (hVar != null) {
            hVar.a(c11563x992ab6ea);
        }
        this.f166659b = null;
    }
}
