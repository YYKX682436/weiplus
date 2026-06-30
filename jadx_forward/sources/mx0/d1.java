package mx0;

/* loaded from: classes5.dex */
public final class d1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f413438d;

    /* renamed from: e, reason: collision with root package name */
    public int f413439e;

    /* renamed from: f, reason: collision with root package name */
    public int f413440f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.e1 f413441g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f413442h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(mx0.e1 e1Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413441g = e1Var;
        this.f413442h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.d1(this.f413441g, this.f413442h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.d1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b9 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f413440f
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            mx0.e1 r6 = r9.f413441g
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L2a
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lba
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            int r1 = r9.f413439e
            java.lang.Object r3 = r9.f413438d
            com.tencent.maas.camerafun.MJRecordingFinishInfo r3 = (com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5) r3
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L97
        L2a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L50
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r9.f413440f = r5
            r6.getClass()
            oz5.n r10 = new oz5.n
            kotlin.coroutines.Continuation r1 = pz5.f.b(r9)
            r10.<init>(r1)
            mx0.b1 r1 = new mx0.b1
            r1.<init>(r10)
            pp0.p0 r7 = r6.f413467a
            r7.y0(r4, r1)
            java.lang.Object r10 = r10.a()
            if (r10 != r0) goto L50
            return r0
        L50:
            com.tencent.maas.camerafun.MJRecordingFinishInfo r10 = (com.p314xaae8f345.p457x3304c6.p460xeb9dbc3a.C3981x30b9dbd5) r10
            mx0.c0 r1 = r6.f413472f
            if (r1 == 0) goto L61
            yx0.w5 r1 = (yx0.w5) r1
            yx0.w r7 = yx0.w.f549258d
            yx0.b8 r1 = r1.f549275a
            boolean r1 = r1.Y(r10, r7)
            goto L62
        L61:
            r1 = r4
        L62:
            boolean r7 = r9.f413442h
            if (r7 == 0) goto L69
            if (r1 != 0) goto L69
            r4 = r5
        L69:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r8 = "startExportingVideoForMaterialImport: shouldCloseSession:"
            r5.<init>(r8)
            r5.append(r7)
            java.lang.String r7 = " isConditionNotMet:"
            r5.append(r7)
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            java.lang.String r5 = "MicroMsg.MaterialImportHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r1)
            if (r4 == 0) goto L99
            pp0.p0 r1 = r6.f413467a
            r9.f413438d = r10
            r9.f413439e = r4
            r9.f413440f = r3
            java.lang.Object r1 = r1.m0(r9)
            if (r1 != r0) goto L95
            return r0
        L95:
            r3 = r10
            r1 = r4
        L97:
            r4 = r1
            r10 = r3
        L99:
            if (r10 == 0) goto La0
            if (r4 == 0) goto La0
            mx0.d0 r1 = mx0.d0.f413426d
            goto La2
        La0:
            mx0.d0 r1 = mx0.d0.f413428f
        La2:
            r6.f(r1)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            mx0.c1 r3 = new mx0.c1
            r4 = 0
            r3.<init>(r10, r6, r4)
            r9.f413438d = r4
            r9.f413440f = r2
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r1, r3, r9)
            if (r10 != r0) goto Lba
            return r0
        Lba:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.d1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
