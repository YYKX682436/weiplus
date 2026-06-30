package c55;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f38759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c55.u f38760e;

    public s(c55.u uVar, java.util.concurrent.CountDownLatch countDownLatch) {
        this.f38760e = uVar;
        this.f38759d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public void run() {
        c55.u uVar = this.f38760e;
        com.tencent.mm.recovery.ui.RecoveryUI recoveryUI = uVar.f38766d;
        java.lang.Thread thread = com.tencent.mm.recovery.ui.RecoveryUI.f192192s;
        recoveryUI.getClass();
        try {
            d55.a0 a0Var = new d55.a0(recoveryUI);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("crash count = ");
            com.tencent.mm.recoveryv2.RecoveryCrash$Record recoveryCrash$Record = recoveryUI.f192203p;
            sb6.append(recoveryCrash$Record == null ? 0 : recoveryCrash$Record.f192206d);
            sb6.append(", recovery setting = ");
            sb6.append(a0Var.f226556b);
            d55.u.b("MicroMsg.recovery.ui", sb6.toString(), new java.lang.Object[0]);
            d55.u.b("MicroMsg.recovery.ui", "clean tinker path (if exists)", new java.lang.Object[0]);
            try {
                boolean z17 = ak0.x.f5548k;
                com.tencent.tinker.loader.shareutil.SharePatchFileUtil.deleteDir(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(ak0.o.a()));
            } catch (java.lang.Throwable th6) {
                d55.u.c("MicroMsg.recovery.ui", "unable to clean patch", th6, new java.lang.Object[0]);
            }
            d55.u.b("MicroMsg.recovery.ui", "clean tinker path done", new java.lang.Object[0]);
            for (java.util.Map.Entry entry : ((java.util.HashMap) d55.r0.a().f226616c).entrySet()) {
                try {
                    y45.f fVar = (y45.f) ((d55.s) entry.getValue());
                    fVar.b(recoveryUI.getApplicationContext());
                    d55.u.d("MicroMsg.recovery.ui", "on recovery fallback, operation: \n" + fVar.f226612b.toString(), new java.lang.Object[0]);
                    if (recoveryUI.f192203p != null) {
                        d55.t.a(recoveryUI.getApplicationContext(), (java.lang.String) entry.getKey(), recoveryUI.f192203p, (d55.s) entry.getValue());
                    }
                } catch (java.lang.Throwable th7) {
                    d55.u.c("MicroMsg.recovery.ui", "on recovery fallback fail, key = " + ((java.lang.String) entry.getKey()), th7, new java.lang.Object[0]);
                }
            }
            y45.b.b(recoveryUI);
        } catch (java.lang.Throwable unused) {
        }
        d55.j b17 = d55.j.b(uVar.f38766d.getApplication());
        b17.d();
        b17.e();
        this.f38759d.countDown();
    }
}
