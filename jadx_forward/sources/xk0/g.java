package xk0;

/* loaded from: classes8.dex */
public final class g implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public final int f536502d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f536503e;

    /* renamed from: f, reason: collision with root package name */
    public float f536504f;

    public g(int i17) {
        this.f536502d = i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x003e, code lost:
    
        if ((r11 == r8.f536504f) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.graphics.Canvas r9, android.graphics.Bitmap r10, float r11) {
        /*
            r8 = this;
            java.lang.String r0 = "canvas"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            java.lang.String r0 = "preBitmap"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "draw cacheColorWeight "
            r0.<init>(r1)
            float r1 = r8.f536504f
            r0.append(r1)
            java.lang.String r1 = ", colorWeight:"
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", cacheFilteredBitmap:"
            r0.append(r1)
            android.graphics.Bitmap r1 = r8.f536503e
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.FilterItem"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            android.graphics.Bitmap r0 = r8.f536503e
            if (r0 == 0) goto L40
            float r0 = r8.f536504f
            int r0 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r0 != 0) goto L3d
            r0 = 1
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 != 0) goto L57
        L40:
            r8.f536504f = r11
            oj0.c r2 = oj0.c.f427259a
            int r4 = r8.f536502d
            int r5 = r10.getWidth()
            int r6 = r10.getHeight()
            float r7 = r8.f536504f
            r3 = r10
            android.graphics.Bitmap r10 = r2.b(r3, r4, r5, r6, r7)
            r8.f536503e = r10
        L57:
            android.graphics.Bitmap r10 = r8.f536503e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r10)
            r11 = 0
            r0 = 0
            r9.drawBitmap(r10, r0, r0, r11)
            java.lang.String r9 = "lxl item draw"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xk0.g.a(android.graphics.Canvas, android.graphics.Bitmap, float):void");
    }

    /* renamed from: clone */
    public java.lang.Object m175637x5a5dd5d() {
        return super.clone();
    }
}
