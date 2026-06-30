package gu3;

/* loaded from: classes3.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2 f357473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2 c17005x4c2753d2) {
        super(1);
        this.f357473d = c17005x4c2753d2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String path = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2.f237301w;
        du3.t3 previewPlugin = this.f357473d.getPreviewPlugin();
        previewPlugin.getClass();
        if (com.p314xaae8f345.mm.vfs.w6.j(path)) {
            l45.q qVar = previewPlugin.f325259p;
            l45.n nVar = qVar instanceof l45.n ? (l45.n) qVar : null;
            if (nVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: presenter unavailable");
            } else {
                android.graphics.Bitmap bitmap = nVar.f397998f;
                if (bitmap == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: current bitmap is null");
                } else {
                    int width = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    android.graphics.BitmapFactory.Options n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(path);
                    if (n07 == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: cannot read image options");
                    } else {
                        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                        int i18 = n07.outWidth;
                        int i19 = n07.outHeight;
                        int i27 = 1;
                        while (true) {
                            int i28 = i27 * 2;
                            if (i18 / i28 < width || i19 / i28 < height) {
                                break;
                            }
                            i27 = i28;
                        }
                        options.inSampleSize = i27;
                        options.inPreferredConfig = android.graphics.Bitmap.Config.ARGB_8888;
                        android.graphics.Bitmap J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(path, options);
                        if (J2 == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: decode failed, path=".concat(path));
                        } else {
                            if (J2.getWidth() != width || J2.getHeight() != height) {
                                android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(J2, width, height, true);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createScaledBitmap, "createScaledBitmap(...)");
                                if (createScaledBitmap != J2) {
                                    J2.recycle();
                                }
                                J2 = createScaledBitmap;
                            }
                            if (J2.isRecycled()) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.DrawingPresenter", "replaceBaseImage: invalid bitmap");
                            } else {
                                nVar.f397998f = J2;
                                ym5.h hVar = nVar.f397993a;
                                if (hVar != null) {
                                    hVar.invalidate();
                                    bn5.f m177310x5143ab24 = nVar.f397993a.m177310x5143ab24();
                                    if (m177310x5143ab24 != null) {
                                        m177310x5143ab24.invalidate();
                                    }
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: done, path=" + path + ", raw=" + n07.outWidth + 'x' + n07.outHeight + ", final=" + J2.getWidth() + 'x' + J2.getHeight());
                        }
                    }
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImproveEditPhotoPreviewPlugin", "replaceBaseImage: file not found, path=".concat(path));
        }
        return jz5.f0.f384359a;
    }
}
