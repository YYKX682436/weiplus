package yn1;

/* loaded from: classes9.dex */
public final class a2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.r2 f545134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f545135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(yn1.r2 r2Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f545134d = r2Var;
        this.f545135e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yn1.a2(this.f545134d, this.f545135e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yn1.a2 a2Var = (yn1.a2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        a2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int b17 = ih.a.b("clicfg_win_version_num", 1661404671);
        int b18 = ih.a.b("clicfg_mac_version_num", 319095048);
        int b19 = ih.a.b("clicfg_linux_version_num", Integer.MAX_VALUE);
        int b27 = ih.a.b("clicfg_xwechat_ohos_version_num_solid", -223080448);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Mig.MigrationPlatformImpl", "[getPcMinVersionAsync] win=" + b17 + ", mac=" + b18 + ", linux=" + b19 + ", ohosPc=" + b27);
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3155xcd3633ce.g gVar = this.f545134d.f545343a;
        if (gVar != null) {
            gVar.j1(this.f545135e, b17, b18, b19, b27);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
        throw null;
    }
}
