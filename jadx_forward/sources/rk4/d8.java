package rk4;

/* loaded from: classes11.dex */
public final class d8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f478149d;

    /* renamed from: e, reason: collision with root package name */
    public int f478150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478152g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f478153h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478154i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 f478155m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d8(java.lang.String str, rk4.k8 k8Var, java.util.Map map, android.content.Context context, com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478151f = str;
        this.f478152g = k8Var;
        this.f478153h = map;
        this.f478154i = context;
        this.f478155m = c10716x931597c6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.d8(this.f478151f, this.f478152g, this.f478153h, this.f478154i, this.f478155m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.d8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b2 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r16) {
        /*
            r15 = this;
            r9 = r15
            pz5.a r10 = pz5.a.f440719d
            int r0 = r9.f478150e
            r8 = 0
            r11 = 3
            r1 = 2
            jz5.f0 r12 = jz5.f0.f384359a
            rk4.k8 r13 = r9.f478152g
            r2 = 1
            if (r0 == 0) goto L36
            if (r0 == r2) goto L2b
            if (r0 == r1) goto L22
            if (r0 != r11) goto L1a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            goto Lb2
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L22:
            java.lang.Object r0 = r9.f478149d
            pi0.l1 r0 = (pi0.l1) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            goto L8e
        L2b:
            java.lang.Object r0 = r9.f478149d
            rk4.k8 r0 = (rk4.k8) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            r2 = r0
            r0 = r16
            goto L64
        L36:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r16)
            java.lang.String r0 = r9.f478151f
            int r0 = r0.length()
            if (r0 != 0) goto L43
            r0 = r2
            goto L44
        L43:
            r0 = 0
        L44:
            if (r0 == 0) goto L4f
            java.lang.String r0 = "MicroMsg.TingRouter"
            java.lang.String r1 = "openTingPageUseNewEngine routeName is empty!"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r1)
            return r12
        L4f:
            rk4.u6 r0 = rk4.k8.f478321r
            boolean r0 = r13.v()
            if (r0 != 0) goto L58
            return r12
        L58:
            r9.f478149d = r13
            r9.f478150e = r2
            java.lang.Object r0 = r13.O(r15)
            if (r0 != r10) goto L63
            return r10
        L63:
            r2 = r13
        L64:
            r3 = r0
            pi0.q r3 = (pi0.q) r3
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            pi0.l1 r14 = rk4.k8.s(r2, r3, r4, r5, r6, r7)
            rk4.k8 r0 = r9.f478152g
            java.lang.String r2 = r9.f478151f
            java.util.Map r3 = r9.f478153h
            if (r3 == 0) goto L7c
            java.util.Map r3 = kz5.c1.s(r3)
            goto L7d
        L7c:
            r3 = r8
        L7d:
            r4 = 0
            r6 = 4
            r7 = 0
            r9.f478149d = r14
            r9.f478150e = r1
            r1 = r14
            r5 = r15
            java.lang.Object r0 = rk4.k8.K(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r10) goto L8d
            return r10
        L8d:
            r0 = r14
        L8e:
            rk4.u6 r1 = rk4.k8.f478321r
            java.util.List r1 = r13.Q()
            r0.a(r1)
            android.content.Context r1 = r9.f478154i
            com.tencent.mm.flutter.ui.FlutterPageStyle r2 = r9.f478155m
            if (r2 != 0) goto L9f
            com.tencent.mm.flutter.ui.FlutterPageStyle r2 = rk4.k8.f478322s
        L9f:
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 28
            r13 = 0
            r9.f478149d = r8
            r9.f478150e = r11
            r6 = r15
            r8 = r13
            java.lang.Object r0 = pi0.l1.v(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto Lb2
            return r10
        Lb2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.d8.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
