package cx4;

/* loaded from: classes5.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 f306131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx4.m f306132e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f306134g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f306135h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f306136i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f306137m;

    public g(com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9, cx4.m mVar, java.lang.String str, int i17, int i18, java.lang.String str2, int i19) {
        this.f306131d = c27816xac2547f9;
        this.f306132e = mVar;
        this.f306133f = str;
        this.f306134g = i17;
        this.f306135h = i18;
        this.f306136i = str2;
        this.f306137m = i19;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 c27816xac2547f9 = this.f306131d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c27816xac2547f9 instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59) c27816xac2547f9 : null;
        boolean z17 = false;
        if (c22633x83752a59 != null && c22633x83752a59.f292909y) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f306132e.f306167a, "onPageFinished webview has destroyed");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1653L, 33L, 1L, false);
            c27816xac2547f9.mo14660x738236e6("document.documentElement.innerHTML", new cx4.f(this.f306132e, this.f306133f, this.f306134g, this.f306135h, this.f306136i, this.f306137m));
        }
    }
}
