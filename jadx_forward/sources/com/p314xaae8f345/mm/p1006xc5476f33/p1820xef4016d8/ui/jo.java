package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes5.dex */
public final class jo extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.mo f228608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (r2.f461161m != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0072, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a1, code lost:
    
        if (r2.f461161m != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean O6() {
        /*
            r9 = this;
            long r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1827x633fb29.m5.h()
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            androidx.appcompat.app.AppCompatActivity r2 = r9.m158354x19263085()
            java.lang.String r3 = "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r2, r3)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16390x60cac25d) r2
            r45.lm5 r2 = r2.c7()
            java.lang.String r3 = "MicroMsg.LuckyMoneyPickEnvelopeUIRedDotUIC"
            r4 = 0
            if (r2 != 0) goto L21
            java.lang.String r0 = "[shouldShowSelectSkinPlazaNewRedDot] redDotData == null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            return r4
        L21:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[shouldShowSelectSkinPlazaNewRedDot] version： "
            r5.<init>(r6)
            java.lang.String r6 = r2.f461156e
            r5.append(r6)
            java.lang.String r6 = ", type："
            r5.append(r6)
            int r6 = r2.f461155d
            r5.append(r6)
            java.lang.String r6 = " , is_show："
            r5.append(r6)
            boolean r6 = r2.f461161m
            r5.append(r6)
            java.lang.String r6 = " , currentTime： "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r6 = ",  invalidateTimes： "
            r5.append(r6)
            long r6 = r2.f461163o
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r5)
            int r5 = r2.f461155d
            r6 = 1
            if (r5 == r6) goto L74
            r7 = 2
            if (r5 == r7) goto L68
            java.lang.String r0 = "[shouldShowSelectSkinPlazaNewRedDot] unknown type"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            goto La4
        L68:
            long r7 = r2.f461163o
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto La4
            boolean r0 = r2.f461161m
            if (r0 == 0) goto La4
        L72:
            r4 = r6
            goto La4
        L74:
            gm0.b0 r5 = gm0.j1.u()
            com.tencent.mm.storage.n3 r5 = r5.c()
            com.tencent.mm.storage.u3 r7 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LUCKY_MONEY_ENVELOPE_SELECT_SKIN_REDDOT_CLICKEDSKIN_INT_SYNC
            java.lang.Integer r8 = java.lang.Integer.valueOf(r4)
            java.lang.Object r5 = r5.m(r7, r8)
            java.lang.String r7 = "null cannot be cast to non-null type kotlin.Int"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r5, r7)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 != r6) goto L99
            java.lang.String r0 = "[shouldShowSelectSkinPlazaNewRedDot] user has clicked select skin entry, ignore show reddot"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            return r4
        L99:
            long r7 = r2.f461163o
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 >= 0) goto La4
            boolean r0 = r2.f461161m
            if (r0 == 0) goto La4
            goto L72
        La4:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[shouldShowSelectSkinPlazaNewRedDot] shouldShow："
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.jo.O6():boolean");
    }
}
