package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes8.dex */
public final class u3 implements l41.j2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f225329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v3 f225330b;

    public u3(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.v3 v3Var) {
        this.f225330b = v3Var;
    }

    @Override // l41.j2
    public void a(android.os.Bundle bundle) {
        int i17;
        if (bundle != null && (i17 = bundle.getInt("result_key_action", -1)) >= 0) {
            int i18 = bundle.getInt("result_key_err_code", -1);
            java.lang.String string = bundle.getString("result_key_err_msg", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiOpenCustomerServiceChatForFakeNative", "openCustomerServiceChat onReceiveResult action: " + i17 + ", errCode: " + i18 + ", errMsg: " + string);
            if (i17 != 3) {
                if (i17 != 5) {
                    this.f225330b.f224976f.a(string);
                    return;
                } else {
                    this.f225329a = true;
                    return;
                }
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t3 t3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.t3(this.f225330b);
            long j17 = this.f225329a ? 0L : 1000L;
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(t3Var, j17, false);
        }
    }
}
