package e84;

/* loaded from: classes4.dex */
public final class c implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e84.t f331792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 f331793e;

    public c(e84.t tVar, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        this.f331792d = tVar;
        this.f331793e = c17933xe8d1b226;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        l44.e0 e0Var = (l44.e0) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        e84.t tVar = this.f331792d;
        java.lang.String j17 = tVar.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("interactType is ");
        sb6.append(e0Var);
        sb6.append(", model snsId is ");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = this.f331793e;
        sb6.append(c17933xe8d1b226.m70367x7525eefd());
        sb6.append(", snsIdStr is ");
        sb6.append(ca4.z0.t0(c17933xe8d1b226.f68891x29d1292e));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17, sb6.toString());
        if (e0Var == l44.e0.f397636q) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            android.animation.AnimatorSet animatorSet = tVar.L;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(tVar.J(), "alpha", 0.0f, 1.0f);
            android.view.animation.PathInterpolator pathInterpolator = tVar.f331814J;
            ofFloat.setInterpolator(pathInterpolator);
            ofFloat.setDuration(700L);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(tVar.I(), "alpha", 0.0f, 1.0f);
            ofFloat2.setInterpolator(pathInterpolator);
            ofFloat2.setDuration(700L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) tVar.E).mo141623x754a37bb();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMActionBtnLayout", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(viewGroup, "translationX", tVar.K, 0.0f);
            ofFloat3.setInterpolator(pathInterpolator);
            ofFloat3.setDuration(700L);
            android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(tVar.I(), "translationX", tVar.K, 0.0f);
            ofFloat4.setInterpolator(pathInterpolator);
            ofFloat4.setDuration(700L);
            android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
            tVar.L = animatorSet2;
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4);
            android.animation.AnimatorSet animatorSet3 = tVar.L;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new e84.b(tVar));
            }
            android.animation.AnimatorSet animatorSet4 = tVar.L;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tVar.j(), "doProductBarAnim");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$doProductBarAnim", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("emit", "com.tencent.mm.plugin.sns.ad.widget.adSingleProduct.AdSingleProductComponent$handlePAGAnimEndNotify$1$1$1");
        return f0Var;
    }
}
