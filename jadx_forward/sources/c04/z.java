package c04;

/* loaded from: classes13.dex */
public final class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f119234e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a, android.graphics.Bitmap bitmap) {
        this.f119233d = c17324xa321818a;
        this.f119234e = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bz3.l lVar = bz3.l.f118335d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119233d;
        c17324xa321818a.S = true;
        c17324xa321818a.T = true;
        c17324xa321818a.x();
        android.graphics.Bitmap bitmap = this.f119234e;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "updatePreview bitmap width: %d, height: %d, showPreviewImage: %b, animateShowPreviewImage: %b", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()), java.lang.Boolean.valueOf(c17324xa321818a.S), java.lang.Boolean.valueOf(c17324xa321818a.T));
            c17324xa321818a.V = bitmap;
            android.widget.ImageView imageView = c17324xa321818a.B;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            if (c17324xa321818a.S) {
                android.widget.ImageView imageView2 = c17324xa321818a.B;
                if (imageView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                imageView2.setVisibility(0);
                if (c17324xa321818a.T) {
                    android.widget.ImageView imageView3 = c17324xa321818a.B;
                    if (imageView3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView3.setAlpha(0.0f);
                } else {
                    android.widget.ImageView imageView4 = c17324xa321818a.B;
                    if (imageView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                        throw null;
                    }
                    imageView4.setAlpha(1.0f);
                }
            } else {
                android.widget.ImageView imageView5 = c17324xa321818a.B;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
                    throw null;
                }
                imageView5.setVisibility(8);
            }
        }
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "setPreviewBitmap width: %d, height: %d", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        new c04.m(c17324xa321818a, bitmap, false).mo152xb9724478();
    }
}
