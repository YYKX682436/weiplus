package uc4;

/* loaded from: classes4.dex */
public final class g1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uc4.h1 f507944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f507945e;

    public g1(uc4.h1 h1Var, android.content.Context context) {
        this.f507944d = h1Var;
        this.f507945e = context;
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
            java.lang.String r0 = "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r11, r0)
            java.lang.String r1 = "menu"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r1)
            java.lang.String r1 = "v"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r1)
            uc4.h1 r10 = r8.f507944d
            xc4.p r10 = r10.c()
            if (r10 != 0) goto L20
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r0)
            return
        L20:
            r1 = 2131758455(0x7f100d77, float:1.9147874E38)
            android.content.Context r2 = r8.f507945e
            java.lang.String r1 = r2.getString(r1)
            r3 = 0
            r4 = 19
            r9.add(r3, r4, r3, r1)
            java.lang.Class<c25.e> r1 = c25.e.class
            lm0.a r1 = gm0.j1.s(r1)
            c25.e r1 = (c25.e) r1
            com.tencent.mm.plugin.zero.a r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) r1
            ip.j r1 = r1.b()
            java.lang.String r4 = "SIGHTCannotTransmitForFav"
            java.lang.String r1 = r1.d(r4)
            com.tencent.mm.protocal.protobuf.TimeLineObject r4 = r10.h1()
            int r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(r1, r3)
            java.lang.String r5 = "MicroMsg.TimelineOnCreateContextMenuListener"
            if (r1 != 0) goto Lad
            r45.a90 r1 = r4.f39014x86965dde
            java.util.LinkedList r1 = r1.f451373h
            int r1 = r1.size()
            if (r1 <= 0) goto La7
            r45.a90 r1 = r4.f39014x86965dde
            java.util.LinkedList r1 = r1.f451373h
            java.lang.Object r1 = r1.get(r3)
            r45.jj4 r1 = (r45.jj4) r1
            java.lang.String r4 = r1.f459388d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di()
            java.lang.String r4 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(r7, r4)
            r6.append(r4)
            java.lang.String r4 = ca4.z0.U(r1)
            r6.append(r4)
            java.lang.String r4 = r6.toString()
            java.lang.String r6 = r10.W0()
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.y6.i(r6, r1)
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r4)
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r6 = new java.lang.Object[]{r6, r7}
            java.lang.String r7 = "config can forward sight, thumb existed %B, video existed %B"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r7, r6)
            if (r4 == 0) goto Lad
            if (r1 == 0) goto Lad
            r1 = 1
            goto Lae
        La7:
            java.lang.String r1 = "sight item had not attch."
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r5, r1)
        Lad:
            r1 = r3
        Lae:
            java.lang.String r4 = "favorite"
            j45.l.g(r4)
            r4 = 2131773067(0x7f10468b, float:1.9177511E38)
            java.lang.String r4 = r2.getString(r4)
            r6 = 10
            r9.add(r3, r6, r3, r4)
            if (r1 == 0) goto Lf1
            java.lang.String r1 = r10.W0()
            java.lang.String r4 = "snsSightMenuListner local id:"
            java.lang.String r1 = r4.concat(r1)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent r1 = new com.tencent.mm.autogen.events.ExDeviceHaveBindNetworkDeviceEvent
            r1.<init>()
            java.lang.String r10 = r10.W0()
            am.b6 r4 = r1.f135674g
            r4.f87754c = r10
            r1.e()
            am.c6 r10 = r1.f135675h
            boolean r10 = r10.f87869a
            if (r10 == 0) goto Lf1
            r10 = 2131756214(0x7f1004b6, float:1.914333E38)
            java.lang.String r10 = r2.getString(r10)
            r1 = 18
            r9.add(r3, r1, r3, r10)
        Lf1:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: uc4.g1.a(android.view.ContextMenu, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.h1
    public boolean b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        uc4.h1 h1Var = this.f507944d;
        xc4.p c17 = h1Var.c();
        if (c17 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1");
            return false;
        }
        h1Var.e().e(view, c17.W0(), c17.h1());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onbindOnSelectedView", "com.tencent.mm.plugin.sns.ui.improve.item.click.ImproveVideoClick$snsSightMenuListner$1");
        return true;
    }
}
