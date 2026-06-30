package com.p314xaae8f345.mm.p1006xc5476f33.fts;

/* loaded from: classes12.dex */
public class g0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 f218942a;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var) {
        this.f218942a = d0Var;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || intent.getAction() == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.PluginFTS", "*** Charging notified: " + intent.getAction());
        boolean equals = intent.getAction().equals("android.intent.action.ACTION_POWER_CONNECTED");
        com.p314xaae8f345.mm.p1006xc5476f33.fts.d0 d0Var = this.f218942a;
        if (equals) {
            d0Var.f218919n = true;
        } else if (intent.getAction().equals("android.intent.action.ACTION_POWER_DISCONNECTED")) {
            d0Var.f218919n = false;
        }
    }
}
