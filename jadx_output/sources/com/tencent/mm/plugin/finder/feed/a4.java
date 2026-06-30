package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class a4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f106198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f106199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f106200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f106201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f106202h;

    public a4(int i17, com.tencent.mm.plugin.finder.feed.a7 a7Var, long j17, int i18, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f106198d = i17;
        this.f106199e = a7Var;
        this.f106200f = j17;
        this.f106201g = i18;
        this.f106202h = recyclerView;
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
            com.tencent.mm.plugin.finder.feed.a7 r0 = r15.f106199e
            com.tencent.mm.plugin.finder.feed.model.y r1 = r0.f106210g
            java.util.ArrayList r1 = r1.f108469d
            int r2 = r15.f106198d
            java.lang.Object r1 = kz5.n0.a0(r1, r2)
            so2.y0 r1 = (so2.y0) r1
            long r3 = r15.f106200f
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L1e
            long r7 = r1.getItemId()
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L1e
            r1 = r5
            goto L1f
        L1e:
            r1 = r6
        L1f:
            com.tencent.mm.plugin.finder.feed.model.y r7 = r0.f106210g
            if (r1 != 0) goto L27
            int r2 = r7.e(r3)
        L27:
            if (r2 < 0) goto L33
            java.util.ArrayList r1 = r7.f108469d
            int r1 = r1.size()
            if (r2 >= r1) goto L33
            r1 = r5
            goto L34
        L33:
            r1 = r6
        L34:
            if (r1 == 0) goto Lba
            r1 = 2
            int r3 = r15.f106201g
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
            so2.z0 r1 = r7.f108468c
            if (r1 == 0) goto L4f
            r1 = r5
            goto L50
        L4f:
            r1 = r6
        L50:
            if (r2 > r1) goto L58
            boolean r0 = com.tencent.mm.plugin.finder.feed.a7.q(r0, r2)
            if (r0 != 0) goto Lba
        L58:
            androidx.recyclerview.widget.RecyclerView r0 = r15.f106202h
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r1 == 0) goto L65
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            goto L66
        L65:
            r0 = 0
        L66:
            if (r0 == 0) goto Lba
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.ThreadLocal r3 = zj0.c.f473285a
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.a4.run():void");
    }
}
