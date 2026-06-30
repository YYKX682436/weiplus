package fo5;

/* loaded from: classes14.dex */
public final class z2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346693d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f346694e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f346695f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346694e = str;
        this.f346695f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.z2(this.f346694e, this.f346695f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.z2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r4) {
        /*
            r3 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r3.f346693d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            goto L27
        Ld:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L15:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r4)
            fo5.a r4 = fo5.f3.f346519c
            if (r4 == 0) goto L2a
            r3.f346693d = r2
            java.lang.String r1 = r3.f346694e
            java.lang.Object r4 = r4.d(r1, r3)
            if (r4 != r0) goto L27
            return r0
        L27:
            er4.p r4 = (er4.p) r4
            goto L2b
        L2a:
            r4 = 0
        L2b:
            com.tencent.mm.plugin.voipmp.platform.w r0 = fo5.f3.f346518b
            if (r0 == 0) goto L34
            long r1 = r3.f346695f
            r0.n0(r1, r4)
        L34:
            jz5.f0 r4 = jz5.f0.f384359a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.z2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
