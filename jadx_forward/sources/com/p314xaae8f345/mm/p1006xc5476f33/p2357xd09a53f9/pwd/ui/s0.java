package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui;

/* loaded from: classes9.dex */
public class s0 implements com.p314xaae8f345.mm.p2802xd031a825.ui.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 f260601a;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9) {
        this.f260601a = viewOnLayoutChangeListenerC19048x56ebf0e9;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.m
    /* renamed from: onVisibleStateChange */
    public void mo26891xca4e600e(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9 viewOnLayoutChangeListenerC19048x56ebf0e9 = this.f260601a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS visible");
            viewOnLayoutChangeListenerC19048x56ebf0e9.m83123x97a0486(viewOnLayoutChangeListenerC19048x56ebf0e9.f260422m, viewOnLayoutChangeListenerC19048x56ebf0e9.f260419g, 10);
            viewOnLayoutChangeListenerC19048x56ebf0e9.V6();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " TenpayKBS unvisible");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pwd.ui.ViewOnLayoutChangeListenerC19048x56ebf0e9.f260415u;
        viewOnLayoutChangeListenerC19048x56ebf0e9.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletForgotPwdVerifyIdUI", " resetParams()");
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260418f.setVisibility(0);
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260421i.setVisibility(0);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) viewOnLayoutChangeListenerC19048x56ebf0e9.f260423n.getLayoutParams();
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260424o = marginLayoutParams;
        marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(viewOnLayoutChangeListenerC19048x56ebf0e9, 59);
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260423n.setLayoutParams(viewOnLayoutChangeListenerC19048x56ebf0e9.f260424o);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) viewOnLayoutChangeListenerC19048x56ebf0e9.f260420h.getLayoutParams();
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260425p = marginLayoutParams2;
        marginLayoutParams2.topMargin = com.p314xaae8f345.mm.ui.zk.a(viewOnLayoutChangeListenerC19048x56ebf0e9, 114);
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260420h.setLayoutParams(viewOnLayoutChangeListenerC19048x56ebf0e9.f260425p);
        viewOnLayoutChangeListenerC19048x56ebf0e9.f260422m.scrollTo(0, 0);
    }
}
