package pi0;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: t, reason: collision with root package name */
    public static int f436227t;

    /* renamed from: u, reason: collision with root package name */
    public static int f436228u;

    /* renamed from: v, reason: collision with root package name */
    public static int f436229v;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f436230a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f436231b;

    /* renamed from: c, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f436232c;

    /* renamed from: d, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 f436233d;

    /* renamed from: e, reason: collision with root package name */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e f436234e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f436235f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f436236g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f436237h;

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.r2 f436238i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f436239j;

    /* renamed from: k, reason: collision with root package name */
    public final pi0.w f436240k;

    /* renamed from: l, reason: collision with root package name */
    public final pi0.y f436241l;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashSet f436242m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.HashSet f436243n;

    /* renamed from: o, reason: collision with root package name */
    public pi0.a f436244o;

    /* renamed from: p, reason: collision with root package name */
    public final long f436245p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f436246q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.l f436247r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f436248s;

    public q(android.content.Context context, java.lang.String[] dartVmArgs, p3325xe03a0797.p3326xc267989b.r2 r2Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dartVmArgs, "dartVmArgs");
        this.f436230a = context;
        this.f436231b = dartVmArgs;
        this.f436232c = r2Var;
        this.f436235f = new java.util.LinkedList();
        this.f436236g = new java.util.LinkedList();
        this.f436237h = java.lang.String.valueOf(hashCode());
        this.f436239j = true;
        this.f436240k = new pi0.w();
        this.f436241l = new pi0.y();
        this.f436242m = new java.util.HashSet();
        this.f436243n = new java.util.HashSet();
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
        io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "init: " + this);
        this.f436245p = java.lang.System.currentTimeMillis();
        this.f436238i = p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new pi0.g(this, null), 3, null);
        f436227t++;
    }

    public final void a(java.lang.Object ref) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ref, "ref");
        synchronized (this.f436242m) {
            io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "addRef:" + ref);
            this.f436242m.add(ref);
            if (ref instanceof pi0.l1) {
                this.f436243n.add(ref);
                yz5.l lVar = this.f436246q;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f436243n.size()));
                }
            }
        }
    }

    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.Object C;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f436238i;
        boolean z17 = false;
        if (r2Var != null && ((p3325xe03a0797.p3326xc267989b.a) r2Var).a()) {
            z17 = true;
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (z17) {
            io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "await initJob");
            if (r2Var != null && (C = ((p3325xe03a0797.p3326xc267989b.c3) r2Var).C(interfaceC29045xdcb5ca57)) == pz5.a.f440719d) {
                return C;
            }
        }
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(android.content.Context r5, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint r6, java.lang.String r7, boolean r8, java.util.List r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r4 = this;
            boolean r0 = r10 instanceof pi0.c
            if (r0 == 0) goto L13
            r0 = r10
            pi0.c r0 = (pi0.c) r0
            int r1 = r0.f436070o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f436070o = r1
            goto L18
        L13:
            pi0.c r0 = new pi0.c
            r0.<init>(r4, r10)
        L18:
            java.lang.Object r10 = r0.f436068m
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f436070o
            r3 = 1
            if (r2 == 0) goto L48
            if (r2 != r3) goto L40
            boolean r8 = r0.f436067i
            java.lang.Object r5 = r0.f436066h
            r9 = r5
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r5 = r0.f436065g
            r7 = r5
            java.lang.String r7 = (java.lang.String) r7
            java.lang.Object r5 = r0.f436064f
            r6 = r5
            io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint r6 = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192.DartEntrypoint) r6
            java.lang.Object r5 = r0.f436063e
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r0 = r0.f436062d
            pi0.q r0 = (pi0.q) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L61
        L40:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L48:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r0.f436062d = r4
            r0.f436063e = r5
            r0.f436064f = r6
            r0.f436065g = r7
            r0.f436066h = r9
            r0.f436067i = r8
            r0.f436070o = r3
            java.lang.Object r10 = r4.b(r0)
            if (r10 != r1) goto L60
            return r1
        L60:
            r0 = r4
        L61:
            io.flutter.embedding.engine.MMFlutterEngineGroup r10 = r0.d()
            io.flutter.embedding.engine.FlutterEngineGroup$Options r1 = new io.flutter.embedding.engine.FlutterEngineGroup$Options
            r1.<init>(r5)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r1.m137547x382db23f(r6)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r5.m137549x7e19e2e7(r7)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r5.m137546x1c0b3adc(r8)
            io.flutter.embedding.engine.FlutterEngineGroup$Options r5 = r5.m137548x299bbfbc(r9)
            java.lang.String r6 = "setDartEntrypointArgs(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            io.flutter.embedding.engine.FlutterEngine r5 = r10.m137784xf6bf6fb2(r5)
            int r6 = pi0.q.f436229v
            int r6 = r6 + r3
            pi0.q.f436229v = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "create engine "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "MicroMsg.CachedFlutterEngineGroup"
            io.p3284xd2ae381c.Log.i(r7, r6)
            r0.a(r5)
            pi0.u r6 = new pi0.u
            java.lang.String r7 = "liteapp"
            r6.<init>(r5, r7)
            java.util.LinkedList r7 = r0.f436236g
            r7.add(r6)
            pi0.d r7 = new pi0.d
            r7.<init>(r5, r0, r6)
            r5.m137415x4aac123b(r7)
            boolean r7 = r0.f436248s
            if (r7 == 0) goto Lcd
            com.tencent.pigeon.weapm.WeAPMFlutterApi r7 = new com.tencent.pigeon.weapm.WeAPMFlutterApi
            io.flutter.embedding.engine.FlutterEngine r6 = r6.f436260a
            io.flutter.embedding.engine.dart.DartExecutor r6 = r6.m137427x4255efe8()
            java.lang.String r8 = "getDartExecutor(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r8)
            r8 = 2
            r9 = 0
            r7.<init>(r6, r9, r8, r9)
            pi0.e r6 = pi0.e.f436089d
            r7.m93365x5fc6988c(r6)
        Lcd:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.q.c(android.content.Context, io.flutter.embedding.engine.dart.DartExecutor$DartEntrypoint, java.lang.String, boolean, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 d() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 c28591xc5594961 = this.f436233d;
        if (c28591xc5594961 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c28591xc5594961);
            return c28591xc5594961;
        }
        throw new java.lang.RuntimeException(this + " group is not initialized!");
    }

    public final int e() {
        java.util.List<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e> m137789x177a50d5;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28591xc5594961 c28591xc5594961 = this.f436233d;
        if (c28591xc5594961 == null || (m137789x177a50d5 = c28591xc5594961.m137789x177a50d5()) == null) {
            return 0;
        }
        return m137789x177a50d5.size();
    }

    public final void f(java.lang.Object ref) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ref, "ref");
        synchronized (this.f436242m) {
            io.p3284xd2ae381c.Log.i("MicroMsg.CachedFlutterEngineGroup", "removeRef:" + ref);
            this.f436242m.remove(ref);
            if (ref instanceof pi0.l1) {
                this.f436243n.remove(ref);
                yz5.l lVar = this.f436246q;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Integer.valueOf(this.f436243n.size()));
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0218 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01d9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(pi0.m1 r32, boolean r33, boolean r34, boolean r35, yz5.l r36, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r37) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.q.g(pi0.m1, boolean, boolean, boolean, yz5.l, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
