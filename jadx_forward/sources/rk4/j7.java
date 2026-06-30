package rk4;

/* loaded from: classes.dex */
public final class j7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f478289e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f478290f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.ar0 f478291g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f478292h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478293i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ yz5.a f478294m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(rk4.k8 k8Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, bw5.o50 o50Var, bw5.ar0 ar0Var, boolean z17, android.content.Context context, yz5.a aVar) {
        super(4);
        this.f478288d = k8Var;
        this.f478289e = h0Var;
        this.f478290f = o50Var;
        this.f478291g = ar0Var;
        this.f478292h = z17;
        this.f478293i = context;
        this.f478294m = aVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        java.lang.String errorMsg = (java.lang.String) obj3;
        java.lang.String categoryId = (java.lang.String) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(categoryId, "categoryId");
        pm0.v.X(new rk4.g7(this.f478289e));
        rk4.k8 k8Var = this.f478288d;
        p3325xe03a0797.p3326xc267989b.l.d(k8Var, null, null, new rk4.i7(booleanValue, intValue, errorMsg, categoryId, k8Var, this.f478290f, this.f478291g, this.f478292h, this.f478293i, this.f478294m, null), 3, null);
        return jz5.f0.f384359a;
    }
}
