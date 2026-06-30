package a64;

/* loaded from: classes4.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f83287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a64.b f83288e;

    public a(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, a64.b bVar) {
        this.f83287d = abstractActivityC21394xb3d2c0cf;
        this.f83288e = bVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMenuItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC$configActionBar$1$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f83287d;
        abstractActivityC21394xb3d2c0cf.mo48674x36654fab();
        if (!this.f83288e.P6()) {
            abstractActivityC21394xb3d2c0cf.finish();
            abstractActivityC21394xb3d2c0cf.overridePendingTransition(0, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMenuItemClick", "com.tencent.mm.plugin.sns.ad.landingpage.ui.uic.AdActionBarUIC$configActionBar$1$1");
        return true;
    }
}
