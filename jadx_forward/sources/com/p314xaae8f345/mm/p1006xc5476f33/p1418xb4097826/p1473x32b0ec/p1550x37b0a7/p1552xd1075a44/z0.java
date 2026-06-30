package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44;

/* loaded from: classes3.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 f202359d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 a1Var) {
        super(0);
        this.f202359d = a1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1550x37b0a7.p1552xd1075a44.a1 a1Var = this.f202359d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = a1Var.f202219i;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        c22621x7603e017.setFocusableInTouchMode(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = a1Var.f202219i;
        if (c22621x7603e0172 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        c22621x7603e0172.requestFocus();
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) a1Var.f199914d.getSystemService("input_method");
        if (inputMethodManager != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = a1Var.f202219i;
            if (c22621x7603e0173 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
                throw null;
            }
            inputMethodManager.showSoftInput(c22621x7603e0173, 0);
        }
        return jz5.f0.f384359a;
    }
}
