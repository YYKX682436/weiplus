package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class a3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 f260867d;

    public a3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5) {
        this.f260867d = activityC19082x760c9ba5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19082x760c9ba5 activityC19082x760c9ba5 = this.f260867d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC19082x760c9ba5.mo55332x76847179(), 1, 2);
        z2Var.q(activityC19082x760c9ba5.G.f467162e);
        r45.sc6 sc6Var = activityC19082x760c9ba5.G;
        z2Var.m(sc6Var.f467164g, sc6Var.f467166i);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.o2 o2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.o2(this, z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2 p2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.p2(this, z2Var);
        z2Var.D = o2Var;
        z2Var.E = p2Var;
        android.view.View inflate = android.view.LayoutInflater.from(activityC19082x760c9ba5.mo55332x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d9h, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.pqz)).setText(activityC19082x760c9ba5.G.f467163f);
        z2Var.j(inflate);
        z2Var.C();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/id_verify/WcPayRealnameVerifyIdInputUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
