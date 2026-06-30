package l0;

/* loaded from: classes14.dex */
public final class p4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f395980e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f395981f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f395982g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f395983h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395984i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395985m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395986n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395987o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ l0.s4 f395988p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f395989q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f395990r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s1.x0 f395991s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(s1.o1 o1Var, int i17, int i18, int i19, int i27, s1.o1 o1Var2, s1.o1 o1Var3, s1.o1 o1Var4, s1.o1 o1Var5, l0.s4 s4Var, int i28, int i29, s1.x0 x0Var) {
        super(1);
        this.f395979d = o1Var;
        this.f395980e = i17;
        this.f395981f = i18;
        this.f395982g = i19;
        this.f395983h = i27;
        this.f395984i = o1Var2;
        this.f395985m = o1Var3;
        this.f395986n = o1Var4;
        this.f395987o = o1Var5;
        this.f395988p = s4Var;
        this.f395989q = i28;
        this.f395990r = i29;
        this.f395991s = x0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        int i17;
        int i18;
        boolean z18;
        s1.o1 o1Var;
        s1.o1 o1Var2;
        l0.s4 s4Var;
        int i19;
        s1.o1 o1Var3;
        int b17;
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.x0 x0Var = this.f395991s;
        s1.o1 o1Var4 = this.f395987o;
        s1.o1 o1Var5 = this.f395986n;
        s1.o1 o1Var6 = this.f395985m;
        int i27 = this.f395983h;
        int i28 = this.f395982g;
        l0.s4 s4Var2 = this.f395988p;
        s1.o1 o1Var7 = this.f395979d;
        if (o1Var7 != null) {
            int i29 = this.f395980e - this.f395981f;
            if (i29 < 0) {
                i29 = 0;
            }
            int i37 = i29;
            s1.o1 o1Var8 = this.f395984i;
            boolean z19 = s4Var2.f396048a;
            int i38 = this.f395990r + this.f395989q;
            float mo7005x9a59d0b2 = x0Var.mo7005x9a59d0b2();
            float f17 = l0.m4.f395913a;
            if (o1Var5 != null) {
                int i39 = z0.d.f550436a;
                z18 = z19;
                o1Var = o1Var8;
                o1Var2 = o1Var7;
                s4Var = s4Var2;
                i19 = i28;
                s1.n1.e(layout, o1Var5, 0, a06.d.b(((i27 - o1Var5.f483584e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            } else {
                z18 = z19;
                o1Var = o1Var8;
                o1Var2 = o1Var7;
                s4Var = s4Var2;
                i19 = i28;
            }
            if (o1Var4 != null) {
                int i47 = i19 - o1Var4.f483583d;
                int i48 = z0.d.f550436a;
                s1.n1.e(layout, o1Var4, i47, a06.d.b(((i27 - o1Var4.f483584e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            }
            if (z18) {
                int i49 = z0.d.f550436a;
                o1Var3 = o1Var2;
                b17 = a06.d.b(((i27 - o1Var3.f483584e) / 2.0f) * (1 + 0.0f));
            } else {
                o1Var3 = o1Var2;
                b17 = a06.d.b(l0.h4.f395758b * mo7005x9a59d0b2);
            }
            s1.n1.e(layout, o1Var3, l0.h4.e(o1Var5), b17 - a06.d.b((b17 - i37) * s4Var.f396049b), 0.0f, 4, null);
            s1.n1.e(layout, o1Var, l0.h4.e(o1Var5), i38, 0.0f, 4, null);
            if (o1Var6 != null) {
                s1.n1.e(layout, o1Var6, l0.h4.e(o1Var5), i38, 0.0f, 4, null);
            }
        } else {
            s1.o1 o1Var9 = this.f395984i;
            boolean z27 = s4Var2.f396048a;
            float mo7005x9a59d0b22 = x0Var.mo7005x9a59d0b2();
            float f18 = l0.m4.f395913a;
            int b18 = a06.d.b(((d0.e2) s4Var2.f396050c).f306642b * mo7005x9a59d0b22);
            if (o1Var5 != null) {
                int i57 = z0.d.f550436a;
                z17 = z27;
                s1.n1.e(layout, o1Var5, 0, a06.d.b(((i27 - o1Var5.f483584e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            } else {
                z17 = z27;
            }
            if (o1Var4 != null) {
                int i58 = i28 - o1Var4.f483583d;
                int i59 = z0.d.f550436a;
                s1.n1.e(layout, o1Var4, i58, a06.d.b(((i27 - o1Var4.f483584e) / 2.0f) * (1 + 0.0f)), 0.0f, 4, null);
            }
            if (z17) {
                int i66 = z0.d.f550436a;
                i17 = a06.d.b(((i27 - o1Var9.f483584e) / 2.0f) * (1 + 0.0f));
            } else {
                i17 = b18;
            }
            s1.n1.e(layout, o1Var9, l0.h4.e(o1Var5), i17, 0.0f, 4, null);
            if (o1Var6 != null) {
                if (z17) {
                    int i67 = z0.d.f550436a;
                    i18 = a06.d.b(((i27 - o1Var6.f483584e) / 2.0f) * (1 + 0.0f));
                } else {
                    i18 = b18;
                }
                s1.n1.e(layout, o1Var6, l0.h4.e(o1Var5), i18, 0.0f, 4, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
