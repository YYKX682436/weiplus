package com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUIWC */
/* loaded from: classes15.dex */
public class ActivityC18454xe38657dd extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f253285h;

    /* renamed from: i, reason: collision with root package name */
    public static te4.e f253286i;

    /* renamed from: d, reason: collision with root package name */
    public pe4.o f253287d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f253288e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f253289f = -1;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f253290g = null;

    public final void T6(re4.d0 d0Var) {
        int i17;
        if (d0Var != null && this.f253289f == 0) {
            int i18 = d0Var.f476059a;
            if (i18 != 0) {
                switch (i18) {
                    default:
                        switch (i18) {
                            case 90006:
                            case 90007:
                            case 90011:
                                break;
                            case 90008:
                            case 90009:
                            case 90010:
                                i17 = 3;
                                break;
                            default:
                                i17 = -1;
                                break;
                        }
                    case com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4 /* 90001 */:
                    case 90002:
                    case 90003:
                    case 90004:
                        i17 = 2;
                        break;
                }
            } else {
                i17 = 0;
            }
            re4.f0.INSTANCE.a("requireSoterBiometricAuthentication", this.f253290g, i17, i18);
        }
    }

    public final android.content.Intent U6(re4.d0 d0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_code", d0Var.f476059a);
        bundle.putString("err_msg", d0Var.f476060b);
        bundle.putByte("use_mode", d0Var.f476061c);
        bundle.putString("result_json", d0Var.f476062d);
        bundle.putString("result_json_signature", d0Var.f476063e);
        bundle.toString();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        super.onCreate(bundle);
        if (26 != android.os.Build.VERSION.SDK_INT) {
            setRequestedOrientation(1);
        }
        getWindow().setStatusBarColor(0);
        te4.e eVar = f253286i;
        if (eVar != null && (weakReference = eVar.f500131a) != null) {
            weakReference.clear();
        }
        f253286i = new te4.e(this, null);
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        java.lang.String stringExtra = getIntent().getStringExtra("auth_mode");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode : null");
            d0Var.f476059a = 90003;
            d0Var.f476060b = "authen mode is null";
        } else {
            try {
                java.lang.String substring = stringExtra.substring(2);
                if (substring == null) {
                    substring = "00";
                }
                c0Var.f476052a = java.lang.Byte.parseByte(substring, 16);
                c0Var.f476053b = getIntent().getStringExtra("challenge");
                c0Var.f476054c = getIntent().getStringExtra("auth_content");
                if (!re4.g0.c()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: not support soter");
                    d0Var.f476059a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4;
                    d0Var.f476060b = "not support soter";
                } else if (c0Var.f476052a <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: request mode illegal");
                    d0Var.f476059a = 90003;
                    d0Var.f476060b = "resp model error";
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f476053b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge null");
                    d0Var.f476059a = 90004;
                    d0Var.f476060b = "challenge is null";
                } else if (c0Var.f476053b.length() >= 512) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: challenge too long");
                    d0Var.f476059a = 90004;
                    d0Var.f476060b = "challenge is too long. 512 chars at most";
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f476054c)) {
                    c0Var.f476054c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jie);
                } else if (c0Var.f476054c.length() > 42) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: param error: content too long. use default");
                    c0Var.f476054c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jie);
                }
            } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: error authen mode format: %s", stringExtra);
                d0Var.f476059a = 90003;
                d0Var.f476060b = "authen mode is illegal: number format error. found: " + stringExtra;
            }
        }
        if (d0Var.f476059a != 0) {
            setResult(1, U6(d0Var));
            T6(d0Var);
            finish();
            return;
        }
        this.f253289f = getIntent().getIntExtra("key_soter_fp_mp_scene", 0);
        pe4.o a17 = pe4.a.IML.a(this, c0Var, d0Var, f253286i);
        this.f253287d = a17;
        if (a17 != null) {
            a17.f435256g = new oe4.i();
            this.f253287d.f435255f = new oe4.h();
            this.f253287d.f435257h = 2;
            this.f253290g = getIntent().getStringExtra("key_app_id");
            this.f253287d.c(bundle);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUIWC", "hy: no corresponding authen mode");
        d0Var.f476059a = 90003;
        d0Var.f476060b = "no corresponding mode";
        setResult(1, U6(d0Var));
        T6(d0Var);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.ProgressDialog progressDialog = this.f253288e;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mProgressDialog dismiss!");
            this.f253288e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = f253285h;
        if (j0Var != null && j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUIWC", "onDestroy mAuthenDialog dismiss!");
            f253285h.dismiss();
        }
        java.lang.ref.WeakReference weakReference = f253286i.f500131a;
        if (weakReference != null) {
            weakReference.clear();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        gu5.c cVar;
        super.onPause();
        pe4.o oVar = this.f253287d;
        if (oVar != null) {
            pe4.m mVar = (pe4.m) oVar;
            if (mVar.f435241j && (cVar = mVar.f435242k) != null) {
                zt5.h.e("Soter.SoterFingerprintCanceller", "soter: publishing cancellation. should publish: %b", java.lang.Boolean.TRUE);
                if (cVar.f357494a.isCanceled()) {
                    zt5.h.c("Soter.SoterFingerprintCanceller", "soter: cancellation signal already expired.", new java.lang.Object[0]);
                } else {
                    ju5.o.a().c(new gu5.a(cVar));
                    ju5.o.a().f383669b.postDelayed(new gu5.b(cVar), 350L);
                }
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = mVar.f435243l;
            if (j0Var == null || !j0Var.isShowing()) {
                return;
            }
            mVar.f435243l.dismiss();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        pe4.o oVar = this.f253287d;
        if (oVar != null) {
            oVar.e(i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        pe4.o oVar = this.f253287d;
        if (oVar != null) {
            pe4.m mVar = (pe4.m) oVar;
            if (mVar.f435241j) {
                mVar.i();
            }
        }
    }
}
