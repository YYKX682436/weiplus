package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.AlertActivity */
/* loaded from: classes14.dex */
public class ActivityC21340x254df46b extends p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 {

    /* renamed from: m, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 f278089m;

    /* renamed from: n, reason: collision with root package name */
    public static db5.g7 f278090n;

    /* renamed from: o, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 f278091o;

    /* renamed from: p, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 f278092p;

    /* renamed from: q, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 f278093q;

    /* renamed from: r, reason: collision with root package name */
    public static al5.t4 f278094r;

    /* renamed from: d, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f278095d;

    /* renamed from: e, reason: collision with root package name */
    public android.content.DialogInterface.OnCancelListener f278096e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q3 f278097f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.r3 f278098g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f278099h = false;

    /* renamed from: i, reason: collision with root package name */
    public int f278100i = 1;

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        super.onCreate(bundle);
        boolean z17 = false;
        overridePendingTransition(0, 0);
        getWindow().getDecorView().setSystemUiVisibility(cc1.y.f4296x366c91de);
        int i17 = android.os.Build.VERSION.SDK_INT;
        getWindow().setStatusBarColor(getResources().getColor(android.R.color.transparent));
        this.f278099h = getIntent().getBooleanExtra("dialog_show_top", false);
        int intExtra = getIntent().getIntExtra("dialog_scene", 1);
        this.f278100i = intExtra;
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.AlertActivity", "show alert, scene:%s", java.lang.Integer.valueOf(intExtra));
        int i18 = this.f278100i;
        if (i18 == 1) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = f278089m;
            if (i0Var == null) {
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "mBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            i0Var.f293353a = this;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            this.f278095d = aVar.H;
            this.f278096e = aVar.G;
            aVar.H = new com.p314xaae8f345.mm.ui.v(this);
            aVar.G = new com.p314xaae8f345.mm.ui.w(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
            if (this.f278099h && (window = a17.getWindow()) != null) {
                if (i17 >= 26) {
                    window.setType(2038);
                } else {
                    window.setType(2002);
                }
                com.p314xaae8f345.mm.ui.yk.a("MicroMsg.AlertActivity", "show top window not null!!", new java.lang.Object[0]);
            }
            a17.show();
            if (a17.isShowing()) {
                return;
            }
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
            finish();
            return;
        }
        if (i18 == 2) {
            db5.g7 g7Var = f278090n;
            if (g7Var == null) {
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "mTipsBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            g7Var.f309884b = this;
            com.p314xaae8f345.mm.ui.vj vjVar = g7Var.f309885c;
            this.f278095d = vjVar.f292700f;
            vjVar.f292700f = new com.p314xaae8f345.mm.ui.x(this);
            vjVar.f292701g = new com.p314xaae8f345.mm.ui.y(this);
            db5.h7 a18 = g7Var.a();
            a18.show();
            if (a18.isShowing()) {
                return;
            }
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
            finish();
            return;
        }
        if (i18 == 3) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o3 o3Var = f278091o;
            if (o3Var != null) {
                o3Var.f293471a = this;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.h hVar = o3Var.f293472b;
                this.f278097f = hVar.f293347k;
                this.f278098g = hVar.f293346j;
                hVar.f293347k = new com.p314xaae8f345.mm.ui.z(this);
                hVar.f293346j = new com.p314xaae8f345.mm.ui.a0(this);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 a19 = o3Var.a();
                a19.C();
                if (a19.h()) {
                    return;
                }
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            return;
        }
        if (i18 == 4) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var = f278092p;
            if (t3Var != null) {
                t3Var.f293514b = this;
                this.f278096e = t3Var.f293522j;
                t3Var.f293522j = new com.p314xaae8f345.mm.ui.b0(this);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 a27 = t3Var.a();
                if (!f278092p.f293520h) {
                    a27.show();
                }
                if (!a27.isShowing()) {
                    com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "show dialog FAILED, finish AlertActivity!", new java.lang.Object[0]);
                    finish();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t3 t3Var2 = f278092p;
                t3Var2.f293519g = new com.p314xaae8f345.mm.ui.c0(this, a27);
                android.content.DialogInterface.OnDismissListener onDismissListener = t3Var2.f293521i;
                if (onDismissListener != null) {
                    a27.setOnDismissListener(onDismissListener);
                }
                android.content.DialogInterface.OnCancelListener onCancelListener = f278092p.f293522j;
                if (onCancelListener != null) {
                    a27.setOnCancelListener(onCancelListener);
                }
                android.content.DialogInterface.OnShowListener onShowListener = f278092p.f293523k;
                if (onShowListener != null) {
                    a27.setOnShowListener(onShowListener);
                }
                android.content.DialogInterface.OnKeyListener onKeyListener = f278092p.f293524l;
                if (onKeyListener != null) {
                    a27.setOnKeyListener(onKeyListener);
                    return;
                }
                return;
            }
            return;
        }
        if (i18 == 5) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = f278093q;
            if (e4Var == null) {
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "mWeToastBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            e4Var.f293308b = this;
            this.f278096e = e4Var.f293314h;
            this.f278095d = e4Var.f293315i;
            e4Var.f293314h = new com.p314xaae8f345.mm.ui.e0(this);
            e4Var.f293315i = new com.p314xaae8f345.mm.ui.s(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 a28 = e4Var.a();
            a28.show();
            int i19 = f278093q.f293313g;
            if (i19 == 0 || i19 == 1) {
                new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.t(this, a28), 2000L);
            }
            if (a28.isShowing()) {
                return;
            }
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "show wetoast FAILED, finish AlertActivity!", new java.lang.Object[0]);
            finish();
            return;
        }
        if (i18 == 6) {
            al5.t4 t4Var = f278094r;
            if (t4Var == null) {
                com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "mSnackBarBuilder is null, finish AlertActivity!", new java.lang.Object[0]);
                finish();
                return;
            }
            t4Var.f87574d = this;
            t4Var.f87583m = false;
            new android.os.Handler().postDelayed(new com.p314xaae8f345.mm.ui.u(this), 2000L);
            java.lang.String stringExtra = getIntent().getStringExtra("INTENT_SNACK_BAR_FORWARD_USERNAME");
            java.lang.String stringExtra2 = getIntent().getStringExtra("INTENT_SNACK_BAR_FROM_USERNAME");
            if (stringExtra != null) {
                int length = stringExtra.length();
                int i27 = 0;
                while (true) {
                    if (i27 >= length) {
                        z17 = true;
                        break;
                    }
                    int codePointAt = stringExtra.codePointAt(i27);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        break;
                    } else {
                        i27 += java.lang.Character.charCount(codePointAt);
                    }
                }
                if (!z17) {
                    al5.t4 t4Var2 = f278094r;
                    t4Var2.a(getString(com.p314xaae8f345.mm.R.C30867xcad56011.oei));
                    t4Var2.h(stringExtra, stringExtra2);
                    return;
                }
            }
            f278094r.h(null, stringExtra2);
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f278089m = null;
        f278090n = null;
        f278091o = null;
        f278092p = null;
        f278093q = null;
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        overridePendingTransition(0, 0);
        super.onPause();
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        if (f278089m == null && f278090n == null && f278091o == null && f278092p == null && f278093q == null && f278094r == null) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.AlertActivity", "AlertActivity onResume() with null mBuilder, exiting this transparent proxy activity...", new java.lang.Object[0]);
            finish();
        }
    }
}
