package mn2;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f411577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f411578f;

    /* renamed from: g, reason: collision with root package name */
    public int f411579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mn2.m3 f411580h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(mn2.m3 m3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f411580h = m3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mn2.l3(this.f411580h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mn2.l3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f411579g
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r5.f411578f
            mn2.l3 r0 = (mn2.l3) r0
            java.lang.Object r0 = r5.f411577e
            fp0.r r0 = (fp0.r) r0
            java.lang.Object r0 = r5.f411576d
            mn2.m3 r0 = (mn2.m3) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L95
        L1d:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L25:
            java.lang.Object r1 = r5.f411577e
            fp0.r r1 = (fp0.r) r1
            java.lang.Object r3 = r5.f411576d
            mn2.m3 r3 = (mn2.m3) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L6a
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            mn2.m3 r6 = r5.f411580h
            java.util.concurrent.ConcurrentLinkedDeque r1 = r6.f411588b
            java.lang.Object r1 = r1.poll()
            fp0.r r1 = (fp0.r) r1
            if (r1 == 0) goto L9b
            r6.f411589c = r3
            com.tencent.mm.plugin.finder.storage.t70 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a
            jz5.g r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209177cf
            jz5.n r4 = (jz5.n) r4
            java.lang.Object r4 = r4.mo141623x754a37bb()
            nb2.a r4 = (nb2.a) r4
            java.lang.Object r4 = r4.r()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6b
            r5.f411576d = r6
            r5.f411577e = r1
            r5.f411579g = r3
            r3 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r3 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r5)
            if (r3 != r0) goto L69
            return r0
        L69:
            r3 = r6
        L6a:
            r6 = r3
        L6b:
            r5.f411576d = r6
            r5.f411577e = r1
            r5.f411578f = r5
            r5.f411579g = r2
            oz5.n r2 = new oz5.n
            kotlin.coroutines.Continuation r3 = pz5.f.b(r5)
            r2.<init>(r3)
            boolean r3 = r1 instanceof mn2.k3
            if (r3 == 0) goto L84
            r3 = r1
            mn2.k3 r3 = (mn2.k3) r3
            goto L85
        L84:
            r3 = 0
        L85:
            if (r3 != 0) goto L88
            goto L8a
        L88:
            r3.f411568i = r2
        L8a:
            r1.a()
            java.lang.Object r1 = r2.a()
            if (r1 != r0) goto L94
            return r0
        L94:
            r0 = r6
        L95:
            r6 = 0
            r0.f411589c = r6
            r0.c()
        L9b:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.l3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
