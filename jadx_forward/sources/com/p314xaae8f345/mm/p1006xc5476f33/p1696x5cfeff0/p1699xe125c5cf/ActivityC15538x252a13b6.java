package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.flash.permission.FaceFlashPermissionUI */
/* loaded from: classes.dex */
public class ActivityC15538x252a13b6 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f218776i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f218777d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f218778e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f218779f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f218780g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f218781h = false;

    public static void U6(android.content.Context context, android.os.Bundle bundle, int i17) {
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1699xe125c5cf.ActivityC15538x252a13b6.class);
        intent.putExtras(bundle);
        android.app.Activity activity = (android.app.Activity) context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/plugin/flash/permission/FaceFlashPermissionUI", "jumpToActivity", "(Landroid/content/Context;Landroid/os/Bundle;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    public final void T6() {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]gotoFaceFlashUI() hasStarted:%b", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f218779f));
        if (this.f218779f) {
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.a(this)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "no camera permission. check permission");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "check permission all success");
        boolean booleanExtra = getIntent().getBooleanExtra("face_permission_location_check", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "needCheckLocation: [%s]，hasCheckLocation：[%s]", java.lang.Boolean.valueOf(booleanExtra), java.lang.Boolean.valueOf(this.f218780g));
        if (!booleanExtra || this.f218780g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "do not needCheckLocation");
            z17 = false;
        } else {
            ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
            boolean a17 = j35.u.a(this, "android.permission.ACCESS_FINE_LOCATION", 64, "", "");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "locationPermission: [%s] ", java.lang.Boolean.valueOf(a17));
            z17 = !a17;
        }
        if (z17) {
            return;
        }
        boolean z18 = getIntent().getExtras().getBoolean("face_permission_check", false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "use new face action openPlatformFlashPage:%b", java.lang.Boolean.valueOf(z18));
        if (z18) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.ViewOnClickListenerC15531xcd76b547.X6(this, getIntent().getExtras(), 1);
        } else {
            android.os.Bundle extras = getIntent().getExtras();
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.t0 t0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.t0(this);
            if (!iq.b.h(this, true, t0Var) && !iq.b.D(this, t0Var) && !iq.b.w(this, t0Var) && !iq.b.f(this, t0Var) && !iq.b.k(this, t0Var)) {
                android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.ViewOnClickListenerC15534xde6dcfdd.class);
                if (extras != null) {
                    intent.putExtras(extras);
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(1);
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(this, arrayList.toArray(), "com/tencent/mm/plugin/flash/action/FaceFlashActionUI", "jumpToFaceFlashUI", "(Landroid/app/Activity;Landroid/os/Bundle;I)Z", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
            }
        }
        this.f218779f = true;
    }

    public final android.content.Intent V6(int i17, int i18, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("err_type", i17);
        bundle.putInt("err_code", i18);
        bundle.putString("err_msg", str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "face result errorType:%s errorCode:%s errorMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        intent.putExtras(bundle);
        return intent;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onActivityResult()", java.lang.Integer.valueOf(hashCode()));
        super.onActivityResult(i17, i18, intent);
        setResult(i18, intent);
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onCreate()", java.lang.Integer.valueOf(hashCode()));
        super.onCreate(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onRequestPermissionsResult:%s", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17));
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "dont have any permission");
            setResult(1, V6(4, 90010, "fail"));
            finish();
            return;
        }
        if (i17 == 16) {
            if (iArr[0] == 0) {
                this.f218778e = true;
                T6();
                return;
            } else {
                this.f218778e = false;
                this.f218777d = db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7j), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new uz2.a(this), new uz2.b(this));
                return;
            }
        }
        if (i17 != 18) {
            if (i17 == 64) {
                if (iArr[0] == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "get location granted");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "do not get location granted");
                }
                this.f218780g = true;
                T6();
                return;
            }
            if (i17 != 80) {
                return;
            }
        }
        if (iArr[0] == 0) {
            this.f218778e = true;
            T6();
        } else {
            this.f218778e = false;
            this.f218777d = db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.c7k), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), false, new uz2.c(this), new uz2.d(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity
    public void onRestoreInstanceState(android.os.Bundle bundle) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onRestoreInstanceState()", java.lang.Integer.valueOf(hashCode()));
        this.f218781h = true;
        super.onRestoreInstanceState(bundle);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "[%d]onResume()  restore:%b checkPermissionSuccess:%b", java.lang.Integer.valueOf(hashCode()), java.lang.Boolean.valueOf(this.f218781h), java.lang.Boolean.valueOf(this.f218778e));
        if (this.f218778e || this.f218781h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashManagerPermission", "checkPermissionSuccess || restore, return");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = this.f218777d;
        if (j0Var == null || !j0Var.isShowing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashManagerPermission", "onResume goFaceFlash");
            T6();
        }
    }
}
