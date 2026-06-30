package rv0;

/* loaded from: classes5.dex */
public final class n6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f481683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6(rv0.z6 z6Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481683e = z6Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.n6(this.f481683e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.n6) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0052 A[RETURN] */
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
            int r1 = r13.f481682d
            r2 = 3
            r3 = 2
            r4 = 1
            rv0.z6 r5 = r13.f481683e
            if (r1 == 0) goto L25
            if (r1 == r4) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L53
        L15:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L48
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            goto L35
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r14)
            gx0.bf r14 = r5.t7()
            r13.f481682d = r4
            java.lang.Object r14 = r14.e7(r13)
            if (r14 != r0) goto L35
            return r0
        L35:
            gx0.bf r6 = r5.t7()
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 7
            r12 = 0
            r13.f481682d = r3
            r10 = r13
            java.lang.Object r14 = gx0.bf.d7(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r0) goto L48
            return r0
        L48:
            rv0.c7 r14 = rv0.c7.f481494e
            r13.f481682d = r2
            java.lang.Object r14 = rv0.z6.m7(r5, r14, r13)
            if (r14 != r0) goto L53
            return r0
        L53:
            gx0.bf r14 = r5.t7()
            r0 = 0
            com.tencent.maas.model.time.MJTime r0 = r5.r7(r0)
            r14.b7(r0, r4)
            jz5.f0 r14 = jz5.f0.f384359a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.n6.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
