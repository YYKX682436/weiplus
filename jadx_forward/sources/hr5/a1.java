package hr5;

/* loaded from: classes15.dex */
public final class a1 {
    public zq5.n A;
    public zq5.n B;
    public long C;
    public zq5.n D;
    public gr5.i0 E;
    public zq5.n F;
    public int G;
    public hr5.n H;
    public hr5.m I;

    /* renamed from: J, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f365809J;

    /* renamed from: a, reason: collision with root package name */
    public final zq5.k f365810a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f365811b;

    /* renamed from: c, reason: collision with root package name */
    public final hr5.a f365812c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f365813d;

    /* renamed from: e, reason: collision with root package name */
    public long f365814e;

    /* renamed from: f, reason: collision with root package name */
    public long f365815f;

    /* renamed from: g, reason: collision with root package name */
    public long f365816g;

    /* renamed from: h, reason: collision with root package name */
    public gr5.n f365817h;

    /* renamed from: i, reason: collision with root package name */
    public gr5.b f365818i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f365819j;

    /* renamed from: k, reason: collision with root package name */
    public gr5.e0 f365820k;

    /* renamed from: l, reason: collision with root package name */
    public final gr5.h0 f365821l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f365822m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f365823n;

    /* renamed from: o, reason: collision with root package name */
    public final gr5.y f365824o;

    /* renamed from: p, reason: collision with root package name */
    public gr5.d f365825p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f365826q;

    /* renamed from: r, reason: collision with root package name */
    public final gr5.f f365827r;

    /* renamed from: s, reason: collision with root package name */
    public zq5.v f365828s;

    /* renamed from: t, reason: collision with root package name */
    public zq5.v f365829t;

    /* renamed from: u, reason: collision with root package name */
    public zq5.v f365830u;

    /* renamed from: v, reason: collision with root package name */
    public float f365831v;

    /* renamed from: w, reason: collision with root package name */
    public float f365832w;

    /* renamed from: x, reason: collision with root package name */
    public float f365833x;

    /* renamed from: y, reason: collision with root package name */
    public zq5.n f365834y;

    /* renamed from: z, reason: collision with root package name */
    public zq5.n f365835z;

