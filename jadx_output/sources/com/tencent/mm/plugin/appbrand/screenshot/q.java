package com.tencent.mm.plugin.appbrand.screenshot;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f88542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kotlinx.coroutines.q qVar) {
        super(1);
        this.f88542d = qVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandScreenshotComponentHelper", "generateDefaultPosterPath: sun code request cancelled");
        ((kotlinx.coroutines.r) this.f88542d).resumeWith(kotlin.Result.m521constructorimpl(null));
        return jz5.f0.f302826a;
    }
}
