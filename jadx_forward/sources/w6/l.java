package w6;

/* loaded from: classes13.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f524666a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f524667b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.f f524668c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f524669d;

    /* renamed from: e, reason: collision with root package name */
    public int f524670e;

    /* renamed from: f, reason: collision with root package name */
    public int f524671f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Class f524672g;

    /* renamed from: h, reason: collision with root package name */
    public w6.p f524673h;

    /* renamed from: i, reason: collision with root package name */
    public t6.l f524674i;

    /* renamed from: j, reason: collision with root package name */
    public java.util.Map f524675j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.Class f524676k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f524677l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f524678m;

    /* renamed from: n, reason: collision with root package name */
    public t6.h f524679n;

    /* renamed from: o, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.g f524680o;

    /* renamed from: p, reason: collision with root package name */
    public w6.z f524681p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f524682q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f524683r;

    public java.util.List a() {
        boolean z17 = this.f524678m;
        java.util.List list = this.f524667b;
        if (!z17) {
            this.f524678m = true;
            ((java.util.ArrayList) list).clear();
            java.util.ArrayList arrayList = (java.util.ArrayList) b();
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                a7.o0 o0Var = (a7.o0) arrayList.get(i17);
                if (!((java.util.ArrayList) list).contains(o0Var.f83379a)) {
                    ((java.util.ArrayList) list).add(o0Var.f83379a);
                }
                int i18 = 0;
                while (true) {
                    java.util.List list2 = o0Var.f83380b;
                    if (i18 < list2.size()) {
                        if (!((java.util.ArrayList) list).contains(list2.get(i18))) {
                            ((java.util.ArrayList) list).add(list2.get(i18));
                        }
                        i18++;
                    }
                }
            }
        }
        return list;
    }

    public java.util.List b() {
        boolean z17 = this.f524677l;
        java.util.List list = this.f524666a;
        if (!z17) {
            this.f524677l = true;
            ((java.util.ArrayList) list).clear();
            java.util.List e17 = this.f524668c.f125479b.e(this.f524669d);
            int size = e17.size();
            for (int i17 = 0; i17 < size; i17++) {
                a7.o0 b17 = ((a7.p0) e17.get(i17)).b(this.f524669d, this.f524670e, this.f524671f, this.f524674i);
                if (b17 != null) {
                    ((java.util.ArrayList) list).add(b17);
                }
            }
        }
        return list;
    }

    public w6.w0 c(java.lang.Class cls) {
        w6.w0 w0Var;
        java.util.ArrayList arrayList;
        i7.e eVar;
        com.p147xb1cd08cc.p148x5de23a5.m mVar = this.f524668c.f125479b;
        java.lang.Class cls2 = this.f524672g;
        java.lang.Class cls3 = this.f524676k;
        l7.d dVar = mVar.f125500i;
        q7.m mVar2 = (q7.m) dVar.f398316b.getAndSet(null);
        if (mVar2 == null) {
            mVar2 = new q7.m();
        }
        mVar2.f441839a = cls;
        mVar2.f441840b = cls2;
        mVar2.f441841c = cls3;
        synchronized (dVar.f398315a) {
            w0Var = (w6.w0) dVar.f398315a.m174751x4aabfc28(mVar2, null);
        }
        dVar.f398316b.set(mVar2);
        mVar.f125500i.getClass();
        if (l7.d.f398314c.equals(w0Var)) {
            return null;
        }
        if (w0Var != null) {
            return w0Var;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) mVar.f125494c.b(cls, cls2)).iterator();
        while (it.hasNext()) {
            java.lang.Class<?> cls4 = (java.lang.Class) it.next();
            java.util.Iterator it6 = ((java.util.ArrayList) mVar.f125497f.a(cls4, cls3)).iterator();
            while (it6.hasNext()) {
                java.lang.Class cls5 = (java.lang.Class) it6.next();
                l7.g gVar = mVar.f125494c;
                synchronized (gVar) {
                    arrayList = new java.util.ArrayList();
                    java.util.Iterator it7 = ((java.util.ArrayList) gVar.f398322a).iterator();
                    while (it7.hasNext()) {
                        java.util.List<l7.f> list = (java.util.List) ((java.util.HashMap) gVar.f398323b).get((java.lang.String) it7.next());
                        if (list != null) {
                            for (l7.f fVar : list) {
                                if (fVar.f398319a.isAssignableFrom(cls) && cls4.isAssignableFrom(fVar.f398320b)) {
                                    arrayList.add(fVar.f398321c);
                                }
                            }
                        }
                    }
                }
                i7.g gVar2 = mVar.f125497f;
                synchronized (gVar2) {
                    if (!cls5.isAssignableFrom(cls4)) {
                        java.util.Iterator it8 = ((java.util.ArrayList) gVar2.f370930a).iterator();
                        while (it8.hasNext()) {
                            i7.f fVar2 = (i7.f) it8.next();
                            if (fVar2.f370927a.isAssignableFrom(cls4) && cls5.isAssignableFrom(fVar2.f370928b)) {
                                eVar = fVar2.f370929c;
                            }
                        }
                        throw new java.lang.IllegalArgumentException("No transcoder registered to transcode from " + cls4 + " to " + cls5);
                    }
                    eVar = i7.h.f370931a;
                }
                arrayList2.add(new w6.v(cls, cls4, cls5, arrayList, eVar, mVar.f125501j));
            }
        }
        w6.w0 w0Var2 = arrayList2.isEmpty() ? null : new w6.w0(cls, cls2, cls3, arrayList2, mVar.f125501j);
        l7.d dVar2 = mVar.f125500i;
        synchronized (dVar2.f398315a) {
            dVar2.f398315a.put(new q7.m(cls, cls2, cls3), w0Var2 != null ? w0Var2 : l7.d.f398314c);
        }
        return w0Var2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f398311b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t6.d d(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.f r0 = r5.f524668c
            com.bumptech.glide.m r0 = r0.f125479b
            l7.b r0 = r0.f125493b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.List r2 = r0.f398312a     // Catch: java.lang.Throwable -> L3a
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L3a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3a
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3a
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3a
            l7.a r3 = (l7.a) r3     // Catch: java.lang.Throwable -> L3a
            java.lang.Class r4 = r3.f398310a     // Catch: java.lang.Throwable -> L3a
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3a
            if (r4 == 0) goto L13
            t6.d r1 = r3.f398311b     // Catch: java.lang.Throwable -> L3a
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.bumptech.glide.l r0 = new com.bumptech.glide.l
            java.lang.Class r6 = r6.getClass()
            r0.<init>(r6)
            throw r0
        L3a:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.l.d(java.lang.Object):t6.d");
    }

    public t6.p e(java.lang.Class cls) {
        t6.p pVar = (t6.p) this.f524675j.get(cls);
        if (pVar == null) {
            java.util.Iterator it = this.f524675j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
                if (((java.lang.Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (t6.p) entry.getValue();
                    break;
                }
            }
        }
        if (pVar != null) {
            return pVar;
        }
        if (!this.f524675j.isEmpty() || !this.f524682q) {
            return (c7.e) c7.e.f121051b;
        }
        throw new java.lang.IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }
}
