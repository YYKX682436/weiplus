package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.s f67442d;

    public l(com.tencent.mm.feature.performance.adpf.s sVar) {
        this.f67442d = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qh.f0 f0Var;
        android.os.Handler handler;
        com.tencent.mm.feature.performance.adpf.s sVar = this.f67442d;
        android.os.Handler handler2 = sVar.f67479f;
        if (handler2 == null) {
            ph.u e17 = gi.d.e();
            android.os.Handler handler3 = null;
            android.os.Looper looper = (e17 == null || (f0Var = e17.f354296h) == null || (handler = f0Var.f363337f) == null) ? null : handler.getLooper();
            if (looper != null) {
                handler3 = new android.os.Handler(looper);
                sVar.f67479f = handler3;
            }
            handler2 = handler3;
        }
        if (handler2 != null) {
            handler2.post((com.tencent.mm.feature.performance.adpf.p) ((jz5.n) sVar.f67481h).getValue());
        }
    }
}
