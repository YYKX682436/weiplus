package tv0;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f503731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f503733f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(tv0.j0 j0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503732e = j0Var;
        this.f503733f = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tv0.j(this.f503732e, this.f503733f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tv0.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0065  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f503731d
            r2 = 3
            r3 = 2
            r4 = 1
            tv0.j0 r5 = r13.f503732e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L61
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L48
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L35
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            gx0.bf r14 = r5.p7()
            r13.f503731d = r4
            java.lang.Object r14 = r14.e7(r13)
            if (r14 != r0) goto L35
            return r0
        L35:
            gx0.bf r6 = r5.p7()
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 7
            r12 = 0
            r13.f503731d = r3
            r10 = r13
            java.lang.Object r14 = gx0.bf.d7(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L48
            return r0
        L48:
            gx0.bf r6 = r5.p7()
            com.tencent.maas.model.time.MJTime r7 = r5.f503746z
            r8 = 1
            r9 = 0
            r11 = 4
            r12 = 0
            gx0.bf.q7(r6, r7, r8, r9, r11, r12)
            r13.f503731d = r2
            r1 = 200(0xc8, double:9.9E-322)
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.k1.b(r1, r13)
            if (r14 != r0) goto L61
            return r0
        L61:
            yz5.a r14 = r13.f503733f
            if (r14 == 0) goto L68
            r14.mo152xb9724478()
        L68:
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: tv0.j.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
