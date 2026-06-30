package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f106420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f106420d = baseFinderFeed;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (((r3 == null || (r3 = r3.getFeedObject()) == null || (r3 = r3.getLiveInfo()) == null) ? 1 : r3.getInteger(2)) != 1) goto L19;
     */
    @Override // yz5.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke(java.lang.Object r3) {
        /*
            r2 = this;
            so2.j5 r3 = (so2.j5) r3
            java.lang.String r0 = "it"
            kotlin.jvm.internal.o.g(r3, r0)
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r2.f106420d
            boolean r0 = kotlin.jvm.internal.o.b(r3, r0)
            if (r0 != 0) goto L30
            boolean r0 = r3 instanceof so2.h1
            if (r0 == 0) goto L16
            so2.h1 r3 = (so2.h1) r3
            goto L17
        L16:
            r3 = 0
        L17:
            r0 = 1
            if (r3 == 0) goto L2c
            com.tencent.mm.plugin.finder.storage.FinderItem r3 = r3.getFeedObject()
            if (r3 == 0) goto L2c
            r45.nw1 r3 = r3.getLiveInfo()
            if (r3 == 0) goto L2c
            r1 = 2
            int r3 = r3.getInteger(r1)
            goto L2d
        L2c:
            r3 = r0
        L2d:
            if (r3 == r0) goto L30
            goto L31
        L30:
            r0 = 0
        L31:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.c.invoke(java.lang.Object):java.lang.Object");
    }
}
