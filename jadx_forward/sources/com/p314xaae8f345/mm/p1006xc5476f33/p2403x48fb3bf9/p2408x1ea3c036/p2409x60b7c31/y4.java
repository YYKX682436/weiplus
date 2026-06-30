package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class y4 implements uw4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f264057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 f264059c;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 z4Var, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f264059c = z4Var;
        this.f264057a = jSONObject;
        this.f264058b = str;
    }

    @Override // uw4.o
    public void a(java.lang.String str, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 z4Var = this.f264059c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = z4Var.f264074g;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var = j4Var.f263893e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG;
        org.json.JSONObject jSONObject2 = this.f264057a;
        if (f5Var == f5Var2) {
            j4Var.k(jSONObject2, z4Var.f264073f, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.w4(this, str));
        } else {
            org.json.JSONObject optJSONObject = jSONObject2.optJSONObject("friend");
            if (optJSONObject != null) {
                uw4.u.b(z4Var.f264073f, str, optJSONObject.optString("link"), optJSONObject, z4Var.f264072e, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.x4(this));
            }
        }
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20, 2001, 2, 2, 0, this.f264058b);
    }
}
