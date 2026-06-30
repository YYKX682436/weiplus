package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes9.dex */
public final class y3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 f180098a;

    public y3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 activityC13322x119d0e55) {
        this.f180098a = activityC13322x119d0e55;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        r45.ye yeVar = (r45.ye) fVar.f152151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmoticonCustomCreateResultView", "batch download emojiInfo: " + i17 + ", " + i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13322x119d0e55 activityC13322x119d0e55 = this.f180098a;
        if (i17 == 0 && i18 == 0) {
            r45.ri0 ri0Var = (yeVar == null || (linkedList = yeVar.f472541g) == null) ? null : (r45.ri0) linkedList.getFirst();
            if (ri0Var == null) {
                db5.e1.s(activityC13322x119d0e55.mo55332x76847179(), "", activityC13322x119d0e55.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfv));
                activityC13322x119d0e55.finish();
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
                activityC13322x119d0e55.f179400o = c21053xdbf1e5f4;
                c21053xdbf1e5f4.f68671x4b6e68b9 = ri0Var.f466419d;
                n22.m.a(ri0Var, c21053xdbf1e5f4);
                com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = activityC13322x119d0e55.f179397i;
                if (abstractC10447x8c9cf7d9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiView");
                    throw null;
                }
                abstractC10447x8c9cf7d9.m43712xc040f7d2(activityC13322x119d0e55.f179400o);
            }
        } else {
            db5.e1.s(activityC13322x119d0e55.mo55332x76847179(), "", activityC13322x119d0e55.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mfv));
            activityC13322x119d0e55.finish();
        }
        return jz5.f0.f384359a;
    }
}
