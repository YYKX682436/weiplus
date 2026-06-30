package qm2;

/* loaded from: classes3.dex */
public final class k extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public qm2.f f446265d;

    /* renamed from: e, reason: collision with root package name */
    public long f446266e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f446267f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f446268g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f446265d = new qm2.f(0, 0, 0.0f, 0.0f, false, false, 0, 127, null);
        this.f446267f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f446268g = new java.util.ArrayList();
    }

    public static final void O6(qm2.k kVar, java.lang.String str) {
        kVar.f446267f.set(false);
        kVar.f446265d = new qm2.f(1, 0, 0.0f, 0.0f, false, false, 0, 124, null);
        java.util.Iterator it = ((java.util.ArrayList) kVar.f446268g).iterator();
        if (it.hasNext()) {
            p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderStartLiveNetSpeedTestUIC", "Network speed test failed: " + str);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f446266e = gm0.j1.u().c().t(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_NET_SPEED_TIMESTAMP_LONG_SYNC, 0L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        ((java.util.ArrayList) this.f446268g).clear();
    }
}
