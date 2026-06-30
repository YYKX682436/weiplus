package a94;

/* loaded from: classes4.dex */
public class h extends c84.f {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t84.c f2453e;

    public h(com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView, t84.c cVar) {
        this.f2453e = cVar;
    }

    @Override // c84.f, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$2");
        t84.c cVar = this.f2453e;
        cVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        cVar.f416439t = 0;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVisibility", "com.tencent.mm.plugin.sns.ad.widget.gllib.GLDrawable");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onAnimationStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$2");
    }
}
