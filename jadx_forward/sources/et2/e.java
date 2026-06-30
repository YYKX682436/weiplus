package et2;

/* loaded from: classes10.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    public static final et2.e f338116f = et2.c.f338112a;

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f338117a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338118b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f338119c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f338120d;

    /* renamed from: e, reason: collision with root package name */
    public int f338121e;

    public e(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f338117a = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
        this.f338118b = new java.util.concurrent.ConcurrentHashMap();
        this.f338119c = new java.util.concurrent.ConcurrentHashMap();
        this.f338120d = new java.util.HashMap();
        android.content.Context applicationContext = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(applicationContext, "null cannot be cast to non-null type android.app.Application");
        ((android.app.Application) applicationContext).registerActivityLifecycleCallbacks(new et2.b(this));
    }
}
