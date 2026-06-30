package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class u6 extends com.tencent.mm.plugin.finder.feed.model.internal.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader f108397d;

    public u6(com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader finderProfilePaidCollectionLoader) {
        this.f108397d = finderProfilePaidCollectionLoader;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.v6 v6Var = new com.tencent.mm.plugin.finder.feed.model.v6(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader finderProfilePaidCollectionLoader = this.f108397d;
        v6Var.setIncrementList(finderProfilePaidCollectionLoader.f107600f);
        v6Var.setLastBuffer(finderProfilePaidCollectionLoader.f107601g);
        return v6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0036 A[SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse dealOnSceneEnd(int r10, int r11, java.lang.String r12, com.tencent.mm.modelbase.i r13, com.tencent.mm.protobuf.f r14) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof bq.f1
            r1 = 0
            if (r0 == 0) goto Ld9
            boolean r0 = r14 instanceof r45.go2
            if (r0 == 0) goto Ld9
            com.tencent.mm.plugin.finder.feed.model.v6 r0 = new com.tencent.mm.plugin.finder.feed.model.v6
            r0.<init>(r10, r11, r12)
            r12 = 0
            r2 = 1
            if (r10 != 0) goto L21
            if (r11 != 0) goto L21
            r10 = r14
            r45.go2 r10 = (r45.go2) r10
            r11 = 3
            int r10 = r10.getInteger(r11)
            if (r10 == 0) goto L1f
            goto L21
        L1f:
            r10 = r12
            goto L22
        L21:
            r10 = r2
        L22:
            r0.setHasMore(r10)
            r45.go2 r14 = (r45.go2) r14
            java.util.LinkedList r10 = r14.getList(r2)
            if (r10 == 0) goto Lc6
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r10 = r10.iterator()
        L36:
            boolean r3 = r10.hasNext()
            if (r3 == 0) goto Lc5
            java.lang.Object r3 = r10.next()
            r45.do2 r3 = (r45.do2) r3
            com.tencent.mm.protobuf.f r4 = r3.getCustom(r12)
            r45.uz0 r4 = (r45.uz0) r4
            r5 = 13
            if (r4 == 0) goto L54
            int r4 = r4.getInteger(r5)
            if (r4 != r2) goto L54
            r4 = r2
            goto L55
        L54:
            r4 = r12
        L55:
            r6 = 0
            if (r4 == 0) goto L80
            java.lang.String r4 = r9.getTAG()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "skip course invalid "
            r5.<init>(r8)
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r12)
            r45.uz0 r3 = (r45.uz0) r3
            if (r3 == 0) goto L70
            long r6 = r3.getLong(r12)
        L70:
            java.lang.String r3 = pm0.v.u(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.mars.xlog.Log.i(r4, r3)
        L7e:
            r4 = r1
            goto Lbe
        L80:
            com.tencent.mm.protobuf.f r4 = r3.getCustom(r2)
            r45.n11 r4 = (r45.n11) r4
            if (r4 == 0) goto L90
            int r4 = r4.getInteger(r5)
            if (r4 != r2) goto L90
            r4 = r2
            goto L91
        L90:
            r4 = r12
        L91:
            if (r4 == 0) goto Lb9
            java.lang.String r4 = r9.getTAG()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "skip drama invalid "
            r5.<init>(r8)
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r2)
            r45.n11 r3 = (r45.n11) r3
            if (r3 == 0) goto Laa
            long r6 = r3.getLong(r12)
        Laa:
            java.lang.String r3 = pm0.v.u(r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            com.tencent.mars.xlog.Log.i(r4, r3)
            goto L7e
        Lb9:
            nr2.m r4 = new nr2.m
            r4.<init>(r3)
        Lbe:
            if (r4 == 0) goto L36
            r11.add(r4)
            goto L36
        Lc5:
            r1 = r11
        Lc6:
            r0.setIncrementList(r1)
            r10 = 4
            com.tencent.mm.protobuf.g r10 = r14.getByteString(r10)
            r0.setLastBuffer(r10)
            bq.f1 r13 = (bq.f1) r13
            int r10 = r13.f23485o
            r0.setPullType(r10)
            return r0
        Ld9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.u6.dealOnSceneEnd(int, int, java.lang.String, com.tencent.mm.modelbase.i, com.tencent.mm.protobuf.f):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genLoadMoreCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader finderProfilePaidCollectionLoader = this.f108397d;
        return new bq.f1(finderProfilePaidCollectionLoader.f107598d, finderProfilePaidCollectionLoader.getLastBuffer(), finderProfilePaidCollectionLoader.getContextObj(), 2);
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.x
    public com.tencent.mm.modelbase.i genRefreshCgi() {
        com.tencent.mm.plugin.finder.feed.model.FinderProfilePaidCollectionLoader finderProfilePaidCollectionLoader = this.f108397d;
        return new bq.f1(finderProfilePaidCollectionLoader.f107598d, null, finderProfilePaidCollectionLoader.getContextObj(), 0);
    }
}
