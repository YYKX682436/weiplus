package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class d6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f184660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(android.widget.ImageView imageView) {
        super(0);
        this.f184660d = imageView;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap X;
        android.graphics.Bitmap bitmap;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        android.graphics.Bitmap mo560xd586ddb5 = com.p314xaae8f345.mm.p2470x93e71c27.ui.u.c().mo560xd586ddb5(c01.z1.r());
        int i17 = hc2.f1.f361848a;
        if (mo560xd586ddb5 == null) {
            bitmap = null;
        } else {
            android.graphics.Bitmap S = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.S(mo560xd586ddb5, mo560xd586ddb5.getHeight() / 5, mo560xd586ddb5.getWidth() / 5, true, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(S, "extractThumbNail(...)");
            new android.graphics.Canvas(S).drawColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77908xe61cad8f));
            int i18 = (int) 100.0f;
            try {
                X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(S, i18);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderExt", "setBlurBitmap error:" + th6.getMessage());
                X = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.X(S, i18);
            }
            S.recycle();
            bitmap = X;
        }
        if (bitmap != null) {
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.c6(this.f184660d, bitmap));
        }
        return jz5.f0.f384359a;
    }
}
