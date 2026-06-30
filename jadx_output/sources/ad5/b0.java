package ad5;

/* loaded from: classes.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f3226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f3227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f3228f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f3229g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3230h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3231i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.app.Activity activity, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, boolean z17, boolean z18, android.content.Context context) {
        super(0);
        this.f3226d = activity;
        this.f3227e = c0Var;
        this.f3228f = h0Var;
        this.f3229g = z17;
        this.f3230h = z18;
        this.f3231i = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f3226d;
        if (activity == null || (!activity.isFinishing() && !activity.isDestroyed())) {
            ad5.a0 a0Var = new ad5.a0(this.f3229g, this.f3230h, this.f3231i);
            if (this.f3227e.f310112d) {
                a0Var.invoke();
            } else {
                this.f3228f.f310123d = a0Var;
            }
        }
        return jz5.f0.f302826a;
    }
}
