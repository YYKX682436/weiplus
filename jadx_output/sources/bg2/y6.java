package bg2;

/* loaded from: classes3.dex */
public final class y6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20674d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.t6 f20675e;

    public y6(bg2.j7 j7Var, bg2.t6 t6Var) {
        this.f20674d = j7Var;
        this.f20675e = t6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bg2.j7 j7Var = this.f20674d;
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", "init ".concat(j7Var.c()));
        j7Var.f20218h = this.f20675e;
    }
}
