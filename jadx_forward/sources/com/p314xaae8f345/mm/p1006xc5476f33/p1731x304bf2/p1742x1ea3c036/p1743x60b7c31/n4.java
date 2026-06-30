package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

@mk0.a
/* loaded from: classes.dex */
class n4 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    private n4() {
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.Long valueOf = java.lang.Long.valueOf(bundle.getLong("appUuid"));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(bundle.getLong("pageId"));
        java.lang.String string = bundle.getString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        try {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).Uj(valueOf.longValue(), valueOf2.longValue(), "app.postmessage", new org.json.JSONObject(string));
            rVar.a(null);
        } catch (org.json.JSONException unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSendMessageToLiteApp", "json exception %s", string);
        }
    }
}
