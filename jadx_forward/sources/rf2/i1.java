package rf2;

/* loaded from: classes.dex */
public final class i1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f476304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476305e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, rf2.o1 o1Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476304d = hVar;
        this.f476305e = o1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.i1(this.f476304d, interfaceC29045xdcb5ca57, this.f476305e);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf2.i1 i1Var = (rf2.i1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f476304d).f535914b;
        rf2.o1 o1Var = this.f476305e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(o1Var.f476371c, "reserveLottery failed. " + aVar2);
        db5.t7.g(o1Var.f476369a.getContext(), o1Var.f476369a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.drh));
        return jz5.f0.f384359a;
    }
}
