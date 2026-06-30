package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7;

/* loaded from: classes12.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f234466a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f234467b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d f234468c;

    /* renamed from: d, reason: collision with root package name */
    public long f234469d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d dVar) {
        this.f234468c = dVar;
        this.f234466a = "com.tencent.mm.report." + dVar.j();
    }

    public synchronized void a() {
        if (this.f234467b) {
            return;
        }
        android.content.IntentFilter intentFilter = new android.content.IntentFilter(this.f234466a);
        if (fp.h.a(33)) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this, intentFilter, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXApp.f32839x928a5f8c, null);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.registerReceiver(this, intentFilter, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.WXApp.f32839x928a5f8c, null, 4);
        }
        this.f234467b = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f234446e, "register Reporter for [%s]", this.f234468c.j());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        long longExtra = intent.getLongExtra("PARAM_KEY_TOKEN", 0L);
        java.lang.String action = intent.getAction();
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.d.f234446e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[%s] received token [%s], action [%s]", this.f234468c.j(), java.lang.Long.valueOf(longExtra), action);
        if (longExtra == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "[%s] ERR: report token should not be 0", this.f234468c.j());
            return;
        }
        if (longExtra <= this.f234469d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[%s] already reported, xfer to next process, token [%s]", this.f234468c.j(), java.lang.Long.valueOf(longExtra));
            return;
        }
        this.f234469d = longExtra;
        ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1945xa3bcdba7.h(this), "HookReporter");
    }
}
