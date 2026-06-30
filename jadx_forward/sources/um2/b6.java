package um2;

/* loaded from: classes3.dex */
public final class b6 extends bf2.f {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f510264f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jk0 f510265g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f510266h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.l f510267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f510264f = "FinderLiveVisitorPrepareUIC";
        this.f510267i = new um2.y5(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:
    
        if (r4.m46546x9b8334b1() == true) goto L8;
     */
    @Override // bf2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(fm2.c r4, r45.qt2 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "baseRouter"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            super.i(r4, r5)
            fm2.c r4 = r3.f101139c
            r5 = 0
            if (r4 == 0) goto L15
            boolean r4 = r4.m46546x9b8334b1()
            r0 = 1
            if (r4 != r0) goto L15
            goto L16
        L15:
            r0 = r5
        L16:
            if (r0 != 0) goto L65
            fm2.c r4 = r3.f101139c
            if (r4 == 0) goto L2d
            java.lang.Class<mm2.c1> r0 = mm2.c1.class
            androidx.lifecycle.c1 r0 = r3.c(r0)
            mm2.c1 r0 = (mm2.c1) r0
            java.lang.String r0 = r0.f410385o
            r1 = 2
            r2 = 0
            boolean r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0.m57621xc099750c(r4, r0, r5, r1, r2)
            goto L2e
        L2d:
            r4 = r5
        L2e:
            if (r4 == 0) goto L37
            fm2.c r0 = r3.f101139c
            if (r0 == 0) goto L37
            r0.m57695xe5d7a18f()
        L37:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "setVisitorDefaultBg liveId:"
            r0.<init>(r1)
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r3.c(r1)
            mm2.e1 r1 = (mm2.e1) r1
            r45.nw1 r1 = r1.f410521r
            long r1 = r1.m75942xfb822ef2(r5)
            r0.append(r1)
            java.lang.String r5 = ",haveBg:"
            r0.append(r5)
            r0.append(r4)
            r4 = 33
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r5 = r3.f510264f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r4)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.b6.i(fm2.c, r45.qt2):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0030, code lost:
    
        if (r0.H == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k() {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "prepareLive forceFetchObject:"
            r0.<init>(r1)
            km2.m r1 = r12.f101140d
            r2 = 0
            if (r1 == 0) goto L17
            com.tencent.mm.live.api.LiveConfig r1 = r1.f390662d
            if (r1 == 0) goto L17
            boolean r1 = r1.H
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            goto L18
        L17:
            r1 = r2
        L18:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r12.f510264f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            km2.m r0 = r12.f101140d
            r3 = 0
            if (r0 == 0) goto L33
            com.tencent.mm.live.api.LiveConfig r0 = r0.f390662d
            if (r0 == 0) goto L33
            boolean r0 = r0.H
            r4 = 1
            if (r0 != r4) goto L33
            goto L34
        L33:
            r4 = r3
        L34:
            if (r4 == 0) goto L78
            java.lang.String r0 = "loadFeedAndPrepareLive!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.Class<ws5.g> r0 = ws5.g.class
            i95.m r0 = i95.n0.c(r0)
            ws5.g r0 = (ws5.g) r0
            wo2.k r0 = (wo2.k) r0
            r0.getClass()
            dp2.e r4 = dp2.e.f323725a
            androidx.appcompat.app.AppCompatActivity r0 = r12.f101138b
            boolean r1 = r0 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r1 == 0) goto L53
            r2 = r0
            com.tencent.mm.ui.MMActivity r2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r2
        L53:
            r5 = r2
            java.lang.Class<mm2.e1> r0 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r12.c(r0)
            mm2.e1 r1 = (mm2.e1) r1
            long r6 = r1.f410516m
            androidx.lifecycle.c1 r0 = r12.c(r0)
            mm2.e1 r0 = (mm2.e1) r0
            java.lang.String r8 = r0.f410525v
            r9 = 0
            km2.n r0 = dk2.ef.H
            if (r0 == 0) goto L71
            km2.r r0 = r0.f390684c
            if (r0 == 0) goto L71
            int r3 = r0.f390739k
        L71:
            r10 = r3
            yz5.l r11 = r12.f510267i
            r4.c(r5, r6, r8, r9, r10, r11)
            goto L7f
        L78:
            fm2.c r0 = r12.f101139c
            if (r0 == 0) goto L7f
            r0.m129746xe466bfa0(r3)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: um2.b6.k():void");
    }
}
