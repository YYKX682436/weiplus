package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* loaded from: classes7.dex */
public final class p9 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.w3 {
    public void Ai(java.lang.String str) {
        boolean z17 = false;
        if (str != null) {
            if (str.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("WxaPkgPublicStorageRefCountService").remove(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WxaPkgPublicStorageRefCountService", "filename is empty when remove record");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Bi(java.lang.String r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L11
            int r2 = r7.length()
            if (r2 <= 0) goto Lc
            r2 = r0
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 != r0) goto L11
            r2 = r0
            goto L12
        L11:
            r2 = r1
        L12:
            if (r2 != 0) goto L1c
            java.lang.String r7 = "MicroMsg.WxaPkgPublicStorageRefCountService"
            java.lang.String r0 = "filename is empty when remove ref"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r7, r0)
            return r1
        L1c:
            gm0.m r2 = gm0.j1.b()
            java.lang.String r2 = r2.j()
            java.lang.String r3 = "WxaPkgPublicStorageRefCountService"
            com.tencent.mm.sdk.platformtools.o4 r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(r3)
            java.util.Set r4 = r3.v(r7)
            if (r4 != 0) goto L31
            return r1
        L31:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L3b
            r3.remove(r7)
            return r0
        L3b:
            boolean r2 = r4.remove(r2)
            if (r2 != 0) goto L42
            return r1
        L42:
            boolean r1 = r4.isEmpty()
            if (r1 == 0) goto L4c
            r3.remove(r7)
            return r0
        L4c:
            boolean r7 = r3.F(r7, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9.Bi(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000d, code lost:
    
        if ((r8.length() > 0) == true) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean wi(java.lang.String r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L10
            int r1 = r8.length()
            r2 = 1
            if (r1 <= 0) goto Lc
            r1 = r2
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 != r2) goto L10
            goto L11
        L10:
            r2 = r0
        L11:
            java.lang.String r1 = "MicroMsg.WxaPkgPublicStorageRefCountService"
            if (r2 != 0) goto L1b
            java.lang.String r8 = "filename is empty when add ref"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r8)
            return r0
        L1b:
            gm0.m r2 = gm0.j1.b()
            java.lang.String r2 = r2.j()
            java.lang.String r3 = "WxaPkgPublicStorageRefCountService"
            com.tencent.mm.sdk.platformtools.o4 r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R(r3)
            java.util.Set r4 = r3.v(r8)
            if (r4 != 0) goto L38
            java.util.Set r0 = kz5.o1.c(r2)
            boolean r8 = r3.F(r8, r0)
            return r8
        L38:
            boolean r5 = r4.isEmpty()
            if (r5 == 0) goto L4f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "ref count = 0!, file name: "
            r5.<init>(r6)
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r5)
        L4f:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)
            boolean r1 = r4.add(r2)
            if (r1 != 0) goto L59
            return r0
        L59:
            boolean r8 = r3.F(r8, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p9.wi(java.lang.String):boolean");
    }
}
