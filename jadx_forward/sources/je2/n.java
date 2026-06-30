package je2;

/* loaded from: classes3.dex */
public final class n extends mm2.e {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f380778f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f380779g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f380780h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f380781i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f380782m;

    /* renamed from: n, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 f380783n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(gk2.e liveContext) {
        super(liveContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveContext, "liveContext");
        this.f380778f = "Finder.LiveGameDataBannerSlice";
        this.f380779g = jz5.h.b(je2.m.f380777d);
        u26.u uVar = u26.u.DROP_OLDEST;
        this.f380780h = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(1, 1, uVar);
        this.f380781i = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(1, 1, uVar);
        this.f380782m = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(1, 1, uVar);
        this.f380783n = p3325xe03a0797.p3326xc267989b.p3328x30012e.r2.a(1, 1, uVar);
    }

    public final void N6(r45.vq1 gameData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gameData, "gameData");
        pm0.v.X(new je2.k(gameData, this));
    }

    public final r45.wq1 O6(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.e mo75930xb5cb93b2 = new r45.wq1().mo75930xb5cb93b2(str);
        if (mo75930xb5cb93b2 instanceof r45.wq1) {
            return (r45.wq1) mo75930xb5cb93b2;
        }
        return null;
    }

    public final synchronized je2.j P6() {
        java.lang.Object obj;
        java.util.Iterator it = Q6().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((je2.j) obj).a()) {
                break;
            }
        }
        return (je2.j) obj;
    }

    public final java.util.concurrent.ConcurrentLinkedQueue Q6() {
        return (java.util.concurrent.ConcurrentLinkedQueue) ((jz5.n) this.f380779g).mo141623x754a37bb();
    }

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        Q6().clear();
    }
}
