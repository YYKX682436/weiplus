package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f;

/* loaded from: classes8.dex */
class g implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private g() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("icon_url");
        java.lang.String string2 = bundle.getString("page_url");
        java.lang.String string3 = bundle.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2410x33155f.f(this, rVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string3) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewShortcutManager", "url is null");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a5.b(fVar, false);
            return;
        }
        android.content.Intent a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.a5.a(null, string2, string3, false);
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((zd0.e) hVar).getClass();
        xp1.c.i(context, a17);
        n11.a.b().m(string, null, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y4(string2, string3, fVar));
    }
}
