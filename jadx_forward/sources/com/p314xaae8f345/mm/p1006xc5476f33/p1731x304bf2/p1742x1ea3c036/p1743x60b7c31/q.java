package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes.dex */
class q implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private q() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("appId");
        java.lang.String string2 = bundle.getString("keys");
        if (bundle.getBoolean("clearAllData")) {
            ew4.c.c().d().y0(string);
        } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string2)) {
            try {
                ew4.c.c().d().z0(string, new org.json.JSONArray(string2));
            } catch (org.json.JSONException unused) {
            }
        }
        rVar.a(null);
    }
}
