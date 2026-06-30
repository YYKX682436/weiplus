package df2;

/* loaded from: classes5.dex */
public final class ca extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311402d;

    /* renamed from: e, reason: collision with root package name */
    public int f311403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xe1 f311404f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311405g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311406h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca(r45.xe1 xe1Var, df2.zb zbVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311404f = xe1Var;
        this.f311405g = zbVar;
        this.f311406h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.ca(this.f311404f, this.f311405g, this.f311406h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.ca) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0065  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f311403e
            java.lang.String r2 = r8.f311406h
            df2.zb r3 = r8.f311405g
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r1 == 0) goto L30
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1c
            java.lang.Object r0 = r8.f311402d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7d
        L1c:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L24:
            java.lang.Object r1 = r8.f311402d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L61
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L42
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r45.xe1 r9 = r8.f311404f
            com.tencent.mm.modelbase.i r9 = r9.d()
            r8.f311403e = r6
            java.lang.Object r9 = xg2.g.d(r9, r7, r8, r6, r7)
            if (r9 != r0) goto L42
            return r0
        L42:
            r1 = r9
            xg2.h r1 = (xg2.h) r1
            boolean r9 = r1 instanceof xg2.i
            if (r9 == 0) goto L61
            oz5.l r9 = r1.f535925a
            if (r9 != 0) goto L51
            oz5.l r9 = r8.mo48699x76847179()
        L51:
            df2.ba r6 = new df2.ba
            r6.<init>(r1, r7, r3, r2)
            r8.f311402d = r1
            r8.f311403e = r5
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r6, r8)
            if (r9 != r0) goto L61
            return r0
        L61:
            boolean r9 = r1 instanceof xg2.b
            if (r9 == 0) goto L7d
            oz5.l r9 = r1.f535925a
            if (r9 != 0) goto L6d
            oz5.l r9 = r8.mo48699x76847179()
        L6d:
            df2.aa r5 = new df2.aa
            r5.<init>(r1, r7, r3, r2)
            r8.f311402d = r1
            r8.f311403e = r4
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.l.g(r9, r5, r8)
            if (r9 != r0) goto L7d
            return r0
        L7d:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.ca.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
