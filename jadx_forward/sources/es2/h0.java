package es2;

/* loaded from: classes2.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final yr2.k f337901a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f337902b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f337903c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f337904d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f337905e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f337906f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f337907g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f337908h;

    /* renamed from: i, reason: collision with root package name */
    public final es2.g0 f337909i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f337910j;

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f337911k;

    public h0(yr2.k model, java.lang.String sceneTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneTag, "sceneTag");
        this.f337901a = model;
        this.f337902b = new java.util.concurrent.locks.ReentrantLock();
        this.f337904d = new java.util.HashMap();
        this.f337905e = new java.util.LinkedList();
        this.f337906f = "";
        this.f337907g = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f337908h = "FVPW2_" + sceneTag + '_' + hashCode();
        this.f337909i = new es2.g0(this);
        this.f337910j = new java.util.concurrent.atomic.AtomicInteger();
        this.f337911k = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final so2.j5 d(so2.j5 j5Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        if (j5Var.h() == 4) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var : null;
            boolean z17 = false;
            if (abstractC14490x69736cb5 != null && (feedObject = abstractC14490x69736cb5.getFeedObject()) != null && feedObject.m59347x965c8f17()) {
                z17 = true;
            }
            if (z17 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var).getNeedToPreload()) {
                return j5Var;
            }
        }
        return null;
    }

    public final cs2.p a(java.lang.String str, boolean z17, java.lang.String str2) {
        return (cs2.p) j("cancel", new es2.u(this, str, z17, str2));
    }

    public final int b(cs2.p pVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock;
        java.util.concurrent.locks.ReentrantLock reentrantLock2 = this.f337902b;
        reentrantLock2.lock();
        try {
            boolean z17 = this.f337903c;
            java.lang.String str = "";
            es2.g0 g0Var = this.f337909i;
            java.lang.String str2 = this.f337908h;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[enqueue] VideoPreloadWorker has release. " + pVar + " just return.");
                java.lang.String m75945x2fec8307 = pVar.f303621e2.f411535e.m75945x2fec8307(9);
                if (m75945x2fec8307 != null) {
                    str = m75945x2fec8307;
                }
                g0Var.h(str, pVar);
                reentrantLock2.unlock();
                return -1;
            }
            cu2.x xVar = cu2.x.f303982a;
            so2.i3 c17 = cu2.x.c(xVar, pVar.f303625i2, false, false, false, 14, null);
            es2.g0 g0Var2 = this.f337909i;
            java.lang.String field_mediaId = c17.f68981xaca5bdda;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
            g0Var2.g(field_mediaId, c17.w0(), pVar.V1, pVar.k(), pVar.f69610x4f5245a8 == 1 ? "H264" : "H265", pVar);
            es2.h e17 = e(pVar, c17, "enqueue");
            es2.h hVar = es2.h.f337897d;
            mn2.g4 g4Var = pVar.f303621e2;
            if (e17 == hVar) {
                java.lang.String m75945x2fec83072 = g4Var.f411535e.m75945x2fec8307(9);
                if (m75945x2fec83072 != null) {
                    str = m75945x2fec83072;
                }
                g0Var.h(str, pVar);
                reentrantLock2.unlock();
                return -1;
            }
            es2.h hVar2 = es2.h.f337899f;
            java.util.HashMap hashMap = this.f337904d;
            java.util.LinkedList linkedList = this.f337905e;
            if (e17 == hVar2) {
                this.f337909i.d(pVar.f303625i2, c17.w0() >= 100, c17.w0(), pVar, c17.f68989x78351860, hashMap.size(), linkedList.size());
                reentrantLock2.unlock();
                return 1;
            }
            int size = hashMap.size();
            int i17 = this.f337901a.f546222f;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f337911k;
            try {
                if (i17 > size && !atomicBoolean.get()) {
                    pVar.f303623g2 = cs2.o.f303616d;
                    long j17 = pVar.f303622f2;
                    java.lang.String str3 = pVar.f303625i2;
                    java.lang.String str4 = pVar.f303626j2;
                    java.lang.String mo148084xb5887639 = g4Var.mo148084xb5887639();
                    r45.mb4 mb4Var = g4Var.f411535e;
                    int i18 = pVar.f69610x4f5245a8;
                    java.lang.String k17 = pVar.k();
                    int i19 = g4Var.f411539i;
                    long j18 = c17.f68968x799e9d9e;
                    try {
                        long j19 = c17.f68989x78351860;
                        reentrantLock = reentrantLock2;
                        try {
                            if (((c61.l7) i95.n0.c(c61.l7.class)).ek().I != 0) {
                            }
                            cu2.x.h(xVar, j17, str3, str4, mo148084xb5887639, i18, k17, i19, j18, j19, 1, mb4Var.m75939xb282bd08(3), mb4Var.m75945x2fec8307(18), mb4Var.m75945x2fec8307(17), false, false, 24576, null);
                            hashMap.put(pVar.f303625i2, pVar);
                            mn2.u0 u0Var = new mn2.u0(g4Var.f411535e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, 4, null);
                            mn2.g1 g1Var = mn2.g1.f411508a;
                            g1Var.e().b(u0Var, g1Var.h(mn2.f1.f411486d)).a();
                            ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().g(pVar, new es2.z(this, pVar, c17));
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[enqueue] begin to preloadVideo... " + pVar);
                            reentrantLock.unlock();
                            return 1;
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            reentrantLock.unlock();
                            throw th;
                        }
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                        reentrantLock = reentrantLock2;
                        reentrantLock.unlock();
                        throw th;
                    }
                }
                kz5.h0.B(linkedList, new es2.x(pVar));
                linkedList.add(pVar);
                pVar.f303623g2 = cs2.o.f303618f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "enqueue " + pVar + " wait to preLoad, just return. isStop=" + atomicBoolean + " preLoadingCount=" + size + " waitingSize=" + linkedList.size());
                reentrantLock2.unlock();
                return 1;
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
        }
    }

    public final java.util.List c(so2.j5 feed) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.util.LinkedList<r45.mb4> m59264x7efe73ec;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (!(feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5)) {
            if (!(feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys)) {
                return new java.util.LinkedList();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.Z(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) feed).f192727f);
            return (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (m59264x7efe73ec = feedObject.m59264x7efe73ec()) == null) ? new java.util.LinkedList() : kz5.n0.V0(m59264x7efe73ec);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.a((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) feed).m59135x7efe73ec());
        if (mb4Var != null) {
            linkedList.add(mb4Var);
        }
        return linkedList;
    }

    public final es2.h e(cs2.p pVar, so2.i3 i3Var, java.lang.String str) {
        r45.mb4 mb4Var = pVar.f303621e2.f411535e;
        java.lang.String str2 = this.f337906f;
        java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(9);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        boolean o17 = r26.i0.o(str2, m75945x2fec8307, false, 2, null);
        java.lang.String str3 = this.f337908h;
        if (o17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str + " is focused task " + pVar + " just return.");
            return es2.h.f337897d;
        }
        if (i3Var == null) {
            i3Var = cu2.x.c(cu2.x.f303982a, pVar.f303625i2, false, false, false, 14, null);
        }
        if (i3Var.D0() && com.p314xaae8f345.mm.vfs.w6.j(i3Var.u0())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str + ' ' + pVar + " has complete file(" + i3Var.w0() + "%)! just return.");
            return es2.h.f337899f;
        }
        long[] jArr = new long[3];
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(i3Var.f68981xaca5bdda, jArr);
        long max = java.lang.Math.max(0L, jArr[0]);
        long j17 = i3Var.f68989x78351860;
        if ((j17 > 0 ? (int) ((((float) max) / ((float) j17)) * 100) : 0) < pVar.V1 || max < pVar.f323338x || !com.p314xaae8f345.mm.vfs.w6.j(i3Var.u0())) {
            return es2.h.f337898e;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str + ' ' + pVar + " has finish preload(" + i3Var.w0() + "%)! received:" + max + " just return.");
        return es2.h.f337899f;
    }

    public void f() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        j("onClearAll", new es2.c0(linkedList, this));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f337908h, "[onClearAll] " + linkedList);
    }

    public void g(java.lang.String mediaId, boolean z17, int i17) {
        java.lang.String substring;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onMediaFocus] mediaId=");
        sb6.append(i17);
        sb6.append('_');
        if (mediaId.length() == 0) {
            substring = "";
        } else if (mediaId.length() <= 13) {
            substring = mediaId;
        } else {
            int length = mediaId.length();
            if (length > 24) {
                length = 24;
            }
            substring = mediaId.substring(13, length);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        }
        sb6.append(substring);
        sb6.append(" isFocused=");
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f337908h, sb6.toString());
        if (!z17) {
            this.f337906f = "";
            return;
        }
        j("onMediaFocus", new es2.d0(this, mediaId));
        a(mediaId, true, "onMediaFocus");
        h();
    }

    public final void h() {
        j("pollWaiting", new es2.e0(this));
    }

    public final void i(ek4.b bVar, java.util.List sourceList, int i17, java.lang.String invokeSource) {
        ek4.b taskContext = bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskContext, "taskContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceList, "sourceList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(invokeSource, "invokeSource");
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int i18 = 0;
        for (java.lang.Object obj : sourceList) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) obj;
            if (j5Var instanceof so2.u1) {
                r45.mb4 mb4Var = (r45.mb4) kz5.n0.X(c(j5Var));
                int i27 = 0;
                for (java.lang.Object obj2 : this.f337901a.x(ek4.b.a(bVar, 0, 0, 0, 0, mb4Var.m75942xfb822ef2(24), hc2.b0.e(j5Var, "PREL", i18), 0, 79, null), j5Var.mo2128x1ed62e84(), mb4Var, i17)) {
                    int i28 = i27 + 1;
                    if (i27 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    yr2.h hVar = (yr2.h) obj2;
                    yr2.d dVar = yr2.d.f546196a;
                    long mo2128x1ed62e84 = j5Var.mo2128x1ed62e84();
                    int i29 = taskContext.f335159c;
                    int i37 = hVar.f546206b;
                    long j17 = hVar.f546207c;
                    java.util.HashMap hashMap = this.f337904d;
                    java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f337907g;
                    java.util.LinkedList linkedList2 = linkedList;
                    int i38 = i18;
                    cs2.p b17 = dVar.b(hVar, mo2128x1ed62e84, i29, i38, new es2.o(this, i37, j17, hashMap, concurrentLinkedQueue, hVar.f546210f), new es2.l(this, hVar.f546206b, android.os.SystemClock.uptimeMillis(), hashMap, concurrentLinkedQueue), this.f337908h);
                    b17.f303624h2 = -this.f337910j.getAndIncrement();
                    linkedList2.add(b17);
                    taskContext = bVar;
                    linkedList = linkedList2;
                    i27 = i28;
                    j5Var = j5Var;
                    i18 = i38;
                }
            }
            taskContext = bVar;
            linkedList = linkedList;
            i18 = i19;
        }
        java.util.LinkedList linkedList3 = linkedList;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f337908h, "buildList input:[" + sourceList.size() + "] outList:\n" + kz5.n0.g0(linkedList3, "\n", null, null, 0, null, es2.p.f337930d, 30, null) + " invokeSource:" + invokeSource);
        kz5.g0.s(linkedList3);
        j("mergePendingList", new es2.a0(linkedList3, this));
        java.util.Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            b((cs2.p) it.next());
        }
    }

    public final java.lang.Object j(java.lang.String str, yz5.a aVar) {
        java.lang.String str2 = this.f337908h;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f337902b;
        reentrantLock.lock();
        try {
            return aVar.mo152xb9724478();
        } finally {
            reentrantLock.unlock();
            long uptimeMillis2 = android.os.SystemClock.uptimeMillis() - uptimeMillis;
            if (uptimeMillis2 > 100) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str2, "[syncLock] tag=" + str + " so slow! cost=" + uptimeMillis2 + "ms");
            }
        }
    }

    public final boolean k(cs2.p pVar, cs2.p pVar2) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f303625i2, pVar2.f303625i2) && pVar.f303628l2 == pVar2.f303628l2 && pVar.f69610x4f5245a8 == pVar2.f69610x4f5245a8 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.k(), pVar2.k());
    }
}
