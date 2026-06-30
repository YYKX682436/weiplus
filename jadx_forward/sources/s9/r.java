package s9;

/* loaded from: classes13.dex */
public final class r implements s9.c {

    /* renamed from: a, reason: collision with root package name */
    public final java.io.File f486507a;

    /* renamed from: b, reason: collision with root package name */
    public final s9.j f486508b;

    /* renamed from: d, reason: collision with root package name */
    public final s9.o f486510d;

    /* renamed from: g, reason: collision with root package name */
    public s9.a f486513g;

    /* renamed from: f, reason: collision with root package name */
    public long f486512f = 0;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f486509c = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f486511e = new java.util.HashMap();

    public r(java.io.File file, s9.j jVar, s9.o oVar) {
        this.f486507a = file;
        this.f486508b = jVar;
        this.f486510d = oVar;
        android.os.ConditionVariable conditionVariable = new android.os.ConditionVariable();
        new s9.q(this, "SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x00c3, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00bf, code lost:
    
        if (r10 == null) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ba  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(s9.r r18) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.r.l(s9.r):void");
    }

    @Override // s9.c
    public synchronized java.util.NavigableSet a(java.lang.String str, s9.b bVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f486511e.get(str);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            this.f486511e.put(str, arrayList);
        }
        arrayList.add(bVar);
        return k(str);
    }

    @Override // s9.c
    public synchronized long b(java.lang.String str) {
        s9.n b17;
        b17 = this.f486510d.b(str);
        return b17 == null ? -1L : b17.f486494d;
    }

    @Override // s9.c
    public synchronized void c(s9.k kVar) {
        t9.a.d(kVar == this.f486509c.remove(kVar.f486484d));
        notifyAll();
    }

    @Override // s9.c
    public s9.k d(java.lang.String str, long j17) {
        s9.s i17;
        synchronized (this) {
            while (true) {
                i17 = i(str, j17);
                if (i17 == null) {
                    wait();
                }
            }
        }
        return i17;
    }

    @Override // s9.c
    public synchronized java.io.File e(java.lang.String str, long j17, long j18) {
        java.io.File file;
        s9.n nVar;
        t9.a.d(this.f486509c.containsKey(str));
        if (!this.f486507a.exists()) {
            p();
            this.f486507a.mkdirs();
        }
        s9.p pVar = (s9.p) this.f486508b;
        while (pVar.f486504e + j18 > 536870912) {
            java.util.TreeSet treeSet = pVar.f486503d;
            if (treeSet.isEmpty()) {
                break;
            }
            try {
                g((s9.k) treeSet.first());
            } catch (s9.a unused) {
            }
        }
        file = this.f486507a;
        s9.o oVar = this.f486510d;
        nVar = (s9.n) oVar.f486495a.get(str);
        if (nVar == null) {
            nVar = oVar.a(str, -1L);
        }
        return s9.s.d(file, nVar.f486491a, j17, java.lang.System.currentTimeMillis());
    }

    @Override // s9.c
    public synchronized void f(java.lang.String str, long j17) {
        s9.o oVar = this.f486510d;
        s9.n b17 = oVar.b(str);
        if (b17 == null) {
            oVar.a(str, j17);
        } else if (b17.f486494d != j17) {
            b17.f486494d = j17;
            oVar.f486501g = true;
        }
        this.f486510d.d();
    }

    @Override // s9.c
    public synchronized void g(s9.k kVar) {
        o(kVar, true);
    }

    @Override // s9.c
    public synchronized long h() {
        return this.f486512f;
    }

