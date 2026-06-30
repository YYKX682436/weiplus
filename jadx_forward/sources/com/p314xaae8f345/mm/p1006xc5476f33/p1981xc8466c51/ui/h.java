package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class h implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 f236930d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16963xe302cdf1 activityC16963xe302cdf1) {
        this.f236930d = activityC16963xe302cdf1;
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        java.lang.Object obj;
        r45.bq0 bq0Var;
        if (w0Var == null || (obj = w0Var.f398509d) == null) {
            return;
        }
        long longValue = ((java.lang.Long) obj).longValue();
        if (longValue < 0) {
            return;
        }
        long j17 = this.f236930d.f236791v;
        if (j17 == longValue) {
            o72.r2 a17 = bt3.z0.a(j17);
            com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.b();
            bVar.f236883c = a17;
            if (a17 == null || (bq0Var = a17.f67640x5ab01132) == null) {
                return;
            }
            bVar.f236875a = bq0Var.f452497f;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.g(this, bVar));
        }
    }
}
