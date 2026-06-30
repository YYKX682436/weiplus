package xt2;

/* loaded from: classes.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f538279d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f538280e;

    /* renamed from: f, reason: collision with root package name */
    public int f538281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f538282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f538283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f538284i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f538285m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f538286n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f538287o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f538288p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(long j17, long j18, long j19, java.lang.String str, int i17, boolean z17, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538282g = j17;
        this.f538283h = j18;
        this.f538284i = j19;
        this.f538285m = str;
        this.f538286n = i17;
        this.f538287o = z17;
        this.f538288p = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.f6(this.f538282g, this.f538283h, this.f538284i, this.f538285m, this.f538286n, this.f538287o, this.f538288p, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.f6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x007c, code lost:
    
        if (r15 == null) goto L22;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r18) {
        /*
            r17 = this;
            r13 = r17
            pz5.a r14 = pz5.a.f440719d
            int r0 = r13.f538281f
            com.tencent.mm.ipcinvoker.r r12 = r13.f538288p
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r13.f538280e
            gk2.e r0 = (gk2.e) r0
            java.lang.Object r1 = r13.f538279d
            com.tencent.mm.ipcinvoker.r r1 = (com.p314xaae8f345.mm.p794xb0fa9b5e.r) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            r15 = r0
            r13 = r12
            r0 = r18
            r12 = r1
            goto L65
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            dk2.ef r0 = dk2.ef.f314905a
            gk2.e r11 = dk2.ef.I
            if (r11 == 0) goto L7f
            long r2 = r13.f538282g
            long r4 = r13.f538283h
            long r6 = r13.f538284i
            int r9 = r13.f538286n
            boolean r10 = r13.f538287o
            java.lang.Class<com.tencent.mm.feature.finder.live.z5> r0 = com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5.class
            i95.m r0 = i95.n0.c(r0)
            com.tencent.mm.feature.finder.live.z5 r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.z5) r0
            android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r15 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r15)
            java.lang.String r15 = r13.f538285m
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r15)
            r16 = 0
            r13.f538279d = r12
            r13.f538280e = r11
            r13.f538281f = r1
            r1 = r8
            r8 = r15
            r15 = r11
            r11 = r16
            r13 = r12
            r12 = r17
            java.lang.Object r0 = r0.Zi(r1, r2, r4, r6, r8, r9, r10, r11, r12)
            if (r0 != r14) goto L64
            return r14
        L64:
            r12 = r13
        L65:
            r45.s42 r0 = (r45.s42) r0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            if (r0 == 0) goto L73
            byte[] r0 = r0.mo14344x5f01b1f6()
            goto L74
        L73:
            r0 = 0
        L74:
            java.lang.String r2 = "FinderProductAutoScrollRespKey"
            r1.putByteArray(r2, r0)
            r12.a(r1)
            if (r15 != 0) goto L84
            goto L80
        L7f:
            r13 = r12
        L80:
            r0 = 0
            r13.a(r0)
        L84:
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: xt2.f6.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
