package gp2;

/* loaded from: classes2.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f355880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f355881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f355882f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f355883g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zy2.g5 g5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, gp2.l0 l0Var, int i17) {
        super(0);
        this.f355880d = g5Var;
        this.f355881e = abstractC14490x69736cb5;
        this.f355882f = l0Var;
        this.f355883g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zy2.g5 g5Var = this.f355880d;
        android.view.View mo56698x4ee17f0a = g5Var.mo56698x4ee17f0a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f355881e;
        mo56698x4ee17f0a.setTag(com.p314xaae8f345.mm.R.id.ryy, java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()));
        zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
        int i17 = this.f355883g;
        gp2.l0 l0Var = this.f355882f;
        if (p7Var != null) {
            p7Var.mo61224x6e59aab0(new gp2.v(l0Var, i17, g5Var));
        }
        g5Var.mo56704x526554de(new gp2.w(g5Var, abstractC14490x69736cb5, l0Var, i17));
        g5Var.mo56709x764d819b(true);
        zy2.g5.u(g5Var, null, 1, null);
        return jz5.f0.f384359a;
    }
}
