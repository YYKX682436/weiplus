package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public class e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f2 f264383e;

    public e2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f2 f2Var, int i17) {
        this.f264383e = f2Var;
        this.f264382d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f264382d;
        hy4.b bVar = hy4.b.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f2 f2Var = this.f264383e;
        if (i17 == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) f2Var.f264407b.f264423c).d();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g2 g2Var = f2Var.f264407b;
            java.lang.String str = g2Var.f264422b;
            bVar.a(str == null ? "" : str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 0, 1, 0, 1, g2Var.f264424d);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g2 g2Var2 = f2Var.f264407b;
            java.lang.String str2 = g2Var2.f264422b;
            bVar.a(str2 == null ? "" : str2, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 1, 1, 0, 1, g2Var2.f264424d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.g2 g2Var3 = f2Var.f264407b;
            android.os.Bundle bundle = g2Var3.f264425e;
            android.os.Bundle bundle2 = f2Var.f264406a;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.l2 l2Var = g2Var3.f264423c;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.v0 v0Var = g2Var3.f264426f;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.u1 u1Var = g2Var3.f264427g;
            int i18 = g2Var3.f264428h;
            android.content.Context context = g2Var3.f264421a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic");
            if (bundle.getBoolean("is_call_server_when_confirm")) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.a(v0Var, bundle.getString("oauth_url"), 1, (java.util.ArrayList) bundle2.getSerializable("key_scope"), u1Var, true, i18, l2Var, context);
            } else {
                java.lang.String string = bundle.getString("redirect_url");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.o2) l2Var).b(string, 9);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthAuthorizeLogic", "doAcceptLogic redirectUrl: %s", string);
            }
        }
        bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264514b), f2Var.f264407b.f264424d);
    }
}
