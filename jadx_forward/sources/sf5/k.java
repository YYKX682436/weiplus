package sf5;

/* loaded from: classes10.dex */
public final class k extends sf5.h {

    /* renamed from: b, reason: collision with root package name */
    public yz5.p f489177b;

    /* renamed from: c, reason: collision with root package name */
    public yz5.l f489178c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sf5.l stateTransform) {
        super(stateTransform);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateTransform, "stateTransform");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // sf5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 r5, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof sf5.i
            if (r0 == 0) goto L13
            r0 = r6
            sf5.i r0 = (sf5.i) r0
            int r1 = r0.f489174f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f489174f = r1
            goto L18
        L13:
            sf5.i r0 = new sf5.i
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f489172d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f489174f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L64
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            sf5.l r6 = r4.f489171a
            java.util.LinkedList r6 = r6.f489179a
            java.util.Iterator r6 = r6.iterator()
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r6 = r6.next()
            pf5.s0 r6 = (pf5.s0) r6
            jz5.g r6 = r6.f435465d
            jz5.n r6 = (jz5.n) r6
            java.lang.Object r6 = r6.mo141623x754a37bb()
            kotlinx.coroutines.flow.i2 r6 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.i2) r6
            kotlinx.coroutines.flow.n2 r6 = p3325xe03a0797.p3326xc267989b.p3328x30012e.l.a(r6)
            sf5.j r2 = new sf5.j
            r2.<init>(r4, r5)
            r0.f489174f = r3
            kotlinx.coroutines.flow.k2 r6 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k2) r6
            java.lang.Object r5 = r6.a(r2, r0)
            if (r5 != r1) goto L64
            return r1
        L64:
            jz5.d r5 = new jz5.d
            r5.<init>()
            throw r5
        L6a:
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sf5.k.b(kotlinx.coroutines.flow.i2, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
