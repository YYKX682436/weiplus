package du0;

/* loaded from: classes5.dex */
public final class t1 extends du0.g {

    /* renamed from: i, reason: collision with root package name */
    public volatile pp0.s0 f324978i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        pp0.s0 s0Var = this.f324978i;
        if (s0Var != null) {
            ((dz0.s2) s0Var).a();
        }
        pp0.s0 s0Var2 = this.f324978i;
        if (s0Var2 != null) {
            ((dz0.s2) s0Var2).c();
        }
        super.mo528x82b764cd();
    }
}
