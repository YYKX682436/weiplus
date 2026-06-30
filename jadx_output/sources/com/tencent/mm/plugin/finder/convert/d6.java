package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes3.dex */
public final class d6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f103127d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(android.widget.ImageView imageView) {
        super(0);
        this.f103127d = imageView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap X;
        android.graphics.Bitmap bitmap;
        ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).getClass();
        android.graphics.Bitmap loadBitmap = com.tencent.mm.pluginsdk.ui.u.c().loadBitmap(c01.z1.r());
        int i17 = hc2.f1.f280315a;
        if (loadBitmap == null) {
            bitmap = null;
        } else {
            android.graphics.Bitmap S = com.tencent.mm.sdk.platformtools.x.S(loadBitmap, loadBitmap.getHeight() / 5, loadBitmap.getWidth() / 5, true, false);
            kotlin.jvm.internal.o.f(S, "extractThumbNail(...)");
            new android.graphics.Canvas(S).drawColor(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getColor(com.tencent.mm.R.color.UN_BW_0_Alpha_0_2));
            int i18 = (int) 100.0f;
            try {
                X = com.tencent.mm.sdk.platformtools.x.X(S, i18);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("FinderExt", "setBlurBitmap error:" + th6.getMessage());
                X = com.tencent.mm.sdk.platformtools.x.X(S, i18);
            }
            S.recycle();
            bitmap = X;
        }
        if (bitmap != null) {
            pm0.v.X(new com.tencent.mm.plugin.finder.convert.c6(this.f103127d, bitmap));
        }
        return jz5.f0.f302826a;
    }
}
