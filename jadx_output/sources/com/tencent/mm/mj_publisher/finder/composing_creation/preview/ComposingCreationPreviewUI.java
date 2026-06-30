package com.tencent.mm.mj_publisher.finder.composing_creation.preview;

@db5.a(4099)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/composing_creation/preview/ComposingCreationPreviewUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class ComposingCreationPreviewUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f69176e = 0;

    /* renamed from: d, reason: collision with root package name */
    public gu0.k2 f69177d;

    public final com.tencent.mm.ui.component.UIComponent U6(java.lang.Class cls) {
        androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(this).a(cls);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (com.tencent.mm.ui.component.UIComponent) a17;
    }

    public final void V6() {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.f211729s = getString(com.tencent.mm.R.string.o_a);
        aVar.f211732v = getString(com.tencent.mm.R.string.o__);
        aVar.W = getResources().getColor(com.tencent.mm.R.color.Red_100);
        aVar.f211733w = getString(com.tencent.mm.R.string.o_9);
        aVar.F = gu0.q.f275791d;
        aVar.E = new gu0.s(this);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.e6d;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{hu0.a0.class, hu0.l.class, hu0.o.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        V6();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        eu0.b bVar;
        eu0.b bVar2;
        boolean z17 = true;
        supportRequestWindowFeature(1);
        getWindow().clearFlags(67108864);
        getWindow().clearFlags(134217728);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        ug5.x.e(getWindow(), -16777216);
        getWindow().getDecorView().setSystemUiVisibility(9984);
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onCreate");
        setSelfNavigationBarVisible(8);
        getController().G0(-1);
        getController().E0(0);
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.sxh);
        findViewById.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(findViewById, true);
        gu0.k2 k2Var = gu0.l2.f275761a;
        this.f69177d = k2Var;
        if (k2Var == null) {
            com.tencent.mars.xlog.Log.e("MJCC.PreviewUI", "onCreate: session is null, finish");
            finish();
            return;
        }
        java.lang.String string = kotlin.jvm.internal.o.b((k2Var == null || (bVar2 = k2Var.f275725a) == null) ? null : bVar2.f256695a, "reedit") ? getString(com.tencent.mm.R.string.o_c) : getString(com.tencent.mm.R.string.o_d);
        kotlin.jvm.internal.o.d(string);
        ((android.widget.TextView) findViewById(com.tencent.mm.R.id.soj)).setText(string);
        findViewById(com.tencent.mm.R.id.sod).setOnClickListener(new gu0.m(this));
        hu0.a0 a0Var = (hu0.a0) U6(hu0.a0.class);
        hu0.l lVar = (hu0.l) U6(hu0.l.class);
        hu0.o oVar = (hu0.o) U6(hu0.o.class);
        gu0.k2 k2Var2 = this.f69177d;
        if (k2Var2 != null) {
            k2Var2.f275730f = new gu0.h(this, a0Var);
        }
        if (k2Var2 != null) {
            k2Var2.f275731g = new gu0.k(this, oVar, lVar, a0Var);
        }
        lVar.f285041h = new gu0.l(this);
        hu0.o oVar2 = (hu0.o) U6(hu0.o.class);
        hu0.a0 a0Var2 = (hu0.a0) U6(hu0.a0.class);
        hu0.l lVar2 = (hu0.l) U6(hu0.l.class);
        oVar2.Q6();
        lVar2.R6(false);
        a0Var2.U6(false);
        gu0.k2 k2Var3 = this.f69177d;
        boolean b17 = kotlin.jvm.internal.o.b((k2Var3 == null || (bVar = k2Var3.f275725a) == null) ? null : bVar.f256695a, "reedit");
        java.lang.String str = "effectsInfos";
        if (!b17) {
            gu0.k2 k2Var4 = this.f69177d;
            if (k2Var4 != null) {
                gu0.y yVar = new gu0.y(oVar2, this, a0Var2, lVar2);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preparePreview: params=");
                eu0.b bVar3 = k2Var4.f275725a;
                sb6.append(bVar3);
                com.tencent.mars.xlog.Log.i("MJCC.Session", sb6.toString());
                java.lang.String str2 = bVar3.f256697c;
                if (str2 == null || str2.length() == 0) {
                    str = "prompt";
                } else {
                    java.lang.String str3 = bVar3.f256698d;
                    if (str3 == null || str3.length() == 0) {
                        str = "aigcTaskID";
                    } else {
                        java.util.List list = bVar3.f256699e;
                        if (list == null || list.isEmpty()) {
                            str = "assetInfos";
                        } else {
                            java.util.List list2 = bVar3.f256700f;
                            if (!(list2 == null || list2.isEmpty())) {
                                java.lang.String str4 = bVar3.f256696b;
                                if (str4 != null && str4.length() != 0) {
                                    z17 = false;
                                }
                                str = z17 ? "transitionID" : null;
                            }
                        }
                    }
                }
                if (str == null) {
                    kotlinx.coroutines.l.d(k2Var4.f275728d, null, null, new gu0.e1(k2Var4, yVar, null), 3, null);
                    return;
                }
                com.tencent.mars.xlog.Log.e("MJCC.Session", "preparePreview: required param '" + str + "' is missing");
                yVar.invoke("Required param missing: ".concat(str));
                return;
            }
            return;
        }
        gu0.k2 k2Var5 = this.f69177d;
        if (k2Var5 != null) {
            gu0.v vVar = new gu0.v(oVar2, this, a0Var2, lVar2);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("prepareReeditPreview: params=");
            eu0.b bVar4 = k2Var5.f275725a;
            sb7.append(bVar4);
            com.tencent.mars.xlog.Log.i("MJCC.Session", sb7.toString());
            java.lang.String str5 = bVar4.f256697c;
            if (str5 == null || str5.length() == 0) {
                str = "prompt";
            } else {
                java.util.List list3 = bVar4.f256699e;
                if (list3 == null || list3.isEmpty()) {
                    str = "assetInfos";
                } else {
                    java.util.List list4 = bVar4.f256700f;
                    if (!(list4 == null || list4.isEmpty())) {
                        java.lang.String str6 = bVar4.f256706l;
                        if (str6 == null || str6.length() == 0) {
                            str = "templateURL";
                        } else {
                            java.lang.String str7 = bVar4.f256707m;
                            if (str7 == null || str7.length() == 0) {
                                str = "templateID";
                            } else {
                                java.lang.String str8 = bVar4.f256698d;
                                if (str8 == null || str8.length() == 0) {
                                    str = "aigcTaskID";
                                } else {
                                    java.lang.String str9 = bVar4.f256705k;
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
                kotlinx.coroutines.l.d(k2Var5.f275728d, null, null, new gu0.f1(k2Var5, vVar, null), 3, null);
                return;
            }
            com.tencent.mars.xlog.Log.e("MJCC.Session", "prepareReeditPreview: required param '" + str + "' is missing");
            vVar.invoke("Required param missing: ".concat(str));
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onDestroy");
        gu0.k2 k2Var = this.f69177d;
        if (k2Var != null && !k2Var.f275729e) {
            com.tencent.mars.xlog.Log.w("MJCC.Session", "ensureFinished: force cancel");
            k2Var.p(true, null);
        }
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
        gu0.k2 k2Var = this.f69177d;
        boolean z17 = k2Var != null && k2Var.f275732h;
        gu0.k2 k2Var2 = this.f69177d;
        boolean z18 = k2Var2 != null && k2Var2.f275734j;
        if (z17 && !z18) {
            com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onPause: skip stop playback for edit panel");
            return;
        }
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onPause: stop playback, panelShowing=" + z17 + ", musicPanelShowing=" + z18);
        gu0.k2 k2Var3 = this.f69177d;
        if (k2Var3 != null) {
            k2Var3.w();
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
        hu0.l lVar = (hu0.l) U6(hu0.l.class);
        hu0.a0 a0Var = (hu0.a0) U6(hu0.a0.class);
        gu0.k2 k2Var = this.f69177d;
        boolean z17 = false;
        boolean z18 = k2Var != null && k2Var.f275733i;
        gu0.k2 k2Var2 = this.f69177d;
        boolean z19 = k2Var2 != null && k2Var2.f275732h;
        gu0.k2 k2Var3 = this.f69177d;
        boolean z27 = k2Var3 != null && k2Var3.f275734j;
        if (!z18 && !z19 && !z27) {
            z17 = true;
        }
        lVar.R6(!z18);
        a0Var.U6(!z18);
        if (z17) {
            com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onResume: resume playback");
            gu0.k2 k2Var4 = this.f69177d;
            if (k2Var4 != null) {
                k2Var4.t();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onResume: skip resume, applying=" + z18 + ", panelShowing=" + z19 + ", musicPanelShowing=" + z27);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        gu0.k2 k2Var = this.f69177d;
        boolean z17 = k2Var != null && k2Var.f275733i;
        gu0.k2 k2Var2 = this.f69177d;
        boolean z18 = k2Var2 != null && k2Var2.f275732h;
        gu0.k2 k2Var3 = this.f69177d;
        boolean z19 = k2Var3 != null && k2Var3.f275734j;
        if (z18 && !z19 && !z17) {
            com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onStart: resume playback while edit panel showing");
            gu0.k2 k2Var4 = this.f69177d;
            if (k2Var4 != null) {
                k2Var4.t();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onStart: skip resume, applying=" + z17 + ", panelShowing=" + z18 + ", musicPanelShowing=" + z19);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        gu0.k2 k2Var = this.f69177d;
        boolean z17 = k2Var != null && k2Var.f275732h;
        gu0.k2 k2Var2 = this.f69177d;
        boolean z18 = k2Var2 != null && k2Var2.f275734j;
        if (!z17 && !z18) {
            com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onStop: there's no panel.");
            return;
        }
        com.tencent.mars.xlog.Log.i("MJCC.PreviewUI", "onStop: stop playback, panelShowing=" + z17 + ", musicPanelShowing=" + z18);
        gu0.k2 k2Var3 = this.f69177d;
        if (k2Var3 != null) {
            k2Var3.w();
        }
    }
}
