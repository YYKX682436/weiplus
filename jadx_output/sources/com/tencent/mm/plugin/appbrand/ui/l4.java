package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class l4 implements com.tencent.mm.plugin.appbrand.game.preload.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f89844a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.w4 f89845b;

    public l4(com.tencent.mm.plugin.appbrand.ui.w4 w4Var, long j17) {
        this.f89845b = w4Var;
        this.f89844a = j17;
    }

    public void a(android.graphics.Bitmap bitmap, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandGameUILoadingSplash", "onLoadingImageLoaded");
        com.tencent.mm.plugin.appbrand.ui.w4 w4Var = this.f89845b;
        w4Var.Q = true;
        if (w4Var.W != null) {
            ik1.h0.b(new com.tencent.mm.plugin.appbrand.ui.k4(this, bitmap, j17));
        }
    }
}
