package bg2;

/* loaded from: classes2.dex */
public final class s4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.t4 f102032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f102033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(bg2.t4 t4Var, bg2.a5 a5Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102032e = t4Var;
        this.f102033f = a5Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.s4(this.f102032e, this.f102033f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.s4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f102031d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1c
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L3f
        L10:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L34
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            bg2.t4 r9 = r8.f102032e
            bg2.r4 r9 = r9.f102054a
            long r4 = r9.f101993d
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 <= 0) goto L3f
            r8.f102031d = r3
            java.lang.Object r9 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r8)
            if (r9 != r0) goto L34
            return r0
        L34:
            r8.f102031d = r2
            bg2.a5 r9 = r8.f102033f
            java.lang.Object r9 = bg2.a5.Y6(r9, r3, r8)
            if (r9 != r0) goto L3f
            return r0
        L3f:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.s4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
