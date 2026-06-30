package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public class y3 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd.b f221315a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f221316b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3 f221317c;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.x3 x3Var, sd.b bVar, org.json.JSONObject jSONObject) {
        this.f221317c = x3Var;
        this.f221315a = bVar;
        this.f221316b = jSONObject;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        sd.b bVar = this.f221315a;
        if (jSONObject == null) {
            bVar.c(str, null);
            return;
        }
        bVar.e(jSONObject);
        java.lang.String optString = jSONObject.optString(dm.i4.f66867x2a5c95c7);
        this.f221317c.getClass();
        org.json.JSONObject jSONObject2 = this.f221316b;
        if (jSONObject2 == null) {
            return;
        }
        com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256 c11126xa77ef256 = new com.p314xaae8f345.mm.p954x7e3e6bb0.C11126xa77ef256(jSONObject2.optString("url", ""), 1);
        ((m11.z0) ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).Ri()).getClass();
        c11126xa77ef256.m48138x9616526c();
        m11.z0.f404347a.C(optString, c11126xa77ef256);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
