package qg5;

/* loaded from: classes5.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f444505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f444506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f444507f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f444508g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f444509h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p3325xe03a0797.p3326xc267989b.z zVar, qg5.l0 l0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f444506e = zVar;
        this.f444507f = l0Var;
        this.f444508g = f9Var;
        this.f444509h = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new qg5.f0(this.f444506e, this.f444507f, this.f444508g, this.f444509h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qg5.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x009c A[PHI: r12
  0x009c: PHI (r12v6 java.lang.Object) = (r12v3 java.lang.Object), (r12v0 java.lang.Object) binds: [B:19:0x0099, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0034 -> B:11:0x0037). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f444505d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L19
            if (r1 != r2) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L9c
        L11:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r12 = r11
            goto L37
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            r12 = r11
        L22:
            kotlinx.coroutines.z r1 = r12.f444506e
            kotlinx.coroutines.c3 r1 = (p3325xe03a0797.p3326xc267989b.c3) r1
            boolean r1 = r1.A()
            if (r1 != 0) goto L8f
            r12.f444505d = r3
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r12)
            if (r1 != r0) goto L37
            return r0
        L37:
            qg5.l0 r1 = r12.f444507f
            tg3.u0 r4 = r1.aj()
            java.lang.String r1 = "access$getC2cFileService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            com.tencent.mm.storage.f9 r5 = r12.f444508g
            bm5.f0 r6 = bm5.f0.f104104s
            java.lang.String r7 = r5.z0()
            r8 = 0
            r9 = 8
            r10 = 0
            java.lang.String r1 = tg3.u0.e8(r4, r5, r6, r7, r8, r9, r10)
            boolean r4 = r26.n0.N(r1)
            r4 = r4 ^ r3
            if (r4 == 0) goto L22
            boolean r4 = com.p314xaae8f345.mm.vfs.w6.j(r1)
            if (r4 == 0) goto L22
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "[tryDownloadFile] video file found at "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " after "
            r3.append(r1)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r12.f444509h
            long r4 = r4 - r6
            r3.append(r4)
            java.lang.String r1 = "ms"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r3 = "MicroMsg.ChatRecordsStagingFeatureService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r1)
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            kotlinx.coroutines.z r3 = r12.f444506e
            kotlinx.coroutines.a0 r3 = (p3325xe03a0797.p3326xc267989b.a0) r3
            r3.U(r1)
        L8f:
            r12.f444505d = r2
            kotlinx.coroutines.z r1 = r12.f444506e
            kotlinx.coroutines.a0 r1 = (p3325xe03a0797.p3326xc267989b.a0) r1
            java.lang.Object r12 = r1.k(r12)
            if (r12 != r0) goto L9c
            return r0
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: qg5.f0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
