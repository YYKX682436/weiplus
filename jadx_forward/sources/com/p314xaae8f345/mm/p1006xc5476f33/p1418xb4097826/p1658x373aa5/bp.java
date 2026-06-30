package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class bp implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f213269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp f213270e;

    public bp(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.cp cpVar) {
        this.f213269d = c22621x7603e017;
        this.f213270e = cpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f213269d;
        c22621x7603e017.requestFocus();
        c22621x7603e017.mo81549xf579a34a(c22621x7603e017.getText().length());
        android.view.ViewGroup viewGroup = this.f213270e.f213327f;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            java.lang.Object systemService = abstractActivityC21394xb3d2c0cf.getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(c22621x7603e017, 0);
        }
    }
}
