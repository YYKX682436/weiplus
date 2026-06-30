package wj;

/* loaded from: classes3.dex */
public final class e0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f527929d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f527930e;

    public e0(java.lang.String str, java.lang.Runnable runnable) {
        this.f527929d = str;
        this.f527930e = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicAdCommonFeatureService", "innerPullAds, delay pull ads task evaluate, posId: " + this.f527929d);
        this.f527930e.run();
    }
}
