package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class hj implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 f228533e;

    public hj(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9, java.lang.String str) {
        this.f228533e = activityC16387x8521db9;
        this.f228532d = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16387x8521db9 activityC16387x8521db9 = this.f228533e;
        long j17 = activityC16387x8521db9.G1;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (longValue != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNotHookReceiveUI", "unexpected halfpage callback");
        } else {
            activityC16387x8521db9.G1 = 0L;
            if (yVar == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262533f) {
                activityC16387x8521db9.m66197x2b33b77f();
                activityC16387x8521db9.V6(this.f228532d);
            } else {
                activityC16387x8521db9.finish();
            }
        }
        return f0Var;
    }
}
