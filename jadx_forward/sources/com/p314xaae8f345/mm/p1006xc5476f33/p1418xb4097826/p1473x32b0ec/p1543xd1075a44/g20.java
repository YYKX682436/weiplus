package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes10.dex */
public final class g20 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h20 f199926d;

    public g20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h20 h20Var) {
        this.f199926d = h20Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h20 h20Var = this.f199926d;
        fg2.t1 t1Var = h20Var.f200042u;
        if (t1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.view.ViewTreeObserver viewTreeObserver = t1Var.f343849a.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
        fg2.t1 t1Var2 = h20Var.f200042u;
        if (t1Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (t1Var2.f343849a.getWidth() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(h20Var.f200041t, "onGlobalLayout: width is 0");
        } else {
            h20Var.L(false);
        }
    }
}
