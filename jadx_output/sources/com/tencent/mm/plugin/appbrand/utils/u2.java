package com.tencent.mm.plugin.appbrand.utils;

/* loaded from: classes7.dex */
public final class u2 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f90574d;

    public u2(java.lang.String str, kotlinx.coroutines.q qVar) {
        this.f90574d = qVar;
    }

    @Override // l01.u
    public void b() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f90574d.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Load fail"))));
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return ik1.i0.a(this);
    }

    @Override // l01.u
    public void onBitmapLoaded(android.graphics.Bitmap bitmap) {
        kotlinx.coroutines.q qVar = this.f90574d;
        if (bitmap != null) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(bitmap));
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.IconAttacher", "onBitmapLoaded, bitmap is null");
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        qVar.resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(new java.io.IOException("Unexpected null bitmap"))));
    }
}
