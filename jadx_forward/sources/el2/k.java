package el2;

/* loaded from: classes3.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f335369d;

    /* renamed from: e, reason: collision with root package name */
    public int f335370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f335372g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(el2.i0 i0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f335371f = i0Var;
        this.f335372g = c19782x23db1cfa;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new el2.k(this.f335371f, this.f335372g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((el2.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r24) {
        /*
            r23 = this;
            r0 = r23
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f335370e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            el2.i0 r7 = r0.f335371f
            if (r2 == 0) goto L33
            if (r2 == r5) goto L2d
            if (r2 == r4) goto L25
            if (r2 != r3) goto L1d
            java.lang.Object r1 = r0.f335369d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r24)
            goto Lab
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L25:
            java.lang.Object r2 = r0.f335369d
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r24)
            goto L8f
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r24)
            r2 = r24
            goto L6f
        L33:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r24)
            ek2.c2 r2 = new ek2.c2
            db2.t4 r8 = db2.t4.f309704a
            r9 = 5874(0x16f2, float:8.231E-42)
            r45.kv0 r9 = r8.a(r9)
            android.content.Context r8 = r7.f199716e
            java.lang.String r10 = xy2.c.e(r8)
            r11 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r19 = 2
            r20 = 0
            r21 = 120(0x78, float:1.68E-43)
            r22 = 0
            r8 = r2
            r8.<init>(r9, r10, r11, r12, r14, r16, r17, r19, r20, r21, r22)
            android.content.Context r9 = r7.f199716e
            r10 = 0
            r11 = 0
            r13 = 6
            r14 = 0
            r8 = r2
            az2.j.u(r8, r9, r10, r11, r13, r14)
            r0.f335370e = r5
            java.lang.Object r2 = xg2.g.d(r2, r6, r0, r5, r6)
            if (r2 != r1) goto L6f
            return r1
        L6f:
            xg2.h r2 = (xg2.h) r2
            boolean r5 = r2 instanceof xg2.i
            if (r5 == 0) goto L8f
            oz5.l r5 = r2.f535925a
            if (r5 != 0) goto L7d
            oz5.l r5 = r23.mo48699x76847179()
        L7d:
            el2.j r8 = new el2.j
            com.tencent.mm.protocal.protobuf.FinderContact r9 = r0.f335372g
            r8.<init>(r2, r6, r7, r9)
            r0.f335369d = r2
            r0.f335370e = r4
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r5, r8, r0)
            if (r4 != r1) goto L8f
            return r1
        L8f:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto Lab
            oz5.l r4 = r2.f535925a
            if (r4 != 0) goto L9b
            oz5.l r4 = r23.mo48699x76847179()
        L9b:
            el2.i r5 = new el2.i
            r5.<init>(r2, r6, r7)
            r0.f335369d = r2
            r0.f335370e = r3
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r4, r5, r0)
            if (r2 != r1) goto Lab
            return r1
        Lab:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: el2.k.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
