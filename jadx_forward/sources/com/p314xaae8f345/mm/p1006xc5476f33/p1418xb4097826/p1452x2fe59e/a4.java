package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f187731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f187732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f187733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f187735h;

    public a4(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, long j17, int i18, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f187731d = i17;
        this.f187732e = a7Var;
        this.f187733f = j17;
        this.f187734g = i18;
        this.f187735h = c1163xf1deaba4;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0065  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r15 = this;
            com.tencent.mm.plugin.finder.feed.a7 r0 = r15.f187732e
            com.tencent.mm.plugin.finder.feed.model.y r1 = r0.f187743g
            java.util.ArrayList r1 = r1.f190002d
            int r2 = r15.f187731d
            java.lang.Object r1 = kz5.n0.a0(r1, r2)
            so2.y0 r1 = (so2.y0) r1
            long r3 = r15.f187733f
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L1e
            long r7 = r1.mo2128x1ed62e84()
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L1e
            r1 = r5
            goto L1f
        L1e:
            r1 = r6
        L1f:
            com.tencent.mm.plugin.finder.feed.model.y r7 = r0.f187743g
            if (r1 != 0) goto L27
            int r2 = r7.e(r3)
        L27:
            if (r2 < 0) goto L33
            java.util.ArrayList r1 = r7.f190002d
            int r1 = r1.size()
            if (r2 >= r1) goto L33
            r1 = r5
            goto L34
        L33:
            r1 = r6
        L34:
            if (r1 == 0) goto Lba
            r1 = 2
            int r3 = r15.f187734g
            if (r3 == r1) goto L46
            r4 = 3
            if (r3 == r4) goto L46
            r4 = 4
            if (r3 == r4) goto L47
            r4 = 6
            if (r3 == r4) goto L46
            r4 = r1
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != r1) goto L58
            so2.z0 r1 = r7.f190001c
            if (r1 == 0) goto L4f
            r1 = r5
            goto L50
        L4f:
            r1 = r6
        L50:
            if (r2 > r1) goto L58
            boolean r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.q(r0, r2)
            if (r0 != 0) goto Lba
        L58:
            androidx.recyclerview.widget.RecyclerView r0 = r15.f187735h
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
            if (r1 == 0) goto L65
            androidx.recyclerview.widget.LinearLayoutManager r0 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) r0
            goto L66
        L65:
            r0 = 0
        L66:
            if (r0 == 0) goto Lba
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f554818a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r1.add(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.add(r2)
            java.util.Collections.reverse(r1)
            java.lang.Object[] r8 = r1.toArray()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$3$1"
            java.lang.String r10 = "run"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "scrollToPositionWithOffset"
            java.lang.String r14 = "(II)V"
            r7 = r0
            yj0.a.d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r1.get(r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            java.lang.Object r1 = r1.get(r5)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.P(r2, r1)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$onAttach$3$1"
            java.lang.String r9 = "run"
            java.lang.String r10 = "()V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "scrollToPositionWithOffset"
            java.lang.String r13 = "(II)V"
            yj0.a.f(r7, r8, r9, r10, r11, r12, r13)
        Lba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a4.run():void");
    }
}
