package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.tencent.mm.sdk.platformtools.n3 f79129a;

    /* renamed from: b, reason: collision with root package name */
    public static volatile android.os.HandlerThread f79130b;

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f79131c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f79132d = new java.util.concurrent.ConcurrentSkipListSet();

    public static void a() {
        if (f79130b == null) {
            int i17 = pu5.i.f358473b;
            f79130b = pu5.f.a("app_brand_audio_player", 5);
            f79130b.start();
            lm5.i.c("app_brand_audio_player", new lm5.j(f79130b.getLooper(), "app_brand_audio_player"));
        }
        f79129a = new com.tencent.mm.sdk.platformtools.n3(f79130b.getLooper());
    }
}
