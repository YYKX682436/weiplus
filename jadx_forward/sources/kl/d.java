package kl;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f390241a;

    public static void a() {
        if (java.nio.ByteOrder.nativeOrder() == java.nio.ByteOrder.BIG_ENDIAN) {
            f390241a = true;
        } else {
            f390241a = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0021, code lost:
    
        if (r11 != 3) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        if (r11 != 3) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] b(int r9, int r10, int r11, byte[] r12) {
        /*
            if (r12 != 0) goto L3
            return r12
        L3:
            if (r9 != r10) goto L6
            return r12
        L6:
            r0 = 3
            r1 = 1
            r2 = 2
            if (r11 == r1) goto L10
            if (r11 == r2) goto L10
            if (r11 == r0) goto L10
            return r12
        L10:
            int r3 = r12.length
            r4 = 0
            if (r9 == r1) goto L6a
            if (r9 == r2) goto L17
            goto L6c
        L17:
            if (r10 == r1) goto L1a
            goto L6c
        L1a:
            int r3 = r3 / r2
            byte[] r9 = new byte[r3]
            if (r11 == r1) goto L55
            if (r11 == r2) goto L24
            if (r11 == r0) goto L55
            goto L69
        L24:
            r10 = r4
        L25:
            if (r10 >= r3) goto L69
            int r11 = r10 * 2
            r5 = r12[r11]
            int r6 = r11 + 1
            r6 = r12[r6]
            int r7 = r11 + 2
            r7 = r12[r7]
            int r11 = r11 + r0
            r11 = r12[r11]
            boolean r8 = kl.d.f390241a
            short r5 = kl.a.c(r5, r6, r8)
            short r11 = kl.a.c(r7, r11, r8)
            int r5 = r5 / r2
            int r11 = r11 / r2
            int r5 = r5 + r11
            short r11 = (short) r5
            byte[] r11 = kl.a.b(r11, r8)
            r5 = r11[r4]
            r9[r10] = r5
            int r5 = r10 + 1
            r11 = r11[r1]
            r9[r5] = r11
            int r10 = r10 + 2
            goto L25
        L55:
            if (r4 >= r3) goto L69
            int r10 = r4 * 2
            r11 = r12[r10]
            short r11 = (short) r11
            int r10 = r10 + r1
            r10 = r12[r10]
            short r10 = (short) r10
            int r11 = r11 + r10
            short r10 = (short) r11
            int r10 = r10 >> r1
            byte r10 = (byte) r10
            r9[r4] = r10
            int r4 = r4 + 2
            goto L55
        L69:
            return r9
        L6a:
            if (r10 == r2) goto L6d
        L6c:
            return r12
        L6d:
            int r9 = r3 * 2
            byte[] r9 = new byte[r9]
            if (r11 == r1) goto L92
            if (r11 == r2) goto L78
            if (r11 == r0) goto L92
            goto La0
        L78:
            if (r4 >= r3) goto La0
            r10 = r12[r4]
            int r11 = r4 + 1
            r11 = r12[r11]
            int r1 = r4 * 2
            r9[r1] = r10
            int r2 = r1 + 1
            r9[r2] = r11
            int r2 = r1 + 2
            r9[r2] = r10
            int r1 = r1 + r0
            r9[r1] = r11
            int r4 = r4 + 2
            goto L78
        L92:
            if (r4 >= r3) goto La0
            r10 = r12[r4]
            int r11 = r4 * 2
            r9[r11] = r10
            int r11 = r11 + r1
            r9[r11] = r10
            int r4 = r4 + 1
            goto L92
        La0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kl.d.b(int, int, int, byte[]):byte[]");
    }
}
