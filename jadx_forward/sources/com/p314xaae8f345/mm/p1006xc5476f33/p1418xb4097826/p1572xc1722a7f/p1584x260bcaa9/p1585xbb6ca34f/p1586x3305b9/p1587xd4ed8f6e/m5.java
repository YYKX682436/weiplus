package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class m5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vp2.l0 f203345d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ up2.o f203346e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 f203347f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 f203348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f203349h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(vp2.l0 l0Var, up2.o oVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.a5 a5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t5 t5Var, in5.s0 s0Var) {
        super(2);
        this.f203345d = l0Var;
        this.f203346e = oVar;
        this.f203347f = a5Var;
        this.f203348g = t5Var;
        this.f203349h = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0048 A[LOOP:0: B:2:0x0016->B:12:0x0048, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[EDGE_INSN: B:13:0x004c->B:14:0x004c BREAK  A[LOOP:0: B:2:0x0016->B:12:0x0048], SYNTHETIC] */
    @Override // yz5.p
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo149xb9724478(java.lang.Object r11, java.lang.Object r12) {
        /*
            r10 = this;
            java.lang.Number r11 = (java.lang.Number) r11
            long r6 = r11.longValue()
            java.lang.Number r12 = (java.lang.Number) r12
            long r8 = r12.longValue()
            vp2.l0 r11 = r10.f203345d
            java.util.ArrayList r11 = r11.f520474e
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
            r0 = r12
        L16:
            boolean r1 = r11.hasNext()
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r11.next()
            so2.j5 r1 = (so2.j5) r1
            boolean r4 = r1 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5
            if (r4 == 0) goto L44
            zl2.q4 r4 = zl2.q4.f555466a
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) r1
            boolean r4 = r4.C(r1)
            if (r4 == 0) goto L44
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.getFeedObject()
            com.tencent.mm.protocal.protobuf.FinderObject r1 = r1.getFeedObject()
            long r4 = r1.m76784x5db1b11()
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L44
            r1 = r2
            goto L45
        L44:
            r1 = r12
        L45:
            if (r1 == 0) goto L48
            goto L4c
        L48:
            int r0 = r0 + 1
            goto L16
        L4b:
            r0 = r3
        L4c:
            if (r0 == r3) goto L9a
            up2.o r11 = r10.f203346e
            int r12 = r11.a0()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[NearbyEndLive] SpecialColumn show ended UI at index="
            r1.<init>(r3)
            r1.append(r0)
            java.lang.String r3 = ", will remove after 500ms"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.SpecialColumnListConvert"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            int r0 = r0 + r12
            dk2.zg r12 = new dk2.zg
            r12.<init>()
            r12.f315977g = r2
            r11.m8148xed6e4d18(r0, r12)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l5 r11 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l5
            vp2.l0 r1 = r10.f203345d
            in5.s0 r2 = r10.f203349h
            up2.o r3 = r10.f203346e
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 r4 = r10.f203348g
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a5 r12 = r10.f203347f
            r0 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r8)
            java.util.List r12 = r12.f203113h
            java.util.ArrayList r12 = (java.util.ArrayList) r12
            r12.add(r11)
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t5 r12 = r10.f203348g
            com.tencent.mm.view.recyclerview.WxRecyclerView r12 = r12.f203493p
            if (r12 == 0) goto L9a
            r0 = 500(0x1f4, double:2.47E-321)
            r12.postDelayed(r11, r0)
        L9a:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.m5.mo149xb9724478(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
