package rk4;

/* loaded from: classes11.dex */
public final class a8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f478079d;

    /* renamed from: e, reason: collision with root package name */
    public int f478080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f478081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f478082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f478083h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ byte[] f478084i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f478085m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8(rk4.k8 k8Var, byte[] bArr, java.lang.String str, byte[] bArr2, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f478081f = k8Var;
        this.f478082g = bArr;
        this.f478083h = str;
        this.f478084i = bArr2;
        this.f478085m = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rk4.a8(this.f478081f, this.f478082g, this.f478083h, this.f478084i, this.f478085m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.a8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c5 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r20) {
        /*
            r19 = this;
            r9 = r19
            pz5.a r10 = pz5.a.f440719d
            int r0 = r9.f478080e
            jz5.f0 r11 = jz5.f0.f384359a
            r8 = 3
            r1 = 2
            r12 = 1
            if (r0 == 0) goto L34
            if (r0 == r12) goto L29
            if (r0 == r1) goto L20
            if (r0 != r8) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r20)
            goto Lc5
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.Object r0 = r9.f478079d
            pi0.l1 r0 = (pi0.l1) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r20)
            goto La0
        L29:
            java.lang.Object r0 = r9.f478079d
            rk4.k8 r0 = (rk4.k8) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r20)
            r2 = r20
        L32:
            r13 = r0
            goto L4d
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r20)
            rk4.u6 r0 = rk4.k8.f478321r
            rk4.k8 r0 = r9.f478081f
            boolean r2 = r0.v()
            if (r2 != 0) goto L42
            return r11
        L42:
            r9.f478079d = r0
            r9.f478080e = r12
            java.lang.Object r2 = r0.O(r9)
            if (r2 != r10) goto L32
            return r10
        L4d:
            r14 = r2
            pi0.q r14 = (pi0.q) r14
            r15 = 0
            r16 = 0
            r17 = 6
            r18 = 0
            pi0.l1 r13 = rk4.k8.s(r13, r14, r15, r16, r17, r18)
            jz5.l[] r0 = new jz5.l[r8]
            jz5.l r2 = new jz5.l
            java.lang.String r3 = "discoverLineBuffer"
            byte[] r4 = r9.f478082g
            r2.<init>(r3, r4)
            r3 = 0
            r0[r3] = r2
            jz5.l r2 = new jz5.l
            java.lang.String r3 = "finderUsername"
            java.lang.String r4 = r9.f478083h
            r2.<init>(r3, r4)
            r0[r12] = r2
            jz5.l r2 = new jz5.l
            byte[] r3 = r9.f478084i
            if (r3 == 0) goto L7b
            goto L7d
        L7b:
            java.lang.String r3 = ""
        L7d:
            java.lang.String r4 = "sessionBuffer"
            r2.<init>(r4, r3)
            r0[r1] = r2
            java.util.Map r3 = kz5.c1.l(r0)
            rk4.k8 r0 = r9.f478081f
            java.lang.String r2 = "profile_music_tab_more"
            r4 = 0
            r6 = 4
            r7 = 0
            r9.f478079d = r13
            r9.f478080e = r1
            r1 = r13
            r5 = r19
            java.lang.Object r0 = rk4.k8.K(r0, r1, r2, r3, r4, r5, r6, r7)
            if (r0 != r10) goto L9f
            return r10
        L9f:
            r0 = r13
        La0:
            dm4.b r1 = new dm4.b
            r1.<init>(r12)
            java.util.List r1 = kz5.b0.c(r1)
            r0.a(r1)
            android.content.Context r1 = r9.f478085m
            com.tencent.mm.flutter.ui.FlutterPageStyle r2 = rk4.k8.f478322s
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 28
            r12 = 0
            r6 = 0
            r9.f478079d = r6
            r9.f478080e = r8
            r6 = r19
            r8 = r12
            java.lang.Object r0 = pi0.l1.v(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 != r10) goto Lc5
            return r10
        Lc5:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.a8.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
