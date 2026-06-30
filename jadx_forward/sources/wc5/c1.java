package wc5;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.k1 f526077d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xm3.t0 f526078e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f526079f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(wc5.k1 k1Var, xm3.t0 t0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f526077d = k1Var;
        this.f526078e = t0Var;
        this.f526079f = f4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wc5.c1(this.f526077d, this.f526078e, this.f526079f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wc5.c1 c1Var = (wc5.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        uc5.b bVar = new uc5.b(true);
        xm3.t0 t0Var = this.f526078e;
        wc5.k1 k1Var = this.f526077d;
        wc5.k1.T6(k1Var, t0Var, bVar);
        k1Var.f526125e = k1Var.U6().size();
        k1Var.X6();
        this.f526079f.dismiss();
        return jz5.f0.f384359a;
    }
}
