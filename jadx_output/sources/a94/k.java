package a94;

/* loaded from: classes4.dex */
public class k implements l44.r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView f2456a;

    public k(com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView) {
        this.f2456a = gLCardAnimView;
    }

    @Override // l44.r5
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.f163810z;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView gLCardAnimView = this.f2456a;
        gLCardAnimView.f163818x = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView");
        if (com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.h(gLCardAnimView) != null) {
            ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0) com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.h(gLCardAnimView)).a();
        }
        com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView.i(gLCardAnimView, 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
    }

    @Override // l44.r5
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.GLCardAnimView$4");
    }
}
