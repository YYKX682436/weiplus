package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class h20 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.j20 f106891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.MemberStatusEvent f106892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h20(com.tencent.mm.plugin.finder.feed.j20 j20Var, com.tencent.mm.autogen.events.MemberStatusEvent memberStatusEvent) {
        super(0);
        this.f106891d = j20Var;
        this.f106892e = memberStatusEvent;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085 A[EDGE_INSN: B:30:0x0085->B:31:0x0085 BREAK  A[LOOP:0: B:17:0x0045->B:43:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[LOOP:0: B:17:0x0045->B:43:?, LOOP_END, SYNTHETIC] */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r12 = this;
            com.tencent.mm.autogen.events.MemberStatusEvent r0 = r12.f106892e
            am.rj r0 = r0.f54494g
            java.lang.String r0 = r0.f7823b
            java.lang.String r1 = "finderUsername"
            kotlin.jvm.internal.o.f(r0, r1)
            com.tencent.mm.plugin.finder.feed.j20 r1 = r12.f106891d
            r1.getClass()
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r2 = r1.f106570t
            if (r2 == 0) goto Lc5
            r3 = 16
            r4 = 0
            r5 = 1
            int r6 = r1.f107074z
            if (r6 == r3) goto L27
            r3 = 23
            if (r6 == r3) goto L27
            r3 = 24
            if (r6 != r3) goto L25
            goto L27
        L25:
            r3 = r4
            goto L28
        L27:
            r3 = r5
        L28:
            if (r3 == 0) goto Lc5
            com.tencent.mm.plugin.finder.feed.i0 r3 = r1.f106424g
            r6 = 0
            if (r3 == 0) goto L34
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            goto L35
        L34:
            r3 = r6
        L35:
            if (r3 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$LayoutManager r7 = r3.getLayoutManager()
            goto L3d
        L3c:
            r7 = r6
        L3d:
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r8 = r2.getDataList()
            java.util.Iterator r8 = r8.iterator()
        L45:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L84
            java.lang.Object r9 = r8.next()
            r10 = r9
            so2.j5 r10 = (so2.j5) r10
            boolean r11 = r10 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed
            if (r11 == 0) goto L80
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r10 = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) r10
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.getFeedObject()
            boolean r11 = r11.isMemberFeed()
            if (r11 == 0) goto L80
            com.tencent.mm.plugin.finder.storage.FinderItem r11 = r10.getFeedObject()
            java.lang.String r11 = r11.getUserName()
            boolean r11 = kotlin.jvm.internal.o.b(r11, r0)
            if (r11 == 0) goto L80
            com.tencent.mm.plugin.finder.storage.FinderItem r10 = r10.getFeedObject()
            java.util.LinkedList r10 = r10.getMediaList()
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L80
            r10 = r5
            goto L81
        L80:
            r10 = r4
        L81:
            if (r10 == 0) goto L45
            goto L85
        L84:
            r9 = r6
        L85:
            if (r9 != 0) goto L88
            goto Lc5
        L88:
            java.lang.String r0 = "update collection member feed"
            java.lang.String r4 = r1.f106569s
            com.tencent.mars.xlog.Log.i(r4, r0)
            boolean r0 = r7 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto Lc5
            androidx.recyclerview.widget.LinearLayoutManager r7 = (androidx.recyclerview.widget.LinearLayoutManager) r7
            int r0 = r7.w()
            int r4 = r7.y()
            int r5 = hc2.f1.f280315a
            java.util.Set r5 = hc2.o0.f280337b
            com.tencent.mm.plugin.finder.assist.p0 r0 = hc2.f1.g(r3, r0, r4, r5)
            com.tencent.mm.plugin.finder.storage.FeedData r0 = r0.f102442e
            if (r0 == 0) goto Lc5
            long r3 = r0.getFeedId()
            com.tencent.mm.plugin.finder.feed.model.internal.BaseFeedLoader r0 = r1.f106570t
            boolean r5 = r0 instanceof com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader
            if (r5 == 0) goto Lb6
            com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader r0 = (com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Loader) r0
            goto Lb7
        Lb6:
            r0 = r6
        Lb7:
            if (r0 != 0) goto Lba
            goto Lbc
        Lba:
            r0.f106162i = r3
        Lbc:
            r2.setLastBuffer(r6)
            r2.clearFromCache()
            r1.P()
        Lc5:
            jz5.f0 r0 = jz5.f0.f302826a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.h20.invoke():java.lang.Object");
    }
}
