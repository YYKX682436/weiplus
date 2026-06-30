package d94;

/* loaded from: classes4.dex */
public class h extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f309096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d94.i f309097f;

    public h(d94.i iVar, android.view.View view) {
        this.f309097f = iVar;
        this.f309096e = view;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator$1");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        d94.i iVar = this.f309097f;
        java.util.LinkedList linkedList = iVar.f309099b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        android.view.View view = this.f309096e;
        linkedList.remove(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        java.util.LinkedList linkedList2 = iVar.f309100c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator");
        linkedList2.offerFirst(view);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationEnd", "com.tencent.mm.plugin.sns.ad.widget.touchparticle.ParticleGenerator$1");
    }
}
