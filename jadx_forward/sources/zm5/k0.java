package zm5;

/* loaded from: classes10.dex */
public final class k0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f555764d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zm5.r0 f555765e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(zm5.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f555765e = r0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zm5.k0(this.f555765e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zm5.k0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[RETURN] */
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
            int r1 = r7.f555764d
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto Ld8
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto Lc2
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            bm5.t0 r8 = bm5.t0.f104271a
            boolean r1 = r8.a()
            if (r1 == 0) goto L42
            boolean r8 = r8.b()
            if (r8 != 0) goto L31
            goto L42
        L31:
            aq.n r8 = aq.o.f94455c
            if (r8 != 0) goto L49
            aq.n r8 = new aq.n
            r8.<init>()
            aq.o.f94455c = r8
            com.tencent.mm.storage.s8 r8 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a
            r8.a()
            goto L49
        L42:
            java.lang.String r8 = "MicroMsg.ImageQueryDataModel"
            java.lang.String r1 = "checkInitDB >> entrance is close"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r8, r1)
        L49:
            aq.r0 r8 = aq.r0.f94473a
            r8.d()
            java.lang.String r8 = aq.o.f94454b
            qk.q7 r1 = aq.p.f94463b
            if (r1 == 0) goto L5b
            nc5.a r1 = nc5.a.f417721a
            android.util.Pair r8 = r1.g(r8, r3)
            goto L5c
        L5b:
            r8 = r4
        L5c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "initFirstTime >> new Data: "
            r1.<init>(r5)
            if (r8 == 0) goto L75
            java.lang.Object r5 = r8.first
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L75
            int r5 = r5.size()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            goto L76
        L75:
            r6 = r4
        L76:
            r1.append(r6)
            java.lang.String r5 = ". old data: "
            r1.append(r5)
            if (r8 == 0) goto L90
            java.lang.Object r5 = r8.second
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            if (r5 == 0) goto L90
            int r5 = r5.size()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r5)
            goto L91
        L90:
            r6 = r4
        L91:
            r1.append(r6)
            java.lang.String r1 = r1.toString()
            java.lang.String r5 = "MicroMsg.ImageQueryMainUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            if (r8 == 0) goto Lc4
            java.lang.Object r1 = r8.first
            java.lang.String r5 = "first"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r5)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.Object r8 = r8.second
            java.lang.String r5 = "second"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r5)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            r7.f555764d = r3
            kotlinx.coroutines.p0 r3 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            com.tencent.mm.storage.r8 r5 = new com.tencent.mm.storage.r8
            r5.<init>(r1, r8, r4)
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r3, r5, r7)
            if (r8 != r0) goto Lc2
            return r0
        Lc2:
            jz5.f0 r8 = (jz5.f0) r8
        Lc4:
            kotlinx.coroutines.p0 r8 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r8 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            zm5.j0 r1 = new zm5.j0
            zm5.r0 r3 = r7.f555765e
            r1.<init>(r3, r4)
            r7.f555764d = r2
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r8, r1, r7)
            if (r8 != r0) goto Ld8
            return r0
        Ld8:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zm5.k0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
