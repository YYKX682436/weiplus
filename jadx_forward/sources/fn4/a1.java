package fn4;

/* loaded from: classes15.dex */
public class a1 {

    /* renamed from: b, reason: collision with root package name */
    public fn4.b f346008b;

    /* renamed from: c, reason: collision with root package name */
    public int f346009c;

    /* renamed from: e, reason: collision with root package name */
    public r45.xn6 f346011e;

    /* renamed from: f, reason: collision with root package name */
    public rm4.d f346012f;

    /* renamed from: d, reason: collision with root package name */
    public int f346010d = 2;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f346013g = new java.util.ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f346007a = new java.util.HashMap();

    public void a() {
        if (this.f346012f == null || this.f346011e == null) {
            return;
        }
        ((java.util.ArrayList) this.f346013g).add(this.f346011e.f471792h + "#" + (this.f346012f.f478988d / 1000));
    }

    public void b() {
        int i17 = this.f346009c - 1;
        this.f346009c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "onUIDestroy %d", java.lang.Integer.valueOf(i17));
        if (this.f346009c <= 0) {
            c();
            this.f346008b = null;
        }
    }

    public void c() {
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2 = new java.util.HashSet();
        for (rm4.e eVar : ((java.util.HashMap) this.f346007a).values()) {
            if (!eVar.f479011d) {
                hashSet2.add(eVar);
                eVar.f479011d = true;
            }
        }
        if (this.f346008b != null) {
            om4.t Ai = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).Ai();
            r45.un6 r07 = this.f346008b.r0();
            Ai.getClass();
            if (hashSet2.size() == 0) {
                return;
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) Ai.f427976b;
            om4.s sVar = (om4.s) concurrentHashMap.get(java.lang.Long.valueOf(r07.f469038h));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = Ai.f427975a;
            if (sVar != null && n3Var.mo50285x8fc9be06(0)) {
                java.util.HashSet hashSet3 = sVar.f427972d;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo hit cached task %d add %d", java.lang.Integer.valueOf(hashSet3.size()), java.lang.Integer.valueOf(hashSet2.size()));
                java.util.Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    hashSet3.add((rm4.e) it.next());
                }
                return;
            }
            if (sVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo not report task: %s size: %d", sVar, java.lang.Integer.valueOf(sVar.f427972d.size()));
            }
            om4.s sVar2 = new om4.s(Ai, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "reportExposeVideoInfo new task %d %s", java.lang.Integer.valueOf(hashSet2.size()), sVar2);
            java.lang.System.currentTimeMillis();
            java.util.Iterator it6 = hashSet2.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                hashSet = sVar2.f427972d;
                if (!hasNext) {
                    break;
                } else {
                    hashSet.add((rm4.e) it6.next());
                }
            }
            sVar2.f427973e = r07;
            if (hashSet.size() > 0) {
                n3Var.mo50303x856b99f0(0);
                n3Var.mo50311x7ab51103(n3Var.mo50292x733c63a2(0, sVar2), 5000L);
                concurrentHashMap.put(java.lang.Long.valueOf(r07.f469038h), sVar2);
            }
        }
    }

    public void d(r45.xn6 xn6Var) {
        e(xn6Var);
        ((rm4.e) ((java.util.HashMap) this.f346007a).get(xn6Var.f471792h)).f479009b = true;
    }

    public void e(r45.xn6 xn6Var) {
        if (xn6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose null");
        }
        rm4.e eVar = new rm4.e(xn6Var);
        java.util.Map map = this.f346007a;
        if (((java.util.HashMap) map).containsKey(eVar.f479008a.f471792h)) {
            ((rm4.e) ((java.util.HashMap) map).get(eVar.f479008a.f471792h)).f479008a = xn6Var;
        } else {
            ((java.util.HashMap) map).put(eVar.f479008a.f471792h, eVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose %s", xn6Var);
        }
    }

    public void f(r45.xn6 xn6Var, int i17, java.lang.String str) {
        this.f346011e = xn6Var;
        rm4.d dVar = new rm4.d();
        this.f346012f = dVar;
        dVar.f478985a = java.lang.System.currentTimeMillis();
        rm4.d dVar2 = this.f346012f;
        dVar2.f478993i = 2L;
        dVar2.f478992h = this.f346010d;
        dVar2.f479005u = i17 + 1;
        r45.un6 r07 = this.f346008b.r0();
        this.f346012f.f479004t = r07.f469039i + "_" + r07.f469040m + "_" + r07.f469038h;
        if (this.f346008b.h1()) {
            this.f346012f.f478991g = 1L;
        }
        this.f346010d = 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "startVideoPlay %s %s %s reportInfo: %d %d", str, xn6Var.f471792h, xn6Var.f471788d, java.lang.Long.valueOf(this.f346012f.f478992h), java.lang.Long.valueOf(this.f346012f.f478993i));
    }

    public void g(r45.un6 un6Var) {
        a();
        om4.t Ai = ((om4.m) i95.n0.c(om4.m.class)).Ai();
        r45.xn6 xn6Var = this.f346011e;
        rm4.d dVar = this.f346012f;
        Ai.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay: %s %s", xn6Var, dVar);
        if (xn6Var != null && dVar != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            dVar.f478986b = currentTimeMillis;
            dVar.f478987c = currentTimeMillis - dVar.f478985a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ismediaplay=1&searchid=");
            sb6.append(un6Var.f469040m);
            sb6.append("&scene=");
            sb6.append(un6Var.f469039i);
            sb6.append("&businesstype=3&mediatype=2&rec_category=");
            sb6.append(un6Var.f469038h);
            sb6.append("&docid=");
            sb6.append(xn6Var.G);
            sb6.append("&cdnsourcetype=");
            sb6.append(xn6Var.Q);
            try {
                sb6.append("&expand1=");
                sb6.append(fp.s0.b(xn6Var.f471806x, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused) {
            }
            sb6.append("&query=");
            try {
                sb6.append(fp.s0.b(un6Var.f469041n, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused2) {
            }
            sb6.append("&title=");
            try {
                sb6.append(fp.s0.b(xn6Var.f471788d, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
            } catch (java.lang.Exception unused3) {
            }
            sb6.append("&duration=");
            sb6.append(xn6Var.f471791g * 1000);
            sb6.append("&mediaid=");
            sb6.append(xn6Var.f471792h);
            sb6.append("&startplaytime=");
            sb6.append(dVar.f478985a);
            sb6.append("&endplaytime=");
            sb6.append(dVar.f478986b);
            sb6.append("&playtime=");
            sb6.append(dVar.f478987c);
            sb6.append("&lastplayms=");
            sb6.append(dVar.f478988d);
            sb6.append("&autoplay=");
            sb6.append(dVar.f478992h);
            sb6.append("&hasplayended=");
            sb6.append(dVar.f478989e);
            sb6.append("&hasquickplay=");
            sb6.append(dVar.f478990f);
            sb6.append("&hasfullscreen=");
            sb6.append(dVar.f478991g);
            sb6.append("&hitpreload=");
            sb6.append(dVar.f478993i);
            sb6.append("&firstloadtime=");
            sb6.append(dVar.f478996l);
            sb6.append("&downloadfinishtime=");
            sb6.append(dVar.f478997m);
            sb6.append("&firstmoovreadytime=");
            sb6.append(dVar.f478998n);
            sb6.append("&firstdataavailabletime=");
            sb6.append(dVar.f479001q);
            sb6.append("&filesize=");
            sb6.append(dVar.f479007w);
            if (dVar.f479006v != null) {
                sb6.append("&bitrate=");
                sb6.append(dVar.f479006v.f243916b);
                sb6.append("&audiobitrate=");
                sb6.append(dVar.f479006v.f243921g);
            }
            java.lang.String sb7 = sb6.toString();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(sb7)) {
                r45.lq5 lq5Var = new r45.lq5();
                lq5Var.f461289t = sb7;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "build14436VideoPlayReportString %s", sb7);
                gm0.j1.d().g(new su4.u1(lq5Var));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2083x685d99d.p2084x2e06d1.b bVar = dVar.f479006v;
            java.lang.String format = java.lang.String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", java.lang.Integer.valueOf(un6Var.f469039i), xn6Var.f471792h, java.lang.Long.valueOf(xn6Var.f471787J), "mp4", java.lang.Integer.valueOf(xn6Var.f471791g), java.lang.Integer.valueOf(bVar != null ? bVar.f243916b : 0), java.lang.Long.valueOf(dVar.f478985a), java.lang.Long.valueOf(dVar.f478986b), java.lang.Long.valueOf(dVar.f478988d), java.lang.Long.valueOf(dVar.f478987c), java.lang.Long.valueOf(dVar.f478990f), java.lang.Long.valueOf(dVar.f478991g), java.lang.Long.valueOf(dVar.f478992h), java.lang.Long.valueOf(dVar.f478993i), java.lang.Long.valueOf(dVar.f478996l), java.lang.Long.valueOf(dVar.f478997m), java.lang.Long.valueOf(dVar.f478989e), java.lang.Long.valueOf(dVar.f478998n), java.lang.Long.valueOf(dVar.f478999o), java.lang.Long.valueOf(dVar.f479001q), java.lang.Long.valueOf(dVar.f479002r), dVar.f479004t, java.lang.Long.valueOf(dVar.f479005u), com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b(), java.lang.Long.valueOf(dVar.f479000p), java.lang.Long.valueOf(dVar.f479003s), java.lang.Long.valueOf(dVar.f478994j), java.lang.Long.valueOf(dVar.f478995k), un6Var.f469045r);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryReporterImpl", "stopVideoPlay 15414 %s", format);
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.mo68478xbd3cda5f(15414, format);
            if (dVar.f478996l > 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c344 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c344.m40330x4c144dd(845);
                c4582x424c344.m40331x936762bd(0);
                c4582x424c344.m40332x57b2b64f(dVar.f478996l);
                arrayList.add(c4582x424c344);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3442 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3442.m40330x4c144dd(845);
                c4582x424c3442.m40331x936762bd(1);
                c4582x424c3442.m40332x57b2b64f(1L);
                arrayList.add(c4582x424c3442);
                fVar.b(arrayList, false);
            }
            if (dVar.f478987c > 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3443 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3443.m40330x4c144dd(845);
                c4582x424c3443.m40331x936762bd(2);
                c4582x424c3443.m40332x57b2b64f(dVar.f478987c);
                arrayList2.add(c4582x424c3443);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3444 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3444.m40330x4c144dd(845);
                c4582x424c3444.m40331x936762bd(3);
                c4582x424c3444.m40332x57b2b64f(1L);
                arrayList2.add(c4582x424c3444);
                fVar.b(arrayList2, false);
            }
            if (dVar.f478997m > 0) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3445 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3445.m40330x4c144dd(845);
                c4582x424c3445.m40331x936762bd(4);
                c4582x424c3445.m40332x57b2b64f(dVar.f478997m);
                arrayList3.add(c4582x424c3445);
                com.p314xaae8f345.p542x3306d5.smc.C4582x424c344 c4582x424c3446 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344();
                c4582x424c3446.m40330x4c144dd(845);
                c4582x424c3446.m40331x936762bd(5);
                c4582x424c3446.m40332x57b2b64f(1L);
                arrayList3.add(c4582x424c3446);
                fVar.b(arrayList3, false);
            }
        }
        this.f346011e = null;
        this.f346012f = null;
    }
}
