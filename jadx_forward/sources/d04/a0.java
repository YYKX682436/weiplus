package d04;

/* loaded from: classes13.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb f306905d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb) {
        this.f306905d = c17326x8613bffb;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17326x8613bffb c17326x8613bffb = this.f306905d;
        c17326x8613bffb.m68776x977fde54(c17326x8613bffb.m68763xb5f85d42().getHeight() - i65.a.b(c17326x8613bffb.getContext(), 64));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeMaskView", "productListBottomMarginDelta:" + c17326x8613bffb.getProductListBottomMarginDelta());
        android.widget.ImageView imageView = c17326x8613bffb.H;
        android.view.ViewGroup.LayoutParams layoutParams = null;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = c17326x8613bffb.getMBottomExtraHeight();
            }
            layoutParams = layoutParams2;
        }
        imageView.setLayoutParams(layoutParams);
    }
}
