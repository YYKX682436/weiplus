package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29;

/* loaded from: classes7.dex */
public class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f169526b;

    /* renamed from: c, reason: collision with root package name */
    public final android.util.SparseArray f169527c = new android.util.SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Deque f169528d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public boolean f169529e = true;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f169530f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v f169531g;

    public i(java.lang.String str, java.lang.String str2) {
        this.f169526b = str;
        synchronized (this) {
            this.f169530f = str2;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t
    public synchronized void b(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        if (this.f169529e) {
            q(bVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y
    public synchronized boolean c(java.lang.String str) {
        boolean z17;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f169530f)) {
            z17 = this.f169530f.equals(str);
        }
        return z17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t
    public void e(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd wdVar) {
        synchronized (this) {
            if (this.f169529e) {
                q(bVar);
                return;
            }
            if (wdVar == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.wd.NAVIGATE_BACK) {
                s(bVar, bVar2);
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.w wVar = null;
            if (this.f169531g != null) {
                synchronized (this) {
                    this.f169531g = null;
                    this.f169530f = null;
                    this.f169529e = false;
                }
            }
            if (bVar2 != null) {
                p(bVar2).f169648c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.x(2, bVar.Y1());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v vVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v(bVar);
            if (bVar2 != null) {
                wVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.w(bVar2.Y1());
            }
            vVar.f169649d = wVar;
            r(vVar);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.t
    public void j(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        synchronized (this) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v p17 = p(bVar);
            android.util.Pair e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.j.e(bVar);
            p17.f169648c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.x(((java.lang.Integer) e17.first).intValue(), (java.lang.String) e17.second);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v o(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v vVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v vVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v) this.f169527c.get(bVar.hashCode());
        return (vVar2 == null && (vVar = this.f169531g) != null && vVar.f169646a == bVar.hashCode()) ? this.f169531g : vVar2;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v p(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v mo52410x34715b = mo52410x34715b();
        if (mo52410x34715b == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v(bVar);
        }
        if (mo52410x34715b.f169646a == bVar.hashCode()) {
            return mo52410x34715b;
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AppBrandPageVisitStack", new java.lang.Throwable(), "mismatch stack order", new java.lang.Object[0]);
        return mo52410x34715b;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.y
    /* renamed from: peek */
    public synchronized com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v mo52410x34715b() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v) ((java.util.LinkedList) this.f169528d).peekFirst();
    }

    public final synchronized void q(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b bVar) {
        this.f169530f = bVar.Y1();
        this.f169529e = false;
        r(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v(bVar));
        mo52410x34715b().f169649d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f169526b) ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.w(this.f169526b);
    }

    public synchronized void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v vVar) {
        int i17 = vVar.f169646a;
        if (((java.util.LinkedList) this.f169528d).peekFirst() != vVar) {
            ((java.util.LinkedList) this.f169528d).offerFirst(vVar);
        }
        this.f169527c.put(vVar.f169646a, vVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005c A[Catch: all -> 0x007e, TryCatch #3 {, blocks: (B:3:0x0001, B:5:0x000c, B:8:0x0014, B:12:0x0017, B:13:0x0018, B:15:0x0019, B:16:0x002f, B:19:0x0036, B:21:0x0039, B:23:0x0041, B:28:0x0055, B:32:0x0058, B:33:0x0059, B:36:0x005c, B:37:0x0064, B:43:0x007c, B:44:0x007d, B:7:0x000d, B:25:0x0042, B:27:0x004e, B:18:0x0030), top: B:2:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void s(com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b r7, com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r8.Y1()     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r6.c(r0)     // Catch: java.lang.Throwable -> L7e
            r1 = 0
            if (r0 == 0) goto L19
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7e
            r6.f169531g = r1     // Catch: java.lang.Throwable -> L16
            r6.f169530f = r1     // Catch: java.lang.Throwable -> L16
            r2 = 0
            r6.f169529e = r2     // Catch: java.lang.Throwable -> L16
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            goto L19
        L16:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            throw r7     // Catch: java.lang.Throwable -> L7e
        L19:
            com.tencent.mm.plugin.appbrand.report.model.v r2 = r6.p(r8)     // Catch: java.lang.Throwable -> L7e
            r6.f169531g = r2     // Catch: java.lang.Throwable -> L7e
            com.tencent.mm.plugin.appbrand.report.model.x r3 = new com.tencent.mm.plugin.appbrand.report.model.x     // Catch: java.lang.Throwable -> L7e
            java.lang.String r4 = r7.Y1()     // Catch: java.lang.Throwable -> L7e
            r5 = 1
            r3.<init>(r5, r4)     // Catch: java.lang.Throwable -> L7e
            r2.f169648c = r3     // Catch: java.lang.Throwable -> L7e
            int r2 = r7.hashCode()     // Catch: java.lang.Throwable -> L7e
        L2f:
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7e
            java.util.Deque r3 = r6.f169528d     // Catch: java.lang.Throwable -> L7b
            boolean r3 = r3.isEmpty()     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L7e
            if (r3 != 0) goto L5a
            com.tencent.mm.plugin.appbrand.report.model.v r3 = r6.mo52410x34715b()     // Catch: java.lang.Throwable -> L7e
            int r3 = r3.f169646a     // Catch: java.lang.Throwable -> L7e
            if (r3 == r2) goto L5a
            monitor-enter(r6)     // Catch: java.lang.Throwable -> L7e
            java.util.Deque r3 = r6.f169528d     // Catch: java.lang.Throwable -> L57
            java.util.LinkedList r3 = (java.util.LinkedList) r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.pollFirst()     // Catch: java.lang.Throwable -> L57
            com.tencent.mm.plugin.appbrand.report.model.v r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.v) r3     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L55
            int r3 = r3.f169646a     // Catch: java.lang.Throwable -> L57
            android.util.SparseArray r4 = r6.f169527c     // Catch: java.lang.Throwable -> L57
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
            r0.f169649d = r2     // Catch: java.lang.Throwable -> L7e
            com.tencent.mm.plugin.appbrand.report.model.v r7 = r6.p(r7)     // Catch: java.lang.Throwable -> L7e
            r7.f169648c = r1     // Catch: java.lang.Throwable -> L7e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.i.s(com.tencent.luggage.sdk.jsapi.component.b, com.tencent.luggage.sdk.jsapi.component.b):void");
    }
}
