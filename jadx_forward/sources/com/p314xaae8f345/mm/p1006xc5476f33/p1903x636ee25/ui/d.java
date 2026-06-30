package com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui;

/* loaded from: classes4.dex */
public final class d implements l01.r {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.d f232265d = new com.p314xaae8f345.mm.p1006xc5476f33.p1903x636ee25.ui.d();

    @Override // l01.r
    public android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap k07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
            try {
                if (bitmap.getWidth() == bitmap.getHeight()) {
                    k07 = bitmap;
                } else {
                    int min = java.lang.Math.min(bitmap.getWidth(), bitmap.getHeight());
                    if (min <= 0) {
                        min = java.lang.Math.max(bitmap.getWidth(), bitmap.getHeight());
                    }
                    k07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.k0(bitmap, min, min, true);
                }
                if (k07 != null) {
                    return k07;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FloatBallMusicView", e17, "getRoundBitmap exception", new java.lang.Object[0]);
            }
        }
        return bitmap;
    }

    @Override // l01.i0
    public java.lang.String key() {
        return "FloatBallMusicCoverNew";
    }
}