    @Override // s9.c
    public synchronized void j(java.io.File file) {
        s9.s b17 = s9.s.b(file, this.f486510d);
        boolean z17 = true;
        t9.a.d(b17 != null);
        t9.a.d(this.f486509c.containsKey(b17.f486484d));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
                return;
            }
            java.lang.Long valueOf = java.lang.Long.valueOf(b(b17.f486484d));
            if (valueOf.longValue() != -1) {
                if (b17.f486485e + b17.f486486f > valueOf.longValue()) {
                    z17 = false;
                }
                t9.a.d(z17);
            }
            m(b17);
            this.f486510d.d();
            notifyAll();
        }
    }

    @Override // s9.c
    public synchronized java.util.NavigableSet k(java.lang.String str) {
        s9.n b17;
        b17 = this.f486510d.b(str);
        return (b17 == null || b17.f486493c.isEmpty()) ? null : new java.util.TreeSet((java.util.Collection) b17.f486493c);
    }

    public final void m(s9.s sVar) {
        java.lang.String str = sVar.f486484d;
        s9.o oVar = this.f486510d;
        s9.n nVar = (s9.n) oVar.f486495a.get(str);
        if (nVar == null) {
            nVar = oVar.a(str, -1L);
        }
        nVar.f486493c.add(sVar);
        this.f486512f += sVar.f486486f;
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f486511e.get(sVar.f486484d);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((s9.b) arrayList.get(size)).b(this, sVar);
                }
            }
        }
        ((s9.p) this.f486508b).b(this, sVar);
    }

    public final void n(s9.k kVar) {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f486511e.get(kVar.f486484d);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((s9.b) arrayList.get(size)).c(this, kVar);
            }
        }
        ((s9.p) this.f486508b).c(this, kVar);
    }

    public final void o(s9.k kVar, boolean z17) {
        boolean z18;
        java.lang.String str = kVar.f486484d;
        s9.o oVar = this.f486510d;
        s9.n b17 = oVar.b(str);
        if (b17 != null) {
            java.util.TreeSet treeSet = b17.f486493c;
            if (treeSet.remove(kVar)) {
                kVar.f486488h.delete();
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                this.f486512f -= kVar.f486486f;
                if (z17) {
                    try {
                        if (treeSet.isEmpty()) {
                            s9.n nVar = (s9.n) oVar.f486495a.remove(b17.f486492b);
                            if (nVar != null) {
                                t9.a.d(nVar.f486493c.isEmpty());
                                oVar.f486496b.remove(nVar.f486491a);
                                oVar.f486501g = true;
                            }
                            oVar.d();
                        }
                    } finally {
                        n(kVar);
                    }
                }
            }
        }
    }

    public final void p() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        s9.o oVar = this.f486510d;
        java.util.Iterator it = oVar.f486495a.values().iterator();
        while (it.hasNext()) {
            java.util.Iterator it6 = ((s9.n) it.next()).f486493c.iterator();
            while (it6.hasNext()) {
                s9.k kVar = (s9.k) it6.next();
                if (!kVar.f486488h.exists()) {
                    linkedList.add(kVar);
                }
            }
        }
        java.util.Iterator it7 = linkedList.iterator();
        while (it7.hasNext()) {
            o((s9.k) it7.next(), false);
        }
        oVar.c();
        oVar.d();
    }

    @Override // s9.c
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public synchronized s9.s i(java.lang.String str, long j17) {
        s9.s b17;
        s9.s sVar;
        s9.a aVar = this.f486513g;
        if (aVar != null) {
            throw aVar;
        }
        s9.n b18 = this.f486510d.b(str);
        if (b18 == null) {
            sVar = new s9.s(str, j17, -1L, -9223372036854775807L, null);
        } else {
            while (true) {
                b17 = b18.b(j17);
                if (!b17.f486487g || b17.f486488h.exists()) {
                    break;
                }
                p();
            }
            sVar = b17;
        }
        if (!sVar.f486487g) {
            if (this.f486509c.containsKey(str)) {
                return null;
            }
            this.f486509c.put(str, sVar);
            return sVar;
        }
        s9.s c17 = this.f486510d.b(str).c(sVar);
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f486511e.get(sVar.f486484d);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((s9.b) arrayList.get(size)).a(this, sVar, c17);
            }
        }
        ((s9.p) this.f486508b).a(this, sVar, c17);
        return c17;
    }

    @Override // s9.c
    public synchronized long q0(java.lang.String str, long j17, long j18) {
        s9.n b17;
        b17 = this.f486510d.b(str);
        return b17 != null ? b17.a(j17, j18) : -j18;
    }
}
