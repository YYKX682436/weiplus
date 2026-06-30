package com.p314xaae8f345.mm.p2470x93e71c27.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "com/tencent/mm/pluginsdk/ui/v0", "app_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI */
/* loaded from: classes8.dex */
public final class ActivityC19638x462df501 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f271300i = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f271301d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f271302e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f271303f = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final android.content.Intent f271304g = new android.content.Intent();

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f271305h = "";

    public final void U6() {
        long j17;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        e45.t tVar = (e45.t) pf5.z.f435481a.a(mo55332x76847179).a(e45.t.class);
        int size = this.f271303f.size();
        if (size <= 0) {
            android.widget.TextView textView = tVar.f330960d;
            if (textView != null) {
                textView.setVisibility(4);
            }
        } else {
            android.widget.TextView textView2 = tVar.f330960d;
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = tVar.f330960d;
            if (textView3 != null) {
                textView3.setText(tVar.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dcy, java.lang.Integer.valueOf(size)));
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.taj);
        if (!((d40.n) ((e40.v) i95.n0.c(e40.v.class))).wi()) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
            return;
        }
        long j18 = 0;
        for (com.p314xaae8f345.mm.p2470x93e71c27.ui.v0 v0Var : this.f271303f) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var = v0Var.f273562d;
            if (!(d2Var != null && d2Var.f273101l)) {
                int h17 = v0Var.h();
                if (h17 == 1) {
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.d2 d2Var2 = v0Var.f273562d;
                    if (d2Var2 != null) {
                        j17 = d2Var2.f273099j;
                    }
                } else if (h17 == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = v0Var.f273563e;
                    j17 = com.p314xaae8f345.mm.vfs.w6.k(abstractC15633xee433078 != null ? abstractC15633xee433078.f219963e : null);
                }
                j18 += j17;
            }
            j17 = 0;
            j18 += j17;
        }
        if (j18 > ip.c.k()) {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
        } else {
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(8);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).i("INTENT_KEY_DATA_LIST", this.f271303f);
        android.content.Intent intent = this.f271304g;
        intent.putExtra("RESULT_KEY_LAST_SELECTED_TAB", getIntent().getIntExtra("INTENT_KEY_LAST_SELECTED_TAB", 0));
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.vfh);
        intent.putExtra("RESULT_KEY_IS_NEED_CLEAN", checkBox != null ? checkBox.isChecked() : getIntent().getBooleanExtra("INTENT_KEY_IS_NEED_CLEAN", true));
        setResult(-1, intent);
        super.finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569466dm;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.j(mo43419xa59964ef, e45.t.class);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        o25.n1.f(this);
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        java.lang.Object b17 = c01.n2.d().c("KEY_DARA_CENTER_FILE_SELECTOR_SELECTED_FILE_LIST", true).b("INTENT_KEY_DATA_LIST");
        java.util.ArrayList arrayList = b17 instanceof java.util.ArrayList ? (java.util.ArrayList) b17 : null;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        this.f271303f = arrayList;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById(com.p314xaae8f345.mm.R.id.lqa);
        this.f271301d = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(this, 1, false));
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.pluginsdk.ui.FileSelectorPreviewUI$buildItemConverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new com.p314xaae8f345.mm.p2470x93e71c27.ui.u0(new com.p314xaae8f345.mm.p2470x93e71c27.ui.w0(com.p314xaae8f345.mm.p2470x93e71c27.ui.ActivityC19638x462df501.this));
            }
        }, this.f271303f, false);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.f271301d;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7960x6cab2c8d(c22848x6ddd90cf);
        }
        if (getIntent().getBooleanExtra("INTENT_KEY_SCROLL_TO_LAST", false)) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d253 = this.f271301d;
            int mo1894x7e414b06 = (c22849x81a93d253 == null || (mo7946xf939df19 = c22849x81a93d253.mo7946xf939df19()) == null) ? 0 : mo7946xf939df19.mo1894x7e414b06();
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d254 = this.f271301d;
            if (c22849x81a93d254 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(mo1894x7e414b06 - 1));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c22849x81a93d254, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
                c22849x81a93d254.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c22849x81a93d254, "com/tencent/mm/pluginsdk/ui/FileSelectorPreviewUI", "onCreate", "(Landroid/os/Bundle;)V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        this.f271302e = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.qxd);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById(com.p314xaae8f345.mm.R.id.owo);
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.C30864xbddafb2a.ac9);
            if (findViewById == null) {
                findViewById = android.view.LayoutInflater.from(mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ac9, (android.view.ViewGroup) null);
            }
            frameLayout.addView(findViewById);
            android.view.View findViewById2 = findViewById.findViewById(com.p314xaae8f345.mm.R.id.smz);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.x0(this));
            }
        }
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.hhc);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.y0(this));
        }
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.vfh);
        if (checkBox != null) {
            checkBox.setChecked(getIntent().getBooleanExtra("INTENT_KEY_IS_NEED_CLEAN", true));
        }
        android.widget.TextView textView = this.f271302e;
        if (textView != null) {
            textView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f271303f) ? 0 : 8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d255 = this.f271301d;
        if (c22849x81a93d255 == null) {
            return;
        }
        c22849x81a93d255.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f271303f) ? 8 : 0);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271305h)) {
            java.lang.String stringExtra = getIntent().getStringExtra("INTENT_KEY_ACTION_BUTTON_TEXT");
            if (stringExtra == null) {
                stringExtra = "";
            }
            this.f271305h = stringExtra;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f271305h);
    }
}
