package dm0;

/* loaded from: classes13.dex */
public class d extends dm0.a {
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    @Override // bm0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bm0.a c(fl0.b r8) {
        /*
            r7 = this;
            org.tensorflow.lite.d r0 = r7.f323158b
            pl0.e r8 = (pl0.e) r8
            java.lang.Object[] r8 = r8.i(r0)
            org.tensorflow.lite.d r0 = r7.f323158b
            java.lang.String r1 = "Kara.BinaryClassifyPredict"
            r2 = 0
            if (r0 != 0) goto L15
            java.lang.String r8 = "tflite null, not allowed"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8)
            return r2
        L15:
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L46
            if (r8 != 0) goto L1c
            goto L46
        L1c:
            int r0 = r0.c()
            int r5 = r8.length
            if (r0 == r5) goto L24
            goto L46
        L24:
            r0 = r4
        L25:
            org.tensorflow.lite.d r5 = r7.f323158b
            int r5 = r5.c()
            if (r0 >= r5) goto L44
            org.tensorflow.lite.d r5 = r7.f323158b
            org.tensorflow.lite.Tensor r5 = r5.b(r0)
            r6 = r8[r0]
            float[][] r6 = (float[][]) r6
            int r5 = r5.i()
            r6 = r6[r4]
            int r6 = r6.length
            if (r5 == r6) goto L41
            goto L46
        L41:
            int r0 = r0 + 1
            goto L25
        L44:
            r0 = r3
            goto L47
        L46:
            r0 = r4
        L47:
            r5 = 2
            if (r0 != 0) goto L69
            java.lang.Object[] r0 = new java.lang.Object[r5]
            if (r8 != 0) goto L50
            r8 = r4
            goto L51
        L50:
            int r8 = r8.length
        L51:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r4] = r8
            org.tensorflow.lite.d r8 = r7.f323158b
            int r8 = r8.c()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r0[r3] = r8
            java.lang.String r8 = "input size not match!!![%d %d]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r8, r0)
            return r2
        L69:
            org.tensorflow.lite.d r0 = r7.f323158b
            if (r0 != 0) goto L6f
            r0 = r4
            goto L77
        L6f:
            org.tensorflow.lite.Tensor r0 = r0.f(r4)
            int r0 = r0.i()
        L77:
            if (r0 == r3) goto L88
            if (r0 == r5) goto L7d
            r0 = r2
            goto L92
        L7d:
            r5 = 33
            em0.e.a(r5)
            dm0.c r0 = new dm0.c
            r0.<init>(r7)
            goto L92
        L88:
            r5 = 30
            em0.e.a(r5)
            dm0.b r0 = new dm0.b
            r0.<init>(r7)
        L92:
            if (r0 != 0) goto Lac
            org.tensorflow.lite.d r8 = r7.f323158b
            org.tensorflow.lite.Tensor r8 = r8.f(r4)
            int r8 = r8.i()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "pridict output not match! %d"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r1, r0, r8)
            return r2
        Lac:
            r1 = 29
            em0.e.a(r1)
            org.tensorflow.lite.d r1 = r7.f323158b
            bm0.a r8 = r0.a(r1, r8)
            float r0 = r8.a(r3)
            double r0 = (double) r0
            r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lc8
            r0 = 22
            em0.e.a(r0)
            goto Lcd
        Lc8:
            r0 = 23
            em0.e.a(r0)
        Lcd:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: dm0.d.c(fl0.b):bm0.a");
    }
}
