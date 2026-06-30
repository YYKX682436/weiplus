package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class j8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 f239321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 f239322e;

    public j8(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17153xbe9612d2 activityC17153xbe9612d2, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6) {
        this.f239322e = activityC17153xbe9612d2;
        this.f239321d = c6241x543927b6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6241x543927b6 c6241x543927b6 = this.f239321d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c6241x543927b6.f136489h.f88527a)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RemittanceUI", "no bulletin data");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) this.f239322e.findViewById(com.p314xaae8f345.mm.R.id.af7);
        am.j10 j10Var = c6241x543927b6.f136489h;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.s0(null, textView, j10Var.f88527a, j10Var.f88528b, j10Var.f88529c);
    }
}
