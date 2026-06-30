package e94;

/* loaded from: classes4.dex */
public class w implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e94.x f331924d;

    public w(e94.x xVar) {
        this.f331924d = xVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1$1");
        e94.x xVar = this.f331924d;
        xVar.f331925d.f245482t = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        xVar.f331925d.invalidate();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAnimationUpdate", "com.tencent.mm.plugin.sns.ad.widget.twistad.TwistDegreeView$1$1");
    }
}
