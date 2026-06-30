package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752;

/* loaded from: classes3.dex */
public class b7 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.fb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b f282348a;

    public b7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b) {
        this.f282348a = viewOnClickListenerC21748xb3d38e6b;
    }

    public void a(long j17, java.lang.String str, android.view.View view, java.lang.String str2, android.graphics.Bitmap bitmap) {
        if (view == null || bitmap == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21748xb3d38e6b viewOnClickListenerC21748xb3d38e6b = this.f282348a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryUI", "onImageLoaded msgId: %d, currentMsgId: %d, imagePath: %s, bitmap: %s", valueOf, java.lang.Long.valueOf(viewOnClickListenerC21748xb3d38e6b.D), str2, java.lang.Integer.valueOf(bitmap.hashCode()));
        if (j17 == viewOnClickListenerC21748xb3d38e6b.D || (j17 == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && str2.equals(viewOnClickListenerC21748xb3d38e6b.x2()))) {
            viewOnClickListenerC21748xb3d38e6b.F = bitmap;
        }
    }
}
