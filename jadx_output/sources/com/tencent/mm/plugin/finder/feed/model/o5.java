package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class o5 extends com.tencent.mm.plugin.finder.feed.model.internal.y {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader f108223e;

    public o5(com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader finderPoiRelateLoader) {
        this.f108223e = finderPoiRelateLoader;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0045  */
    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse b(int r6, int r7, java.lang.String r8, com.tencent.mm.modelbase.m1 r9) {
        /*
            r5 = this;
            java.lang.String r0 = "scene"
            kotlin.jvm.internal.o.g(r9, r0)
            boolean r0 = r9 instanceof db2.x5
            r1 = 0
            if (r0 == 0) goto L83
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetFinderRelativePoiListResponse"
            r2 = 1
            if (r6 != 0) goto L29
            if (r7 != 0) goto L29
            r3 = r9
            db2.x5 r3 = (db2.x5) r3
            com.tencent.mm.modelbase.o r3 = r3.f228236g
            com.tencent.mm.modelbase.n r3 = r3.f70711b
            com.tencent.mm.protobuf.f r3 = r3.f70700a
            kotlin.jvm.internal.o.e(r3, r0)
            r45.yf3 r3 = (r45.yf3) r3
            r4 = 3
            int r3 = r3.getInteger(r4)
            if (r3 == 0) goto L27
            goto L29
        L27:
            r3 = 0
            goto L2a
        L29:
            r3 = r2
        L2a:
            com.tencent.mm.plugin.finder.feed.model.n5 r4 = new com.tencent.mm.plugin.finder.feed.model.n5
            r4.<init>(r6, r7, r8)
            r4.setHasMore(r3)
            db2.x5 r9 = (db2.x5) r9
            com.tencent.mm.modelbase.o r6 = r9.f228236g
            com.tencent.mm.modelbase.n r7 = r6.f70711b
            com.tencent.mm.protobuf.f r7 = r7.f70700a
            kotlin.jvm.internal.o.e(r7, r0)
            r45.yf3 r7 = (r45.yf3) r7
            java.util.LinkedList r7 = r7.getList(r2)
            if (r7 == 0) goto L69
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = 10
            int r8 = kz5.d0.q(r7, r8)
            r1.<init>(r8)
            java.util.Iterator r7 = r7.iterator()
        L54:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L69
            java.lang.Object r8 = r7.next()
            r45.ao5 r8 = (r45.ao5) r8
            so2.m4 r2 = new so2.m4
            r2.<init>(r8)
            r1.add(r2)
            goto L54
        L69:
            r4.setIncrementList(r1)
            com.tencent.mm.modelbase.n r6 = r6.f70711b
            com.tencent.mm.protobuf.f r6 = r6.f70700a
            kotlin.jvm.internal.o.e(r6, r0)
            r45.yf3 r6 = (r45.yf3) r6
            r7 = 2
            com.tencent.mm.protobuf.g r6 = r6.getByteString(r7)
            r4.setLastBuffer(r6)
            int r6 = r9.f228238i
            r4.setPullType(r6)
            return r4
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.model.o5.b(int, int, java.lang.String, com.tencent.mm.modelbase.m1):com.tencent.mm.plugin.finder.feed.model.internal.IResponse");
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 c() {
        com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader finderPoiRelateLoader = this.f108223e;
        db2.x5 x5Var = new db2.x5(finderPoiRelateLoader.f107552d, finderPoiRelateLoader.getLastBuffer(), finderPoiRelateLoader.getContextObj());
        x5Var.f228238i = 2;
        return x5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.plugin.finder.feed.model.internal.IResponse callInit() {
        com.tencent.mm.plugin.finder.feed.model.n5 n5Var = new com.tencent.mm.plugin.finder.feed.model.n5(0, 0, "");
        com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader finderPoiRelateLoader = this.f108223e;
        com.tencent.mm.plugin.finder.feed.model.r9 cache = finderPoiRelateLoader.getCache();
        n5Var.setIncrementList(cache != null ? cache.f108300a : null);
        com.tencent.mm.plugin.finder.feed.model.r9 cache2 = finderPoiRelateLoader.getCache();
        n5Var.setLastBuffer(cache2 != null ? cache2.f108301b : null);
        return n5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public com.tencent.mm.modelbase.m1 d() {
        com.tencent.mm.plugin.finder.feed.model.FinderPoiRelateLoader finderPoiRelateLoader = this.f108223e;
        db2.x5 x5Var = new db2.x5(finderPoiRelateLoader.f107552d, finderPoiRelateLoader.getLastBuffer(), finderPoiRelateLoader.getContextObj());
        x5Var.f228238i = 0;
        return x5Var;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.y
    public java.util.List e() {
        return kz5.b0.c(6208);
    }
}
