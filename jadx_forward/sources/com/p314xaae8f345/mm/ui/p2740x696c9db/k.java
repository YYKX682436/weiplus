package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class k implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a f292058d;

    public k(com.p314xaae8f345.mm.ui.p2740x696c9db.C22496x54525e2a c22496x54525e2a) {
        this.f292058d = c22496x54525e2a;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        android.widget.EditText editText;
        com.p314xaae8f345.mm.ui.p2740x696c9db.ud c17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        boolean z17 = false;
        if (i17 != 67) {
            yj0.a.i(false, this, "com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
            return false;
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.vd vdVar = this.f292058d.f291499i;
        if (vdVar.f292391e && (editText = (android.widget.EditText) vdVar.f292388b.get()) != null && vdVar.f292387a != null) {
            android.text.Editable text = editText.getText();
            int selectionStart = editText.getSelectionStart();
            if (selectionStart == editText.getSelectionEnd() && (c17 = vdVar.c(text, selectionStart)) != null && c17.f292364c) {
                int i18 = c17.f292363b;
                int i19 = c17.f292362a;
                text.delete(i19, i18 + i19);
                editText.setTextKeepState(text);
                editText.setSelection(i19);
                z17 = true;
            }
        }
        yj0.a.i(z17, this, "com/tencent/mm/ui/tools/ActionBarSearchView$6", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return z17;
    }
}
