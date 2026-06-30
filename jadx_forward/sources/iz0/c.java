package iz0;

/* loaded from: classes4.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.ib f377576d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(dm.ib ibVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377576d = ibVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iz0.c(this.f377576d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        iz0.c cVar = (iz0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        cVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        l75.k0 a17 = iz0.d.f377577a.a();
        dm.ib ibVar = this.f377576d;
        p75.n0 n0Var = dm.ib.f319203y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TemplateBackgroundVideoInfoStorageManager", "insertVideoInfo result >> workTagId: " + this.f377576d.f67036xcf7ab2c4 + ", result: " + new m75.c(ibVar, true, null, null, "MicroMsg.SDK.BaseTemplateBackgroundVideoInfo").a(a17));
        return jz5.f0.f384359a;
    }
}
