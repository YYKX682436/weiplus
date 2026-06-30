package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class a1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271702d;

    public a1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271702d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.ViewGroup viewGroup;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$118", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271702d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c19666xfd6e2f33.f271494b4;
        if (c22621x7603e017 != null && c19666xfd6e2f33.f271583q4 != null) {
            if (c19666xfd6e2f33.f271601t4) {
                c19666xfd6e2f33.z0();
                android.view.inputmethod.InputMethodManager inputMethodManager = c19666xfd6e2f33.U1;
                if (inputMethodManager != null) {
                    inputMethodManager.showSoftInput(c19666xfd6e2f33.f271494b4, 0);
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = c19666xfd6e2f33.f271595s4;
                if (c22698xdfbd289f != null) {
                    c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562768o1);
                }
            } else {
                android.view.inputmethod.InputMethodManager inputMethodManager2 = c19666xfd6e2f33.U1;
                if (inputMethodManager2 != null) {
                    inputMethodManager2.hideSoftInputFromWindow(c22621x7603e017.getWindowToken(), 0);
                }
                if (c19666xfd6e2f33.f271583q4 != null && (viewGroup = c19666xfd6e2f33.f271589r4) != null) {
                    c19666xfd6e2f33.f271601t4 = true;
                    viewGroup.setVisibility(0);
                    c19666xfd6e2f33.f271583q4.setVisibility(0);
                    c19666xfd6e2f33.f271583q4.i();
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f2 = c19666xfd6e2f33.f271595s4;
                if (c22698xdfbd289f2 != null) {
                    c22698xdfbd289f2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562769o2);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$118", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
