package com.tencent.mm.minigame;

@j95.b
/* loaded from: classes7.dex */
public final class x0 extends i95.w implements ft.m4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.minigame.w0 f69158d = new com.tencent.mm.minigame.w0();

    public void wi(java.lang.String source) {
        kotlin.jvm.internal.o.g(source, "source");
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.WVAGameService", "preloadIsolatedProcess source=".concat(source));
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(context, "com.tencent.mm.IsolatedService"));
            com.tencent.mars.xlog.Log.i("MicroMsg.WVAGameService", "preloadIsolatedProcess bindService result=" + context.bindService(intent, f69158d, 1));
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WVAGameService", th6, "preloadIsolatedProcess error", new java.lang.Object[0]);
        }
    }
}
