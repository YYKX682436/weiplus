package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class e5 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f239222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 f239223e;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883, java.lang.String str) {
        this.f239223e = activityC17133x39d21883;
        this.f239222d = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y) obj;
        long longValue = ((java.lang.Long) obj2).longValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.ActivityC17133x39d21883 activityC17133x39d21883 = this.f239223e;
        long j17 = activityC17133x39d21883.f238873c2;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (longValue != j17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RemittanceDetailUI", "unexpected halfpage callback");
        } else {
            activityC17133x39d21883.f238873c2 = 0L;
            if (yVar == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262533f) {
                activityC17133x39d21883.b7(this.f239222d, "");
            } else if (yVar == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262534g) {
                activityC17133x39d21883.finish();
            }
        }
        return f0Var;
    }
}
