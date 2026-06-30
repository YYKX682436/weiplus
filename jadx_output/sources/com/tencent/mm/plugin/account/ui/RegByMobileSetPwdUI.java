package com.tencent.mm.plugin.account.ui;

/* loaded from: classes11.dex */
public class RegByMobileSetPwdUI extends com.tencent.mm.plugin.account.ui.SetPwdUI {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f73603y = 0;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f73604i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f73605m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f73606n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f73607o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f73608p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f73609q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.EditText f73610r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f73613u;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f73611s = null;

    /* renamed from: t, reason: collision with root package name */
    public boolean f73612t = false;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f73614v = null;

    /* renamed from: w, reason: collision with root package name */
    public int f73615w = 0;

    /* renamed from: x, reason: collision with root package name */
    public r45.cu5 f73616x = null;

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public com.tencent.mm.modelbase.m1 a7() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f73614v)) {
            this.f73614v = (java.lang.String) gm0.j1.u().c().l(77830, null);
        }
        return new com.tencent.mm.modelsimple.f1(this.f73649e, this.f73614v, this.f73615w, this.f73616x);
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public void b7() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f73614v)) {
            i7();
        } else {
            if (!this.f73613u) {
                i7();
                return;
            }
            gm0.j1.d().g(new com.tencent.mm.modelsimple.l1(1, this.f73610r.getText().toString(), "", "", "", false));
            this.f73651g = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490552yb), true, false, null);
        }
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public java.lang.String c7() {
        return ((android.widget.EditText) findViewById(com.tencent.mm.R.id.f486594ls5)).getText().toString();
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public java.lang.String d7() {
        return ((android.widget.EditText) findViewById(com.tencent.mm.R.id.f486593ls4)).getText().toString();
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public boolean f7(int i17, int i18, java.lang.String str) {
        if (i17 != 0 || i18 != 0) {
            return e7(i17, i18, str);
        }
        setResult(-1);
        finish();
        return true;
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI
    public void g7(c71.a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            db5.e1.i(this, com.tencent.mm.R.string.hwv, com.tencent.mm.R.string.hwx);
            return;
        }
        if (ordinal == 1) {
            db5.e1.i(this, com.tencent.mm.R.string.hww, com.tencent.mm.R.string.hwx);
        } else if (ordinal == 2) {
            db5.e1.i(this, com.tencent.mm.R.string.k69, com.tencent.mm.R.string.hwx);
        } else {
            if (ordinal != 3) {
                return;
            }
            db5.e1.i(this, com.tencent.mm.R.string.k66, com.tencent.mm.R.string.hwx);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cds;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        java.lang.String str;
        if (!this.f73652h) {
            showMMLogo();
        }
        setMMTitle(com.tencent.mm.R.string.hx_);
        this.f73605m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ovg);
        this.f73607o = findViewById(com.tencent.mm.R.id.f482391da);
        this.f73604i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f486589ls0);
        this.f73608p = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f482422e4);
        java.lang.String str2 = this.f73611s;
        if (str2 != null && str2.length() > 0) {
            this.f73604i.setText(this.f73611s);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.lry);
        this.f73609q = findViewById;
        this.f73610r = (android.widget.EditText) findViewById.findViewById(com.tencent.mm.R.id.f486592ls3);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.gcx);
        this.f73606n = findViewById2;
        findViewById2.setOnClickListener(new com.tencent.mm.plugin.account.ui.fg(this));
        if (this.f73612t || !gm0.j1.b().m()) {
            android.view.View view = this.f73607o;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = this.f73607o;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.String c17 = c01.z1.c();
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                c17 = c01.z1.r();
                if (com.tencent.mm.storage.z3.y3(c17)) {
                    c17 = null;
                }
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                java.lang.String str3 = (java.lang.String) gm0.j1.u().c().l(6, null);
                java.lang.String str4 = (java.lang.String) gm0.j1.u().c().l(5, null);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                    if (com.tencent.mm.sdk.platformtools.t8.Q0(str3).booleanValue()) {
                        com.tencent.mm.sdk.platformtools.c5 c5Var = new com.tencent.mm.sdk.platformtools.c5();
                        if (str3.startsWith("+")) {
                            str3 = str3.replace("+", "");
                            str = com.tencent.mm.sdk.platformtools.c5.c(str3);
                            if (str != null) {
                                str3 = str3.substring(str.length());
                            }
                        } else {
                            str = "86";
                        }
                        java.lang.String f17 = c5Var.f(str, str3);
                        this.f73608p.setText(com.tencent.mm.R.string.isz);
                        this.f73605m.setText(f17);
                    }
                    this.f73604i.setText(com.tencent.mm.R.string.hxb);
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    android.view.View view3 = this.f73607o;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    this.f73605m.setText(str4);
                    this.f73608p.setText(com.tencent.mm.R.string.iqi);
                    this.f73604i.setText(com.tencent.mm.R.string.hxa);
                }
            } else {
                this.f73608p.setText(com.tencent.mm.R.string.j0q);
                this.f73605m.setText(c17);
            }
        }
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.khv);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.kpv);
        android.widget.TextView textView3 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.c_y);
        android.widget.EditText editText = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f486594ls5);
        android.widget.EditText editText2 = (android.widget.EditText) findViewById(com.tencent.mm.R.id.f486593ls4);
        if (!com.tencent.mm.sdk.platformtools.m2.j()) {
            textView.setTextSize(1, 14.0f);
            textView2.setTextSize(1, 14.0f);
            textView3.setTextSize(1, 14.0f);
            editText.setTextSize(1, 14.0f);
            editText2.setTextSize(1, 14.0f);
        }
        float measureText = this.f73608p.getPaint().measureText(this.f73608p.getText().toString());
        int max = (int) java.lang.Math.max(java.lang.Math.max(java.lang.Math.max(measureText, textView2.getPaint().measureText(textView2.getText().toString())), textView3.getPaint().measureText(textView3.getText().toString())), textView.getPaint().measureText(textView.getText().toString()));
        textView.setWidth(max);
        this.f73608p.setWidth(max);
        textView2.setWidth(max);
        textView2.setWidth(max);
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI, com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f73611s = getIntent().getStringExtra("kintent_hint");
        this.f73652h = getIntent().getBooleanExtra("kintent_cancelable", true);
        this.f73612t = getIntent().getBooleanExtra("from_unbind", false);
        gm0.j1.d().a(384, this);
        gm0.j1.d().a(255, this);
        initView();
        byte[] h17 = com.tencent.mm.sdk.platformtools.t8.h(c01.h9.a().getString("_auth_key", ""));
        r45.nc ncVar = new r45.nc();
        if (com.tencent.mm.sdk.platformtools.t8.M0(h17)) {
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(new byte[0]);
            this.f73616x = cu5Var;
        } else {
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(h17);
            this.f73616x = cu5Var2;
            try {
                ncVar.parseFrom(h17);
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicorMsg.RegByMobileSetPwdUI", e17, "summersetpwd Failed parse autoauthkey buf", new java.lang.Object[0]);
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("setpwd_ticket");
        com.tencent.mars.xlog.Log.i("MicorMsg.RegByMobileSetPwdUI", "get reset pwd ticket %s", stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            gm0.j1.d().g(new com.tencent.mm.modelsimple.w0(1));
            this.f73651g = db5.e1.Q(this, getString(com.tencent.mm.R.string.f490573yv), getString(com.tencent.mm.R.string.f490468vx), true, false, null);
            return;
        }
        this.f73614v = stringExtra;
        this.f73615w = getIntent().getIntExtra("setpwd_ticket_type", 6);
        android.view.View view = this.f73609q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f73606n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(384, this);
        gm0.j1.d().q(255, this);
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.lang.String stringExtra = intent.getStringExtra("setpwd_ticket");
        com.tencent.mars.xlog.Log.i("MicorMsg.RegByMobileSetPwdUI", "onNewIntent get reset pwd ticket %s", stringExtra);
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        this.f73614v = stringExtra;
        this.f73615w = 4;
        android.view.View view = this.f73609q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f73606n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onNewIntent", "(Landroid/content/Intent;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.plugin.account.ui.SetPwdUI, com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicorMsg.RegByMobileSetPwdUI", "errorCode %d, errorMsg %s, scene %s", java.lang.Integer.valueOf(i18), str, m1Var);
        super.onSceneEnd(i17, i18, str, m1Var);
        if (m1Var.getType() != 255) {
            if (m1Var.getType() == 384) {
                if (i17 != 0 || i18 != 0) {
                    db5.e1.i(this, com.tencent.mm.R.string.hx6, com.tencent.mm.R.string.f490573yv);
                    return;
                } else {
                    gm0.j1.u().c().w(77830, ((com.tencent.mm.modelsimple.l1) m1Var).H());
                    i7();
                    return;
                }
            }
            return;
        }
        if (((com.tencent.mm.modelsimple.w0) m1Var).f71445g == 1) {
            if (i17 == 0 && i18 == 0) {
                android.view.View view = this.f73609q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view2 = this.f73606n;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f73613u = true;
                return;
            }
            if (i18 == -3 && i17 == 4) {
                this.f73613u = false;
                return;
            }
            android.view.View view3 = this.f73609q;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = this.f73606n;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/account/ui/RegByMobileSetPwdUI", "onSceneEnd", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                com.tencent.mars.xlog.Log.i("MicorMsg.RegByMobileSetPwdUI", "summertips errCode[%d], showType[%d], url[%s], desc[%s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(b17.f420400c), b17.f420398a, b17.f420399b);
                db5.e1.G(this, b17.f420399b, b17.f420401d, false, new com.tencent.mm.plugin.account.ui.gg(this));
            }
        }
    }
}
