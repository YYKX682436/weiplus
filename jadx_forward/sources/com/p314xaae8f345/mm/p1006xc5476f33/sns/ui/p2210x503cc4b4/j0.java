package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4;

/* loaded from: classes4.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i f251361d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i iVar) {
        this.f251361d = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.view.ContextMenu r9, android.view.View r10, android.view.ContextMenu.ContextMenuInfo r11) {
        /*
            r8 = this;
            java.lang.String r11 = "onMMCreateContextMenu"
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r11, r0)
            java.lang.Object r1 = r10.getTag()
            boolean r1 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9
            if (r1 == 0) goto Le5
            java.lang.Object r10 = r10.getTag()
            com.tencent.mm.plugin.sns.ui.g9 r10 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9) r10
            boolean r1 = r10.f249957n
            com.tencent.mm.plugin.sns.ui.listener.i r2 = r8.f251361d
            r3 = 0
            if (r1 != 0) goto L2d
            android.app.Activity r1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(r2)
            r4 = 2131758455(0x7f100d77, float:1.9147874E38)
            java.lang.String r1 = r1.getString(r4)
            r4 = 19
            r9.add(r3, r4, r3, r1)
        L2d:
            java.lang.Class<c25.e> r1 = c25.e.class
            lm0.a r1 = gm0.j1.s(r1)
            c25.e r1 = (c25.e) r1
            com.tencent.mm.plugin.zero.a r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r1
            ip.j r1 = r1.b()
            java.lang.String r4 = "SIGHTCannotTransmitForFav"
            java.lang.String r1 = r1.d(r4)
            int r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r1, r3)
            if (r1 != 0) goto La9
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r10.f249944a
            r45.a90 r1 = r1.f39014x86965dde
            java.util.LinkedList r1 = r1.f451373h
            int r1 = r1.size()
            java.lang.String r4 = "MicroMsg.TimelineOnCreateContextMenuListener"
            if (r1 <= 0) goto La3
            com.tencent.mm.protocal.protobuf.TimeLineObject r1 = r10.f249944a
            r45.a90 r1 = r1.f39014x86965dde
            java.util.LinkedList r1 = r1.f451373h
            java.lang.Object r1 = r1.get(r3)
            r45.jj4 r1 = (r45.jj4) r1
            java.lang.String r5 = r1.f459388d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r5 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r7, r5)
            r6.append(r5)
            java.lang.String r5 = ca4.z0.U(r1)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = r10.f249945b
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(r6, r1)
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.j(r5)
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "config can forward sight, thumb existed %B, video existed %B"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r7, r6)
            if (r5 == 0) goto La9
            if (r1 == 0) goto La9
            r1 = 1
            goto Laa
        La3:
            java.lang.String r1 = "sight item had not attch."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r4, r1)
        La9:
            r1 = r3
        Laa:
            java.lang.String r4 = "favorite"
            j45.l.g(r4)
            android.app.Activity r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(r2)
            r5 = 2131773067(0x7f10468b, float:1.9177511E38)
            java.lang.String r4 = r4.getString(r5)
            r5 = 10
            r9.add(r3, r5, r3, r4)
            if (r1 == 0) goto Le5
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r1 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
            r1.<init>()
            am.b6 r4 = r1.f135674g
            java.lang.String r10 = r10.f249945b
            r4.f87754c = r10
            r1.e()
            am.c6 r10 = r1.f135675h
            boolean r10 = r10.f87869a
            if (r10 == 0) goto Le5
            android.app.Activity r10 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.e(r2)
            r1 = 2131756214(0x7f1004b6, float:1.914333E38)
            java.lang.String r10 = r10.getString(r1)
            r1 = 18
            r9.add(r3, r1, r3, r10)
        Le5:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.j0.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31");
        if (!(view.getTag() instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31");
            return false;
        }
        java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.g9) view.getTag()).f249945b;
        this.f251361d.f251342l.e(view, str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(str).m70371x485d7());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener$31");
        return true;
    }
}
