package c54;

/* loaded from: classes4.dex */
public final class l implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c54.k f38711d;

    public l(c54.k kVar) {
        this.f38711d = kVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.Object m521constructorimpl;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$adapterHalfScreenHeight$3");
        c54.k kVar = this.f38711d;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            kVar.k().getViewTreeObserver().removeOnPreDrawListener(this);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            ca4.q.c("catching_tag", kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl));
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
        if (kVar.i().getWidth() == kVar.j().getWidth()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$adapterHalfScreenHeight$3");
            return true;
        }
        if (kVar.i().getWidth() > kVar.j().getWidth()) {
            ca4.m0.l0(kVar.j(), kVar.i().getWidth());
        } else {
            ca4.m0.l0(kVar.i(), kVar.j().getWidth());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onPreDraw", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.halfeggcard.HalfEggCardLayoutBuilder$adapterHalfScreenHeight$3");
        return true;
    }
}
