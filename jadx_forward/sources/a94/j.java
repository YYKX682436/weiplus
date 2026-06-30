package a94;

/* loaded from: classes4.dex */
public class j extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b f83988e;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b) {
        this.f83988e = c17810x696dfd0b;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b c17810x696dfd0b = this.f83988e;
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b.h(c17810x696dfd0b) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GLCardAnimView", "onPrepareCard");
            ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.e0) com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2150x7a6db1a9.C17810x696dfd0b.h(c17810x696dfd0b)).b();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        android.view.View view = c17810x696dfd0b.f245348u;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (view == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GLCardAnimView", "playMainCardAnim, targetView==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new a94.i(this), 100L);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$3");
        }
    }
}
