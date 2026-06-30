package ce;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.page.w2 {
    public com.tencent.mm.plugin.appbrand.page.v5 W;

    /* renamed from: p0, reason: collision with root package name */
    public java.lang.String f40671p0;

    public h(android.content.Context context, com.tencent.mm.plugin.appbrand.page.i3 i3Var) {
        super(context, i3Var);
        setForceDisableMeasureCache(true);
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGamePage", "hy: WAGamePage on create");
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void C(long j17, java.lang.String str, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        this.f40671p0 = str;
        this.W.r2(j17, str, wdVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void E() {
        getCurrentUrl();
        this.W.v2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void F() {
        getCurrentUrl();
        this.W.A2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void G() {
        getCurrentUrl();
        L();
        setVisibility(0);
        setEnableGesture(this.W.o2());
        this.W.C2();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 getCurrentPageView() {
        return this.W;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public java.lang.String getCurrentUrl() {
        return this.f40671p0;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void k() {
        this.W.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public android.view.View p() {
        if (this.W == null) {
            com.tencent.mm.plugin.appbrand.page.v5 o17 = getContainer().o(this.f40671p0);
            this.W = o17;
            o17.W = this;
            java.lang.String currentUrl = getCurrentUrl();
            o17.D = nf.z.a(currentUrl);
            o17.E = currentUrl;
        }
        return this.W.getContentView();
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void r(java.lang.String str, java.lang.String str2, int[] iArr) {
        this.W.g(str, str2);
    }

    public void setCurrentUrl(java.lang.String str) {
        this.f40671p0 = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public void setInitialUrl(java.lang.String str) {
        this.f40671p0 = str;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public com.tencent.mm.plugin.appbrand.page.v5 u(int i17) {
        if (this.W.getComponentId() == i17) {
            return this.W;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.w2
    public boolean x(java.lang.String str) {
        return true;
    }
}
