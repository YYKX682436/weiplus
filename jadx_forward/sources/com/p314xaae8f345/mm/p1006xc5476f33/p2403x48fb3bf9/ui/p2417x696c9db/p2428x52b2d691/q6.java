package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes8.dex */
public final class q6 implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f267988a;

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        int i17;
        if (bundle != null && (i17 = bundle.getInt("result_key_action", -1)) >= 0) {
            int i18 = bundle.getInt("result_key_err_code", -1);
            java.lang.String string = bundle.getString("result_key_err_msg");
            if (string == null) {
                string = "";
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenCustomerServiceChat", "openCustomerServiceChat startKfConversation onReceiveResult action: " + i17 + ", errCode: " + i18 + ", errMsg: " + string);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r6 r6Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.r6.f268016d;
            if (i17 == 2) {
                r6Var.e(i18, string);
                return;
            }
            if (i17 == 3) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p6 p6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p6(i18, string);
                long j17 = this.f267988a ? 0L : 600L;
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(p6Var, j17, false);
                return;
            }
            if (i17 == 4) {
                r6Var.e(i18, string);
            } else if (i17 == 5) {
                this.f267988a = true;
            } else {
                if (i17 != 6) {
                    return;
                }
                r6Var.e(i18, string);
            }
        }
    }
}
