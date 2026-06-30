package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes15.dex */
public class q2 implements com.tencent.mm.pluginsdk.model.app.b5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.r2 f97122a;

    public q2(com.tencent.mm.plugin.downloader.model.r2 r2Var) {
        this.f97122a = r2Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.b5
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MBJsApiGameDownloadManager", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.downloader.model.r2 r2Var = this.f97122a;
        if (z17) {
            r2Var.f97136d.d(0, "");
        } else {
            r2Var.f97136d.d(809, "");
        }
    }
}
