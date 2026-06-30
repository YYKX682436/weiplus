package kp;

/* loaded from: classes13.dex */
public final class z0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f392410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp.i1 f392411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.net.wifi.p2p.WifiP2pGroup f392412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(kp.i1 i1Var, android.net.wifi.p2p.WifiP2pGroup wifiP2pGroup, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f392411e = i1Var;
        this.f392412f = wifiP2pGroup;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new kp.z0(this.f392411e, this.f392412f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((kp.z0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f392410d;
        kp.i1 i1Var = this.f392411e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str = this.f392412f.getInterface();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getInterface(...)");
            this.f392410d = 1;
            if (i1Var.qj(str, 2000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yz5.l lVar = i1Var.f392303n;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.TRUE);
        }
        return jz5.f0.f384359a;
    }
}
