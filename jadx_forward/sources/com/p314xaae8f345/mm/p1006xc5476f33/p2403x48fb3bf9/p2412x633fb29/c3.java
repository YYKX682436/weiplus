package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f264353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f264354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f264355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 f264356g;

    public c3(int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3 f3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var) {
        this.f264353d = i17;
        this.f264354e = str;
        this.f264355f = f3Var;
        this.f264356g = e3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String string;
        java.lang.String str = this.f264354e;
        java.lang.String str2 = "";
        hy4.b bVar = hy4.b.INSTANCE;
        if (this.f264353d == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.sendResult] MPGdprPolicyUtil.checkPolicy DENY");
            bVar.a(str == null ? "" : str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 0, 1, 0, 1, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3.a(this.f264355f);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.sendResult] MPGdprPolicyUtil.checkPolicy PROCEED");
            bVar.a(str == null ? "" : str, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264513a, 1, 1, 0, 1, 0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var = this.f264356g;
            android.os.Bundle bundle = e3Var.f264388e;
            boolean z17 = bundle != null ? bundle.getBoolean("is_call_server_when_confirm") : false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthQueue.accept] isCallServerWhenConfirm = " + z17);
            if (z17) {
                e3Var.a(1);
            } else {
                android.os.Bundle bundle2 = e3Var.f264388e;
                if (bundle2 != null && (string = bundle2.getString("redirect_url")) != null) {
                    str2 = string;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.f3.b(e3Var.f264393j, str2);
            }
        }
        bVar.b(2, (int) (java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.k2.f264514b), 0);
    }
}
