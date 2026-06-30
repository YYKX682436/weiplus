package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b;

/* loaded from: classes7.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f265756d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.v f265757e;

    public u(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.v vVar) {
        this.f265756d = abstractActivityC21394xb3d2c0cf;
        this.f265757e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f265756d;
        if (abstractActivityC21394xb3d2c0cf.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2423x822d9a5b.v vVar = this.f265757e;
        if (vVar.f265758a) {
            if (vVar.f265760c) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewFloatBallEduHelper", "updateEduViewWhenConfigurationChanged disableEduView");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12915xed9c02f9 c12915xed9c02f9 = vVar.f265759b;
            if (c12915xed9c02f9 != null && c12915xed9c02f9.getVisibility() == 0) {
                vVar.b(abstractActivityC21394xb3d2c0cf, false, null);
            }
        }
    }
}
