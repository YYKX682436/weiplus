package ad5;

/* loaded from: classes5.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f3315d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f3316e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f3317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3318g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(android.app.Activity activity, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, boolean z17, android.content.Context context) {
        super(1);
        this.f3315d = activity;
        this.f3316e = c0Var;
        this.f3317f = h0Var;
        this.f3318g = z17;
        this.f3319h = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yc5.a result = (yc5.a) obj;
        kotlin.jvm.internal.o.g(result, "result");
        pm0.v.X(new ad5.t(this.f3315d, this.f3316e, this.f3317f, result, this.f3318g, this.f3319h));
        return jz5.f0.f302826a;
    }
}
