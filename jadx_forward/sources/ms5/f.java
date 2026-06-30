package ms5;

/* loaded from: classes10.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final ms5.f f412691a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f412692b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f412693c;

    /* renamed from: d, reason: collision with root package name */
    public static final p3325xe03a0797.p3326xc267989b.y0 f412694d;

    /* renamed from: e, reason: collision with root package name */
    public static p3325xe03a0797.p3326xc267989b.r2 f412695e;

    /* renamed from: f, reason: collision with root package name */
    public static final ls5.a f412696f;

    static {
        ms5.f fVar = new ms5.f();
        f412691a = fVar;
        f412692b = new java.util.HashSet();
        f412693c = new java.util.HashMap();
        f412694d = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c).mo7096x348d9a(new p3325xe03a0797.p3326xc267989b.x0("page_event_detector_checker")));
        f412696f = new ls5.a();
        fVar.c("com.tencent.mm.live.core.core.player.FinderPageExitPlayerDetector");
        fVar.c("com.tencent.mm.plugin.finder.detector.FinderMMPlayerDetector");
        fVar.c("com.tencent.mm.live.core.core.player.FinderNewLivePlayerDetector");
    }

    public static final void d(final android.app.Activity activity, final p012xc85e97e9.p093xedfae76a.o lifecycle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycle, "lifecycle");
        lifecycle.a(new p012xc85e97e9.p093xedfae76a.x(activity, lifecycle) { // from class: com.tencent.plugin.finder.detector.api.detect.PageEventDetectorManager$registerLifeCycle$1

            /* renamed from: d, reason: collision with root package name */
            public final java.lang.String f296761d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ p012xc85e97e9.p093xedfae76a.o f296762e;

            {
                this.f296762e = lifecycle;
                ms5.f fVar = ms5.f.f412691a;
                java.lang.String str = activity.getClass().getSimpleName() + '_' + activity.hashCode();
                this.f296761d = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PageEventDetectorManager", "registerLifeCycle activityKey: " + str);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_CREATE)
            /* renamed from: onCreate */
            public final void m93501x3e5a77bb() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate activityKey: ");
                java.lang.String str = this.f296761d;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PageEventDetectorManager", sb6.toString());
                ms5.f.f412692b.add(str);
            }

            @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
            /* renamed from: onDestroy */
            public final void m93502xac79a11b() {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy activityKey: ");
                java.lang.String str = this.f296761d;
                sb6.append(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PageEventDetectorManager", sb6.toString());
                ms5.f.f412692b.remove(str);
                this.f296762e.c(this);
            }
        });
    }

    public final void a(java.lang.String detectorSource) {
        org.json.JSONArray jSONArray;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectorSource, "detectorSource");
        ls5.a aVar = f412696f;
        synchronized (aVar.f402648d) {
            jSONArray = new org.json.JSONArray();
            java.util.Iterator it = aVar.f402648d.iterator();
            while (it.hasNext()) {
                jSONArray.put((java.lang.String) it.next());
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start checkDetect checkJob: ");
        p3325xe03a0797.p3326xc267989b.r2 r2Var = f412695e;
        sb6.append(r2Var != null ? java.lang.Boolean.valueOf(r2Var.A()) : null);
        sb6.append(" detectorSource: ");
        sb6.append(detectorSource);
        sb6.append(" traceDump: ");
        sb6.append(jSONArray);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PageEventDetectorManager", sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = f412695e;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        f412695e = p3325xe03a0797.p3326xc267989b.l.d(f412694d, null, null, new ms5.e(detectorSource, jSONArray, null), 3, null);
    }

    public final java.lang.Object b(java.lang.Class cls) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cls, "cls");
        java.util.HashMap hashMap = f412693c;
        if (hashMap.get(cls) != null) {
            return hashMap.get(cls);
        }
        throw new java.lang.RuntimeException("current detector: " + cls.getSimpleName() + " need to register on init");
    }

    public final void c(java.lang.String str) {
        java.lang.Class<?> cls = java.lang.Class.forName(str);
        java.lang.Object newInstance = cls.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        f412693c.put(cls, newInstance);
    }
}
