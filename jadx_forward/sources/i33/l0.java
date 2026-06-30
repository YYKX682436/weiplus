package i33;

/* loaded from: classes10.dex */
public final class l0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i33.t0 f369751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(i33.t0 t0Var) {
        super(0);
        this.f369751d = t0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.ui.q2 q2Var = com.p314xaae8f345.mm.ui.q2.NORMAL;
        i33.t0 t0Var = this.f369751d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = t0Var.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        i33.z0 z0Var = (i33.z0) pf5.z.f435481a.a(activity).e(i33.z0.class);
        if (z0Var != null) {
            z0Var.W6(q2Var);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(t0Var.f369780f, "HideScrollBar: notifyModeChanged to normal");
        return jz5.f0.f384359a;
    }
}
