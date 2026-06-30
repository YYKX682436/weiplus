package hq0;

/* loaded from: classes7.dex */
public final class b0 extends hq0.i implements qq0.j {
    public final java.util.Set A;
    public gq0.v B;
    public final java.util.concurrent.ConcurrentHashMap C;
    public final java.util.concurrent.ConcurrentHashMap D;
    public final mq0.l0 E;
    public final java.util.concurrent.ConcurrentHashMap F;
    public final int G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.ref.WeakReference f364502J;
    public int K;
    public yz5.a L;
    public boolean M;
    public volatile java.util.List N;
    public volatile boolean P;
    public volatile boolean Q;
    public volatile long R;
    public volatile p3325xe03a0797.p3326xc267989b.r2 S;
    public final java.util.Collection T;
    public final hq0.k U;
    public boolean V;

    /* renamed from: x, reason: collision with root package name */
    public final iq0.g f364503x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f364504y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f364505z;

    public b0(iq0.g bizConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizConfig, "bizConfig");
        this.f364503x = bizConfig;
        this.f364504y = "MicroMsg.MagicCardStarterBiz." + bizConfig.f375167a;
        this.f364505z = "SclBizDefaultTouchListener";
        this.A = new java.util.HashSet();
        Q1();
        this.C = new java.util.concurrent.ConcurrentHashMap();
        this.D = new java.util.concurrent.ConcurrentHashMap();
        this.E = new mq0.l0(bizConfig.f375167a);
        this.F = new java.util.concurrent.ConcurrentHashMap();
        this.G = 8;
        this.N = kz5.p0.f395529d;
        this.R = bizConfig.f375197j;
        this.T = kz5.n0.t0(kz5.n0.t0(kz5.b0.c(new lq0.g()), ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.f4.class))).Ni(bizConfig.f375167a)), bizConfig.f375169c);
        this.U = new hq0.k(this);
    }

    public static final java.util.List J1(hq0.b0 b0Var, iq0.e eVar, wq0.b bVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = (java.util.concurrent.CopyOnWriteArrayList) b0Var.D.get(eVar.a());
        if (copyOnWriteArrayList == null) {
            return kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            java.util.Collection values = ((java.util.HashMap) it.next()).values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            kz5.h0.u(arrayList, values);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (((com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d) next).getViewState() == bVar) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    @Override // lc3.e
    public android.app.Activity B0() {
        android.app.Activity activity;
        java.lang.ref.WeakReference weakReference = this.f364502J;
        return (weakReference == null || (activity = (android.app.Activity) weakReference.get()) == null) ? B1() : activity;
    }

    @Override // lc3.s
    public void E0(org.json.JSONObject data, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        gq0.v vVar = this.B;
        if (vVar != null) {
            vVar.og(data, callback);
        }
    }

    @Override // lc3.s
    public jc3.m F0(java.lang.String containerTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerTag, "containerTag");
        gq0.v vVar = this.B;
        if (vVar == null) {
            return null;
        }
        jc3.m xc6 = vVar.xc(containerTag);
        return xc6 == null ? new tp0.l() : xc6;
    }

    public void N1(iq0.e eVar, android.view.ViewGroup containerView, java.lang.String frameSetName, java.lang.String frameSetData, int i17, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        if (eVar == null) {
            eVar = this.f364503x.f375196i;
        }
        iq0.e eVar2 = eVar;
        java.lang.String str = this.f364504y;
        if (eVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "bindFrameSetView rootConfig nil");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "bindFrameSetView rootPath:" + eVar2.f375190a + " frameSetName:" + frameSetName);
        d75.b.g(new hq0.q(this, eVar2, frameSetName, containerView, false, lVar, i17, frameSetData));
    }

    @Override // hq0.i0
    public java.lang.String O0() {
        return this.f364503x.f375167a;
    }

    public void O1(java.lang.String event, java.util.HashMap hashMap, yz5.q callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        gq0.v vVar = (gq0.v) this.f364503x.f375171e;
        if (vVar != null) {
            vVar.ca(event, hashMap, callback);
        }
    }

    public final void Q1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "initBiz");
        d75.b.g(new hq0.l(this));
        this.L = new hq0.n(this);
    }

    public final void R1(iq0.e eVar, boolean z17) {
        java.lang.String str = "innerCreateFrameSetRoot path:" + eVar.f375190a;
        java.lang.String str2 = this.f364504y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.C;
        if (concurrentHashMap.get(eVar.a()) == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            concurrentHashMap.put(eVar.a(), Y0(this, context, this.f364503x.f375167a, eVar.f375190a, eVar.f375191b, false, z17));
            if (eVar.f375192c != 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "innerCreateFrameSetRoot, create cache reporter");
                java.lang.String rootConfigId = eVar.a();
                java.lang.String frameSetRootId = eVar.a();
                mq0.l0 l0Var = this.E;
                l0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootConfigId, "rootConfigId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetRootId, "frameSetRootId");
                l0Var.f412117b.put(rootConfigId, new mq0.k0(frameSetRootId, 0L, 0L, 0L, 0.0d, null, 0L, 0L, 0L, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46404xa5f7fd74, null));
            }
        }
    }

    @Override // jc3.i0
    public void S(jc3.l0 listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ((java.util.HashSet) this.A).add(listener);
    }

    public final void U1(java.lang.String rootConfigId) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        hq0.e0 e0Var = (hq0.e0) this.C.get(rootConfigId);
        if (e0Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("innerDestroyFrameSetRoot id:");
            java.lang.String str = e0Var.f364517e;
            sb6.append(str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, sb6.toString());
            F1(str);
            mq0.l0 l0Var = this.E;
            l0Var.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootConfigId, "rootConfigId");
            mq0.k0 k0Var = (mq0.k0) l0Var.f412117b.get(rootConfigId);
            if (k0Var != null) {
                if (0 == k0Var.f412114i) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardFrameSetCacheReporter", "exit scene, but start time not found");
                    k0Var.f412115j = 0L;
                } else {
                    k0Var.f412115j = java.lang.System.currentTimeMillis() - k0Var.f412114i;
                }
            }
            l0Var.getClass();
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = l0Var.f412117b;
            mq0.k0 k0Var2 = (mq0.k0) concurrentHashMap2.get(rootConfigId);
            if (k0Var2 != null) {
                long j17 = k0Var2.f412107b;
                if (j17 != 0) {
                    long j18 = k0Var2.f412112g;
                    if (j18 != 0) {
                        long j19 = k0Var2.f412113h;
                        if (j19 != 0) {
                            long j27 = k0Var2.f412108c;
                            long j28 = k0Var2.f412109d;
                            long j29 = (j17 - j27) - j28;
                            double d17 = j17;
                            double d18 = j27 / d17;
                            double d19 = j28 / d17;
                            concurrentHashMap = concurrentHashMap2;
                            double d27 = j29 / d17;
                            double d28 = j19 - j18;
                            double d29 = j19;
                            double d37 = d28 / d29;
                            double d38 = k0Var2.f412110e;
                            double d39 = d38 / j18;
                            double d47 = d38 / d29;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("report, missRate: %.2f, hitRate: %.2f, avgRenderTime: %.2f, avgPerfRenderTime: %.2f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(d18), java.lang.Double.valueOf(d19), java.lang.Double.valueOf(d39), java.lang.Double.valueOf(d47)}, 4)), "format(...)");
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("num_totalCache", k0Var2.f412107b);
                            jSONObject.put("num_hitCache", k0Var2.f412109d);
                            jSONObject.put("num_missCache", k0Var2.f412108c);
                            jSONObject.put("num_natureMissCache", j29);
                            jSONObject.put("rate_hit", d19);
                            jSONObject.put("rate_miss", d18);
                            jSONObject.put("rate_natureMiss", d27);
                            jSONObject.put("num_expose", k0Var2.f412113h);
                            jSONObject.put("num_render", k0Var2.f412112g);
                            jSONObject.put("rate_cache", d37);
                            jSONObject.put("avg_renderTime", d39);
                            jSONObject.put("avg_perfRenderTime", d47);
                            jSONObject.put("time_sceneActive", k0Var2.f412115j);
                            jSONObject.toString();
                            ((je3.i) i95.n0.c(je3.i.class)).qa(k0Var2.f412106a + '-' + java.lang.System.currentTimeMillis(), l0Var.f412116a, k0Var2.f412106a, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16454xc40f4d3c.f37600xe882f0ad, 0L, kz5.p0.f395529d, jSONObject);
                            concurrentHashMap.remove(rootConfigId);
                        }
                    }
                }
            }
            concurrentHashMap = concurrentHashMap2;
            concurrentHashMap.remove(rootConfigId);
        }
    }

    @Override // jc3.i0
    public synchronized void V(android.app.Activity activity) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "activeBiz activity:" + activity);
        this.f364502J = new java.lang.ref.WeakReference(activity);
        a2(false);
        H1(true);
        this.Q = true;
    }

    public void Y1(iq0.e eVar, java.lang.String frameSetName, java.lang.String frameSetData, android.graphics.Rect containerRect, hq0.m0 preloadStrategy) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetData, "frameSetData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerRect, "containerRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadStrategy, "preloadStrategy");
        iq0.g gVar = this.f364503x;
        if (eVar == null) {
            eVar = gVar.f375196i;
        }
        iq0.e eVar2 = eVar;
        java.lang.String str = this.f364504y;
        if (eVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "preload rootConfig nil");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "preload rootPath:" + eVar2.f375190a + " frameSetName:" + frameSetName + " preloadStrategy:" + preloadStrategy);
        if (preloadStrategy.ordinal() != 3) {
            return;
        }
        if (((qq0.m) ((qq0.i) i95.n0.c(qq0.i.class))).Bi(gVar.f375167a)) {
            d75.b.g(new hq0.s(this, frameSetName, frameSetData, containerRect, eVar2));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "not support preload, bizName: " + gVar.f375167a);
    }

    public final void Z1(mq0.z zVar, boolean z17) {
        java.lang.String str;
        try {
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            java.util.List<java.lang.String> list = z17 ? this.N : kz5.p0.f395529d;
            java.lang.String bizName = this.f364503x.f375167a;
            int i17 = mq0.c0.T0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
            java.lang.String str2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "MagicAdMiniProgram") ? "RewardAd" : "";
            if (list.isEmpty()) {
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, zVar, bizName, str2, "", "", mq0.a0.f412065e, null, null, 192, null);
                    return;
                }
                return;
            }
            for (java.lang.String frameSetName : list) {
                int i18 = mq0.c0.T0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
                if (frameSetName.length() == 0) {
                    str = "";
                } else {
                    java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                    str = f07.size() >= 3 ? (java.lang.String) f07.get(1) : frameSetName;
                }
                if (c0Var != null) {
                    mq0.c0.Xa(c0Var, zVar, bizName, str2, str, frameSetName, mq0.a0.f412065e, null, null, 192, null);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "report " + zVar.f412184d + " full-link failed", e17);
        }
    }

    public final void a2(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "startImpl mb: " + this.f364528g + ", isPreload: " + z17);
        d75.b.g(new hq0.z(this, z17));
    }

    @Override // hq0.i0, jc3.u
    public void b1() {
        java.lang.String str;
        java.lang.String str2;
        boolean mo40975xf7b3660d = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "onConnException foreground: " + mo40975xf7b3660d);
        gq0.v vVar = this.B;
        java.util.List V2 = vVar != null ? vVar.V2() : null;
        if (V2 == null) {
            V2 = kz5.p0.f395529d;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : V2) {
            if (((gq0.u) obj).f356022b) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((gq0.u) it.next()).f356021a);
        }
        this.N = arrayList2;
        this.P = false;
        try {
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            java.lang.String bizName = this.f364503x.f375167a;
            int i17 = mq0.c0.T0;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
            java.lang.String str3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "MagicAdMiniProgram") ? "RewardAd" : "";
            if (!arrayList2.isEmpty()) {
                for (java.lang.String frameSetName : arrayList2) {
                    int i18 = mq0.c0.T0;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
                    if (frameSetName.length() == 0) {
                        str = "";
                    } else {
                        java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                        str = f07.size() >= 3 ? (java.lang.String) f07.get(1) : frameSetName;
                    }
                    if (c0Var != null) {
                        str2 = bizName;
                        mq0.c0.Xa(c0Var, mq0.z.f412172m, bizName, str3, str, frameSetName, mq0.a0.f412065e, null, kz5.b1.e(new jz5.l("isFg", java.lang.Boolean.valueOf(mo40975xf7b3660d))), 64, null);
                    } else {
                        str2 = bizName;
                    }
                    bizName = str2;
                }
            } else if (c0Var != null) {
                mq0.c0.Xa(c0Var, mq0.z.f412172m, bizName, str3, "", "", mq0.a0.f412065e, null, kz5.b1.e(new jz5.l("isFg", java.lang.Boolean.valueOf(mo40975xf7b3660d))), 64, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "report ConnException full-link failed", e17);
        }
        je3.i iVar = (je3.i) i95.n0.c(je3.i.class);
        if (iVar != null) {
            je3.j.a(iVar, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16452xe7b8a75f.f37568x98ffc761, this.f364503x.f375167a, kz5.b1.e(new jz5.l("isFg", java.lang.Boolean.valueOf(mo40975xf7b3660d))));
        }
        java.util.Iterator it6 = this.A.iterator();
        while (it6.hasNext()) {
            ((jc3.l0) it6.next()).b1();
        }
        super.b1();
        if (!mo40975xf7b3660d) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b c4683x847dbe1b = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495;
            c4683x847dbe1b.mo40976xa01141ab(this.U);
            c4683x847dbe1b.mo40973x40b15f2e(this.U);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "connect exception");
            yz5.a aVar = this.L;
            if (aVar != null) {
                ((hq0.n) aVar).mo152xb9724478();
            }
        }
    }

    @Override // hq0.i0, jc3.g0
    public void c(int i17, boolean z17) {
        java.lang.String str;
        super.c(i17, z17);
        fq0.x S0 = S0(i17);
        if (S0 != null) {
            i95.m c17 = i95.n0.c(mq0.d0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            mq0.d0 d0Var = (mq0.d0) c17;
            java.lang.String str2 = this.f364503x.f375167a;
            hq0.e0 e0Var = S0.f347012c;
            ((mq0.s0) d0Var).Ai(str2, (e0Var == null || (str = e0Var.f364515c) == null) ? "" : str, S0.f347011b, mq0.a.f412049h, true, S0.f347010a, kz5.q0.f395534d);
            if (e0Var != null) {
                java.lang.String query = (12 & 2) == 0 ? e0Var.f364516d : "";
                java.lang.String rootConfigId = e0Var.f364515c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootConfigId, "path");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
                if (!(query.length() == 0)) {
                    rootConfigId = rootConfigId + '-' + query;
                }
                mq0.l0 l0Var = this.E;
                l0Var.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootConfigId, "rootConfigId");
                java.lang.String frameSetId = S0.f347011b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetId, "frameSetId");
                mq0.k0 k0Var = (mq0.k0) l0Var.f412117b.get(rootConfigId);
                if (k0Var != null) {
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = k0Var.f412111f;
                    java.lang.Long l17 = (java.lang.Long) concurrentHashMap.get(frameSetId);
                    if (l17 != null) {
                        long currentTimeMillis = java.lang.System.currentTimeMillis() - l17.longValue();
                        k0Var.f412110e += currentTimeMillis;
                        concurrentHashMap.remove(frameSetId);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(java.lang.String.format("record frameSet render time: %d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Long.valueOf(currentTimeMillis)}, 1)), "format(...)");
                    }
                }
            }
        }
    }

    @Override // jc3.i0
    /* renamed from: deactivate */
    public synchronized void mo133869x88fbd074() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "deactiveBiz");
        H1(false);
    }

    @Override // hq0.i0
    /* renamed from: destroy */
    public synchronized void mo123041x5cd39ffa() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "destroy");
        if (this.f364538t && !this.M) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "isBizActive destroy return");
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40976xa01141ab(this.U);
        super.mo123041x5cd39ffa();
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.S;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.S = null;
        this.Q = false;
        this.H = false;
        this.I = false;
        java.util.Iterator it = ((java.util.HashSet) this.A).iterator();
        while (it.hasNext()) {
            ((jc3.l0) it.next()).mo252xac79a11b();
        }
        this.B = null;
        this.f364502J = null;
        this.C.clear();
        for (java.util.Map.Entry entry : this.D.entrySet()) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(entry);
            java.lang.String str = (java.lang.String) entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            d75.b.g(new hq0.t(this, str));
        }
        this.D.clear();
        this.E.f412117b.clear();
        this.F.clear();
        ((java.util.HashSet) this.A).clear();
        this.N = kz5.p0.f395529d;
        this.P = false;
    }

    @Override // jc3.i0
    public void l(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "notifyJsEvent");
        G1(event.f229414d, event.f229415e);
    }

    @Override // hq0.i0, jc3.u
    public void n() {
        super.n();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "onMainScriptInjected");
        try {
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            if (c0Var != null) {
                mq0.z zVar = mq0.z.f412171i;
                java.lang.String bizName = this.f364503x.f375167a;
                int i17 = mq0.c0.T0;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
                mq0.c0.Xa(c0Var, zVar, bizName, p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bizName, "MagicAdMiniProgram") ? "RewardAd" : "", null, null, mq0.a0.f412065e, null, null, 216, null);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBADFullLinkReporter", "report BizCreated full-link failed", e17);
        }
        gq0.v vVar = this.B;
        if (vVar != null) {
            vVar.n();
        }
    }

    @Override // hq0.i0, jc3.u
    /* renamed from: onDestroy */
    public void mo123043xac79a11b(int i17) {
        super.mo123043xac79a11b(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "onDestroy");
    }

    @Override // jc3.i0
    /* renamed from: pause */
    public void mo133870x65825f6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "pauseBiz");
        java.util.Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            ((hq0.e0) it.next()).f();
        }
        kc3.f fVar = this.f364537s;
        if (fVar != null) {
            ym5.a1.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o5((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.s5) fVar));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("autoPauseExt");
            throw null;
        }
    }

    @Override // jc3.i0
    /* renamed from: resume */
    public void mo133871xc84dc82d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f364504y, "resumeBiz");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m133876xb5887064(), "resume");
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).A();
        }
        java.util.Iterator it = this.C.values().iterator();
        while (it.hasNext()) {
            ((hq0.e0) it.next()).j();
        }
    }

    @Override // hq0.i0
    public void s1(hq0.e0 root, fq0.x frameSet, java.lang.String info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSet, "frameSet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        java.lang.String concat = "onBind: info is ".concat(info);
        java.lang.String str = this.f364504y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, concat);
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d c10867x3e50a04d = frameSet.f347021l;
        if (c10867x3e50a04d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "sclView empty, addCustomView error");
        } else if (frameSet.f347025p == 0) {
            int C0 = C0(c10867x3e50a04d);
            frameSet.f347025p = C0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "viewId is assigned:" + C0);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "viewId is already assigned:" + frameSet.f347025p);
        }
        super.s1(root, frameSet, info);
    }

    @Override // jc3.i0
    public void t0(java.lang.String script, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(script, "script");
        boolean a17 = z65.c.a();
        java.lang.String str = this.f364504y;
        if (!a17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "testEvaluateMBJs blocked, not in debug environment");
            if (lVar != null) {
                lVar.mo146xb9724478("not in debug environment");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "testEvaluateMBJs, ".concat(script));
        jc3.j0 j0Var = this.f364528g;
        if (j0Var != null) {
            ((rc3.w0) j0Var).l(script, lVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "testEvaluateMBJs, but MB is null");
        if (lVar != null) {
            lVar.mo146xb9724478("mb is null");
        }
    }
}
