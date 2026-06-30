package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

/* loaded from: classes12.dex */
public final class y1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 f219912d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53) {
        this.f219912d = activityC15600x40dfa53;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        a23.g gVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$updateFooterView$5$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag();
        if (tag != null && (tag instanceof r45.jo0)) {
            r45.jo0 jo0Var = (r45.jo0) tag;
            r45.di6 di6Var = jo0Var.f459519d;
            java.lang.String str2 = di6Var != null ? di6Var.f454045d : null;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53 activityC15600x40dfa53 = this.f219912d;
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15600x40dfa53.f7(activityC15600x40dfa53, str2);
            r45.h55 h55Var = activityC15600x40dfa53.E;
            if (h55Var != null) {
                activityC15600x40dfa53.j7(jo0Var, h55Var, 3);
            }
            if (activityC15600x40dfa53.f219481r && (gVar = activityC15600x40dfa53.f219483t) != null) {
                r45.di6 di6Var2 = jo0Var.f459519d;
                if (di6Var2 == null || (str = di6Var2.f454045d) == null) {
                    str = "";
                }
                gVar.a(str, false, activityC15600x40dfa53.h7(), activityC15600x40dfa53.g7(), java.lang.String.valueOf(activityC15600x40dfa53.H));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/fts/ui/FTSBizDetailUI$updateFooterView$5$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
