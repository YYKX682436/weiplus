package bg2;

/* loaded from: classes3.dex */
public final class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f102207d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.t6 f102208e;

    public y6(bg2.j7 j7Var, bg2.t6 t6Var) {
        this.f102207d = j7Var;
        this.f102208e = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.j7 j7Var = this.f102207d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", "init ".concat(j7Var.c()));
        j7Var.f101751h = this.f102208e;
    }
}
