package df2;

/* loaded from: classes5.dex */
public final class qb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312683d;

    /* renamed from: e, reason: collision with root package name */
    public int f312684e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f312685f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f312686g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312687h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ df2.zb f312688i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(long j17, long j18, java.lang.String str, df2.zb zbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312685f = j17;
        this.f312686g = j18;
        this.f312687h = str;
        this.f312688i = zbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.qb(this.f312685f, this.f312686g, this.f312687h, this.f312688i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.qb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00cd  */
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
            int r1 = r14.f312684e
            df2.zb r2 = r14.f312688i
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L31
            if (r1 == r6) goto L2c
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r14.f312683d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Le5
        L1b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L23:
            java.lang.Object r1 = r14.f312683d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Lc9
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto Laa
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            java.util.LinkedList r15 = new java.util.LinkedList
            r15.<init>()
            r45.we1 r1 = new r45.we1
            r1.<init>()
            long r7 = r14.f312685f
            long r9 = r14.f312686g
            java.lang.String r11 = r14.f312687h
            java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
            r13 = 0
            r1.set(r13, r12)
            r45.af1 r12 = new r45.af1
            r12.<init>()
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Exception -> L6b
            r12.set(r13, r7)     // Catch: java.lang.Exception -> L6b
            java.lang.Long r7 = java.lang.Long.valueOf(r9)     // Catch: java.lang.Exception -> L6b
            r12.set(r6, r7)     // Catch: java.lang.Exception -> L6b
            r12.set(r4, r11)     // Catch: java.lang.Exception -> L6b
            byte[] r7 = r12.mo14344x5f01b1f6()     // Catch: java.lang.Exception -> L6b
            com.tencent.mm.protobuf.g r7 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r7)     // Catch: java.lang.Exception -> L6b
            goto L84
        L6b:
            r7 = move-exception
            java.lang.String r8 = r2.f313472m
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "[aiAssistant sendAiAssistantCloseDialogAction] serialize action data failed: "
            r9.<init>(r10)
            java.lang.String r7 = r7.getMessage()
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r8, r7)
            r7 = r5
        L84:
            r1.set(r6, r7)
            r15.add(r1)
            r45.xe1 r1 = new r45.xe1
            r1.<init>()
            db2.t4 r7 = db2.t4.f309704a
            r8 = 12627(0x3153, float:1.7694E-41)
            r45.kv0 r7 = r7.a(r8)
            r1.set(r6, r7)
            r1.set(r4, r15)
            com.tencent.mm.modelbase.i r15 = r1.d()
            r14.f312684e = r6
            java.lang.Object r15 = xg2.g.d(r15, r5, r14, r6, r5)
            if (r15 != r0) goto Laa
            return r0
        Laa:
            r1 = r15
            xg2.h r1 = (xg2.h) r1
            boolean r15 = r1 instanceof xg2.i
            if (r15 == 0) goto Lc9
            oz5.l r15 = r1.f535925a
            if (r15 != 0) goto Lb9
            oz5.l r15 = r14.mo48699x76847179()
        Lb9:
            df2.pb r6 = new df2.pb
            r6.<init>(r1, r5, r2)
            r14.f312683d = r1
            r14.f312684e = r4
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r6, r14)
            if (r15 != r0) goto Lc9
            return r0
        Lc9:
            boolean r15 = r1 instanceof xg2.b
            if (r15 == 0) goto Le5
            oz5.l r15 = r1.f535925a
            if (r15 != 0) goto Ld5
            oz5.l r15 = r14.mo48699x76847179()
        Ld5:
            df2.ob r4 = new df2.ob
            r4.<init>(r1, r5, r2)
            r14.f312683d = r1
            r14.f312684e = r3
            java.lang.Object r15 = p3325xe03a0797.p3326xc267989b.l.g(r15, r4, r14)
            if (r15 != r0) goto Le5
            return r0
        Le5:
            jz5.f0 r15 = jz5.f0.f384359a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.qb.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
