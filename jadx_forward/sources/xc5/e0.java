package xc5;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f534965d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f534966e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xc5.h0 f534967f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mf3.k f534968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, xc5.h0 h0Var, mf3.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534966e = f9Var;
        this.f534967f = h0Var;
        this.f534968g = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.e0(this.f534966e, this.f534967f, this.f534968g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xc5.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a4 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.MsgHistoryGalleryImageBottomBarLayer"
            java.lang.Class<xs.d1> r1 = xs.d1.class
            pz5.a r2 = pz5.a.f440719d
            int r3 = r12.f534965d
            jz5.f0 r4 = jz5.f0.f384359a
            r5 = 3
            r6 = 2
            r7 = 0
            mf3.k r8 = r12.f534968g
            xc5.h0 r9 = r12.f534967f
            r10 = 1
            if (r3 == 0) goto L2f
            if (r3 == r10) goto L2b
            if (r3 == r6) goto L27
            if (r3 != r5) goto L1f
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto La5
        L1f:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L27:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L91
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L73
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            i95.m r13 = i95.n0.c(r1)     // Catch: java.lang.Exception -> L43
            xs.d1 r13 = (xs.d1) r13     // Catch: java.lang.Exception -> L43
            com.tencent.mm.storage.f9 r3 = r12.f534966e     // Catch: java.lang.Exception -> L43
            s70.c r11 = s70.c.f485453h     // Catch: java.lang.Exception -> L43
            v70.w r13 = (v70.w) r13     // Catch: java.lang.Exception -> L43
            l70.d r13 = r13.cj(r3, r11, r10)     // Catch: java.lang.Exception -> L43
            goto L5a
        L43:
            r13 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r11 = "genDownloadParams Big failed: "
            r3.<init>(r11)
            java.lang.String r13 = r13.getMessage()
            r3.append(r13)
            java.lang.String r13 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r13)
            r13 = r7
        L5a:
            if (r13 != 0) goto L74
            java.lang.String r13 = "download origin failed, params null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r13)
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r13 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            xc5.z r0 = new xc5.z
            r0.<init>(r9, r8, r7)
            r12.f534965d = r10
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r0, r12)
            if (r13 != r2) goto L73
            return r2
        L73:
            return r4
        L74:
            xc5.d0 r0 = new xc5.d0
            r0.<init>(r9, r8)
            java.lang.ref.WeakReference r3 = new java.lang.ref.WeakReference
            r3.<init>(r0)
            r13.f398346n = r3
            i95.m r0 = i95.n0.c(r1)
            xs.d1 r0 = (xs.d1) r0
            r12.f534965d = r6
            v70.w r0 = (v70.w) r0
            java.lang.Object r13 = r0.bj(r13, r12)
            if (r13 != r2) goto L91
            return r2
        L91:
            l70.e r13 = (l70.e) r13
            kotlinx.coroutines.p0 r0 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r0 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            xc5.a0 r1 = new xc5.a0
            r1.<init>(r9, r13, r8, r7)
            r12.f534965d = r5
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r0, r1, r12)
            if (r13 != r2) goto La5
            return r2
        La5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: xc5.e0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
