package x0;

/* loaded from: classes14.dex */
public final class d extends x0.e {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(int r5, x0.s r6) {
        /*
            r4 = this;
            java.lang.String r0 = "invalid"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.Object r0 = x0.z.f532496b
            monitor-enter(r0)
            java.util.List r1 = x0.z.f532501g     // Catch: java.lang.Throwable -> L2f
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2f
            r2 = r2 ^ 1
            r3 = 0
            if (r2 == 0) goto L18
            java.util.List r1 = kz5.n0.V0(r1)     // Catch: java.lang.Throwable -> L2f
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 == 0) goto L29
            java.lang.Object r2 = kz5.n0.B0(r1)     // Catch: java.lang.Throwable -> L2f
            yz5.l r2 = (yz5.l) r2     // Catch: java.lang.Throwable -> L2f
            if (r2 != 0) goto L2a
            x0.a r2 = new x0.a     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L2f
            goto L2a
        L29:
            r2 = r3
        L2a:
            monitor-exit(r0)
            r4.<init>(r5, r6, r3, r2)
            return
        L2f:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.d.<init>(int, x0.s):void");
    }

    @Override // x0.e, x0.m
    public void c() {
        synchronized (x0.z.f532496b) {
            int i17 = this.f532444d;
            if (i17 >= 0) {
                x0.z.s(i17);
                this.f532444d = -1;
            }
        }
    }

    @Override // x0.e, x0.m
    public void j(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public void k(x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.m0.a();
        throw null;
    }

    @Override // x0.e, x0.m
    public void l() {
        x0.z.a();
    }

    @Override // x0.e, x0.m
    public x0.m r(yz5.l lVar) {
        return (x0.m) x0.z.f(new x0.y(new x0.c(lVar)));
    }

    @Override // x0.e
    public x0.p t() {
        throw new java.lang.IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot".toString());
    }

    @Override // x0.e
    public x0.e y(yz5.l lVar, yz5.l lVar2) {
        return (x0.e) ((x0.m) x0.z.f(new x0.y(new x0.b(lVar, lVar2))));
    }
}
