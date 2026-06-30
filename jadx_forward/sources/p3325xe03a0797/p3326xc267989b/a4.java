package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class a4 {
    public static final java.lang.Object a(p3325xe03a0797.p3326xc267989b.y3 y3Var, yz5.p pVar) {
        java.lang.Object e0Var;
        java.lang.Object V;
        y3Var.p(new p3325xe03a0797.p3326xc267989b.u1(p3325xe03a0797.p3326xc267989b.k1.d(y3Var.f392030f.mo48699x76847179()).v(y3Var.f392239g, y3Var, y3Var.f391661e)));
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(pVar, 2);
            e0Var = pVar.mo149xb9724478(y3Var, y3Var);
        } catch (java.lang.Throwable th6) {
            e0Var = new p3325xe03a0797.p3326xc267989b.e0(th6, false, 2, null);
        }
        pz5.a aVar = pz5.a.f440719d;
        if (e0Var == aVar || (V = y3Var.V(e0Var)) == p3325xe03a0797.p3326xc267989b.d3.f391695b) {
            return aVar;
        }
        if (V instanceof p3325xe03a0797.p3326xc267989b.e0) {
            java.lang.Throwable th7 = ((p3325xe03a0797.p3326xc267989b.e0) V).f391705a;
            if (((th7 instanceof p3325xe03a0797.p3326xc267989b.x3) && ((p3325xe03a0797.p3326xc267989b.x3) th7).f392233d == y3Var) ? false : true) {
                throw th7;
            }
            if (e0Var instanceof p3325xe03a0797.p3326xc267989b.e0) {
                throw ((p3325xe03a0797.p3326xc267989b.e0) e0Var).f391705a;
            }
        } else {
            e0Var = p3325xe03a0797.p3326xc267989b.d3.a(V);
        }
        return e0Var;
    }

    public static final java.lang.Object b(long j17, yz5.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        if (j17 <= 0) {
            throw new p3325xe03a0797.p3326xc267989b.x3("Timed out immediately", null);
        }
        java.lang.Object a17 = a(new p3325xe03a0797.p3326xc267989b.y3(j17, interfaceC29045xdcb5ca57), pVar);
        pz5.a aVar = pz5.a.f440719d;
        return a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(long r7, yz5.p r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            boolean r0 = r10 instanceof p3325xe03a0797.p3326xc267989b.z3
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.z3 r0 = (p3325xe03a0797.p3326xc267989b.z3) r0
            int r1 = r0.f392246g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f392246g = r1
            goto L18
        L13:
            kotlinx.coroutines.z3 r0 = new kotlinx.coroutines.z3
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f392245f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f392246g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            java.lang.Object r7 = r0.f392244e
            kotlin.jvm.internal.h0 r7 = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L2c
            goto L59
        L2c:
            r8 = move-exception
            goto L5d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L40
            return r3
        L40:
            kotlin.jvm.internal.h0 r10 = new kotlin.jvm.internal.h0
            r10.<init>()
            r0.f392243d = r9     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            r0.f392244e = r10     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            r0.f392246g = r4     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            kotlinx.coroutines.y3 r2 = new kotlinx.coroutines.y3     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            r2.<init>(r7, r0)     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            r10.f391656d = r2     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            java.lang.Object r10 = a(r2, r9)     // Catch: p3325xe03a0797.p3326xc267989b.x3 -> L5a
            if (r10 != r1) goto L59
            return r1
        L59:
            return r10
        L5a:
            r7 = move-exception
            r8 = r7
            r7 = r10
        L5d:
            kotlinx.coroutines.r2 r9 = r8.f392233d
            java.lang.Object r7 = r7.f391656d
            if (r9 != r7) goto L64
            return r3
        L64:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p3325xe03a0797.p3326xc267989b.a4.c(long, yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
