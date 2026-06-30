package com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5;

/* renamed from: com.tencent.mm.plugin.report.service.KVCommCrossProcessReceiver */
/* loaded from: classes12.dex */
public class C17196xafa566d5 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f239657a;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f239658b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile long f239659c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile int f239660d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b f239661e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Queue f239662f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.Object f239663g;

    static {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.r("kv_report");
        f239657a = rVar;
        rVar.m77789xc5a5549d(false);
        f239658b = "";
        f239659c = 10000;
        f239660d = -1;
        f239661e = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b();
        f239662f = new java.util.LinkedList();
        f239663g = new java.lang.Object();
    }

    public static boolean a(long j17) {
        long j18;
        try {
            if (f239660d > 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b = f239661e;
                if (c17193xfa87980b.f239651e.size() + c17193xfa87980b.f239652f.size() + c17193xfa87980b.f239650d.size() >= f239660d) {
                    return true;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b2 = f239661e;
            synchronized (c17193xfa87980b2.f239653g) {
                j18 = c17193xfa87980b2.f239653g[0];
            }
            if (j18 + j17 >= 307200) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.KVCommCrossProcessReceiver", "KV data size > 300K.");
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVCommCrossProcessReceiver", "checkExceedCacheItemCountLimit e = %s", e17);
        }
        return false;
    }

    public static void b() {
        boolean z17;
        synchronized (f239663g) {
            z17 = ((java.util.LinkedList) f239662f).size() > 0;
        }
        if (z17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f239657a;
            n3Var.mo50311x7ab51103(n3Var.mo50289x733c63a2(1), 0L);
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = f239657a;
        if (n3Var2.mo50285x8fc9be06(1) || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            return;
        }
        n3Var2.mo50311x7ab51103(n3Var2.mo50289x733c63a2(1), f239659c);
    }

    public static void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b = f239661e;
        if (c17193xfa87980b.f239650d.isEmpty() && c17193xfa87980b.f239651e.isEmpty() && c17193xfa87980b.f239652f.isEmpty()) {
            return;
        }
        ((java.util.LinkedList) f239662f).offer(new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b(c17193xfa87980b));
        c17193xfa87980b.f239650d.clear();
        c17193xfa87980b.f239651e.clear();
        c17193xfa87980b.f239652f.clear();
        synchronized (c17193xfa87980b.f239653g) {
            c17193xfa87980b.f239653g[0] = 0;
        }
    }

    public static void d() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f239657a;
        if (n3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274610g) {
            return;
        }
        n3Var.mo50311x7ab51103(n3Var.mo50289x733c63a2(1), 0L);
    }

    public static void e(com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17197xb3ea717 c17197xb3ea717) {
        long j17 = c17197xb3ea717.f239664d;
        synchronized (f239663g) {
            java.lang.String str = c17197xb3ea717.f239666f;
            long length = (str != null ? ((str.length() * 2) + 2 + 3 + 4) & (-4) : 4) + 12 + 16;
            java.lang.String str2 = c17197xb3ea717.f239666f;
            if (str2 != null && str2.getBytes(java.nio.charset.StandardCharsets.UTF_8).length > 7168) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "kv data too large: %s", java.lang.Long.valueOf(length));
                java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            if (length >= 102400) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.KVCommCrossProcessReceiver", new java.lang.Throwable(), "kv data too large: %s, invalid data = %s", java.lang.Long.valueOf(length), c17197xb3ea717.f239666f);
                java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            }
            if (length >= 307200) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVCommCrossProcessReceiver", "kv data too large: %s, invalid data = %s", java.lang.Long.valueOf(length), c17197xb3ea717.f239666f);
                throw new java.lang.OutOfMemoryError("kv data too large: " + length);
            }
            if (f239659c == 0 || a(length)) {
                c();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.C17193xfa87980b c17193xfa87980b = f239661e;
            c17193xfa87980b.f239650d.add(c17197xb3ea717);
            java.lang.String str5 = c17197xb3ea717.f239666f;
            c17193xfa87980b.a((str5 != null ? ((str5.length() * 2) + 2 + 3 + 4) & (-4) : 4) + 12 + 16 + 4);
        }
        b();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.KVCommCrossProcessReceiver", "onReceive intent == null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.s(this, intent);
        if (gm0.j1.i().f354741a.f354832d || (fp.d0.d("wechatbase") && com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37501x76847179().m37619x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class) != null && ((com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.smc.C4585x1608f244.class)).m40378x376602e1())) {
            f239657a.mo50293x3498a0(sVar);
        } else {
            gm0.j1.i().c(new com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.t(this, sVar));
        }
    }
}
