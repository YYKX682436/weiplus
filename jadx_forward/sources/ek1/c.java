package ek1;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ek1.c f334939a = new ek1.c();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f334940b = jz5.h.b(ek1.b.f334938d);

    public final void a() {
        if (ek1.a.c() && ek1.a.b()) {
            jz5.g gVar = f334940b;
            long j17 = ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).getLong("KEY_LAST_CHECK_TIMESTAMP", 0L);
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (java.lang.System.currentTimeMillis() - j17 <= java.util.concurrent.TimeUnit.MINUTES.toMillis(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ui(e42.d0.clicfg_android_appbrand_recommend_plugin_pkg_prefetch_interval, 60L))) {
                return;
            }
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) gVar).mo141623x754a37bb()).putLong("KEY_LAST_CHECK_TIMESTAMP", java.lang.System.currentTimeMillis());
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).h8("gh_b489f391e008@app", 0);
        }
    }
}
