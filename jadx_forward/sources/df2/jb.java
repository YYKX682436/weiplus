package df2;

/* loaded from: classes.dex */
public final class jb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311991d;

    /* renamed from: e, reason: collision with root package name */
    public int f311992e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311993f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f311994g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.n72 f311995h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f311996i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f311997m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311998n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb(java.lang.String str, long j17, r45.n72 n72Var, int i17, java.lang.String str2, df2.zb zbVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311993f = str;
        this.f311994g = j17;
        this.f311995h = n72Var;
        this.f311996i = i17;
        this.f311997m = str2;
        this.f311998n = zbVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.jb(this.f311993f, this.f311994g, this.f311995h, this.f311996i, this.f311997m, this.f311998n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.jb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
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
            int r1 = r12.f311992e
            df2.zb r2 = r12.f311998n
            r3 = 3
            r4 = 2
            r5 = 0
            r6 = 1
            if (r1 == 0) goto L30
            if (r1 == r6) goto L2c
            if (r1 == r4) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r12.f311991d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Ldb
        L1b:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L23:
            java.lang.Object r1 = r12.f311991d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lbf
        L2c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto La0
        L30:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r45.l72 r13 = new r45.l72
            r13.<init>()
            db2.t4 r1 = db2.t4.f309704a
            r7 = 16416(0x4020, float:2.3004E-41)
            r45.kv0 r1 = r1.a(r7)
            r13.set(r6, r1)
            r1 = 4
            java.lang.String r7 = r12.f311993f
            r13.set(r1, r7)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = c01.z1.r()
            r1.append(r7)
            r7 = 95
            r1.append(r7)
            long r8 = r12.f311994g
            r1.append(r8)
            r1.append(r7)
            long r10 = java.lang.System.currentTimeMillis()
            r1.append(r10)
            java.lang.String r1 = r1.toString()
            r13.set(r3, r1)
            r45.n72 r1 = r12.f311995h
            int r1 = r1.f462662d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r13.set(r4, r1)
            r1 = 5
            java.lang.Long r7 = java.lang.Long.valueOf(r8)
            r13.set(r1, r7)
            r1 = 6
            int r7 = r12.f311996i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13.set(r1, r7)
            r1 = 7
            java.lang.String r7 = r12.f311997m
            r13.set(r1, r7)
            com.tencent.mm.modelbase.i r13 = r13.d()
            r12.f311992e = r6
            java.lang.Object r13 = xg2.g.d(r13, r5, r12, r6, r5)
            if (r13 != r0) goto La0
            return r0
        La0:
            r1 = r13
            xg2.h r1 = (xg2.h) r1
            boolean r13 = r1 instanceof xg2.i
            if (r13 == 0) goto Lbf
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto Laf
            oz5.l r13 = r12.mo48699x76847179()
        Laf:
            df2.ib r6 = new df2.ib
            r6.<init>(r1, r5, r2)
            r12.f311991d = r1
            r12.f311992e = r4
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r6, r12)
            if (r13 != r0) goto Lbf
            return r0
        Lbf:
            boolean r13 = r1 instanceof xg2.b
            if (r13 == 0) goto Ldb
            oz5.l r13 = r1.f535925a
            if (r13 != 0) goto Lcb
            oz5.l r13 = r12.mo48699x76847179()
        Lcb:
            df2.hb r4 = new df2.hb
            r4.<init>(r1, r5, r2)
            r12.f311991d = r1
            r12.f311992e = r3
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r4, r12)
            if (r13 != r0) goto Ldb
            return r0
        Ldb:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.jb.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
