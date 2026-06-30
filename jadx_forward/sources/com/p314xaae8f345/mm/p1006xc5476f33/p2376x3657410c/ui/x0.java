package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

/* loaded from: classes9.dex */
public class x0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d {

    /* renamed from: a, reason: collision with root package name */
    public final int f262755a = hashCode() & 65535;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f f262756b = null;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e f262757c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f262758d;

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar, com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet create");
        this.f262757c = eVar;
        this.f262758d = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public int a() {
        return 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public void b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet onDestroy");
        this.f262758d.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public boolean c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, int i17, int i18, android.content.Intent intent) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i17);
        objArr[1] = java.lang.Integer.valueOf(i18);
        int i19 = this.f262755a;
        objArr[2] = java.lang.Integer.valueOf(i19);
        objArr[3] = java.lang.Boolean.valueOf(intent == null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "onPayEnd requestCode : %d,payResult : %d,SIMPLE_PAY : %d, data is null : %b", objArr);
        if (i17 == i19 && this.f262756b != null) {
            nt4.f a17 = i18 == -1 ? (intent == null || intent.getIntExtra("key_jsapi_pay_err_code", 0) != 0) ? nt4.f.a(5) : nt4.f.a(0) : i18 == 0 ? nt4.f.a(1) : nt4.f.a(6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "wxpay result : %s", a17);
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = this.f262757c;
            this.f262756b.a(a17, new mt4.e(eVar.f262696l, eVar.f262694j, eVar.f262693i, eVar.f262692h));
            this.f262756b = null;
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.util.ArrayList arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet restorePurchase");
        if (fVar != null) {
            nt4.f a17 = nt4.f.a(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = this.f262757c;
            fVar.a(a17, new mt4.e(eVar.f262696l, eVar.f262694j, eVar.f262693i, eVar.f262692h));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public void e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "WeiXinWallet restorePurchase");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_err_code", 0);
        intent.putExtra("key_err_msg", "");
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.d
    public int f(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f fVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e eVar = this.f262757c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "[alex] WeiXinWallet launchPay MiniProgram:%b,taskid:%d,scene:%d,rawscene:%d", java.lang.Boolean.valueOf(eVar.f262698n), java.lang.Integer.valueOf(abstractActivityC21394xb3d2c0cf.getTaskId()), java.lang.Integer.valueOf(eVar.f262702r), java.lang.Integer.valueOf(eVar.f262703s));
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.f295484a = java.lang.System.currentTimeMillis();
        this.f262756b = fVar;
        boolean z17 = eVar.f262698n;
        int i17 = this.f262755a;
        if (z17) {
            r45.py3 py3Var = eVar.f262687c;
            if (py3Var != null) {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62 c19761xc2874b62 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19761xc2874b62();
                r45.p35 p35Var = py3Var.f465010i;
                c19761xc2874b62.f273662d = p35Var.f464232d;
                c19761xc2874b62.f273666h = p35Var.f464233e;
                c19761xc2874b62.f273665g = p35Var.f464234f;
                c19761xc2874b62.f273667i = p35Var.f464236h;
                c19761xc2874b62.f273664f = p35Var.f464235g;
                c19761xc2874b62.f273671p = py3Var.f465009h;
                c19761xc2874b62.f273675t = py3Var.f465005d;
                c19761xc2874b62.f273677v = 33;
                c19761xc2874b62.F = "key_from_scene_appbrandgame";
                c19761xc2874b62.f273676u = i17;
                int i18 = eVar.f262702r;
                if (i18 > 0) {
                    c19761xc2874b62.f273679x = i18;
                }
                h45.a0.d(abstractActivityC21394xb3d2c0cf, c19761xc2874b62, i17, null);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeiXinWallet", "[alex] mIapData.iapWxPayData is null");
            }
        } else {
            boolean mo24778x3c5fbb61 = ((h45.q) i95.n0.c(h45.q.class)).mo24778x3c5fbb61(eVar.f262687c.f465007f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeiXinWallet", "doEmojiReward, isSwitch2InWxAppPay:%b", java.lang.Boolean.valueOf(mo24778x3c5fbb61));
            if (mo24778x3c5fbb61) {
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("prepayId", eVar.f262687c.f465007f);
                bundle.putInt("payScene", 5);
                bundle.putInt("payChannel", 0);
                ((h45.q) i95.n0.c(h45.q.class)).mo24806xf00c9308(abstractActivityC21394xb3d2c0cf, bundle);
            } else {
                com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 c19760x34448d56 = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
                r45.py3 py3Var2 = eVar.f262687c;
                c19760x34448d56.f273647m = py3Var2.f465007f;
                c19760x34448d56.f273651q = py3Var2.f465008g;
                c19760x34448d56.f273652r = py3Var2.f465009h;
                c19760x34448d56.f273642e = 5;
                h45.a0.f(abstractActivityC21394xb3d2c0cf, c19760x34448d56, i17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WeiXinWallet", "launchPay return SIMPLE_PAY:%d", java.lang.Integer.valueOf(i17));
        return i17;
    }
}
