package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jr implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et f194697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f194698e;

    public jr(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar, int i17) {
        this.f194697d = etVar;
        this.f194698e = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f194697d;
        etVar.B.setVisibility(8);
        etVar.f193997z.setEnabled(true);
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(this.f194698e, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f194697d;
        if (b17 > 5) {
            etVar.B.setVisibility(8);
        } else {
            etVar.B.setText(java.lang.String.valueOf(b17));
            int color = etVar.R.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d);
            android.widget.TextView textView = etVar.B;
            textView.setTextColor(color);
            textView.setVisibility(0);
        }
        etVar.f193997z.setEnabled(true);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = this.f194697d;
        etVar.B.setText(java.lang.String.valueOf(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(this.f194698e, str)));
        int color = etVar.R.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
        android.widget.TextView textView = etVar.B;
        textView.setTextColor(color);
        textView.setVisibility(0);
        etVar.f193997z.setEnabled(false);
    }
}
