package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/lite/ui/WxaLiteAppDragHalfScreenUI;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.lite.ui.WxaLiteAppDragHalfScreenUI */
/* loaded from: classes14.dex */
public final class ActivityC16253xfe9e6fba extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {
    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559256k, com.p314xaae8f345.mm.R.C30854x2dc211.f559363co);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.FALSE);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).ek(java.lang.Boolean.TRUE);
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.bpx);
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559256k, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.f567090i40);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0 c16237x250976b0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16237x250976b0) findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = c16237x250976b0.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        android.os.Bundle bundleExtra = getIntent().getBundleExtra("bundle");
        if (bundleExtra != null) {
            int i17 = com.p314xaae8f345.mm.ui.bk.h(this).y;
            layoutParams2.height = i17 - com.p314xaae8f345.mm.ui.bk.p(this);
            double d17 = 0.75d;
            if (bundleExtra.containsKey("heightPercent")) {
                double d18 = bundleExtra.getDouble("heightPercent");
                if (d18 > 0.0d && d18 < 1.0d) {
                    d17 = d18;
                }
            }
            int i18 = (int) (i17 * (1 - d17));
            c16237x250976b0.m65877x5755d9d7(i18);
            layoutParams2.topMargin = i18;
        }
        c16237x250976b0.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.y0());
        c16237x250976b0.setClipToOutline(true);
        c16237x250976b0.m65878xde8d3e78(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.z0(this));
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38 c16266x3ede7a38 = (com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.C16266x3ede7a38) ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(this, false, false, null);
        c16266x3ede7a38.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        c16237x250976b0.addView(c16266x3ede7a38);
        c16237x250976b0.m65872xab00861a(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.a1(c16266x3ede7a38));
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14347x926d12ca);
        java.lang.String stringExtra2 = getIntent().getStringExtra(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f);
        java.lang.String stringExtra3 = getIntent().getStringExtra("query");
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("appId", stringExtra);
        bundle2.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, stringExtra2);
        bundle2.putString("query", stringExtra3);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk(c16266x3ede7a38, bundle2, false, false, null, null);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.i3z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        ((android.widget.FrameLayout) findViewById2).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.ui.b1(this));
    }
}
