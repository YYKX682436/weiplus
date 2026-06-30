package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class k5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l5 f162875d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162876e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f162877f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f162878g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f162879h;

    public k5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l5 l5Var, android.app.Activity activity, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f162875d = l5Var;
        this.f162876e = activity;
        this.f162877f = str;
        this.f162878g = d0Var;
        this.f162879h = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f162875d.getClass();
        android.app.Activity activity = this.f162876e;
        android.widget.EditText editText = new android.widget.EditText(activity);
        editText.setHint(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2n));
        editText.setGravity(51);
        editText.setTextSize(0, ym5.x.a(activity, 15.0f));
        editText.setMaxEms(80);
        editText.setMaxLines(2);
        editText.setEllipsize(android.text.TextUtils.TruncateAt.END);
        m40.i0 i0Var = (m40.i0) i95.n0.c(m40.i0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i5 i5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.i5.f162838d;
        ((b92.y0) i0Var).getClass();
        zl2.r4.f555483a.Z2(editText, null, 80, 40, (r17 & 16) != 0 ? true : true, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, i5Var);
        editText.setPadding(editText.getPaddingLeft(), activity.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), editText.getPaddingRight(), activity.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        editText.setBackgroundColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560164cq));
        android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
        editText.setHeight(ym5.x.a(activity, 100.0f));
        editText.setLayoutParams(layoutParams);
        editText.setText(this.f162877f);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
        u1Var.u(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a2o));
        u1Var.d(editText);
        u1Var.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j5(this.f162876e, editText, this.f162878g, this.f162879h, this.f162875d));
        u1Var.q(false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiEditTextWithPopForm", "showEditTextDialog");
    }
}
