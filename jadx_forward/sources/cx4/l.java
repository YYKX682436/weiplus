package cx4;

/* loaded from: classes5.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f306159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f306160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f306164i;

    public l(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, cx4.m mVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f306159d = c27816xac2547f9;
        this.f306160e = mVar;
        this.f306161f = str;
        this.f306162g = str2;
        this.f306163h = str3;
        this.f306164i = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f306159d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c27816xac2547f9 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) c27816xac2547f9 : null;
            boolean z17 = false;
            if (c22633x83752a59 != null && c22633x83752a59.f292909y) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306160e.f306167a, "doReportWeCLIPV2Result cancel: onPageFinished webview has destroyed");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1653L, 35L, 1L, false);
            android.graphics.Bitmap m120139x12501425 = this.f306159d.m120139x12501425();
            if (m120139x12501425 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306160e.f306167a, "doReportWeCLIPV2Result cancel: bitmap is null");
                return;
            }
            java.lang.String mo120156xb5887639 = this.f306159d.mo120156xb5887639();
            if (mo120156xb5887639 == null) {
                mo120156xb5887639 = this.f306161f;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new cx4.k(m120139x12501425, this.f306160e, mo120156xb5887639, this.f306162g, this.f306163h, this.f306164i), "WebViewKeyWordAuditReport");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f306160e.f306167a, "doReportWeCLIPV2Result uiDelay error: " + e17.getMessage(), e17);
        }
    }
}
