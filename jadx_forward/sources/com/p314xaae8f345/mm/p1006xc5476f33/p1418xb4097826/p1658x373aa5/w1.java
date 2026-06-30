package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class w1 extends android.view.inputmethod.BaseInputConnection {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 f214811a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 v1Var, android.view.View targetView, boolean z17) {
        super(targetView, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        this.f214811a = v1Var;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(java.lang.CharSequence charSequence, int i17) {
        java.util.LinkedList linkedList;
        android.widget.TextView textView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 v1Var = this.f214811a;
        if (v1Var != null) {
            df2.bl blVar = (df2.bl) v1Var;
            if (!(charSequence == null || charSequence.length() == 0)) {
                df2.pl plVar = blVar.f311349a;
                int c76 = plVar.c7();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                int i18 = 0;
                while (true) {
                    int length = charSequence.length();
                    linkedList = plVar.A;
                    if (i18 >= length) {
                        break;
                    }
                    int charCount = java.lang.Character.charCount(charSequence.toString().codePointAt(i18)) + i18;
                    java.lang.CharSequence subSequence = charSequence.subSequence(i18, charCount);
                    android.widget.TextView textView2 = (android.widget.TextView) kz5.n0.a0(linkedList, i18 + c76);
                    if (textView2 != null) {
                        textView2.setText(subSequence.toString());
                        sb6.append(subSequence);
                    }
                    i18 = charCount;
                }
                plVar.g7();
                if (df2.pl.a7(plVar)) {
                    int c77 = plVar.c7();
                    int size = linkedList.size();
                    int i19 = c77;
                    while (true) {
                        if (i19 >= size) {
                            textView = null;
                            break;
                        }
                        textView = (android.widget.TextView) kz5.n0.a0(linkedList, i19);
                        if (textView != null && !plVar.d7(textView)) {
                            if (textView.getText().toString().length() == 0) {
                                break;
                            }
                        }
                        i19++;
                    }
                    if (textView == null) {
                        int i27 = 0;
                        while (true) {
                            if (i27 >= c77) {
                                break;
                            }
                            android.widget.TextView textView3 = (android.widget.TextView) kz5.n0.a0(linkedList, i27);
                            if (textView3 != null && !plVar.d7(textView3)) {
                                if (textView3.getText().toString().length() == 0) {
                                    textView = textView3;
                                    break;
                                }
                            }
                            i27++;
                        }
                    }
                    if (textView != null) {
                        plVar.e7(textView);
                    }
                }
                df2.pl.Z6(plVar);
            }
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 v1Var = this.f214811a;
        if (v1Var == null) {
            return true;
        }
        ((df2.bl) v1Var).a();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(android.view.KeyEvent keyEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.v1 v1Var;
        boolean z17 = false;
        if (keyEvent != null && keyEvent.getAction() == 0) {
            if (keyEvent != null && keyEvent.getKeyCode() == 67) {
                z17 = true;
            }
            if (z17 && (v1Var = this.f214811a) != null) {
                ((df2.bl) v1Var).a();
            }
        }
        return true;
    }
}
