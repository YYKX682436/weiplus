package f40;

/* loaded from: classes12.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f340953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f40.i f340954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h40.f f340955f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(f40.i iVar, h40.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f340954e = iVar;
        this.f340955f = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new f40.f(this.f340954e, this.f340955f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((f40.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        if (r15 == r0) goto L15;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f340953d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L57
        Lf:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            h40.f r15 = r14.f340955f
            java.lang.String r1 = r15.f360273a
            long r4 = r15.f360274b
            h40.b r9 = r15.f360278f
            i40.a r10 = r15.f360275c
            boolean r11 = r15.f360279g
            boolean r12 = r15.f360280h
            r14.f340953d = r3
            f40.i r6 = r14.f340954e
            r6.getClass()
            pt0.e0 r15 = pt0.f0.f439742b1
            com.tencent.mm.storage.f9 r7 = r15.l(r1, r4)
            if (r7 != 0) goto L38
            goto L53
        L38:
            java.lang.Class<e40.w> r15 = e40.w.class
            i95.m r15 = i95.n0.c(r15)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r15, r1)
            e40.w r15 = (e40.w) r15
            r1 = 2
            r3 = 0
            java.lang.String r8 = e40.w.s6(r15, r7, r3, r1, r3)
            r13 = r14
            java.lang.Object r15 = r6.T6(r7, r8, r9, r10, r11, r12, r13)
            if (r15 != r0) goto L53
            goto L54
        L53:
            r15 = r2
        L54:
            if (r15 != r0) goto L57
            return r0
        L57:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f40.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
