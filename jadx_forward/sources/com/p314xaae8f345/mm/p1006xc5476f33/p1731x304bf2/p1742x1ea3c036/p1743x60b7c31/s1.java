package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes.dex */
public class s1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "launchGameVideoEditor";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public int c() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void d(android.content.Context context, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.r5
    public void e(sd.b bVar) {
        java.lang.String optString = bVar.f488130b.f426039c.optString("videoUrl");
        java.lang.String optString2 = bVar.f488130b.f426039c.optString("thumbUrl");
        java.lang.String optString3 = bVar.f488130b.f426039c.optString("appId");
        int optInt = bVar.f488130b.f426039c.optInt("sourceSceneId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            bVar.c("invalid_videoUrl", null);
            return;
        }
        m33.v1 v1Var = (m33.v1) i95.n0.c(m33.v1.class);
        android.content.Context context = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488143d;
        ((i53.x3) v1Var).getClass();
        i53.x3.wi(context, 5, null, optString3, null, optString, optString2, true, null, ac1.g.f19x366c91de, null, optInt);
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) bVar.f488129a).f488143d).m78545xde66c1f2(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.r1(this, bVar));
    }
}
