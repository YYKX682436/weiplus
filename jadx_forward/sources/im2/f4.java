package im2;

/* loaded from: classes10.dex */
public final class f4 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.g4 f373849d;

    public f4(im2.g4 g4Var) {
        this.f373849d = g4Var;
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        im2.g4 g4Var = this.f373849d;
        if (!g4Var.O6()) {
            return false;
        }
        int size = g4Var.f373874d.size();
        if (!g4Var.f373875e || size >= 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerFactory", "preloadIdleHandler: completed! preloadCount=" + g4Var.f373874d.size() + ", isInFinder=" + g4Var.f373875e);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePlayerFactory", "preloadIdleHandler: start preload, currentSize=" + size + ", MAX_PRELOAD_COUNT=2");
        g4Var.f373874d.add(new nn0.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 0, true));
        return true;
    }
}
