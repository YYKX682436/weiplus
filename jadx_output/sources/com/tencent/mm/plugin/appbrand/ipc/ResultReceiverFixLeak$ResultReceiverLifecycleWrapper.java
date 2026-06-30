package com.tencent.mm.plugin.appbrand.ipc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes7.dex */
public final class ResultReceiverFixLeak$ResultReceiverLifecycleWrapper extends android.support.v4.os.ResultReceiver implements androidx.lifecycle.x {

    /* renamed from: g, reason: collision with root package name */
    public android.support.v4.os.ResultReceiver f78391g;

    public ResultReceiverFixLeak$ResultReceiverLifecycleWrapper(android.support.v4.os.ResultReceiver resultReceiver, androidx.lifecycle.y yVar) {
        super(resultReceiver.f9010e);
        this.f78391g = resultReceiver;
        if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
            yVar.mo133getLifecycle().a(this);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.ipc.w0(this, yVar));
    }

    @Override // android.support.v4.os.ResultReceiver
    public void a(int i17, android.os.Bundle bundle) {
        android.support.v4.os.ResultReceiver resultReceiver = this.f78391g;
        if (resultReceiver != null) {
            resultReceiver.a(i17, bundle);
        }
    }

    @androidx.lifecycle.l0(androidx.lifecycle.m.ON_DESTROY)
    public void onDestroy() {
        this.f78391g = null;
    }
}
