package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class x3 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zy2.gc f111031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.a7 f111032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f111033f;

    public x3(zy2.gc gcVar, com.tencent.mm.plugin.finder.feed.a7 a7Var, java.lang.Runnable runnable) {
        this.f111031d = gcVar;
        this.f111032e = a7Var;
        this.f111033f = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002b, code lost:
    
        if (r3.isShowing() == true) goto L14;
     */
    @Override // zy2.gc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void r5(java.lang.Object r2, r45.ix0 r3) {
        /*
            r1 = this;
            r45.nh2 r2 = (r45.nh2) r2
            java.lang.String r0 = "req"
            kotlin.jvm.internal.o.g(r2, r0)
            java.lang.String r0 = "ret"
            kotlin.jvm.internal.o.g(r3, r0)
            zy2.gc r0 = r1.f111031d
            if (r0 == 0) goto L13
            r0.r5(r2, r3)
        L13:
            com.tencent.mm.plugin.finder.feed.a7 r2 = r1.f111032e
            yw2.a0 r3 = r2.f106216o
            if (r3 == 0) goto L22
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r3.s()
            java.lang.Runnable r0 = r1.f111033f
            r3.removeCallbacks(r0)
        L22:
            android.app.Dialog r3 = r2.F1
            if (r3 == 0) goto L2e
            boolean r3 = r3.isShowing()
            r0 = 1
            if (r3 != r0) goto L2e
            goto L2f
        L2e:
            r0 = 0
        L2f:
            if (r0 == 0) goto L38
            android.app.Dialog r2 = r2.F1
            if (r2 == 0) goto L38
            r2.dismiss()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.x3.r5(java.lang.Object, r45.ix0):void");
    }
}
