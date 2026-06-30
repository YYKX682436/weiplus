package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes8.dex */
public class p4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263968d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 f263969e;

    public p4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var, sd.b bVar) {
        this.f263969e = j4Var;
        this.f263968d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.b bVar = this.f263968d;
        org.json.JSONObject jSONObject = bVar.f488130b.f426039c;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4 j4Var = this.f263969e;
        j4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_LINK;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5 f5Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.f5.GAME_SHARE_TYPE_IMG;
        if (jSONObject != null && jSONObject.optString("shareType", "link").equals("image")) {
            f5Var = f5Var2;
        }
        j4Var.f263893e = f5Var;
        if (f5Var != f5Var2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.j4.f(j4Var, bVar);
            return;
        }
        zb0.b0 b0Var = (zb0.b0) i95.n0.c(zb0.b0.class);
        android.content.Context mo64555x76847179 = ((sd.a) bVar.f488129a).mo64555x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.k4(this);
        ((yb0.g) b0Var).getClass();
        com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.l(mo64555x76847179, k4Var);
    }
}
