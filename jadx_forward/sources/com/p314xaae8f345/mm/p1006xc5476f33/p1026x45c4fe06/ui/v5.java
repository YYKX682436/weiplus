package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes3.dex */
public final class v5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f171806d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.rd5 f171807e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x5 f171808f;

    public v5(android.widget.TextView textView, r45.rd5 rd5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.x5 x5Var) {
        this.f171806d = textView;
        this.f171807e = rd5Var;
        this.f171808f = x5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f171806d;
        android.text.TextPaint paint = textView.getPaint();
        r45.rd5 rd5Var = this.f171807e;
        java.lang.String str = rd5Var.f466274d;
        if (str == null) {
            str = this.f171808f.f171860b.getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f572170df1).toString();
        }
        float measureText = paint.measureText(str);
        android.text.TextPaint paint2 = textView.getPaint();
        java.lang.String str2 = rd5Var.f466284q;
        if (str2 == null) {
            str2 = "";
        }
        float measureText2 = paint2.measureText(str2);
        if (measureText + measureText2 > textView.getWidth()) {
            rd5Var.f466274d = android.text.TextUtils.ellipsize(rd5Var.f466274d, textView.getPaint(), textView.getWidth() - measureText2, android.text.TextUtils.TruncateAt.END).toString();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(rd5Var.f466274d);
        java.lang.String str3 = rd5Var.f466284q;
        sb6.append(str3 != null ? str3 : "");
        textView.setText(sb6.toString());
    }
}
