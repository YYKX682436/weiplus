package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class d7 implements com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb f259683a;

    public d7(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb activityC19020x7623dbfb) {
        this.f259683a = activityC19020x7623dbfb;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(boolean r7, java.lang.String r8) {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "cache updated show Error:"
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r1 = " errMsg:"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.WalletLqtSaveFetchUI"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtSaveFetchUI r0 = r6.f259683a
            int r2 = r0.S
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 != r4) goto L40
            if (r7 == 0) goto L2a
            r0.p7(r8)
            goto L3e
        L2a:
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q
            com.tencent.mm.plugin.wallet_core.model.Bankcard r7 = r7.b(r3)
            r0.U = r7
            if (r7 != 0) goto L40
            java.lang.String r7 = "mDefaultBankcard is null!!!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r7)
            java.lang.String r7 = ""
            r0.p7(r7)
        L3e:
            r7 = r3
            goto L41
        L40:
            r7 = r5
        L41:
            if (r7 != 0) goto L44
            return
        L44:
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.Y6(r0)
            r0.mo48627xce38d9a()
            r0.t7()
            r0.getClass()
            com.tencent.mm.plugin.wallet.balance.model.lqt.l0 r7 = com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.l0.f259202q
            r45.bp0 r7 = r7.f259218n
            if (r7 == 0) goto L9d
            int r8 = r7.f452475e
            if (r8 != r5) goto L5c
            r8 = r5
            goto L5d
        L5c:
            r8 = r3
        L5d:
            r0.f259609y0 = r8
            int r8 = r7.f452476f
            if (r8 != r5) goto L6e
            boolean r8 = r0.f259612z1
            if (r8 != 0) goto L6e
            r8 = 0
            r1 = -1
            r0.m7(r8, r1)
            r0.f259612z1 = r5
        L6e:
            r45.du4 r8 = r7.f452474d
            if (r8 == 0) goto La6
            java.lang.String r8 = r8.f454281d
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r8 != 0) goto La6
            android.widget.TextView r8 = r0.N
            r8.setVisibility(r3)
            android.widget.TextView r8 = r0.N
            r45.du4 r1 = r7.f452474d
            java.lang.String r1 = r1.f454281d
            r8.setText(r1)
            r45.du4 r8 = r7.f452474d
            java.lang.String r8 = r8.f454283f
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r8 != 0) goto La6
            android.widget.TextView r8 = r0.N
            com.tencent.mm.plugin.wallet.balance.ui.lqt.a8 r1 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.a8
            r1.<init>(r0, r7)
            r8.setOnClickListener(r1)
            goto La6
        L9d:
            r0.f259609y0 = r3
            android.widget.TextView r7 = r0.N
            r8 = 8
            r7.setVisibility(r8)
        La6:
            int r7 = r0.F1
            r8 = 14
            if (r7 != r8) goto Lbb
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r7 = r0.f259589h
            java.lang.String r7 = r7.m83183xfb85ada3()
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r8 != 0) goto Lbb
            r0.s7(r7, r5)
        Lbb:
            int r7 = r0.S
            if (r7 != r5) goto Lca
            com.tencent.mm.plugin.wallet.balance.ui.lqt.WalletLqtArriveTimeLayout r7 = r0.G
            com.tencent.mm.plugin.wallet.balance.ui.lqt.m6 r8 = new com.tencent.mm.plugin.wallet.balance.ui.lqt.m6
            r8.<init>(r6)
            r7.post(r8)
            goto Ldb
        Lca:
            if (r7 != r4) goto Ldb
            com.tencent.mm.wallet_core.ui.formview.WalletFormView r7 = r0.f259589h
            java.lang.String r7 = r7.m83183xfb85ada3()
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r8 != 0) goto Ldb
            r0.s7(r7, r5)
        Ldb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d7.a(boolean, java.lang.String):void");
    }
}
