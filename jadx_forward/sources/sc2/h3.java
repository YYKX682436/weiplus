package sc2;

/* loaded from: classes2.dex */
public final class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.m3 f487476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487477e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487478f;

    public h3(sc2.m3 m3Var, android.view.View view, in5.s0 s0Var) {
        this.f487476d = m3Var;
        this.f487477e = view;
        this.f487478f = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f487478f.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        sc2.m3 m3Var = this.f487476d;
        m3Var.K(this.f487477e, m3Var.I(context));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m3Var.f487604w, "showSubtitleRunnable succ");
    }
}
