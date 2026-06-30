package gh;

/* loaded from: classes7.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final gh.c a(com.p314xaae8f345.p485x5dc4f1ad.AbstractC4208x204d5c83 runtime, ch.g jsThreadHandler, gh.b strategy) {
        gh.c dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runtime, "runtime");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsThreadHandler, "jsThreadHandler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strategy, "strategy");
        int ordinal = strategy.ordinal();
        if (ordinal == 0) {
            dVar = new gh.d(runtime, jsThreadHandler);
        } else if (ordinal == 1) {
            dVar = new gh.g(runtime, jsThreadHandler);
        } else if (ordinal == 2) {
            dVar = new gh.h(runtime, jsThreadHandler);
        } else if (ordinal == 3) {
            dVar = new gh.n0(runtime, jsThreadHandler);
        } else {
            if (ordinal != 4) {
                throw new jz5.j();
            }
            dVar = new gh.l0(runtime, jsThreadHandler);
        }
        ah.i.b("AnimationFrameHandler", "AnimationFrameHandler[" + dVar.b().name() + "] create " + java.lang.Thread.currentThread().getName(), new java.lang.Object[0]);
        dVar.d();
        return dVar;
    }
}
