package i62;

/* loaded from: classes13.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f370469e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f370470f;

    public a(long j17, android.app.Activity activity, int i17) {
        this.f370468d = j17;
        this.f370469e = activity;
        this.f370470f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long nanoTime = java.lang.System.nanoTime() - this.f370468d;
        float f17 = ((float) nanoTime) / 1000000;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("oncreate costMs:");
        sb6.append(f17);
        sb6.append(" costNs:");
        sb6.append(nanoTime);
        sb6.append(" act:");
        android.app.Activity activity = this.f370469e;
        sb6.append(activity.getClass().getName());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ActivityStartReportHelper", sb6.toString());
        i62.o oVar = i62.o.f370496a;
        i62.o.f370498c.add(new i62.j(activity.getClass().getName(), nanoTime, this.f370470f, -1));
        if (activity instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            yn5.l lVar = ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) activity).f39362x7310015e;
            long j17 = f17;
            lVar.f545569b = j17;
            if (j17 == 0 || !com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40539x7a994349()) {
                return;
            }
            lVar.b();
        }
    }
}
