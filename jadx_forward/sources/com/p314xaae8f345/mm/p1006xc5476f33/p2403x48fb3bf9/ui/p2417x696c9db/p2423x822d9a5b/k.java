package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes8.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k f265743a = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedHashMap f265744b;

    static {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4681x94468210.f19970x4fbc8495.mo40963x40b15f2e(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.j());
        f265744b = new java.util.LinkedHashMap();
    }

    public final void a(java.lang.String id6, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 controller, qx4.d0 jsapi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsapi, "jsapi");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_search_minimize_keepalive_count, 0);
        java.util.LinkedHashMap linkedHashMap = f265744b;
        int size = linkedHashMap.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchFloatBallMgr", "cacheSearchWebView " + id6 + ", current:" + size + ", limit:" + Ni);
        if (Ni <= 0) {
            return;
        }
        if (Ni <= size) {
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                jz5.o oVar = (jz5.o) ((java.lang.ref.SoftReference) entry.getValue()).get();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(oVar != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) oVar.f384374d : null, controller)) {
                    linkedHashMap.remove(entry.getKey());
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k kVar = f265743a;
                    java.lang.Object key = entry.getKey();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
                    kVar.c((java.lang.String) key);
                }
            }
        }
        linkedHashMap.put(id6, new java.lang.ref.SoftReference(new jz5.o(controller, jsapi, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()))));
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 b(java.lang.String id6) {
        jz5.o oVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) f265744b.get(id6);
        if (softReference == null || (oVar = (jz5.o) softReference.get()) == null) {
            return null;
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) oVar.f384374d;
    }

    public final void c(java.lang.String id6) {
        jz5.o oVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var;
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchFloatBallMgr", "removeCacheSearchWebView ".concat(id6));
        java.lang.ref.SoftReference softReference = (java.lang.ref.SoftReference) f265744b.remove(id6);
        if (softReference == null || (oVar = (jz5.o) softReference.get()) == null || (e3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3) oVar.f384374d) == null || !(z17 = e3Var.L) || !z17) {
            return;
        }
        e3Var.y1();
    }
}
