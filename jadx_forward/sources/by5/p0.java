package by5;

/* loaded from: classes13.dex */
public abstract class p0 {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (by5.a4.c() < (r6.a(r0) * 10000.0d)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        r8 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r14) {
        /*
            double r0 = by5.a0.a()
            java.lang.String r2 = "]"
            java.lang.String[] r14 = android.text.TextUtils.split(r14, r2)
            int r2 = r14.length
            r3 = 0
            r4 = r3
        Ld:
            if (r4 >= r2) goto La1
            r5 = r14[r4]
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L19
            goto L9d
        L19:
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = ";"
            boolean r7 = r5.startsWith(r6)
            r8 = 1
            if (r7 == 0) goto L2a
            java.lang.String r5 = r5.substring(r8)
        L2a:
            r7 = 91
            int r7 = r5.indexOf(r7)
            java.lang.String r9 = r5.substring(r3, r7)
            int r7 = r7 + r8
            java.lang.String r5 = r5.substring(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            boolean r10 = android.text.TextUtils.isEmpty(r5)
            if (r10 == 0) goto L45
            goto L69
        L45:
            java.lang.String[] r5 = r5.split(r6)
            if (r5 == 0) goto L69
            int r6 = r5.length
            if (r6 != 0) goto L4f
            goto L69
        L4f:
            int r6 = r5.length
            r10 = r3
        L51:
            if (r10 >= r6) goto L69
            r11 = r5[r10]
            boolean r12 = android.text.TextUtils.isEmpty(r11)
            if (r12 == 0) goto L5c
            goto L66
        L5c:
            by5.o0 r11 = by5.o0.b(r11)
            if (r11 != 0) goto L63
            goto L66
        L63:
            r7.add(r11)
        L66:
            int r10 = r10 + 1
            goto L51
        L69:
            java.util.Iterator r5 = r7.iterator()
        L6d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L99
            java.lang.Object r6 = r5.next()
            by5.o0 r6 = (by5.o0) r6
            double r10 = r6.f118109a
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 > 0) goto L6d
            double r10 = r6.f118110b
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 < 0) goto L6d
            int r5 = by5.a4.c()
            double r10 = (double) r5
            r12 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r5 = r6.a(r0)
            double r5 = r5 * r12
            int r5 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r5 >= 0) goto L99
            goto L9a
        L99:
            r8 = r3
        L9a:
            if (r8 == 0) goto L9d
            goto La3
        L9d:
            int r4 = r4 + 1
            goto Ld
        La1:
            java.lang.String r9 = ""
        La3:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: by5.p0.a(java.lang.String):java.lang.String");
    }
}
