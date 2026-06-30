package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f160662a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile android.os.HandlerThread f160663b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f160664c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f160665d = new java.util.concurrent.ConcurrentSkipListSet();

    public static void a() {
        if (f160663b == null) {
            int i17 = pu5.i.f440006b;
            f160663b = pu5.f.a("app_brand_audio_player", 5);
            f160663b.start();
            lm5.i.c("app_brand_audio_player", new lm5.j(f160663b.getLooper(), "app_brand_audio_player"));
        }
        f160662a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(f160663b.getLooper());
    }
}
