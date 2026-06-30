package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class el implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl f199797d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199798e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f199799f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f199800g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f199801h;

    public el(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hl hlVar, java.lang.String str, ce2.i iVar, boolean z17, java.lang.String str2) {
        this.f199797d = hlVar;
        this.f199798e = str;
        this.f199799f = iVar;
        this.f199800g = z17;
        this.f199801h = str2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
    
        if (r5 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (r5 == null) goto L24;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.live.widget.hl r0 = r13.f199797d
            com.tencent.mm.view.MMPAGView r1 = r0.f200106a
            r2 = 3
            r1.m82584xebcf33cb(r2)
            com.tencent.mm.view.MMPAGView r1 = r0.f200106a
            r3 = 0
            r1.m82583xcde73672(r3)
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0
            r1.<init>()
            java.lang.String r4 = r13.f199798e
            r1.f391656d = r4
            ce2.i r4 = r13.f199799f
            boolean r5 = r4.a1()
            r6 = 0
            if (r5 == 0) goto L53
            r45.xi6 r5 = r4.f67816xdcd1d904
            r7 = 1
            if (r5 == 0) goto L2e
            r8 = 4
            boolean r5 = r5.m75933x41a8a7f2(r8)
            if (r5 != r7) goto L2e
            r5 = r7
            goto L2f
        L2e:
            r5 = r3
        L2f:
            if (r5 == 0) goto L53
            r45.xi6 r4 = r4.f67816xdcd1d904
            if (r4 == 0) goto L4f
            r5 = 5
            java.lang.String r5 = r4.m75945x2fec8307(r5)
            if (r5 == 0) goto L49
            int r8 = r5.length()
            if (r8 <= 0) goto L43
            r3 = r7
        L43:
            if (r3 == 0) goto L46
            goto L47
        L46:
            r5 = r6
        L47:
            if (r5 != 0) goto L4d
        L49:
            java.lang.String r5 = r4.m75945x2fec8307(r2)
        L4d:
            if (r5 != 0) goto L51
        L4f:
            java.lang.String r5 = ""
        L51:
            r1.f391656d = r5
        L53:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "customText:"
            r2.<init>(r3)
            java.lang.Object r3 = r1.f391656d
            java.lang.String r3 = (java.lang.String) r3
            r2.append(r3)
            java.lang.String r3 = ", useRfx:"
            r2.append(r3)
            boolean r3 = r13.f199800g
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "FinderLiveGiftPlayPagWidget"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
            ym5.l2 r2 = ym5.l2.f544957a
            com.tencent.mm.view.MMPAGView r2 = r0.f200106a
            ym5.j2[] r2 = ym5.j2.f544925d
            com.tencent.mm.view.MMPAGView r2 = r0.f200106a
            r2.o(r3)
            com.tencent.mm.plugin.finder.live.plugin.kn r7 = r0.f200107b
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            r9 = 0
            com.tencent.mm.plugin.finder.live.widget.dl r10 = new com.tencent.mm.plugin.finder.live.widget.dl
            java.lang.String r2 = r13.f199801h
            r10.<init>(r2, r0, r1, r6)
            r11 = 2
            r12 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(r7, r8, r9, r10, r11, r12)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "playGiftAnimation launch timer by "
            r1.<init>(r3)
            com.tencent.mm.view.MMPAGView r0 = r0.f200106a
            long r5 = r0.c()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r5 = r5 / r7
            r1.append(r5)
            java.lang.String r0 = ", pagPath:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.el.run():void");
    }
}
