package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.s f53715e;

    public q(com.tencent.mm.app.s sVar, java.lang.String str) {
        this.f53715e = sVar;
        this.f53714d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f53715e.f53758e.f53777c.f53889n && this.f53715e.f53757d.remove(this.f53714d)) {
            this.f53715e.f53758e.f53776b.a(false, this.f53714d);
        } else {
            this.f53715e.f53758e.f53777c.f53884f = null;
            com.tencent.mars.xlog.Log.w("MicroMsg.AppForegroundDelegate", "[PAUSED] delay to check background in stop!");
        }
        com.tencent.mm.app.d5 d5Var = com.tencent.mm.app.d5.f53384a;
        java.lang.String activityName = this.f53714d;
        kotlin.jvm.internal.o.g(activityName, "activityName");
        com.tencent.mm.app.d5.f53393j = false;
    }
}
