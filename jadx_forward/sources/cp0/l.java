package cp0;

/* loaded from: classes15.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final cp0.h f302288b = new cp0.h(null);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f302289c = jz5.h.b(cp0.g.f302279d);

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f302290d = "MicroMsg.Loader.TargetCenter";

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f302291a = new java.util.concurrent.ConcurrentHashMap();

    public l(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(ip0.a data, hp0.e result, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        final cp0.j jVar = new cp0.j(this, data, result, w1Var);
        if (w1Var == null) {
            pm0.v.X(jVar);
        } else {
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c4) w1Var).a(new java.lang.Runnable(jVar) { // from class: cp0.k

                /* renamed from: d, reason: collision with root package name */
                public final /* synthetic */ yz5.a f302287d;

                {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jVar, "function");
                    this.f302287d = jVar;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.f302287d.mo152xb9724478();
                }
            });
        }
    }

    public final void b(cp0.f target, ip0.a data, java.lang.String reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f302291a;
        jz5.l lVar = (jz5.l) concurrentHashMap.get(java.lang.Integer.valueOf(target.c()));
        if (lVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar.f384366d, data)) {
            return;
        }
        concurrentHashMap.remove(java.lang.Integer.valueOf(target.c()));
    }
}
