package ck1;

/* loaded from: classes4.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck1.k0 f123844d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f123845e;

    public d(ck1.k0 k0Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        this.f123844d = k0Var;
        this.f123845e = c1162x665295de;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int x17 = this.f123845e.x();
        ck1.k0 k0Var = this.f123844d;
        boolean z17 = x17 >= k0Var.mo1894x7e414b06() - 1;
        k0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "configManageArea, fixAtScreenBottom: " + z17);
        if (k0Var.f123872e == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUserInfoRevokePage", "configManageArea, curUsageInfo is null");
        } else {
            k0Var.f123874g = java.lang.Boolean.valueOf(z17);
            k0Var.m8147xed6e4d18(r0.f123893a - 1);
        }
    }
}
