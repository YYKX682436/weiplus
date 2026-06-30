package com.tencent.mm.plugin.appbrand.report.model;

/* loaded from: classes7.dex */
public class i implements com.tencent.mm.plugin.appbrand.report.model.y, com.tencent.mm.plugin.appbrand.report.model.t {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f87993b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f87994c = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Deque f87995d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f87996e = true;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f87997f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.report.model.v f87998g;

    public i(java.lang.String str, java.lang.String str2) {
        this.f87993b = str;
        synchronized (this) {
            this.f87997f = str2;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.t
    public synchronized void b(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        if (this.f87996e) {
            q(bVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.y
    public synchronized boolean c(java.lang.String str) {
        boolean z17;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f87997f)) {
            z17 = this.f87997f.equals(str);
        }
        return z17;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.t
    public void e(com.tencent.luggage.sdk.jsapi.component.b bVar, com.tencent.luggage.sdk.jsapi.component.b bVar2, com.tencent.mm.plugin.appbrand.page.wd wdVar) {
        synchronized (this) {
            if (this.f87996e) {
                q(bVar);
                return;
            }
            if (wdVar == com.tencent.mm.plugin.appbrand.page.wd.NAVIGATE_BACK) {
                s(bVar, bVar2);
                return;
            }
            com.tencent.mm.plugin.appbrand.report.model.w wVar = null;
            if (this.f87998g != null) {
                synchronized (this) {
                    this.f87998g = null;
                    this.f87997f = null;
                    this.f87996e = false;
                }
            }
            if (bVar2 != null) {
                p(bVar2).f88115c = new com.tencent.mm.plugin.appbrand.report.model.x(2, bVar.Y1());
            }
            com.tencent.mm.plugin.appbrand.report.model.v vVar = new com.tencent.mm.plugin.appbrand.report.model.v(bVar);
            if (bVar2 != null) {
                wVar = new com.tencent.mm.plugin.appbrand.report.model.w(bVar2.Y1());
            }
            vVar.f88116d = wVar;
            r(vVar);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.t
    public void j(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        synchronized (this) {
            com.tencent.mm.plugin.appbrand.report.model.v p17 = p(bVar);
            android.util.Pair e17 = com.tencent.mm.plugin.appbrand.report.model.j.e(bVar);
            p17.f88115c = new com.tencent.mm.plugin.appbrand.report.model.x(((java.lang.Integer) e17.first).intValue(), (java.lang.String) e17.second);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.y
    public synchronized com.tencent.mm.plugin.appbrand.report.model.v o(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        com.tencent.mm.plugin.appbrand.report.model.v vVar;
        com.tencent.mm.plugin.appbrand.report.model.v vVar2 = (com.tencent.mm.plugin.appbrand.report.model.v) this.f87994c.get(bVar.hashCode());
        return (vVar2 == null && (vVar = this.f87998g) != null && vVar.f88113a == bVar.hashCode()) ? this.f87998g : vVar2;
    }

    public final com.tencent.mm.plugin.appbrand.report.model.v p(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        com.tencent.mm.plugin.appbrand.report.model.v peek = peek();
        if (peek == null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            return new com.tencent.mm.plugin.appbrand.report.model.v(bVar);
        }
        if (peek.f88113a == bVar.hashCode()) {
            return peek;
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandPageVisitStack", new java.lang.Throwable(), "mismatch stack order", new java.lang.Object[0]);
        return peek;
    }

    @Override // com.tencent.mm.plugin.appbrand.report.model.y
    public synchronized com.tencent.mm.plugin.appbrand.report.model.v peek() {
        return (com.tencent.mm.plugin.appbrand.report.model.v) ((java.util.LinkedList) this.f87995d).peekFirst();
    }

    public final synchronized void q(com.tencent.luggage.sdk.jsapi.component.b bVar) {
        this.f87997f = bVar.Y1();
        this.f87996e = false;
        r(new com.tencent.mm.plugin.appbrand.report.model.v(bVar));
        peek().f88116d = com.tencent.mm.sdk.platformtools.t8.K0(this.f87993b) ? null : new com.tencent.mm.plugin.appbrand.report.model.w(this.f87993b);
    }

    public synchronized void r(com.tencent.mm.plugin.appbrand.report.model.v vVar) {
        int i17 = vVar.f88113a;
        if (((java.util.LinkedList) this.f87995d).peekFirst() != vVar) {
            ((java.util.LinkedList) this.f87995d).offerFirst(vVar);
        }
        this.f87994c.put(vVar.f88113a, vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c A[Catch: all -> 0x007e, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x000c, B:8:0x0014, B:12:0x0017, B:13:0x0018, B:15:0x0019, B:16:0x002f, B:19:0x0036, B:21:0x0039, B:23:0x0041, B:28:0x0055, B:32:0x0058, B:33:0x0059, B:36:0x005c, B:37:0x0064, B:43:0x007c, B:44:0x007d, B:7:0x000d, B:25:0x0042, B:27:0x004e, B:18:0x0030), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void s(com.tencent.luggage.sdk.jsapi.component.b r7, com.tencent.luggage.sdk.jsapi.component.b r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r8.Y1()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L7e
            r1 = 0
            if (r0 == 0) goto L19
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7e
            r6.f87998g = r1     // Catch: java.lang.Throwable -> L16
            r6.f87997f = r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r6.f87996e = r2     // Catch: java.lang.Throwable -> L16
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            goto L19
        L16:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            throw r7     // Catch: java.lang.Throwable -> L7e
        L19:
            com.tencent.mm.plugin.appbrand.report.model.v r2 = r6.p(r8)     // Catch: java.lang.Throwable -> L7e
            r6.f87998g = r2     // Catch: java.lang.Throwable -> L7e
            com.tencent.mm.plugin.appbrand.report.model.x r3 = new com.tencent.mm.plugin.appbrand.report.model.x     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r7.Y1()     // Catch: java.lang.Throwable -> L7e
            r5 = 1
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L7e
            r2.f88115c = r3     // Catch: java.lang.Throwable -> L7e
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L7e
        L2f:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7e
            java.util.Deque r3 = r6.f87995d     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L5a
            com.tencent.mm.plugin.appbrand.report.model.v r3 = r6.peek()     // Catch: java.lang.Throwable -> L7e
            int r3 = r3.f88113a     // Catch: java.lang.Throwable -> L7e
            if (r3 == r2) goto L5a
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7e
            java.util.Deque r3 = r6.f87995d     // Catch: java.lang.Throwable -> L57
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.pollFirst()     // Catch: java.lang.Throwable -> L57
            com.tencent.mm.plugin.appbrand.report.model.v r3 = (com.tencent.mm.plugin.appbrand.report.model.v) r3     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L55
            int r3 = r3.f88113a     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r4 = r6.f87994c     // Catch: java.lang.Throwable -> L57
            r4.remove(r3)     // Catch: java.lang.Throwable -> L57
        L55:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            goto L2f
        L57:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            throw r7     // Catch: java.lang.Throwable -> L7e
        L5a:
            if (r0 == 0) goto L64
            com.tencent.mm.plugin.appbrand.report.model.v r0 = new com.tencent.mm.plugin.appbrand.report.model.v     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r7)     // Catch: java.lang.Throwable -> L7e
            r6.r(r0)     // Catch: java.lang.Throwable -> L7e
        L64:
            com.tencent.mm.plugin.appbrand.report.model.v r0 = r6.p(r7)     // Catch: java.lang.Throwable -> L7e
            com.tencent.mm.plugin.appbrand.report.model.w r2 = new com.tencent.mm.plugin.appbrand.report.model.w     // Catch: java.lang.Throwable -> L7e
            java.lang.String r8 = r8.Y1()     // Catch: java.lang.Throwable -> L7e
            r2.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            r0.f88116d = r2     // Catch: java.lang.Throwable -> L7e
            com.tencent.mm.plugin.appbrand.report.model.v r7 = r6.p(r7)     // Catch: java.lang.Throwable -> L7e
            r7.f88115c = r1     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r6)
            return
        L7b:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            throw r7     // Catch: java.lang.Throwable -> L7e
        L7e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.report.model.i.s(com.tencent.luggage.sdk.jsapi.component.b, com.tencent.luggage.sdk.jsapi.component.b):void");
    }
}
