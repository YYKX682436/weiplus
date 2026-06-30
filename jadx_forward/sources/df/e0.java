package df;

/* loaded from: classes15.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df.p0 f310979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f310980f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f310981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(df.p0 p0Var, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310979e = p0Var;
        this.f310980f = enumC28568xbdfb1079;
        this.f310981g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df.e0(this.f310979e, this.f310980f, this.f310981g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f310978d;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f310980f;
        df.p0 p0Var = this.f310979e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df.z zVar = p0Var.f311065a;
            this.f310978d = 1;
            if (zVar.f(enumC28568xbdfb1079, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchFlutterRenderSurface-" + p0Var.f311065a.m124148xee406eaa() + " to mode:" + enumC28568xbdfb1079 + " tick:" + this.f310981g + " do swap surface path -- wait for render surface available end", new java.lang.Object[0]);
        return jz5.f0.f384359a;
    }
}
