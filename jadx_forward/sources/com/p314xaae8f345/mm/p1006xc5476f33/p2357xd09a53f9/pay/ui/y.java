package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class y implements al5.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 f260352a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 viewOnClickListenerC19035xfddf7d86) {
        this.f260352a = viewOnClickListenerC19035xfddf7d86;
    }

    @Override // al5.c2
    /* renamed from: onStatusChange */
    public void mo2289xd6191dc1(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 viewOnClickListenerC19035xfddf7d86 = this.f260352a;
        viewOnClickListenerC19035xfddf7d86.W6(z17);
        if (viewOnClickListenerC19035xfddf7d86.f260228e != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Integer.valueOf(z17 ? 1 : 2);
            objArr[1] = viewOnClickListenerC19035xfddf7d86.f260228e.f261208e;
            g0Var.d(15379, objArr);
        }
    }
}
