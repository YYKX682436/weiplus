package rx;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f482193d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rx.f f482194e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(rx.f fVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f482194e = fVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rx.d(this.f482194e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rx.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x007b  */
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
            int r1 = r7.f482193d
            r2 = 0
            rx.f r3 = r7.f482194e
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1f
            if (r1 == r5) goto L1b
            if (r1 != r4) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L72
        L13:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L46
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            r7.f482193d = r5
            r3.getClass()
            com.tencent.mm.modelcdntran.z r8 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj()
            r8.getClass()
            oz5.n r1 = new oz5.n
            kotlin.coroutines.Continuation r6 = pz5.f.b(r7)
            r1.<init>(r6)
            com.tencent.mm.modelcdntran.l r6 = new com.tencent.mm.modelcdntran.l
            r6.<init>(r1, r8, r2)
            r8.c7(r6)
            java.lang.Object r8 = r1.a()
            if (r8 != r0) goto L46
            return r0
        L46:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L7c
            r7.f482193d = r4
            r3.getClass()
            com.tencent.mm.modelcdntran.z r8 = com.p314xaae8f345.mm.p947xba6de98f.s1.aj()
            r8.getClass()
            oz5.n r1 = new oz5.n
            kotlin.coroutines.Continuation r3 = pz5.f.b(r7)
            r1.<init>(r3)
            com.tencent.mm.modelcdntran.m r3 = new com.tencent.mm.modelcdntran.m
            r3.<init>(r1, r8, r2)
            r8.c7(r3)
            java.lang.Object r8 = r1.a()
            if (r8 != r0) goto L72
            return r0
        L72:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L7b
            goto L7c
        L7b:
            r5 = 0
        L7c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rx.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
