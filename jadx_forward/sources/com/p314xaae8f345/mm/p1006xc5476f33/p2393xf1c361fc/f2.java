package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes8.dex */
public class f2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ su4.j2 f263038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263039e;

    public f2(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2 h2Var, su4.j2 j2Var, android.content.Context context) {
        this.f263038d = j2Var;
        this.f263039e = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.h(0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebSearch.StartWebSearchService", "fts h5 template not avail");
            return;
        }
        su4.j2 j2Var = this.f263038d;
        int i17 = j2Var.f494472b;
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
        java.lang.String l17 = o13.n.l(i17);
        int i18 = j2Var.f494473c;
        j2Var.getClass();
        android.content.Intent a17 = su4.r2.a();
        a17.putExtra("ftsbizscene", i17);
        a17.putExtra("ftsType", i18);
        a17.putExtra("key_change_search_icon", true);
        a17.putExtra("key_search_icon_and_hint_fix_default", true);
        java.util.Map b17 = su4.r2.b(i17, false, i18);
        java.util.HashMap hashMap = (java.util.HashMap) b17;
        hashMap.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, l17);
        hashMap.put("subSessionId", l17);
        a17.putExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, l17);
        a17.putExtra("subSessionId", l17);
        if (j2Var.D || j2Var.E) {
            org.json.JSONStringer jSONStringer = new org.json.JSONStringer();
            try {
                jSONStringer.object();
                if (j2Var.E) {
                    jSONStringer.key("disableCommUseApp");
                    jSONStringer.value(true);
                }
                if (j2Var.D) {
                    jSONStringer.key("enableDarkBlueTheme");
                    jSONStringer.value(1L);
                }
                jSONStringer.endObject();
            } catch (org.json.JSONException e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.WebSearch.StartWebSearchService", "", e17);
            }
            hashMap.put("thirdExtParam", tg0.r2.a(i17) ? jSONStringer.toString() : fp.s0.a(jSONStringer.toString()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartWebSearchService", "thirdExtParam = " + jSONStringer.toString());
        }
        java.lang.String e18 = su4.r2.e(b17, 0);
        a17.putExtra("rawUrl", e18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartWebSearchService", "startMiniSearchTabByTemplate , KRawUrl = " + e18);
        a17.putExtra("key_load_js_without_delay", true);
        a17.putExtra("ftsneedkeyboard", j2Var.A);
        a17.putExtra("key_preload_biz", 4);
        a17.putExtra("ftsForceShowDarkMode", false);
        a17.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559337bx);
        a17.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.by);
        if (i17 == 42 && j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2567xc9fa65a8.C20667xf38e649e()) == 1) {
            a17.putExtra("key_back_and_clear_query", true);
        }
        boolean z17 = j2Var.D;
        android.content.Context context = this.f263039e;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.StartWebSearchService", "startMiniSearchTabByTemplate , KRawUrl = " + e18);
            j45.l.j(context, "webview", ".ui.tools.fts.FTSWeAppSearchWebViewUI", a17, null);
        } else {
            j45.l.z(context, a17, null);
        }
        if ((context instanceof android.app.Activity) && fp.h.b(16)) {
            ((android.app.Activity) context).overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559337bx, com.p314xaae8f345.mm.R.C30854x2dc211.by);
        }
        su4.k2.a(i17, l17, l17, false, j2Var.f494474d, i18, "", false, "");
    }
}
