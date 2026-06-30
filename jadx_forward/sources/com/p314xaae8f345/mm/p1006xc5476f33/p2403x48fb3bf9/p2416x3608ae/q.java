package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae;

/* loaded from: classes.dex */
public class q implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b f265096d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b activityC19301x4b18db3b) {
        this.f265096d = activityC19301x4b18db3b;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b activityC19301x4b18db3b = this.f265096d;
        if (activityC19301x4b18db3b.getWindow() == null || activityC19301x4b18db3b.getWindow().getDecorView() == null || activityC19301x4b18db3b.getWindow().getDecorView().getWindowToken() == null) {
            int i17 = activityC19301x4b18db3b.f265011p;
            if (i17 < 10) {
                activityC19301x4b18db3b.f265011p = i17 + 1;
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "timer reach max retry time, finish ProxyUI");
            activityC19301x4b18db3b.finish();
            return false;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.ActivityC19301x4b18db3b.f265001s;
        android.content.Intent intent = activityC19301x4b18db3b.getIntent();
        int intExtra = intent.getIntExtra("proxyui_action_code_key", 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubProxyUI", "onCreate, dealAfterWindowTokenInited = " + intExtra);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 z0Var = activityC19301x4b18db3b.f265009n;
        if (intExtra == 1) {
            nw4.y2 y2Var = new nw4.y2();
            y2Var.f422545b = intent.getStringExtra("proxyui_type_key");
            y2Var.f422552i = intent.getStringExtra("proxyui_function_key");
            y2Var.f422546c = intent.getStringExtra("proxyui_callback_key");
            android.os.Bundle extras = intent.getExtras();
            if (extras == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "getExtras from intent, returned NULL");
                extras = android.os.Bundle.EMPTY;
            }
            y2Var.f422323a = nw4.a.a(extras.getBundle("compatParams"));
            y2Var.f422548e = extras.getBundle("jsEngine");
            try {
                java.lang.String string = extras.getString("rawParams");
                if (!android.text.TextUtils.isEmpty(string)) {
                    y2Var.f422547d = new org.json.JSONObject(string);
                }
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "get rawParams, e = %s", e17);
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3) intent.getExtras().getParcelable("proxyui_perm_key");
            if (c19775x58fd37b3 == null) {
                c19775x58fd37b3 = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(activityC19301x4b18db3b.f265005g);
            a17.f266528x = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "markAwaitingProxyUI %d, %b", java.lang.Integer.valueOf(a17.B), java.lang.Boolean.FALSE);
            a17.W6(activityC19301x4b18db3b, z0Var, activityC19301x4b18db3b.f265003e);
            if (!a17.A6(y2Var, c19775x58fd37b3)) {
                try {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.o) z0Var).aj(null, null, null, true);
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubProxyUI", "onHandleEnd, ex = " + e18.getMessage());
                }
            }
        } else if (intExtra != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewStubProxyUI", "dealAfterWindowTokenInited unknown actionCode = " + intExtra);
            activityC19301x4b18db3b.finish();
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3 c19775x58fd37b32 = (com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3) intent.getExtras().getParcelable("proxyui_perm_key");
            if (c19775x58fd37b32 == null) {
                c19775x58fd37b32 = new com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3(2);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(activityC19301x4b18db3b.f265005g).V6(activityC19301x4b18db3b, z0Var);
            if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.k8.a(activityC19301x4b18db3b.f265005g).M5(intent.getStringExtra("proxyui_username_key"), c19775x58fd37b32)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubProxyUI", "doProfile fail, finish");
                activityC19301x4b18db3b.finish();
            }
        }
        activityC19301x4b18db3b.f265004f = true;
        return false;
    }
}
