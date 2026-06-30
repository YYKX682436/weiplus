package hr3;

/* loaded from: classes5.dex */
public final class s1 implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.w1 f365493a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365494b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f365495c;

    public s1(hr3.w1 w1Var, java.lang.String str, int i17) {
        this.f365493a = w1Var;
        this.f365494b = str;
        this.f365495c = i17;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        hr3.w1 w1Var = this.f365493a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = w1Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        return kz5.c1.k(new jz5.l("friend_request_id", (java.lang.String) ((jz5.n) ((hr3.pf) pf5.z.f435481a.a(activity).a(hr3.pf.class)).f365428n).mo141623x754a37bb()), new jz5.l("note_sid", (java.lang.String) ((jz5.n) w1Var.f365663e).mo141623x754a37bb()), new jz5.l("add_username", this.f365494b), new jz5.l("contact_enter_scene", java.lang.Integer.valueOf(this.f365495c)));
    }
}
