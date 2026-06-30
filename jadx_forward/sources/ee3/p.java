package ee3;

/* loaded from: classes7.dex */
public class p implements jc3.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f333179a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f333180b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f333181c;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f333183e = new java.util.ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f333185g = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f333182d = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.f5.class)).j9();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f333184f = new java.util.Hashtable(10);

    public p(java.lang.String str) {
        this.f333179a = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).wi(str).f380500c;
        this.f333180b = java.lang.Long.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).wi(str).f380499b);
        java.lang.String i17 = com.p314xaae8f345.mm.vfs.w6.i(fe3.l.c(), true);
        this.f333181c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkDownload", "lm: FILE_PATH_BASE %s", i17);
    }

    @Override // jc3.v
    public jc3.w a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f333185g) {
            java.util.Iterator it = this.f333185g.iterator();
            while (it.hasNext()) {
                ee3.j jVar = (ee3.j) it.next();
                if (str.equals(jVar.f333157t)) {
                    return jVar;
                }
            }
            return null;
        }
    }

    @Override // jc3.v
    public void b(jc3.w wVar) {
        if (wVar == null) {
            return;
        }
        this.f333183e.add(wVar.mo127517x30961476());
        e(wVar.mo127517x30961476());
        wVar.a();
    }

    @Override // jc3.v
    public boolean c(java.lang.String str) {
        return this.f333183e.contains(str);
    }

    @Override // jc3.v
    public void d(lc3.h0 h0Var, java.lang.String str, lc3.a0 a0Var, int i17, java.lang.String str2, java.lang.String str3, jc3.x0 x0Var) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.String optString = a0Var.optString("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkDownload", "download taskId:%s url:%s", str2, optString);
        synchronized (this.f333185g) {
            if (this.f333185g.size() >= this.f333179a) {
                x0Var.c(300007, "fail:network exceed max task count", null, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkDownload", "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d", java.lang.Integer.valueOf(this.f333185g.size()), java.lang.Integer.valueOf(this.f333179a));
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            try {
                org.json.JSONObject optJSONObject = a0Var.optJSONObject("header");
                if (optJSONObject != null) {
                    java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        java.lang.String next = keys.next();
                        if (next != null) {
                            hashMap.put(next.toLowerCase(), optJSONObject.getString(next));
                        }
                    }
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MagicBrushNetworkUtil", e17, "Exception: get header error", new java.lang.Object[0]);
            }
            java.lang.String optString2 = a0Var.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "");
            java.lang.String str4 = this.f333181c + com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString) + "temp" + java.lang.System.currentTimeMillis();
            boolean optBoolean = a0Var.optBoolean("enableHttp2", false);
            boolean optBoolean2 = a0Var.optBoolean("enableQuic", false);
            boolean optBoolean3 = a0Var.optBoolean("enableCache", false);
            boolean optBoolean4 = a0Var.optBoolean("enableProfile", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkDownload", "download taskId %s,useHttp2 %b, useQuic %b, useMemoryCache %b, useProfile %b", str2, java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean4));
            ee3.j jVar = new ee3.j(h0Var, str, optString, str4, optString2, this.f333182d, optBoolean, optBoolean2, optBoolean3, optBoolean4, new ee3.o(this, str2, x0Var));
            jVar.f333153p = hashMap;
            jVar.f333154q = i17;
            jVar.f333147g = true;
            jVar.f333155r = this.f333180b.longValue();
            jVar.f333157t = str2;
            jVar.f333160w = str3;
            synchronized (this.f333185g) {
                this.f333185g.add(jVar);
            }
            synchronized (this.f333184f) {
                if (((java.util.Hashtable) this.f333184f).containsKey(optString)) {
                    concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f333184f).get(optString);
                } else {
                    concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                    ((java.util.Hashtable) this.f333184f).put(optString, concurrentLinkedQueue);
                }
                concurrentLinkedQueue.offer(jVar);
            }
            if (((java.util.Hashtable) this.f333184f).get(optString) == null || ((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f333184f).get(optString)).size() <= 1) {
                ((ku5.t0) ku5.t0.f394148d).h(new ee3.n(this, optString), "magicbrush_download_thread");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkDownload", "hy: more than one same url in the queue, just add and wait");
            }
        }
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f333185g) {
            java.util.Iterator it = this.f333185g.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ee3.j jVar = (ee3.j) it.next();
                if (str.equals(jVar.f333157t)) {
                    this.f333185g.remove(jVar);
                    break;
                }
            }
        }
    }
}
