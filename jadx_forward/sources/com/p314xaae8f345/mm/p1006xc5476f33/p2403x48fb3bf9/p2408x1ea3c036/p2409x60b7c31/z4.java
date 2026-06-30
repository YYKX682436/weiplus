package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class z4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264071d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f264072e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f264073f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 f264074g;

    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, android.content.Context context) {
        this.f264074g = j4Var;
        this.f264071d = str;
        this.f264072e = q5Var;
        this.f264073f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = "";
        java.lang.String str2 = this.f264071d;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f264072e;
        if (K0) {
            q5Var.a("params is empty", null);
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("extInfo");
            final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = this.f264074g;
            j4Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_LINK;
            if (jSONObject.optString("shareType", "link").equals("image")) {
                f5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG;
            }
            j4Var.f263893e = f5Var;
            if (optJSONObject != null) {
                try {
                    str = java.net.URLEncoder.encode(optJSONObject.toString(), com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                } catch (java.io.UnsupportedEncodingException unused) {
                }
            }
            org.json.JSONArray optJSONArray = jSONObject.optJSONArray("menuItems");
            final org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("opItems");
            final android.content.Context context = this.f264073f;
            final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 0, false);
            k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s4(this, optJSONArray);
            k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.t4(this, jSONObject, str, k0Var);
            if (optJSONArray2 != null) {
                k0Var.f293407o = new db5.o4() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.j4$$a
                    @Override // db5.o4
                    /* renamed from: onCreateMMMenu */
                    public final void mo887xc459429a(db5.g4 g4Var) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.this.j(optJSONArray2, g4Var, context);
                    }
                };
                k0Var.f293417v = new db5.t4() { // from class: com.tencent.mm.plugin.webview.luggage.jsapi.j4$$b
                    @Override // db5.t4
                    /* renamed from: onMMMenuItemSelected */
                    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.this.getClass();
                        int itemId = menuItem.getItemId();
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put(dm.i4.f66865x76d1ec5a, itemId - 1000);
                        } catch (org.json.JSONException unused2) {
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var2 = q5Var;
                        q5Var2.b("onShareCustomMenuItemClick", jSONObject2);
                        q5Var2.a(null, null);
                        k0Var.u();
                    }
                };
            }
            k0Var.f293387d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.u4(this, str);
            if (jSONObject.optBoolean("enableQuickSend", true)) {
                uw4.u.a(context, k0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y4(this, jSONObject, str));
            }
            k0Var.v();
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiShareCustomContent", e17, "", new java.lang.Object[0]);
            q5Var.a("parse data Json fail", null);
        }
    }
}
