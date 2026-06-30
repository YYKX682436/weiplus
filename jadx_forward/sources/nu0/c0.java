package nu0;

/* loaded from: classes5.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nu0.q0 f421426d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(nu0.q0 q0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421426d = q0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.c0(this.f421426d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p469xb845a2f1.C4063x855a1ef8 c4063x855a1ef8 = this.f421426d.f421608r;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (c4063x855a1ef8 == null) {
            return f0Var;
        }
        try {
            c4063x855a1ef8.q(null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageControlUIC", "release - unbindRenderView failed:" + e17.getMessage(), e17);
        }
        try {
            c4063x855a1ef8.j();
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageControlUIC", "release - failed:" + e18.getMessage(), e18);
        }
        this.f421426d.f421608r = null;
        return f0Var;
    }
}
