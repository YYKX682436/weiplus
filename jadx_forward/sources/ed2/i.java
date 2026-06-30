package ed2;

/* loaded from: classes2.dex */
public final class i extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.o7 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f332801d;

    /* renamed from: e, reason: collision with root package name */
    public ed2.a f332802e;

    /* renamed from: f, reason: collision with root package name */
    public in5.s0 f332803f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f332801d = new java.util.HashMap();
    }

    public final void O6(yz5.a aVar) {
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        pf5.e.m158343xd39de650(this, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new ed2.g(aVar, null), 2, null);
    }

    public final boolean P6(ed2.a key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        ed2.a aVar = this.f332802e;
        if (aVar == key || aVar == null) {
            O6(new ed2.h(key, this));
            return this.f332802e == key;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderFeedBubbleTipsManager", "showTargetWithResult false show " + key + ", current: " + this.f332802e);
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f332801d = new java.util.HashMap();
    }
}
