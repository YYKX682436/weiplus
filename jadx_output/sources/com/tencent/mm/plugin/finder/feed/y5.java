package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f111145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f111146f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.bs2 f111147g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f111148h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(com.tencent.mm.plugin.finder.feed.a7 a7Var, so2.y0 y0Var, long j17, r45.bs2 bs2Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(0);
        this.f111144d = a7Var;
        this.f111145e = y0Var;
        this.f111146f = j17;
        this.f111147g = bs2Var;
        this.f111148h = baseFinderFeed;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r4.f410703d.T0() == r5) goto L27;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r13 = this;
            com.tencent.mm.plugin.finder.feed.a7 r0 = r13.f111144d
            az2.f r1 = r0.f106228x0
            if (r1 == 0) goto L9
            r1.b()
        L9:
            r1 = 0
            so2.y0 r3 = r13.f111145e
            if (r3 == 0) goto L18
            com.tencent.mm.plugin.finder.storage.yj0 r4 = r3.f410703d
            if (r4 == 0) goto L18
            long r4 = r4.T0()
            goto L19
        L18:
            r4 = r1
        L19:
            so2.y0 r4 = r0.N(r4)
            if (r4 != 0) goto L2d
            if (r3 == 0) goto L29
            com.tencent.mm.plugin.finder.storage.yj0 r4 = r3.f410703d
            if (r4 == 0) goto L29
            long r1 = r4.Y0()
        L29:
            so2.y0 r4 = r0.N(r1)
        L2d:
            r1 = 1
            r2 = 0
            if (r4 != 0) goto L51
            com.tencent.mm.plugin.finder.feed.model.y r4 = r0.f106210g
            long r5 = r13.f111146f
            int r7 = r4.e(r5)
            int r7 = r7 + r1
            int r8 = r4.h()
            if (r7 >= r8) goto L4f
            so2.y0 r4 = r4.f(r7)
            com.tencent.mm.plugin.finder.storage.yj0 r7 = r4.f410703d
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
            r45.bs2 r5 = r13.f111147g
            com.tencent.mm.protobuf.g r1 = r5.getByteString(r1)
            if (r1 == 0) goto L9f
            byte[] r11 = r1.f192156a
            if (r11 == 0) goto L9f
            long r7 = r13.f111146f
            int r1 = com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment.f110034n
            if (r3 == 0) goto L70
            com.tencent.mm.plugin.finder.storage.yj0 r1 = r3.f410703d
            if (r1 == 0) goto L70
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r1 = r1.u0()
            r9 = r1
            goto L71
        L70:
            r9 = r2
        L71:
            if (r4 == 0) goto L7b
            com.tencent.mm.plugin.finder.storage.yj0 r1 = r4.f410703d
            if (r1 == 0) goto L7b
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r2 = r1.u0()
        L7b:
            r10 = r2
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r6 = r13.f111148h
            java.lang.String r1 = "feed"
            kotlin.jvm.internal.o.g(r6, r1)
            com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment r1 = new com.tencent.mm.plugin.finder.feed.ui.fragment.FinderCommentShareDialogFragment
            r5 = r1
            r5.<init>(r6, r7, r9, r10, r11)
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            android.content.Context r0 = r0.f106207d
            kotlin.jvm.internal.o.e(r0, r2)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.mm.ui.MMActivity) r0
            androidx.fragment.app.FragmentManager r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.i2 r0 = r0.beginTransaction()
            java.lang.String r2 = "CommentShareDialog"
            r1.show(r0, r2)
        L9f:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.y5.invoke():java.lang.Object");
    }
}
