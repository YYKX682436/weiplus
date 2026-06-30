package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5;

/* loaded from: classes5.dex */
public class a2 implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 f220556d;

    public a2(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70) {
        this.f220556d = c15854x49003e70;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
        this.f220556d.f220478o.setVisibility(8);
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(1000, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220556d;
        if (b17 > 5) {
            c15854x49003e70.f220478o.setVisibility(8);
            return;
        }
        c15854x49003e70.f220478o.setText(java.lang.String.valueOf(b17));
        c15854x49003e70.f220478o.setTextColor(c15854x49003e70.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        c15854x49003e70.f220478o.setVisibility(0);
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.p1736x373aa5.C15854x49003e70 c15854x49003e70 = this.f220556d;
        c15854x49003e70.f220478o.setText(com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(1000, str));
        c15854x49003e70.f220478o.setTextColor(c15854x49003e70.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac));
        c15854x49003e70.f220478o.setVisibility(0);
    }
}
