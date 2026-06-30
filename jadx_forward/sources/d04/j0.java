package d04;

/* loaded from: classes13.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f306976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306977e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4, boolean z17) {
        super(0);
        this.f306976d = c17327x39ee10a4;
        this.f306977e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f306976d;
        android.graphics.Bitmap bitmap = c17327x39ee10a4.U1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.widget.ImageView imageView = c17327x39ee10a4.L1;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView.setImageBitmap(c17327x39ee10a4.U1);
            android.widget.ImageView imageView2 = c17327x39ee10a4.L1;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            if (this.f306977e) {
                android.widget.ImageView imageView3 = c17327x39ee10a4.J1;
                if (imageView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView3.setImageBitmap(c17327x39ee10a4.U1);
                android.widget.ImageView imageView4 = c17327x39ee10a4.J1;
                if (imageView4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView4.setVisibility(0);
                android.widget.ImageView imageView5 = c17327x39ee10a4.J1;
                if (imageView5 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView5.setAlpha(1.0f);
                android.widget.ImageView imageView6 = c17327x39ee10a4.J1;
                if (imageView6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
                    throw null;
                }
                imageView6.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            }
            c17327x39ee10a4.R1 = true;
        }
        return jz5.f0.f384359a;
    }
}
