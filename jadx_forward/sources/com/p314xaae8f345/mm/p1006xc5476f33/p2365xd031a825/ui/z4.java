package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class z4 extends com.p314xaae8f345.mm.p2802xd031a825.h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f262356d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f262357e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f262358f;

    /* renamed from: g, reason: collision with root package name */
    public int f262359g;

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public com.p314xaae8f345.mm.p2802xd031a825.h A(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "start WalletJSApiVerifyCodeProcess");
        this.f262356d = bundle.getString("key_relation_key");
        this.f262357e = bundle.getString("key_pwd1");
        this.f262358f = bundle.getString("key_jsapi_token");
        this.f262359g = bundle.getInt("key_verify_scene");
        B(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3.class, bundle);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void c(android.app.Activity activity, int i17) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public java.lang.String e() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void f(android.app.Activity activity, android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "end WalletJSApiVerifyCodeProcess");
        if (this.f262359g == 8) {
            k(activity, "wallet", ".pay.ui.WalletLoanRepaymentUI", -1, null, false);
        } else {
            h(activity, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19112x755f8362.class, -1, null, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public void o(android.app.Activity activity, int i17, android.os.Bundle bundle) {
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public np5.g p(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.y4(this, abstractActivityC21394xb3d2c0cf, b0Var, b0Var, abstractActivityC21394xb3d2c0cf);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.h
    public boolean t(android.app.Activity activity, android.os.Bundle bundle) {
        return false;
    }
}
