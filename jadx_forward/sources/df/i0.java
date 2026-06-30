package df;

/* loaded from: classes15.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df.p0 f311023d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f311024e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f311025f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(df.p0 p0Var, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, long j17) {
        super(1);
        this.f311023d = p0Var;
        this.f311024e = enumC28568xbdfb1079;
        this.f311025f = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
        df.p0 p0Var = this.f311023d;
        sb6.append(p0Var.f311065a.m124148xee406eaa());
        sb6.append(" mode:");
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f311024e;
        sb6.append(enumC28568xbdfb1079);
        sb6.append(", call finish ,tick:");
        sb6.append(this.f311025f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", sb6.toString(), new java.lang.Object[0]);
        if (th6 == null) {
            p0Var.o(enumC28568xbdfb1079);
        }
        return jz5.f0.f384359a;
    }
}
