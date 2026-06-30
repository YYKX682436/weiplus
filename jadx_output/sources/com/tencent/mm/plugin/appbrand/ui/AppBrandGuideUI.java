package com.tencent.mm.plugin.appbrand.ui;

@db5.a(7)
/* loaded from: classes7.dex */
public final class AppBrandGuideUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.appbrand.ui.banner.w {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f89353d = 0;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494400m2);
        super.onCreate(bundle);
        com.tencent.mm.ui.bk.k0(getWindow());
        com.tencent.mm.plugin.appbrand.ui.b5 Vi = com.tencent.mm.plugin.appbrand.app.r9.Vi();
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
            com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
            aVar.f211709a = of5.b.a(this).getString(com.tencent.mm.R.string.f490115lc);
            android.widget.ImageView imageView = new android.widget.ImageView(this);
            imageView.setImageResource(com.tencent.mm.R.drawable.bve);
            android.widget.TextView textView = new android.widget.TextView(this);
            textView.setText(com.tencent.mm.R.string.f490157mi);
            textView.setTextSize(2, 14.0f);
            textView.setTextColor(android.graphics.Color.argb(java.lang.Math.round(137.70001f), 0, 0, 0));
            textView.setLineSpacing(0.0f, 1.2f);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(this);
            linearLayout.setOrientation(1);
            linearLayout.addView(imageView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            linearLayout.addView(textView, new android.widget.LinearLayout.LayoutParams(-1, -2));
            ((android.view.ViewGroup.MarginLayoutParams) textView.getLayoutParams()).topMargin = i65.a.b(this, 16);
            aVar.L = linearLayout;
            aVar.H = new com.tencent.mm.plugin.appbrand.ui.x4(this);
            aVar.f211733w = of5.b.a(this).getString(com.tencent.mm.R.string.b9a);
            aVar.F = new com.tencent.mm.plugin.appbrand.ui.y4(this);
            aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.f490156mh);
            aVar.E = new com.tencent.mm.plugin.appbrand.ui.z4(this);
            aVar.Z = false;
            aVar.A = false;
            aVar.B = true;
            com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
            j0Var.e(aVar);
            com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
            if (d0Var != null) {
                d0Var.a(j0Var.f211837r);
            }
            j0Var.setOnKeyListener(new com.tencent.mm.plugin.appbrand.ui.a5(this));
            j0Var.show();
            jx3.f.INSTANCE.d(14750, 1, Vi.f89572e);
        } else {
            yz5.a aVar2 = new yz5.a() { // from class: com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI$$a
                @Override // yz5.a
                public final java.lang.Object invoke() {
                    int i17 = com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.f89353d;
                    com.tencent.mm.plugin.appbrand.ui.AppBrandGuideUI.this.finish();
                    return null;
                }
            };
            com.tencent.mm.plugin.appbrand.s0 s0Var = com.tencent.mm.plugin.appbrand.s0.f88438a;
            if (intExtra >= 0) {
                com.tencent.mm.plugin.appbrand.s0 s0Var2 = com.tencent.mm.plugin.appbrand.s0.f88438a;
                if (intExtra < ((java.util.List) ((jz5.n) com.tencent.mm.plugin.appbrand.s0.f88439b).getValue()).size()) {
                    if (intExtra == 0) {
                        l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.r0(this, stringExtra, intExtra, aVar2), stringExtra2, rp1.a.f398352d);
                    } else {
                        s0Var2.b(this, stringExtra, intExtra, null, aVar2);
                    }
                }
            }
            aVar2.invoke();
        }
        Vi.h();
        Vi.f89572e = null;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
