package a64;

/* loaded from: classes4.dex */
public final class o extends a64.e {

    /* renamed from: n, reason: collision with root package name */
    public final a64.m f83326n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f83326n = new a64.m(0, 0, 0, 0, 0, 0, 0, 0, 0, 511, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateAfter", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
        super.mo739xfd763ae1(bundle);
        android.view.ViewTreeObserver viewTreeObserver = h().getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a64.n(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateAfter", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdPageUIDataUIC");
    }
}
