package a84;

/* loaded from: classes4.dex */
public class k implements com.tencent.mm.plugin.sns.model.h0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f2323d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f2324e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f2325f;

    /* renamed from: g, reason: collision with root package name */
    public final za4.e0 f2326g;

    public k(java.lang.String str, java.lang.String str2, java.lang.String str3, za4.e0 e0Var) {
        this.f2323d = str;
        this.f2326g = e0Var;
        this.f2324e = str2;
        this.f2325f = str3;
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onImageFinish(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str, this.f2323d) && str.equals(this.f2323d)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "onImageFinish, mediaId=" + str + ", isOk=" + z17);
            com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
            if (this.f2326g == null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
                return;
            }
            ((ku5.t0) ku5.t0.f312615d).B(new a84.j(this, z17));
            if (z17) {
                n74.t.b(0, 0, 1, this.f2325f);
                m44.d.d("AdCdnImageLoaderMM", this.f2325f, this.f2324e);
            } else {
                n74.t.b(1, 0, 1, this.f2325f);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onImageFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSetbg(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSetbg", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onSightFinish(java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        java.lang.String str2 = this.f2323d;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2) && str.equals(str2)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "onSightFinish, mediaId=" + str + ", isOk=" + z17);
            com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSightFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }

    @Override // com.tencent.mm.plugin.sns.model.h0
    public void onThumbFinish(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
        java.lang.String str2 = this.f2323d;
        if (!com.tencent.mm.sdk.platformtools.t8.N0(str, str2) && str.equals(str2)) {
            com.tencent.mars.xlog.Log.i("SnsAd.AdCdnImageLoaderMM", "onThumbFinish, mediaId=".concat(str));
            com.tencent.mm.plugin.sns.model.l4.Cj().v(this);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onThumbFinish", "com.tencent.mm.plugin.sns.ad.utils.AdCdnImageLoaderMM$CDNMediaDownloadListener");
    }
}
