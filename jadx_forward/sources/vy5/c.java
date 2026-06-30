package vy5;

/* loaded from: classes11.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f523050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 f523051e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f523051e = c28214x10e3f0b9;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vy5.c(this.f523051e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vy5.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f523050d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f523050d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(500L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i18 = dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9.f310948h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendCurrentStatusWithDelay, networkType:");
        dev.p3272xc19e574d.p3273x348d9a.p3275xd0d13ae7.p3276x72a369b7.C28214x10e3f0b9 c28214x10e3f0b9 = this.f523051e;
        sb6.append(c28214x10e3f0b9.f310949d.b());
        io.p3284xd2ae381c.Log.i("MicroMsg.PatchedConnectivityBroadcastReceiver", sb6.toString());
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28681x6bf9b529.EventSink eventSink = c28214x10e3f0b9.f310951f;
        if (eventSink != null) {
            eventSink.mo138418x90b54003(c28214x10e3f0b9.f310949d.b());
        }
        return jz5.f0.f384359a;
    }
}
