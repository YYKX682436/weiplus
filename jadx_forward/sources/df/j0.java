package df;

/* loaded from: classes15.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.p0 f311028d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f311029e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f311030f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f311031g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(df.p0 p0Var, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, p3325xe03a0797.p3326xc267989b.r2 r2Var, long j17) {
        super(1);
        this.f311028d = p0Var;
        this.f311029e = enumC28568xbdfb1079;
        this.f311030f = r2Var;
        this.f311031g = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
        df.p0 p0Var = this.f311028d;
        sb6.append(p0Var.f311065a.m124148xee406eaa());
        sb6.append(" mode:");
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f311029e;
        sb6.append(enumC28568xbdfb1079);
        sb6.append(", job(");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311030f;
        sb6.append(r2Var);
        sb6.append(") completed, tick:");
        long j17 = this.f311031g;
        sb6.append(j17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", sb6.toString(), new java.lang.Object[0]);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2Var, p0Var.f311070f)) {
            p0Var.f311070f = null;
        }
        if (th6 == null) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var2 = p0Var.f311071g;
            if (r2Var2 != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = p0Var.f311069e;
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.r2 c17 = p3325xe03a0797.p3326xc267989b.l.c(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED, new df.h0(p0Var, null));
            p0Var.f311071g = c17;
            c17.p(new df.i0(p0Var, enumC28568xbdfb1079, j17));
        }
        return jz5.f0.f384359a;
    }
}
