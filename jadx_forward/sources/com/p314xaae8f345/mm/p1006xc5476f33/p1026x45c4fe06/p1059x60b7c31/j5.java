package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class j5 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f162855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f162856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f162857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f162858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l5 f162859e;

    public j5(android.app.Activity activity, android.widget.EditText editText, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l5 l5Var) {
        this.f162855a = activity;
        this.f162856b = editText;
        this.f162857c = d0Var;
        this.f162858d = i17;
        this.f162859e = l5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        java.lang.Object systemService = this.f162855a.getSystemService("input_method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        android.widget.EditText editText = this.f162856b;
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(editText.getWindowToken(), 0);
        if (z17) {
            this.f162857c.a(this.f162858d, this.f162859e.p("ok", kz5.c1.i(new jz5.l(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, editText.getText().toString()))));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiEditTextWithPopForm", "dialog click is ok:" + z17);
    }
}
