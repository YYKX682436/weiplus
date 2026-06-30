package az0;

/* loaded from: classes5.dex */
public final class r4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f97390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f97391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(boolean z17, boolean z18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f97390d = z17;
        this.f97391e = z18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.r4(this.f97390d, this.f97391e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.r4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int ordinal = az0.i5.f97093d.ordinal();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "release - already uninitialized");
            az0.i5 i5Var = az0.i5.f97090a;
            return f0Var;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                az0.i5.b(az0.i5.f97090a, this.f97390d, this.f97391e);
            } else if (ordinal == 3) {
                az0.i5.d(az0.i5.f97090a);
                if (az0.i5.f97093d != az0.x2.f97570d) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasManager", "Unexpected state: " + az0.i5.f97093d + " after TEARDOWNING");
                }
            }
            return f0Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", "release - wait for INITIALIZED");
        az0.i5 i5Var2 = az0.i5.f97090a;
        az0.i5.d(i5Var2);
        if (az0.i5.f97093d != az0.x2.f97572f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasManager", "Unexpected state: " + az0.i5.f97093d + " after INITIALIZING");
            az0.i5.b(i5Var2, this.f97390d, this.f97391e);
        }
        return f0Var;
    }
}
