package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 f254622d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 activityC18571x56e85567) {
        this.f254622d = activityC18571x56e85567;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 activityC18571x56e85567 = this.f254622d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(activityC18571x56e85567, "", activityC18571x56e85567.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572085yb), true, false, null);
        ((android.widget.TextView) activityC18571x56e85567.findViewById(com.p314xaae8f345.mm.R.id.dhj)).setVisibility(8);
        int i17 = activityC18571x56e85567.getIntent().getIntExtra("intent_extra_msg_type", 0) == 102 ? 1 : 0;
        java.lang.String U6 = activityC18571x56e85567.U6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(U6);
        java.lang.String str = (java.lang.String) ((jz5.n) activityC18571x56e85567.f254358o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        pq5.g l17 = new vh4.b1(U6, str, i17).l();
        l17.f(activityC18571x56e85567);
        l17.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.h0(Q, activityC18571x56e85567));
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/BindGuardianMsgUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
