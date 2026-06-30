package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class ti extends com.tencent.mm.plugin.finder.feed.kr {

    /* renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f110574p0;

    /* renamed from: x0, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f110575x0;

    /* renamed from: y0, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderProfileLongFeedTimelineUI f110576y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ti(com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, boolean z17, long j17, com.tencent.mm.plugin.finder.feed.ui.FinderProfileLongFeedTimelineUI finderProfileLongFeedTimelineUI) {
        super(mMActivity, str, z17, j17, false, false, 0L, "", 0, "", null, "", null);
        this.f110574p0 = mMActivity;
        this.f110575x0 = str;
        this.f110576y0 = finderProfileLongFeedTimelineUI;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    @Override // com.tencent.mm.plugin.finder.feed.kr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader p() {
        /*
            r10 = this;
            com.tencent.mm.ui.MMActivity r0 = r10.f110574p0
            boolean r1 = lk5.s.b(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L25
            com.tencent.mm.plugin.finder.storage.t70 r1 = com.tencent.mm.plugin.finder.storage.t70.f127590a
            jz5.g r1 = com.tencent.mm.plugin.finder.storage.t70.F9
            jz5.n r1 = (jz5.n) r1
            java.lang.Object r1 = r1.getValue()
            lb2.j r1 = (lb2.j) r1
            java.lang.Object r1 = r1.r()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r3) goto L23
            goto L25
        L23:
            r9 = r2
            goto L26
        L25:
            r9 = r3
        L26:
            com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader r1 = new com.tencent.mm.plugin.finder.feed.model.FinderProfileLiveUserPageTimeLineLoader
            java.lang.String r5 = r10.f110575x0
            java.lang.String r6 = xy2.c.e(r0)
            r7 = 1
            pf5.z r3 = pf5.z.f353948a
            pf5.v r3 = r3.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r4 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r3 = r3.a(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.ny r3 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r3
            r45.qt2 r8 = r3.V6()
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "getIntent(...)"
            kotlin.jvm.internal.o.f(r0, r3)
            r1.initFromCache(r0)
            com.tencent.mm.plugin.finder.feed.ui.FinderProfileLongFeedTimelineUI r0 = r10.f110576y0
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r3 = "KEY_FROM_PROFILE"
            boolean r0 = r0.getBooleanExtra(r3, r2)
            if (r0 == 0) goto L62
            r1.requestRefresh()
        L62:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.ti.p():com.tencent.mm.plugin.finder.feed.model.FinderProfileFeedLoader");
    }
}
