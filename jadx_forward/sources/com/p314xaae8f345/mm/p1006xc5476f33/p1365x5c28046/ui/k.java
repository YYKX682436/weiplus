package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes12.dex */
public class k implements ck5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.ri0 f179606a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 f179607b;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8, r45.ri0 ri0Var) {
        this.f179607b = activityC13272x96cd1be8;
        this.f179606a = ri0Var;
    }

    @Override // ck5.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.EmojiAddCustomDialogUI", "doWhenIllegal");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = this.f179607b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC13272x96cd1be8.f179201g);
        java.lang.String mo42933xb5885648 = activityC13272x96cd1be8.f179204m.mo42933xb5885648();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = activityC13272x96cd1be8.f179204m;
        g0Var.d(10431, valueOf, mo42933xb5885648, c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 1, 2, java.lang.Integer.valueOf(activityC13272x96cd1be8.f179204m.f68679x22618426), activityC13272x96cd1be8.f179202h, activityC13272x96cd1be8.f179204m.f68641x3342accf, activityC13272x96cd1be8.f179203i, activityC13272x96cd1be8.V6(), "");
        if (activityC13272x96cd1be8.G) {
            activityC13272x96cd1be8.I++;
            activityC13272x96cd1be8.W6();
        } else {
            activityC13272x96cd1be8.R6();
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8.P6(activityC13272x96cd1be8);
        }
    }

    @Override // ck5.b
    public void b(ck5.c cVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.emoji.EmojiAddCustomDialogUI", "doWhenOK");
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13272x96cd1be8 activityC13272x96cd1be8 = this.f179607b;
        qr.y yVar = activityC13272x96cd1be8.E == 11 ? qr.y.f447586e : qr.y.f447585d;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo = activityC13272x96cd1be8.f179204m;
        boolean z17 = activityC13272x96cd1be8.f179205n;
        java.util.List list = activityC13272x96cd1be8.f179211t;
        int i17 = activityC13272x96cd1be8.f179212u;
        r45.uu6 uu6Var = activityC13272x96cd1be8.f179213v;
        r45.sj0 sj0Var = activityC13272x96cd1be8.f179217z;
        java.util.List list2 = activityC13272x96cd1be8.f179216y;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j jVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.j(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        activityC13272x96cd1be8.f179206o = new qr.o(emojiInfo, z17, list, i17, uu6Var, sj0Var, list2, yVar == qr.y.f447586e, jVar);
    }
}
