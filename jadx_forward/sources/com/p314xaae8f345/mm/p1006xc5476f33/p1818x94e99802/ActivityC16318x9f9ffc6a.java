package com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802;

@db5.a(m123858x6ac9171 = 19)
/* renamed from: com.tencent.mm.plugin.location_soso.SoSoProxyUI */
/* loaded from: classes13.dex */
public class ActivityC16318x9f9ffc6a extends com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b implements d85.j0 {
    protected static final java.lang.String TAG = "MicroMsg.SoSoProxyUI";

    /* renamed from: basemapUI */
    private ab3.e f37454x94785cbf;

    @Override // p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        if (this.f37454x94785cbf.a(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f37454x94785cbf.b(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        return (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) ? super.getResources() : com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        java.lang.Object systemService = super.getSystemService(str);
        return (getAssets() == null || !"layout_inflater".equals(str)) ? systemService : com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        this.f37454x94785cbf.c(i17, i18, intent);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        this.f37454x94785cbf.d();
    }

    @Override // d85.j0
    /* renamed from: onBusinessPermissionDenied */
    public void mo65979x34301f29(java.lang.String str) {
        java.lang.Object obj = this.f37454x94785cbf;
        if (obj instanceof d85.j0) {
            ((d85.j0) obj).mo65979x34301f29(str);
        }
    }

    @Override // d85.j0
    /* renamed from: onBusinessPermissionGranted */
    public void mo65980x600c4ed(java.lang.String str) {
        java.lang.Object obj = this.f37454x94785cbf;
        if (obj instanceof d85.j0) {
            ((d85.j0) obj).mo65980x600c4ed(str);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ab3.e x1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "SoSoProxyUI onCreate");
        int intExtra = getIntent().getIntExtra("intent_map_key", -1);
        if (intExtra == 2) {
            requestWindowFeature(1);
        }
        super.onCreate(bundle);
        if (android.os.Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        if (((ab3.g) i95.n0.c(ab3.g.class)) == null) {
            try {
                java.lang.Object[] objArr = new java.lang.Object[4];
                objArr[0] = java.lang.Boolean.valueOf(z65.c.f551988a);
                objArr[1] = java.lang.Boolean.valueOf(bundle != null);
                objArr[2] = getClass().getSimpleName();
                objArr[3] = java.lang.Integer.valueOf(hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "summerasyncinit not init activity foreground[%b] savedInstanceState[%b], activity[%s, %d]", objArr);
                finish();
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "summerasyncinit finish:", new java.lang.Object[0]);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(598L, 20L, 1L, false);
            return;
        }
        java.lang.String stringExtra = getIntent().getStringExtra("map_talker_name");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x) ((ab3.g) i95.n0.c(ab3.g.class))).getClass();
        if (intExtra == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MapFactoryImp", "poi map");
            x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.x1(this, stringExtra);
        } else if (intExtra == 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MapFactoryImp", "track map");
            x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.y1(this);
        } else if (intExtra != 5) {
            x1Var = null;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MapFactoryImp", "share map");
            x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1815x714f9fb5.ui.p1817x316220.p0(this);
        }
        this.f37454x94785cbf = x1Var;
        if (x1Var == null) {
            finish();
        } else {
            x1Var.e(bundle);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        ab3.e eVar = this.f37454x94785cbf;
        if (eVar != null) {
            eVar.f();
        }
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 82 || keyEvent.getAction() != 1) {
            return super.onKeyUp(i17, keyEvent);
        }
        this.f37454x94785cbf.g(i17, keyEvent);
        return true;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f37454x94785cbf.h();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr == null || iArr.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 == 67 || i17 == 68) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                if (((t60.e) ((u60.g) i95.n0.c(u60.g.class))).Ai(this)) {
                    ((t60.e) ((u60.g) i95.n0.c(u60.g.class))).getClass();
                    i11.u.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).d(this);
                } else {
                    db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhm), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.location_soso.SoSoProxyUI.3
                        @Override // android.content.DialogInterface.OnClickListener
                        public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.ActivityC16318x9f9ffc6a activityC16318x9f9ffc6a = com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.ActivityC16318x9f9ffc6a.this;
                            ((sb0.f) jVar).getClass();
                            j35.u.g(activityC16318x9f9ffc6a);
                        }
                    }, null);
                }
            }
        } else if (i17 == 80 && iArr[0] != 0) {
            db5.e1.C(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhn), getString(com.p314xaae8f345.mm.R.C30867xcad56011.hht), getString(com.p314xaae8f345.mm.R.C30867xcad56011.g6z), getString(com.p314xaae8f345.mm.R.C30867xcad56011.aq7), false, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.location_soso.SoSoProxyUI.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    dialogInterface.dismiss();
                    tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.ActivityC16318x9f9ffc6a activityC16318x9f9ffc6a = com.p314xaae8f345.mm.p1006xc5476f33.p1818x94e99802.ActivityC16318x9f9ffc6a.this;
                    ((sb0.f) jVar).getClass();
                    j35.u.g(activityC16318x9f9ffc6a);
                }
            }, new android.content.DialogInterface.OnClickListener() { // from class: com.tencent.mm.plugin.location_soso.SoSoProxyUI.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(android.content.DialogInterface dialogInterface, int i18) {
                    dialogInterface.dismiss();
                }
            });
        }
        super.onRequestPermissionsResult(i17, strArr, iArr);
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.map.AbstractActivityC25940xd7b4886b, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f37454x94785cbf.i();
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view) {
        super.setContentView(view);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(int i17) {
        super.setContentView(i17);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
    }
}
