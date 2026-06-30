package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public class v9 implements uh4.f0 {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d A[SYNTHETIC] */
    @Override // uh4.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDataChanged() {
        /*
            r9 = this;
            java.lang.Class<uh4.c0> r0 = uh4.c0.class
            i95.m r1 = i95.n0.c(r0)
            uh4.c0 r1 = (uh4.c0) r1
            boolean r1 = r1.isTeenMode()
            i95.m r0 = i95.n0.c(r0)
            uh4.c0 r0 = (uh4.c0) r0
            int r0 = r0.hd()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}
            java.lang.String r3 = "MicroMsg.SubCoreAppBrand"
            java.lang.String r4 = "onTeenModeDataChanged isTeenMode: %b, miniProgramOption: %d"
            com.tencent.mars.xlog.Log.i(r3, r4, r2)
            if (r1 == 0) goto Lca
            r1 = 1
            if (r0 == r1) goto Lca
            com.tencent.mm.plugin.appbrand.task.u0 r2 = com.tencent.mm.plugin.appbrand.task.u0.C()
            com.tencent.mm.plugin.appbrand.app.u9 r3 = new com.tencent.mm.plugin.appbrand.app.u9
            r3.<init>(r9, r0)
            java.util.List r0 = r2.k()
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.appbrand.task.k r2 = (com.tencent.mm.plugin.appbrand.task.k) r2
            r2.getClass()
            java.util.Collection r4 = r2.h()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L8b
            java.lang.Object r6 = r4.next()
            r7 = r6
            com.tencent.luggage.sdk.processes.s r7 = (com.tencent.luggage.sdk.processes.s) r7
            boolean r8 = r7.f47688e
            if (r8 != 0) goto L84
            int r8 = r7.f47685b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r7 = r7.f47684a
            java.lang.Object r7 = r3.invoke(r7, r8)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L84
            r7 = r1
            goto L85
        L84:
            r7 = 0
        L85:
            if (r7 == 0) goto L5d
            r5.add(r6)
            goto L5d
        L8b:
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = kz5.d0.q(r5, r6)
            r4.<init>(r6)
            java.util.Iterator r5 = r5.iterator()
        L9a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto Lac
            java.lang.Object r6 = r5.next()
            com.tencent.luggage.sdk.processes.s r6 = (com.tencent.luggage.sdk.processes.s) r6
            java.lang.String r6 = r6.f47684a
            r4.add(r6)
            goto L9a
        Lac:
            java.util.Iterator r4 = r4.iterator()
        Lb0:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3f
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage r6 = new com.tencent.mm.plugin.appbrand.task.ipc.AppBrandKillByClientMessage
            com.tencent.luggage.sdk.processes.c r7 = com.tencent.luggage.sdk.processes.c.f47630d
            r7 = 4
            r6.<init>(r5, r7)
            r5 = 2
            r7 = 0
            com.tencent.luggage.sdk.processes.h.q(r2, r6, r7, r5, r7)
            goto Lb0
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.app.v9.onDataChanged():void");
    }
}
