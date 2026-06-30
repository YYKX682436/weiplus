package ni3;

/* loaded from: classes10.dex */
public final class a1 {

    /* renamed from: b, reason: collision with root package name */
    public fc2.c f419059b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa f419060c;

    /* renamed from: e, reason: collision with root package name */
    public int f419062e;

    /* renamed from: f, reason: collision with root package name */
    public int f419063f;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16563x42f47ab3 f419070m;

    /* renamed from: n, reason: collision with root package name */
    public final ni3.z0 f419071n;

    /* renamed from: o, reason: collision with root package name */
    public final ni3.x0 f419072o;

    /* renamed from: a, reason: collision with root package name */
    public final ni3.o1 f419058a = new ni3.o1();

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f419061d = "";

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f419064g = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f419065h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f419066i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: j, reason: collision with root package name */
    public final ni3.b1 f419067j = new ni3.b1();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f419068k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: l, reason: collision with root package name */
    public final ni3.w0 f419069l = new ni3.w0(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.monitor.FinderStreamVideoLoadStrategyMonitor$finderCdnTaskEvent$1] */
    public a1() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f419070m = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce>(a0Var) { // from class: com.tencent.mm.plugin.monitor.FinderStreamVideoLoadStrategyMonitor$finderCdnTaskEvent$1
            {
                this.f39173x3fe91575 = 977534942;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce c5450xd3fbf9ce) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5450xd3fbf9ce event = c5450xd3fbf9ce;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.na naVar = event.f135790g;
                if (naVar.f88947a == 1) {
                    dn.o oVar = naVar.f88948b;
                    boolean z17 = oVar instanceof cs2.l;
                    ni3.a1 a1Var = ni3.a1.this;
                    if (z17) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.preload.video.VideoOnlinePlayCdnTask");
                        cs2.l lVar = (cs2.l) oVar;
                        a1Var.getClass();
                        ni3.p0 f17 = a1Var.f(lVar.f303610d2);
                        if (f17 != null) {
                            ni3.o0 o0Var = f17.f419204b;
                            int i17 = lVar.f303611e2;
                            o0Var.f419183d = i17;
                            so2.j5 j5Var = f17.f419203a;
                            o0Var.a(hc2.b0.h(j5Var, false, 1, null));
                            java.lang.String videoFlag = lVar.X1;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(videoFlag, "videoFlag");
                            o0Var.f419185f = videoFlag;
                            ni3.r0 r0Var = f17.f419205c;
                            java.lang.String field_mediaId = lVar.f69601xaca5bdda;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                            r0Var.getClass();
                            r0Var.f419252a = field_mediaId;
                            ni3.r0 r0Var2 = f17.f419205c;
                            java.lang.String field_fullpath = lVar.f69595x6d25b0d9;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath, "field_fullpath");
                            r0Var2.getClass();
                            r0Var2.f419253b = field_fullpath;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", "onOnlinePlayTaskCreate ".concat(a1Var.e(i17, j5Var)));
                        }
                    } else if (oVar instanceof cs2.p) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(oVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.preload.video.VideoPreloadCdnTask");
                        cs2.p pVar = (cs2.p) oVar;
                        a1Var.getClass();
                        ni3.p0 f18 = a1Var.f(pVar.f303622f2);
                        if (f18 != null) {
                            int i18 = pVar.f303627k2;
                            ni3.o0 o0Var2 = f18.f419204b;
                            o0Var2.f419183d = i18;
                            so2.j5 j5Var2 = f18.f419203a;
                            o0Var2.a(hc2.b0.h(j5Var2, false, 1, null));
                            o0Var2.f419185f = pVar.f303621e2.g();
                            ni3.r0 r0Var3 = f18.f419205c;
                            r0Var3.getClass();
                            java.lang.String str = pVar.f303625i2;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
                            r0Var3.f419252a = str;
                            ni3.r0 r0Var4 = f18.f419205c;
                            java.lang.String field_fullpath2 = pVar.f69595x6d25b0d9;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_fullpath2, "field_fullpath");
                            r0Var4.getClass();
                            r0Var4.f419253b = field_fullpath2;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", "onPreloadTaskCreate " + a1Var.e(pVar.f303627k2, j5Var2) + ' ' + pVar);
                        }
                    }
                }
                return false;
            }
        };
        this.f419071n = new ni3.z0(this);
        this.f419072o = new ni3.x0(this);
    }

    public static final ni3.n0 a(ni3.a1 a1Var, int i17) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = a1Var.f419068k;
        ni3.n0 n0Var = (ni3.n0) concurrentHashMap.get(valueOf);
        if (n0Var != null) {
            return n0Var;
        }
        ni3.n0 n0Var2 = new ni3.n0(i17, 0L, 0L, 0);
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), n0Var2);
        return n0Var2;
    }

    public final java.lang.String b(int i17, int i18) {
        java.lang.String format = java.lang.String.format("%.2f%% [" + i17 + '/' + i18 + ']', java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf((i17 / i18) * 100)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }

    public final java.util.Map c(java.util.Map map, java.util.Map map2) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            long longValue = ((java.lang.Number) entry.getKey()).longValue();
            ni3.p0 p0Var = (ni3.p0) entry.getValue();
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(map2.get(java.lang.Long.valueOf(longValue)), p0Var)) {
                concurrentHashMap.put(java.lang.Long.valueOf(longValue), p0Var);
            }
        }
        return concurrentHashMap;
    }

    public final java.lang.String d(int i17, cw2.wa waVar) {
        if (waVar != null) {
            java.lang.String str = i17 + '.' + hc2.b0.k(waVar.f305632f.getDescription(), 0, 0, 3, null) + '.' + waVar.f305631e.g();
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public final java.lang.String e(int i17, so2.j5 j5Var) {
        java.lang.String d17;
        return (j5Var == null || (d17 = hc2.b0.d(j5Var, i17)) == null) ? "" : d17;
    }

    public final ni3.p0 f(long j17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa = this.f419060c;
        if (c13920xa5f564aa == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(ya.b.f77502x92235c1b);
            throw null;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f419064g;
        i("getFeedLife", c13920xa5f564aa, concurrentHashMap);
        return (ni3.p0) concurrentHashMap.get(java.lang.Long.valueOf(j17));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(kw2.d0 r17) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ni3.a1.g(kw2.d0):void");
    }

    public final java.lang.String h(java.lang.String str, java.util.Map map, java.util.Map map2) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str);
        sb6.append((char) 65306);
        sb6.append(b(map.size(), map2.size()));
        sb6.append(' ');
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(((ni3.p0) ((java.util.Map.Entry) it.next()).getValue()).m149667x9616526c());
        }
        sb6.append(kz5.n0.g0(arrayList, " ", null, null, 0, null, null, 62, null));
        sb6.append(" \n");
        return sb6.toString();
    }

    public final void i(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa c13920xa5f564aa, java.util.concurrent.ConcurrentHashMap concurrentHashMap) {
        long j17;
        if (c13920xa5f564aa.size() != concurrentHashMap.size() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("syncSourceList2SourceLife begin ");
            sb6.append(str);
            sb6.append(' ');
            sb6.append(c13920xa5f564aa.size());
            java.lang.String str2 = " --> ";
            sb6.append(" --> ");
            sb6.append(concurrentHashMap.size());
            sb6.append(' ');
            sb6.append(this);
            java.lang.String str3 = "FinderStreamVideoLoadStrategyMonitor";
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStreamVideoLoadStrategyMonitor", sb6.toString());
            java.util.Iterator it = c13920xa5f564aa.iterator();
            while (it.hasNext()) {
                so2.j5 j5Var = (so2.j5) it.next();
                if (!concurrentHashMap.containsKey(java.lang.Long.valueOf(j5Var.mo2128x1ed62e84()))) {
                    java.lang.Long valueOf = java.lang.Long.valueOf(j5Var.mo2128x1ed62e84());
                    java.util.Iterator it6 = it;
                    ni3.o0 o0Var = new ni3.o0(this.f419061d, this.f419062e, this.f419063f, c13920xa5f564aa.indexOf(j5Var), hc2.b0.h(j5Var, false, 1, null), "NIL-SPEC", "");
                    ni3.r0 r0Var = new ni3.r0("", "", false, -1L, -1L, -1L, -1L, -1L, -1L, -1L);
                    if (j5Var instanceof so2.u1) {
                        r45.hl2 m76756xf0f8a852 = ((so2.u1) j5Var).getFeedObject().getFeedObject().m76756xf0f8a852();
                        j17 = m76756xf0f8a852 != null ? m76756xf0f8a852.m75942xfb822ef2(0) : c01.id.c();
                    } else {
                        j17 = -1;
                    }
                    concurrentHashMap.put(valueOf, new ni3.p0(j5Var, o0Var, r0Var, new ni3.q0(j17, -1L, -1L, -1L, 0L), false, false, new ni3.s0(false, false, -1, new ni3.t0(0L, 0)), new ni3.s0(false, false, -1, new ni3.t0(0L, 0)), new ni3.s0(false, false, -1, new ni3.t0(0L, 0))));
                    str2 = str2;
                    str3 = str3;
                    it = it6;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "syncSourceList2SourceLife end " + str + ' ' + c13920xa5f564aa.size() + str2 + concurrentHashMap.size() + ' ' + this);
        }
    }
}
