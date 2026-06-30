package h4;

/* loaded from: classes14.dex */
public abstract class k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.Object f360210d = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public final u26.w f360211a;

    /* renamed from: b, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.z f360212b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f360213c;

    public k0(p3325xe03a0797.p3326xc267989b.y0 scope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        u26.w a17 = u26.z.a(0, null, null, 6, null);
        this.f360211a = a17;
        this.f360212b = p3325xe03a0797.p3326xc267989b.b0.a(null, 1, null);
        this.f360213c = new java.util.concurrent.atomic.AtomicBoolean(false);
        p3325xe03a0797.p3326xc267989b.p3328x30012e.l.p(new p3325xe03a0797.p3326xc267989b.p3328x30012e.g0(new p3325xe03a0797.p3326xc267989b.p3328x30012e.y1(p3325xe03a0797.p3326xc267989b.p3328x30012e.l.g(a17), new h4.h0(this, null)), new h4.i0(this, null)), scope);
    }

    public static final void a(h4.k0 k0Var) {
        jz5.f0 f0Var = jz5.f0.f384359a;
        p3325xe03a0797.p3326xc267989b.z zVar = k0Var.f360212b;
        u26.w wVar = k0Var.f360211a;
        if (k0Var.f360213c.compareAndSet(false, true)) {
            try {
                h4.i iVar = (h4.i) k0Var;
                java.util.ArrayList arrayList = (java.util.ArrayList) iVar.f360200i;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    u26.x0.a(((h4.j) it.next()).f360203a, null, 1, null);
                }
                arrayList.clear();
                h4.g0 g0Var = iVar.f360197f;
                if (g0Var != null) {
                    p3325xe03a0797.p3326xc267989b.p2.a(g0Var.f360189a, null, 1, null);
                }
            } finally {
                u26.x0.a(wVar, null, 1, null);
                ((p3325xe03a0797.p3326xc267989b.a0) zVar).U(f0Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof h4.j0
            if (r0 == 0) goto L13
            r0 = r6
            h4.j0 r0 = (h4.j0) r0
            int r1 = r0.f360206e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f360206e = r1
            goto L18
        L13:
            h4.j0 r0 = new h4.j0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f360205d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f360206e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L5f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            java.lang.Object r2 = r0.f360208g
            h4.k0 r2 = (h4.k0) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L4f
        L3a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            u26.w r6 = r5.f360211a
            java.lang.Object r2 = h4.k0.f360210d
            r0.f360208g = r5
            r0.f360206e = r4
            u26.o r6 = (u26.o) r6
            java.lang.Object r6 = r6.t(r2, r0)
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r2 = r5
        L4f:
            kotlinx.coroutines.z r6 = r2.f360212b
            r2 = 0
            r0.f360208g = r2
            r0.f360206e = r3
            kotlinx.coroutines.a0 r6 = (p3325xe03a0797.p3326xc267989b.a0) r6
            java.lang.Object r6 = r6.k(r0)
            if (r6 != r1) goto L5f
            return r1
        L5f:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.k0.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
