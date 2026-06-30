package xf2;

/* loaded from: classes5.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.C14205xa8ca416b f535802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f535803e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f535804f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f535805g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f535806h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.C14205xa8ca416b c14205xa8ca416b, android.graphics.Bitmap bitmap, boolean z17, float f17, float f18) {
        super(0);
        this.f535802d = c14205xa8ca416b;
        this.f535803e = bitmap;
        this.f535804f = z17;
        this.f535805g = f17;
        this.f535806h = f18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1491x36113a39.p1492x373aa5.C14205xa8ca416b c14205xa8ca416b = this.f535802d;
        c14205xa8ca416b.f193139m.setVisibility(0);
        android.widget.ImageView imageView = c14205xa8ca416b.f193139m;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams != null) {
            android.content.Context context = c14205xa8ca416b.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(context, this.f535804f ? 40 : 32);
            float f17 = this.f535805g;
            layoutParams.height = (int) (a17 * f17);
            layoutParams.width = (int) (imageView.getHeight() * this.f535806h);
            if (layoutParams instanceof android.widget.RelativeLayout.LayoutParams) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c14205xa8ca416b.getContext(), "getContext(...)");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c14205xa8ca416b.getContext(), "getContext(...)");
                ((android.widget.RelativeLayout.LayoutParams) layoutParams).setMargins((int) (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(r7, 16) * f17), 0, 0, (int) (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.u5.a(r0, 16) * f17));
            }
            imageView.setLayoutParams(layoutParams);
        }
        imageView.setImageBitmap(this.f535803e);
        return jz5.f0.f384359a;
    }
}
