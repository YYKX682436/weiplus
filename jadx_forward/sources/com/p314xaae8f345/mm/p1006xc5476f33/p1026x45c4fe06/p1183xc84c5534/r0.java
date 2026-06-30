package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public final class r0 implements uf.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q0 f169927d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.q0(null);

    /* renamed from: a, reason: collision with root package name */
    public final uf.f f169928a;

    /* renamed from: b, reason: collision with root package name */
    public final long f169929b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f169930c;

    public r0(uf.f castContext) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 m52174xaf156f4a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(castContext, "castContext");
        this.f169928a = castContext;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = ((uf.o1) castContext).f508608g;
        java.lang.String str = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = c11510xdd90c2f2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) c11510xdd90c2f2 : null;
        this.f169929b = (o6Var == null || (u07 = o6Var.u0()) == null) ? 0L : u07.f128817z + 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f22 = ((uf.o1) castContext).f508608g;
        if (c11510xdd90c2f22 != null && (x07 = c11510xdd90c2f22.x0()) != null && (m52174xaf156f4a = x07.m52174xaf156f4a()) != null) {
            str = m52174xaf156f4a.X1();
        }
        this.f169930c = str == null ? "" : str;
    }

    @Override // uf.l
    public void a(uf.a action, int i17, java.lang.String manufactureName, java.lang.String deviceName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manufactureName, "manufactureName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceName, "deviceName");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7122xaa5bd9fc c7122xaa5bd9fc = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7122xaa5bd9fc();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = ((uf.o1) this.f169928a).f508608g;
        c7122xaa5bd9fc.f144410d = c7122xaa5bd9fc.b("AppId", c11510xdd90c2f2 != null ? c11510xdd90c2f2.f156336n : null, true);
        c7122xaa5bd9fc.f144411e = this.f169929b;
        c7122xaa5bd9fc.f144412f = java.lang.System.currentTimeMillis();
        c7122xaa5bd9fc.f144413g = c7122xaa5bd9fc.b("PagePath", this.f169930c, true);
        c7122xaa5bd9fc.f144414h = c7122xaa5bd9fc.b("VideoUrl", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.i1.a(((uf.o1) this.f169928a).f508609h), true);
        c7122xaa5bd9fc.f144415i = action.f508499d;
        c7122xaa5bd9fc.f144416j = i17;
        c7122xaa5bd9fc.f144417k = z17 ? 1L : 0L;
        c7122xaa5bd9fc.f144419m = c7122xaa5bd9fc.b("ModelName", deviceName, true);
        c7122xaa5bd9fc.f144420n = c7122xaa5bd9fc.b("ManuFacturer", manufactureName, true);
        uf.o1 o1Var = (uf.o1) this.f169928a;
        c7122xaa5bd9fc.f144421o = o1Var.f508611m ? 2L : 1L;
        c7122xaa5bd9fc.f144422p = uf.d2.f508549d != o1Var.f508607f ? 1L : 0L;
        c7122xaa5bd9fc.k();
    }
}
