package uh1;

/* loaded from: classes7.dex */
public class x0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f509454b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f509455c;

    /* renamed from: d, reason: collision with root package name */
    public javax.net.ssl.SSLContext f509456d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f509457e;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f509459g;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f509458f = new java.util.ArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f509462j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f509463k = new java.util.concurrent.ConcurrentLinkedQueue();

    /* renamed from: a, reason: collision with root package name */
    public int f509453a = Integer.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f509460h = new java.util.Hashtable(10);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f509461i = new java.util.HashMap();

    public x0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, boolean z17) {
        this.f509455c = false;
        this.f509459g = lVar;
        this.f509455c = z17;
        java.lang.String D = lp0.b.D();
        this.f509454b = (D.endsWith("/") ? D : D.concat("/")) + "networkfiles/";
    }

    public static void a(uh1.x0 x0Var, java.lang.String str) {
        if (str == null) {
            x0Var.getClass();
            return;
        }
        synchronized (x0Var.f509462j) {
            java.util.Iterator it = x0Var.f509462j.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                vh1.f fVar = (vh1.f) it.next();
                if (str.equals(fVar.f518566v)) {
                    x0Var.f509462j.remove(fVar);
                    break;
                }
            }
            if (x0Var.f509462j.size() < x0Var.f509453a && x0Var.f509463k.peek() != null) {
                vh1.f fVar2 = (vh1.f) x0Var.f509463k.poll();
                x0Var.f509462j.add(fVar2);
                s75.d.b(fVar2, "appbrand_preload_download_thread");
            }
        }
    }

    public void b(org.json.JSONObject jSONObject, int i17, java.util.Map map, java.util.ArrayList arrayList, int i18, uh1.d dVar, java.lang.String str, java.lang.String str2) {
        java.lang.String optString = jSONObject.optString("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "predownload taskId:%s url:%s", str, optString);
        synchronized (this.f509461i) {
            uh1.w0 w0Var = (uh1.w0) ((java.util.HashMap) this.f509461i).get(optString);
            if (w0Var != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "already downloaded return cached file:%s url:%s", w0Var.f509448a, optString);
                dVar.c(0, w0Var.f509449b, w0Var.f509448a, w0Var.f509450c, w0Var.f509451d, null);
                ((java.util.HashMap) this.f509461i).remove(optString);
                return;
            }
            java.lang.String str3 = this.f509454b + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString) + "temp";
            synchronized (this.f509460h) {
                if (((java.util.Hashtable) this.f509460h).get(optString) != null) {
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f509460h).get(optString);
                    concurrentLinkedQueue.offer(dVar);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreloadNetworkDownload", "predownload the same task is working url:%s,size:%d", optString, java.lang.Integer.valueOf(concurrentLinkedQueue.size()));
                    return;
                }
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue2 = new java.util.concurrent.ConcurrentLinkedQueue();
                concurrentLinkedQueue2.offer(dVar);
                ((java.util.Hashtable) this.f509460h).put(optString, concurrentLinkedQueue2);
                vh1.f fVar = new vh1.f(this.f509459g, optString, str3, jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1), this.f509457e, this.f509455c, jSONObject.optBoolean("enableHttp2", false), jSONObject.optBoolean("enableQuic", false), jSONObject.optBoolean("enableCache", false), jSONObject.optBoolean("enableProfile", true), new uh1.v0(this, str, dVar));
                fVar.f518560p = map;
                fVar.f518561q = i17;
                fVar.f518554g = true;
                fVar.f518563s = arrayList;
                fVar.f518564t = 1048576 * i18;
                fVar.f518562r = this.f509456d;
                fVar.f518566v = str;
                fVar.f518569y = str2;
                synchronized (this.f509462j) {
                    if (this.f509462j.size() < this.f509453a) {
                        this.f509462j.add(fVar);
                        s75.d.b(fVar, "appbrand_predownload_thread");
                    } else {
                        synchronized (this.f509463k) {
                            this.f509463k.add(fVar);
                        }
                    }
                }
            }
        }
    }
}
