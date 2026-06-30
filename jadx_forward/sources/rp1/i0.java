package rp1;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 f479951d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27) {
        super(0);
        this.f479951d = c12922xc01b5b27;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m54139xe9b46061;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallBlurView", "onLoadImageFailed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1276x373aa5.C12922xc01b5b27 c12922xc01b5b27 = this.f479951d;
        c12922xc01b5b27.f175001o = true;
        android.widget.ImageView imageView = c12922xc01b5b27.f174995f;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBlurImageView");
            throw null;
        }
        imageView.setImageBitmap(null);
        android.widget.ImageView imageView2 = c12922xc01b5b27.f174996g;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopBlurMask");
            throw null;
        }
        imageView2.setAlpha(0.0f);
        if (c12922xc01b5b27.f175000n != null) {
            android.widget.ImageView imageView3 = c12922xc01b5b27.f174997h;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                throw null;
            }
            imageView3.setAlpha(1.0f);
            android.widget.ImageView imageView4 = c12922xc01b5b27.f174997h;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                throw null;
            }
            java.lang.Integer num = c12922xc01b5b27.f175000n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            imageView4.setBackgroundColor(num.intValue());
        } else {
            android.widget.ImageView imageView5 = c12922xc01b5b27.f174997h;
            if (imageView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                throw null;
            }
            imageView5.setAlpha(0.0f);
            android.widget.ImageView imageView6 = c12922xc01b5b27.f174997h;
            if (imageView6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomBlurMask");
                throw null;
            }
            m54139xe9b46061 = c12922xc01b5b27.m54139xe9b46061();
            imageView6.setBackgroundColor(m54139xe9b46061);
        }
        return jz5.f0.f384359a;
    }
}
