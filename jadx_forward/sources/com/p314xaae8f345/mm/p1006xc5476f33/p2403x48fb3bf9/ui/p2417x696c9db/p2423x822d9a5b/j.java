package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes5.dex */
public final class j extends com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g {
    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k kVar = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265743a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SearchFloatBallMgr", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.m2.f35134x24728b);
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_search_minimize_keepalive_duration, 0) * 1000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.Map.Entry entry : com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265744b.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            jz5.o oVar = (jz5.o) ((java.lang.ref.SoftReference) entry.getValue()).get();
            if (oVar != null && java.lang.System.currentTimeMillis() - ((java.lang.Number) oVar.f384376f).longValue() >= Ni) {
                arrayList.add(str);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.k.f265743a.c((java.lang.String) it.next());
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.g
    public void b() {
    }
}
