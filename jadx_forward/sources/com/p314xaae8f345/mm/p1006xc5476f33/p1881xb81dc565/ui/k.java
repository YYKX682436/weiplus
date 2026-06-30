package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public class k implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f231823d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2) {
        this.f231823d = serviceConnectionC16581x3d1d6bd2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f231823d;
        int c17 = com.p314xaae8f345.mm.ui.bl.f(serviceConnectionC16581x3d1d6bd2.mo55332x76847179()) ? com.p314xaae8f345.mm.ui.bl.c(serviceConnectionC16581x3d1d6bd2.mo55332x76847179()) : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16584x79838812 c16584x79838812 = serviceConnectionC16581x3d1d6bd2.f231762e.H;
        if (c16584x79838812 != null && c16584x79838812.findViewById(com.p314xaae8f345.mm.R.id.m7i) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkTalkingUILogic", "applyBottomMarin %s", java.lang.Integer.valueOf(c17));
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) c16584x79838812.findViewById(com.p314xaae8f345.mm.R.id.m7i).getLayoutParams();
            layoutParams.bottomMargin = c17;
            c16584x79838812.findViewById(com.p314xaae8f345.mm.R.id.m7i).setLayoutParams(layoutParams);
        }
        sj3.g3 g3Var = serviceConnectionC16581x3d1d6bd2.f231764g;
        if (g3Var.f490074v) {
            sj3.a1 e17 = g3Var.e();
            e17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "updateNavigationBarHeight() called with: height = " + c17);
            e17.f489943x = c17;
            e17.h(e17.f489938s, false);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MT.MultiTalkNewTalkingUILogic", "updateNavigationBarHeight: view not showing, do not update");
        }
        serviceConnectionC16581x3d1d6bd2.T6().getViewTreeObserver().removeOnGlobalLayoutListener(serviceConnectionC16581x3d1d6bd2.f231773s);
    }
}
