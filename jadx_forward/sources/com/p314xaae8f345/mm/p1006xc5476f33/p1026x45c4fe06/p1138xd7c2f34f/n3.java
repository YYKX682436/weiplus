package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class n3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f166330a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.y50 f166331b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f166332c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f166333d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f166334e;

    /* renamed from: f, reason: collision with root package name */
    public int f166335f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f166336g;

    public n3(java.lang.String session, java.util.Collection requestPkgInfoList, r45.y50 cgiCommRequestSource, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(session, "session");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestPkgInfoList, "requestPkgInfoList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cgiCommRequestSource, "cgiCommRequestSource");
        this.f166330a = session;
        this.f166331b = cgiCommRequestSource;
        this.f166332c = str;
        this.f166333d = new java.util.LinkedList(requestPkgInfoList);
        this.f166334e = new java.util.HashMap();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
    
        r7.remove();
        r2.f166335f = r6;
        r2.f166334e.put(r3, new jz5.l(r4, r5));
        c();
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043 A[Catch: all -> 0x0066, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x001b, B:11:0x0029, B:14:0x0032, B:16:0x0037, B:17:0x003d, B:19:0x0043, B:22:0x0052), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0064 A[EDGE_INSN: B:28:0x0064->B:23:0x0064 BREAK  A[LOOP:0: B:17:0x003d->B:27:?], SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 r3, yz5.l r4, yz5.q r5, int r6, r45.y50 r7, java.lang.String r8) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "request"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "onSuccess"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "onError"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r0 = "cgiCommRequestSource"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r2.f166332c     // Catch: java.lang.Throwable -> L66
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L24
            int r7 = r7.length()     // Catch: java.lang.Throwable -> L66
            if (r7 != 0) goto L22
            goto L24
        L22:
            r7 = r0
            goto L25
        L24:
            r7 = r1
        L25:
            if (r7 != 0) goto L37
            if (r8 == 0) goto L2f
            int r7 = r8.length()     // Catch: java.lang.Throwable -> L66
            if (r7 != 0) goto L30
        L2f:
            r0 = r1
        L30:
            if (r0 != 0) goto L37
            java.lang.String r7 = r2.f166332c     // Catch: java.lang.Throwable -> L66
            e56.a.a(r7, r8)     // Catch: java.lang.Throwable -> L66
        L37:
            java.util.LinkedList r7 = r2.f166333d     // Catch: java.lang.Throwable -> L66
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L66
        L3d:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L66
            if (r8 == 0) goto L64
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L66
            com.tencent.mm.plugin.appbrand.launching.o6 r8 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6) r8     // Catch: java.lang.Throwable -> L66
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)     // Catch: java.lang.Throwable -> L66
            int r8 = r2.b(r8, r3)     // Catch: java.lang.Throwable -> L66
            if (r8 != 0) goto L3d
            r7.remove()     // Catch: java.lang.Throwable -> L66
            r2.f166335f = r6     // Catch: java.lang.Throwable -> L66
            java.util.HashMap r6 = r2.f166334e     // Catch: java.lang.Throwable -> L66
            jz5.l r7 = new jz5.l     // Catch: java.lang.Throwable -> L66
            r7.<init>(r4, r5)     // Catch: java.lang.Throwable -> L66
            r6.put(r3, r7)     // Catch: java.lang.Throwable -> L66
            r2.c()     // Catch: java.lang.Throwable -> L66
        L64:
            monitor-exit(r2)
            return
        L66:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3.a(com.tencent.mm.plugin.appbrand.launching.z6, yz5.l, yz5.q, int, r45.y50, java.lang.String):void");
    }

    public final int b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 o6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.z6 z6Var) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(o6Var.f166384d, z6Var.f166994d)) {
            if (o6Var.f166386f == z6Var.f166996f) {
                if (o6Var.f166387g == z6Var.f166997g) {
                    java.lang.String str = o6Var.f166385e;
                    java.lang.String str2 = str == null ? "" : str;
                    java.lang.String str3 = z6Var.f166995e;
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str3 != null ? str3 : "")) {
                        return 0;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11656xaf63146e.f33446xd388c2f8, str)) {
                        java.lang.String str4 = z6Var.f166995e;
                        if (str4 == null || str4.length() == 0) {
                            return 0;
                        }
                    }
                    return 1;
                }
            }
        }
        return -1;
    }

    public final void c() {
        if (!this.f166333d.isEmpty()) {
            return;
        }
        java.util.HashMap hashMap = this.f166334e;
        int size = hashMap.size();
        java.lang.String str = this.f166330a;
        if (size <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + str + ")fireAllRequestsIfNeed requestCallbacks.size <= 0");
            return;
        }
        if (this.f166336g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + str + ")fireAllRequestsIfNeed cgi reentry!");
            return;
        }
        try {
            java.util.LinkedList linkedList = new java.util.LinkedList(hashMap.keySet());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.BatchGetCodePkgExecutor", "session(" + str + ")fireAllRequestsIfNeed real call CgiRouter with requests(" + kz5.n0.g0(linkedList, ",", null, null, 0, null, null, 62, null) + ')');
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f166943a.e(linkedList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.l3(this), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.m3(this), this.f166335f, this.f166331b, this.f166332c);
        } finally {
            this.f166336g = true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        r0.remove();
        c();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.String r0 = "request"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)     // Catch: java.lang.Throwable -> L26
            java.util.LinkedList r0 = r2.f166333d     // Catch: java.lang.Throwable -> L26
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L26
        Lc:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L26
            com.tencent.mm.plugin.appbrand.launching.o6 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6) r1     // Catch: java.lang.Throwable -> L26
            int r1 = r1.compareTo(r3)     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto Lc
            r0.remove()     // Catch: java.lang.Throwable -> L26
            r2.c()     // Catch: java.lang.Throwable -> L26
        L24:
            monitor-exit(r2)
            return
        L26:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.n3.d(com.tencent.mm.plugin.appbrand.launching.o6):void");
    }
}
