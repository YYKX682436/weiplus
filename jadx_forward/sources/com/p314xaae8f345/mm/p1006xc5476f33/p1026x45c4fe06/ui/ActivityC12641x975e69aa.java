package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI */
/* loaded from: classes7.dex */
public final class ActivityC12641x975e69aa extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1201xacc57f2c.w {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f170886d = 0;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575933m2);
        super.onCreate(bundle);
        com.p314xaae8f345.mm.ui.bk.k0(getWindow());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.b5 Vi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Vi();
        if (Vi == null) {
            finish();
            return;
        }
        int intExtra = getIntent().getIntExtra("extras_key_type", -2);
        java.lang.String stringExtra = getIntent().getStringExtra("extras_key_appid");
        java.lang.String stringExtra2 = getIntent().getStringExtra("extras_key_app_icon");
        if (intExtra == -2) {
            finish();
        } else if (intExtra == -1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a();
            aVar.f293242a = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571648lc);
            android.widget.ImageView imageView = new android.widget.ImageView(this);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bve);
            android.widget.TextView textView = new android.widget.TextView(this);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f571690mi);
            textView.setTextSize(2, 14.0f);
            textView.setTextColor(android.graphics.Color.argb(java.lang.Math.round(137.70001f), 0, 0, 0));
            textView.setLineSpacing(0.0f, 1.2f);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.addView(imageView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            ((android.view.ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = i65.a.b(this, 16);
            aVar.L = linearLayout;
            aVar.H = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x4(this);
            aVar.f293266w = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.b9a);
            aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.y4(this);
            aVar.f293265v = of5.b.a(this).getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571689mh);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z4(this);
            aVar.Z = false;
            aVar.A = false;
            aVar.B = true;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(this, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
            j0Var.e(aVar);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.d0 d0Var = aVar.f293256m;
            if (d0Var != null) {
                d0Var.a(j0Var.f293370r);
            }
            j0Var.setOnKeyListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.a5(this));
            j0Var.show();
            jx3.f.INSTANCE.d(14750, 1, Vi.f171105e);
        } else {
            yz5.a aVar2 = new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$$a
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa.f170886d;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12641x975e69aa.this.finish();
                    return null;
                }
            };
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0 s0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0.f169971a;
            if (intExtra >= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0 s0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0.f169971a;
                if (intExtra < ((java.util.List) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.s0.f169972b).mo141623x754a37bb()).size()) {
                    if (intExtra == 0) {
                        l01.d0.f396294a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.r0(this, stringExtra, intExtra, aVar2), stringExtra2, rp1.a.f479885d);
                    } else {
                        s0Var2.b(this, stringExtra, intExtra, null, aVar2);
                    }
                }
            }
            aVar2.mo152xb9724478();
        }
        Vi.h();
        Vi.f171105e = null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
