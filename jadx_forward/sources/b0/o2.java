package b0;

/* loaded from: classes14.dex */
public abstract class o2 {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(b0.f3 r7, float r8, z.p r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            boolean r0 = r10 instanceof b0.l2
            if (r0 == 0) goto L13
            r0 = r10
            b0.l2 r0 = (b0.l2) r0
            int r1 = r0.f97950f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f97950f = r1
            goto L18
        L13:
            b0.l2 r0 = new b0.l2
            r0.<init>(r10)
        L18:
            r4 = r0
            java.lang.Object r10 = r4.f97949e
            pz5.a r0 = pz5.a.f440719d
            int r1 = r4.f97950f
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            java.lang.Object r7 = r4.f97948d
            kotlin.jvm.internal.e0 r7 = (p3321xbce91901.jvm.p3324x21ffc6bd.e0) r7
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L55
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            kotlin.jvm.internal.e0 r10 = new kotlin.jvm.internal.e0
            r10.<init>()
            r3 = 0
            b0.n2 r5 = new b0.n2
            r1 = 0
            r5.<init>(r8, r9, r10, r1)
            r8 = 1
            r6 = 0
            r4.f97948d = r10
            r4.f97950f = r2
            r1 = r7
            r2 = r3
            r3 = r5
            r5 = r8
            java.lang.Object r7 = b0.e3.a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L54
            return r0
        L54:
            r7 = r10
        L55:
            float r7 = r7.f391648d
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.o2.a(b0.f3, float, z.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ java.lang.Object b(b0.f3 f3Var, float f17, z.p pVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            pVar = z.q.c(0.0f, 0.0f, null, 7, null);
        }
        return a(f3Var, f17, pVar, interfaceC29045xdcb5ca57);
    }
}
