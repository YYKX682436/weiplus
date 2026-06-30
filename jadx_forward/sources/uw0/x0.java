package uw0;

/* loaded from: classes5.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f513157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uw0.e1 f513158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(uw0.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f513158e = e1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new uw0.x0(this.f513158e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((uw0.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0077 A[RETURN] */
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
            int r1 = r8.f513157d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            uw0.e1 r6 = r8.f513158e
            if (r1 == 0) goto L26
            if (r1 == r5) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L78
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L65
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L38
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            kotlinx.coroutines.r2 r9 = r6.A7()
            if (r9 == 0) goto L38
            r8.f513157d = r5
            java.lang.Object r9 = r9.C(r8)
            if (r9 != r0) goto L38
            return r0
        L38:
            xw0.r r9 = r6.u7()
            sw0.b r1 = r6.f430651q
            if (r1 == 0) goto L43
            java.lang.String r5 = r1.f494948b
            goto L44
        L43:
            r5 = r2
        L44:
            if (r1 == 0) goto L4a
            java.lang.String r1 = r1.f494949c
            if (r1 != 0) goto L54
        L4a:
            xw0.r r1 = r6.u7()
            ug.m r7 = ug.m.Caption
            java.lang.String r1 = r1.f(r7)
        L54:
            xw0.r r7 = r6.u7()
            com.tencent.maas.material.MJMaterialInfo r7 = r7.f539177h
            java.lang.String r7 = r7.f129757b
            r8.f513157d = r4
            java.lang.Object r9 = r9.g(r5, r1, r7, r8)
            if (r9 != r0) goto L65
            return r0
        L65:
            xw0.r r9 = r6.u7()
            sw0.b r1 = r6.f430651q
            if (r1 == 0) goto L6f
            java.lang.String r2 = r1.f494950d
        L6f:
            r8.f513157d = r3
            java.lang.Object r9 = r9.n(r2, r8)
            if (r9 != r0) goto L78
            return r0
        L78:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uw0.x0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
