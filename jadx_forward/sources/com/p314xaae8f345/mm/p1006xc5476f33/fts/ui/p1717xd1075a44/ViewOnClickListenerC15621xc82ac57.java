package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.FTSLocalPageRelevantView */
/* loaded from: classes.dex */
public class ViewOnClickListenerC15621xc82ac57 extends android.widget.LinearLayout implements android.view.View.OnClickListener {
    public ViewOnClickListenerC15621xc82ac57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: getQuery */
    public java.lang.String m63627x750cbf12() {
        return "";
    }

    /* renamed from: getSearchId */
    public java.lang.String m63628xb0d1e259() {
        return "";
    }

    /* renamed from: getWordList */
    public java.lang.String m63629x7d87943e() {
        return new java.lang.StringBuilder("").toString();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/widget/FTSLocalPageRelevantView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/widget/FTSLocalPageRelevantView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setOnRelevantClickListener */
    public void m63630xb9ea1b5e(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.n0 n0Var) {
    }

    public ViewOnClickListenerC15621xc82ac57(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
