package hj3;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f363161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hj3.m f363162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.r f363163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f363164g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(hj3.m mVar, hj3.r rVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f363162e = mVar;
        this.f363163f = rVar;
        this.f363164g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hj3.i(this.f363162e, this.f363163f, this.f363164g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hj3.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f363161d
            hj3.r r3 = r0.f363163f
            hj3.m r4 = r0.f363162e
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L27
            if (r2 == r6) goto L21
            if (r2 != r5) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            r2 = r19
            goto L8f
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            r2 = r19
            goto L3a
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            nj3.j r2 = r4.f363178c
            r7 = r3
            hj3.p r7 = (hj3.p) r7
            java.lang.String r7 = r7.f363184a
            r0.f363161d = r6
            java.lang.Object r2 = r2.b(r7, r6, r0)
            if (r2 != r1) goto L3a
            return r1
        L3a:
            nj3.f r2 = (nj3.f) r2
            r6 = 0
            if (r2 == 0) goto L92
            hj3.p r3 = (hj3.p) r3
            mj3.g r7 = r3.f363185b
            boolean r8 = r2.f419438c
            if (r8 == 0) goto L51
            nj3.d r8 = r2.f419437b
            boolean r9 = r8.f419428b
            if (r9 == 0) goto L51
            is0.c r8 = r8.f419427a
            r9 = r8
            goto L52
        L51:
            r9 = r6
        L52:
            if (r9 == 0) goto L63
            int r10 = r7.f408583a
            int r11 = r7.f408584b
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 60
            r17 = 0
            is0.c.b(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L63:
            r2.f419440e = r7
            java.util.concurrent.locks.ReadWriteLock r7 = r2.f419439d
            kotlin.jvm.internal.h0 r8 = r0.f363164g
            r8.f391656d = r7
            boolean r7 = r2.f419438c
            if (r7 == 0) goto L78
            nj3.d r2 = r2.f419437b
            boolean r7 = r2.f419428b
            if (r7 == 0) goto L78
            is0.c r2 = r2.f419427a
            goto L79
        L78:
            r2 = r6
        L79:
            if (r2 == 0) goto L92
            lj3.a r4 = r4.f363183h
            lj3.b r6 = new lj3.b
            mj3.g r7 = r3.f363185b
            is0.c r3 = r3.f363187c
            r6.<init>(r7, r3, r2)
            r0.f363161d = r5
            java.lang.Object r2 = r4.c(r6, r0)
            if (r2 != r1) goto L8f
            return r1
        L8f:
            r6 = r2
            lj3.c r6 = (lj3.c) r6
        L92:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hj3.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
