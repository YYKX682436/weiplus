package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class qp implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a f251886d;

    public qp(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a activityC18109x7a461b7a) {
        this.f251886d = activityC18109x7a461b7a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0075  */
    @Override // android.view.View.OnCreateContextMenuListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateContextMenu(android.view.ContextMenu r10, android.view.View r11, android.view.ContextMenu.ContextMenuInfo r12) {
        /*
            r9 = this;
            java.lang.String r11 = "onCreateContextMenu"
            java.lang.String r12 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI$13"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r11, r12)
            java.lang.Class<c25.e> r0 = c25.e.class
            lm0.a r0 = gm0.j1.s(r0)
            c25.e r0 = (c25.e) r0
            com.tencent.mm.plugin.zero.a r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r0
            ip.j r0 = r0.b()
            java.lang.String r1 = "SIGHTCannotTransmitForFav"
            java.lang.String r0 = r0.d(r1)
            r1 = 0
            int r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r0, r1)
            java.lang.String r2 = "com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI"
            r3 = 1
            com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI r4 = r9.f251886d
            if (r0 != 0) goto L62
            java.lang.String r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.c7(r4)
            boolean r0 = com.p314xaae8f345.mm.vfs.w6.j(r0)
            java.lang.String r5 = "access$2400"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r5, r2)
            java.lang.String r6 = r4.f248902e
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r5, r2)
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "MicroMsg.SnsSightPlayerUI"
            java.lang.String r8 = "config can forward sight, thumb existed %B, video existed %B"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r8, r6)
            if (r0 == 0) goto L62
            if (r5 == 0) goto L62
            r0 = 2131776709(0x7f1054c5, float:1.9184898E38)
            java.lang.String r0 = r4.getString(r0)
            r5 = 3
            r10.add(r1, r5, r1, r0)
            r0 = r3
            goto L63
        L62:
            r0 = r1
        L63:
            java.lang.String r5 = "favorite"
            j45.l.g(r5)
            r5 = 2131773067(0x7f10468b, float:1.9177511E38)
            java.lang.String r5 = r4.getString(r5)
            r6 = 2
            r10.add(r1, r6, r1, r5)
            if (r0 == 0) goto L96
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r0 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
            r0.<init>()
            am.b6 r5 = r0.f135674g
            java.lang.String r6 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.d7(r4)
            r5.f87754c = r6
            r0.e()
            am.c6 r0 = r0.f135675h
            boolean r0 = r0.f87869a
            if (r0 == 0) goto L96
            r0 = 2131756214(0x7f1004b6, float:1.914333E38)
            java.lang.String r0 = r4.getString(r0)
            r5 = 4
            r10.add(r1, r5, r1, r0)
        L96:
            int r0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18109x7a461b7a.Y
            java.lang.String r0 = "access$900"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r2)
            boolean r5 = r4.f248905h
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r2)
            if (r5 != 0) goto Lb2
            androidx.appcompat.app.AppCompatActivity r0 = r4.mo55332x76847179()
            r2 = 2131777160(0x7f105688, float:1.9185813E38)
            java.lang.String r0 = r0.getString(r2)
            r10.add(r1, r3, r1, r0)
        Lb2:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.qp.onCreateContextMenu(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }
}
