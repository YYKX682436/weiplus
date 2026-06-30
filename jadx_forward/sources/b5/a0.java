package b5;

/* loaded from: classes13.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final java.lang.String f99365z = a5.a0.e("WorkerWrapper");

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f99366d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f99367e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f99368f;

    /* renamed from: g, reason: collision with root package name */
    public final a5.x0 f99369g;

    /* renamed from: h, reason: collision with root package name */
    public j5.w f99370h;

    /* renamed from: m, reason: collision with root package name */
    public final m5.a f99372m;

    /* renamed from: o, reason: collision with root package name */
    public final a5.d f99374o;

    /* renamed from: p, reason: collision with root package name */
    public final i5.a f99375p;

    /* renamed from: q, reason: collision with root package name */
    public final p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc f99376q;

    /* renamed from: r, reason: collision with root package name */
    public final j5.x f99377r;

    /* renamed from: s, reason: collision with root package name */
    public final j5.b f99378s;

    /* renamed from: t, reason: collision with root package name */
    public final j5.i0 f99379t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f99380u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f99381v;

    /* renamed from: y, reason: collision with root package name */
    public volatile boolean f99384y;

    /* renamed from: n, reason: collision with root package name */
    public a5.y f99373n = new a5.v();

    /* renamed from: w, reason: collision with root package name */
    public final l5.m f99382w = new l5.m();

    /* renamed from: x, reason: collision with root package name */
    public wa.a f99383x = null;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p125x37c711.AbstractC1260xfe49ee9f f99371i = null;

    public a0(b5.z zVar) {
        this.f99366d = zVar.f99443a;
        this.f99372m = zVar.f99445c;
        this.f99375p = zVar.f99444b;
        this.f99367e = zVar.f99448f;
        this.f99368f = zVar.f99449g;
        this.f99369g = zVar.f99450h;
        this.f99374o = zVar.f99446d;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = zVar.f99447e;
        this.f99376q = abstractC1265x5c5aefcc;
        this.f99377r = abstractC1265x5c5aefcc.n();
        this.f99378s = abstractC1265x5c5aefcc.i();
        this.f99379t = abstractC1265x5c5aefcc.o();
    }

    public final void a(a5.y yVar) {
        boolean z17 = yVar instanceof a5.x;
        java.lang.String str = f99365z;
        if (!z17) {
            if (yVar instanceof a5.w) {
                a5.a0.c().d(str, java.lang.String.format("Worker result RETRY for %s", this.f99381v), new java.lang.Throwable[0]);
                d();
                return;
            }
            a5.a0.c().d(str, java.lang.String.format("Worker result FAILURE for %s", this.f99381v), new java.lang.Throwable[0]);
            if (this.f99370h.c()) {
                e();
                return;
            } else {
                h();
                return;
            }
        }
        a5.a0.c().d(str, java.lang.String.format("Worker result SUCCESS for %s", this.f99381v), new java.lang.Throwable[0]);
        if (this.f99370h.c()) {
            e();
            return;
        }
        j5.b bVar = this.f99378s;
        java.lang.String str2 = this.f99367e;
        j5.x xVar = this.f99377r;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = this.f99376q;
        abstractC1265x5c5aefcc.c();
        try {
            ((j5.g0) xVar).p(a5.q0.SUCCEEDED, str2);
            ((j5.g0) xVar).n(str2, ((a5.x) this.f99373n).f82973a);
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            java.util.Iterator it = ((java.util.ArrayList) ((j5.d) bVar).a(str2)).iterator();
            while (it.hasNext()) {
                java.lang.String str3 = (java.lang.String) it.next();
                if (((j5.g0) xVar).f(str3) == a5.q0.BLOCKED && ((j5.d) bVar).b(str3)) {
                    a5.a0.c().d(str, java.lang.String.format("Setting status to enqueued for %s", str3), new java.lang.Throwable[0]);
                    ((j5.g0) xVar).p(a5.q0.ENQUEUED, str3);
                    ((j5.g0) xVar).o(str3, currentTimeMillis);
                }
            }
            abstractC1265x5c5aefcc.h();
        } finally {
            abstractC1265x5c5aefcc.f();
            f(false);
        }
    }

    public final void b(java.lang.String str) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            java.lang.String str2 = (java.lang.String) linkedList.remove();
            j5.x xVar = this.f99377r;
            if (((j5.g0) xVar).f(str2) != a5.q0.CANCELLED) {
                ((j5.g0) xVar).p(a5.q0.FAILED, str2);
            }
            linkedList.addAll(((j5.d) this.f99378s).a(str2));
        }
    }

    public void c() {
        boolean i17 = i();
        java.lang.String str = this.f99367e;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = this.f99376q;
        if (!i17) {
            abstractC1265x5c5aefcc.c();
            try {
                a5.q0 f17 = ((j5.g0) this.f99377r).f(str);
                ((j5.u) abstractC1265x5c5aefcc.m()).a(str);
                if (f17 == null) {
                    f(false);
                } else if (f17 == a5.q0.RUNNING) {
                    a(this.f99373n);
                } else if (!f17.h()) {
                    d();
                }
                abstractC1265x5c5aefcc.h();
            } finally {
                abstractC1265x5c5aefcc.f();
            }
        }
        java.util.List list = this.f99368f;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((b5.f) it.next()).b(str);
            }
            b5.g.a(this.f99374o, abstractC1265x5c5aefcc, list);
        }
    }

    public final void d() {
        java.lang.String str = this.f99367e;
        j5.x xVar = this.f99377r;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = this.f99376q;
        abstractC1265x5c5aefcc.c();
        try {
            ((j5.g0) xVar).p(a5.q0.ENQUEUED, str);
            ((j5.g0) xVar).o(str, java.lang.System.currentTimeMillis());
            ((j5.g0) xVar).l(str, -1L);
            abstractC1265x5c5aefcc.h();
        } finally {
            abstractC1265x5c5aefcc.f();
            f(true);
        }
    }

    public final void e() {
        java.lang.String str = this.f99367e;
        j5.x xVar = this.f99377r;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = this.f99376q;
        abstractC1265x5c5aefcc.c();
        try {
            ((j5.g0) xVar).o(str, java.lang.System.currentTimeMillis());
            ((j5.g0) xVar).p(a5.q0.ENQUEUED, str);
            ((j5.g0) xVar).m(str);
            ((j5.g0) xVar).l(str, -1L);
            abstractC1265x5c5aefcc.h();
        } finally {
            abstractC1265x5c5aefcc.f();
            f(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0042, B:15:0x005c, B:17:0x0060, B:19:0x0064, B:21:0x006a, B:22:0x0072, B:30:0x0081, B:32:0x0082, B:38:0x0097, B:39:0x009d, B:5:0x0021, B:7:0x0028, B:24:0x0073, B:25:0x007d), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042 A[Catch: all -> 0x009e, TryCatch #1 {all -> 0x009e, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0042, B:15:0x005c, B:17:0x0060, B:19:0x0064, B:21:0x006a, B:22:0x0072, B:30:0x0081, B:32:0x0082, B:38:0x0097, B:39:0x009d, B:5:0x0021, B:7:0x0028, B:24:0x0073, B:25:0x007d), top: B:2:0x0005, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(boolean r6) {
        /*
            r5 = this;
            androidx.work.impl.WorkDatabase r0 = r5.f99376q
            r0.c()
            androidx.work.impl.WorkDatabase r0 = r5.f99376q     // Catch: java.lang.Throwable -> L9e
            j5.x r0 = r0.n()     // Catch: java.lang.Throwable -> L9e
            j5.g0 r0 = (j5.g0) r0     // Catch: java.lang.Throwable -> L9e
            r0.getClass()     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            l4.u r1 = l4.u.c(r1, r2)     // Catch: java.lang.Throwable -> L9e
            l4.q r0 = r0.f379267a     // Catch: java.lang.Throwable -> L9e
            r0.b()     // Catch: java.lang.Throwable -> L9e
            r3 = 0
            android.database.Cursor r0 = n4.b.a(r0, r1, r2, r3)     // Catch: java.lang.Throwable -> L9e
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L96
            r4 = 1
            if (r3 == 0) goto L30
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L96
            if (r3 == 0) goto L30
            r3 = r4
            goto L31
        L30:
            r3 = r2
        L31:
            r0.close()     // Catch: java.lang.Throwable -> L9e
            r1.m145068x41012807()     // Catch: java.lang.Throwable -> L9e
            if (r3 != 0) goto L40
            android.content.Context r0 = r5.f99366d     // Catch: java.lang.Throwable -> L9e
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = p012xc85e97e9.p125x37c711.p126x316220.p127xb098552e.p128xa4980d82.C1272x29775df9.class
            k5.h.a(r0, r1, r2)     // Catch: java.lang.Throwable -> L9e
        L40:
            if (r6 == 0) goto L5c
            j5.x r0 = r5.f99377r     // Catch: java.lang.Throwable -> L9e
            a5.q0 r1 = a5.q0.ENQUEUED     // Catch: java.lang.Throwable -> L9e
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch: java.lang.Throwable -> L9e
            java.lang.String r4 = r5.f99367e     // Catch: java.lang.Throwable -> L9e
            r3[r2] = r4     // Catch: java.lang.Throwable -> L9e
            j5.g0 r0 = (j5.g0) r0     // Catch: java.lang.Throwable -> L9e
            r0.p(r1, r3)     // Catch: java.lang.Throwable -> L9e
            j5.x r0 = r5.f99377r     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r5.f99367e     // Catch: java.lang.Throwable -> L9e
            j5.g0 r0 = (j5.g0) r0     // Catch: java.lang.Throwable -> L9e
            r2 = -1
            r0.l(r1, r2)     // Catch: java.lang.Throwable -> L9e
        L5c:
            j5.w r0 = r5.f99370h     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L82
            androidx.work.ListenableWorker r0 = r5.f99371i     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L82
            boolean r0 = r0.c()     // Catch: java.lang.Throwable -> L9e
            if (r0 == 0) goto L82
            i5.a r0 = r5.f99375p     // Catch: java.lang.Throwable -> L9e
            java.lang.String r1 = r5.f99367e     // Catch: java.lang.Throwable -> L9e
            b5.e r0 = (b5.e) r0     // Catch: java.lang.Throwable -> L9e
            java.lang.Object r2 = r0.f99401q     // Catch: java.lang.Throwable -> L9e
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L9e
            java.util.Map r3 = r0.f99396i     // Catch: java.lang.Throwable -> L7f
            java.util.HashMap r3 = (java.util.HashMap) r3     // Catch: java.lang.Throwable -> L7f
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7f
            r0.g()     // Catch: java.lang.Throwable -> L7f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
            goto L82
        L7f:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7f
            throw r6     // Catch: java.lang.Throwable -> L9e
        L82:
            androidx.work.impl.WorkDatabase r0 = r5.f99376q     // Catch: java.lang.Throwable -> L9e
            r0.h()     // Catch: java.lang.Throwable -> L9e
            androidx.work.impl.WorkDatabase r0 = r5.f99376q
            r0.f()
            l5.m r0 = r5.f99382w
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            r0.i(r6)
            return
        L96:
            r6 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L9e
            r1.m145068x41012807()     // Catch: java.lang.Throwable -> L9e
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r6 = move-exception
            androidx.work.impl.WorkDatabase r0 = r5.f99376q
            r0.f()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.a0.f(boolean):void");
    }

    public final void g() {
        j5.g0 g0Var = (j5.g0) this.f99377r;
        java.lang.String str = this.f99367e;
        a5.q0 f17 = g0Var.f(str);
        a5.q0 q0Var = a5.q0.RUNNING;
        java.lang.String str2 = f99365z;
        if (f17 == q0Var) {
            a5.a0.c().a(str2, java.lang.String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", str), new java.lang.Throwable[0]);
            f(true);
        } else {
            a5.a0.c().a(str2, java.lang.String.format("Status for %s is %s; not doing any work", str, f17), new java.lang.Throwable[0]);
            f(false);
        }
    }

    public void h() {
        java.lang.String str = this.f99367e;
        p012xc85e97e9.p125x37c711.p126x316220.AbstractC1265x5c5aefcc abstractC1265x5c5aefcc = this.f99376q;
        abstractC1265x5c5aefcc.c();
        try {
            b(str);
            ((j5.g0) this.f99377r).n(str, ((a5.v) this.f99373n).f82971a);
            abstractC1265x5c5aefcc.h();
        } finally {
            abstractC1265x5c5aefcc.f();
            f(false);
        }
    }

    public final boolean i() {
        if (!this.f99384y) {
            return false;
        }
        a5.a0.c().a(f99365z, java.lang.String.format("Work interrupted for %s", this.f99381v), new java.lang.Throwable[0]);
        if (((j5.g0) this.f99377r).f(this.f99367e) == null) {
            f(false);
        } else {
            f(!r0.h());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b8, code lost:
    
        if ((r0.f379298b == r9 && r0.f379307k > 0) != false) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b5.a0.run():void");
    }
}
