package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29;

/* loaded from: classes7.dex */
public final class p2 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 f264592a;

    public p2(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var) {
        this.f264592a = y2Var;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList select, int i18, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(select, "select");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.y2 y2Var = this.f264592a;
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.revnListener] REJECT, scope = " + ((java.lang.String) select.get(0)));
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var2 = y2Var.f264729d;
            if (e3Var2 != null) {
                e3Var2.b();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OauthMultiAccountMgr", "[OauthDialog.revnListener] ACCEPT, scope = " + ((java.lang.String) select.get(0)));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(select) && (e3Var = y2Var.f264729d) != null) {
            java.lang.Object obj = select.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            e3Var.f264391h.add((java.lang.String) obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.e3 e3Var3 = y2Var.f264729d;
        if (e3Var3 != null) {
            e3Var3.b();
        }
    }
}
