package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes9.dex */
public final class y1 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 f199072d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var) {
        this.f199072d = e2Var;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.text.Editable text;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2 e2Var = this.f199072d;
        android.widget.EditText editText = e2Var.f198596n;
        java.lang.String obj = (editText == null || (text = editText.getText()) == null) ? null : text.toString();
        e2Var.f198600r = obj == null ? "" : obj;
        boolean z17 = true;
        boolean z18 = obj == null || obj.length() == 0;
        java.util.ArrayList arrayList = e2Var.f198603u;
        if (z18) {
            arrayList.clear();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            bm2.f fVar = e2Var.f198604v;
            fVar.getClass();
            java.util.ArrayList arrayList3 = fVar.f103408d;
            arrayList3.clear();
            arrayList3.addAll(arrayList2);
            fVar.f103410f = "";
            fVar.m8146xced61ae5();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2.a(e2Var, true);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e2.a(e2Var, false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGameLiveSearchUIC", "loadSearchData query:" + e2Var.f198600r);
        android.widget.TextView textView = e2Var.f198597o;
        if (textView != null) {
            textView.setVisibility(8);
        }
        android.view.View view = e2Var.f198598p;
        if (view != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveSearchUIC", "loadSearchData", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        arrayList.clear();
        e2Var.f198601s = "";
        e2Var.f198602t = false;
        java.lang.String str = e2Var.f198600r;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x2.f184205a.f(6, e2Var.f198600r);
        e2Var.f198599q = new db2.m5(e2Var.f198600r, e2Var.f198601s, 0, null, 12, null);
        gm0.j1.d().g(e2Var.f198599q);
        gm0.j1.d().a(4140, e2Var);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
