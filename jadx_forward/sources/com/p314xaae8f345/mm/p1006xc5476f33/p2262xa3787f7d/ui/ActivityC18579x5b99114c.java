package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeIntro */
/* loaded from: classes.dex */
public class ActivityC18579x5b99114c extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f254378h = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f254379d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.CheckBox f254380e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f254381f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f254382g;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return c01.e2.a0() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.env : com.p314xaae8f345.mm.R.C30864xbddafb2a.cm7;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        mo54450xbf7c1df6("");
        mo78530x8b45058f();
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        boolean booleanExtra = getIntent().getBooleanExtra("IntentKey_ForceDisplay", false);
        xh4.x.f536177b = booleanExtra;
        if (booleanExtra) {
            m78560xe21cbbf(false);
            if (m78735x28280f95() != null) {
                m78735x28280f95().m81450x8e764904(false);
            }
        }
        java.lang.String stringExtra = getIntent().getStringExtra("IntentKey_DeadlineWord");
        if (c01.e2.a0() && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.vcl);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeIntro", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.vcm);
            if (textView != null) {
                textView.setText(stringExtra);
            }
        }
        this.f254382g = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.odf);
        java.lang.String stringExtra2 = getIntent().getStringExtra("IntentKey_Title");
        com.p314xaae8f345.mm.ui.fk.b(this.f254382g);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            this.f254382g.setText(stringExtra2);
        }
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.nzr);
        this.f254379d = button;
        button.setEnabled(false);
        this.f254379d.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.k3(this));
        android.widget.CheckBox checkBox = (android.widget.CheckBox) findViewById(com.p314xaae8f345.mm.R.id.hun);
        this.f254380e = checkBox;
        checkBox.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.m3(this));
        this.f254380e.setOnCheckedChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.n3(this));
        java.lang.String string = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrr);
        java.lang.String string2 = getString(com.p314xaae8f345.mm.R.C30867xcad56011.jrs);
        int lastIndexOf = string.lastIndexOf(string2);
        if (lastIndexOf < 0) {
            return;
        }
        int length = string2.length() + lastIndexOf;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(string);
        spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.o3(this, 1, null), lastIndexOf, length, 18);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.huo);
        this.f254381f = textView2;
        textView2.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this));
        this.f254381f.setClickable(true);
        this.f254381f.setText(spannableStringBuilder);
        mo74406x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.p3(this), getIntent().getIntExtra("IntentKey_BackIconRes", 0));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        if (xh4.x.f536177b) {
            return;
        }
        super.onBackPressed();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo54450xbf7c1df6("");
        mo43517x10010bd5();
    }

    @Override // android.view.Window.Callback
    public void onPointerCaptureChanged(boolean z17) {
    }
}
