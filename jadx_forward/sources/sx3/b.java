package sx3;

/* loaded from: classes10.dex */
public final class b extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f495079d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f495080e;

    /* renamed from: f, reason: collision with root package name */
    public long f495081f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f495082g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f495083h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f495079d = new p012xc85e97e9.p093xedfae76a.j0();
        this.f495080e = true;
        this.f495081f = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        this.f495082g = new java.util.HashSet();
        this.f495083h = new java.util.ArrayList();
    }

    /* renamed from: clear */
    public final void m165440x5a5b64d() {
        this.f495082g.clear();
        this.f495083h.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f495083h.clear();
        this.f495082g.clear();
    }
}
