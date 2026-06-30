package d04;

/* loaded from: classes13.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f306993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        super(0);
        this.f306993d = c17326x8613bffb;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f306993d;
        android.graphics.Bitmap bitmap = c17326x8613bffb.C1;
        if (bitmap != null && !bitmap.isRecycled()) {
            android.widget.ImageView imageView = c17326x8613bffb.I;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView.setImageBitmap(c17326x8613bffb.C1);
            android.widget.ImageView imageView2 = c17326x8613bffb.I;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView2.setAlpha(1.0f);
            android.widget.ImageView imageView3 = c17326x8613bffb.I;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView3.setVisibility(0);
            android.widget.ImageView imageView4 = c17326x8613bffb.I;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
                throw null;
            }
            imageView4.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        return jz5.f0.f384359a;
    }
}
