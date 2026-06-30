package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class t4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f263996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263997e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f263998f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 f263999g;

    public t4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 z4Var, org.json.JSONObject jSONObject, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f263999g = z4Var;
        this.f263996d = jSONObject;
        this.f263997e = str;
        this.f263998f = k0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG;
        java.lang.String str = this.f263997e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.z4 z4Var = this.f263999g;
        org.json.JSONObject jSONObject = this.f263996d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = z4Var.f264074g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var2 = j4Var.f263893e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = z4Var.f264072e;
            android.content.Context context = z4Var.f264073f;
            if (f5Var2 == f5Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.g(j4Var, context, jSONObject, str, q5Var);
            } else {
                if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.h(j4Var, context, jSONObject, q5Var, false)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.g(z4Var.f264074g, context, jSONObject, str, q5Var);
                }
                com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20, 2001, 2, 2, 0, this.f263997e);
            }
        } else if (itemId == 2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var2 = z4Var.f264074g;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var3 = j4Var2.f263893e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var2 = z4Var.f264072e;
            android.content.Context context2 = z4Var.f264073f;
            if (f5Var3 == f5Var) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.i(j4Var2, context2, jSONObject, str, q5Var2);
            } else if (!com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.h(j4Var2, context2, jSONObject, q5Var2, true)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.i(z4Var.f264074g, context2, jSONObject, str, q5Var2);
            }
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 20, 2001, 3, 2, 0, this.f263997e);
        } else {
            z4Var.f264074g.getClass();
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(dm.i4.f66865x76d1ec5a, itemId - 1000);
            } catch (org.json.JSONException unused) {
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var3 = z4Var.f264072e;
            q5Var3.b("onShareCustomMenuItemClick", jSONObject2);
            q5Var3.a(null, null);
        }
        this.f263998f.u();
    }
}
