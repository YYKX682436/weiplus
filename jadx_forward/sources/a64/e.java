package a64;

/* loaded from: classes4.dex */
public class e extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public int f83291d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f83292e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f83293f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f83294g;

    /* renamed from: h, reason: collision with root package name */
    public int f83295h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f83296i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f83297m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f83291d = -1;
        this.f83293f = "";
        this.f83296i = jz5.h.b(new a64.d(this));
        this.f83297m = jz5.h.b(new a64.c(this));
    }

    public final boolean O6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCanScrollToTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        boolean z17 = this.f83294g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCanScrollToTop", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        return z17;
    }

    public final boolean P6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        boolean z17 = this.f83292e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isHalfScreen", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        return z17;
    }

    public final android.view.View h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRoot", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f83296i).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.view.View view = (android.view.View) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRoot", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
        this.f83291d = m158359x1e885992().getIntExtra("click_action_type", -1);
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("ad_uxInfo");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f83293f = stringExtra;
        boolean z17 = false;
        this.f83295h = m158359x1e885992().getIntExtra("ad_source", 0);
        boolean z18 = m158359x1e885992().getIntExtra(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13303xfe2b0e92, 0) == 1;
        this.f83292e = z18;
        if (z18 && m158359x1e885992().getIntExtra("scroll_to_top", 0) == 1) {
            z17 = true;
        }
        this.f83294g = z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdBaseGeneralPageUIC");
    }
}
