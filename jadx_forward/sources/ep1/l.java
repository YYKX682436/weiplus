package ep1;

/* loaded from: classes8.dex */
public final class l implements db5.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f337183a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f337184b;

    public l(boolean z17, android.app.Activity activity) {
        this.f337183a = z17;
        this.f337184b = activity;
    }

    @Override // db5.d
    /* renamed from: onComplete */
    public final void mo2162x815f5438(boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("convertActivityToTranslucent onComplete: ");
        sb6.append(z17);
        sb6.append(", retry: ");
        boolean z18 = this.f337183a;
        sb6.append(z18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAnimationUtils", sb6.toString());
        if (z17 || z18) {
            return;
        }
        ep1.m.a(this.f337184b, true);
    }
}
