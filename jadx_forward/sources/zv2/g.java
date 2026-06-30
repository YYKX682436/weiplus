package zv2;

/* loaded from: classes10.dex */
public final class g implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zv2.m f557937a;

    public g(zv2.m mVar) {
        this.f557937a = mVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        zv2.m mVar = this.f557937a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderChooseProductWidget", "onReceiveValue value" + str);
        try {
            so2.x4 x4Var = so2.z4.f492265k;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            so2.z4 a17 = x4Var.a(str, so2.a5.f491787d);
            mVar.f557930f = a17 != null ? a17.a() : null;
            mVar.f557952r = a17 != null ? a17.f492275j : null;
            mVar.f557945h = a17 != null ? a17.f492266a : null;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.FinderChooseProductWidget", th6, "", new java.lang.Object[0]);
            mVar.f557930f = null;
        }
        mVar.i(mVar.f557930f);
    }
}
