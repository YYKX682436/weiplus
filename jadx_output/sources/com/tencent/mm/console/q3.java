package com.tencent.mm.console;

/* loaded from: classes.dex */
public class q3 implements com.tencent.mm.console.g5 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f64842a = false;

    @Override // com.tencent.mm.console.g5
    public void a(android.content.Intent intent) {
        if (this.f64842a) {
            dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "xlog had moved.", 0).show();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "action: wechat.shell.PULL_XLOG");
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "start to move xlog.", 0).show();
        com.tencent.mars.xlog.Log.moveLogsFromCacheDirToLogDir();
        dp.a.makeText(com.tencent.mm.sdk.platformtools.x2.f193071a, "xlog move success", 0).show();
        this.f64842a = true;
    }
}
