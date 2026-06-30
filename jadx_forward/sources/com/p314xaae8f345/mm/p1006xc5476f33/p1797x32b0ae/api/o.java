package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api;

/* loaded from: classes14.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public jd.c f224973a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f224974b = null;

    public void a(java.lang.String str) {
        jd.c cVar = this.f224973a;
        if (cVar != null) {
            cVar.c(str, null, false);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab c16189x298f2fab = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab();
        c16189x298f2fab.f224939d = false;
        c16189x298f2fab.f224940e = false;
        c16189x298f2fab.f224941f = str;
        this.f224974b.a(c16189x298f2fab);
    }

    public void b(java.util.Map map) {
        c(new org.json.JSONObject(map), false);
    }

    public void c(org.json.JSONObject jSONObject, boolean z17) {
        jd.c cVar = this.f224973a;
        if (cVar != null) {
            cVar.f(jSONObject, z17);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab c16189x298f2fab = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.C16189x298f2fab();
        c16189x298f2fab.f224939d = true;
        c16189x298f2fab.f224940e = z17;
        if (jSONObject != null) {
            c16189x298f2fab.f224942g = jSONObject.toString();
        }
        this.f224974b.a(c16189x298f2fab);
    }

    public void d(boolean z17) {
        c(new org.json.JSONObject(), z17);
    }
}
