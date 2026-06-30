package mx0;

/* loaded from: classes5.dex */
public final class h3 extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public int f413555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx0.j3 f413556e;

    public h3(mx0.j3 j3Var) {
        this.f413556e = j3Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mx0.j3 j3Var = this.f413556e;
        int i17 = (int) (currentTimeMillis - j3Var.f413598g);
        if (i17 - this.f413555d >= 500) {
            j3Var.c(i17);
            this.f413555d = i17;
        }
    }
}
