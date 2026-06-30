package fn2;

/* loaded from: classes10.dex */
public final class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fn2.s1 f345900d;

    public r1(fn2.s1 s1Var) {
        this.f345900d = s1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        fn2.s1 s1Var = this.f345900d;
        int length = s1Var.H.length;
        int i17 = s1Var.G.f345938c.f345958d;
        if (!(i17 >= 0 && i17 < length)) {
            i17 = 0;
        }
        s1Var.w(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveUnifiedSongPanel", "Unified song panel initialized with defaultTab: " + i17);
    }
}
