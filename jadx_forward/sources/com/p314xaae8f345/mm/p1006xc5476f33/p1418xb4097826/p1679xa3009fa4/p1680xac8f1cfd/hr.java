package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes.dex */
public final class hr implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f216180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13778xe5c0d44a f216181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs f216182f;

    public hr(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13778xe5c0d44a c13778xe5c0d44a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar) {
        this.f216180d = s0Var;
        this.f216181e = c13778xe5c0d44a;
        this.f216182f = hsVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 itemHolder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemHolder, "itemHolder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e5 e5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.e5) itemHolder.f374658i;
        r45.zk2 zk2Var = e5Var.f189358d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderNpsSurveyUIC", "onItemClick wording = " + e5Var.m75945x2fec8307(1) + " answerId = " + e5Var.m75942xfb822ef2(0));
        android.widget.TextView textView = (android.widget.TextView) itemHolder.p(com.p314xaae8f345.mm.R.id.nsm);
        if (textView != null) {
            in5.s0 s0Var = this.f216180d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13778xe5c0d44a c13778xe5c0d44a = this.f216181e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hs hsVar = this.f216182f;
            textView.setTextColor(s0Var.f374654e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            textView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563163yi);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = c13778xe5c0d44a.f187637d;
            if (c22849x81a93d25 != null) {
                int childCount = c22849x81a93d25.getChildCount();
                for (int i18 = 0; i18 < childCount; i18++) {
                    c22849x81a93d25.getChildAt(i18).setEnabled(false);
                }
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gr grVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gr(hsVar, s0Var, zk2Var, e5Var);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(grVar, 500L, false);
        }
    }
}
