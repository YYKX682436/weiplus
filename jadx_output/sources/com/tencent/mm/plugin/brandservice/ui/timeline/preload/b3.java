package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

/* loaded from: classes7.dex */
public final class b3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3 f94192a = new com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashMap f94193b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f94194c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f94195d = new java.util.HashMap();

    public static void b(com.tencent.mm.plugin.brandservice.ui.timeline.preload.b3 b3Var, long j17, boolean z17, long j18, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            j18 = 0;
        }
        b3Var.getClass();
        ((ku5.t0) ku5.t0.f312615d).l(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.v2(j17, z17), j18, "MicroMsg.WebPrefetcherCallbackManager");
    }

    public final void a(long j17, java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.brandservice.ui.timeline.preload.u2(j17, i17, url), "MicroMsg.WebPrefetcherCallbackManager");
    }
}
