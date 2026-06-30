package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes5.dex */
public class p1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 f238238d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94) {
        super(false);
        this.f238238d = activityC17121x70367c94;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.mobileRemit.MobileRemittanceUI", "DelayOption View show bottomView");
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238238d;
        activityC17121x70367c94.m83133x1e3567d1();
        activityC17121x70367c94.S = activityC17121x70367c94.T;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(activityC17121x70367c94.mo55332x76847179(), 1, 3);
        z2Var.m(activityC17121x70367c94.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gx6), activityC17121x70367c94.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gx9));
        android.view.ViewGroup viewGroup = null;
        android.view.View inflate = android.view.View.inflate(activityC17121x70367c94.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570836c22, null);
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc)).getPaint(), 0.8f);
        android.view.View inflate2 = android.view.View.inflate(activityC17121x70367c94.mo55332x76847179(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f570835c21, null);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate2.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m1 m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.m1(activityC17121x70367c94, z2Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.n1(activityC17121x70367c94, z2Var);
        z2Var.D = m1Var;
        z2Var.E = n1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.o1 o1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.o1(activityC17121x70367c94, arrayList);
        int i17 = 0;
        while (true) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) activityC17121x70367c94.f238154n;
            if (i17 >= arrayList2.size()) {
                z2Var.s(inflate);
                z2Var.j(inflate2);
                z2Var.C();
                activityC17121x70367c94.W6(7);
                return;
            }
            r45.bd0 bd0Var = (r45.bd0) arrayList2.get(i17);
            android.view.View inflate3 = activityC17121x70367c94.getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570837c23, viewGroup);
            android.widget.TextView textView = (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.jnd);
            textView.setText(bd0Var.f452206d);
            android.widget.ImageView imageView = (android.widget.ImageView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.jnc);
            imageView.getDrawable().setColorFilter(activityC17121x70367c94.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), android.graphics.PorterDuff.Mode.SRC_ATOP);
            if (activityC17121x70367c94.T == i17) {
                imageView.setVisibility(0);
                textView.setContentDescription(activityC17121x70367c94.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhu) + bd0Var.f452206d);
            } else {
                imageView.setVisibility(8);
            }
            imageView.setTag(java.lang.Integer.valueOf(i17));
            inflate3.setTag(imageView);
            inflate3.setOnClickListener(o1Var);
            linearLayout.addView(inflate3);
            arrayList.add(inflate3);
            i17++;
            viewGroup = null;
        }
    }
}
