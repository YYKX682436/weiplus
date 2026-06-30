package of1;

/* loaded from: classes8.dex */
public class i implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ of1.j f426469a;

    public i(of1.j jVar) {
        this.f426469a = jVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.g9
    public void a(java.lang.String str) {
        of1.m mVar = this.f426469a.f426476d;
        mVar.getClass();
        try {
            if (mVar.f426415f.Sg(str) == 0) {
                dp.a.m125854x26a183b(mVar.a(), mVar.a().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbq), 0).show();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.HTMLViewScanHelper", "favoriteUrl fail, ex = " + e17.getMessage());
        }
    }
}
