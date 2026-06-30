package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes4.dex */
public class h implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221855d;

    public h(java.lang.String str) {
        this.f221855d = str;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        java.lang.String str2 = this.f221855d;
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommOpertionProcessor", "pull menu data fail. appid:%s", str2);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommOpertionProcessor", "pull menu data success. appid:%s", str2);
        gm0.j1.d().q(1369, this);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.g(this, (r45.dv3) ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.i3) m1Var).f221872e.f152244b.f152233a));
    }
}
