package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z65.a f53426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f53428f;

    public g4(z65.a aVar, java.lang.String str, boolean[] zArr) {
        this.f53426d = aVar;
        this.f53427e = str;
        this.f53428f = zArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            ((gm0.s) this.f53426d).a(this.f53427e);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMCrashReporter", th6, "callbackReset invoke failed.", new java.lang.Object[0]);
        }
        synchronized (this.f53428f) {
            boolean[] zArr = this.f53428f;
            zArr[0] = false;
            zArr.notifyAll();
        }
    }
}
