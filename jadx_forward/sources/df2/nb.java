package df2;

/* loaded from: classes5.dex */
public final class nb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312377d;

    /* renamed from: e, reason: collision with root package name */
    public int f312378e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f312379f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312380g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(java.util.List list, df2.zb zbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312379f = list;
        this.f312380g = zbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.nb(this.f312379f, this.f312380g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.nb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
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
            int r1 = r13.f312378e
            jz5.f0 r2 = jz5.f0.f384359a
            java.util.List r3 = r13.f312379f
            r4 = 3
            df2.zb r5 = r13.f312380g
            r6 = 2
            r7 = 0
            r8 = 1
            if (r1 == 0) goto L34
            if (r1 == r8) goto L30
            if (r1 == r6) goto L27
            if (r1 != r4) goto L1f
            java.lang.Object r0 = r13.f312377d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto Lcb
        L1f:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L27:
            java.lang.Object r1 = r13.f312377d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto Laf
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L90
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            java.util.LinkedList r14 = new java.util.LinkedList
            r14.<init>()
            r45.we1 r1 = new r45.we1
            r1.<init>()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r10 = 0
            r1.set(r10, r9)
            r45.ef1 r9 = new r45.ef1
            r9.<init>()
            java.util.Iterator r11 = r3.iterator()
        L52:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L62
            java.lang.Object r12 = r11.next()
            r45.lf1 r12 = (r45.lf1) r12
            r9.m75926xea0771b(r10, r12)
            goto L52
        L62:
            byte[] r9 = r9.mo14344x5f01b1f6()     // Catch: java.lang.Exception -> Lcc
            com.tencent.mm.protobuf.g r9 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r9)     // Catch: java.lang.Exception -> Lcc
            r1.set(r8, r9)
            r14.add(r1)
            r45.xe1 r1 = new r45.xe1
            r1.<init>()
            db2.t4 r9 = db2.t4.f309704a
            r10 = 12627(0x3153, float:1.7694E-41)
            r45.kv0 r9 = r9.a(r10)
            r1.set(r8, r9)
            r1.set(r6, r14)
            com.tencent.mm.modelbase.i r14 = r1.d()
            r13.f312378e = r8
            java.lang.Object r14 = xg2.g.d(r14, r7, r13, r8, r7)
            if (r14 != r0) goto L90
            return r0
        L90:
            r1 = r14
            xg2.h r1 = (xg2.h) r1
            boolean r14 = r1 instanceof xg2.i
            if (r14 == 0) goto Laf
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto L9f
            oz5.l r14 = r13.mo48699x76847179()
        L9f:
            df2.mb r8 = new df2.mb
            r8.<init>(r1, r7, r5, r3)
            r13.f312377d = r1
            r13.f312378e = r6
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r8, r13)
            if (r14 != r0) goto Laf
            return r0
        Laf:
            boolean r14 = r1 instanceof xg2.b
            if (r14 == 0) goto Lcb
            oz5.l r14 = r1.f535925a
            if (r14 != 0) goto Lbb
            oz5.l r14 = r13.mo48699x76847179()
        Lbb:
            df2.lb r3 = new df2.lb
            r3.<init>(r1, r7, r5)
            r13.f312377d = r1
            r13.f312378e = r4
            java.lang.Object r14 = p3325xe03a0797.p3326xc267989b.l.g(r14, r3, r13)
            if (r14 != r0) goto Lcb
            return r0
        Lcb:
            return r2
        Lcc:
            r14 = move-exception
            java.lang.String r0 = r5.f313472m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[aiAssistant] reportInitToolList: serialize action data failed: "
            r1.<init>(r3)
            java.lang.String r14 = r14.getMessage()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r14)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.nb.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
