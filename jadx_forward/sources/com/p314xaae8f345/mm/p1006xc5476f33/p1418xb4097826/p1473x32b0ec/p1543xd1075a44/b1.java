package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public abstract class b1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g {

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f199339h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(android.content.Context context) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f199339h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.z0(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        y().clearFocus();
        java.lang.Object systemService = this.f199914d.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(y().getWindowToken(), 0);
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f199339h).mo141623x754a37bb()).d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        pm0.v.V(100L, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a1(this));
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f199339h).mo141623x754a37bb()).f();
    }

    public abstract android.widget.EditText y();

    public void z() {
        y().setFocusableInTouchMode(true);
        y().requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) this.f199914d.getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(y(), 0);
        }
    }
}
