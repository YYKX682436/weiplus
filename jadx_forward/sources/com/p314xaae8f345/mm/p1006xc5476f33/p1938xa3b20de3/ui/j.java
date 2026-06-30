package com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui;

/* loaded from: classes9.dex */
public class j implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnClickListener f234184a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ at4.p0 f234185b;

    public j(com.p314xaae8f345.mm.p1006xc5476f33.p1938xa3b20de3.ui.C16759xaa786f9e c16759xaa786f9e, android.view.View.OnClickListener onClickListener, at4.p0 p0Var) {
        this.f234184a = onClickListener;
        this.f234185b = p0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z
    public java.lang.Object a(r35.m3 m3Var) {
        if (m3Var != null && m3Var.e().trim().startsWith("weixin://wcpay/fqf/opentinyapp")) {
            this.f234184a.onClick(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18930, java.lang.Integer.valueOf(this.f234185b.f95451a), 3);
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z
    public java.lang.Object b(r35.m3 m3Var) {
        return null;
    }
}
