package x0;

/* loaded from: classes14.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final n0.c5 f532495a = new n0.c5();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f532496b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static x0.s f532497c;

    /* renamed from: d, reason: collision with root package name */
    public static int f532498d;

    /* renamed from: e, reason: collision with root package name */
    public static final x0.q f532499e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f532500f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.List f532501g;

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicReference f532502h;

    static {
        x0.s sVar = x0.s.f532472h;
        f532497c = sVar;
        f532498d = 1;
        f532499e = new x0.q();
        f532500f = new java.util.ArrayList();
        f532501g = new java.util.ArrayList();
        int i17 = f532498d;
        f532498d = i17 + 1;
        x0.d dVar = new x0.d(i17, sVar);
        f532497c = f532497c.j(dVar.f532442b);
        java.util.concurrent.atomic.AtomicReference atomicReference = new java.util.concurrent.atomic.AtomicReference(dVar);
        f532502h = atomicReference;
        java.lang.Object obj = atomicReference.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "currentGlobalSnapshot.get()");
    }

    public static final void a() {
        f(x0.u.f532483d);
    }

    public static final yz5.l b(yz5.l lVar, yz5.l lVar2) {
        return (lVar == null || lVar2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new x0.x(lVar, lVar2);
    }

    public static final java.util.Map c(x0.e eVar, x0.e eVar2, x0.s sVar) {
        x0.a1 p17;
        java.util.Set<x0.z0> u17 = eVar2.u();
        int d17 = eVar.d();
        if (u17 == null) {
            return null;
        }
        x0.s h17 = eVar2.e().j(eVar2.d()).h(eVar2.f532411i);
        java.util.HashMap hashMap = null;
        for (x0.z0 z0Var : u17) {
            x0.a1 g17 = z0Var.g();
            x0.a1 p18 = p(g17, d17, sVar);
            if (p18 != null && (p17 = p(g17, d17, h17)) != null && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(p18, p17)) {
                x0.a1 p19 = p(g17, eVar2.d(), eVar2.e());
                if (p19 == null) {
                    o();
                    throw null;
                }
                x0.a1 d18 = z0Var.d(p17, p18, p19);
                if (d18 == null) {
                    return null;
                }
                if (hashMap == null) {
                    hashMap = new java.util.HashMap();
                }
                hashMap.put(p18, d18);
            }
        }
        return hashMap;
    }

    public static final void d(x0.m mVar) {
        if (!f532497c.g(mVar.d())) {
            throw new java.lang.IllegalStateException("Snapshot is not open".toString());
        }
    }

    public static final x0.s e(x0.s sVar, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sVar, "<this>");
        while (i17 < i18) {
            sVar = sVar.j(i17);
            i17++;
        }
        return sVar;
    }

    public static final java.lang.Object f(yz5.l lVar) {
        java.lang.Object t17;
        java.util.List V0;
        x0.d previousGlobalSnapshot = (x0.d) f532502h.get();
        java.lang.Object obj = f532496b;
        synchronized (obj) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(previousGlobalSnapshot, "previousGlobalSnapshot");
            t17 = t(previousGlobalSnapshot, lVar);
        }
        java.util.Set set = previousGlobalSnapshot.f532410h;
        if (set != null) {
            synchronized (obj) {
                V0 = kz5.n0.V0(f532500f);
            }
            java.util.ArrayList arrayList = (java.util.ArrayList) V0;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                ((yz5.p) arrayList.get(i17)).mo149xb9724478(set, previousGlobalSnapshot);
            }
        }
        return t17;
    }

    public static final x0.m g(x0.m mVar, yz5.l lVar) {
        boolean z17 = mVar instanceof x0.e;
        if (z17 || mVar == null) {
            return new x0.d1(z17 ? (x0.e) mVar : null, lVar, null, false);
        }
        return new x0.e1(mVar, lVar, false);
    }

    public static final x0.a1 h(x0.a1 r17, x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r17, "r");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.a1 p17 = p(r17, snapshot.d(), snapshot.e());
        if (p17 != null) {
            return p17;
        }
        o();
        throw null;
    }

    public static final x0.m i() {
        x0.m mVar = (x0.m) f532495a.a();
        if (mVar != null) {
            return mVar;
        }
        java.lang.Object obj = f532502h.get();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "currentGlobalSnapshot.get()");
        return (x0.m) obj;
    }

    public static final yz5.l j(yz5.l lVar, yz5.l lVar2, boolean z17) {
        if (!z17) {
            lVar2 = null;
        }
        return (lVar == null || lVar2 == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(lVar, lVar2)) ? lVar == null ? lVar2 : lVar : new x0.w(lVar, lVar2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if ((r5 < 0 || r5 >= 64 ? !(r5 < 64 || r5 >= 128 || ((1 << (r5 + (-64))) & 0) == 0) : ((1 << r5) & 0) != 0) == false) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final x0.a1 k(x0.a1 r12, x0.z0 r13) {
        /*
            java.lang.String r0 = "<this>"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "state"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            x0.a1 r0 = r13.g()
            int r1 = x0.z.f532498d
            x0.q r2 = x0.z.f532499e
            int r3 = r2.f532453a
            r4 = 0
            if (r3 <= 0) goto L1b
            int[] r1 = r2.f532454b
            r1 = r1[r4]
        L1b:
            int r1 = r1 + (-1)
            r2 = 0
            r3 = r2
        L1f:
            if (r0 == 0) goto L67
            int r5 = r0.f532394a
            if (r5 != 0) goto L26
            goto L60
        L26:
            if (r5 == 0) goto L53
            if (r5 > r1) goto L53
            int r5 = r5 + 0
            r6 = 1
            r7 = 0
            r9 = 1
            r11 = 64
            if (r5 < 0) goto L41
            if (r5 >= r11) goto L41
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L3f
        L3d:
            r5 = r6
            goto L50
        L3f:
            r5 = r4
            goto L50
        L41:
            if (r5 < r11) goto L3f
            r11 = 128(0x80, float:1.8E-43)
            if (r5 >= r11) goto L3f
            int r5 = r5 + (-64)
            long r9 = r9 << r5
            long r9 = r9 & r7
            int r5 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r5 == 0) goto L3f
            goto L3d
        L50:
            if (r5 != 0) goto L53
            goto L54
        L53:
            r6 = r4
        L54:
            if (r6 == 0) goto L64
            if (r3 != 0) goto L5a
            r3 = r0
            goto L64
        L5a:
            int r1 = r0.f532394a
            int r2 = r3.f532394a
            if (r1 >= r2) goto L62
        L60:
            r2 = r0
            goto L67
        L62:
            r2 = r3
            goto L67
        L64:
            x0.a1 r0 = r0.f532395b
            goto L1f
        L67:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == 0) goto L6f
            r2.f532394a = r0
            goto L7e
        L6f:
            x0.a1 r2 = r12.b()
            r2.f532394a = r0
            x0.a1 r12 = r13.g()
            r2.f532395b = r12
            r13.e(r2)
        L7e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.z.k(x0.a1, x0.z0):x0.a1");
    }

    public static final x0.a1 l(x0.a1 a1Var, x0.z0 state, x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        x0.a1 k17 = k(a1Var, state);
        k17.a(a1Var);
        k17.f532394a = snapshot.d();
        return k17;
    }

    public static final void m(x0.m snapshot, x0.z0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        yz5.l h17 = snapshot.h();
        if (h17 != null) {
            h17.mo146xb9724478(state);
        }
    }

    public static final x0.a1 n(x0.a1 a1Var, x0.z0 state, x0.m snapshot, x0.a1 candidate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(candidate, "candidate");
        if (snapshot.g()) {
            snapshot.m(state);
        }
        int d17 = snapshot.d();
        if (candidate.f532394a == d17) {
            return candidate;
        }
        x0.a1 k17 = k(a1Var, state);
        k17.f532394a = d17;
        snapshot.m(state);
        return k17;
    }

    public static final java.lang.Void o() {
        throw new java.lang.IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    public static final x0.a1 p(x0.a1 a1Var, int i17, x0.s sVar) {
        x0.a1 a1Var2 = null;
        while (a1Var != null) {
            int i18 = a1Var.f532394a;
            if (((i18 == 0 || i18 > i17 || sVar.g(i18)) ? false : true) && (a1Var2 == null || a1Var2.f532394a < a1Var.f532394a)) {
                a1Var2 = a1Var;
            }
            a1Var = a1Var.f532395b;
        }
        if (a1Var2 != null) {
            return a1Var2;
        }
        return null;
    }

    public static final x0.a1 q(x0.a1 a1Var, x0.z0 state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return r(a1Var, state, i());
    }

    public static final x0.a1 r(x0.a1 a1Var, x0.z0 state, x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        yz5.l f17 = snapshot.f();
        if (f17 != null) {
            f17.mo146xb9724478(state);
        }
        x0.a1 p17 = p(a1Var, snapshot.d(), snapshot.e());
        if (p17 != null) {
            return p17;
        }
        o();
        throw null;
    }

    public static final void s(int i17) {
        int i18;
        x0.q qVar = f532499e;
        int i19 = qVar.f532456d[i17];
        qVar.b(i19, qVar.f532453a - 1);
        qVar.f532453a--;
        int[] iArr = qVar.f532454b;
        int i27 = iArr[i19];
        int i28 = i19;
        while (i28 > 0) {
            int i29 = ((i28 + 1) >> 1) - 1;
            if (iArr[i29] <= i27) {
                break;
            }
            qVar.b(i29, i28);
            i28 = i29;
        }
        int[] iArr2 = qVar.f532454b;
        int i37 = qVar.f532453a >> 1;
        while (i19 < i37) {
            int i38 = (i19 + 1) << 1;
            int i39 = i38 - 1;
            if (i38 < qVar.f532453a && (i18 = iArr2[i38]) < iArr2[i39]) {
                if (i18 >= iArr2[i19]) {
                    break;
                }
                qVar.b(i38, i19);
                i19 = i38;
            } else {
                if (iArr2[i39] >= iArr2[i19]) {
                    break;
                }
                qVar.b(i39, i19);
                i19 = i39;
            }
        }
        qVar.f532456d[i17] = qVar.f532457e;
        qVar.f532457e = i17;
    }

    public static final java.lang.Object t(x0.m mVar, yz5.l lVar) {
        java.lang.Object mo146xb9724478 = lVar.mo146xb9724478(f532497c.e(mVar.d()));
        synchronized (f532496b) {
            int i17 = f532498d;
            f532498d = i17 + 1;
            x0.s e17 = f532497c.e(mVar.d());
            f532497c = e17;
            f532502h.set(new x0.d(i17, e17));
            mVar.c();
            f532497c = f532497c.j(i17);
        }
        return mo146xb9724478;
    }

    public static final x0.a1 u(x0.a1 a1Var, x0.z0 state, x0.m snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(a1Var, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        if (snapshot.g()) {
            snapshot.m(state);
        }
        x0.a1 p17 = p(a1Var, snapshot.d(), snapshot.e());
        if (p17 == null) {
            o();
            throw null;
        }
        if (p17.f532394a == snapshot.d()) {
            return p17;
        }
        x0.a1 l17 = l(p17, state, snapshot);
        snapshot.m(state);
        return l17;
    }
}
