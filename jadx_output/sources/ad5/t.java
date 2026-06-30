package ad5;

/* loaded from: classes5.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f3308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f3309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f3310f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yc5.a f3311g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3312h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3313i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.app.Activity activity, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, yc5.a aVar, boolean z17, android.content.Context context) {
        super(0);
        this.f3308d = activity;
        this.f3309e = c0Var;
        this.f3310f = h0Var;
        this.f3311g = aVar;
        this.f3312h = z17;
        this.f3313i = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity activity = this.f3308d;
        if (activity == null || (!activity.isFinishing() && !activity.isDestroyed())) {
            ad5.s sVar = new ad5.s(this.f3311g, this.f3312h, this.f3313i);
            if (this.f3309e.f310112d) {
                sVar.invoke();
            } else {
                this.f3310f.f310123d = sVar;
            }
        }
        return jz5.f0.f302826a;
    }
}
