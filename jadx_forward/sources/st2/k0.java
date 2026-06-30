package st2;

/* loaded from: classes3.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493917d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f493918e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f493919f;

    public k0(st2.h1 h1Var, java.lang.Object obj, long j17) {
        this.f493917d = h1Var;
        this.f493918e = obj;
        this.f493919f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        st2.h1 h1Var = this.f493917d;
        android.content.Context context = h1Var.f493866d.getContext();
        if (context == null || !(context instanceof android.app.Activity)) {
            z17 = false;
        } else {
            android.app.Activity activity = (android.app.Activity) context;
            z17 = activity.isDestroyed() | activity.isFinishing();
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "openHalfScreenMiniprogramImpl delayMs:" + this.f493919f + ",isFinished!");
            return;
        }
        java.lang.Object obj = this.f493918e;
        if ((obj instanceof l81.b1 ? (l81.b1) obj : null) != null) {
            h1Var.F((l81.b1) obj);
        }
    }
}
