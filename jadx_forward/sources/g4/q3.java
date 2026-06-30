package g4;

/* loaded from: classes5.dex */
public abstract class q3 {

    /* renamed from: a, reason: collision with root package name */
    public g4.f3 f350044a;

    /* renamed from: b, reason: collision with root package name */
    public g4.y4 f350045b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.e1 f350046c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f350047d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.u4 f350048e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f350049f;

    /* renamed from: g, reason: collision with root package name */
    public volatile int f350050g;

    /* renamed from: h, reason: collision with root package name */
    public final g4.p3 f350051h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 f350052i;

    /* renamed from: j, reason: collision with root package name */
    public final g4.f0 f350053j;

    /* renamed from: k, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.p0 f350054k;

    public q3(g4.f0 differCallback, p3325xe03a0797.p3326xc267989b.p0 mainDispatcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(differCallback, "differCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainDispatcher, "mainDispatcher");
        this.f350053j = differCallback;
        this.f350054k = mainDispatcher;
        g4.f3 f3Var = g4.f3.f349824e;
        g4.f3 f3Var2 = g4.f3.f349824e;
        if (f3Var2 == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.paging.PagePresenter<T>");
        }
        this.f350044a = f3Var2;
        g4.e1 e1Var = new g4.e1();
        this.f350046c = e1Var;
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        this.f350047d = copyOnWriteArrayList;
        this.f350048e = new g4.u4(true);
        this.f350051h = new g4.p3(this);
        this.f350052i = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(e1Var.c());
        g4.k3 k3Var = new g4.k3(this);
        copyOnWriteArrayList.add(k3Var);
        k3Var.mo146xb9724478(e1Var.c());
    }
}
