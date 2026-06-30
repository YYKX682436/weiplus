package vy5;

/* loaded from: classes11.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f523052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 f523053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.util.List list, dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f523052d = list;
        this.f523053e = c28214x10e3f0b9;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vy5.d(this.f523052d, this.f523053e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        vy5.d dVar = (vy5.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9.f310948h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendEvent, networkType:");
        java.util.List list = this.f523052d;
        sb6.append(list);
        io.p3284xd2ae381c.Log.i("MicroMsg.PatchedConnectivityBroadcastReceiver", sb6.toString());
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = this.f523053e.f310951f;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(list);
        }
        return jz5.f0.f384359a;
    }
}
