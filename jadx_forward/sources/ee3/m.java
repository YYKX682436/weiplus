package ee3;

/* loaded from: classes7.dex */
public class m implements jc3.v {

    /* renamed from: a, reason: collision with root package name */
    public final int f333169a;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f333171c = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f333173e = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f333172d = new java.util.Hashtable(10);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f333170b = com.p314xaae8f345.mm.vfs.w6.i(fe3.l.c(), true);

    public m(java.lang.String str) {
        this.f333169a = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).wi(str).f380500c;
    }

    @Override // jc3.v
    public jc3.w a(java.lang.String str) {
        if (str == null) {
            return null;
        }
        synchronized (this.f333173e) {
            java.util.Iterator it = this.f333173e.iterator();
            while (it.hasNext()) {
                ee3.d dVar = (ee3.d) it.next();
                if (str.equals(dVar.f333133s)) {
                    return dVar;
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
        this.f333171c.add(wVar.mo127517x30961476());
        e(wVar.mo127517x30961476());
        wVar.a();
    }

    @Override // jc3.v
    public boolean c(java.lang.String str) {
        return this.f333171c.contains(str);
    }

    @Override // jc3.v
    public void d(lc3.h0 h0Var, java.lang.String str, lc3.a0 a0Var, int i17, java.lang.String str2, java.lang.String str3, jc3.x0 x0Var) {
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue;
        java.lang.String optString = a0Var.optString("url");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download taskId:%s url:%s", str2, optString);
        synchronized (this.f333173e) {
            if (this.f333173e.size() >= this.f333169a) {
                x0Var.c(300007, "fail:network exceed max task count", null, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "exceed max task count mDownloadTaskList.size():%d,mMaxConnected:%d", java.lang.Integer.valueOf(this.f333173e.size()), java.lang.Integer.valueOf(this.f333169a));
                return;
            }
            java.lang.String str4 = this.f333170b;
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(optString) + "temp" + java.lang.System.currentTimeMillis();
            int optInt = a0Var.optInt("fileType", 0);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(optString.getBytes());
            java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "download taskId %s,fileDir %s, fileName %s, fileType %d", str2, str4, str5, java.lang.Integer.valueOf(optInt));
            ee3.d dVar = new ee3.d(str, optString, str5, str4, optInt, new ee3.l(this, str2, x0Var));
            dVar.f333131q = i17;
            dVar.f333122e = true;
            dVar.f333133s = str2;
            dVar.f333135u = str3;
            synchronized (this.f333173e) {
                this.f333173e.add(dVar);
            }
            synchronized (this.f333172d) {
                if (((java.util.Hashtable) this.f333172d).containsKey(optString)) {
                    concurrentLinkedQueue = (java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f333172d).get(optString);
                } else {
                    concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
                    ((java.util.Hashtable) this.f333172d).put(optString, concurrentLinkedQueue);
                }
                concurrentLinkedQueue.offer(dVar);
            }
            if (((java.util.Hashtable) this.f333172d).get(optString) == null || ((java.util.concurrent.ConcurrentLinkedQueue) ((java.util.Hashtable) this.f333172d).get(optString)).size() <= 1) {
                ((ku5.t0) ku5.t0.f394148d).h(new ee3.k(this, optString), "magicbrush_cdndownload_thread");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrushNetworkCDNDownload", "hy: more than one same url in the queue, just add and wait");
            }
        }
    }

    public final void e(java.lang.String str) {
        if (str == null) {
            return;
        }
        synchronized (this.f333173e) {
            java.util.Iterator it = this.f333173e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ee3.d dVar = (ee3.d) it.next();
                if (str.equals(dVar.f333133s)) {
                    this.f333173e.remove(dVar);
                    break;
                }
            }
        }
    }
}
