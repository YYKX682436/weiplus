package rp1;

/* loaded from: classes14.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 f479934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f479935e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27, android.graphics.Bitmap bitmap) {
        super(0);
        this.f479934d = c12922xc01b5b27;
        this.f479935e = bitmap;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27.f174992p;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27 = this.f479934d;
        c12922xc01b5b27.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBlurDone bitmap: ");
        android.graphics.Bitmap bitmap = this.f479935e;
        sb6.append(bitmap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallBlurView", sb6.toString());
        if (bitmap == null) {
            android.widget.ImageView imageView = c12922xc01b5b27.f174995f;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBlurImageView");
                throw null;
            }
            imageView.setImageBitmap(null);
        } else if (bitmap.isRecycled()) {
            android.widget.ImageView imageView2 = c12922xc01b5b27.f174995f;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBlurImageView");
                throw null;
            }
            imageView2.setImageBitmap(null);
        } else {
            android.widget.ImageView imageView3 = c12922xc01b5b27.f174995f;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBlurImageView");
                throw null;
            }
            imageView3.setImageBitmap(bitmap);
            c12922xc01b5b27.f175001o = false;
            android.widget.ImageView imageView4 = c12922xc01b5b27.f174995f;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBlurImageView");
                throw null;
            }
            if (c12922xc01b5b27.f174999m && imageView4.getVisibility() != 0) {
                android.widget.ImageView imageView5 = c12922xc01b5b27.f174995f;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBlurImageView");
                    throw null;
                }
                imageView5.setVisibility(0);
                android.widget.ImageView imageView6 = c12922xc01b5b27.f174997h;
                if (imageView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                    throw null;
                }
                imageView6.setVisibility(0);
                android.widget.ImageView imageView7 = c12922xc01b5b27.f174997h;
                if (imageView7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                    throw null;
                }
                imageView7.setAlpha(1.0f);
                c12922xc01b5b27.f();
            }
        }
        return jz5.f0.f384359a;
    }
}
