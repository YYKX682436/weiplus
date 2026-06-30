package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06;

/* loaded from: classes11.dex */
public class o implements rk4.o5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce f232489a;

    public o(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce) {
        this.f232489a = activityC16662x5873ebce;
    }

    @Override // rk4.o5
    public void a(int i17, bw5.lp0 lp0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1921x6854f06.ActivityC16662x5873ebce activityC16662x5873ebce = this.f232489a;
        bw5.lp0 uj6 = ((rk4.z8) activityC16662x5873ebce.f232453z).uj();
        if (uj6 != null) {
            for (java.lang.String str : activityC16662x5873ebce.B.keySet()) {
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.C16656xe36a44b1 c16656xe36a44b1 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.C16656xe36a44b1) activityC16662x5873ebce.B.get(str);
                if (c16656xe36a44b1 != null) {
                    if (str.equals(uj6.b())) {
                        if (i17 == 3 || i17 == 6) {
                            c16656xe36a44b1.m67270xdd7d58e5(true);
                        }
                        if (i17 == 11 || i17 == 12) {
                            c16656xe36a44b1.m67270xdd7d58e5(false);
                        }
                    } else {
                        c16656xe36a44b1.m67270xdd7d58e5(false);
                    }
                }
            }
        }
    }
}
