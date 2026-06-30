package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public final class s1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 f219707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a23.e f219708e;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53, a23.e eVar) {
        this.f219707d = activityC15600x40dfa53;
        this.f219708e = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        a23.e eVar = this.f219708e;
        java.lang.String str = eVar.f82382a;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53 = this.f219707d;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53.f7(activityC15600x40dfa53, str);
        a23.g gVar = activityC15600x40dfa53.f219483t;
        if (gVar != null) {
            gVar.a(eVar.f82382a, false, activityC15600x40dfa53.h7(), activityC15600x40dfa53.g7(), java.lang.String.valueOf(activityC15600x40dfa53.H));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$refreshHistoryItemViews$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
