package h51;

/* loaded from: classes12.dex */
public abstract class c {
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:43:0x0088
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static java.util.List a(java.util.List r21, java.io.File r22, java.io.OutputStream r23, boolean r24, int r25) {
        /*
            r1 = 0
            if (r24 == 0) goto Ld
            java.util.ArrayList r0 = new java.util.ArrayList
            int r2 = r21.size()
            r0.<init>(r2)
            goto Le
        Ld:
            r0 = r1
        Le:
            h51.f r2 = new h51.f
            r3 = r23
            r4 = r25
            r2.<init>(r3, r4)
            h51.h r3 = new h51.h     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9a
            r4 = r22
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L9a
            java.util.Iterator r1 = r21.iterator()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            r4 = 0
            r6 = r4
        L25:
            boolean r8 = r1.hasNext()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            h51.e r9 = h51.e.COPY
            if (r8 == 0) goto L77
            java.lang.Object r8 = r1.next()     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            h51.j r8 = (h51.j) r8     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            boolean r10 = r8.f360570g     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L8f
            long r11 = r8.f360568e
            long r13 = r8.f360567d
            r8 = r0
            r21 = r1
            long r0 = r13 - r6
            int r15 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r15 <= 0) goto L48
            r3.a(r6, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            r2.a(r3, r9)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
        L48:
            r3.a(r13, r11)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            h51.a r0 = r2.f360558e     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            long r0 = r0.f360547d     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            if (r10 != 0) goto L55
            r2.a(r3, r9)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            goto L5a
        L55:
            h51.e r6 = h51.e.UNCOMPRESS_NOWRAP     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            r2.a(r3, r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
        L5a:
            long r6 = r13 + r11
            if (r24 == 0) goto L73
            if (r10 == 0) goto L73
            h51.a r9 = r2.f360558e     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            long r9 = r9.f360547d     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            long r18 = r9 - r0
            h51.j r9 = new h51.j     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            r20 = 0
            r15 = r9
            r16 = r0
            r15.<init>(r16, r18, r20)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            r8.add(r9)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
        L73:
            r1 = r21
            r0 = r8
            goto L25
        L77:
            r8 = r0
            long r0 = r3.f360565h     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            long r0 = r0 - r6
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L85
            r3.a(r6, r0)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
            r2.a(r3, r9)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L90
        L85:
            r3.close()     // Catch: java.lang.Exception -> L88
        L88:
            r2.close()     // Catch: java.lang.Exception -> L9f
            goto L9f
        L8c:
            r0 = move-exception
            r1 = r3
            goto L93
        L8f:
            r8 = r0
        L90:
            r1 = r3
            goto L9b
        L92:
            r0 = move-exception
        L93:
            r1.close()     // Catch: java.lang.Exception -> L96
        L96:
            r2.close()     // Catch: java.lang.Exception -> L99
        L99:
            throw r0
        L9a:
            r8 = r0
        L9b:
            r1.close()     // Catch: java.lang.Exception -> L88
            goto L88
        L9f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h51.c.a(java.util.List, java.io.File, java.io.OutputStream, boolean, int):java.util.List");
    }
}
