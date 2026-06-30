package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 f233415d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 c16680x607376f4) {
        this.f233415d = c16680x607376f4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 ftsEditText;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 ftsEditText2;
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 ftsEditText3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.j jVar = this.f233415d.f233129f;
        if (jVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a c16687xe732929a = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16687xe732929a) jVar;
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 c16680x607376f4 = c16687xe732929a.f233161o;
            if (c16680x607376f4 != null && (ftsEditText3 = c16680x607376f4.getFtsEditText()) != null) {
                ftsEditText3.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 c16680x607376f42 = c16687xe732929a.f233161o;
            if (c16680x607376f42 != null && (ftsEditText2 = c16680x607376f42.getFtsEditText()) != null) {
                ftsEditText2.d();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16680x607376f4 c16680x607376f43 = c16687xe732929a.f233161o;
            if (c16680x607376f43 != null && (ftsEditText = c16680x607376f43.getFtsEditText()) != null) {
                ftsEditText.h();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16703x9178fa1f c16703x9178fa1f = c16687xe732929a.f233162p;
            if (c16703x9178fa1f != null) {
                c16703x9178fa1f.dataList.clear();
                c16703x9178fa1f.m67343xf939df19().m8146xced61ae5();
            }
            android.widget.LinearLayout linearLayout = c16687xe732929a.f233160n;
            if (linearLayout != null) {
                linearLayout.setVisibility(8);
            }
            android.widget.RelativeLayout relativeLayout = c16687xe732929a.f233157i;
            if (relativeLayout != null) {
                relativeLayout.setVisibility(0);
            }
            c16687xe732929a.m();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/view/FTSSearchNoActionBarView$init$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
