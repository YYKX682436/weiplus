package com.tencent.mm.console;

/* loaded from: classes7.dex */
public final /* synthetic */ class r3$$a implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.Shell", "re-send broadcast wechat.shell.DISABLE_ACTIVITY_NOTIFIER");
            com.tencent.mm.sdk.platformtools.x2.f193071a.sendBroadcast(new android.content.Intent("wechat.shell.DISABLE_ACTIVITY_NOTIFIER"), null);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Shell", th6, "", new java.lang.Object[0]);
        }
    }
}
