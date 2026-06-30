package com.p314xaae8f345.mm.p669x38b6e557;

/* renamed from: com.tencent.mm.console.r3$$a */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC10423x65e3240 implements java.lang.Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "re-send broadcast wechat.shell.DISABLE_ACTIVITY_NOTIFIER");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.sendBroadcast(new android.content.Intent("wechat.shell.DISABLE_ACTIVITY_NOTIFIER"), null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Shell", th6, "", new java.lang.Object[0]);
        }
    }
}
