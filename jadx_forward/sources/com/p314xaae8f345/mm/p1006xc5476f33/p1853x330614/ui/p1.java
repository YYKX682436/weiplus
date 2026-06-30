package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class p1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 f229994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e f229995e;

    public p1(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6) {
        this.f229995e = activityC16480xce80140e;
        this.f229994d = c6241x543927b6;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.tw4 tw4Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = this.f229994d;
        am.j10 j10Var = c6241x543927b6.f136489h;
        int i17 = j10Var.f88530d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16480xce80140e activityC16480xce80140e = this.f229995e;
        if (i17 == 2 && (tw4Var = j10Var.f88531e) != null) {
            activityC16480xce80140e.f229791h.m83148xdedf72f8(tw4Var);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j10Var.f88527a)) {
                return;
            }
            android.widget.TextView textView = activityC16480xce80140e.f229790g;
            am.j10 j10Var2 = c6241x543927b6.f136489h;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView, j10Var2.f88527a, j10Var2.f88528b, j10Var2.f88529c);
        }
    }
}
