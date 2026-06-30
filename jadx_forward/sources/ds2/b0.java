package ds2;

/* loaded from: classes2.dex */
public class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final yr2.k f324386a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.concurrent.locks.ReentrantLock f324387b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f324388c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f324389d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f324390e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f324391f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f324392g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f324393h;

    public b0(yr2.k model, java.lang.String sceneTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneTag, "sceneTag");
        this.f324386a = model;
        this.f324387b = new java.util.concurrent.locks.ReentrantLock();
        this.f324388c = new java.util.HashMap();
        this.f324389d = new java.util.LinkedList();
        this.f324390e = "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.X2();
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = new java.util.concurrent.ConcurrentLinkedQueue();
        this.f324391f = concurrentLinkedQueue;
        this.f324392g = "FVPW1_" + sceneTag + '_' + hashCode();
        concurrentLinkedQueue.add(new ds2.i(this));
        this.f324393h = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final cs2.p a(java.lang.String str, boolean z17, java.lang.String str2) {
        return (cs2.p) f("cancel", new ds2.s(this, str, z17, str2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [java.util.concurrent.locks.ReentrantLock] */
    /* JADX WARN: Type inference failed for: r17v2, types: [mn2.g4] */
    public final int b(cs2.p pVar) {
        ?? r17;
        java.lang.String str;
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f324387b;
        reentrantLock.lock();
        try {
            java.lang.String m75945x2fec8307 = pVar.f303621e2.f411535e.m75945x2fec8307(9);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            boolean o17 = r26.i0.o(this.f324390e, m75945x2fec8307, false, 2, null);
            java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f324391f;
            java.lang.String str2 = this.f324392g;
            mn2.g4 g4Var = pVar.f303621e2;
            if (o17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[enqueue] is focused task " + pVar + " just return.");
                java.util.Iterator it = concurrentLinkedQueue.iterator();
                while (it.hasNext()) {
                    vr2.i iVar = (vr2.i) it.next();
                    java.lang.String m75945x2fec83072 = g4Var.f411535e.m75945x2fec8307(9);
                    if (m75945x2fec83072 == null) {
                        m75945x2fec83072 = "";
                    }
                    iVar.h(m75945x2fec83072, pVar);
                }
                reentrantLock.unlock();
                return -1;
            }
            so2.i3 c17 = cu2.x.c(cu2.x.f303982a, pVar.f303625i2, false, false, false, 14, null);
            java.util.Iterator it6 = concurrentLinkedQueue.iterator();
            while (it6.hasNext()) {
                vr2.i iVar2 = (vr2.i) it6.next();
                java.lang.String field_mediaId = c17.f68981xaca5bdda;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_mediaId, "field_mediaId");
                iVar2.g(field_mediaId, c17.w0(), pVar.V1, pVar.k(), pVar.f69610x4f5245a8 == 1 ? "H264" : "H265", pVar);
                c17 = c17;
            }
            so2.i3 i3Var = c17;
            long[] jArr = new long[3];
            ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(i3Var.f68981xaca5bdda, jArr);
            long j17 = jArr[0];
            boolean D0 = i3Var.D0();
            java.util.HashMap hashMap = this.f324388c;
            java.util.LinkedList linkedList = this.f324389d;
            r17 = g4Var;
            int i17 = 100;
            if (D0 && com.p314xaae8f345.mm.vfs.w6.j(i3Var.u0())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[enqueue] " + pVar + " has complete file(" + i3Var.w0() + "%)! just return.");
                java.util.Iterator it7 = concurrentLinkedQueue.iterator();
                while (it7.hasNext()) {
                    java.util.LinkedList linkedList2 = linkedList;
                    java.util.HashMap hashMap2 = hashMap;
                    ((vr2.i) it7.next()).d(pVar.f303625i2, i3Var.w0() >= i17, i3Var.w0(), pVar, i3Var.f68989x78351860, hashMap.size(), linkedList.size());
                    hashMap = hashMap2;
                    linkedList = linkedList2;
                    i17 = 100;
                }
                reentrantLock.unlock();
                return 1;
            }
            if (i3Var.w0() >= pVar.V1) {
                str = "[enqueue] ";
                if (i3Var.f68968x799e9d9e >= pVar.f323338x && com.p314xaae8f345.mm.vfs.w6.j(i3Var.u0()) && j17 > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str + pVar + " has finish preload(" + i3Var.w0() + "%)! received:" + j17 + " just return.");
                    java.util.Iterator it8 = concurrentLinkedQueue.iterator();
                    while (it8.hasNext()) {
                        ((vr2.i) it8.next()).d(pVar.f303625i2, i3Var.w0() >= 100, i3Var.w0(), pVar, i3Var.f68968x799e9d9e, hashMap.size(), linkedList.size());
                    }
                    reentrantLock.unlock();
                    return 1;
                }
            } else {
                str = "[enqueue] ";
            }
            int size = hashMap.size();
            int i18 = this.f324386a.f546222f;
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f324393h;
            try {
                if (i18 > size && !atomicBoolean.get()) {
                    pVar.f303623g2 = cs2.o.f303616d;
                    cu2.x xVar = cu2.x.f303982a;
                    long j18 = pVar.f303622f2;
                    java.lang.String str3 = pVar.f303625i2;
                    java.lang.String str4 = pVar.f303626j2;
                    java.lang.String mo148084xb5887639 = r17.mo148084xb5887639();
                    r45.mb4 mb4Var = r17.f411535e;
                    int i19 = pVar.f69610x4f5245a8;
                    java.lang.String k17 = pVar.k();
                    int i27 = r17.f411539i;
                    long j19 = i3Var.f68968x799e9d9e;
                    long j27 = i3Var.f68989x78351860;
                    if (((c61.l7) i95.n0.c(c61.l7.class)).ek().I != 0) {
                    }
                    cu2.x.h(xVar, j18, str3, str4, mo148084xb5887639, i19, k17, i27, j19, j27, 1, mb4Var.m75939xb282bd08(3), mb4Var.m75945x2fec8307(18), mb4Var.m75945x2fec8307(17), false, pVar.f323332r, 8192, null);
                    hashMap.put(pVar.f303625i2, pVar);
                    mn2.u0 u0Var = new mn2.u0(r17.f411535e, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f, null, 4, null);
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    g1Var.e().b(u0Var, g1Var.h(mn2.f1.f411486d)).a();
                    if (((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Ni()) {
                        ((cf0.z) ((df0.s) i95.n0.c(df0.s.class))).Di().g(pVar, new ds2.x(this, pVar, i3Var));
                    } else {
                        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Ai(pVar);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "[enqueue] begin to preloadVideo... " + pVar);
                    reentrantLock.unlock();
                    return 1;
                }
                kz5.h0.B(linkedList, new ds2.v(pVar));
                linkedList.add(pVar);
                pVar.f303623g2 = cs2.o.f303618f;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str + pVar + " wait to preLoad, just return. isStop=" + atomicBoolean + " preLoadingCount=" + size + " waitingSize=" + linkedList.size());
                reentrantLock.unlock();
                return 1;
            } catch (java.lang.Throwable th6) {
                th = th6;
                r17.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            r17 = reentrantLock;
        }
    }

    public java.util.LinkedList c(java.util.LinkedList preloadList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadList, "preloadList");
        java.util.List V0 = kz5.n0.V0(preloadList);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList<cs2.p> linkedList2 = (java.util.LinkedList) f("cancelWaitingTask", new ds2.u(this, null));
        f("mergePreload", new ds2.y(preloadList, this, V0, linkedList, linkedList2));
        boolean isEmpty = preloadList.isEmpty();
        java.lang.String str = this.f324392g;
        if (isEmpty) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "[mergePreload] preloadList is empty!");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[mergePreload] -> \n");
            for (cs2.p pVar : linkedList2) {
                sb6.append("(-) ");
                sb6.append(pVar);
                sb6.append("\n");
            }
            java.util.Iterator it = ((java.util.ArrayList) V0).iterator();
            while (it.hasNext()) {
                cs2.p pVar2 = (cs2.p) it.next();
                if (preloadList.contains(pVar2)) {
                    sb6.append("(+) ");
                    sb6.append(pVar2);
                    sb6.append("\n");
                } else {
                    sb6.append("(~) ");
                    sb6.append(pVar2);
                    sb6.append("\n");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        }
        return preloadList;
    }

    public final void d() {
        f("pollWaiting", new ds2.a0(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.LinkedList e(ek4.b r45, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 r46, java.util.List r47, int r48) {
        /*
            Method dump skipped, instructions count: 1092
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ds2.b0.e(ek4.b, com.tencent.mm.plugin.finder.storage.FeedData, java.util.List, int):java.util.LinkedList");
    }

    public final java.lang.Object f(java.lang.String str, yz5.a aVar) {
        java.lang.String str2 = this.f324392g;
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.f324387b;
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
}
