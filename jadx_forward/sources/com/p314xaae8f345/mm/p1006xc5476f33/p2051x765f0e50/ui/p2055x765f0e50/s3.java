package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes14.dex */
public final class s3 implements wd0.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f243061a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 f243062b;

    public s3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 activityC17395x33991581) {
        this.f243061a = f4Var;
        this.f243062b = activityC17395x33991581;
    }

    @Override // wd0.c2
    public void a(com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac param) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(param, "param");
        this.f243061a.dismiss();
        rk0.c.c("MicroMsg.SettingFingerprintVerifyUI", "[fingerprint login] bind result(callback) is errType: " + param.f149346d + ", errCode: " + param.f149347e + ", errMsg: " + param.f149348f + ",res is " + param.f149349g, new java.lang.Object[0]);
        int i17 = param.f149347e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.ActivityC17395x33991581 activityC17395x33991581 = this.f243062b;
        if (i17 == 0) {
            activityC17395x33991581.getIntent().putExtra("bind_result", param);
            activityC17395x33991581.setResult(-1, activityC17395x33991581.getIntent());
        } else {
            activityC17395x33991581.getIntent().putExtra("bind_result", param);
            activityC17395x33991581.setResult(0, activityC17395x33991581.getIntent());
        }
        activityC17395x33991581.finish();
    }
}
