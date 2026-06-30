package yd2;

/* loaded from: classes5.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f542602d;

    /* renamed from: e, reason: collision with root package name */
    public int f542603e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f542604f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yd2.j f542605g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.util.List list, yd2.j jVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542604f = list;
        this.f542605g = jVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yd2.i(this.f542604f, this.f542605g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f542603e
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 3
            yd2.j r4 = r12.f542605g
            r5 = 0
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L32
            if (r1 == r7) goto L2e
            if (r1 == r6) goto L25
            if (r1 != r3) goto L1d
            java.lang.Object r0 = r12.f542602d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lcb
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L25:
            java.lang.Object r1 = r12.f542602d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Laf
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L90
        L32:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.util.LinkedList r13 = new java.util.LinkedList
            r13.<init>()
            r45.we1 r1 = new r45.we1
            r1.<init>()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r9 = 0
            r1.set(r9, r8)
            r45.gf1 r8 = new r45.gf1
            r8.<init>()
            java.util.List r10 = r12.f542604f
            java.util.Iterator r10 = r10.iterator()
        L52:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L62
            java.lang.Object r11 = r10.next()
            r45.mf1 r11 = (r45.mf1) r11
            r8.m75926xea0771b(r9, r11)
            goto L52
        L62:
            byte[] r8 = r8.mo14344x5f01b1f6()     // Catch: java.lang.Exception -> Lcc
            com.tencent.mm.protobuf.g r8 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(r8)     // Catch: java.lang.Exception -> Lcc
            r1.set(r7, r8)
            r13.add(r1)
            r45.xe1 r1 = new r45.xe1
            r1.<init>()
            db2.t4 r8 = db2.t4.f309704a
            r9 = 12627(0x3153, float:1.7694E-41)
            r45.kv0 r8 = r8.a(r9)
            r1.set(r7, r8)
            r1.set(r6, r13)
            com.tencent.mm.modelbase.i r13 = r1.d()
            r12.f542603e = r7
            java.lang.Object r13 = xg2.g.d(r13, r5, r12, r7, r5)
            if (r13 != r0) goto L90
            return r0
        L90:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto Laf
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto L9f
            oz5.l r13 = r12.mo48699x76847179()
        L9f:
            yd2.h r7 = new yd2.h
            r7.<init>(r1, r5, r4)
            r12.f542602d = r1
            r12.f542603e = r6
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r7, r12)
            if (r13 != r0) goto Laf
            return r0
        Laf:
            boolean r13 = r1 instanceof xg2.b
            if (r13 == 0) goto Lcb
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto Lbb
            oz5.l r13 = r12.mo48699x76847179()
        Lbb:
            yd2.g r6 = new yd2.g
            r6.<init>(r1, r5, r4)
            r12.f542602d = r1
            r12.f542603e = r3
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r6, r12)
            if (r13 != r0) goto Lcb
            return r0
        Lcb:
            return r2
        Lcc:
            r13 = move-exception
            yd2.j.a(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "reportToolResults: serialize failed: "
            r0.<init>(r1)
            java.lang.String r13 = r13.getMessage()
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            java.lang.String r0 = "Finder.Live.AiAssistant.ToolManager"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yd2.i.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
