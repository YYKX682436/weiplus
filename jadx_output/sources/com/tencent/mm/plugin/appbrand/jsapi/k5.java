package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l5 f81342d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f81343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f81345g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f81346h;

    public k5(com.tencent.mm.plugin.appbrand.jsapi.l5 l5Var, android.app.Activity activity, java.lang.String str, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f81342d = l5Var;
        this.f81343e = activity;
        this.f81344f = str;
        this.f81345g = d0Var;
        this.f81346h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f81342d.getClass();
        android.app.Activity activity = this.f81343e;
        android.widget.EditText editText = new android.widget.EditText(activity);
        editText.setHint(activity.getResources().getString(com.tencent.mm.R.string.a2n));
        editText.setGravity(51);
        editText.setTextSize(0, ym5.x.a(activity, 15.0f));
        editText.setMaxEms(80);
        editText.setMaxLines(2);
        editText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
        com.tencent.mm.plugin.appbrand.jsapi.i5 i5Var = com.tencent.mm.plugin.appbrand.jsapi.i5.f81305d;
        ((b92.y0) i0Var).getClass();
        zl2.r4.f473950a.Z2(editText, null, 80, 40, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2 : null, i5Var);
        editText.setPadding(editText.getPaddingLeft(), activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl), editText.getPaddingRight(), activity.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479646bl));
        editText.setBackgroundColor(activity.getResources().getColor(com.tencent.mm.R.color.f478631cq));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        editText.setHeight(ym5.x.a(activity, 100.0f));
        editText.setLayoutParams(layoutParams);
        editText.setText(this.f81344f);
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(activity);
        u1Var.u(activity.getResources().getString(com.tencent.mm.R.string.a2o));
        u1Var.d(editText);
        u1Var.b(new com.tencent.mm.plugin.appbrand.jsapi.j5(this.f81343e, editText, this.f81345g, this.f81346h, this.f81342d));
        u1Var.q(false);
        com.tencent.mars.xlog.Log.i("JsApiEditTextWithPopForm", "showEditTextDialog");
    }
}
