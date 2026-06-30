package tx0;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f504057a;

    /* renamed from: b, reason: collision with root package name */
    public volatile p3325xe03a0797.p3326xc267989b.r2 f504058b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f504059c;

    /* renamed from: d, reason: collision with root package name */
    public volatile p3321xbce91901.C29043x91b2b43d f504060d;

    /* renamed from: e, reason: collision with root package name */
    public volatile yz5.l f504061e;

    /* renamed from: f, reason: collision with root package name */
    public final tx0.c f504062f;

    public k(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        this.f504057a = scope;
        this.f504062f = new tx0.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(tx0.k r4, double r5, double r7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r9) {
        /*
            r4.getClass()
            boolean r0 = r9 instanceof tx0.h
            if (r0 == 0) goto L16
            r0 = r9
            tx0.h r0 = (tx0.h) r0
            int r1 = r0.f504052f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f504052f = r1
            goto L1b
        L16:
            tx0.h r0 = new tx0.h
            r0.<init>(r4, r9)
        L1b:
            java.lang.Object r4 = r0.f504050d
            pz5.a r9 = pz5.a.f440719d
            int r1 = r0.f504052f
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            goto L7e
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            r0.f504052f = r2
            kotlinx.coroutines.r r4 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r0 = pz5.f.b(r0)
            r4.<init>(r0, r2)
            r4.k()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            kotlin.jvm.internal.c0 r1 = new kotlin.jvm.internal.c0
            r1.<init>()
            tx0.j r3 = new tx0.j
            r3.<init>(r0, r1, r4)
            tx0.i r0 = new tx0.i
            r0.<init>(r3)
            r4.m(r0)
            java.lang.Class<u60.g> r0 = u60.g.class
            i95.m r0 = i95.n0.c(r0)
            u60.g r0 = (u60.g) r0
            t60.e r0 = (t60.e) r0
            u60.f r0 = r0.wi()
            u60.h r1 = new u60.h
            r1.<init>(r5, r7)
            r1.f506407g = r2
            r5 = 6
            r1.f506403c = r5
            i11.g r0 = (i11.g) r0
            r0.b(r1, r3)
            java.lang.Object r4 = r4.j()
            if (r4 != r9) goto L7e
            goto L84
        L7e:
            kotlin.Result r4 = (p3321xbce91901.C29043x91b2b43d) r4
            java.lang.Object r9 = r4.getValue()
        L84:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.k.a(tx0.k, double, double, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f504058b;
            jz5.f0 f0Var = null;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                f0Var = jz5.f0.f384359a;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        this.f504059c = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:23:0x003d, B:24:0x0074, B:26:0x0078, B:28:0x007c, B:30:0x0081, B:32:0x0091), top: B:22:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091 A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:23:0x003d, B:24:0x0074, B:26:0x0078, B:28:0x007c, B:30:0x0081, B:32:0x0091), top: B:22:0x003d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tx0.k.c(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
