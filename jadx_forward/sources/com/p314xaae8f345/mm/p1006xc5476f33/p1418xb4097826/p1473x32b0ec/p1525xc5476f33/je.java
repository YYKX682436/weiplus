package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class je implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194619d;

    public je(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar) {
        this.f194619d = mgVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            r11 = this;
            java.lang.String r0 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$7"
            java.lang.String r1 = "android/view/View$OnTouchListener"
            java.lang.String r2 = "onTouch"
            java.lang.String r3 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r12)
            r4.add(r13)
            java.lang.Object[] r5 = r4.toArray()
            r4.clear()
            r4 = r11
            yj0.a.b(r0, r1, r2, r3, r4, r5)
            int r12 = r13.getAction()
            r0 = 3
            r1 = 2
            r2 = 0
            com.tencent.mm.plugin.finder.live.plugin.mg r3 = r11.f194619d
            r4 = 1
            if (r12 == 0) goto L47
            if (r12 == r4) goto L32
            if (r12 == r1) goto L32
            if (r12 == r0) goto L32
        L30:
            r12 = r2
            goto L4e
        L32:
            float r12 = r13.getRawY()
            float r5 = r3.Q
            float r12 = r12 - r5
            float r12 = java.lang.Math.abs(r12)
            int r5 = android.view.ViewConfiguration.getTouchSlop()
            float r5 = (float) r5
            int r12 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r12 <= 0) goto L30
            goto L4d
        L47:
            float r12 = r13.getRawY()
            r3.Q = r12
        L4d:
            r12 = r4
        L4e:
            if (r12 == 0) goto L58
            com.tencent.mm.plugin.finder.live.view.FinderLiveOverScrollRecyclerView r12 = r3.C1()
            r12.dispatchTouchEvent(r13)
            goto L77
        L58:
            java.lang.Integer[] r12 = new java.lang.Integer[r1]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r12[r2] = r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r12[r4] = r0
            int r13 = r13.getAction()
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            boolean r12 = kz5.z.G(r12, r13)
            if (r12 == 0) goto L77
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.t1(r3)
        L77:
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommentPlugin$7"
            java.lang.String r8 = "android/view/View$OnTouchListener"
            java.lang.String r9 = "onTouch"
            java.lang.String r10 = "(Landroid/view/View;Landroid/view/MotionEvent;)Z"
            r5 = 1
            r6 = r11
            yj0.a.i(r5, r6, r7, r8, r9, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.je.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