    public a1(zq5.k logger, java.lang.String module, hr5.a animationAdapter, yz5.l onTransformChanged) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(logger, "logger");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animationAdapter, "animationAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTransformChanged, "onTransformChanged");
        this.f365810a = logger;
        this.f365811b = module;
        this.f365812c = animationAdapter;
        this.f365813d = onTransformChanged;
        int i17 = zq5.g.f556599c;
        long j17 = zq5.g.f556598b;
        this.f365814e = j17;
        this.f365815f = j17;
        this.f365816g = j17;
        int i18 = gr5.n.f356474a;
        this.f365817h = gr5.m.f356468b;
        int i19 = gr5.b.f356442a;
        this.f365818i = gr5.a.f356436e;
        gr5.h0.f356463a.getClass();
        this.f365821l = gr5.f0.f356459b;
        this.f365823n = true;
        gr5.y yVar = gr5.y.f356487b;
        this.f365824o = gr5.y.f356487b;
        this.f365827r = gr5.f.f356453e;
        zq5.v vVar = zq5.v.f556627f;
        zq5.v vVar2 = zq5.v.f556627f;
        this.f365828s = vVar2;
        this.f365829t = vVar2;
        this.f365830u = vVar2;
        this.f365831v = 1.0f;
        this.f365832w = 1.0f;
        this.f365833x = 1.0f;
        zq5.n nVar = zq5.n.f556614e;
        this.f365834y = nVar;
        this.f365835z = nVar;
        this.A = nVar;
        this.B = nVar;
        this.C = zq5.s.b(zq5.q.f556619b);
        this.D = nVar;
        gr5.i0 i0Var = gr5.i0.f356464c;
        this.E = gr5.i0.f356464c;
        this.F = nVar;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        this.f365809J = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0085 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(hr5.a1 r6, zq5.v r7, java.lang.Integer r8, gr5.d r9, java.lang.String r10, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r11) {
        /*
            r6.getClass()
            boolean r0 = r11 instanceof hr5.q
            if (r0 == 0) goto L16
            r0 = r11
            hr5.q r0 = (hr5.q) r0
            int r1 = r0.f365988i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f365988i = r1
            goto L1b
        L16:
            hr5.q r0 = new hr5.q
            r0.<init>(r6, r11)
        L1b:
            java.lang.Object r11 = r0.f365986g
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f365988i
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 != r4) goto L3b
            java.lang.Object r6 = r0.f365985f
            r10 = r6
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r0.f365984e
            r8 = r6
            java.lang.Integer r8 = (java.lang.Integer) r8
            java.lang.Object r6 = r0.f365983d
            hr5.a1 r6 = (hr5.a1) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Throwable -> L39
            goto L79
        L39:
            r7 = move-exception
            goto L8b
        L3b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L43:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            if (r9 != 0) goto L4a
            gr5.d r9 = r6.f365825p
        L4a:
            zq5.v r11 = r6.f365829t
            if (r8 == 0) goto L55
            int r2 = r8.intValue()
            r6.f(r2)
        L55:
            zq5.k r2 = r6.f365810a     // Catch: java.lang.Throwable -> L39
            hr5.r r5 = new hr5.r     // Catch: java.lang.Throwable -> L39
            r5.<init>(r6, r10)     // Catch: java.lang.Throwable -> L39
            r2.a(r5)     // Catch: java.lang.Throwable -> L39
            hr5.a r2 = r6.f365812c     // Catch: java.lang.Throwable -> L39
            hr5.t r5 = new hr5.t     // Catch: java.lang.Throwable -> L39
            r5.<init>(r11, r7, r6, r10)     // Catch: java.lang.Throwable -> L39
            hr5.u r7 = hr5.u.f366007d     // Catch: java.lang.Throwable -> L39
            r0.f365983d = r6     // Catch: java.lang.Throwable -> L39
            r0.f365984e = r8     // Catch: java.lang.Throwable -> L39
            r0.f365985f = r10     // Catch: java.lang.Throwable -> L39
            r0.f365988i = r4     // Catch: java.lang.Throwable -> L39
            fr5.p0 r2 = (fr5.p0) r2     // Catch: java.lang.Throwable -> L39
            java.lang.Object r7 = r2.a(r9, r5, r7, r0)     // Catch: java.lang.Throwable -> L39
            if (r7 != r1) goto L79
            goto L8a
        L79:
            zq5.k r7 = r6.f365810a     // Catch: java.lang.Throwable -> L39
            hr5.v r9 = new hr5.v     // Catch: java.lang.Throwable -> L39
            r9.<init>(r6, r10)     // Catch: java.lang.Throwable -> L39
            r7.a(r9)     // Catch: java.lang.Throwable -> L39
            if (r8 == 0) goto L88
            r6.f(r3)
        L88:
            jz5.f0 r1 = jz5.f0.f384359a
        L8a:
            return r1
        L8b:
            if (r8 == 0) goto L90
            r6.f(r3)
        L90:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.a(hr5.a1, zq5.v, java.lang.Integer, gr5.d, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:177:0x05f8, code lost:
    
        if (r2 == false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d1, code lost:
    
        if (r10.f365956j != r3.f365956j) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if ((r10.f365957k == r3.f365957k) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01b5, code lost:
    
        if (r7 <= zq5.g.b(r13)) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x063a  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(hr5.a1 r56, java.lang.String r57, boolean r58, int r59, java.lang.Object r60) {
        /*
            Method dump skipped, instructions count: 1934
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.e(hr5.a1, java.lang.String, boolean, int, java.lang.Object):void");
    }

    public final gr5.f b() {
        long j17 = this.f365814e;
        gr5.f fVar = this.f365827r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        if (!(fVar.f356454a <= 0.0f && fVar.f356455b <= 0.0f && fVar.f356456c <= 0.0f && fVar.f356457d <= 0.0f)) {
            return fVar;
        }
        zq5.h.c(j17);
        return gr5.f.f356453e;
    }

    public final long c(long j17, float f17) {
        gr5.f fVar;
        long j18 = this.f365814e;
        long j19 = this.f365815f;
        gr5.n nVar = this.f365817h;
        gr5.b bVar = this.f365818i;
        boolean z17 = this.f365819j;
        boolean z18 = this.f365826q;
        gr5.f b17 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f365819j);
        if (valueOf == null || valueOf.booleanValue()) {
            fVar = new gr5.f(b17.f356456c, b17.f356455b, b17.f356454a, b17.f356457d);
        } else {
            fVar = b17;
        }
        zq5.e d17 = zq5.o.d(hr5.b1.f(j18, j19, nVar, bVar, z17, 0, f17, z18, fVar));
        return zq5.m.b(j17, new zq5.n(d17.f556594a, d17.f556595b, d17.f556596c, d17.f556597d));
    }

    public final float d(float f17, boolean z17) {
        float c17 = this.f365831v / this.f365828s.c();
        float c18 = this.f365833x / this.f365828s.c();
        if (!z17) {
            return e06.p.e(f17, c17, c18);
        }
        float c19 = this.f365829t.c();
        if (f17 > c18) {
            float f18 = f17 - c19;
            float f19 = 2.0f * c18;
            if (f17 >= f19) {
                return f19;
            }
            return c19 + (f18 * (1 - ((f17 - c18) / (f19 - c18))) * 0.5f);
        }
        if (f17 >= c17) {
            return f17;
        }
        float f27 = f17 - c19;
        float f28 = c17 / 2.0f;
        if (f17 <= f28) {
            return f28;
        }
        return c19 + (f27 * (1 - ((f17 - c17) / (f28 - c17))) * 0.5f);
    }

    public final void f(int i17) {
        zq5.b.d();
        this.G = i17;
        this.f365813d.mo146xb9724478(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.g(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(long r14, boolean r16, gr5.d r17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hr5.a1.h(long, boolean, gr5.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final long i(long j17) {
        zq5.b.d();
        long j18 = this.f365814e;
        zq5.g gVar = new zq5.g(j18);
        if (!zq5.h.c(j18)) {
            gVar = null;
        }
        if (gVar == null) {
            return zq5.l.f556610b;
        }
        long j19 = gVar.f556600a;
        long j27 = this.f365815f;
        zq5.g gVar2 = zq5.h.c(j27) ? new zq5.g(j27) : null;
        if (gVar2 == null) {
            return zq5.l.f556610b;
        }
        zq5.v vVar = this.f365829t;
        gr5.n contentScale = this.f365817h;
        gr5.b alignment = this.f365818i;
        boolean z17 = this.f365819j;
        float c17 = vVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        if (!zq5.h.b(j19)) {
            long j28 = gVar2.f556600a;
            if (!zq5.h.b(j28)) {
                long a17 = zq5.h.b(j19) ? zq5.l.f556610b : zq5.l.a(zq5.l.d(j17, vVar.f556629b), c17);
                if (zq5.h.b(j19) || zq5.h.b(j28)) {
                    return zq5.l.f556610b;
                }
                long d17 = zq5.h.d(j28, 0);
                zq5.n b17 = hr5.b1.b(j19, d17, contentScale, alignment, z17, 0);
                long d18 = zq5.l.d(a17, zq5.m.a(b17.f556615a, b17.f556616b));
                long a18 = contentScale.a(zq5.h.g(d17), zq5.h.g(j19));
                long a19 = zq5.m.a(zq5.l.b(d18) / zq5.q.b(a18), zq5.l.c(d18) / zq5.q.c(a18));
                long g17 = zq5.h.g(d17);
                return zq5.m.c(zq5.m.b(a19, new zq5.n(0.0f, 0.0f, zq5.t.b(g17), zq5.t.a(g17))), zq5.h.g(j28), 0);
            }
        }
        return zq5.l.f556610b;
    }

    public final void j(zq5.v vVar) {
        long j17;
        zq5.n nVar;
        zq5.n nVar2;
        long b17;
        zq5.n nVar3;
        this.f365829t = vVar;
        this.f365830u = zq5.w.b(this.f365828s, vVar);
        long j18 = this.f365814e;
        long j19 = this.f365815f;
        gr5.n contentScale = this.f365817h;
        gr5.b alignment = this.f365818i;
        boolean z17 = this.f365819j;
        float c17 = vVar.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        boolean b18 = zq5.h.b(j18);
        zq5.n nVar4 = zq5.n.f556614e;
        long j27 = vVar.f556629b;
        if (b18 || zq5.h.b(j19)) {
            j17 = j27;
            nVar = nVar4;
            nVar2 = nVar;
        } else {
            long d17 = zq5.h.d(j19, 0);
            j17 = j27;
            nVar = nVar4;
            long a17 = ((gr5.e) alignment).a(zq5.h.e(d17, contentScale.a(zq5.h.g(d17), zq5.h.g(j18))), j18, !z17);
            int a18 = zq5.c.a(a17);
            int i17 = zq5.g.f556599c;
            nVar2 = new zq5.n((((int) (a17 >> 32)) * c17) + zq5.l.b(j17), (a18 * c17) + zq5.l.c(j17), ((((int) (r11 >> 32)) + r5) * c17) + zq5.l.b(j17), ((zq5.c.a(a17) + zq5.g.b(r11)) * c17) + zq5.l.c(j17));
        }
        this.A = nVar2;
        this.B = hr5.b1.d(this.f365814e, this.f365815f, this.f365817h, this.f365818i, this.f365819j, 0, vVar.c(), vVar.f556629b);
        long j28 = this.f365814e;
        long j29 = this.f365815f;
        gr5.n nVar5 = this.f365817h;
        gr5.b bVar = this.f365818i;
        boolean z18 = this.f365819j;
        float c18 = vVar.c();
        boolean z19 = this.f365826q;
        gr5.f b19 = b();
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(this.f365819j);
        zq5.n f17 = hr5.b1.f(j28, j29, nVar5, bVar, z18, 0, c18, z19, (valueOf == null || valueOf.booleanValue()) ? new gr5.f(b19.f356456c, b19.f356455b, b19.f356454a, b19.f356457d) : b19);
        this.F = f17;
        int b27 = a06.d.b(f17.f556615a);
        int b28 = a06.d.b(f17.f556617c);
        int b29 = a06.d.b(zq5.l.b(j17));
        gr5.v vVar2 = b27 == b28 ? gr5.v.f356485g : b29 <= b27 ? gr5.v.f356484f : b29 >= b28 ? gr5.v.f356483e : gr5.v.f356482d;
        int b37 = a06.d.b(f17.f556616b);
        int b38 = a06.d.b(f17.f556618d);
        int b39 = a06.d.b(zq5.l.c(j17));
        this.E = new gr5.i0(vVar2, b37 == b38 ? gr5.v.f356485g : b39 <= b37 ? gr5.v.f356484f : b39 >= b38 ? gr5.v.f356483e : gr5.v.f356482d);
        long j37 = this.f365815f;
        long j38 = this.f365816g;
        zq5.g gVar = new zq5.g(j38);
        if (!zq5.h.c(j38)) {
            gVar = null;
        }
        long j39 = gVar != null ? gVar.f556600a : this.f365815f;
        long j47 = this.f365830u.f556628a;
        zq5.g gVar2 = new zq5.g(j39);
        if (!zq5.h.c(j39)) {
            gVar2 = null;
        }
        if (gVar2 != null) {
            zq5.g gVar3 = new zq5.g(j37);
            if (!zq5.h.c(j37)) {
                gVar3 = null;
            }
            if (gVar3 != null) {
                long j48 = gVar3.f556600a;
                long j49 = gVar2.f556600a;
                long a19 = zq5.s.a(((int) (j48 >> 32)) / ((int) (j49 >> 32)), zq5.g.b(j48) / zq5.g.b(j49));
                b17 = zq5.s.a(zq5.q.b(a19) * zq5.q.b(j47), zq5.q.c(a19) * zq5.q.c(j47));
            } else {
                b17 = zq5.s.b(zq5.q.f556619b);
            }
        } else {
            b17 = zq5.s.b(zq5.q.f556619b);
        }
        this.C = b17;
        long j57 = this.f365815f;
        long j58 = this.f365816g;
        zq5.g gVar4 = new zq5.g(j58);
        if (!zq5.h.c(j58)) {
            gVar4 = null;
        }
        long j59 = gVar4 != null ? gVar4.f556600a : this.f365815f;
        zq5.n contentVisibleRect = this.B;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentVisibleRect, "contentVisibleRect");
        zq5.g gVar5 = new zq5.g(j59);
        if (!zq5.h.c(j59)) {
            gVar5 = null;
        }
        if (gVar5 != null) {
            zq5.g gVar6 = zq5.h.c(j57) ? new zq5.g(j57) : null;
            if (gVar6 != null) {
                long j66 = gVar5.f556600a;
                long j67 = gVar6.f556600a;
                long a27 = zq5.s.a(((int) (j66 >> 32)) / ((int) (j67 >> 32)), zq5.g.b(j66) / zq5.g.b(j67));
                nVar3 = new zq5.n(contentVisibleRect.f556615a * zq5.q.b(a27), contentVisibleRect.f556616b * zq5.q.c(a27), contentVisibleRect.f556617c * zq5.q.b(a27), contentVisibleRect.f556618d * zq5.q.c(a27));
                this.D = nVar3;
                this.f365813d.mo146xb9724478(this);
            }
        }
        nVar3 = nVar;
        this.D = nVar3;
        this.f365813d.mo146xb9724478(this);
    }
}
