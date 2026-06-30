package d04;

/* loaded from: classes13.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f306983d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f306984e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f306985f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4, android.graphics.Bitmap bitmap, boolean z17) {
        super(0);
        this.f306983d = c17327x39ee10a4;
        this.f306984e = bitmap;
        this.f306985f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f306983d;
        boolean A = c17327x39ee10a4.A();
        boolean A2 = c17327x39ee10a4.A();
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            c17327x39ee10a4.U1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.W(this.f306984e, 0.1f, 10, true, 200L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeProductMergeMaskView", "blurBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeProductMergeMaskView", e17, "blurBitmap exception", new java.lang.Object[0]);
        }
        android.graphics.Bitmap bitmap = c17327x39ee10a4.U1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.graphics.Bitmap bitmap2 = c17327x39ee10a4.U1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap2);
            bitmap2.getWidth();
            android.graphics.Bitmap bitmap3 = c17327x39ee10a4.U1;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap3);
            bitmap3.getHeight();
            if (A) {
                android.graphics.Bitmap bitmap4 = c17327x39ee10a4.U1;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap4);
                int width = bitmap4.getWidth();
                android.graphics.Bitmap bitmap5 = c17327x39ee10a4.U1;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = c17327x39ee10a4.getMeasuredWidth();
                int measuredHeight = c17327x39ee10a4.getMeasuredHeight();
                float f17 = width;
                float f18 = height;
                float f19 = (measuredWidth * 1.0f) / measuredHeight;
                android.graphics.Point point = (f17 * 1.0f) / f18 < f19 ? width < measuredWidth ? new android.graphics.Point(width, (int) (f17 / f19)) : new android.graphics.Point(measuredWidth, measuredHeight) : height < measuredHeight ? new android.graphics.Point((int) (f19 * f18), height) : new android.graphics.Point(measuredWidth, measuredHeight);
                android.graphics.Bitmap S = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(c17327x39ee10a4.U1, point.y, point.x, true, true);
                c17327x39ee10a4.U1 = S;
                if (S != null) {
                    S.getWidth();
                }
                android.graphics.Bitmap bitmap6 = c17327x39ee10a4.U1;
                if (bitmap6 != null) {
                    bitmap6.getHeight();
                }
            }
            d04.j0 j0Var = new d04.j0(c17327x39ee10a4, A2);
            if (this.f306985f) {
                c17327x39ee10a4.post(new d04.i0(j0Var));
            } else {
                j0Var.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
