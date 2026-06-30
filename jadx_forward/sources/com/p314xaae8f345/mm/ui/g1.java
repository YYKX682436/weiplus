package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public class g1 implements android.view.View.OnKeyListener {
    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        int selectionStart;
        java.lang.String substring;
        int lastIndexOf;
        int selectionStart2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/AtSomeOneHelper$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (keyEvent.getKeyCode() == 67) {
            if (keyEvent.getAction() == 0) {
                android.widget.EditText editText = com.p314xaae8f345.mm.ui.i1.f290424a;
                if (((editText != null && (selectionStart2 = editText.getSelectionStart()) > 0) ? com.p314xaae8f345.mm.ui.i1.f290424a.getText().toString().charAt(selectionStart2 - 1) : 'x') == 8197) {
                    com.p314xaae8f345.mm.ui.i1.f290428e = true;
                } else {
                    com.p314xaae8f345.mm.ui.i1.f290428e = false;
                }
            }
            if (keyEvent.getAction() == 1 && com.p314xaae8f345.mm.ui.i1.f290428e) {
                com.p314xaae8f345.mm.ui.i1.f290428e = false;
                android.widget.EditText editText2 = com.p314xaae8f345.mm.ui.i1.f290424a;
                if (editText2 != null && (lastIndexOf = (substring = com.p314xaae8f345.mm.ui.i1.f290424a.getText().toString().substring(0, (selectionStart = editText2.getSelectionStart()))).lastIndexOf(64)) < substring.length() && lastIndexOf >= 0) {
                    com.p314xaae8f345.mm.ui.i1.f290424a.setText(substring.substring(0, lastIndexOf) + com.p314xaae8f345.mm.ui.i1.f290424a.getText().toString().substring(selectionStart));
                    com.p314xaae8f345.mm.ui.i1.f290424a.setSelection(lastIndexOf);
                    int i18 = 0;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring)) {
                        int i19 = -1;
                        while (true) {
                            int indexOf = substring.indexOf(8197, i19);
                            if (indexOf == -1) {
                                break;
                            }
                            i19 = indexOf + 1;
                            i18++;
                        }
                        i18++;
                    }
                    java.lang.String substring2 = substring.substring(lastIndexOf + 1, selectionStart);
                    java.util.LinkedHashMap linkedHashMap = com.p314xaae8f345.mm.ui.i1.f290427d;
                    if (linkedHashMap != null && linkedHashMap.size() >= i18) {
                        java.util.Iterator it = linkedHashMap.entrySet().iterator();
                        int i27 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                            if (i27 != i18 - 1) {
                                i27++;
                            } else if (((java.lang.String) entry.getKey()).equals(substring2)) {
                                it.remove();
                            }
                        }
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/ui/AtSomeOneHelper$1", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
