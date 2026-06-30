package com.tencent.mm.plugin.finder.feed.model;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "removeIt", "Lcom/tencent/mm/plugin/finder/storage/FinderItem;", "invoke", "(Lcom/tencent/mm/plugin/finder/storage/FinderItem;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ java.util.List<com.tencent.mm.plugin.finder.storage.FinderItem> $nowList;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1(java.util.List<? extends com.tencent.mm.plugin.finder.storage.FinderItem> list) {
        super(1);
        this.$nowList = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046 A[EDGE_INSN: B:15:0x0046->B:16:0x0046 BREAK  A[LOOP:0: B:2:0x000b->B:22:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:2:0x000b->B:22:?, LOOP_END, SYNTHETIC] */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.tencent.mm.plugin.finder.storage.FinderItem r10) {
        /*
            r9 = this;
            java.lang.String r0 = "removeIt"
            kotlin.jvm.internal.o.g(r10, r0)
            java.util.List<com.tencent.mm.plugin.finder.storage.FinderItem> r0 = r9.$nowList
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L45
            java.lang.Object r1 = r0.next()
            r4 = r1
            com.tencent.mm.plugin.finder.storage.FinderItem r4 = (com.tencent.mm.plugin.finder.storage.FinderItem) r4
            long r5 = r4.getLocalId()
            long r7 = r10.getLocalId()
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L41
            long r5 = r4.field_id
            r7 = 0
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L34
            long r7 = r10.field_id
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L41
        L34:
            int r4 = r4.getCreateTime()
            int r5 = r10.getCreateTime()
            if (r4 != r5) goto L3f
            goto L41
        L3f:
            r4 = r2
            goto L42
        L41:
            r4 = r3
        L42:
            if (r4 == 0) goto Lb
            goto L46
        L45:
            r1 = 0
        L46:
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = (com.tencent.mm.plugin.finder.storage.FinderItem) r1
            if (r1 == 0) goto L4b
            r2 = r3
        L4b:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r2)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader$ProfileDataFetcher$mergeLocalData$1.invoke(com.tencent.mm.plugin.finder.storage.FinderItem):java.lang.Boolean");
    }
}
