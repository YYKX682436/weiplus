package d04;

/* loaded from: classes14.dex */
public final class f3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 f306948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33) {
        super(1);
        this.f306948d = c17337xb9c9eb33;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f306948d;
            c17337xb9c9eb33.f241331r = bitmap;
            android.widget.ImageView imageView = c17337xb9c9eb33.f241326m;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurMaskView");
                throw null;
            }
            imageView.setImageBitmap(bitmap);
            android.widget.ImageView imageView2 = c17337xb9c9eb33.f241326m;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurMaskView");
                throw null;
            }
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return jz5.f0.f384359a;
    }
}
