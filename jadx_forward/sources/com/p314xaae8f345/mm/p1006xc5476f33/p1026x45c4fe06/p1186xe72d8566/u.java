package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes7.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f170099d;

    /* renamed from: e, reason: collision with root package name */
    public int f170100e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f170101f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.w f170102g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f170103h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170104i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v f170105m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f170106n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170107o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170108p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f170109q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.v vVar, android.content.Context context, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.vfs.r6 r6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f170102g = wVar;
        this.f170103h = o6Var;
        this.f170104i = str;
        this.f170105m = vVar;
        this.f170106n = context;
        this.f170107o = str2;
        this.f170108p = str3;
        this.f170109q = r6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.u(this.f170102g, this.f170103h, this.f170104i, this.f170105m, this.f170106n, this.f170107o, this.f170108p, this.f170109q, interfaceC29045xdcb5ca57);
        uVar.f170101f = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a6  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f170100e
            java.lang.String r3 = "MicroMsg.AppBrandScreenshotComponentHelper"
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L2f
            if (r2 == r5) goto L20
            if (r2 != r4) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            r2 = r22
            goto La2
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L20:
            java.lang.Object r2 = r0.f170099d
            kotlinx.coroutines.f1 r2 = (p3325xe03a0797.p3326xc267989b.f1) r2
            java.lang.Object r5 = r0.f170101f
            kotlinx.coroutines.y0 r5 = (p3325xe03a0797.p3326xc267989b.y0) r5
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            r7 = r2
            r2 = r22
            goto L8c
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            java.lang.Object r2 = r0.f170101f
            kotlinx.coroutines.y0 r2 = (p3325xe03a0797.p3326xc267989b.y0) r2
            r8 = 0
            r9 = 0
            com.tencent.mm.plugin.appbrand.screenshot.r r10 = new com.tencent.mm.plugin.appbrand.screenshot.r
            com.tencent.mm.plugin.appbrand.o6 r7 = r0.f170103h
            java.lang.String r11 = r0.f170104i
            r10.<init>(r7, r11, r6)
            r11 = 3
            r12 = 0
            r7 = r2
            kotlinx.coroutines.f1 r14 = p3325xe03a0797.p3326xc267989b.l.b(r7, r8, r9, r10, r11, r12)
            com.tencent.mm.plugin.appbrand.screenshot.s r10 = new com.tencent.mm.plugin.appbrand.screenshot.s
            com.tencent.mm.plugin.appbrand.screenshot.v r7 = r0.f170105m
            android.content.Context r11 = r0.f170106n
            java.lang.String r12 = r0.f170107o
            java.lang.String r13 = r0.f170108p
            r20 = 0
            r15 = r10
            r16 = r7
            r17 = r11
            r18 = r12
            r19 = r13
            r15.<init>(r16, r17, r18, r19, r20)
            r11 = 3
            r12 = 0
            r7 = r2
            kotlinx.coroutines.f1 r7 = p3325xe03a0797.p3326xc267989b.l.b(r7, r8, r9, r10, r11, r12)
            java.lang.String r8 = "getGenImgPath: waiting for results with 4s timeout"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r8)
            com.tencent.mm.plugin.appbrand.screenshot.t r8 = new com.tencent.mm.plugin.appbrand.screenshot.t
            com.tencent.mm.vfs.r6 r9 = r0.f170109q
            java.lang.String r10 = r0.f170104i
            r18 = 0
            r13 = r8
            r15 = r7
            r16 = r9
            r17 = r10
            r13.<init>(r14, r15, r16, r17, r18)
            r0.f170101f = r2
            r0.f170099d = r7
            r0.f170100e = r5
            r9 = 4000(0xfa0, double:1.9763E-320)
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.a4.c(r9, r8, r0)
            if (r2 != r1) goto L8c
            return r1
        L8c:
            java.lang.String r2 = (java.lang.String) r2
            if (r2 != 0) goto La4
            java.lang.String r2 = "Custom poster generation timeout, waiting for default poster result"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r3, r2)
            r0.f170101f = r6
            r0.f170099d = r6
            r0.f170100e = r4
            java.lang.Object r2 = r7.k(r0)
            if (r2 != r1) goto La2
            return r1
        La2:
            java.lang.String r2 = (java.lang.String) r2
        La4:
            if (r2 != 0) goto La9
            java.lang.String r1 = ""
            goto Laa
        La9:
            r1 = r2
        Laa:
            com.tencent.mm.plugin.appbrand.screenshot.w r3 = r0.f170102g
            r3.f170120b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.u.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
