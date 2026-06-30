package com.tencent.mm.plugin.appbrand.video.player.thumb;

/* loaded from: classes8.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.video.player.thumb.o f90899d = new com.tencent.mm.plugin.appbrand.video.player.thumb.o();

    public o() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        boolean z17 = false;
        try {
            com.tencent.mm.plugin.appbrand.video.player.thumb.p pVar = com.tencent.mm.plugin.appbrand.video.player.thumb.p.f90900a;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pVar.d(context, true, false);
            z17 = true;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrand.ThumbPlayerInitLogic", th6, "initializer#isThumbPlayerAvailable, initIfNeed fail", new java.lang.Object[0]);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
