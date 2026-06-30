package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class m5 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f267214a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n5 f267215b;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n5 n5Var, android.view.View view) {
        this.f267215b = n5Var;
        this.f267214a = view;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewLongClickHelper", "getWXLongPressImageEventConfig value %s", str);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.n5 n5Var = this.f267215b;
        if (!K0) {
            try {
                boolean z17 = new org.json.JSONObject(u46.k.e(str)).optInt("forbidForward", 0) == 1;
                java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.f265461u;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5 b5Var = n5Var.f267390e;
                ((java.util.HashMap) map).put(b5Var.m(b5Var.f265474i), java.lang.Boolean.valueOf(z17));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewLongClickHelper", "reportOnLeave, ex = %s", e17.getMessage());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.b5.a(n5Var.f267390e, this.f267214a);
    }
}
