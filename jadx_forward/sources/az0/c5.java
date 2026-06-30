package az0;

/* loaded from: classes5.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f96916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f96917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(java.lang.String str, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f96916d = str;
        this.f96917e = pVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new az0.c5(this.f96916d, this.f96917e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((az0.c5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MaasManager", this.f96916d + " - state: " + az0.i5.f97093d);
        int ordinal = az0.i5.f97093d.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                az0.i5.d(az0.i5.f97090a);
                if (az0.i5.f97093d == az0.x2.f97572f) {
                    return p3325xe03a0797.p3326xc267989b.l.f(null, new az0.a5(this.f96917e, null), 1, null);
                }
                return null;
            }
            if (ordinal == 2) {
                return p3325xe03a0797.p3326xc267989b.l.f(null, new az0.b5(this.f96917e, null), 1, null);
            }
            if (ordinal != 3) {
                throw new jz5.j();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MaasManager", this.f96916d + " - invalid state: " + az0.i5.f97093d);
        return null;
    }
}
