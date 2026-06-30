package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class xb extends com.tencent.mm.plugin.finder.feed.gj {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xb(com.tencent.mm.ui.MMActivity context, com.tencent.mm.plugin.finder.feed.wb presenter, int i17, int i18) {
        super(context, presenter, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(presenter, "presenter");
        this.f106977p = false;
    }

    @Override // com.tencent.mm.plugin.finder.feed.i0
    public android.view.View j() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    @Override // com.tencent.mm.plugin.finder.feed.gj, com.tencent.mm.plugin.finder.feed.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void u() {
        /*
            r10 = this;
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderHalfScreenContract.Presenter"
            com.tencent.mm.plugin.finder.feed.c0 r1 = r10.f106969e
            kotlin.jvm.internal.o.e(r1, r0)
            com.tencent.mm.plugin.finder.feed.wb r1 = (com.tencent.mm.plugin.finder.feed.wb) r1
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r1.E
            java.lang.String r2 = "FinderHalfScreenContract"
            if (r0 == 0) goto L32
            java.lang.String r0 = "cache exist!, show cache first"
            com.tencent.mars.xlog.Log.i(r2, r0)
            java.util.ArrayList r0 = r1.f()
            if (r0 == 0) goto L1d
            r0.clear()
        L1d:
            java.util.ArrayList r0 = r1.f()
            if (r0 == 0) goto L2b
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = r1.E
            kotlin.jvm.internal.o.d(r3)
            r0.add(r3)
        L2b:
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = r10.a()
            r0.notifyDataSetChanged()
        L32:
            long r3 = r1.f110966z
            by1.b r0 = by1.c.f36353b
            by1.c r0 = r0.a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "3688+"
            r5.<init>(r6)
            java.lang.String r3 = pm0.v.u(r3)
            r5.append(r3)
            java.lang.String r3 = "+0+31"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            by1.d r0 = r0.a(r3)
            boolean r3 = r0 instanceof as2.b
            r4 = 0
            if (r3 == 0) goto L5d
            as2.b r0 = (as2.b) r0
            goto L5e
        L5d:
            r0 = r4
        L5e:
            r3 = 1
            r5 = 0
            if (r0 == 0) goto L82
            boolean r6 = r0.d()
            if (r6 == 0) goto L7e
            r45.aa1 r6 = r0.g()
            if (r6 == 0) goto L79
            java.util.LinkedList r6 = r6.getList(r3)
            if (r6 == 0) goto L79
            int r6 = r6.size()
            goto L7a
        L79:
            r6 = r5
        L7a:
            if (r6 <= 0) goto L7e
            r6 = r3
            goto L7f
        L7e:
            r6 = r5
        L7f:
            if (r6 == 0) goto L82
            r4 = r0
        L82:
            if (r4 == 0) goto L85
            goto L86
        L85:
            r3 = r5
        L86:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "onViewPrepared: hasPreloadCache="
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r4 = ", firstObjectId="
            r0.append(r4)
            long r4 = r1.f110966z
            java.lang.String r4 = pm0.v.u(r4)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r2, r0)
            if (r3 == 0) goto Lab
            r1.V()
            goto Lb7
        Lab:
            com.tencent.mm.view.RefreshLoadMoreLayout r4 = r10.o()
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 7
            r9 = 0
            com.tencent.mm.view.RefreshLoadMoreLayout.T(r4, r5, r6, r7, r8, r9)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.xb.u():void");
    }
}
