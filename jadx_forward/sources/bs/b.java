package bs;

/* loaded from: classes4.dex */
public abstract class b implements bs.c {

    /* renamed from: a, reason: collision with root package name */
    public bs.c f105311a;

    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(bs.b r5, aq.t0 r6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            boolean r0 = r7 instanceof bs.a
            if (r0 == 0) goto L13
            r0 = r7
            bs.a r0 = (bs.a) r0
            int r1 = r0.f105310h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105310h = r1
            goto L18
        L13:
            bs.a r0 = new bs.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f105308f
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f105310h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            java.lang.Object r5 = r0.f105307e
            r6 = r5
            aq.t0 r6 = (aq.t0) r6
            java.lang.Object r5 = r0.f105306d
            bs.b r5 = (bs.b) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L4f
        L3f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r0.f105306d = r5
            r0.f105307e = r6
            r0.f105310h = r4
            java.lang.Object r7 = r5.a(r6, r0)
            if (r7 != r1) goto L4f
            return r1
        L4f:
            aq.s0 r7 = (aq.s0) r7
            boolean r2 = r7.f94493a
            if (r2 == 0) goto L73
            bs.c r5 = r5.f105311a
            if (r5 == 0) goto L6d
            r7 = 0
            r0.f105306d = r7
            r0.f105307e = r7
            r0.f105310h = r3
            bs.b r5 = (bs.b) r5
            java.lang.Object r7 = c(r5, r6, r0)
            if (r7 != r1) goto L69
            return r1
        L69:
            aq.s0 r7 = (aq.s0) r7
            if (r7 != 0) goto L73
        L6d:
            aq.s0 r7 = new aq.s0
            r5 = 0
            r7.<init>(r4, r5)
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bs.b.c(bs.b, aq.t0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract java.lang.Object a(aq.t0 t0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57);

    public bs.b b(bs.c chain) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chain, "chain");
        bs.c cVar = this.f105311a;
        if (cVar == null || ((bs.b) cVar).b(chain) == null) {
            this.f105311a = chain;
        }
        return this;
    }
}
