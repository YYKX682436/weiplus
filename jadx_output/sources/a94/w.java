package a94;

/* loaded from: classes4.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView f2466d;

    public w(com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView shakeCoverView) {
        this.f2466d = shakeCoverView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$6");
        com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView.a(this.f2466d).n();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.widget.shakead.ShakeCoverView$6");
    }
}
