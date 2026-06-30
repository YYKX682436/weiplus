package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f285605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i2 f285606e;

    public h2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.i2 i2Var, android.graphics.Bitmap bitmap) {
        this.f285606e = i2Var;
        this.f285605d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f285605d;
        if (bitmap.isRecycled()) {
            return;
        }
        this.f285606e.f285690a.U.setImageBitmap(bitmap);
    }
}
