package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public final class w {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f234678b;

    /* renamed from: d, reason: collision with root package name */
    public static long f234680d;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w f234677a = new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f234679c = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public static long f234681e = 367001600;

    /* renamed from: f, reason: collision with root package name */
    public static final long f234682f = java.util.concurrent.TimeUnit.MINUTES.toMillis(1);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f234683g = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.v.f234672d);

    public static final java.lang.String a(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar, long j17) {
        wVar.getClass();
        double d17 = 1024;
        java.lang.String format = java.lang.String.format("%.02f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((j17 / d17) / d17)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar, int i17, long j17, java.lang.String str) {
        wVar.getClass();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryLimitPublisher", "Check HPROF file failed, filePath is refer to private file.");
            return;
        }
        long k17 = com.p314xaae8f345.mm.vfs.w6.k(str);
        if (k17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryLimitPublisher", "Check HPROF file failed, file size is zero.");
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32808x6604d593, com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.C11223x3d8d64e.f32730x9efbee2a);
        bundle.putString(com.p314xaae8f345.mm.p987xb4b579b0.p989xe6d4914f.InterfaceC11224x4860a6b.f32760x1a7d3e8, "com.tencent.mm.openapi");
        bundle.putString("SendAppMessageWrapper_AppId", "wx4310bbd51be7d979");
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req req = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11269xebb48a7b.Req();
        req.f32866x7fa0d2de = null;
        com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504(new com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11280xa65cf99c(str));
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!a17.f294812f.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.lang.String str3 = a17.f294812f;
        int lastIndexOf = str3.lastIndexOf("/");
        if (lastIndexOf >= 0) {
            str3 = str3.substring(lastIndexOf + 1);
        }
        c11286x34a5504.f33130x6942258 = str3;
        c11286x34a5504.f33121x993583fc = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(k17);
        req.f33049x38eb0007 = c11286x34a5504;
        req.mo48427x792022dd(bundle);
        int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.B2;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93.class);
        int i19 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
        android.content.Intent intent2 = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.class);
        intent2.putExtras(bundle);
        intent2.putExtra("animation_pop_in", true);
        intent.putExtra("Select_Conv_NextStep", intent2);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.t(context, i17, j17, intent));
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.w wVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.s sVar, long j17, java.lang.String str2) {
        wVar.getClass();
        jx3.f.INSTANCE.d(18573, str, str2, java.lang.Integer.valueOf(sVar.f234658d), 32, java.lang.Long.valueOf(j17), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e);
    }

    public static final boolean d(long j17, long j18) {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!z65.c.a() && !ih.a.g(e42.d0.clicfg_memory_watchdog_trigger_dump_hprof_enable, false, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump and publish: NOT enabled.");
            return false;
        }
        if (!ih.d.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MemoryLimitPublisher", "skip hprof dump and publish: Matrix NOT installed");
            return false;
        }
        if (((com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x) ih.d.d().a(com.p314xaae8f345.p552xbf8d97c1.p580xebabc40e.x.class)) != null && cj.c.f123357d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump and publish: Matrix is analyzing resources.");
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - f234680d < f234682f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryLimitPublisher", "Skip hprof dump for frequency limit");
            return false;
        }
        if (j17 <= f234681e || !f234679c.compareAndSet(false, true)) {
            return false;
        }
        f234680d = currentTimeMillis;
        f234681e += 52428800;
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.u(j17));
        return true;
    }
}
