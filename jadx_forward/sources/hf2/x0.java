package hf2;

/* loaded from: classes10.dex */
public final class x0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362728d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.y0 f362729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362730f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(hf2.y0 y0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362729e = y0Var;
        this.f362730f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.x0(this.f362729e, this.f362730f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.x0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
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
            int r1 = r6.f362728d
            java.lang.String r2 = "maas_updateText"
            r3 = 2
            r4 = 1
            hf2.y0 r5 = r6.f362729e
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L3b
        L14:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L2c
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r6.f362728d = r4
            java.lang.Object r7 = r5.d(r2, r6)
            if (r7 != r0) goto L2c
            return r0
        L2c:
            hf2.x r7 = r5.f362733a
            r45.h84 r7 = r7.f362719r
            r6.f362728d = r3
            java.lang.String r1 = r6.f362730f
            java.lang.Object r7 = r5.a(r7, r1, r6)
            if (r7 != r0) goto L3b
            return r0
        L3b:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            if (r7 == 0) goto L4a
            hf2.x r0 = r5.f362733a
            hf2.b2 r0 = r0.h7()
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.d(r2, r7, r1)
        L4a:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.x0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
