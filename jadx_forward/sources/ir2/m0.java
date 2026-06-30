package ir2;

/* loaded from: classes2.dex */
public final class m0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f375714d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir2.a1 f375715e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(ir2.a1 a1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375715e = a1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ir2.m0(this.f375715e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ir2.m0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f375714d
            ir2.a1 r2 = r5.f375715e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L40
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L2e
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            ir2.a0 r6 = r2.f375626f
            if (r6 == 0) goto L40
            r5.f375714d = r4
            java.lang.Object r6 = r6.d(r5)
            if (r6 != r0) goto L2e
            return r0
        L2e:
            ir2.e1 r6 = (ir2.e1) r6
            if (r6 == 0) goto L40
            ir2.r r1 = new ir2.r
            r1.<init>(r6)
            r5.f375714d = r3
            java.lang.Object r6 = r2.T6(r1, r5)
            if (r6 != r0) goto L40
            return r0
        L40:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir2.m0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
