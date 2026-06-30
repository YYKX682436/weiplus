package rt1;

/* loaded from: classes7.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f480945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f480946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rt1.p1 f480947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(java.lang.String str, rt1.p1 p1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f480946e = str;
        this.f480947f = p1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rt1.g1(this.f480946e, this.f480947f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rt1.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0074 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f480945d
            java.lang.String r2 = r9.f480946e
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            rt1.p1 r8 = r9.f480947f
            if (r1 == 0) goto L32
            if (r1 == r7) goto L2e
            if (r1 == r6) goto L28
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L74
        L1c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L65
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: qt1.f -> L2c
            goto L66
        L2c:
            r10 = move-exception
            goto L51
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L43
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            rt1.d1 r10 = new rt1.d1
            r10.<init>(r8)
            r9.f480945d = r7
            java.lang.Object r10 = st1.g.d(r10, r9)
            if (r10 != r0) goto L43
            return r0
        L43:
            qt1.e r10 = new qt1.e     // Catch: qt1.f -> L2c
            r10.<init>(r2)     // Catch: qt1.f -> L2c
            r9.f480945d = r6     // Catch: qt1.f -> L2c
            java.lang.Object r10 = r10.e(r9)     // Catch: qt1.f -> L2c
            if (r10 != r0) goto L66
            return r0
        L51:
            r1 = -17501(0xffffffffffffbba3, float:NaN)
            int r6 = r10.f448054e
            if (r6 == r1) goto L66
            rt1.e1 r1 = new rt1.e1
            r1.<init>(r8, r10)
            r9.f480945d = r5
            java.lang.Object r10 = st1.g.d(r1, r9)
            if (r10 != r0) goto L65
            return r0
        L65:
            return r3
        L66:
            rt1.f1 r10 = new rt1.f1
            r10.<init>(r8, r2)
            r9.f480945d = r4
            java.lang.Object r10 = st1.g.d(r10, r9)
            if (r10 != r0) goto L74
            return r0
        L74:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: rt1.g1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
