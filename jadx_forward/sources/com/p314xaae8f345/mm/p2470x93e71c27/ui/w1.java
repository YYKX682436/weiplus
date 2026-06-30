package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes5.dex */
public class w1 implements android.view.View.OnKeyListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 f273569d;

    public w1(com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 z1Var, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030) {
        this.f273569d = z1Var;
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(android.view.View view, int i17, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(keyEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", this, array);
        if (i17 == 67 && keyEvent.getAction() == 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.z1 z1Var = this.f273569d;
            if (z1Var.f273637e.m75362x652b8d61().getSelectionStart() == 0 && z1Var.f273637e.m75362x652b8d61().getSelectionEnd() == 0) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.C19642xb279030 c19642xb279030 = z1Var.f273637e;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c19642xb279030.f271317d;
                if (c1163xf1deaba4.getChildCount() != 1) {
                    android.view.View childAt = c1163xf1deaba4.getChildAt(c1163xf1deaba4.getChildCount() - 2);
                    if (!c19642xb279030.f271326p.contains((java.lang.String) childAt.getTag()) && childAt.findViewById(com.p314xaae8f345.mm.R.id.jbx) != null) {
                        if (c19642xb279030.f271329s) {
                            c19642xb279030.g((java.lang.String) childAt.getTag(), true, false);
                            c19642xb279030.f271329s = false;
                        } else {
                            c19642xb279030.f271329s = true;
                            int mo1894x7e414b06 = c1163xf1deaba4.mo7946xf939df19().mo1894x7e414b06();
                            int i18 = c19642xb279030.f271325o.booleanValue() ? mo1894x7e414b06 - 2 : mo1894x7e414b06 - 1;
                            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = c19642xb279030.f271317d;
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList2.add(java.lang.Integer.valueOf(i18));
                            java.util.Collections.reverse(arrayList2);
                            yj0.a.d(c1163xf1deaba42, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "scrollToLast", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            c1163xf1deaba42.c1(((java.lang.Integer) arrayList2.get(0)).intValue());
                            yj0.a.f(c1163xf1deaba42, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "scrollToLast", "(Z)V", "Undefined", "smoothScrollToPosition", "(I)V");
                            android.view.View findViewById = childAt.findViewById(com.p314xaae8f345.mm.R.id.jbx);
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(0);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "tryDelLastContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView", "tryDelLastContact", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        c19642xb279030.m75362x652b8d61().requestFocus();
                    }
                }
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/pluginsdk/ui/MultiSelectContactView$ContactHolder$3", "android/view/View$OnKeyListener", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z");
        return false;
    }
}
