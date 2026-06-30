package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* loaded from: classes12.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f0 f219796d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f0 f0Var) {
        super(0);
        this.f219796d = f0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.f0 f0Var = this.f219796d;
        boolean g17 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.g(f0Var.f219799a);
        jz5.g gVar = f0Var.f219800b;
        if (!g17 || !com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.h()) {
            java.lang.String str2 = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "access$getDefaultHint(...)");
            return str2;
        }
        boolean z17 = true;
        java.lang.String a17 = j62.e.g().a("clicfg_fts_guide_page_search_bar_hint_android", "", true, true);
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(f0Var.f219799a);
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(a17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
            str = pv4.a.d(jSONObject, f17);
            if (str == null) {
                str = pv4.a.d(jSONObject, "en");
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FTSGuidePageSearchBarHint", e17, "parse expt failed", new java.lang.Object[0]);
            str = null;
        }
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = (java.lang.String) ((jz5.n) gVar).mo141623x754a37bb();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FTSGuidePageSearchBarHint", "getHint: " + str + " (expt: " + a17 + ", language: " + f17 + ')');
        return str;
    }
}
