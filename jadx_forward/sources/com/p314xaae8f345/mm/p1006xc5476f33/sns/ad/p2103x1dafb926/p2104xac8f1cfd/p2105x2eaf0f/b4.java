package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f;

/* loaded from: classes4.dex */
public class b4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f54.g0 f244298d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g4 f244299e;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g4 g4Var, f54.g0 g0Var) {
        this.f244299e = g4Var;
        this.f244298d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.g4 g4Var = this.f244299e;
        java.util.ArrayList arrayList = this.f244298d.K;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        g4Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("checkFriends", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            java.lang.String m69910xdcb2fc68 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69910xdcb2fc68(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "checkFriends, hashUserName=" + str + ", realUserName=" + m69910xdcb2fc68);
            if (!android.text.TextUtils.isEmpty(m69910xdcb2fc68)) {
                arrayList2.add(m69910xdcb2fc68);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("checkFriends", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent");
        if (arrayList2.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdLandingSocialCardComponent", "friends is empty");
        } else {
            this.f244299e.D = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingSocialCardComponent", "uiType=" + this.f244299e.D);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2104xac8f1cfd.p2105x2eaf0f.a4(this, arrayList2));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingSocialCardComponent$1");
    }
}
