package com.tencent.mm.plugin.finder.feed.ui.commentimage;

/* loaded from: classes10.dex */
public final class h0 implements qn5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI f109844a;

    public h0(com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI finderCommentImageFlowUI) {
        this.f109844a = finderCommentImageFlowUI;
    }

    @Override // qn5.c
    public void a(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d7  */
    @Override // qn5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onLoadMore() {
        /*
            r26 = this;
            r0 = r26
            com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI r1 = r0.f109844a
            int r2 = com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI.U
            com.tencent.mm.plugin.finder.feed.ui.commentimage.d1 r1 = r1.d7()
            com.tencent.mm.plugin.finder.feed.ui.commentimage.FinderCommentImageFlowUI r2 = r0.f109844a
            r1.getClass()
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r2, r3)
            com.tencent.mm.protobuf.g r3 = r1.f109829p
            if (r3 != 0) goto L1f
            java.lang.String r3 = "FinderCommentImageFlowViewModel"
            java.lang.String r4 = "loadMoreImageComment: lastBuffer is null"
            com.tencent.mars.xlog.Log.e(r3, r4)
        L1f:
            db2.j4 r3 = new db2.j4
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.O6()
            long r6 = r4.getId()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.O6()
            java.lang.String r8 = r4.getDupFlag()
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = r1.O6()
            java.lang.String r9 = r4.getObjectNonceId()
            pf5.z r4 = pf5.z.f353948a
            pf5.v r5 = r4.a(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r5 = r5.a(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r5 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r5
            r11 = 0
            if (r5 == 0) goto L4e
            int r5 = r5.f135380n
            r12 = r5
            goto L4f
        L4e:
            r12 = r11
        L4f:
            int r13 = r1.f109822f
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r1.O6()
            java.lang.String r14 = r5.getUserName()
            com.tencent.mm.protobuf.g r15 = r1.f109829p
            r16 = 0
            r17 = 0
            r19 = 0
            pf5.v r4 = r4.a(r2)
            androidx.lifecycle.c1 r4 = r4.a(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r4 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r4
            r5 = 0
            if (r4 == 0) goto L73
            r45.qt2 r4 = r4.V6()
            goto L74
        L73:
            r4 = r5
        L74:
            r20 = 1
            boolean r10 = hc2.t.d(r2)
            r0 = 1
            if (r10 == 0) goto L99
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r1.O6()
            boolean r10 = r10.isChosenComment()
            if (r10 == 0) goto L99
            com.tencent.mm.plugin.finder.feed.f7 r10 = r1.f109824h
            if (r10 == 0) goto L93
            boolean r10 = r10.a()
            if (r10 != r0) goto L93
            r10 = r0
            goto L94
        L93:
            r10 = r11
        L94:
            if (r10 == 0) goto L99
            r21 = r0
            goto L9b
        L99:
            r21 = r11
        L9b:
            r45.vg7 r11 = r1.f109825i
            if (r11 == 0) goto Ld7
            r22 = 2
            r23 = 896(0x380, float:1.256E-42)
            r24 = 0
            r5 = r3
            r10 = r12
            r25 = r11
            r11 = r13
            r12 = r14
            r13 = r15
            r14 = r16
            r15 = r17
            r17 = r19
            r18 = r4
            r19 = r20
            r20 = r21
            r21 = r25
            r5.<init>(r6, r8, r9, r10, r11, r12, r13, r14, r15, r17, r18, r19, r20, r21, r22, r23, r24)
            pq5.g r3 = r3.l()
            com.tencent.mm.plugin.finder.feed.ui.commentimage.y0 r4 = new com.tencent.mm.plugin.finder.feed.ui.commentimage.y0
            r4.<init>(r1)
            pq5.g r3 = r3.q(r4)
            com.tencent.mm.plugin.finder.feed.ui.commentimage.z0 r4 = new com.tencent.mm.plugin.finder.feed.ui.commentimage.z0
            r4.<init>(r1)
            pq5.g r1 = r3.h(r4)
            r1.f(r2)
            return r0
        Ld7:
            java.lang.String r0 = "sortType"
            kotlin.jvm.internal.o.o(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.commentimage.h0.onLoadMore():boolean");
    }
}
