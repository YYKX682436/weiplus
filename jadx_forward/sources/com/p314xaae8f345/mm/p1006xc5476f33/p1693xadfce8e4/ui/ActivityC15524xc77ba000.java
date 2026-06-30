package com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui;

/* renamed from: com.tencent.mm.plugin.fingerprint.ui.FingerPrintAuthUI */
/* loaded from: classes9.dex */
public class ActivityC15524xc77ba000 extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e implements pz2.b {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f218540o = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f218541d;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Animation f218544g;

    /* renamed from: e, reason: collision with root package name */
    public android.app.Dialog f218542e = null;

    /* renamed from: f, reason: collision with root package name */
    public boolean f218543f = false;

    /* renamed from: h, reason: collision with root package name */
    public int f218545h = 0;

    /* renamed from: i, reason: collision with root package name */
    public pz2.d f218546i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f218547m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f218548n = false;

    public final void U6(java.lang.String str, int i17) {
        this.f218543f = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.z(this, str, i17));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.baf;
    }

    @Override // pz2.b
    public void h(int i17, java.lang.String str) {
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthUI", "open fingerprintpay success");
            m83099x5406100e(new ss4.e0(null, 19), false);
        } else {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.v(this, false));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthUI", "open fingerprintpay failed");
            db5.e1.t(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k), "", new qz2.c0(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.hef));
        this.f218541d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.hdu);
        nz2.o oVar = (nz2.o) gm0.j1.s(nz2.o.class);
        pz2.d r17 = oVar.r1();
        this.f218546i = r17;
        if (r17 == null) {
            U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k), -1);
            return;
        }
        mo54448x9c8c0d33(new qz2.t(this));
        android.os.Bundle e17 = com.p314xaae8f345.mm.p2802xd031a825.a.e(this);
        if (e17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthUI", "contextdata is null,for that reason program can't get user pwd");
            U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k), -1);
            re4.n.g(1000, -1000223, -1, "contextdata is null,for that reason program can't get user pwd");
            return;
        }
        java.lang.String string = e17.getString("pwd");
        if (android.text.TextUtils.isEmpty(string)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthUI", "get user pwd error");
            U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.f_k), -1);
            re4.n.g(1000, -1000223, -1, "get user pwd error");
        } else {
            if (!oVar.ja()) {
                U6(getString(com.p314xaae8f345.mm.R.C30867xcad56011.kut), -1);
                return;
            }
            if (oVar.Je()) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.v(this, true));
                ju5.n.c().b();
                this.f218546i.a(this, new qz2.u(this), string);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerPrintAuthUI", "device is not support FingerPrintAuth");
            }
            this.f218547m = e17.getBoolean("key_show_succ_toast");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthUI", "hy: fingerprint auth ui on destroy");
        android.view.animation.Animation animation = this.f218544g;
        if (animation != null) {
            animation.cancel();
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f218548n = true;
        android.os.PowerManager.WakeLock newWakeLock = ((android.os.PowerManager) mo55332x76847179().getSystemService("power")).newWakeLock(536870913, "PostLocationService");
        if (newWakeLock != null) {
            yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
            newWakeLock.acquire();
            yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "acquire", "()V");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthUI", "hy: user cancelled");
        ((pz2.a) gm0.j1.s(pz2.a.class)).mo148659x428ac225();
        if (newWakeLock != null) {
            yj0.a.c(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
            newWakeLock.release();
            yj0.a.f(newWakeLock, "com/tencent/mm/plugin/fingerprint/ui/FingerPrintAuthUI", "onPause", "()V", "android/os/PowerManager$WakeLock_EXEC_", "release", "()V");
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f218548n = false;
        if (this.f218543f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerPrintAuthUI", "request Identify2");
            this.f218546i.c(mo55332x76847179(), new qz2.w(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f218546i.mo148635x76e0bfae(i17, i18, str, m1Var)) {
            return true;
        }
        if (!(m1Var instanceof ss4.e0)) {
            return false;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new qz2.v(this, false));
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_process_result_code", -1);
        com.p314xaae8f345.mm.p2802xd031a825.a.c(this, bundle, 0);
        if (this.f218547m) {
            dp.a.m125853x26a183b(this, com.p314xaae8f345.mm.R.C30867xcad56011.f_l, 0).show();
        }
        return true;
    }
}
