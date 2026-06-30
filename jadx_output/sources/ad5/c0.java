package ad5;

/* loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f3237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f3238e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f3239f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3240g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3241h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(android.app.Activity activity, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, boolean z17, android.content.Context context) {
        super(1);
        this.f3237d = activity;
        this.f3238e = c0Var;
        this.f3239f = h0Var;
        this.f3240g = z17;
        this.f3241h = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        pm0.v.X(new ad5.b0(this.f3237d, this.f3238e, this.f3239f, ((java.lang.Boolean) obj).booleanValue(), this.f3240g, this.f3241h));
        return jz5.f0.f302826a;
    }
}
