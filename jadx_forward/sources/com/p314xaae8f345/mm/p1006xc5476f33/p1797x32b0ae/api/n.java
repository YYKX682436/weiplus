package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api;

/* loaded from: classes14.dex */
public class n implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p f224972d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar) {
        this.f224972d = pVar;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab c16189x298f2fab = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab) obj;
        boolean z17 = c16189x298f2fab.f224939d;
        org.json.JSONObject jSONObject = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p pVar = this.f224972d;
        if (!z17) {
            pVar.f224975e.c(c16189x298f2fab.f224941f, null, c16189x298f2fab.f224940e);
            return;
        }
        jd.c cVar = pVar.f224975e;
        if (c16189x298f2fab.f224942g != null) {
            try {
                jSONObject = new org.json.JSONObject(c16189x298f2fab.f224942g);
            } catch (org.json.JSONException unused) {
            }
        }
        cVar.f(jSONObject, c16189x298f2fab.f224940e);
    }
}
