package fl1;

/* loaded from: classes7.dex */
public final class s implements fl1.e2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f345387d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f345388e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f345389f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f345390g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f345391h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f345392i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 f345393m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f345394n;

    /* renamed from: o, reason: collision with root package name */
    public fl1.j2 f345395o;

    public s(android.content.Context context, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f345387d = context;
        this.f345388e = view;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.oud);
        this.f345389f = findViewById;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ouc);
        this.f345390g = textView;
        this.f345391h = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.oua);
        this.f345392i = view.findViewById(com.p314xaae8f345.mm.R.id.oub);
        findViewById.setOnClickListener(new fl1.p(this));
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new fl1.q(this));
    }

    public boolean a() {
        if (!this.f345394n) {
            return false;
        }
        if (this.f345391h.isChecked()) {
            return true;
        }
        float dimensionPixelOffset = this.f345387d.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        float f17 = -dimensionPixelOffset;
        android.animation.ObjectAnimator duration = android.animation.ObjectAnimator.ofFloat(this.f345388e, "translationX", 0.0f, f17, dimensionPixelOffset, f17, 0.0f).setDuration(300L);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(duration, "setDuration(...)");
        duration.setInterpolator(new android.view.animation.LinearInterpolator());
        duration.start();
        if (b3.l.m9698x3fed0563(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "android.permission.VIBRATE") == 0) {
            java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((android.os.Vibrator) systemService).vibrate(100L);
        }
        fl1.j2 j2Var = this.f345395o;
        if (j2Var != null) {
            j2Var.a();
        }
        return false;
    }

    public final boolean c() {
        return this.f345394n && this.f345388e.getVisibility() == 0;
    }

    public final boolean d() {
        return this.f345389f.getVisibility() == 0 && this.f345391h.isChecked();
    }

    @Override // fl1.e2
    /* renamed from: setIExternalToolsHelper */
    public void mo2005x1f85dcf7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        this.f345393m = r1Var;
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckBoxWording */
    public void mo2015xf085c78(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        if (wording.length() == 0) {
            return;
        }
        if (this.f345388e.getVisibility() != 0) {
            android.view.View view = this.f345388e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent", "ensureUserAgreementLayoutVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandAuthorizeUserAgreementComponent", "ensureUserAgreementLayoutVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        java.lang.CharSequence a17 = kk1.d.a(wording, false, new fl1.r(this));
        android.widget.TextView textView = this.f345390g;
        textView.setText(a17);
        textView.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        textView.setLinkTextColor(b3.l.m9702x7444d5ad(this.f345387d, com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
        n3.l1.d(textView);
        this.f345394n = true;
    }

    @Override // fl1.e2
    /* renamed from: setUserAgreementCheckedAlertListener */
    public void mo2016x99ddcea6(fl1.j2 j2Var) {
        this.f345395o = j2Var;
    }
}
