package ud4;

/* loaded from: classes13.dex */
public class x extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f508286d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2217x5e9bb8.C18379xb7ff44a c18379xb7ff44a, android.view.View view) {
        this.f508286d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$2");
        this.f508286d.setLayerType(0, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ui.previewimageview.DynamicGridView$2");
    }
}
