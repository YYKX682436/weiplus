package y00;

/* loaded from: classes8.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f540094d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f540095e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f540096f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f540097g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f540098h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540099i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f540100m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ y00.t f540101n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.List f540102o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f540103p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(java.util.Map map, boolean z17, long j17, java.lang.String str, android.widget.LinearLayout linearLayout, y00.t tVar, java.util.List list, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f540096f = map;
        this.f540097g = z17;
        this.f540098h = j17;
        this.f540099i = str;
        this.f540100m = linearLayout;
        this.f540101n = tVar;
        this.f540102o = list;
        this.f540103p = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        y00.y yVar = new y00.y(this.f540096f, this.f540097g, this.f540098h, this.f540099i, this.f540100m, this.f540101n, this.f540102o, this.f540103p, interfaceC29045xdcb5ca57);
        yVar.f540095e = obj;
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((y00.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        a10.a aVar;
        long j17;
        java.util.Map map;
        boolean z17;
        boolean z18;
        java.lang.Object j18;
        boolean z19;
        pz5.a aVar2 = pz5.a.f440719d;
        int i17 = this.f540094d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f540095e;
            java.util.Map s17 = kz5.c1.s(this.f540096f);
            if (this.f540097g) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: skipDbQuery=true, msgSvrId=" + this.f540098h);
                map = s17;
                j17 = 0L;
            } else {
                try {
                    aVar = a10.e.f82023a.a().z0(this.f540098h, this.f540099i);
                } catch (java.util.concurrent.CancellationException e17) {
                    throw e17;
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardUIRefresher", th6, "query db fail, msgSvrId=" + this.f540098h, new java.lang.Object[0]);
                    aVar = null;
                }
                p3325xe03a0797.p3326xc267989b.z0.g(y0Var);
                java.lang.String str = aVar != null ? aVar.f68039x79a61690 : null;
                j17 = aVar != null ? aVar.f68042xa783a79b : 0L;
                if (!(str == null || str.length() == 0)) {
                    android.util.LruCache lruCache = y00.z.f540104a;
                    map = y00.a0.a(str, this.f540098h, "MicroMsg.EcsKfProductCardUIRefresher");
                    if (map != null) {
                        p3325xe03a0797.p3326xc267989b.v2.f(y0Var.getF93115e());
                        ((ku5.t0) ku5.t0.f394148d).B(new y00.x(this.f540099i, this.f540098h, map, j17));
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(map, s17)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: db cache values same as initial, skip render, msgSvrId=" + this.f540098h);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: db cache hit, msgSvrId=" + this.f540098h);
                            ((ku5.t0) ku5.t0.f394148d).B(new y00.u(this.f540100m, this.f540098h, this.f540101n, map));
                        }
                    }
                }
                map = s17;
            }
            if (this.f540102o.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: empty productIds, skip cgi, msgSvrId=" + this.f540098h);
                return jz5.f0.f384359a;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            y00.g a17 = y00.h.a(this.f540099i, this.f540098h);
            long j19 = a17 != null ? a17.f540059b : 0L;
            long max = java.lang.Math.max(j19, j17);
            if (max > 0) {
                long j27 = currentTimeMillis - max;
                if (j27 < 180000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi throttled (success-ttl), age=" + j27 + "ms (mem=" + j19 + " db=" + j17 + ") < 180000ms, msgSvrId=" + this.f540098h);
                    return jz5.f0.f384359a;
                }
            }
            java.lang.Long l17 = (java.lang.Long) y00.z.f540104a.get(new java.lang.Long(this.f540098h));
            long longValue = l17 == null ? 0L : l17.longValue();
            if (longValue > 0) {
                long j28 = currentTimeMillis - longValue;
                if (j28 < 30000) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi throttled (fail-ttl), age=" + j28 + "ms < 30000ms, msgSvrId=" + this.f540098h);
                    return jz5.f0.f384359a;
                }
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = y00.f.f540056a;
            y00.s sVar = new y00.s(this.f540099i, this.f540098h, this.f540102o, this.f540103p);
            this.f540095e = map;
            this.f540094d = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            if (sVar.f540079b <= 0 || sVar.f540080c.isEmpty()) {
                z17 = false;
                z18 = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfProductCardFetcher", "fetch invalid request: msgSvrId=" + sVar.f540079b + ", products=" + sVar.f540080c.size());
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null));
            } else {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = y00.f.f540056a;
                synchronized (concurrentHashMap2) {
                    java.util.List list = (java.util.List) concurrentHashMap2.get(new java.lang.Long(sVar.f540079b));
                    if (list != null) {
                        list.add(rVar);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardFetcher", "fetch dedup: msgSvrId=" + sVar.f540079b + ", queue size=" + list.size());
                        z17 = false;
                        z19 = false;
                    } else {
                        z17 = false;
                        concurrentHashMap2.put(new java.lang.Long(sVar.f540079b), kz5.c0.k(rVar));
                        z19 = true;
                    }
                }
                rVar.m(new y00.b(sVar, rVar));
                if (z19) {
                    bw5.le0 le0Var = new bw5.le0();
                    le0Var.f111298e = sVar.f540081d;
                    boolean[] zArr = le0Var.f111299f;
                    zArr[3] = true;
                    java.util.List list2 = sVar.f540080c;
                    java.util.Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        long longValue2 = ((java.lang.Number) it.next()).longValue();
                        bw5.ke0 ke0Var = new bw5.ke0();
                        ke0Var.f110893d = longValue2;
                        ke0Var.f110894e[1] = true;
                        le0Var.f111297d.add(ke0Var);
                        zArr[2] = true;
                    }
                    z18 = true;
                    com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
                    lVar.f152197a = le0Var;
                    lVar.f152198b = new bw5.me0();
                    lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_batchgetkfproductxml";
                    lVar.f152200d = 21793;
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                    int h17 = gm0.j1.b().h();
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("sendCgi: msgSvrId=");
                    sb6.append(sVar.f540079b);
                    sb6.append(", products=");
                    sb6.append(list2.size());
                    sb6.append(", hasReportInfo=");
                    sb6.append(sVar.f540081d.length() > 0 ? true : z17);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardFetcher", sb6.toString());
                    ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new y00.e(currentTimeMillis2, sVar, h17));
                } else {
                    z18 = true;
                }
            }
            j18 = rVar.j();
            pz5.a aVar3 = pz5.a.f440719d;
            if (j18 == aVar2) {
                return aVar2;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            map = (java.util.Map) this.f540095e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            z17 = false;
            z18 = true;
            j18 = obj;
        }
        y00.a aVar4 = (y00.a) j18;
        if (aVar4 != null) {
            if (aVar4.f540024b.length() == 0) {
                z17 = z18;
            }
            if (!z17) {
                y00.z.f540104a.remove(new java.lang.Long(this.f540098h));
                android.util.LruCache lruCache2 = y00.z.f540104a;
                java.util.Map a18 = y00.a0.a(aVar4.f540024b, this.f540098h, "MicroMsg.EcsKfProductCardUIRefresher");
                if (a18 == null) {
                    return jz5.f0.f384359a;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a18, map)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi values same as last rendered, skip, msgSvrId=" + this.f540098h);
                    return jz5.f0.f384359a;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi fresh values applied, msgSvrId=" + this.f540098h);
                ((ku5.t0) ku5.t0.f394148d).B(new y00.u(this.f540100m, this.f540098h, this.f540101n, a18));
                return jz5.f0.f384359a;
            }
        }
        y00.z.f540104a.put(new java.lang.Long(this.f540098h), new java.lang.Long(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardUIRefresher", "tryRefresh: cgi no fresh data, marked fail-throttle, msgSvrId=" + this.f540098h);
        return jz5.f0.f384359a;
    }
}
