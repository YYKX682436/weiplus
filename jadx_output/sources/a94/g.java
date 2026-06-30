package a94;

/* loaded from: classes4.dex */
public class g extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t84.c f2452e;

    public g(com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView, t84.c cVar) {
        this.f2452e = cVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$1");
        t84.c cVar = this.f2452e;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        cVar.f416439t = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$1");
    }
}
