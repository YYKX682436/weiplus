package of1;

/* loaded from: classes8.dex */
public class g implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.m f426449d;

    public g(of1.m mVar) {
        this.f426449d = mVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        of1.m mVar = this.f426449d;
        try {
            boolean mo74369xe8158c5e = mVar.f426415f.mo74369xe8158c5e();
            zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
            android.content.Context a17 = mVar.a();
            java.lang.String str = mVar.f426500n;
            java.lang.String a18 = com.p314xaae8f345.p3210x3857dc.d.g().a(mVar.f426500n);
            of1.f fVar = new of1.f(this);
            ((yg0.s4) q3Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.h(a17, str, a18, mo74369xe8158c5e, fVar);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
            return true;
        }
    }
}
