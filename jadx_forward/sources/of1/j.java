package of1;

/* loaded from: classes8.dex */
public class j implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ of1.m f426476d;

    public j(of1.m mVar) {
        this.f426476d = mVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        of1.m mVar = this.f426476d;
        try {
            boolean mo74369xe8158c5e = mVar.f426415f.mo74369xe8158c5e();
            java.lang.String replaceAll = mVar.f426500n.replaceAll("tp=webp", "");
            zg0.q3 q3Var = (zg0.q3) i95.n0.c(zg0.q3.class);
            android.content.Context a17 = mVar.a();
            java.lang.String a18 = com.p314xaae8f345.p3210x3857dc.d.g().a(replaceAll);
            of1.i iVar = new of1.i(this);
            ((yg0.s4) q3Var).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.e9.h(a17, replaceAll, a18, mo74369xe8158c5e, iVar);
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "onMenuItemClick fail, ex = " + e17.getMessage());
            return true;
        }
    }
}
