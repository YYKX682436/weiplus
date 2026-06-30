package uw0;

/* loaded from: classes5.dex */
public final class n0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f513114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.t0 f513115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb f513116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(uw0.t0 t0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513115e = t0Var;
        this.f513116f = c4187xe514cceb;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new uw0.n0(this.f513115e, this.f513116f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.n0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f513114d
            r2 = 3
            r3 = 2
            uw0.t0 r4 = r6.f513115e
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L4b
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L40
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L31
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r6.f513114d = r5
            java.lang.Object r7 = r4.A7(r6)
            if (r7 != r0) goto L31
            return r0
        L31:
            gx0.hf r7 = r4.G7()
            r6.f513114d = r3
            r1 = 0
            r3 = 0
            java.lang.Object r7 = gx0.hf.d7(r7, r1, r6, r5, r3)
            if (r7 != r0) goto L40
            return r0
        L40:
            r6.f513114d = r2
            com.tencent.maas.moviecomposing.segments.MovieTitleSegment r7 = r6.f513116f
            java.lang.Object r7 = r4.T7(r7, r6)
            if (r7 != r0) goto L4b
            return r0
        L4b:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.n0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
