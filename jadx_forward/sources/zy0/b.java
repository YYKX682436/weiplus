package zy0;

/* loaded from: classes5.dex */
public final class b implements gy1.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy0.e f558842a;

    public b(zy0.e eVar, java.lang.String str) {
        this.f558842a = eVar;
    }

    @Override // gy1.b
    public final void a(long j17, java.lang.String str, java.util.Map map) {
        java.lang.Object obj = map.get("udf_kv");
        java.util.Map map2 = obj instanceof java.util.Map ? (java.util.Map) obj : null;
        java.lang.Object obj2 = map2 != null ? map2.get("REPORT_KEY_DYNAMIC_PARAM_AUDIOINFO") : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a ? (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj2 : null;
        java.lang.Object obj3 = map2 != null ? map2.get("REPORT_KEY_DYNAMIC_PARAM_SOURCEPAGE") : null;
        java.lang.String str2 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
        zy0.e eVar = this.f558842a;
        java.lang.String str3 = eVar.f558851g;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_exp");
        zy0.f fVar = eVar.f558848d;
        if (!b17) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "view_clk") || fVar == null) {
                return;
            }
            mz0.n0 n0Var = (mz0.n0) fVar;
            if (c16997xb0aa383a == null) {
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "3") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0)) {
                mz0.b2 b2Var = n0Var.f414538a;
                b2Var.E7(b2Var.o7().a(), c16997xb0aa383a);
                return;
            }
            return;
        }
        if (fVar != null) {
            mz0.n0 n0Var2 = (mz0.n0) fVar;
            if (c16997xb0aa383a == null) {
                return;
            }
            boolean z17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "3") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
            mz0.b2 b2Var2 = n0Var2.f414538a;
            if (z17) {
                b2Var2.F7(b2Var2.o7().a(), c16997xb0aa383a);
                return;
            }
            ty0.c h76 = b2Var2.h7();
            if (h76 != null) {
                java.lang.String songId = c16997xb0aa383a.C;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songId, "songId");
                bz0.j.f118283a.a(((mz0.q2) h76).f414562a.o7().a(), songId);
            }
        }
    }
}
