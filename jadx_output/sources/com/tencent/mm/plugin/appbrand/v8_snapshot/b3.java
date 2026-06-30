package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class b3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f90685d;

    public b3(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader) {
        this.f90685d = iCommLibReader;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0022 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r14 = this;
            java.util.Set r0 = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90708f
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r1 = r14.f90685d
            r0.remove(r1)
            com.tencent.mm.plugin.appbrand.v8_snapshot.f3 r0 = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d
            com.tencent.mm.plugin.appbrand.v8_snapshot.s3 r0 = r0.i()
            if (r0 == 0) goto L17
            r1 = 2147483647(0x7fffffff, float:NaN)
            java.util.List r0 = r0.L0(r1)
            goto L19
        L17:
            kz5.p0 r0 = kz5.p0.f313996d
        L19:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L89
            java.lang.Object r2 = r0.next()
            com.tencent.mm.plugin.appbrand.v8_snapshot.q3 r2 = (com.tencent.mm.plugin.appbrand.v8_snapshot.q3) r2
            com.tencent.mm.plugin.appbrand.v8_snapshot.o3 r3 = com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo.f90661v
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r3 = r3.a(r2)
            r4 = 0
            if (r3 != 0) goto L39
        L37:
            r3 = r4
            goto L83
        L39:
            java.lang.String r5 = r3.f90666f
            com.tencent.mm.vfs.z7 r5 = com.tencent.mm.vfs.z7.a(r5)
            r6 = 0
            java.lang.String r7 = r5.f213279f
            if (r7 == 0) goto L5d
            java.lang.String r11 = com.tencent.mm.vfs.e8.l(r7, r6, r6)
            boolean r7 = r7.equals(r11)
            if (r7 != 0) goto L5d
            com.tencent.mm.vfs.z7 r7 = new com.tencent.mm.vfs.z7
            java.lang.String r9 = r5.f213277d
            java.lang.String r10 = r5.f213278e
            java.lang.String r12 = r5.f213280g
            java.lang.String r13 = r5.f213281h
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            r5 = r7
        L5d:
            com.tencent.mm.vfs.b3 r7 = com.tencent.mm.vfs.a3.f212781a
            com.tencent.mm.vfs.z2 r5 = r7.m(r5, r4)
            boolean r7 = r5.a()
            if (r7 != 0) goto L6a
            goto L72
        L6a:
            com.tencent.mm.vfs.q2 r6 = r5.f213266a
            java.lang.String r5 = r5.f213267b
            boolean r6 = r6.F(r5)
        L72:
            if (r6 != 0) goto L83
            com.tencent.mm.plugin.appbrand.v8_snapshot.f3 r5 = com.tencent.mm.plugin.appbrand.v8_snapshot.f3.f90706d
            java.util.List r2 = kz5.b0.c(r2)
            com.tencent.mm.plugin.appbrand.v8_snapshot.a3 r6 = new com.tencent.mm.plugin.appbrand.v8_snapshot.a3
            r6.<init>(r3)
            r5.b(r2, r6)
            goto L37
        L83:
            if (r3 == 0) goto L22
            r1.add(r3)
            goto L22
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "done#onCommLibUsingVersionUpdate, existSnapshotCount: "
            r0.<init>(r2)
            int r2 = r1.size()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "MicroMsg.WxaCommLibV8SnapshotServiceImpl"
            com.tencent.mars.xlog.Log.i(r2, r0)
            com.tencent.mm.plugin.appbrand.v8_snapshot.k2 r0 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90749a
            r0.getClass()
            boolean r0 = com.tencent.mm.plugin.appbrand.v8_snapshot.k2.f90751c
            if (r0 == 0) goto Lcb
            java.util.Iterator r0 = r1.iterator()
        Lad:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lcb
            java.lang.Object r1 = r0.next()
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r1 = (com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo) r1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "done#onCommLibUsingVersionUpdate, existSnapshot: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.tencent.mars.xlog.Log.i(r2, r1)
            goto Lad
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.v8_snapshot.b3.run():void");
    }
}
