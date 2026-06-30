package ad5;

/* loaded from: classes5.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f84841d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f84842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f84843f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yc5.a f84844g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f84845h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84846i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.app.Activity activity, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, yc5.a aVar, boolean z17, android.content.Context context) {
        super(0);
        this.f84841d = activity;
        this.f84842e = c0Var;
        this.f84843f = h0Var;
        this.f84844g = aVar;
        this.f84845h = z17;
        this.f84846i = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f84841d;
        if (activity == null || (!activity.isFinishing() && !activity.isDestroyed())) {
            ad5.s sVar = new ad5.s(this.f84844g, this.f84845h, this.f84846i);
            if (this.f84842e.f391645d) {
                sVar.mo152xb9724478();
            } else {
                this.f84843f.f391656d = sVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
