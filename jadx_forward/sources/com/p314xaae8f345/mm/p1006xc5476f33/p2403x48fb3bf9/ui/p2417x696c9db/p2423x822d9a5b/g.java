package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class g extends gp1.e0 implements hm0.q {
    @Override // gp1.x
    public void G0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265743a;
        if (c12886x91aa2b6d == null) {
            return;
        }
        java.lang.String key = c12886x91aa2b6d.f174582g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "key");
        kVar.c(key);
    }

    @Override // hm0.q
    /* renamed from: onConfigurationChanged */
    public void mo43788x50e1c15d(android.content.res.Configuration configuration) {
    }

    @Override // hm0.q
    /* renamed from: onLowMemory */
    public void mo43789xb5d8ba56() {
    }

    @Override // hm0.q
    /* renamed from: onTerminate */
    public void mo43790x7784fb42() {
    }

    @Override // hm0.q
    /* renamed from: onTrimMemory */
    public void mo43791x29685b02(int i17) {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265743a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SearchFloatBallMgr", "clearCacheWebViewController");
        java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265744b;
        for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
            jz5.o oVar = (jz5.o) ((java.lang.ref.SoftReference) entry.getValue()).get();
            if (oVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k kVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265743a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) oVar.f384374d;
                if (e3Var != null && (z17 = e3Var.L) && z17) {
                    e3Var.y1();
                }
            }
        }
        linkedHashMap.clear();
    }

    @Override // gp1.x
    public void r0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        android.os.Bundle bundle = c12886x91aa2b6d != null ? c12886x91aa2b6d.G : null;
        if (bundle == null) {
            return;
        }
        su4.j2 j2Var = new su4.j2();
        j2Var.f494476f = bundle.getBoolean("isHomePage");
        j2Var.f494472b = bundle.getInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        j2Var.f494473c = bundle.getInt("type", 0);
        tg0.o1 o1Var = (tg0.o1) i95.n0.c(tg0.o1.class);
        int i17 = j2Var.f494472b;
        ((sg0.y3) o1Var).getClass();
        j2Var.f494475e = su4.r2.f(i17);
        j2Var.f494471a = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        j2Var.f494478h = true;
        j2Var.F = c12886x91aa2b6d.f174582g;
        org.json.JSONObject jSONObject = new org.json.JSONObject(bundle.getString("extParams", "{}"));
        java.lang.String string = bundle.getString("navBarParams");
        if (string != null) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(string);
            j2Var.f494487q = jSONObject2.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            j2Var.f494480j = jSONObject2.optBoolean("hideNavBar");
            boolean optBoolean = jSONObject2.optBoolean("hideSearchBar");
            j2Var.f494479i = optBoolean;
            if (optBoolean) {
                j2Var.f494483m = com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c;
            }
            jSONObject.put("hideNavBar", j2Var.f494480j);
            jSONObject.put("hideSearchInput", j2Var.f494479i);
        }
        j2Var.f494477g = d75.b.e(jSONObject, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.f.f265729d);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
    }
}
