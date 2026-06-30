package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class y4 extends np5.g {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ np5.b0 f262341c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f262342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4 f262343e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4 z4Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, np5.b0 b0Var, np5.b0 b0Var2, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2) {
        super(abstractActivityC21394xb3d2c0cf, b0Var);
        this.f262343e = z4Var;
        this.f262341c = b0Var2;
        this.f262342d = abstractActivityC21394xb3d2c0cf2;
    }

    @Override // np5.g
    public boolean d(java.lang.Object... objArr) {
        if (objArr.length != 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletJSApiVerifyCodeProcess", "arguments is error");
            return false;
        }
        at4.z0 z0Var = (at4.z0) objArr[1];
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4 z4Var = this.f262343e;
        z0Var.f95558d = z4Var.f262358f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "do NetSceneTenpayVerifySmsByPasswd");
        this.f262341c.d(new ss4.i0(z0Var, z4Var.f262356d), true);
        return true;
    }

    @Override // np5.g
    public boolean e(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            if (!(m1Var instanceof ss4.i0)) {
                return m1Var instanceof ss4.y;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms succ");
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4 z4Var = this.f262343e;
            android.os.Bundle bundle = z4Var.f295334c;
            bundle.putString("key_jsapi_token", ((ss4.i0) m1Var).f493600d);
            z4Var.f(this.f262342d, bundle);
            return true;
        }
        if (m1Var instanceof ss4.i0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletJSApiVerifyCodeProcess", "send sms fail,errType=" + i17 + ",errCode=" + i18 + ",errMsg=" + str);
        }
        return false;
    }

    @Override // np5.g
    public boolean f(java.lang.Object... objArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletJSApiVerifyCodeProcess", "resend sms");
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z4 z4Var = this.f262343e;
        this.f262341c.d(new ss4.y(z4Var.f262357e, z4Var.f262358f, true), true);
        return true;
    }
}
