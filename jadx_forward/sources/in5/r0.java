package in5;

/* loaded from: classes2.dex */
public abstract class r0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.y0 f374653d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }

    public void i() {
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f374653d;
        if (y0Var != null) {
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
        }
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f374653d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("ScopeViewHolder")));
    }

    public void j() {
        if (this.f374653d == null) {
            i();
        }
    }

    public final android.view.View k(int i17) {
        android.view.View findViewById = this.f3639x46306858.findViewById(i17);
        if (!(findViewById instanceof android.view.View)) {
            findViewById = null;
        }
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SimpleViewHolder", "getViewOrNull: " + i17 + " is null");
        }
        return findViewById;
    }
}
