package zp4;

/* loaded from: classes4.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.q0 f556486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dm.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f556486d = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zp4.d(this.f556486d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zp4.d dVar = (zp4.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        l75.k0 a17 = zp4.e.f556487a.a();
        dm.q0 q0Var = this.f556486d;
        p75.n0 n0Var = dm.q0.R;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg，BackgroundVideoInfoStorageManager", "insertVideoInfo result >> workTagId: " + this.f556486d.f68034xcf7ab2c4 + ", result: " + new m75.c(q0Var, true, null, null, "MicroMsg.SDK.BaseBackgroundVideoInfo").a(a17));
        return jz5.f0.f384359a;
    }
}
