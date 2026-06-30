package e94;

/* loaded from: classes4.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17822xa8f63df8 f331925d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44.p2153xc961358a.C17822xa8f63df8 c17822xa8f63df8) {
        this.f331925d = c17822xa8f63df8;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1");
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(this.f331925d.f245482t, 0.9f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new e94.w(this));
        ofFloat.start();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1");
    }
}
