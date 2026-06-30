package p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392027a = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g.class, java.lang.Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater f392028b = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g.class, java.lang.Object.class, "_prev");

    /* renamed from: _next */
    private volatile /* synthetic */ java.lang.Object f72712x56e43d2 = null;

    /* renamed from: _prev */
    private volatile /* synthetic */ java.lang.Object f72713x56f5b12;

    public g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g gVar) {
        this.f72713x56f5b12 = gVar;
    }

    public static final java.lang.Object a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g gVar) {
        return gVar.f72712x56e43d2;
    }

    public abstract boolean b();

    public final boolean c() {
        java.lang.Object obj = this.f72712x56e43d2;
        return (obj == p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f.f392025a ? null : (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g) obj) == null;
    }

    public final void d() {
        while (true) {
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g gVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g) this.f72713x56f5b12;
            while (gVar != null && gVar.b()) {
                gVar = (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g) gVar.f72713x56f5b12;
            }
            java.lang.Object obj = this.f72712x56e43d2;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.f.f392025a;
            p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g gVar2 = obj == l0Var ? null : (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g) obj;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            while (gVar2.b()) {
                java.lang.Object obj2 = gVar2.f72712x56e43d2;
                gVar2 = obj2 == l0Var ? null : (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.g) obj2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar2);
            }
            gVar2.f72713x56f5b12 = gVar;
            if (gVar != null) {
                gVar.f72712x56e43d2 = gVar2;
            }
            if (!gVar2.b() && (gVar == null || !gVar.b())) {
                return;
            }
        }
    }
}
