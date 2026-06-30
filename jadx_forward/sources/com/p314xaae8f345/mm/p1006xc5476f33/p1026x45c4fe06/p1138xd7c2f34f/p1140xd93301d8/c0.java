package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8;

/* loaded from: classes7.dex */
public final class c0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f166477d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0 f166478e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f166478e = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.c0(this.f166478e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.c0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x005c  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r14) {
        /*
            r13 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r13.f166477d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            com.tencent.mm.plugin.appbrand.launching.precondition.d0 r4 = r13.f166478e
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L2d
        L11:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            boolean r14 = r4.f166486i
            if (r14 == 0) goto L41
            com.tencent.mm.plugin.appbrand.n1 r14 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.n1.f167551a
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r1 = r4.f166482e
            r13.f166477d = r3
            java.lang.Object r14 = r14.b(r1, r13)
            if (r14 != r0) goto L2d
            return r0
        L2d:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L41
            l81.v0 r14 = r4.f166485h
            if (r14 == 0) goto L40
            r0 = -10
            r1 = 2
            r3 = 0
            l81.v0.b(r14, r0, r3, r1, r3)
        L40:
            return r2
        L41:
            com.tencent.mm.plugin.appbrand.launching.w0 r14 = new com.tencent.mm.plugin.appbrand.launching.w0
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel r6 = r4.f166482e
            java.lang.String r7 = r4.f166483f
            r8 = 0
            com.tencent.mm.plugin.appbrand.launching.precondition.a0 r9 = new com.tencent.mm.plugin.appbrand.launching.precondition.a0
            r9.<init>(r4)
            com.tencent.mm.plugin.appbrand.launching.precondition.b0 r10 = new com.tencent.mm.plugin.appbrand.launching.precondition.b0
            r10.<init>(r4)
            r11 = 4
            r12 = 0
            r5 = r14
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            com.tencent.luggage.sdk.launching.p r0 = r4.f166487m
            if (r0 != 0) goto L5e
            com.tencent.luggage.sdk.launching.p r0 = com.p314xaae8f345.p425x1ea3c036.sdk.p442xd7c2f34f.p.LEGACY
        L5e:
            r14.f166846m = r0
            r14.run()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.c0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
