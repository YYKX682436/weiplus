package jn4;

/* loaded from: classes11.dex */
public class m {

    /* renamed from: i, reason: collision with root package name */
    public static java.lang.String f382347i;

    /* renamed from: j, reason: collision with root package name */
    public static jn4.p f382348j;

    /* renamed from: a, reason: collision with root package name */
    public boolean f382349a = false;

    /* renamed from: b, reason: collision with root package name */
    public final jn4.h f382350b = new jn4.h(this, null);

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f382351c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f382352d;

    /* renamed from: e, reason: collision with root package name */
    public jn4.f f382353e;

    /* renamed from: f, reason: collision with root package name */
    public jn4.e f382354f;

    /* renamed from: g, reason: collision with root package name */
    public jn4.d f382355g;

    /* renamed from: h, reason: collision with root package name */
    public jn4.c f382356h;

    public m(java.lang.String str) {
        this.f382352d = str;
        f382347i = fp.m.b().getAbsolutePath() + "/tencent/traceroute_log_" + new java.text.SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()).toString() + ".log";
    }

    public static void a(jn4.m mVar) {
        jn4.c cVar = mVar.f382356h;
        if (cVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.x) cVar).f256874a.f256876a.f256850m.mo50305x3d8a09a2(3);
        }
    }

    public void b(java.lang.String[] strArr, boolean z17) {
        if (strArr == null || strArr.length == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "no ip contains");
            return;
        }
        java.lang.String str = z17 ? "long: " : "short: ";
        for (java.lang.String str2 : strArr) {
            java.lang.String[] split = str2.split(":");
            if (split == null || split.length != 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "err ip ".concat(str2));
            } else {
                java.util.Map map = this.f382351c;
                if (((java.util.HashMap) map).containsKey(split[0])) {
                    ((java.util.Set) ((java.util.HashMap) map).get(split[0])).add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0)));
                } else {
                    java.util.HashSet hashSet = new java.util.HashSet();
                    hashSet.add(java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(split[1], 0)));
                    ((java.util.HashMap) map).put(split[0], hashSet);
                    str = str + split[0] + " ";
                }
            }
        }
        com.p314xaae8f345.mm.vfs.w6.a(f382347i, (str + "\n").getBytes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void c(java.lang.String str, java.lang.String str2, java.lang.Integer num) {
        if (str != null && str2 != null) {
            if (num.intValue() >= 0) {
                if (!this.f382350b.containsKey(str)) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
                    concurrentHashMap.put(num, new java.lang.StringBuilder(str2));
                    this.f382350b.put(str, concurrentHashMap);
                } else if (((java.util.concurrent.ConcurrentHashMap) this.f382350b.get(str)).containsKey(num)) {
                    ((java.lang.StringBuilder) ((java.util.concurrent.ConcurrentHashMap) this.f382350b.get(str)).get(num)).append(str2);
                } else {
                    new java.util.concurrent.ConcurrentHashMap().put(num, new java.lang.StringBuilder(str2));
                    ((java.util.concurrent.ConcurrentHashMap) this.f382350b.get(str)).put(num, new java.lang.StringBuilder(str2));
                }
            }
        }
    }

    public void d() {
        synchronized (this) {
            this.f382349a = true;
        }
        jn4.p pVar = f382348j;
        if (pVar != null) {
            try {
                pVar.shutdownNow();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMTraceRoute", "failed to shutdown threadpool: " + e17.getMessage());
            }
        }
    }
}
