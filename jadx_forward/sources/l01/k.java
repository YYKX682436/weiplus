package l01;

/* loaded from: classes7.dex */
public final class k implements l01.s {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f396311a = (java.lang.String) l01.b.f396271g.b();

    public k(l01.c cVar) {
    }

    public boolean a(java.lang.String str) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            if (com.p314xaae8f345.mm.vfs.w6.h(this.f396311a + str)) {
                return true;
            }
        }
        return false;
    }

    public java.io.InputStream b(java.lang.String str) {
        java.lang.String str2 = this.f396311a + str;
        if (com.p314xaae8f345.mm.vfs.w6.j(str2 + ".wlock")) {
            return null;
        }
        try {
            return com.p314xaae8f345.mm.vfs.w6.E(str2);
        } catch (java.io.IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #1 {all -> 0x0055, blocks: (B:3:0x0007, B:5:0x000d, B:8:0x0015, B:10:0x001f, B:11:0x002e, B:16:0x004e, B:18:0x003b, B:20:0x0045), top: B:2:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.OutputStream c(java.lang.String r14) {
        /*
            r13 = this;
            java.lang.String r0 = "MicroMsg.AppBrandSimpleImageLoader.DefaultDiskCache"
            java.lang.String r1 = r13.f396311a
            r2 = 0
            r3 = 0
            r4 = 1
            boolean r5 = com.p314xaae8f345.mm.vfs.w6.u(r1)     // Catch: java.lang.Throwable -> L55
            if (r5 != 0) goto L5f
            com.tencent.mm.vfs.z7 r5 = com.p314xaae8f345.mm.vfs.z7.a(r1)     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = r5.f294812f
            if (r6 == 0) goto L2e
            java.lang.String r10 = com.p314xaae8f345.mm.vfs.e8.l(r6, r3, r3)     // Catch: java.lang.Throwable -> L55
            boolean r6 = r6.equals(r10)     // Catch: java.lang.Throwable -> L55
            if (r6 != 0) goto L2e
            com.tencent.mm.vfs.z7 r6 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L55
            java.lang.String r8 = r5.f294810d     // Catch: java.lang.Throwable -> L55
            java.lang.String r9 = r5.f294811e     // Catch: java.lang.Throwable -> L55
            java.lang.String r11 = r5.f294813g     // Catch: java.lang.Throwable -> L55
            java.lang.String r12 = r5.f294814h     // Catch: java.lang.Throwable -> L55
            r7 = r6
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L55
            r5 = r6
        L2e:
            com.tencent.mm.vfs.b3 r6 = com.p314xaae8f345.mm.vfs.a3.f294314a     // Catch: java.lang.Throwable -> L55
            com.tencent.mm.vfs.z2 r5 = r6.m(r5, r2)     // Catch: java.lang.Throwable -> L55
            boolean r6 = r5.a()     // Catch: java.lang.Throwable -> L55
            if (r6 != 0) goto L3b
            goto L4b
        L3b:
            com.tencent.mm.vfs.q2 r6 = r5.f294799a     // Catch: java.lang.Throwable -> L55
            java.lang.String r5 = r5.f294800b     // Catch: java.lang.Throwable -> L55
            com.tencent.mm.vfs.x1 r5 = r6.m(r5)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L4b
            boolean r5 = r5.f294769f     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L4b
            r5 = r4
            goto L4c
        L4b:
            r5 = r3
        L4c:
            if (r5 != 0) goto L5f
            com.p314xaae8f345.mm.vfs.w6.h(r1)     // Catch: java.lang.Throwable -> L55
            com.p314xaae8f345.mm.vfs.w6.u(r1)     // Catch: java.lang.Throwable -> L55
            goto L5f
        L55:
            r5 = move-exception
            java.lang.String r6 = "openWrite mkdirs e=%s"
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r6, r5)
        L5f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r14)
            java.lang.String r5 = r5.toString()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r7 = ".wlock"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p314xaae8f345.mm.vfs.w6.h(r6)
            com.p314xaae8f345.mm.vfs.w6.g(r6, r4)
            byte[] r7 = new byte[r4]
            com.p314xaae8f345.mm.vfs.w6.S(r6, r7, r3, r4)
            com.p314xaae8f345.mm.vfs.w6.h(r5)     // Catch: java.io.IOException -> L9a
            com.p314xaae8f345.mm.vfs.w6.g(r5, r4)     // Catch: java.io.IOException -> L9a
            l01.j r4 = new l01.j     // Catch: java.io.IOException -> L9a
            java.io.OutputStream r3 = com.p314xaae8f345.mm.vfs.w6.K(r5, r3)     // Catch: java.io.IOException -> L9a
            r4.<init>(r13, r3, r6)     // Catch: java.io.IOException -> L9a
            return r4
        L9a:
            r3 = move-exception
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.Object[] r14 = new java.lang.Object[]{r14, r1}
            java.lang.String r1 = "openWrite fileName %s, parent exists[%b]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r3, r1, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l01.k.c(java.lang.String):java.io.OutputStream");
    }
}
