package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class jd implements ck5.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f200285d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f200286e;

    public jd(android.widget.TextView textView, int i17) {
        this.f200285d = textView;
        this.f200286e = i17;
    }

    @Override // ck5.e
    public void R5(java.lang.String str) {
    }

    @Override // ck5.e
    public void c1(java.lang.String str) {
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(this.f200286e, str) / 2;
        if (b17 < 0) {
            b17 = 0;
        }
        this.f200285d.setText(java.lang.String.valueOf(b17));
    }

    @Override // ck5.e
    public void w0(java.lang.String str) {
        this.f200285d.setText("0");
    }
}
