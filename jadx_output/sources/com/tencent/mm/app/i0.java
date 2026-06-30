package com.tencent.mm.app;

/* loaded from: classes12.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.k0 f53445d;

    public i0(com.tencent.mm.app.k0 k0Var) {
        this.f53445d = k0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CrashDoubleUploader", "post CrashDoubleUpload once");
        this.f53445d.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
    }
}
