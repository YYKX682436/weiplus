package zx5;

/* loaded from: classes13.dex */
public class q extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zx5.u f558789d;

    public q(zx5.u uVar) {
        this.f558789d = uVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("task retry execute! mRetrytimes = ");
        zx5.u uVar = this.f558789d;
        sb6.append(uVar.f558807h);
        by5.c4.a("XWebHttpTask", sb6.toString());
        zx5.r rVar = uVar.f558806g;
        zx5.b bVar = uVar.f558805f;
        int i17 = uVar.f558807h;
        zx5.u uVar2 = new zx5.u();
        uVar2.f558805f = bVar;
        uVar2.f558806g = rVar;
        uVar2.f558807h = i17;
        uVar2.f558809j = java.lang.System.currentTimeMillis();
        uVar2.e(uVar2.f558806g);
        java.util.Timer timer = uVar.f558808i;
        if (timer != null) {
            timer.cancel();
            uVar.f558808i = null;
        }
    }
}
