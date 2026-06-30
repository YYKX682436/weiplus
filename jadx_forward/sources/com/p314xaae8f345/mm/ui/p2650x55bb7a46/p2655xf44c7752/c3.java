package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class c3 implements kk.h {
    public c3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.k3 k3Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryLazyLoader", "recycle bitmap:%s", bitmap.toString());
        bitmap.recycle();
    }
}
