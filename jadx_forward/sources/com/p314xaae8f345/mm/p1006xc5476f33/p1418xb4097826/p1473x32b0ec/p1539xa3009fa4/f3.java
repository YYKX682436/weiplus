package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 f198621d;

    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 m3Var) {
        this.f198621d = m3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 m3Var = this.f198621d;
        android.widget.EditText editText = m3Var.f198778i;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("phoneNumberView");
            throw null;
        }
        editText.clearFocus();
        android.widget.EditText editText2 = m3Var.f198779m;
        if (editText2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smsCodeView");
            throw null;
        }
        editText2.clearFocus();
        java.lang.Object systemService = m3Var.m158354x19263085().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(m3Var.m80380x71e92c1d().getWindowToken(), 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
