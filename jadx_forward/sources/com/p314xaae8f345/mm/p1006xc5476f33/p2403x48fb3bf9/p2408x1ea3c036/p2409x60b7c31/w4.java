package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class w4 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264032a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y4 f264033b;

    public w4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.y4 y4Var, java.lang.String str) {
        this.f264033b = y4Var;
        this.f264032a = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || jSONObject == null) {
            this.f264033b.f264059c.f264072e.a(str, null);
            return;
        }
        this.f264033b.f264059c.f264074g.f263894f = jSONObject.optString("imgPath");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f264033b.f264059c.f264074g.f263894f)) {
            this.f264033b.f264059c.f264072e.a("imgPath is null", null);
            return;
        }
        android.graphics.Bitmap j07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(this.f264033b.f264059c.f264074g.f263894f, 140, 140, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.v4(this, j07));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5
    public void b(java.lang.String str, org.json.JSONObject jSONObject) {
    }
}
