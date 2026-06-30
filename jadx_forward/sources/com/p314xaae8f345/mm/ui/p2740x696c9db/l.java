package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class l implements al5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a f292070a;

    public l(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a) {
        this.f292070a = c22496x54525e2a;
    }

    public void a(android.widget.EditText editText, int i17, int i18) {
        android.widget.EditText editText2;
        com.p314xaae8f345.mm.ui.p2740x696c9db.vd vdVar = this.f292070a.f291499i;
        if (vdVar.f292391e && (editText2 = (android.widget.EditText) vdVar.f292388b.get()) != null && editText == editText2) {
            android.text.Editable text = editText2.getText();
            int selectionStart = editText2.getSelectionStart();
            int selectionEnd = editText2.getSelectionEnd();
            if (selectionStart < 0 || selectionEnd < selectionStart) {
                return;
            }
            if (selectionStart == selectionEnd) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.ud c17 = vdVar.c(text, selectionStart);
                if (c17 == null || !c17.f292364c) {
                    return;
                }
                editText2.setTextKeepState(text);
                editText2.setSelection(c17.f292362a + c17.f292363b);
                return;
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.ud c18 = vdVar.c(text, selectionStart);
            if (c18 != null && c18.f292364c) {
                selectionStart = c18.f292362a + c18.f292363b;
            }
            if (selectionStart >= selectionEnd) {
                editText2.setTextKeepState(text);
                editText2.setSelection(selectionStart);
                return;
            }
            com.p314xaae8f345.mm.ui.p2740x696c9db.ud c19 = vdVar.c(text, selectionEnd);
            if (c19 == null || !c19.f292364c) {
                return;
            }
            editText2.setTextKeepState(text);
            editText2.setSelection(selectionStart, c19.f292362a);
        }
    }
}
