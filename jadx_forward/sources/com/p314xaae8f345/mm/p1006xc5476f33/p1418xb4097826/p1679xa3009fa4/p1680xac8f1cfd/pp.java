package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class pp implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp f217111d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217112e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217113f;

    public pp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qp qpVar, in5.s0 s0Var, android.view.View view) {
        this.f217111d = qpVar;
        this.f217112e = s0Var;
        this.f217113f = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f217111d.d7(this.f217112e);
        android.view.ViewTreeObserver viewTreeObserver = this.f217113f.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
