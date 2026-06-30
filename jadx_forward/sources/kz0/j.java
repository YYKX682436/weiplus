package kz0;

/* loaded from: classes14.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f395281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f395282f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395283g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395284h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s1.o1 f395285i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f395286m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f395287n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(s1.o1 o1Var, float f17, boolean z17, s1.o1 o1Var2, s1.o1 o1Var3, s1.o1 o1Var4, int i17, long j17) {
        super(1);
        this.f395280d = o1Var;
        this.f395281e = f17;
        this.f395282f = z17;
        this.f395283g = o1Var2;
        this.f395284h = o1Var3;
        this.f395285i = o1Var4;
        this.f395286m = i17;
        this.f395287n = j17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        s1.o1 o1Var;
        s1.n1 layout = (s1.n1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "$this$layout");
        s1.o1 o1Var2 = this.f395280d;
        if (o1Var2 != null) {
            s1.n1.b(layout, o1Var2, 0, (int) this.f395281e, 0.0f, 4, null);
        }
        if (this.f395282f && (o1Var = this.f395283g) != null) {
            s1.n1.b(layout, o1Var, 0, p2.c.g(this.f395287n) - o1Var.f483584e, 0.0f, 4, null);
        }
        s1.o1 o1Var3 = this.f395284h;
        if (o1Var3 != null) {
            s1.n1.b(layout, o1Var3, 0, 0, 0.0f, 4, null);
        }
        s1.o1 o1Var4 = this.f395285i;
        if (o1Var4 != null) {
            s1.n1.b(layout, o1Var4, 0, this.f395286m, 0.0f, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
