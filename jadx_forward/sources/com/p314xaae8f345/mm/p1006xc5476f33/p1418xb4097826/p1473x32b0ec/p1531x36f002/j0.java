package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0 f197098a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0();

    public static android.graphics.Bitmap c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0 j0Var, java.lang.String url, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h0 style, float f17, float f18, int i18, int i19, int i27, java.lang.Object obj) {
        int i28;
        int i29;
        int i37 = (i27 & 64) != 0 ? 0 : i19;
        j0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        try {
            int[] iArr = {0, 0};
            ((jd0.w1) ((kd0.k2) i95.n0.c(kd0.k2.class))).getClass();
            boolean z17 = et5.h.f338209a;
            java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54059x396cc171);
            int e17 = et5.h.e(allocateDirect, iArr, url, 12, i17, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c, -1);
            byte[] f19 = et5.h.f(allocateDirect);
            if (f19 == null || e17 != 0) {
                f19 = null;
            }
            if (!(f19 != null) || (i28 = iArr[0]) <= 0 || (i29 = iArr[1]) <= 0) {
                return null;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f19);
            return j0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i0(i28, i29, f19), style, f17, f18, i18, i37);
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveQrCodeGenerator", "generate failed with exception: " + e18);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00dc, code lost:
    
        if (r13 != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i0 r28, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h0 r29, float r30, float r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.j0.a(com.tencent.mm.plugin.finder.live.util.i0, com.tencent.mm.plugin.finder.live.util.h0, float, float, int, int):android.graphics.Bitmap");
    }

    public final void b(float f17, float f18, float f19, android.graphics.Canvas canvas, int i17) {
        float f27 = 3.5f * f19;
        float f28 = 2.5f * f19;
        float f29 = f17 + f27;
        float f37 = f18 + f27;
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(f27 - f28);
        paint.setColor(i17);
        paint.setAntiAlias(true);
        canvas.drawCircle(f29, f37, (f28 + f27) / 2, paint);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setColor(i17);
        canvas.drawCircle(f29, f37, f19 * 1.5f, paint2);
    }
}
