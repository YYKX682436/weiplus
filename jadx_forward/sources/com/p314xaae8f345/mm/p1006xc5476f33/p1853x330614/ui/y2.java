package com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui;

/* loaded from: classes9.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 f230048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 f230049e;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 activityC16483x6e20aea1, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6) {
        this.f230049e = activityC16483x6e20aea1;
        this.f230048d = c6241x543927b6;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.tw4 tw4Var;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = this.f230048d;
        am.j10 j10Var = c6241x543927b6.f136489h;
        int i17 = j10Var.f88530d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 activityC16483x6e20aea1 = this.f230049e;
        if (i17 == 2 && (tw4Var = j10Var.f88531e) != null) {
            activityC16483x6e20aea1.f229849e.m83148xdedf72f8(tw4Var);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j10Var.f88527a)) {
                return;
            }
            android.widget.TextView textView = activityC16483x6e20aea1.f229848d;
            am.j10 j10Var2 = c6241x543927b6.f136489h;
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView, j10Var2.f88527a, j10Var2.f88528b, j10Var2.f88529c);
        }
    }
}
