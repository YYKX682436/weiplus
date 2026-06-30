package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class f implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a f291917d;

    public f(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a) {
        this.f291917d = c22496x54525e2a;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        android.widget.EditText editText;
        java.lang.String str;
        java.lang.String str2;
        int i27 = com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a.f291493u;
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a = this.f291917d;
        c22496x54525e2a.m();
        com.p314xaae8f345.mm.ui.p2740x696c9db.vd vdVar = c22496x54525e2a.f291499i;
        if (vdVar.f292391e && (editText = (android.widget.EditText) vdVar.f292388b.get()) != null && (((charSequence != null && charSequence.toString() != null && charSequence.toString().length() != 0) || ((str = vdVar.f292390d) != null && str.length() != 0)) && ((str2 = vdVar.f292390d) == null || charSequence == null || !str2.equals(charSequence.toString())))) {
            java.lang.String charSequence2 = charSequence != null ? charSequence.toString() : "";
            vdVar.f292390d = charSequence2;
            vdVar.f292387a = com.p314xaae8f345.mm.ui.p2740x696c9db.vd.a(charSequence2, vdVar.f292389c);
            com.p314xaae8f345.mm.ui.p2740x696c9db.vd.b(editText, vdVar.f292389c);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.q qVar = c22496x54525e2a.f291501n;
        if (qVar != null) {
            qVar.L(charSequence != null ? charSequence.toString() : "");
        }
    }
}
