package id2;

/* loaded from: classes3.dex */
public final class x4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f372412d;

    /* renamed from: e, reason: collision with root package name */
    public int f372413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.f5 f372414f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ il2.a f372415g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4(id2.f5 f5Var, il2.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372414f = f5Var;
        this.f372415g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.x4(this.f372414f, this.f372415g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.x4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f372413e
            il2.a r2 = r7.f372415g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r7.f372412d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L8d
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.f372412d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L71
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L52
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r45.ln1 r8 = new r45.ln1
            r8.<init>()
            int r1 = r2.f373566a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.set(r4, r1)
            java.lang.String r1 = r2.f373567b
            r8.set(r3, r1)
            com.tencent.mm.modelbase.i r8 = r8.d()
            r7.f372413e = r5
            java.lang.Object r8 = xg2.g.d(r8, r6, r7, r5, r6)
            if (r8 != r0) goto L52
            return r0
        L52:
            r1 = r8
            xg2.h r1 = (xg2.h) r1
            boolean r8 = r1 instanceof xg2.i
            if (r8 == 0) goto L71
            oz5.l r8 = r1.f535925a
            if (r8 != 0) goto L61
            oz5.l r8 = r7.mo48699x76847179()
        L61:
            id2.w4 r5 = new id2.w4
            r5.<init>(r1, r6, r2)
            r7.f372412d = r1
            r7.f372413e = r4
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r5, r7)
            if (r8 != r0) goto L71
            return r0
        L71:
            boolean r8 = r1 instanceof xg2.b
            if (r8 == 0) goto L8d
            oz5.l r8 = r1.f535925a
            if (r8 != 0) goto L7d
            oz5.l r8 = r7.mo48699x76847179()
        L7d:
            id2.v4 r4 = new id2.v4
            r4.<init>(r1, r6, r2)
            r7.f372412d = r1
            r7.f372413e = r3
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r4, r7)
            if (r8 != r0) goto L8d
            return r0
        L8d:
            id2.f5 r8 = r7.f372414f
            r0 = 0
            r8.f372105i = r0
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: id2.x4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
