package j0;

/* loaded from: classes14.dex */
public final class w1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f378153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.x1 f378154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f378155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f378156g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(s1.x0 x0Var, j0.x1 x1Var, s1.o1 o1Var, int i17) {
        super(1);
        this.f378153d = x0Var;
        this.f378154e = x1Var;
        this.f378155f = o1Var;
        this.f378156g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.x0 x0Var = this.f378153d;
        j0.x1 x1Var = this.f378154e;
        int i17 = x1Var.f378167e;
        g2.r0 r0Var = x1Var.f378168f;
        j0.d5 d5Var = (j0.d5) x1Var.f378169g.mo152xb9724478();
        a2.k1 k1Var = d5Var != null ? d5Var.f377798a : null;
        boolean z17 = this.f378153d.mo7007x6fcfed3f() == p2.s.Rtl;
        s1.o1 o1Var = this.f378155f;
        d1.g a17 = j0.r4.a(x0Var, i17, r0Var, k1Var, z17, o1Var.f483583d);
        b0.y1 y1Var = b0.y1.Horizontal;
        int i18 = o1Var.f483583d;
        int i19 = this.f378156g;
        j0.u4 u4Var = x1Var.f378166d;
        u4Var.b(y1Var, a17, i19, i18);
        s1.n1.e(layout, this.f378155f, a06.d.b(-u4Var.a()), 0, 0.0f, 4, null);
        return jz5.f0.f384359a;
    }
}
