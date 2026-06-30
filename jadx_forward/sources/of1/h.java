package of1;

/* loaded from: classes8.dex */
public class h implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.m f426460d;

    public h(of1.m mVar) {
        this.f426460d = mVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17;
        of1.m mVar = this.f426460d;
        try {
            z17 = mVar.f426415f.mo74369xe8158c5e();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
            z17 = false;
        }
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick saveImage2SD with url[%s]", mVar.f426500n);
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.m(mVar.a(), mVar.f426500n, mVar.b(), com.p314xaae8f345.p3210x3857dc.d.g().a(mVar.f426500n), z17, null);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "save to sdcard failed : %s", e18.getMessage());
        }
        return true;
    }
}
