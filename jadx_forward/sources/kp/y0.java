package kp;

/* loaded from: classes13.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f392399d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f392400e;

    /* renamed from: f, reason: collision with root package name */
    public int f392401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pManager.Channel f392403h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kp.i1 i1Var, android.net.wifi.p2p.WifiP2pManager.Channel channel, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392402g = i1Var;
        this.f392403h = channel;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.y0(this.f392402g, this.f392403h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392401f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            kp.i1 i1Var = this.f392402g;
            this.f392399d = i1Var;
            android.net.wifi.p2p.WifiP2pManager.Channel channel = this.f392403h;
            this.f392400e = channel;
            this.f392401f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            i1Var.f392297e.removeGroup(channel, new kp.x0(i1Var, rVar));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
