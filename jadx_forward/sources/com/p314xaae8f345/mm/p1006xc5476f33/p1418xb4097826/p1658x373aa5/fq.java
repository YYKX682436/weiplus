package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class fq implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.EditText f213657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq f213658e;

    public fq(android.widget.EditText editText, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar) {
        this.f213657d = editText;
        this.f213658e = gqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.EditText editText = this.f213657d;
        editText.requestFocus();
        editText.setSelection(editText.getText().length());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar = this.f213658e;
        android.view.ViewGroup viewGroup = gqVar.f213720g;
        android.content.Context context = viewGroup != null ? viewGroup.getContext() : null;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            java.lang.Object systemService = abstractActivityC21394xb3d2c0cf.getSystemService("input_method");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            boolean showSoftInput = ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gqVar.f213719f, "showSoftInput result:" + showSoftInput);
        }
    }
}
