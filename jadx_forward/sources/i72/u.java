package i72;

/* loaded from: classes.dex */
public class u implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f370972d;

    public u(java.lang.Runnable runnable) {
        this.f370972d = new java.lang.ref.WeakReference(runnable);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        java.lang.Runnable runnable = (java.lang.Runnable) this.f370972d.get();
        if (runnable == null) {
            return false;
        }
        runnable.run();
        return true;
    }
}
