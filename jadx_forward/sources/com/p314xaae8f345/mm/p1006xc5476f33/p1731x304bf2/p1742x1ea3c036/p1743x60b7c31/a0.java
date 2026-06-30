package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes8.dex */
public final class a0 implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f f221117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.b0 f221118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221119c;

    public a0(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f c5862x6c491c8f, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.b0 b0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
        this.f221117a = c5862x6c491c8f;
        this.f221118b = b0Var;
        this.f221119c = q5Var;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5862x6c491c8f c5862x6c491c8f = this.f221117a;
        u53.u uVar = (u53.u) map.get(c5862x6c491c8f.f136169g.f88017c);
        this.f221118b.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = uVar != null ? ((y53.m) uVar).f67427x81118851 : null;
        objArr[1] = c5862x6c491c8f.f136169g.f88016b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("fetchGameCenterEntranceInfo", "gameLifeEvent isShow = true iconUrl:%s , wording:%s", objArr);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("iconUrl", uVar != null ? ((y53.m) uVar).f67427x81118851 : null);
        jSONObject.put("wording", c5862x6c491c8f.f136169g.f88016b);
        jSONObject.put("unReadCount", c5862x6c491c8f.f136169g.f88018d);
        jSONObject.put("msgType", 3);
        this.f221119c.a(null, jSONObject);
    }
}
