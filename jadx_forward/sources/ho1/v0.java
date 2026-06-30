package ho1;

/* loaded from: classes5.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f364371d;

    public v0(boolean z17) {
        this.f364371d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a.f174155v;
        java.lang.ref.WeakReference weakReference2 = com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a.f174155v;
        com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a activityC12848x9fd7b69a = weakReference2 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.p1259x316220.ActivityC12848x9fd7b69a) weakReference2.get() : null;
        if (activityC12848x9fd7b69a != null) {
            if (this.f364371d) {
                activityC12848x9fd7b69a.getWindow().addFlags(128);
            } else {
                activityC12848x9fd7b69a.getWindow().clearFlags(128);
            }
        }
    }
}
