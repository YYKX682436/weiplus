package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes8.dex */
public final class v1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 f219733d;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53) {
        this.f219733d = activityC15600x40dfa53;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53 = this.f219733d;
        a23.g gVar = activityC15600x40dfa53.f219483t;
        if (gVar != null) {
            java.util.List b17 = gVar.b();
            b17.clear();
            a23.d.f82381a.a(gVar.f82403a, b17);
        }
        android.widget.LinearLayout linearLayout = activityC15600x40dfa53.f219482s;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
