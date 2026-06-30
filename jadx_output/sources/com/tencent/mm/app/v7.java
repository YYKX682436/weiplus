package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f53872e;

    public v7(com.tencent.mm.app.w7 w7Var, int i17, byte[] bArr) {
        this.f53871d = i17;
        this.f53872e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (c01.d9.f37105b == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summeranrt onReportKVDataReady channel:");
        int i17 = this.f53871d;
        sb6.append(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.WorkerProfile", sb6.toString());
        c01.d9.e().g(new lx3.h(this.f53872e, i17));
    }
}
