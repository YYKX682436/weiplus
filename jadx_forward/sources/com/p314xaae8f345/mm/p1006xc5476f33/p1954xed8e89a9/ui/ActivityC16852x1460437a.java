package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.profile.ui.DialogContactInfoUI */
/* loaded from: classes11.dex */
public class ActivityC16852x1460437a extends com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 implements qk.c9 {
    public int V;
    public boolean W = true;
    public boolean X = false;

    @Override // qk.c9
    /* renamed from: N3 */
    public boolean getF191047v() {
        return this.X;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.AbstractActivityC21555x39071a9b, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup;
        overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559390df, com.p314xaae8f345.mm.R.C30854x2dc211.f559388dd);
        super.onCreate(bundle);
        if (!m81210x448cda5d()) {
            int k17 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(android.R.id.content);
            android.view.ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
            layoutParams.height = (k17 / 4) * 3;
            viewGroup2.setLayoutParams(layoutParams);
            android.view.Window window = getWindow();
            fq1.e eVar = fq1.e.f347040a;
            eVar.g(window.getDecorView(), i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
            window.setBackgroundDrawableResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
            window.getDecorView().setBackgroundColor(i65.a.d(this, com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            window.getDecorView().setPadding(0, 0, 0, 0);
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 80;
            window.setAttributes(attributes);
            getWindow().setLayout(-1, -2);
            setFinishOnTouchOutside(true);
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) findViewById(com.p314xaae8f345.mm.R.id.am8);
            if (c2678xa407981c != null) {
                c2678xa407981c.a(new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g() { // from class: hr3.a9$$a
                    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.e
                    public final void a(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c2, int i17) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16852x1460437a.this.V = i17;
                    }
                });
                hr3.lc lcVar = new hr3.lc(this, new yz5.a() { // from class: hr3.a9$$b
                    @Override // yz5.a
                    /* renamed from: invoke */
                    public final java.lang.Object mo152xb9724478() {
                        return java.lang.Boolean.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16852x1460437a.this.V == 0);
                    }
                });
                android.app.Activity activity = lcVar.f365294g;
                if (activity == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mActivity");
                    throw null;
                }
                android.view.View decorView = activity.getWindow().getDecorView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) decorView;
                lcVar.f365292e = viewGroup3;
                android.view.View childAt = viewGroup3.getChildAt(0);
                lcVar.f365293f = childAt;
                android.view.ViewGroup viewGroup4 = lcVar.f365292e;
                if (viewGroup4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDecorView");
                    throw null;
                }
                viewGroup4.removeView(childAt);
                lcVar.addView(lcVar.f365293f);
                android.view.ViewGroup viewGroup5 = lcVar.f365292e;
                if (viewGroup5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mDecorView");
                    throw null;
                }
                viewGroup5.addView(lcVar);
                eVar.g(lcVar.f365293f, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
                int k18 = i65.a.k(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                lcVar.f365297m = k18;
                lcVar.f365296i = k18 * 0.3f;
                eVar.g(lcVar, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 12), true, false);
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = mo78514x143f1b92().K;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.clearColorFilter();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = mo78514x143f1b92().K;
        if (c22699x3dcdb3522 != null) {
            c22699x3dcdb3522.m82037xa10c26f6(false);
        }
        mo78514x143f1b92().Q0(i65.a.i(this, com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30861xcebc809e.bdg : com.p314xaae8f345.mm.R.C30861xcebc809e.bdh));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = mo78514x143f1b92().K;
        if (c22699x3dcdb3523 != null) {
            c22699x3dcdb3523.clearColorFilter();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = mo78514x143f1b92().K;
        if (c22699x3dcdb3524 != null) {
            c22699x3dcdb3524.m82037xa10c26f6(false);
        }
        this.W = getIntent().getBooleanExtra("biz_dialog_show_header_bar", true);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c2 = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) findViewById(com.p314xaae8f345.mm.R.id.am8);
        if (c2678xa407981c2 != null) {
            c2678xa407981c2.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#AppBarLayout");
        }
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.amc);
        if (findViewById != null && this.W) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/DialogContactInfoUI", "setTagToDragBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/DialogContactInfoUI", "setTagToDragBar", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.amf);
            android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.ame);
            findViewById.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarContainer");
            findViewById2.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarLine");
            findViewById3.setTag("com.tencent.mm.plugin.profile.ui.DialogContactInfoUI#DragBarArrow");
        }
        int b17 = i65.a.b(this, 64);
        if (m81210x448cda5d() && (viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.hvf)) != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
            layoutParams2.height = b17;
            viewGroup.setLayoutParams(layoutParams2);
        }
        mo78514x143f1b92().r0(i65.a.b(this, 64), true);
        boolean booleanExtra = getIntent().getBooleanExtra("key_enter_dialog", false);
        this.X = booleanExtra;
        if (booleanExtra) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Zj(this, 46100);
        }
    }
}
