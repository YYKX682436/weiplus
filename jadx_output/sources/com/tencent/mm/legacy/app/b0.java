package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.legacy.app.l0 f68494d;

    public b0(com.tencent.mm.legacy.app.l0 l0Var) {
        this.f68494d = l0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "Replay pending messages.");
        this.f68494d.f68506a.b();
    }
}
