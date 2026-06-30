package t21;

/* loaded from: classes5.dex */
public abstract class u2 {
    public static java.lang.String a(byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b17 : bArr) {
            java.lang.String hexString = java.lang.Integer.toHexString(b17 & 255);
            if (hexString.length() < 2) {
                sb6.append(0);
            }
            sb6.append(hexString);
        }
        return sb6.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061 A[LOOP:0: B:13:0x0036->B:21:0x0061, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean b(java.lang.String r12) {
        /*
            java.lang.String r0 = "video/hevc"
            boolean r1 = com.p314xaae8f345.mm.vfs.w6.j(r12)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.Object[] r1 = new java.lang.Object[]{r12}
            java.lang.String r3 = "MicroMsg.VideoFile"
            java.lang.String r4 = "check is h265 video %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4, r1)
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            e42.d0 r5 = e42.d0.clicfg_videofile_ish265_use_native
            h62.d r1 = (h62.d) r1
            r6 = 1
            int r1 = r1.Ni(r5, r6)
            if (r1 != 0) goto L80
            r1 = 0
            gp.c r5 = new gp.c     // Catch: java.lang.Throwable -> L6b
            r5.<init>()     // Catch: java.lang.Throwable -> L6b
            r5.k(r12)     // Catch: java.lang.Throwable -> L68
            int r7 = r5.d()     // Catch: java.lang.Throwable -> L68
            r8 = r2
        L36:
            if (r8 >= r7) goto L64
            android.media.MediaFormat r9 = r5.e(r8)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r10 = "mime"
            java.lang.String r9 = r9.getString(r10)     // Catch: java.lang.Throwable -> L4e
            boolean r10 = r0.equalsIgnoreCase(r9)     // Catch: java.lang.Throwable -> L4c
            if (r10 == 0) goto L57
            r5.g()
            return r6
        L4c:
            r10 = move-exception
            goto L50
        L4e:
            r10 = move-exception
            r9 = r1
        L50:
            java.lang.Object[] r11 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L68
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r10, r4, r11)     // Catch: java.lang.Throwable -> L68
        L57:
            boolean r9 = r0.equalsIgnoreCase(r9)     // Catch: java.lang.Throwable -> L68
            if (r9 == 0) goto L61
            r5.g()
            return r6
        L61:
            int r8 = r8 + 1
            goto L36
        L64:
            r5.g()
            goto L78
        L68:
            r0 = move-exception
            r1 = r5
            goto L6c
        L6b:
            r0 = move-exception
        L6c:
            java.lang.Object[] r12 = new java.lang.Object[]{r12}     // Catch: java.lang.Throwable -> L79
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r3, r0, r4, r12)     // Catch: java.lang.Throwable -> L79
            if (r1 == 0) goto L78
            r1.g()
        L78:
            return r2
        L79:
            r12 = move-exception
            if (r1 == 0) goto L7f
            r1.g()
        L7f:
            throw r12
        L80:
            boolean r12 = com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.C17686x19aef5c7.m69204x8998e7bb(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.u2.b(java.lang.String):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
    
        if (r2 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c(java.lang.String r5) {
        /*
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            r0 = 1
            r2 = 0
            java.io.InputStream r2 = com.p314xaae8f345.mm.vfs.w6.E(r5)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r5 = 10
            byte[] r3 = new byte[r5]     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            r2.read(r3, r1, r5)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.String r5 = a(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r5)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r3 != 0) goto L2f
            java.lang.String r5 = r5.toUpperCase()     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            java.lang.String r3 = "00000014667479707174"
            boolean r5 = r5.contains(r3)     // Catch: java.lang.Throwable -> L33 java.lang.Exception -> L35
            if (r5 == 0) goto L2f
            r2.close()     // Catch: java.io.IOException -> L2e
        L2e:
            return r0
        L2f:
            r2.close()     // Catch: java.io.IOException -> L48
            goto L48
        L33:
            r5 = move-exception
            goto L49
        L35:
            r5 = move-exception
            java.lang.String r3 = "MicroMsg.VideoFile"
            java.lang.String r4 = "exception:%s"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L33
            java.lang.String r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(r5)     // Catch: java.lang.Throwable -> L33
            r0[r1] = r5     // Catch: java.lang.Throwable -> L33
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r4, r0)     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L48
            goto L2f
        L48:
            return r1
        L49:
            if (r2 == 0) goto L4e
            r2.close()     // Catch: java.io.IOException -> L4e
        L4e:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: t21.u2.c(java.lang.String):boolean");
    }
}
