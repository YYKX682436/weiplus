package v14;

/* loaded from: classes5.dex */
public final class y extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f514124d;

    /* renamed from: e, reason: collision with root package name */
    public final v14.x f514125e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f514125e = new v14.x(this);
    }

    public final void T6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUserInfoStatusUIC", "unInitUserStatusListener");
        i95.m c17 = i95.n0.c(vd0.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        v14.x listener = this.f514125e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((xd0.a) ((jm0.g) a17)).f535146f.remove(listener);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsUserInfoStatusUIC", "initUserStatusListener");
        i95.m c17 = i95.n0.c(vd0.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        jm0.o oVar = (jm0.o) c17;
        if (!jm0.g.class.isAssignableFrom(xd0.a.class)) {
            throw new java.lang.IllegalArgumentException(oVar.getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(oVar.getViewModel(), new jm0.e(oVar)).a(xd0.a.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        v14.x listener = this.f514125e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((xd0.a) ((jm0.g) a17)).f535146f.add(listener);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        T6();
    }
}
