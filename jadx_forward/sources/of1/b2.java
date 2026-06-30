package of1;

/* loaded from: classes8.dex */
public class b2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f426426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ of1.m2 f426427e;

    public b2(of1.m2 m2Var, android.os.Bundle bundle) {
        this.f426427e = m2Var;
        this.f426426d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        android.os.Bundle bundle = this.f426426d;
        boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
        of1.m2 m2Var = this.f426427e;
        if (!containsKey || (wVar = m2Var.f426509f) == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(m2Var.f426509f != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMDefaultWebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
        } else {
            wVar.i(bundle);
        }
        nw4.n nVar = m2Var.f426508e;
        if (nVar != null) {
            nVar.q();
        }
    }
}
