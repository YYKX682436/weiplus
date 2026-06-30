package c04;

/* loaded from: classes13.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a, boolean z17) {
        super(0);
        this.f119212d = c17324xa321818a;
        this.f119213e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119212d;
        android.graphics.Bitmap bitmap = c17324xa321818a.U;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.widget.ImageView imageView = c17324xa321818a.C;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView.setImageBitmap(c17324xa321818a.U);
            android.widget.ImageView imageView2 = c17324xa321818a.C;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            if (this.f119213e) {
                android.widget.ImageView imageView3 = c17324xa321818a.A;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView3.setImageBitmap(c17324xa321818a.U);
                android.widget.ImageView imageView4 = c17324xa321818a.A;
                if (imageView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView4.setVisibility(0);
                android.widget.ImageView imageView5 = c17324xa321818a.A;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView5.setAlpha(1.0f);
                android.widget.ImageView imageView6 = c17324xa321818a.A;
                if (imageView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView6.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            c17324xa321818a.R = true;
        }
        return jz5.f0.f384359a;
    }
}
