package vr0;

/* loaded from: classes14.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(vr0.z zVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521056e = zVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vr0.w(this.f521056e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0046 A[RETURN] */
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
            int r1 = r5.f521055d
            r2 = 2
            r3 = 1
            vr0.z r4 = r5.f521056e
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L47
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L34
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            xr0.d r6 = r4.f492970n
            boolean r6 = r6.f537697f
            if (r6 == 0) goto L3e
            nr0.x r6 = r4.f492967h
            if (r6 == 0) goto L36
            r5.f521055d = r3
            java.lang.Object r6 = r6.k(r5)
            if (r6 != r0) goto L34
            return r0
        L34:
            jz5.f0 r6 = (jz5.f0) r6
        L36:
            vr0.v r6 = new vr0.v
            r1 = 0
            r6.<init>(r4, r1)
            r4.E = r6
        L3e:
            r5.f521055d = r2
            java.lang.Object r6 = r4.K(r5)
            if (r6 != r0) goto L47
            return r0
        L47:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.w.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
