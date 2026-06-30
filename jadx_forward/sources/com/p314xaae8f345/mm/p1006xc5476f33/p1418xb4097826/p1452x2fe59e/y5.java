package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class y5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f192677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f192678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f192679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.bs2 f192680g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192681h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, so2.y0 y0Var, long j17, r45.bs2 bs2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        super(0);
        this.f192677d = a7Var;
        this.f192678e = y0Var;
        this.f192679f = j17;
        this.f192680g = bs2Var;
        this.f192681h = abstractC14490x69736cb5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r4.f492236d.T0() == r5) goto L27;
     */
    @Override // yz5.a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo152xb9724478() {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.feed.a7 r0 = r13.f192677d
            az2.f r1 = r0.f187761x0
            if (r1 == 0) goto L9
            r1.b()
        L9:
            r1 = 0
            so2.y0 r3 = r13.f192678e
            if (r3 == 0) goto L18
            com.tencent.mm.plugin.finder.storage.yj0 r4 = r3.f492236d
            if (r4 == 0) goto L18
            long r4 = r4.T0()
            goto L19
        L18:
            r4 = r1
        L19:
            so2.y0 r4 = r0.N(r4)
            if (r4 != 0) goto L2d
            if (r3 == 0) goto L29
            com.tencent.mm.plugin.finder.storage.yj0 r4 = r3.f492236d
            if (r4 == 0) goto L29
            long r1 = r4.Y0()
        L29:
            so2.y0 r4 = r0.N(r1)
        L2d:
            r1 = 1
            r2 = 0
            if (r4 != 0) goto L51
            com.tencent.mm.plugin.finder.feed.model.y r4 = r0.f187743g
            long r5 = r13.f192679f
            int r7 = r4.e(r5)
            int r7 = r7 + r1
            int r8 = r4.h()
            if (r7 >= r8) goto L4f
            so2.y0 r4 = r4.f(r7)
            com.tencent.mm.plugin.finder.storage.yj0 r7 = r4.f492236d
            long r7 = r7.T0()
            int r5 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r5 != 0) goto L4f
            goto L54
        L4f:
            r4 = r2
            goto L54
        L51:
            r12 = r4
            r4 = r3
            r3 = r12
        L54:
            r45.bs2 r5 = r13.f192680g
            com.tencent.mm.protobuf.g r1 = r5.m75934xbce7f2f(r1)
            if (r1 == 0) goto L9f
            byte[] r11 = r1.f273689a
            if (r11 == 0) goto L9f
            long r7 = r13.f192679f
            int r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14133xabc4217e.f191567n
            if (r3 == 0) goto L70
            com.tencent.mm.plugin.finder.storage.yj0 r1 = r3.f492236d
            if (r1 == 0) goto L70
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = r1.u0()
            r9 = r1
            goto L71
        L70:
            r9 = r2
        L71:
            if (r4 == 0) goto L7b
            com.tencent.mm.plugin.finder.storage.yj0 r1 = r4.f492236d
            if (r1 == 0) goto L7b
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r1.u0()
        L7b:
            r10 = r2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r13.f192681h
            java.lang.String r1 = "feed"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r1)
            com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment r1 = new com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment
            r5 = r1
            r5.<init>(r6, r7, r9, r10, r11)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            android.content.Context r0 = r0.f187740d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r0, r2)
            com.tencent.mm.ui.MMActivity r0 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r0
            androidx.fragment.app.FragmentManager r0 = r0.mo7595x9cdc264()
            androidx.fragment.app.i2 r0 = r0.m7630xb2c12e75()
            java.lang.String r2 = "CommentShareDialog"
            r1.m7413x35dafd(r0, r2)
        L9f:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.y5.mo152xb9724478():java.lang.Object");
    }
}
