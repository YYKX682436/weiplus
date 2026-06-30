package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f203318d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203319e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ up2.o f203320f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203321g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 f203322h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f203323i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f203324m;

    public l5(vp2.l0 l0Var, in5.s0 s0Var, up2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var, long j17, long j18) {
        this.f203318d = l0Var;
        this.f203319e = s0Var;
        this.f203320f = oVar;
        this.f203321g = t5Var;
        this.f203322h = a5Var;
        this.f203323i = j17;
        this.f203324m = j18;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003e A[LOOP:0: B:2:0x000a->B:12:0x003e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042 A[EDGE_INSN: B:13:0x0042->B:14:0x0042 BREAK  A[LOOP:0: B:2:0x000a->B:12:0x003e], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r10 = this;
            vp2.l0 r0 = r10.f203318d
            java.util.ArrayList r0 = r0.f520474e
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = r1
        La:
            boolean r3 = r0.hasNext()
            r4 = -1
            long r5 = r10.f203323i
            r7 = 1
            if (r3 == 0) goto L41
            java.lang.Object r3 = r0.next()
            so2.j5 r3 = (so2.j5) r3
            boolean r8 = r3 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            if (r8 == 0) goto L3a
            zl2.q4 r8 = zl2.q4.f555466a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r3
            boolean r8 = r8.C(r3)
            if (r8 == 0) goto L3a
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r3.getFeedObject()
            long r8 = r3.m76784x5db1b11()
            int r3 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r3 != 0) goto L3a
            r3 = r7
            goto L3b
        L3a:
            r3 = r1
        L3b:
            if (r3 == 0) goto L3e
            goto L42
        L3e:
            int r2 = r2 + 1
            goto La
        L41:
            r2 = r4
        L42:
            if (r2 == r4) goto Ld1
            in5.s0 r0 = r10.f203319e
            android.content.Context r0 = r0.f374654e
            boolean r3 = r0 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            r4 = 0
            if (r3 == 0) goto L50
            com.tencent.mm.ui.MMActivity r0 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r0
            goto L51
        L50:
            r0 = r4
        L51:
            if (r0 == 0) goto Laa
            pf5.z r3 = pf5.z.f435481a
            pf5.v r0 = r3.a(r0)
            java.lang.Class<rq2.w> r3 = rq2.w.class
            androidx.lifecycle.c1 r0 = r0.a(r3)
            java.lang.String r3 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r3)
            rq2.w r0 = (rq2.w) r0
            cl0.g r3 = new cl0.g
            r3.<init>()
            long r8 = r10.f203324m
            java.lang.String r8 = pm0.v.u(r8)
            java.lang.String r9 = "liveid"
            r3.s(r9, r8)
            java.lang.String r5 = pm0.v.u(r5)
            java.lang.String r6 = "feedid"
            r3.s(r6, r5)
            java.lang.String r5 = "card_index"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            r3.s(r5, r6)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 r5 = r10.f203321g
            r45.qt2 r5 = r5.f203491n
            if (r5 == 0) goto L92
            java.lang.String r4 = r5.m75945x2fec8307(r7)
        L92:
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)
            java.lang.String r5 = ","
            java.lang.String r6 = ";"
            java.lang.String r1 = r26.i0.t(r3, r5, r6, r1)
            java.lang.String r3 = ""
            java.lang.String r5 = "main_page_end_live_card_recall"
            r0.P6(r3, r4, r5, r1)
        Laa:
            up2.o r0 = r10.f203320f
            int r0 = r0.a0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[NearbyEndLive] SpecialColumn removeFeedAndCheckContainer called latestIndex="
            r1.<init>(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.SpecialColumnListConvert"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 r3 = r10.f203321g
            vp2.l0 r4 = r10.f203318d
            up2.o r6 = r10.f203320f
            int r7 = r2 + r0
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 r8 = r10.f203322h
            r5 = r2
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5.o(r3, r4, r5, r6, r7, r8)
        Ld1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l5.run():void");
    }
}
