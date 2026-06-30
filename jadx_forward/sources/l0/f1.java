package l0;

/* loaded from: classes14.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f395713d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395714e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395715f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395716g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395717h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395718i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395719m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395720n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l0.i1 f395721o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f395722p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(int i17, int i18, s1.o1 o1Var, s1.o1 o1Var2, s1.o1 o1Var3, s1.o1 o1Var4, s1.o1 o1Var5, s1.o1 o1Var6, l0.i1 i1Var, s1.x0 x0Var) {
        super(1);
        this.f395713d = i17;
        this.f395714e = i18;
        this.f395715f = o1Var;
        this.f395716g = o1Var2;
        this.f395717h = o1Var3;
        this.f395718i = o1Var4;
        this.f395719m = o1Var5;
        this.f395720n = o1Var6;
        this.f395721o = i1Var;
        this.f395722p = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.o1 o1Var;
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.o1 o1Var2 = this.f395717h;
        s1.o1 o1Var3 = this.f395720n;
        l0.i1 i1Var = this.f395721o;
        float f17 = i1Var.f395783c;
        s1.x0 x0Var = this.f395722p;
        float mo7005x9a59d0b2 = x0Var.mo7005x9a59d0b2();
        p2.s mo7007x6fcfed3f = x0Var.mo7007x6fcfed3f();
        float f18 = l0.c1.f395626a;
        d0.d2 d2Var = i1Var.f395784d;
        int b17 = a06.d.b(((d0.e2) d2Var).f306642b * mo7005x9a59d0b2);
        int b18 = a06.d.b(d0.a2.e(d2Var, mo7007x6fcfed3f) * mo7005x9a59d0b2);
        float f19 = l0.h4.f395759c * mo7005x9a59d0b2;
        int i37 = this.f395713d;
        s1.o1 o1Var4 = this.f395715f;
        if (o1Var4 != null) {
            int i38 = z0.d.f550436a;
            o1Var = o1Var4;
            i17 = i37;
            i18 = b17;
            i19 = 1;
            s1.n1.e(layout, o1Var4, 0, a06.d.b(((i37 - o1Var4.f483584e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
        } else {
            o1Var = o1Var4;
            i17 = i37;
            i18 = b17;
            i19 = 1;
        }
        s1.o1 o1Var5 = this.f395716g;
        if (o1Var5 != null) {
            int i39 = this.f395714e - o1Var5.f483583d;
            int i47 = z0.d.f550436a;
            s1.n1.e(layout, o1Var5, i39, a06.d.b(((i17 - o1Var5.f483584e) / 2.0f) * (i19 + 0.0f)), 0.0f, 4, null);
        }
        boolean z17 = i1Var.f395782b;
        s1.o1 o1Var6 = this.f395718i;
        if (o1Var6 != null) {
            if (z17) {
                int i48 = z0.d.f550436a;
                i29 = a06.d.b(((i17 - o1Var6.f483584e) / 2.0f) * (i19 + 0.0f));
            } else {
                i29 = i18;
            }
            float f27 = i19 - f17;
            s1.n1.e(layout, o1Var6, a06.d.b(o1Var == null ? 0.0f : f27 * (l0.h4.e(o1Var) - f19)) + b18, a06.d.b((i29 * f27) - ((o1Var6.f483584e / 2) * f17)), 0.0f, 4, null);
        }
        if (z17) {
            int i49 = z0.d.f550436a;
            i27 = a06.d.b(((i17 - o1Var2.f483584e) / 2.0f) * (i19 + 0.0f));
        } else {
            i27 = i18;
        }
        s1.n1.e(layout, o1Var2, l0.h4.e(o1Var), i27, 0.0f, 4, null);
        s1.o1 o1Var7 = this.f395719m;
        if (o1Var7 != null) {
            if (z17) {
                int i57 = z0.d.f550436a;
                i28 = a06.d.b(((i17 - o1Var7.f483584e) / 2.0f) * (i19 + 0.0f));
            } else {
                i28 = i18;
            }
            s1.n1.e(layout, o1Var7, l0.h4.e(o1Var), i28, 0.0f, 4, null);
        }
        s1.n1.d(layout, o1Var3, p2.m.f432921b, 0.0f, 2, null);
        return jz5.f0.f384359a;
    }
}
