package rf2;

/* loaded from: classes10.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f476312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.o1 f476313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.dm4 f476314f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f476315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, rf2.o1 o1Var, r45.dm4 dm4Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476312d = hVar;
        this.f476313e = o1Var;
        this.f476314f = dm4Var;
        this.f476315g = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.j1(this.f476312d, interfaceC29045xdcb5ca57, this.f476313e, this.f476314f, this.f476315g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf2.j1 j1Var = (rf2.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        rf2.o1 o1Var = this.f476313e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o1Var.f476371c, "reserveLottery success, modify data");
        r45.dm4 dm4Var = this.f476314f;
        if (dm4Var != null) {
            dm4Var.f454107i = 1;
        }
        db5.t7.f(o1Var.f476369a.getContext(), o1Var.f476369a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dri), rf2.l1.f476336a);
        this.f476315g.f391645d = true;
        return jz5.f0.f384359a;
    }
}
