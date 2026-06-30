package xc2;

/* loaded from: classes2.dex */
public final class k0 extends pf5.o0 {
    public static long A;

    /* renamed from: z */
    public static int f534707z;

    /* renamed from: f */
    public p3325xe03a0797.p3326xc267989b.r2 f534709f;

    /* renamed from: g */
    public yz5.a f534710g;

    /* renamed from: y */
    public static final xc2.u f534706y = new xc2.u(null);
    public static final java.util.Map B = kz5.c1.k(new jz5.l(33, 1), new jz5.l(59, 60), new jz5.l(22, 9), new jz5.l(26, 27), new jz5.l(81, 96), new jz5.l(35, 2), new jz5.l(24, 21), new jz5.l(138, java.lang.Integer.valueOf(bd1.f.f4202x366c91de)));

    /* renamed from: e */
    public final zc2.a f534708e = new zc2.a(new xc2.d0(this));

    /* renamed from: h */
    public final java.util.concurrent.ConcurrentHashMap f534711h = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: i */
    public final java.util.concurrent.ConcurrentHashMap f534712i = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: m */
    public final java.util.concurrent.ConcurrentHashMap f534713m = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: n */
    public final java.util.concurrent.ConcurrentHashMap f534714n = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: o */
    public final java.util.concurrent.ConcurrentHashMap f534715o = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: p */
    public final java.util.concurrent.ConcurrentHashMap f534716p = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: q */
    public final java.util.concurrent.ConcurrentHashMap f534717q = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: r */
    public final java.util.concurrent.ConcurrentHashMap f534718r = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: s */
    public final java.util.concurrent.ConcurrentHashMap f534719s = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: t */
    public final java.util.concurrent.ConcurrentHashMap f534720t = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: u */
    public final java.util.concurrent.ConcurrentHashMap f534721u = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: v */
    public final java.util.concurrent.ConcurrentHashMap f534722v = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: w */
    public final java.util.concurrent.ConcurrentHashMap f534723w = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: x */
    public final java.util.Set f534724x = new java.util.LinkedHashSet();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:30:0x0124. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void N6(xc2.k0 r32, java.util.List r33, java.util.HashMap r34) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.k0.N6(xc2.k0, java.util.List, java.util.HashMap):void");
    }

    public static final void O6(xc2.k0 k0Var, int i17, int i18, java.lang.String str, java.util.List list, java.lang.String str2) {
        java.util.ArrayList arrayList;
        k0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[request] scene=");
        sb6.append(i17);
        sb6.append(" commentScene=");
        sb6.append(i18);
        sb6.append(" feedId=");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(str2);
        sb6.append('=');
        if (list != null) {
            arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) it.next();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("jump_id=");
                sb7.append(c19786x6a1e2862.m76501xf2fd2296());
                sb7.append("#jump_type=");
                sb7.append(c19786x6a1e2862.m76503x92bc3c07());
                sb7.append("#business_type=");
                sb7.append(c19786x6a1e2862.m76480xe2ee1ca3());
                sb7.append("#wording=");
                sb7.append(c19786x6a1e2862.m76523x98b23862());
                sb7.append("#style=");
                java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(m76521x7528c3fb, 10));
                for (r45.wf6 wf6Var : m76521x7528c3fb) {
                    arrayList2.add("pos=" + wf6Var.m75939xb282bd08(1) + "#style=" + wf6Var.m75939xb282bd08(2) + "#screen=" + wf6Var.m75939xb282bd08(0));
                }
                sb7.append(arrayList2);
                arrayList.add(sb7.toString());
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedGlobalJumperUIC", sb6.toString());
    }

    public static void e7(xc2.k0 k0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed, int i17, r45.qt2 qt2Var, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.tj2 tj2Var, int i19, java.lang.Object obj) {
        r45.qt2 qt2Var2 = (i19 & 4) != 0 ? null : qt2Var;
        int i27 = (i19 & 8) != 0 ? 0 : i18;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = (i19 & 16) != 0 ? null : gVar;
        r45.tj2 tj2Var2 = (i19 & 32) != 0 ? null : tj2Var;
        k0Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        k0Var.d7(kz5.b0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(feed, 0)), i17, qt2Var2, i27, gVar2, tj2Var2);
    }

    public static /* synthetic */ void f7(xc2.k0 k0Var, java.util.List list, int i17, r45.qt2 qt2Var, int i18, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, r45.tj2 tj2Var, int i19, java.lang.Object obj) {
        k0Var.d7(list, i17, (i19 & 4) != 0 ? null : qt2Var, (i19 & 8) != 0 ? 0 : i18, (i19 & 16) != 0 ? null : gVar, (i19 & 32) != 0 ? null : tj2Var);
    }

    public final void P6(java.util.HashMap hashMap, int i17, java.util.LinkedList linkedList) {
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.K0().r()).booleanValue()) {
            kz5.g0.t(linkedList, new xc2.w(new xc2.v(i17), i17));
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.LinkedList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.LinkedList) obj).addAll(linkedList);
    }

    public final p012xc85e97e9.p093xedfae76a.j0 Q6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534719s;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 R6(long j17, int i17, java.lang.String str) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534721u;
        java.lang.String a17 = f534706y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a17, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 S6(long j17, long j18, int i17, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534712i;
        java.lang.Integer num = (java.lang.Integer) B.get(java.lang.Integer.valueOf(i17));
        int intValue = num != null ? num.intValue() : 0;
        if (intValue > 0) {
            i17 = intValue;
        }
        java.lang.String str2 = j17 + '#' + str + '#' + j18 + '#' + i17;
        java.lang.Object obj = concurrentHashMap.get(str2);
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            obj = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.La).mo141623x754a37bb()).r()).booleanValue() ? new xc2.e3() : new p012xc85e97e9.p093xedfae76a.j0();
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(str2, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 T6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534718r;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 U6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534714n;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 V6(long j17, int i17, java.lang.String str) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534720t;
        java.lang.String a17 = f534706y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a17, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 W6(long j17, int i17, java.lang.String str) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534711h;
        java.lang.String a17 = f534706y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            obj = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.La).mo141623x754a37bb()).r()).booleanValue() ? new xc2.e3() : new p012xc85e97e9.p093xedfae76a.j0();
            java.lang.Object putIfAbsent = concurrentHashMap.putIfAbsent(a17, obj);
            if (putIfAbsent != null) {
                obj = putIfAbsent;
            }
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 X6(android.content.Context context, long j17, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (j17 != 0 && i17 != 0) {
            if (context instanceof p012xc85e97e9.p093xedfae76a.y) {
            }
            java.util.Set set = (java.util.Set) W6(j17, i17, str).mo3195x754a37bb();
            if (set != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : set) {
                    int i18 = ((xc2.t) obj).f534834c;
                    if (i18 == 6 || i18 == 7) {
                        arrayList.add(obj);
                    }
                }
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    for (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 : ((xc2.t) it.next()).f534835d) {
                        if (c19786x6a1e2862.m76480xe2ee1ca3() == 21 || c19786x6a1e2862.m76480xe2ee1ca3() == 61) {
                            return c19786x6a1e2862;
                        }
                    }
                }
            }
        }
        return null;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 Y6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534715o;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 Z6(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534723w;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 a7(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534717q;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 b7(long j17, int i17, java.lang.String str) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534722v;
        java.lang.String a17 = f534706y.a(j17, i17, str);
        java.lang.Object obj = concurrentHashMap.get(a17);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(a17, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    public final p012xc85e97e9.p093xedfae76a.j0 c7(long j17) {
        java.lang.Object putIfAbsent;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f534713m;
        java.lang.Long valueOf = java.lang.Long.valueOf(j17);
        java.lang.Object obj = concurrentHashMap.get(valueOf);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(valueOf, (obj = new p012xc85e97e9.p093xedfae76a.j0()))) != null) {
            obj = putIfAbsent;
        }
        return (p012xc85e97e9.p093xedfae76a.j0) obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00fb, code lost:
    
        if (r0 == null) goto L107;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d7(java.util.List r20, int r21, r45.qt2 r22, int r23, com.p314xaae8f345.mm.p2495xc50a8b8b.g r24, r45.tj2 r25) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.k0.d7(java.util.List, int, r45.qt2, int, com.tencent.mm.protobuf.g, r45.tj2):void");
    }

    public final void g7(java.util.List list, int i17) {
        if (list == null || list.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList.add(feedObject);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079) next;
            long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
            zc2.a aVar = this.f534708e;
            zc2.b bVar = (zc2.b) aVar.f552938b.get(java.lang.Long.valueOf(m59251x5db1b11));
            long j17 = (bVar == null || bVar.f552940b == 1) ? 0L : bVar.f552939a;
            boolean z17 = j17 != 0 && c01.id.a() - j17 > 30000;
            if (z17) {
                zc2.b bVar2 = (zc2.b) aVar.f552938b.get(java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()));
                if (bVar2 != null) {
                    bVar2.f552940b = 1;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedGlobalJumperUIC", "requestFeedsByCacheFilter refreshTime:" + j17 + " delta:" + (c01.id.a() - j17) + " isRefresh:" + z17);
            if (z17) {
                arrayList2.add(next);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedGlobalJumperUIC", "requestFeedsByCacheFilter: size:" + arrayList2.size());
        if (!arrayList2.isEmpty()) {
            f7(this, arrayList2, i17, null, 0, null, null, 60, null);
        }
    }

    public final void h7(java.util.List list, int i17) {
        if (list == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            so2.j5 j5Var = (so2.j5) it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getFeedObject() : null;
            if (feedObject != null) {
                arrayList.add(feedObject);
            }
        }
        f7(this, arrayList, i17, null, 0, null, null, 60, null);
    }

    public final void i7(ec2.a event, r45.qt2 qt2Var) {
        r45.mr2 mr2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = event.f332482g;
        if (c14994x9b99c079 == null) {
            return;
        }
        java.util.Set set = this.f534724x;
        if (set.contains(java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()))) {
            return;
        }
        java.util.concurrent.ConcurrentSkipListSet concurrentSkipListSet = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc.f216822z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db dbVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.nc.D.get(java.lang.Integer.valueOf(event.f332479d));
        if (dbVar == null) {
            dbVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db.f215649z;
        }
        int i17 = dbVar.f215650d;
        r45.dm2 m76806xdef68064 = c14994x9b99c079.getFeedObject().m76806xdef68064();
        boolean z17 = false;
        java.util.LinkedList m75941xfb821914 = (m76806xdef68064 == null || (mr2Var = (r45.mr2) m76806xdef68064.m75936x14adae67(61)) == null) ? null : mr2Var.m75941xfb821914(0);
        if (m75941xfb821914 != null && m75941xfb821914.contains(java.lang.Integer.valueOf(i17))) {
            z17 = true;
        }
        if (z17) {
            p012xc85e97e9.p093xedfae76a.j0 a76 = ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).a7(c14994x9b99c079.m59251x5db1b11());
            if (a76.mo3195x754a37bb() != null) {
                return;
            }
            set.add(java.lang.Long.valueOf(c14994x9b99c079.m59251x5db1b11()));
            i95.m c17 = i95.n0.c(cq.k.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pm0.v.T(new bq.k0(c14994x9b99c079.m59251x5db1b11(), c14994x9b99c079.m59229xb5af1dd5(), i17, qt2Var).l(), new cq.z0(new xc2.i0(c14994x9b99c079, a76, this), new xc2.j0(this, c14994x9b99c079)));
        }
    }
}
