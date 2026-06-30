package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f269142d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 f269143e;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var, android.os.Bundle bundle) {
        this.f269143e = p3Var;
        this.f269142d = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar;
        android.os.Bundle bundle = this.f269142d;
        boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p3 p3Var = this.f269143e;
        if (!containsKey || (wVar = p3Var.f269028f.f269085e) == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(p3Var.f269028f.f269085e != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMWebViewClient", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
        } else {
            wVar.i(bundle);
        }
        nw4.n nVar = p3Var.f269028f.f269087g;
        if (nVar != null) {
            nVar.q();
        }
    }
}
