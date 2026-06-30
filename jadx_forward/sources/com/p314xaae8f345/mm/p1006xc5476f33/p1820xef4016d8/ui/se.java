package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public final class se extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def f228952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f228953e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def, java.lang.String str) {
        super(2);
        this.f228952d = activityC16377xf00b6def;
        this.f228953e = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y action = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16377xf00b6def activityC16377xf00b6def = this.f228952d;
        if (longValue != activityC16377xf00b6def.J1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuckyMoneyNewReceiveUI", "unexpected halfpage callback");
        } else {
            activityC16377xf00b6def.J1 = 0L;
            if (action == com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.y.f262533f) {
                activityC16377xf00b6def.m66195x2b33b77f();
                activityC16377xf00b6def.W6(this.f228953e);
            } else {
                activityC16377xf00b6def.finish();
            }
        }
        return jz5.f0.f384359a;
    }
}
