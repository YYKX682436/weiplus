package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p880x4ac6c74f.p882xed08e3c8;

@db5.a(m123858x6ac9171 = 4099)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/composing_creation/preview/ComposingCreationPreviewUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.mj_publisher.finder.composing_creation.preview.ComposingCreationPreviewUI */
/* loaded from: classes5.dex */
public final class ActivityC10926xa2f37a4e extends com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f150709e = 0;

    /* renamed from: d, reason: collision with root package name */
    public gu0.k2 f150710d;

    public final com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 U6(java.lang.Class cls) {
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(this).a(cls);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9) a17;
    }

    public final void V6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
        aVar.f293262s = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_a);
        aVar.f293265v = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o__);
        aVar.W = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23);
        aVar.f293266w = getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_9);
        aVar.F = gu0.q.f357324d;
        aVar.E = new gu0.s(this);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        j0Var.e(aVar);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
        if (d0Var != null) {
            d0Var.a(j0Var.f293370r);
        }
        j0Var.show();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e6d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{hu0.a0.class, hu0.l.class, hu0.o.class});
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        V6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        eu0.b bVar;
        eu0.b bVar2;
        boolean z17 = true;
        mo2550x7c2abd06(1);
        getWindow().clearFlags(67108864);
        getWindow().clearFlags(134217728);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        ug5.x.e(getWindow(), -16777216);
        getWindow().getDecorView().setSystemUiVisibility(9984);
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onCreate");
        m78583x85ccfe01(8);
        mo78514x143f1b92().G0(-1);
        mo78514x143f1b92().E0(0);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.sxh);
        findViewById.setPadding(0, h17, 0, 0);
        com.p314xaae8f345.mm.ui.a4.g(findViewById, true);
        gu0.k2 k2Var = gu0.l2.f357294a;
        this.f150710d = k2Var;
        if (k2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.PreviewUI", "onCreate: session is null, finish");
            finish();
            return;
        }
        java.lang.String string = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((k2Var == null || (bVar2 = k2Var.f357258a) == null) ? null : bVar2.f338228a, "reedit") ? getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_c) : getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        ((android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.soj)).setText(string);
        findViewById(com.p314xaae8f345.mm.R.id.sod).setOnClickListener(new gu0.m(this));
        hu0.a0 a0Var = (hu0.a0) U6(hu0.a0.class);
        hu0.l lVar = (hu0.l) U6(hu0.l.class);
        hu0.o oVar = (hu0.o) U6(hu0.o.class);
        gu0.k2 k2Var2 = this.f150710d;
        if (k2Var2 != null) {
            k2Var2.f357263f = new gu0.h(this, a0Var);
        }
        if (k2Var2 != null) {
            k2Var2.f357264g = new gu0.k(this, oVar, lVar, a0Var);
        }
        lVar.f366574h = new gu0.l(this);
        hu0.o oVar2 = (hu0.o) U6(hu0.o.class);
        hu0.a0 a0Var2 = (hu0.a0) U6(hu0.a0.class);
        hu0.l lVar2 = (hu0.l) U6(hu0.l.class);
        oVar2.Q6();
        lVar2.R6(false);
        a0Var2.U6(false);
        gu0.k2 k2Var3 = this.f150710d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((k2Var3 == null || (bVar = k2Var3.f357258a) == null) ? null : bVar.f338228a, "reedit");
        java.lang.String str = "effectsInfos";
        if (!b17) {
            gu0.k2 k2Var4 = this.f150710d;
            if (k2Var4 != null) {
                gu0.y yVar = new gu0.y(oVar2, this, a0Var2, lVar2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preparePreview: params=");
                eu0.b bVar3 = k2Var4.f357258a;
                sb6.append(bVar3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", sb6.toString());
                java.lang.String str2 = bVar3.f338230c;
                if (str2 == null || str2.length() == 0) {
                    str = "prompt";
                } else {
                    java.lang.String str3 = bVar3.f338231d;
                    if (str3 == null || str3.length() == 0) {
                        str = "aigcTaskID";
                    } else {
                        java.util.List list = bVar3.f338232e;
                        if (list == null || list.isEmpty()) {
                            str = "assetInfos";
                        } else {
                            java.util.List list2 = bVar3.f338233f;
                            if (!(list2 == null || list2.isEmpty())) {
                                java.lang.String str4 = bVar3.f338229b;
                                if (str4 != null && str4.length() != 0) {
                                    z17 = false;
                                }
                                str = z17 ? "transitionID" : null;
                            }
                        }
                    }
                }
                if (str == null) {
                    p3325xe03a0797.p3326xc267989b.l.d(k2Var4.f357261d, null, null, new gu0.e1(k2Var4, yVar, null), 3, null);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "preparePreview: required param '" + str + "' is missing");
                yVar.mo146xb9724478("Required param missing: ".concat(str));
                return;
            }
            return;
        }
        gu0.k2 k2Var5 = this.f150710d;
        if (k2Var5 != null) {
            gu0.v vVar = new gu0.v(oVar2, this, a0Var2, lVar2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("prepareReeditPreview: params=");
            eu0.b bVar4 = k2Var5.f357258a;
            sb7.append(bVar4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", sb7.toString());
            java.lang.String str5 = bVar4.f338230c;
            if (str5 == null || str5.length() == 0) {
                str = "prompt";
            } else {
                java.util.List list3 = bVar4.f338232e;
                if (list3 == null || list3.isEmpty()) {
                    str = "assetInfos";
                } else {
                    java.util.List list4 = bVar4.f338233f;
                    if (!(list4 == null || list4.isEmpty())) {
                        java.lang.String str6 = bVar4.f338239l;
                        if (str6 == null || str6.length() == 0) {
                            str = "templateURL";
                        } else {
                            java.lang.String str7 = bVar4.f338240m;
                            if (str7 == null || str7.length() == 0) {
                                str = "templateID";
                            } else {
                                java.lang.String str8 = bVar4.f338231d;
                                if (str8 == null || str8.length() == 0) {
                                    str = "aigcTaskID";
                                } else {
                                    java.lang.String str9 = bVar4.f338238k;
                                    if (str9 != null && str9.length() != 0) {
                                        z17 = false;
                                    }
                                    str = z17 ? "aigcServiceID" : null;
                                }
                            }
                        }
                    }
                }
            }
            if (str == null) {
                p3325xe03a0797.p3326xc267989b.l.d(k2Var5.f357261d, null, null, new gu0.f1(k2Var5, vVar, null), 3, null);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.Session", "prepareReeditPreview: required param '" + str + "' is missing");
            vVar.mo146xb9724478("Required param missing: ".concat(str));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onDestroy");
        gu0.k2 k2Var = this.f150710d;
        if (k2Var != null && !k2Var.f357262e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MJCC.Session", "ensureFinished: force cancel");
            k2Var.p(true, null);
        }
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
        gu0.k2 k2Var = this.f150710d;
        boolean z17 = k2Var != null && k2Var.f357265h;
        gu0.k2 k2Var2 = this.f150710d;
        boolean z18 = k2Var2 != null && k2Var2.f357267j;
        if (z17 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onPause: skip stop playback for edit panel");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onPause: stop playback, panelShowing=" + z17 + ", musicPanelShowing=" + z18);
        gu0.k2 k2Var3 = this.f150710d;
        if (k2Var3 != null) {
            k2Var3.w();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        hu0.l lVar = (hu0.l) U6(hu0.l.class);
        hu0.a0 a0Var = (hu0.a0) U6(hu0.a0.class);
        gu0.k2 k2Var = this.f150710d;
        boolean z17 = false;
        boolean z18 = k2Var != null && k2Var.f357266i;
        gu0.k2 k2Var2 = this.f150710d;
        boolean z19 = k2Var2 != null && k2Var2.f357265h;
        gu0.k2 k2Var3 = this.f150710d;
        boolean z27 = k2Var3 != null && k2Var3.f357267j;
        if (!z18 && !z19 && !z27) {
            z17 = true;
        }
        lVar.R6(!z18);
        a0Var.U6(!z18);
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onResume: resume playback");
            gu0.k2 k2Var4 = this.f150710d;
            if (k2Var4 != null) {
                k2Var4.t();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onResume: skip resume, applying=" + z18 + ", panelShowing=" + z19 + ", musicPanelShowing=" + z27);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        gu0.k2 k2Var = this.f150710d;
        boolean z17 = k2Var != null && k2Var.f357266i;
        gu0.k2 k2Var2 = this.f150710d;
        boolean z18 = k2Var2 != null && k2Var2.f357265h;
        gu0.k2 k2Var3 = this.f150710d;
        boolean z19 = k2Var3 != null && k2Var3.f357267j;
        if (z18 && !z19 && !z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onStart: resume playback while edit panel showing");
            gu0.k2 k2Var4 = this.f150710d;
            if (k2Var4 != null) {
                k2Var4.t();
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onStart: skip resume, applying=" + z17 + ", panelShowing=" + z18 + ", musicPanelShowing=" + z19);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        gu0.k2 k2Var = this.f150710d;
        boolean z17 = k2Var != null && k2Var.f357265h;
        gu0.k2 k2Var2 = this.f150710d;
        boolean z18 = k2Var2 != null && k2Var2.f357267j;
        if (!z17 && !z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onStop: there's no panel.");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.PreviewUI", "onStop: stop playback, panelShowing=" + z17 + ", musicPanelShowing=" + z18);
        gu0.k2 k2Var3 = this.f150710d;
        if (k2Var3 != null) {
            k2Var3.w();
        }
    }
}
