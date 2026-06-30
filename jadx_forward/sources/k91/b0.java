package k91;

/* loaded from: classes.dex */
public final class b0 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public b0() {
        super(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandGlobalSystemConfigResUpdateListener", "<init>");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0090  */
    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 r14) {
        /*
            r13 = this;
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r14 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5255x5f3208fd) r14
            am.r2 r0 = r14.f135586g
            int r0 = r0.f89292a
            r1 = 0
            r2 = 38
            if (r0 != r2) goto La9
            java.lang.String r0 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r3 = "callback called"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r3)
            am.r2 r14 = r14.f135586g
            int r0 = r14.f89293b
            int r3 = r14.f89295d
            java.lang.String r6 = r14.f89294c
            boolean r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r6)
            r10 = 1
            if (r14 == 0) goto L3c
            boolean r14 = com.p314xaae8f345.mm.vfs.w6.j(r6)
            if (r14 != 0) goto L3c
            java.lang.String r14 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r1 = "handleResUpdate(%dv%d) resPath(%s) not exists"
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r2, r6}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r14, r1, r0)
            goto La8
        L3c:
            java.lang.String r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.a()
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r14)
            if (r4 != 0) goto L49
            java.lang.String r4 = "!fileExists"
            goto L5f
        L49:
            java.lang.String r4 = com.p314xaae8f345.mm.vfs.w6.p(r6)
            java.lang.String r5 = com.p314xaae8f345.mm.vfs.w6.p(r14)
            boolean r7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r4)
            if (r7 != 0) goto L62
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L62
            java.lang.String r4 = "md5 updated"
        L5f:
            r8 = r4
            r4 = r10
            goto L66
        L62:
            java.lang.String r4 = "md5 latested"
            r8 = r4
            r4 = r1
        L66:
            if (r4 == 0) goto L6f
            boolean r14 = com.p314xaae8f345.mm.sdk.p2603x2137b148.k1.d(r6, r14)
            if (r14 == 0) goto L6f
            r1 = r10
        L6f:
            java.lang.String r14 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r11 = "handleResUpdate(%dv%d) resPath(%s) doCopy?:%b, reason:%s, copyOK?:%b"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r1)
            r4 = r5
            r5 = r7
            r7 = r9
            r9 = r12
            java.lang.Object[] r4 = new java.lang.Object[]{r4, r5, r6, r7, r8, r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r14, r11, r4)
            if (r1 == 0) goto La8
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig> r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.class
            monitor-enter(r14)
            r1 = 0
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.A1 = r1     // Catch: java.lang.Throwable -> La5
            monitor-exit(r14)
            java.lang.Class<zy.r> r14 = zy.r.class
            i95.m r14 = i95.n0.c(r14)
            zy.r r14 = (zy.r) r14
            yy.a r14 = (yy.a) r14
            r14.Ri(r2, r0, r3)
            goto La8
        La5:
            r0 = move-exception
            monitor-exit(r14)
            throw r0
        La8:
            r1 = r10
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.b0.mo778xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
