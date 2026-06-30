package c04;

/* loaded from: classes13.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f119229d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119230e;

    public x(android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        this.f119229d = bitmap;
        this.f119230e = c17324xa321818a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119230e;
        android.widget.ImageView imageView = c17324xa321818a.F;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customMaskView");
            throw null;
        }
        int i17 = c17324xa321818a.N;
        int i18 = c17324xa321818a.P;
        android.graphics.Bitmap bitmap = this.f119229d;
        if (bitmap == null || bitmap.isRecycled()) {
            imageView.setImageBitmap(null);
            z17 = false;
        } else {
            imageView.setImageBitmap(bitmap);
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            imageView.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
            android.graphics.Matrix imageMatrix = imageView.getImageMatrix();
            float width = (i17 * 1.0f) / bitmap.getWidth();
            bitmap.getWidth();
            bitmap.getHeight();
            imageMatrix.postScale(width, width);
            imageMatrix.postTranslate(0.0f, i18 - (bitmap.getHeight() * width));
            matrix.set(imageMatrix);
            imageView.setImageMatrix(matrix);
            z17 = true;
        }
        if (!z17) {
            c17324xa321818a.w();
            return;
        }
        android.widget.ImageView imageView2 = c17324xa321818a.F;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customMaskView");
            throw null;
        }
        imageView2.setVisibility(0);
        if (c17324xa321818a.getRequest() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17264x215089a1 request = c17324xa321818a.getRequest();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(request, "null cannot be cast to non-null type com.tencent.mm.plugin.scanner.api.ScanGoodsRequest");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196 = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196) request;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "onSetCustomBackgroundSuccess");
            km5.d g17 = ((km5.q) km5.u.d()).i(new c04.s(c17265xca2bb196)).g(true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "serial(...)");
            km5.q qVar = (km5.q) pm0.v.T(pm0.v.T(g17, new c04.t(c17324xa321818a)), new c04.u(c17265xca2bb196, c17324xa321818a));
            qVar.s(new c04.v(c17324xa321818a));
            qVar.a(new c04.w(c17324xa321818a));
        }
    }
}
