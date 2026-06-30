package com.tencent.mm.legacy.app;

/* loaded from: classes12.dex */
public class h0 implements java.lang.Runnable {
    public h0(com.tencent.mm.legacy.app.i0 i0Var) {
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            fs.g.b(ea5.i.class, new com.tencent.mm.legacy.app.g0(this));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WeChatSplashStartup", e17, "IUdrStaticHandleStartForInit onWechatStart Exception", new java.lang.Object[0]);
        }
    }
}
