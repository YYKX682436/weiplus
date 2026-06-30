package a94;

/* loaded from: classes4.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView f2462d;

    public r(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView) {
        this.f2462d = shakeCoverView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$1");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView = this.f2462d;
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.a(shakeCoverView).setPath("assets://sns/sns_ad_shake_icon_anim.pag");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.a(shakeCoverView).setScaleMode(3);
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.a(shakeCoverView).setRepeatCount(0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$1");
    }
}
