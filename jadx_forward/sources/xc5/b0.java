package xc5;

/* loaded from: classes12.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f534927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f534929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(xc5.h0 h0Var, mf3.k kVar, float f17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534927d = h0Var;
        this.f534928e = kVar;
        this.f534929f = f17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.b0(this.f534927d, this.f534928e, this.f534929f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        lg3.a aVar;
        pz5.a aVar2 = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xc5.h0 h0Var = this.f534927d;
        boolean z17 = h0Var.f535000y;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17 && (aVar = h0Var.f534998w) != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).h(this.f534928e, new vf3.f(vf3.e.f517913g, null, 0, this.f534929f, 6, null));
        }
        return f0Var;
    }
}
