package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes15.dex */
public class n2 implements android.os.MessageQueue.IdleHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 f176622d;

    public n2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13053xb9371272 activityC13053xb9371272) {
        this.f176622d = activityC13053xb9371272;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00a6  */
    @Override // android.os.MessageQueue.IdleHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean queueIdle() {
        /*
            r8 = this;
            com.tencent.mm.plugin.card.ui.CardHomePageUI r0 = r8.f176622d
            eu1.f r1 = r0.f176399z
            r2 = 0
            if (r1 == 0) goto Lb1
            r1.getClass()
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_CARD_HAS_UPDATE_CARD_TYPE_INT_SYNC
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Object r1 = r1.m(r3, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            r4 = 1
            if (r1 == 0) goto L2a
            int r1 = r1.intValue()
            if (r1 != r4) goto L2a
        L27:
            r4 = r2
            goto La4
        L2a:
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.x(r3, r5)
            xt1.e r1 = xt1.t0.cj()
            xt1.r r3 = xt1.r.NORMAL_TYPE
            android.database.Cursor r1 = r1.y0(r3)
            java.lang.String r3 = "MicroMsg.ShareCardDataMgr"
            if (r1 == 0) goto L98
            int r5 = r1.getCount()
            if (r5 <= 0) goto L98
            r1.moveToFirst()
        L50:
            boolean r5 = r1.isAfterLast()
            if (r5 != 0) goto L94
            com.tencent.mm.plugin.card.model.CardInfo r5 = new com.tencent.mm.plugin.card.model.CardInfo
            r5.<init>()
            r5.mo9015xbf5d97fd(r1)
            int r6 = r5.f67738x8c036204
            r7 = -1
            if (r6 != r7) goto L90
            r45.vu r6 = r5.s0()
            if (r6 != 0) goto L70
            java.lang.String r5 = "updateCardType fail , info.getCardTpInfo() == null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r5)
            goto L90
        L70:
            r45.vu r6 = r5.s0()
            int r6 = r6.f470083i
            r5.f67738x8c036204 = r6
            xt1.e r6 = xt1.t0.cj()
            java.lang.String[] r7 = new java.lang.String[r2]
            boolean r6 = r6.mo9952xce0038c9(r5, r7)
            if (r6 != 0) goto L90
            java.lang.String r5 = r5.f67736x95970a65
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            java.lang.String r6 = "updateCardType fail , cardId = %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r6, r5)
        L90:
            r1.moveToNext()
            goto L50
        L94:
            r1.close()
            goto La4
        L98:
            if (r1 == 0) goto L9d
            r1.close()
        L9d:
            java.lang.String r1 = "updateAllCardInfoByBlockField cursor is null or size is 0"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r1)
            goto L27
        La4:
            if (r4 == 0) goto Lb1
            java.lang.String r1 = "MicroMsg.CardHomePageUI"
            java.lang.String r3 = "try2UpdateCardType"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3)
            r0.o7()
        Lb1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.n2.queueIdle():boolean");
    }
}
