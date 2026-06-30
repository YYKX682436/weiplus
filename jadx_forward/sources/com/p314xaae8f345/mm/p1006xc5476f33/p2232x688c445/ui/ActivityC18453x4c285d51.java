package com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui;

/* renamed from: com.tencent.mm.plugin.soter.ui.SoterAuthenticationUI */
/* loaded from: classes15.dex */
public class ActivityC18453x4c285d51 extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f253273q;

    /* renamed from: r, reason: collision with root package name */
    public static te4.c f253274r;

    /* renamed from: n, reason: collision with root package name */
    public android.os.ResultReceiver f253282n;

    /* renamed from: d, reason: collision with root package name */
    public pe4.o f253275d = null;

    /* renamed from: e, reason: collision with root package name */
    public android.app.ProgressDialog f253276e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f253277f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f253278g = -1;

    /* renamed from: h, reason: collision with root package name */
    public boolean f253279h = false;

    /* renamed from: i, reason: collision with root package name */
    public zt5.r f253280i = null;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f253281m = null;

    /* renamed from: o, reason: collision with root package name */
    public final pe4.n f253283o = new te4.a(this);

    /* renamed from: p, reason: collision with root package name */
    public final eu5.b f253284p = new te4.b(this);

    public final void O6(re4.d0 d0Var) {
        int i17;
        if (d0Var != null && this.f253277f == 1) {
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
            ((ch1.d) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c) nd.f.d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1182xed8e89a9.c.class, true))).c(13711, 0, this.f253281m, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17));
        }
    }

    public final void P6(re4.d0 d0Var) {
        this.f253282n.send(1, Q6(d0Var));
        O6(d0Var);
        finish();
    }

    public final android.os.Bundle Q6(re4.d0 d0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_code", d0Var.f476059a);
        bundle.putString("err_msg", d0Var.f476060b);
        bundle.putByte("use_mode", d0Var.f476061c);
        bundle.putString("result_json", d0Var.f476062d);
        bundle.putString("result_json_signature", d0Var.f476063e);
        bundle.toString();
        return bundle;
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.ref.WeakReference weakReference;
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        this.f253282n = (android.os.ResultReceiver) getIntent().getParcelableExtra("Soter_Result_Receiver");
        te4.c cVar = f253274r;
        if (cVar != null && (weakReference = cVar.f500130a) != null) {
            weakReference.clear();
        }
        f253274r = new te4.c(this, null);
        re4.c0 c0Var = new re4.c0();
        re4.d0 d0Var = new re4.d0();
        java.lang.String stringExtra = getIntent().getStringExtra("auth_mode");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode : null");
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
                if (!wt5.a.l()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: not support soter");
                    d0Var.f476059a = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54063x6bbae3b4;
                    d0Var.f476060b = "not support soter";
                } else if (c0Var.f476052a <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: request mode illegal");
                    d0Var.f476059a = 90003;
                    d0Var.f476060b = "resp model error";
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f476053b)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge null");
                    d0Var.f476059a = 90004;
                    d0Var.f476060b = "challenge is null";
                } else if (c0Var.f476053b.length() >= 512) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: challenge too long");
                    d0Var.f476059a = 90004;
                    d0Var.f476060b = "challenge is too long. 512 chars at most";
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c0Var.f476054c)) {
                    c0Var.f476054c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jie);
                } else if (c0Var.f476054c.length() > 42) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: param error: content too long. use default");
                    c0Var.f476054c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jie);
                }
            } catch (java.lang.IndexOutOfBoundsException | java.lang.NumberFormatException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: error authen mode format: %s", stringExtra);
                d0Var.f476059a = 90003;
                d0Var.f476060b = "authen mode is illegal: number format error. found: " + stringExtra;
            }
        }
        if (d0Var.f476059a != 0) {
            P6(d0Var);
            return;
        }
        this.f253277f = getIntent().getIntExtra("key_soter_fp_luggage_fromscene", 1);
        this.f253278g = getIntent().getIntExtra("key_soter_fp_luggage_scene", 2048);
        pe4.o a17 = pe4.a.IML.a(this, c0Var, d0Var, f253274r);
        this.f253275d = a17;
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SoterAuthenticationUI", "hy: no corresponding authen mode");
            d0Var.f476059a = 90003;
            d0Var.f476060b = "no corresponding mode";
            P6(d0Var);
            return;
        }
        a17.f435256g = null;
        a17.f435255f = null;
        a17.f435257h = this.f253278g;
        a17.f435258i = this.f253283o;
        boolean d17 = fu5.d.b().d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: isInit:" + d17);
        if (!d17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "hy: init scene:" + this.f253275d.f435257h);
            ju5.h hVar = new ju5.h(null);
            hVar.f383626b = new int[]{this.f253275d.f435257h};
            ju5.o.a().c(new cu5.a(getApplicationContext(), hVar, this.f253284p));
            this.f253279h = true;
        }
        this.f253281m = getIntent().getStringExtra("key_app_id");
        this.f253275d.c(bundle);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        android.app.ProgressDialog progressDialog = this.f253276e;
        if (progressDialog != null && progressDialog.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "onDestroy mProgressDialog dismiss!");
            this.f253276e.dismiss();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = f253273q;
        if (j0Var != null && j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterAuthenticationUI", "onDestroy mAuthenDialog dismiss!");
            f253273q.dismiss();
        }
        java.lang.ref.WeakReference weakReference = f253274r.f500130a;
        if (weakReference != null) {
            weakReference.clear();
        }
        if (this.f253279h) {
            ju5.n.c().b();
            fu5.d b17 = fu5.d.b();
            b17.getClass();
            synchronized (fu5.d.class) {
                b17.f348445a = false;
                b17.f348446b = false;
                b17.f348447c = new android.util.SparseArray(10);
                b17.f348448d = null;
            }
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        gu5.c cVar;
        super.onPause();
        pe4.o oVar = this.f253275d;
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

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        pe4.o oVar = this.f253275d;
        if (oVar != null) {
            oVar.e(i17, strArr, iArr);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        pe4.o oVar = this.f253275d;
        if (oVar != null) {
            pe4.m mVar = (pe4.m) oVar;
            if (mVar.f435241j) {
                mVar.i();
            }
        }
        overridePendingTransition(0, 0);
    }
}
