package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes12.dex */
public class i4 implements kk.h {
    public i4(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4 r4Var) {
    }

    @Override // kk.h
    public void a(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        synchronized (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.r4.class) {
            if (bitmap != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageEngine", "recycle bitmap:%s", bitmap.toString());
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        }
    }
}
