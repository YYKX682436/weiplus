package dv2;

/* loaded from: classes10.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 f325348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dv2.e1 f325349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 f325350f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var, dv2.e1 e1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.m8 m8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325348d = g9Var;
        this.f325349e = e1Var;
        this.f325350f = m8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dv2.b1(this.f325348d, this.f325349e, this.f325350f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        dv2.b1 b1Var = (dv2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        dv2.e1 e1Var = this.f325349e;
        int i17 = e1Var.f325372p;
        r45.yx5 yx5Var = new r45.yx5();
        r45.dy5 dy5Var = new r45.dy5();
        dy5Var.f454392h = i17;
        yx5Var.f473013h = dy5Var;
        byte[] mo14344x5f01b1f6 = yx5Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.g9 g9Var = this.f325348d;
        g9Var.f183739b = mo14344x5f01b1f6;
        super/*dv2.o1*/.T6(g9Var, this.f325350f);
        return jz5.f0.f384359a;
    }
}
