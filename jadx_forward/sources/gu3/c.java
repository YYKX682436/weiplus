package gu3;

/* loaded from: classes10.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2 f357475d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2 c17005x4c2753d2) {
        this.f357475d = c17005x4c2753d2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2.f237301w;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1994xb9e77aab.p1995x36fffa5e.C17005x4c2753d2 c17005x4c2753d2 = this.f357475d;
        du3.t3 previewPlugin = c17005x4c2753d2.getPreviewPlugin();
        c17005x4c2753d2.getCropRectRatio();
        l45.q qVar = previewPlugin.f325259p;
        dl.t tVar = qVar != null ? (dl.t) ((l45.n) qVar).d(qk.g6.CROP_PHOTO) : null;
        if (tVar == null) {
            return;
        }
        if (!tVar.n()) {
            tVar.t();
        }
        android.graphics.Bitmap bitmap = ((l45.n) tVar.f316572a).f397998f;
        android.graphics.Rect rect = tVar.C;
        if (rect.isEmpty() || tVar.I == null || bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropArtist", "[performSilentCrop] not ready");
            return;
        }
        tVar.N();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width == 0 || height == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropArtist", "[performSilentCrop] img size invalid, w: %d | h: %d", java.lang.Integer.valueOf(width), java.lang.Integer.valueOf(height));
            return;
        }
        int width2 = tVar.f316663x.width();
        int height2 = tVar.f316663x.height();
        if (width2 == 0 || height2 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropArtist", "[performSilentCrop] box size invalid, w: %d | h: %d", java.lang.Integer.valueOf(width2), java.lang.Integer.valueOf(height2));
            return;
        }
        float f17 = width;
        float f18 = height;
        float f19 = width2;
        float f27 = f19 * 1.0f;
        float f28 = height2;
        float f29 = f27 / f28;
        float f37 = (f17 * 1.0f) / f18 < f29 ? (f28 * 1.0f) / f18 : f27 / f17;
        android.graphics.Rect rect2 = tVar.f316663x;
        tVar.h().reset();
        tVar.h().setScale(f37, f37);
        tVar.h().postTranslate(rect2.left + ((f19 - (f17 * f37)) / 2.0f), rect2.top + ((f28 - (f18 * f37)) / 2.0f));
        if (tVar.d() != null) {
            ((um.d) tVar.d()).f510207f.set(tVar.h());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropArtist", "[performSilentCrop] setResetMatrix after fit, matrix=" + tVar.h());
        }
        ((l45.n) tVar.f316572a).f397993a.m177310x5143ab24().k(new android.graphics.Rect(0, 0, width, height));
        float f38 = tVar.I.f316595c;
        if (f29 > f38) {
            float f39 = f28 * 1.0f * f38;
            float f47 = f39 / 2.0f;
            tVar.f316663x.set((int) (r1.centerX() - f47), tVar.f316663x.top, (int) (r5.centerX() + f47), tVar.f316663x.bottom);
        } else {
            float width3 = tVar.f316663x.width() / tVar.I.f316595c;
            android.graphics.Rect rect3 = tVar.f316663x;
            float f48 = width3 / 2.0f;
            rect3.set(rect3.left, (int) (rect3.centerY() - f48), tVar.f316663x.right, (int) (r7.centerY() + f48));
        }
        int width4 = tVar.f316663x.width();
        int height3 = tVar.f316663x.height();
        if (width4 == 0 || height3 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CropArtist", "[performSilentCrop] new box size invalid, w: %d | h: %d", java.lang.Integer.valueOf(width4), java.lang.Integer.valueOf(height3));
            return;
        }
        float min = java.lang.Math.min((rect.width() * 1.0f) / width4, (rect.height() * 1.0f) / height3);
        float centerX = rect.centerX() - tVar.f316663x.centerX();
        float centerY = rect.centerY() - tVar.f316663x.centerY();
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        android.graphics.Rect rect4 = new android.graphics.Rect(tVar.f316663x);
        matrix.postTranslate(centerX, centerY);
        android.graphics.RectF rectF = new android.graphics.RectF(rect4);
        matrix.mapRect(rectF);
        rectF.round(tVar.f316663x);
        matrix.postScale(min, min, tVar.f316663x.centerX(), tVar.f316663x.centerY());
        android.graphics.Matrix matrix2 = new android.graphics.Matrix(tVar.h());
        matrix2.postConcat(matrix);
        tVar.h().set(matrix2);
        rectF.set(rect4);
        matrix.mapRect(rectF);
        rectF.round(tVar.f316663x);
        tVar.O();
        tVar.K();
        if (tVar.d() != null) {
            ((um.d) tVar.d()).R2(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropArtist", "[performSilentCrop] completed");
    }
}
