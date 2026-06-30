package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class v0 implements java.lang.Runnable {
    public v0(com.tencent.mm.legacy.app.w0 w0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WeChatSplashStartup", "MMKernel onStartupDone");
        l25.c.f315214d = true;
        kz5.h0.B(l25.c.f315212b, l25.a.f315209d);
        kz5.h0.B(l25.c.f315213c, l25.b.f315210d);
    }
}
