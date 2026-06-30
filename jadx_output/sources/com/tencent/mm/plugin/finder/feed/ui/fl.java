package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class fl implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f110021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI f110022b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f110023c;

    public fl(kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI finderSharePostUI, yz5.l lVar) {
        this.f110021a = h0Var;
        this.f110022b = finderSharePostUI;
        this.f110023c = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007d, code lost:
    
        if (r12.getInteger(12) == 1) goto L20;
     */
    @Override // gm5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object call(java.lang.Object r12) {
        /*
            r11 = this;
            com.tencent.mm.modelbase.f r12 = (com.tencent.mm.modelbase.f) r12
            int r0 = r12.f70615a
            r1 = 0
            com.tencent.mm.plugin.finder.feed.ui.FinderSharePostUI r2 = r11.f110022b
            kotlin.jvm.internal.h0 r3 = r11.f110021a
            if (r0 != 0) goto L27
            int r0 = r12.f70616b
            if (r0 != 0) goto L27
            com.tencent.mm.protobuf.f r12 = r12.f70618d
            r45.du2 r12 = (r45.du2) r12
            if (r12 == 0) goto L23
            r0 = 2
            java.util.LinkedList r12 = r12.getList(r0)
            if (r12 == 0) goto L23
            java.lang.Object r12 = kz5.n0.Z(r12)
            r45.e21 r12 = (r45.e21) r12
            goto L24
        L23:
            r12 = r1
        L24:
            r3.f310123d = r12
            goto L5b
        L27:
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r5 = 1253(0x4e5, double:6.19E-321)
            r7 = 71
            r9 = 1
            r4.C(r5, r7, r9)
            java.lang.String r0 = r2.f109545t
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "errorType = "
            r4.<init>(r5)
            int r5 = r12.f70615a
            r4.append(r5)
            java.lang.String r5 = " errorCode = "
            r4.append(r5)
            int r5 = r12.f70616b
            r4.append(r5)
            java.lang.String r5 = "  errorMsg = "
            r4.append(r5)
            java.lang.String r12 = r12.f70617c
            r4.append(r12)
            java.lang.String r12 = r4.toString()
            com.tencent.mars.xlog.Log.i(r0, r12)
        L5b:
            java.lang.String r12 = r2.f109545t
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "eventInfo = "
            r0.<init>(r2)
            java.lang.Object r2 = r3.f310123d
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r12, r0)
            java.lang.Object r12 = r3.f310123d
            r45.e21 r12 = (r45.e21) r12
            if (r12 == 0) goto L80
            r0 = 12
            int r12 = r12.getInteger(r0)
            r0 = 1
            if (r12 != r0) goto L80
            goto L81
        L80:
            r0 = 0
        L81:
            yz5.l r12 = r11.f110023c
            if (r0 == 0) goto L94
            com.tencent.mm.plugin.report.service.g0 r4 = com.tencent.mm.plugin.report.service.g0.INSTANCE
            r5 = 1253(0x4e5, double:6.19E-321)
            r7 = 72
            r9 = 1
            r4.C(r5, r7, r9)
            r12.invoke(r1)
            goto L99
        L94:
            java.lang.Object r0 = r3.f310123d
            r12.invoke(r0)
        L99:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.ui.fl.call(java.lang.Object):java.lang.Object");
    }
}
