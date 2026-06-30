package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002;

/* loaded from: classes8.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f220942a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f220943b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Set f220944c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f220945d = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("activityExistNum");

    public static void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220937b.c();
        java.lang.String[] split = obj.getClass().getName().split("\\.");
        if (split.length > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onCreate", split[split.length - 1]);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f220945d;
        o4Var.putInt("existNum", o4Var.getInt("existNum", 0) + 1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("action_id", 1);
        bundle.putString("action_param", obj.getClass().getName());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.h.class, null);
    }

    public static android.os.Bundle b() {
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220937b;
        eVar.a();
        eVar.getClass();
        bundle.putString("session_id", (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220938c.b(eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e.f220935a[0]));
        eVar.a();
        bundle.putLong("client_timestamp", eVar.b());
        return bundle;
    }

    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 c() {
        if (f220942a == null) {
            synchronized (f220943b) {
                if (f220942a == null) {
                    f220942a = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3("GameCommLib#WorkThread");
                    lm5.i.c("GameCommLib#WorkThread", new t65.g("GameCommLib#WorkThread"));
                }
            }
        }
        return f220942a;
    }

    public static boolean d(android.content.Context context, java.lang.String str) {
        return ((java.util.HashSet) f220944c).contains(str);
    }

    public static java.lang.String e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e eVar = com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220937b;
        eVar.getClass();
        java.lang.String str = ((java.lang.System.currentTimeMillis() - eVar.b()) > 300000L ? 1 : ((java.lang.System.currentTimeMillis() - eVar.b()) == 300000L ? 0 : -1)) > 0 && f220945d.getInt("existNum", 0) == 0 ? "" : (java.lang.String) com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220938c.b(eVar, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.e.f220935a[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommLibUtil", "gamelog.report, reportDownload, querySessionId sessionId = %s", str);
        return str;
    }

    public static void f(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.g.f220937b.c();
        java.lang.String[] split = obj.getClass().getName().split("\\.");
        if (split.length > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameCommLibUtil", "gamelog.activity, %s, onDestroy", split[split.length - 1]);
        }
        f220945d.putInt("existNum", r1.getInt("existNum", 0) - 1);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("action_id", 2);
        bundle.putString("action_param", obj.getClass().getName());
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1738x38a607f9.p1739x36f002.h.class, null);
    }
}
