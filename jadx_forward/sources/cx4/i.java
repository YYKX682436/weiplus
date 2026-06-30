package cx4;

/* loaded from: classes5.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f306145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f306146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f306149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306150i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f306151m;

    public i(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f306145d = c27816xac2547f9;
        this.f306146e = mVar;
        this.f306147f = str;
        this.f306148g = i17;
        this.f306149h = i18;
        this.f306150i = str2;
        this.f306151m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f306145d;
        android.graphics.Bitmap bitmap = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c27816xac2547f9 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) c27816xac2547f9 : null;
        boolean z17 = false;
        if (c22633x83752a59 != null && c22633x83752a59.f292909y) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306146e.f306167a, "doReportCaptureOCRResult cancel: onPageFinished webview has destroyed");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1653L, 34L, 1L, false);
        try {
            bitmap = this.f306145d.m120139x12501425();
        } catch (java.lang.Exception unused) {
        }
        android.graphics.Bitmap bitmap2 = bitmap;
        if (bitmap2 == null) {
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).h(new cx4.h(bitmap2, this.f306146e, this.f306147f, this.f306148g, this.f306149h, this.f306150i, this.f306151m), "WebViewKeyWordAuditReport");
    }
}
