package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes10.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f240056d;

    /* renamed from: e, reason: collision with root package name */
    public int f240057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t45.l0 f240058f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240059g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f240060h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(t45.l0 l0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca572) {
        super(2, interfaceC29045xdcb5ca572);
        this.f240058f = l0Var;
        this.f240059g = str;
        this.f240060h = interfaceC29045xdcb5ca57;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.w(this.f240058f, this.f240059g, this.f240060h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x005e  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f240057e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r12.f240056d
            kotlin.coroutines.Continuation r0 = (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L5a
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L3c
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            mx3.s r13 = mx3.u.f414153f
            r4 = 1
            r5 = 3
            t45.l0 r6 = r12.f240058f
            int r7 = r6.f497135e
            int r8 = r6.f497136f
            java.lang.String r9 = r12.f240059g
            r12.f240057e = r3
            java.lang.String r10 = ""
            r3 = r13
            r11 = r12
            java.lang.Object r13 = r3.c(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r13 != r0) goto L3c
            return r0
        L3c:
            rm0.i r13 = (rm0.i) r13
            boolean r13 = r13.f478954a
            kotlin.coroutines.Continuation r1 = r12.f240060h
            if (r13 == 0) goto L6a
            r12.f240056d = r1
            r12.f240057e = r2
            kotlinx.coroutines.p0 r13 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            vx3.j r2 = new vx3.j
            r3 = 0
            t45.l0 r4 = r12.f240058f
            r2.<init>(r4, r3)
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.l.g(r13, r2, r12)
            if (r13 != r0) goto L59
            return r0
        L59:
            r0 = r1
        L5a:
            vx3.i r13 = (vx3.i) r13
            if (r13 == 0) goto L75
            kotlin.Result$Companion r13 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            java.lang.Object r13 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r13)
            r0.mo48700xdecd0e93(r13)
            goto L75
        L6a:
            kotlin.Result$Companion r13 = p3321xbce91901.C29043x91b2b43d.INSTANCE
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            java.lang.Object r13 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(r13)
            r1.mo48700xdecd0e93(r13)
        L75:
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic.w.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
