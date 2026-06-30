package com.p314xaae8f345.mm.app;

/* loaded from: classes11.dex */
public class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f135404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f135405e;

    public v7(com.p314xaae8f345.mm.app.w7 w7Var, int i17, byte[] bArr) {
        this.f135404d = i17;
        this.f135405e = bArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (c01.d9.f118638b == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("summeranrt onReportKVDataReady channel:");
        int i17 = this.f135404d;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", sb6.toString());
        c01.d9.e().g(new lx3.h(this.f135405e, i17));
    }
}
