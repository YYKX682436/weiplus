package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts;

/* loaded from: classes.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f266191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 f266192e;

    public v(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627, java.util.Map map) {
        this.f266192e = activityC19366xa1004627;
        this.f266191d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = this.f266192e;
        activityC19366xa1004627.getClass();
        java.util.Map map = this.f266191d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.BaseSOSWebViewUI", "openSearchWebView %s", map.toString());
        int e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, "type", 0);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("toViewType", "suggestion");
        org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
        int e18 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.e(map, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        boolean a17 = tg0.r2.a(e18);
        java.lang.String jSONObject2 = jSONObject.toString();
        if (!a17) {
            jSONObject2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j9.b(jSONObject2);
        }
        java.lang.String str = (java.lang.String) map.get("tagId");
        java.lang.String str2 = (java.lang.String) map.get(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
        java.lang.String m80970x134c2d56 = activityC19366xa1004627.J4.m80970x134c2d56();
        java.lang.String f17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.f(map, "searchId");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        intent.putExtra("neverGetA8Key", true);
        intent.putExtra("key_load_js_without_delay", true);
        intent.putExtra("ftsQuery", m80970x134c2d56);
        intent.putExtra("ftsType", e17);
        intent.putExtra("ftsbizscene", e18);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        java.util.Map c17 = su4.r2.c(e18, false, e17, jSONObject2);
        java.util.HashMap hashMap2 = (java.util.HashMap) c17;
        hashMap2.put("query", tg0.r2.a(e18) ? m80970x134c2d56 : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.j9.b(m80970x134c2d56));
        hashMap2.put("searchId", f17);
        hashMap2.put("isHomePage", java.lang.String.valueOf(1));
        hashMap2.put("isSug", "1");
        if (!android.text.TextUtils.isEmpty(str2)) {
            hashMap2.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str2);
            intent.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, str2);
        }
        java.lang.String str3 = (java.lang.String) map.get("subSessionId");
        hashMap2.put("subSessionId", str3);
        intent.putExtra("subSessionId", str3);
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        intent.putExtra("rawUrl", su4.r2.e(c17, 0));
        intent.putExtra("ftsQuery", m80970x134c2d56);
        intent.putExtra("tabId", str);
        intent.putExtra("key_load_js_without_delay", true);
        intent.putExtra("ftsneedkeyboard", true);
        intent.putExtra("key_search_icon_and_hint_fix_default", true);
        intent.putExtra("ftsInitToSearch", true);
        intent.putExtra("hideSearchInput", false);
        j45.l.y(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, intent);
    }
}
