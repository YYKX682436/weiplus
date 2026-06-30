package hs;

/* loaded from: classes3.dex */
public final class f0 extends qz5.l implements yz5.p {
    public f0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hs.f0(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hs.f0 f0Var = new hs.f0((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        f0Var.mo150x989b7ca4(f0Var2);
        return f0Var2;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        if (gm0.j1.b().t()) {
            long c17 = c01.id.c();
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_AUTH_EX_DEVICE_TIMESTAMP_LONG, new java.lang.Long(c17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusNotifyFeatureService", "setExDeviceLoginTime " + c17);
        }
        return jz5.f0.f384359a;
    }
}
