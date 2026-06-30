package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ye implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf f201973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f201974e;

    public ye(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar, android.widget.EditText editText) {
        this.f201973d = cfVar;
        this.f201974e = editText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.cf cfVar = this.f201973d;
        if (z17) {
            android.widget.EditText editText = cfVar.Q;
            if (editText != null) {
                editText.setHintTextColor(cfVar.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                return;
            }
            return;
        }
        android.widget.EditText editText2 = cfVar.Q;
        if (editText2 != null) {
            editText2.setHintTextColor(cfVar.f199716e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        }
        android.widget.EditText editText3 = cfVar.Q;
        android.text.Editable text = editText3 != null ? editText3.getText() : null;
        boolean z18 = text == null || text.length() == 0;
        android.widget.EditText editText4 = this.f201974e;
        java.lang.String obj = (z18 ? editText4.getHint() : editText4.getText()).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        cfVar.U = obj;
        cfVar.g0(!(obj.length() == 0));
    }
}
