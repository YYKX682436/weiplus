package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 f198720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f198721e;

    public k3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 m3Var, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112) {
        this.f198720d = m3Var;
        this.f198721e = activityC0065xcd7aa112;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$sendButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.m3 m3Var = this.f198720d;
        android.widget.EditText editText = m3Var.f198779m;
        if (editText == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smsCodeView");
            throw null;
        }
        editText.requestFocus();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f198721e;
        java.lang.Object systemService = activityC0065xcd7aa112.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            android.widget.EditText editText2 = m3Var.f198779m;
            if (editText2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smsCodeView");
                throw null;
            }
            inputMethodManager.showSoftInput(editText2, 0);
        }
        p3325xe03a0797.p3326xc267989b.l.d(m3Var.m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.i3(m3Var, p3325xe03a0797.p3326xc267989b.l.d(m3Var.m158345xefc66565(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j3(m3Var, null), 3, null), activityC0065xcd7aa112, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$sendButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
