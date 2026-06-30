package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f90273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f90274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.x5 f90275f;

    public v5(android.widget.TextView textView, r45.rd5 rd5Var, com.tencent.mm.plugin.appbrand.ui.x5 x5Var) {
        this.f90273d = textView;
        this.f90274e = rd5Var;
        this.f90275f = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f90273d;
        android.text.TextPaint paint = textView.getPaint();
        r45.rd5 rd5Var = this.f90274e;
        java.lang.String str = rd5Var.f384741d;
        if (str == null) {
            str = this.f90275f.f90327b.getResources().getText(com.tencent.mm.R.string.f490637df1).toString();
        }
        float measureText = paint.measureText(str);
        android.text.TextPaint paint2 = textView.getPaint();
        java.lang.String str2 = rd5Var.f384751q;
        if (str2 == null) {
            str2 = "";
        }
        float measureText2 = paint2.measureText(str2);
        if (measureText + measureText2 > textView.getWidth()) {
            rd5Var.f384741d = android.text.TextUtils.ellipsize(rd5Var.f384741d, textView.getPaint(), textView.getWidth() - measureText2, android.text.TextUtils.TruncateAt.END).toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rd5Var.f384741d);
        java.lang.String str3 = rd5Var.f384751q;
        sb6.append(str3 != null ? str3 : "");
        textView.setText(sb6.toString());
    }
}
