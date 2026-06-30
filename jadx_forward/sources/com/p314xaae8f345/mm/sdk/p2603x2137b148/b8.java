package com.p314xaae8f345.mm.sdk.p2603x2137b148;

/* loaded from: classes.dex */
public abstract class b8 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[Catch: NumberFormatException -> 0x000c, TryCatch #0 {NumberFormatException -> 0x000c, blocks: (B:16:0x0003, B:5:0x0011, B:6:0x001a, B:14:0x0016), top: B:15:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[Catch: NumberFormatException -> 0x000c, TryCatch #0 {NumberFormatException -> 0x000c, blocks: (B:16:0x0003, B:5:0x0011, B:6:0x001a, B:14:0x0016), top: B:15:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(java.lang.String r3) {
        /*
            r0 = 0
            if (r3 == 0) goto Le
            boolean r1 = r26.n0.N(r3)     // Catch: java.lang.NumberFormatException -> Lc
            if (r1 == 0) goto La
            goto Le
        La:
            r1 = r0
            goto Lf
        Lc:
            r3 = move-exception
            goto L22
        Le:
            r1 = 1
        Lf:
            if (r1 == 0) goto L16
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc
            goto L1a
        L16:
            java.lang.Integer r3 = java.lang.Integer.decode(r3)     // Catch: java.lang.NumberFormatException -> Lc
        L1a:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)     // Catch: java.lang.NumberFormatException -> Lc
            int r0 = r3.intValue()     // Catch: java.lang.NumberFormatException -> Lc
            goto L31
        L22:
            java.lang.String r3 = r3.getMessage()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r1 = "MicroMsg.StringKt"
            java.lang.String r2 = "safeToInt fail %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r2, r3)
        L31:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.a(java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0016 A[Catch: NumberFormatException -> 0x000c, TryCatch #0 {NumberFormatException -> 0x000c, blocks: (B:16:0x0003, B:5:0x0011, B:6:0x001a, B:14:0x0016), top: B:15:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0011 A[Catch: NumberFormatException -> 0x000c, TryCatch #0 {NumberFormatException -> 0x000c, blocks: (B:16:0x0003, B:5:0x0011, B:6:0x001a, B:14:0x0016), top: B:15:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int b(java.lang.String r2, int r3) {
        /*
            r0 = 0
            if (r2 == 0) goto Le
            boolean r1 = r26.n0.N(r2)     // Catch: java.lang.NumberFormatException -> Lc
            if (r1 == 0) goto La
            goto Le
        La:
            r1 = r0
            goto Lf
        Lc:
            r2 = move-exception
            goto L22
        Le:
            r1 = 1
        Lf:
            if (r1 == 0) goto L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.NumberFormatException -> Lc
            goto L1a
        L16:
            java.lang.Integer r2 = java.lang.Integer.decode(r2)     // Catch: java.lang.NumberFormatException -> Lc
        L1a:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r2)     // Catch: java.lang.NumberFormatException -> Lc
            int r3 = r2.intValue()     // Catch: java.lang.NumberFormatException -> Lc
            goto L31
        L22:
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            java.lang.String r0 = "MicroMsg.StringKt"
            java.lang.String r1 = "safeToInt fail %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1, r2)
        L31:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.b(java.lang.String, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0013 A[Catch: NumberFormatException -> 0x000d, TRY_LEAVE, TryCatch #0 {NumberFormatException -> 0x000d, blocks: (B:16:0x0004, B:8:0x0013), top: B:15:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long c(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Lf
            boolean r2 = r26.n0.N(r4)     // Catch: java.lang.NumberFormatException -> Ld
            if (r2 == 0) goto Lb
            goto Lf
        Lb:
            r2 = 0
            goto L10
        Ld:
            r4 = move-exception
            goto L18
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L13
            goto L27
        L13:
            long r0 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> Ld
            goto L27
        L18:
            java.lang.String r4 = r4.getMessage()
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r2 = "MicroMsg.StringKt"
            java.lang.String r3 = "safeToLong fail %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r3, r4)
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(java.lang.String):long");
    }
}
