package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f246877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 f246878e;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 v0Var, int i17) {
        this.f246878e = v0Var;
        this.f246877d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$8");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v0 v0Var = this.f246878e;
        android.view.View view = v0Var.f246589n;
        if (view != null && (i17 = this.f246877d) >= 0) {
            try {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int o17 = (int) za4.z0.o(i17, 1, 750, 1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdLandingNewH5Comp", "adJuestHeight, curH=" + layoutParams.height + ", newH=" + i17 + ", newPx=" + o17);
                if (layoutParams.height != o17) {
                    ((ab4.v0) v0Var.y()).f84357n = o17;
                    v0Var.g();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdLandingNewH5Comp", "adJuestHeight exp=" + e17.toString());
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$8");
    }
}
