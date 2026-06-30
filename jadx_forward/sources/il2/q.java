package il2;

/* loaded from: classes.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f373611d;

    /* renamed from: e, reason: collision with root package name */
    public int f373612e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ql1 f373613f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f373614g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r45.ql1 ql1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f373613f = ql1Var;
        this.f373614g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new il2.q(this.f373613f, this.f373614g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((il2.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
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
            int r1 = r9.f373612e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r0 = r9.f373611d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lab
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            java.lang.Object r1 = r9.f373611d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L8f
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L6e
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r45.n02 r10 = new r45.n02
            r10.<init>()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r10.set(r4, r1)
            r45.ql1 r1 = new r45.ql1
            r1.<init>()
            r45.ql1 r6 = r9.f373613f
            r7 = 0
            int r8 = r6.m75939xb282bd08(r7)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r1.set(r7, r8)
            long r6 = r6.m75942xfb822ef2(r5)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r1.set(r5, r6)
            r10.set(r3, r1)
            com.tencent.mm.modelbase.i r10 = r10.d()
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r9.f373612e = r5
            java.lang.Object r10 = xg2.g.b(r10, r1, r9)
            if (r10 != r0) goto L6e
            return r0
        L6e:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L8f
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L7d
            oz5.l r10 = r9.mo48699x76847179()
        L7d:
            il2.p r5 = new il2.p
            boolean r6 = r9.f373614g
            r5.<init>(r1, r2, r6)
            r9.f373611d = r1
            r9.f373612e = r4
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r5, r9)
            if (r10 != r0) goto L8f
            return r0
        L8f:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Lab
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L9b
            oz5.l r10 = r9.mo48699x76847179()
        L9b:
            il2.o r4 = new il2.o
            r4.<init>(r1, r2)
            r9.f373611d = r1
            r9.f373612e = r3
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r4, r9)
            if (r10 != r0) goto Lab
            return r0
        Lab:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: il2.q.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
