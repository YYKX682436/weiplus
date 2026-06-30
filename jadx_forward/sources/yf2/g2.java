package yf2;

/* loaded from: classes3.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf2.i2 f543234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543235e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(yf2.i2 i2Var, int i17) {
        super(1);
        this.f543234d = i2Var;
        this.f543235e = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id editResult = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editResult, "editResult");
        yf2.i2 i2Var = this.f543234d;
        java.lang.String anchorFinderUsername = xy2.c.e(i2Var.O6());
        java.lang.String title = editResult.f200201b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        java.lang.String desc = editResult.f200202c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorFinderUsername, "anchorFinderUsername");
        r45.hx0 hx0Var = new r45.hx0();
        hx0Var.set(0, 19);
        r45.in1 in1Var = new r45.in1();
        in1Var.set(0, title);
        in1Var.set(1, anchorFinderUsername);
        in1Var.set(2, desc);
        hx0Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(in1Var.mo14344x5f01b1f6()));
        ek2.r1 r1Var = new ek2.r1(0L, 0L, 9, hx0Var);
        az2.j.u(r1Var, i2Var.O6(), null, 0L, 6, null);
        r1Var.l().h(new yf2.f2(i2Var, editResult, this.f543235e));
        return jz5.f0.f384359a;
    }
}
