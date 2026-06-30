package b94;

/* loaded from: classes4.dex */
public final class b implements b94.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic f18616a;

    public b(com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic) {
        this.f18616a = commonShakeLogic;
    }

    @Override // b94.d
    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$mInnerShakeListener$1");
        com.tencent.mars.xlog.Log.e("CommonShakeLogic", "onShake, hash=" + hashCode());
        ca4.z0.I0(new long[]{0, 80});
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMOnShakeListener$p", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic commonShakeLogic = this.f18616a;
        b94.d dVar = commonShakeLogic.f163861h;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMOnShakeListener$p", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        if (dVar != null) {
            dVar.a();
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setMIsShakeSuccessOnce$p", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        commonShakeLogic.f163870t = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setMIsShakeSuccessOnce$p", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$reportShakeResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        commonShakeLogic.k(1);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$reportShakeResult", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onShake", "com.tencent.mm.plugin.sns.ad.widget.shakead.bidding.CommonShakeLogic$mInnerShakeListener$1");
    }
}
