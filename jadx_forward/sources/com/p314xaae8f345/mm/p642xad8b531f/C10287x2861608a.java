package com.p314xaae8f345.mm.p642xad8b531f;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.booter.InstallReceiver */
/* loaded from: classes5.dex */
public class C10287x2861608a extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String str;
        if (context == null || intent == null) {
            return;
        }
        java.lang.String action = intent.getAction();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InstallReceiver", "action:[%s]", action);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(action) || !action.equals("com.android.vending.INSTALL_REFERRER")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InstallReceiver", "action is null or nil, or not the installed action");
            return;
        }
        try {
            str = intent.getStringExtra("referrer");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InstallReceiver", "%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InstallReceiver", "get referer:[%s]", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InstallReceiver", "get referer is null or nil");
        } else {
            context.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit().putString("installreferer", str).commit();
        }
    }
}
