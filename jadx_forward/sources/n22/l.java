package n22;

/* loaded from: classes12.dex */
public abstract class l {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
    
        if (r3 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a() {
        /*
            java.lang.Class<com.tencent.mm.feature.emoji.b0> r0 = com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.emoji.b0 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) r0
            r0.getClass()
            com.tencent.mm.storage.n5 r0 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f()
            z85.d r0 = r0.b()
            r0.getClass()
            java.lang.String r1 = "select * from EmojiGroupInfo where type=?"
            r2 = 0
            r3 = 0
            l75.k0 r0 = r0.f552321d     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            java.lang.String r6 = "1"
            r5[r2] = r6     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r6 = 2
            android.database.Cursor r3 = r0.f(r1, r5, r6)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            if (r3 == 0) goto L42
            boolean r0 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            if (r0 == 0) goto L42
            com.tencent.mm.storage.emotion.EmojiGroupInfo r0 = new com.tencent.mm.storage.emotion.EmojiGroupInfo     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r0.<init>()     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r0.mo9015xbf5d97fd(r3)     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            int r0 = r0.f68378x225ba391     // Catch: java.lang.Throwable -> L45 java.lang.Exception -> L47
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 <= 0) goto L40
            r2 = r4
        L40:
            r2 = r2 ^ r4
            goto L4d
        L42:
            if (r3 == 0) goto L50
            goto L4d
        L45:
            r0 = move-exception
            goto L51
        L47:
            r0 = move-exception
            r0.toString()     // Catch: java.lang.Throwable -> L45
            if (r3 == 0) goto L50
        L4d:
            r3.close()
        L50:
            return r2
        L51:
            if (r3 == 0) goto L56
            r3.close()
        L56:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: n22.l.a():boolean");
    }

    public static boolean b(java.lang.String str) {
        if (str == null) {
            return false;
        }
        return str.equals("17");
    }

    public static boolean c(r45.zj0 zj0Var) {
        if (zj0Var == null) {
            return false;
        }
        return b(zj0Var.f473661d);
    }
}
