package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class xq implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f201901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f201902e;

    public xq(android.widget.TextView textView, int i17) {
        this.f201901d = textView;
        this.f201902e = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str) / 2;
        if (f17 < 0) {
            f17 = 0;
        }
        this.f201901d.setText(java.lang.String.valueOf((this.f201902e / 2) - f17));
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        this.f201901d.setText("0");
    }
}
