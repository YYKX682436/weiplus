package a94;

/* loaded from: classes4.dex */
public class f implements l44.r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView f2451a;

    public f(com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView) {
        this.f2451a = cardAnimView;
    }

    @Override // l44.r5
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
        int i17 = com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.f163800p;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView cardAnimView = this.f2451a;
        cardAnimView.f163808n = false;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$302", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView");
        if (com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.a(cardAnimView) != null) {
            ((com.tencent.mm.plugin.sns.ad.landingpage.helper.anim.e0) com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.a(cardAnimView)).a();
        }
        com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView.b(cardAnimView, 4);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlipEnd", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
    }

    @Override // l44.r5
    public void b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onFlipStart", "com.tencent.mm.plugin.sns.ad.widget.shakead.CardAnimView$4");
    }
}
