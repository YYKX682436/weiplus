package yx0;

/* loaded from: classes5.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f549332d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549333e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549334f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pp0.p0 f549335g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f549336h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a f549337i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(yx0.b8 b8Var, java.lang.String str, pp0.p0 p0Var, java.lang.Long l17, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4024xee1c0e5a c4024xee1c0e5a, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549333e = b8Var;
        this.f549334f = str;
        this.f549335g = p0Var;
        this.f549336h = l17;
        this.f549337i = c4024xee1c0e5a;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.z2(this.f549333e, this.f549334f, this.f549335g, this.f549336h, this.f549337i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.z2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x004c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f549332d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlin.Result r6 = (p3321xbce91901.C29043x91b2b43d) r6
            java.lang.Object r6 = r6.getValue()
            goto L43
        L16:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L34
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            yx0.b8 r6 = r5.f549333e
            java.lang.String r1 = r5.f549334f
            pp0.p0 r4 = r5.f549335g
            r5.f549332d = r3
            java.lang.Object r6 = yx0.b8.k(r6, r1, r4, r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            com.tencent.maas.camstudio.MJCamTemplateOverridingParams r6 = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4025xdf96d81b) r6
            pp0.p0 r1 = r5.f549335g
            java.lang.String r3 = r5.f549334f
            r5.f549332d = r2
            java.lang.Object r6 = r1.p0(r3, r6, r5)
            if (r6 != r0) goto L43
            return r0
        L43:
            yx0.b8 r0 = r5.f549333e
            java.lang.Object r1 = r0.N
            java.lang.String r2 = r5.f549334f
            com.tencent.maas.camstudio.MJCamTemplateInfo r3 = r5.f549337i
            monitor-enter(r1)
            java.util.HashMap r0 = r0.P     // Catch: java.lang.Throwable -> L91
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L91
            monitor-exit(r1)
            boolean r0 = p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(r6)
            if (r0 == 0) goto L86
            java.lang.String r0 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "internalApplyTemplate >> but setTemplate is error "
            r1.<init>(r2)
            java.lang.String r2 = r5.f549334f
            r1.append(r2)
            r2 = 32
            r1.append(r2)
            java.lang.Long r3 = r5.f549336h
            r1.append(r3)
            r1.append(r2)
            java.lang.Throwable r2 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(r6)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            kotlin.Result r6 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r6)
            return r6
        L86:
            yx0.b8 r0 = r5.f549333e
            com.tencent.maas.camstudio.MJCamTemplateInfo r1 = r5.f549337i
            r0.Q = r1
            kotlin.Result r6 = p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(r6)
            return r6
        L91:
            r6 = move-exception
            monitor-exit(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.z2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
