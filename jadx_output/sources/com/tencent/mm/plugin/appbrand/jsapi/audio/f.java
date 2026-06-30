package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f79184a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (f79184a.compareAndSet(false, true)) {
            com.tencent.mm.plugin.appbrand.jsapi.audio.m3 m3Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.m3();
            m3Var.p(lVar);
            m3Var.m();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioInterruptionEventDispatcher", "dispatchInterruptionBegin");
        }
    }

    public static void b(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        if (f79184a.compareAndSet(true, false)) {
            com.tencent.mm.plugin.appbrand.jsapi.audio.n3 n3Var = new com.tencent.mm.plugin.appbrand.jsapi.audio.n3();
            n3Var.p(lVar);
            n3Var.m();
            com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioInterruptionEventDispatcher", "dispatchInterruptionEnd");
        }
    }
}
