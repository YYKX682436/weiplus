package qi2;

/* loaded from: classes3.dex */
public final class s0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f445154d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi2.w0 f445155e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, qi2.w0 w0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f445154d = hVar;
        this.f445155e = w0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qi2.s0(this.f445154d, interfaceC29045xdcb5ca57, this.f445155e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        qi2.s0 s0Var = (qi2.s0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        s0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePkGiftSelectPanelWidget", "requestGiftPanelList fail: " + ((xg2.a) ((xg2.b) this.f445154d).f535914b));
        qi2.w0.y(this.f445155e);
        return jz5.f0.f384359a;
    }
}
