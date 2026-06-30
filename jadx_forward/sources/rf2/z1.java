package rf2;

/* loaded from: classes10.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f476508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rf2.c2 f476509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rf2.d2 f476510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f476511g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, rf2.c2 c2Var, rf2.d2 d2Var, java.lang.String str) {
        super(2, interfaceC29045xdcb5ca57);
        this.f476508d = hVar;
        this.f476509e = c2Var;
        this.f476510f = d2Var;
        this.f476511g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rf2.z1(this.f476508d, interfaceC29045xdcb5ca57, this.f476509e, this.f476510f, this.f476511g);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        rf2.z1 z1Var = (rf2.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        z1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xg2.a aVar2 = (xg2.a) ((xg2.b) this.f476508d).f535914b;
        rf2.c2 c2Var = this.f476509e;
        java.lang.String str = c2Var.f476214c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("vote ");
        rf2.d2 d2Var = this.f476510f;
        sb6.append(d2Var.f476232h);
        sb6.append(", ");
        sb6.append(d2Var.f476228d.m75939xb282bd08(0));
        sb6.append(", voteId:");
        sb6.append(this.f476511g);
        sb6.append(", failed. ");
        sb6.append(aVar2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        db5.t7.g(c2Var.f476212a.getContext(), c2Var.f476212a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573183ds5));
        return jz5.f0.f384359a;
    }
}
