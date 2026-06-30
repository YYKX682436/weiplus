package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f100795d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.u0 f100796e;

    public t0(com.tencent.mm.plugin.fav.ui.detail.u0 u0Var, android.graphics.Bitmap bitmap) {
        this.f100796e = u0Var;
        this.f100795d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.u0 u0Var = this.f100796e;
        com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI favoriteImgDetailUI = u0Var.f100802f;
        com.tencent.mm.plugin.fav.ui.detail.a1 a1Var = u0Var.f100800d;
        android.graphics.Bitmap bitmap = this.f100795d;
        java.lang.String str = u0Var.f100801e;
        if (bitmap == null) {
            int i17 = com.tencent.mm.plugin.fav.ui.detail.FavoriteImgDetailUI.f100624w;
            favoriteImgDetailUI.getClass();
            bitmap = favoriteImgDetailUI.a7(a1Var.f100683a);
        }
        boolean z17 = true;
        if (bitmap != favoriteImgDetailUI.f100629q) {
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.fav.ui.detail.k0(favoriteImgDetailUI));
        } else if (str.equals("onCdnStatusChanged")) {
            k82.c.f304887a.e(favoriteImgDetailUI.f100627o.field_localId, 1);
        }
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
            a1Var.f100693k = bitmap.getWidth();
            a1Var.f100694l = bitmap.getHeight();
        }
        try {
            android.view.ViewGroup.LayoutParams layoutParams = a1Var.f100684b.getLayoutParams();
            layoutParams.width = -1;
            int width = bitmap.getWidth();
            int i18 = favoriteImgDetailUI.f100626n;
            if (width > i18 / 3) {
                int width2 = (int) ((i18 / bitmap.getWidth()) * bitmap.getHeight());
                layoutParams.height = width2;
                boolean z18 = com.tencent.mm.sdk.platformtools.l1.f192817a;
                com.tencent.mm.sdk.platformtools.v1 v1Var = com.tencent.mm.sdk.platformtools.u1.f193003a;
                if (width2 > v1Var.f193033a) {
                    int width3 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i19 = v1Var.f193033a;
                    if (width3 >= i19 || height >= i19) {
                        z17 = false;
                    }
                    if (z17) {
                        a1Var.f100684b.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                    } else {
                        layoutParams.height = i19 >> 2;
                        a1Var.f100684b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    }
                } else {
                    a1Var.f100684b.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                }
            } else {
                int height2 = bitmap.getHeight();
                boolean z19 = com.tencent.mm.sdk.platformtools.l1.f192817a;
                int i27 = com.tencent.mm.sdk.platformtools.u1.f193003a.f193033a;
                if (height2 > i27) {
                    layoutParams.height = i27 >> 2;
                    a1Var.f100684b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                } else {
                    if (a1Var.f100684b.getMinimumWidth() > bitmap.getWidth()) {
                        layoutParams.width = a1Var.f100684b.getMinimumWidth();
                    }
                    a1Var.f100684b.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                }
            }
            java.lang.String x17 = o72.x1.x(a1Var.f100683a);
            if (!com.tencent.mm.sdk.platformtools.y1.c(x17)) {
                a1Var.f100684b.setImageBitmap(bitmap);
                return;
            }
            try {
                ((com.tencent.mm.feature.emoji.e) ((com.tencent.mm.feature.emoji.api.j5) i95.n0.c(com.tencent.mm.feature.emoji.api.j5.class))).getClass();
                com.tencent.mm.plugin.gif.b a17 = com.tencent.mm.plugin.gif.d.c().a(x17 + "_detail", x17);
                a1Var.f100684b.setImageDrawable(a17);
                a17.stop();
                a17.start();
            } catch (java.lang.Exception unused) {
                a1Var.f100684b.setImageBitmap(bitmap);
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    public java.lang.String toString() {
        return super.toString() + "|renderView";
    }
}
