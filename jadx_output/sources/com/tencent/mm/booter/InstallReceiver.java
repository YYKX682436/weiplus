package com.tencent.mm.booter;

@java.lang.Deprecated
/* loaded from: classes5.dex */
public class InstallReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        if (context == null || intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        com.tencent.mars.xlog.Log.i("MicroMsg.InstallReceiver", "action:[%s]", action);
        if (com.tencent.mm.sdk.platformtools.t8.K0(action) || !action.equals("com.android.vending.INSTALL_REFERRER")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InstallReceiver", "action is null or nil, or not the installed action");
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InstallReceiver", "%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            str = "";
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.InstallReceiver", "get referer:[%s]", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.InstallReceiver", "get referer is null or nil");
        } else {
            context.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).edit().putString("installreferer", str).commit();
        }
    }
}
