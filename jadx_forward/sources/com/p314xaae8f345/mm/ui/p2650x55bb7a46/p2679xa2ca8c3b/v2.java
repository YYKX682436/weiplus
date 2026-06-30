package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f287358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w2 f287359e;

    public v2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.w2 w2Var, android.graphics.Bitmap bitmap) {
        this.f287359e = w2Var;
        this.f287358d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.graphics.Bitmap bitmap = this.f287358d;
        if (bitmap.isRecycled()) {
            return;
        }
        this.f287359e.f287430a.U.setImageBitmap(bitmap);
    }
}
