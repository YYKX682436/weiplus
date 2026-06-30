package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class k7 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda f154249a;

    public k7(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda) {
        this.f154249a = activityC11355x7bcfecda;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Aa.PaylistAAUI", "click AlertMsgTips");
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11355x7bcfecda activityC11355x7bcfecda = this.f154249a;
        int i17 = !com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(activityC11355x7bcfecda.I) ? com.p314xaae8f345.mm.R.C30867xcad56011.k4b : com.p314xaae8f345.mm.R.C30867xcad56011.k4_;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activityC11355x7bcfecda);
        u1Var.u(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k4c));
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activityC11355x7bcfecda).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571127d33, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h88);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.o3b);
        imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccp);
        textView.setText(i17);
        u1Var.d(inflate);
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya);
        u1Var.j(activityC11355x7bcfecda.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg));
        u1Var.c(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.z6(this), new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.a7(this));
        u1Var.q(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 4, 7, java.lang.Integer.valueOf(activityC11355x7bcfecda.R));
    }
}
