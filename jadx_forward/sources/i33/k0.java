package i33;

/* loaded from: classes10.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f369740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f369741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, i33.t0 t0Var) {
        super(0);
        this.f369740d = activityC0065xcd7aa112;
        this.f369741e = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f369740d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.k1 k1Var = (i33.k1) pf5.z.f435481a.a(activity).e(i33.k1.class);
        android.view.View m8007x6a486239 = this.f369741e.U6().m8007x6a486239(k1Var != null ? k1Var.f369746m : 0);
        return java.lang.Integer.valueOf(m8007x6a486239 != null ? m8007x6a486239.getHeight() : 0);
    }
}
