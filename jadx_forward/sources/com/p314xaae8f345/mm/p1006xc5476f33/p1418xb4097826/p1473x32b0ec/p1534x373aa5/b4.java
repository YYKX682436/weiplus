package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

/* loaded from: classes3.dex */
public final class b4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 f197737d;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 c4Var, java.lang.String str) {
        this.f197737d = c4Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditWidget$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.c4 c4Var = this.f197737d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c4Var.K;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText("");
        }
        android.widget.TextView textView = c4Var.L;
        if (textView != null) {
            textView.setVisibility(4);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = c4Var.K;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.mo81549xf579a34a((c22621x7603e0172 == null || (text = c22621x7603e0172.getText()) == null) ? 0 : text.length());
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/FinderLiveExtendReadingEditWidget$refreshTips$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
