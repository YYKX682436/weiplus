package w56;

/* loaded from: classes16.dex */
public class c implements p56.m {

    /* renamed from: d, reason: collision with root package name */
    public final p56.m f524579d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f524580e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f524581f;

    /* renamed from: g, reason: collision with root package name */
    public w56.b f524582g;

    public c(p56.m mVar) {
        this.f524579d = mVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x002d, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[LOOP:1: B:32:0x003f->B:41:0x0073, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0070 A[SYNTHETIC] */
    @Override // p56.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.Object r11) {
        /*
            r10 = this;
            boolean r0 = r10.f524581f
            if (r0 == 0) goto L5
            return
        L5:
            monitor-enter(r10)
            boolean r0 = r10.f524581f     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto Lc
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            return
        Lc:
            boolean r0 = r10.f524580e     // Catch: java.lang.Throwable -> L92
            if (r0 == 0) goto L24
            w56.b r0 = r10.f524582g     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L1b
            w56.b r0 = new w56.b     // Catch: java.lang.Throwable -> L92
            r0.<init>()     // Catch: java.lang.Throwable -> L92
            r10.f524582g = r0     // Catch: java.lang.Throwable -> L92
        L1b:
            if (r11 != 0) goto L1f
            java.lang.Object r11 = s56.j.f484750c     // Catch: java.lang.Throwable -> L92
        L1f:
            r0.a(r11)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            return
        L24:
            r0 = 1
            r10.f524580e = r0     // Catch: java.lang.Throwable -> L92
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            p56.m r1 = r10.f524579d     // Catch: java.lang.Throwable -> L89
            r1.a(r11)     // Catch: java.lang.Throwable -> L89
        L2d:
            monitor-enter(r10)
            w56.b r1 = r10.f524582g     // Catch: java.lang.Throwable -> L86
            r2 = 0
            if (r1 != 0) goto L37
            r10.f524580e = r2     // Catch: java.lang.Throwable -> L86
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L86
            return
        L37:
            r3 = 0
            r10.f524582g = r3     // Catch: java.lang.Throwable -> L86
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L86
            java.lang.Object[] r1 = r1.f524577a
            int r4 = r1.length
            r5 = r2
        L3f:
            if (r5 >= r4) goto L2d
            r6 = r1[r5]
            if (r6 != 0) goto L46
            goto L2d
        L46:
            p56.m r7 = r10.f524579d     // Catch: java.lang.Throwable -> L76
            java.lang.Object r8 = s56.j.f484749b     // Catch: java.lang.Throwable -> L76
            if (r6 != r8) goto L51
            r7.mo157868xaa8b332c()     // Catch: java.lang.Throwable -> L76
        L4f:
            r6 = r0
            goto L6e
        L51:
            java.lang.Object r8 = s56.j.f484750c     // Catch: java.lang.Throwable -> L76
            if (r6 != r8) goto L5a
            r7.a(r3)     // Catch: java.lang.Throwable -> L76
        L58:
            r6 = r2
            goto L6e
        L5a:
            java.lang.Class r8 = r6.getClass()     // Catch: java.lang.Throwable -> L76
            java.lang.Class<s56.i> r9 = s56.i.class
            if (r8 != r9) goto L6a
            s56.i r6 = (s56.i) r6     // Catch: java.lang.Throwable -> L76
            java.lang.Throwable r6 = r6.f484747d     // Catch: java.lang.Throwable -> L76
            r7.mo157869xaf8aa769(r6)     // Catch: java.lang.Throwable -> L76
            goto L4f
        L6a:
            r7.a(r6)     // Catch: java.lang.Throwable -> L76
            goto L58
        L6e:
            if (r6 == 0) goto L73
            r10.f524581f = r0     // Catch: java.lang.Throwable -> L76
            return
        L73:
            int r5 = r5 + 1
            goto L3f
        L76:
            r1 = move-exception
            r10.f524581f = r0
            q56.f.b(r1)
            p56.m r0 = r10.f524579d
            java.lang.Throwable r11 = q56.m.a(r1, r11)
            r0.mo157869xaf8aa769(r11)
            return
        L86:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L86
            throw r11
        L89:
            r1 = move-exception
            r10.f524581f = r0
            p56.m r0 = r10.f524579d
            q56.f.d(r1, r0, r11)
            return
        L92:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L92
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: w56.c.a(java.lang.Object):void");
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        if (this.f524581f) {
            return;
        }
        synchronized (this) {
            if (this.f524581f) {
                return;
            }
            this.f524581f = true;
            if (!this.f524580e) {
                this.f524580e = true;
                this.f524579d.mo157868xaa8b332c();
                return;
            }
            w56.b bVar = this.f524582g;
            if (bVar == null) {
                bVar = new w56.b();
                this.f524582g = bVar;
            }
            bVar.a(s56.j.f484749b);
        }
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        q56.f.b(th6);
        if (this.f524581f) {
            return;
        }
        synchronized (this) {
            if (this.f524581f) {
                return;
            }
            this.f524581f = true;
            if (!this.f524580e) {
                this.f524580e = true;
                this.f524579d.mo157869xaf8aa769(th6);
                return;
            }
            w56.b bVar = this.f524582g;
            if (bVar == null) {
                bVar = new w56.b();
                this.f524582g = bVar;
            }
            bVar.a(new s56.i(th6));
        }
    }
}
