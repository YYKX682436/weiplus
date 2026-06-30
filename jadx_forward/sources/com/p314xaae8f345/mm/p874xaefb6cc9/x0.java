package com.p314xaae8f345.mm.p874xaefb6cc9;

@j95.b
/* loaded from: classes7.dex */
public final class x0 extends i95.w implements ft.m4 {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p874xaefb6cc9.w0 f150691d = new com.p314xaae8f345.mm.p874xaefb6cc9.w0();

    public void wi(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAGameService", "preloadIsolatedProcess source=".concat(source));
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(new android.content.ComponentName(context, "com.tencent.mm.IsolatedService"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WVAGameService", "preloadIsolatedProcess bindService result=" + context.bindService(intent, f150691d, 1));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WVAGameService", th6, "preloadIsolatedProcess error", new java.lang.Object[0]);
        }
    }
}
