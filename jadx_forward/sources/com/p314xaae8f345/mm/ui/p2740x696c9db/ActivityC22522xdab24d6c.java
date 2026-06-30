package com.p314xaae8f345.mm.ui.p2740x696c9db;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.ui.tools.ShareImageRedirectUI */
/* loaded from: classes.dex */
public class ActivityC22522xdab24d6c extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f291683e;

    public final void O6() {
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String m17 = lp0.b.m();
        java.lang.String str = "microMsg." + java.lang.System.currentTimeMillis() + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG;
        ((ub0.r) oVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.l(this, m17, str, 0);
        getWindow().getDecorView().setOnTouchListener(new com.p314xaae8f345.mm.ui.p2740x696c9db.j9(this));
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        getWindow().getDecorView().setOnTouchListener(null);
        if (i18 != -1) {
            finish();
            return;
        }
        if (i17 == 0) {
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            android.content.Context applicationContext = getApplicationContext();
            java.lang.String a17 = g83.a.a();
            ((ub0.r) oVar).getClass();
            java.lang.String b17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.l7.b(applicationContext, intent, a17);
            this.f291683e = b17;
            if (b17 == null) {
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22574x21ac54af.class);
            intent2.putExtra("intent_extra_image_path", this.f291683e);
            startActivityForResult(intent2, 2);
            return;
        }
        if (i17 != 2) {
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent != null ? intent.getStringArrayListExtra("Select_Contact") : null;
        if (stringArrayListExtra == null || stringArrayListExtra.size() != 1) {
            if (stringArrayListExtra != null && stringArrayListExtra.size() > 1) {
                finish();
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("Ksnsupload_type", 0);
            intent3.putExtra("sns_kemdia_path", this.f291683e);
            j45.l.j(this, "sns", ".ui.SnsUploadUI", intent3, null);
            finish();
            return;
        }
        android.content.Intent intent4 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.class);
        intent4.putExtra("Chat_User", stringArrayListExtra.get(0));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/tools/ShareImageRedirectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(this, "com/tencent/mm/ui/tools/ShareImageRedirectUI", "onActivityResult", "(IILandroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        finish();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(this, "android.permission.CAMERA", 16, "", "");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(a17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImageRedirectUI", "summerper checkPermission checkCamera[%b], stack[%s], activity[%s]", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3(), this);
        if (a17) {
            O6();
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImageRedirectUI", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImageRedirectUI", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 16) {
            return;
        }
        if (iArr[0] == 0) {
            O6();
        } else {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hh8), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new com.p314xaae8f345.mm.ui.p2740x696c9db.k9(this), new com.p314xaae8f345.mm.ui.p2740x696c9db.l9(this));
        }
    }
}
