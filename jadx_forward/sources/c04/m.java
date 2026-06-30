package c04;

/* loaded from: classes13.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f119215e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f119216f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a, android.graphics.Bitmap bitmap, boolean z17) {
        super(0);
        this.f119214d = c17324xa321818a;
        this.f119215e = bitmap;
        this.f119216f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a.A1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119214d;
        boolean z17 = c17324xa321818a.getMScanSource() == 2;
        boolean z18 = c17324xa321818a.getMScanSource() == 2;
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c17324xa321818a.U = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.W(this.f119215e, 0.1f, 10, true, 200L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanGoodsMaskView", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = c17324xa321818a.U;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap bitmap2 = c17324xa321818a.U;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
            bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = c17324xa321818a.U;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap3);
            bitmap3.getHeight();
            if (z17) {
                android.graphics.Bitmap bitmap4 = c17324xa321818a.U;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap4);
                int width = bitmap4.getWidth();
                android.graphics.Bitmap bitmap5 = c17324xa321818a.U;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = c17324xa321818a.getMeasuredWidth();
                int measuredHeight = c17324xa321818a.getMeasuredHeight();
                float f17 = width;
                float f18 = height;
                float f19 = (measuredWidth * 1.0f) / measuredHeight;
                android.graphics.Point point = (f17 * 1.0f) / f18 < f19 ? width < measuredWidth ? new android.graphics.Point(width, (int) (f17 / f19)) : new android.graphics.Point(measuredWidth, measuredHeight) : height < measuredHeight ? new android.graphics.Point((int) (f19 * f18), height) : new android.graphics.Point(measuredWidth, measuredHeight);
                android.graphics.Bitmap S = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(c17324xa321818a.U, point.y, point.x, true, true);
                c17324xa321818a.U = S;
                if (S != null) {
                    S.getWidth();
                }
                android.graphics.Bitmap bitmap6 = c17324xa321818a.U;
                if (bitmap6 != null) {
                    bitmap6.getHeight();
                }
            }
            c04.l lVar = new c04.l(c17324xa321818a, z18);
            if (this.f119216f) {
                c17324xa321818a.post(new c04.k(lVar));
            } else {
                lVar.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
