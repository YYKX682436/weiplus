package ad5;

/* loaded from: classes.dex */
public final class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f84759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f84760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84761f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f84762g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f84763h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84764i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.app.Activity activity, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, boolean z18, android.content.Context context) {
        super(0);
        this.f84759d = activity;
        this.f84760e = c0Var;
        this.f84761f = h0Var;
        this.f84762g = z17;
        this.f84763h = z18;
        this.f84764i = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f84759d;
        if (activity == null || (!activity.isFinishing() && !activity.isDestroyed())) {
            ad5.a0 a0Var = new ad5.a0(this.f84762g, this.f84763h, this.f84764i);
            if (this.f84760e.f391645d) {
                a0Var.mo152xb9724478();
            } else {
                this.f84761f.f391656d = a0Var;
            }
        }
        return jz5.f0.f384359a;
    }
}
