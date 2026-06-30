package df2;

/* loaded from: classes3.dex */
public final class bk implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pk f311348d;

    public bk(df2.pk pkVar) {
        this.f311348d = pkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        r45.na0 D0;
        r45.pa0 pa0Var;
        android.content.Context context;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initCustomGiftTab$2$customTextEditView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.pk pkVar = this.f311348d;
        android.widget.EditText editText = pkVar.B;
        pkVar.getClass();
        if (editText != null) {
            editText.requestFocus();
        }
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) ((editText == null || (context = editText.getContext()) == null) ? null : context.getSystemService("input_method"));
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(editText, 0);
        }
        ce2.i iVar = pkVar.f312605J;
        int m75939xb282bd08 = (iVar == null || (D0 = iVar.D0()) == null || (pa0Var = (r45.pa0) D0.m75936x14adae67(1)) == null) ? 0 : pa0Var.m75939xb282bd08(1);
        zl2.r4.f555483a.Z2(editText, null, m75939xb282bd08, m75939xb282bd08, false, com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_1, new df2.ok(pkVar, editText));
        if (editText != null) {
            ce2.i iVar2 = pkVar.f312605J;
            editText.setText(iVar2 != null ? iVar2.A0() : "");
        }
        if (editText != null) {
            android.text.Editable text2 = editText.getText();
            editText.setSelection(text2 != null ? text2.length() : 0);
        }
        df2.pk.i7(editText, pkVar);
        android.view.View view2 = pkVar.D;
        if (view2 != null) {
            java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
            view2.setEnabled(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, pkVar.f312605J != null ? r7.A0() : null));
        }
        android.view.View view3 = pkVar.f312610q;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view4 = pkVar.f312619z;
        if (view4 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController", "showCustomTextEditorInput", "(Landroid/widget/EditText;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveGiftCustomGiftController$initCustomGiftTab$2$customTextEditView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
