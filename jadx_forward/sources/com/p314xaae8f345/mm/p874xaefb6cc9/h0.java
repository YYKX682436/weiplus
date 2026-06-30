package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class h0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f150607d;

    /* renamed from: e, reason: collision with root package name */
    public int f150608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.g0 f150609f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f150610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.p314xaae8f345.mm.p874xaefb6cc9.g0 g0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f150609f = g0Var;
        this.f150610g = c0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p874xaefb6cc9.h0(this.f150609f, this.f150610g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p874xaefb6cc9.h0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f150608e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L28
            if (r1 == r5) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L68
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L56
        L20:
            java.lang.Object r1 = r7.f150607d
            java.util.Map r1 = (java.util.Map) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L47
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            com.tencent.mm.minigame.g0 r8 = r7.f150609f
            com.tencent.mm.minigame.y r8 = (com.p314xaae8f345.mm.p874xaefb6cc9.y) r8
            com.tencent.mm.plugin.appbrand.service.c0 r1 = r7.f150610g
            r8.H(r1)
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            com.tencent.mm.minigame.p0 r6 = com.p314xaae8f345.mm.p874xaefb6cc9.p0.f150665a
            r7.f150607d = r8
            r7.f150608e = r5
            java.lang.Object r1 = r6.a(r1, r8, r7)
            if (r1 != r0) goto L46
            return r0
        L46:
            r1 = r8
        L47:
            ix5.h r8 = ix5.h.f377164b
            r7.f150607d = r2
            r7.f150608e = r4
            java.lang.String r4 = "bootFramework"
            java.lang.Object r8 = r8.g(r4, r1, r7)
            if (r8 != r0) goto L56
            return r0
        L56:
            ix5.h r8 = ix5.h.f377164b
            r7.f150608e = r3
            ix5.k r8 = new ix5.k
            r8.<init>(r2)
            ix5.u r1 = ix5.h.f377172j
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r1, r8, r7)
            if (r8 != r0) goto L68
            return r0
        L68:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p874xaefb6cc9.h0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
