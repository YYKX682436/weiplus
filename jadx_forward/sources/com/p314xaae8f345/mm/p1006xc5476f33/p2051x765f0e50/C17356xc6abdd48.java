package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50;

/* renamed from: com.tencent.mm.plugin.setting.SwitchAccountReceiver */
/* loaded from: classes12.dex */
public class C17356xc6abdd48 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("switch_process_action_code_key");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountReceiver", "onReceive, action %s", stringExtra);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra) && stringExtra.equals("action_reload_resources")) {
            java.lang.String stringExtra2 = intent.getStringExtra("switch_language");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwitchAccountReceiver", "onReceive, language %s", stringExtra2);
            java.util.Locale s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.s(stringExtra2);
            if ("language_default".equalsIgnoreCase(stringExtra2)) {
                s17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f274381b;
                java.util.Locale.setDefault(s17);
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.u(context.getApplicationContext(), s17);
            android.content.res.Resources resources = context.getApplicationContext().getResources();
            android.content.Context applicationContext = context.getApplicationContext();
            java.lang.reflect.Method method = j65.j.f379488f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e = j65.j.d(resources, applicationContext, j65.v.f(applicationContext, stringExtra2), false);
        }
    }
}
