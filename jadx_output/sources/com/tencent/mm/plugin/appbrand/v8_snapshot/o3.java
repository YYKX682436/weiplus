package com.tencent.mm.plugin.appbrand.v8_snapshot;

/* loaded from: classes7.dex */
public final class o3 {
    public o3(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if (r1.a(r4) != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo a(com.tencent.mm.plugin.appbrand.v8_snapshot.q3 r22) {
        /*
            r21 = this;
            r0 = r22
            java.lang.String r1 = "dao"
            kotlin.jvm.internal.o.g(r0, r1)
            java.lang.String r1 = r0.field_wxaPkgMd5
            if (r1 == 0) goto L3a
            java.lang.String r1 = r0.field_wxaPkgPath
            r3 = 1
            if (r1 == 0) goto L19
            int r1 = r1.length()
            if (r1 != 0) goto L17
            goto L19
        L17:
            r1 = 0
            goto L1a
        L19:
            r1 = r3
        L1a:
            if (r1 != 0) goto L3a
            java.lang.String r1 = r0.field_snapshotCategory
            if (r1 == 0) goto L29
            int r1 = r1.length()
            if (r1 != 0) goto L27
            goto L29
        L27:
            r1 = 0
            goto L2a
        L29:
            r1 = r3
        L2a:
            if (r1 != 0) goto L3a
            com.tencent.mm.plugin.appbrand.v8_snapshot.k3 r1 = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90770f
            java.lang.String r4 = r0.field_snapshotCategory
            kotlin.jvm.internal.o.d(r4)
            com.tencent.mm.plugin.appbrand.v8_snapshot.l3 r1 = r1.a(r4)
            if (r1 == 0) goto L3a
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r3 != 0) goto L3f
            r0 = 0
            return r0
        L3f:
            com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo r19 = new com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo
            int r3 = r0.field_arch
            java.lang.String r4 = r0.field_wxaPkgMd5
            kotlin.jvm.internal.o.d(r4)
            java.lang.String r5 = r0.field_wxaPkgPath
            kotlin.jvm.internal.o.d(r5)
            int r6 = r0.field_wxaPkgVersion
            com.tencent.mm.plugin.appbrand.v8_snapshot.k3 r1 = com.tencent.mm.plugin.appbrand.v8_snapshot.l3.f90770f
            java.lang.String r7 = r0.field_snapshotCategory
            kotlin.jvm.internal.o.d(r7)
            com.tencent.mm.plugin.appbrand.v8_snapshot.l3 r7 = r1.a(r7)
            kotlin.jvm.internal.o.d(r7)
            java.lang.String r1 = r0.field_snapshotPath
            if (r1 != 0) goto L63
            java.lang.String r1 = ""
        L63:
            r8 = r1
            long r9 = r0.field_snapshotLastModified
            long r11 = r0.field_snapshotLength
            java.lang.String r1 = r0.field_snapshotBaseConfig
            java.lang.String r13 = "{}"
            java.lang.String r14 = com.tencent.mm.plugin.appbrand.utils.j1.a(r1, r13)
            org.json.JSONObject r15 = new org.json.JSONObject
            java.lang.String r1 = r0.field_snapshotMetaInfo
            java.lang.String r1 = com.tencent.mm.plugin.appbrand.utils.j1.a(r1, r13)
            r15.<init>(r1)
            boolean r1 = r0.field_isNodeSnapshot
            java.lang.String r2 = r0.field_snapshotNodeConfig
            java.lang.String r17 = com.tencent.mm.plugin.appbrand.utils.j1.a(r2, r13)
            int r2 = r0.field_producingSnapshotCount
            if (r2 >= 0) goto L8b
            r18 = 0
            goto L8d
        L8b:
            r18 = r2
        L8d:
            int r2 = r0.field_consumingSnapshotCount
            if (r2 >= 0) goto L94
            r20 = 0
            goto L96
        L94:
            r20 = r2
        L96:
            int r0 = r0.field_recoverCount
            if (r0 >= 0) goto L9b
            r0 = 0
        L9b:
            r16 = r1
            r1 = r19
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r10 = r11
            r12 = r14
            r13 = r15
            r14 = r16
            r15 = r17
            r16 = r18
            r17 = r20
            r18 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r12, r13, r14, r15, r16, r17, r18)
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.v8_snapshot.o3.a(com.tencent.mm.plugin.appbrand.v8_snapshot.q3):com.tencent.mm.plugin.appbrand.v8_snapshot.WxaPkgV8SnapshotInfo");
    }

    public final java.lang.String b(com.tencent.mm.plugin.appbrand.v8_snapshot.l3 snapshotCategory) {
        kotlin.jvm.internal.o.g(snapshotCategory, "snapshotCategory");
        return snapshotCategory.f90775d + ":main";
    }
}
