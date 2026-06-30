package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes9.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e f254632d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f254633e;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e activityC18569xd8e35e1e, java.lang.String str) {
        this.f254632d = activityC18569xd8e35e1e;
        this.f254633e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pq5.g gVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e activityC18569xd8e35e1e = this.f254632d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC18569xd8e35e1e, "", activityC18569xd8e35e1e.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), true, false, null);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e.f254329t;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18569xd8e35e1e activityC18569xd8e35e1e2 = this.f254632d;
        ((android.widget.TextView) activityC18569xd8e35e1e2.findViewById(com.p314xaae8f345.mm.R.id.dhj)).setVisibility(8);
        java.lang.String str = this.f254633e;
        if (str != null) {
            rt0.e eVar = (rt0.e) activityC18569xd8e35e1e2.T6().y(rt0.e.class);
            int i18 = eVar.f480912d;
            java.lang.String str2 = eVar.f480911c;
            if (str2 == null) {
                str2 = "";
            }
            pq5.g l17 = new vh4.z0(str, i18, str2, activityC18569xd8e35e1e2.U6()).l();
            l17.f(activityC18569xd8e35e1e2);
            gVar = l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.o(Q, eVar, activityC18569xd8e35e1e2));
        } else {
            gVar = null;
        }
        if (gVar == null) {
            Q.dismiss();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/AuthorizationDetailUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
