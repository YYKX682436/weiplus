package j0;

/* loaded from: classes14.dex */
public final class i5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f377883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j0.j5 f377884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f377885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f377886g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(s1.x0 x0Var, j0.j5 j5Var, s1.o1 o1Var, int i17) {
        super(1);
        this.f377883d = x0Var;
        this.f377884e = j5Var;
        this.f377885f = o1Var;
        this.f377886g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.x0 x0Var = this.f377883d;
        j0.j5 j5Var = this.f377884e;
        int i17 = j5Var.f377927e;
        g2.r0 r0Var = j5Var.f377928f;
        j0.d5 d5Var = (j0.d5) j5Var.f377929g.mo152xb9724478();
        a2.k1 k1Var = d5Var != null ? d5Var.f377798a : null;
        s1.o1 o1Var = this.f377885f;
        d1.g a17 = j0.r4.a(x0Var, i17, r0Var, k1Var, false, o1Var.f483583d);
        b0.y1 y1Var = b0.y1.Vertical;
        int i18 = o1Var.f483584e;
        int i19 = this.f377886g;
        j0.u4 u4Var = j5Var.f377926d;
        u4Var.b(y1Var, a17, i19, i18);
        s1.n1.e(layout, this.f377885f, 0, a06.d.b(-u4Var.a()), 0.0f, 4, null);
        return jz5.f0.f384359a;
    }
}
