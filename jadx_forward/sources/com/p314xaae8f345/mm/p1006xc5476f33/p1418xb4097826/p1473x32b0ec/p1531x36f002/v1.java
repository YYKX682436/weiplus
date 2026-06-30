package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes2.dex */
public final class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1 f197257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f197258e;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u1 u1Var, android.widget.TextView textView) {
        this.f197257d = u1Var;
        this.f197258e = textView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f197258e;
        textView.getPaint().setShader(this.f197257d.a(textView.getWidth(), textView.getHeight()));
        textView.invalidate();
    }
}
