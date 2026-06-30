package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic;

/* loaded from: classes8.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f243530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n f243531e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f243532f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f243533g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n nVar, java.lang.String str, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f243531e = nVar;
        this.f243532f = str;
        this.f243533g = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.j(this.f243531e, this.f243532f, this.f243533g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f243530d
            kz5.p0 r2 = kz5.p0.f395529d
            long r3 = r10.f243533g
            r5 = 2
            r6 = 1
            java.lang.String r7 = r10.f243532f
            com.tencent.mm.plugin.setting.ui.setting_new.uic.n r8 = r10.f243531e
            if (r1 == 0) goto L24
            if (r1 == r6) goto L20
            if (r1 != r5) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Exception -> L7c
            goto L5e
        L18:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)     // Catch: java.lang.Exception -> L7c
            goto L34
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlinx.coroutines.r2 r11 = r8.f243540f     // Catch: java.lang.Exception -> L7c
            if (r11 == 0) goto L34
            r10.f243530d = r6     // Catch: java.lang.Exception -> L7c
            java.lang.Object r11 = r11.C(r10)     // Catch: java.lang.Exception -> L7c
            if (r11 != r0) goto L34
            return r0
        L34:
            jz5.g r11 = r8.f243538d     // Catch: java.lang.Exception -> L7c
            jz5.n r11 = (jz5.n) r11     // Catch: java.lang.Exception -> L7c
            java.lang.Object r11 = r11.mo141623x754a37bb()     // Catch: java.lang.Exception -> L7c
            wd0.y1 r11 = (wd0.y1) r11     // Catch: java.lang.Exception -> L7c
            jz5.g r1 = r8.f243539e     // Catch: java.lang.Exception -> L7c
            jz5.n r1 = (jz5.n) r1     // Catch: java.lang.Exception -> L7c
            java.lang.Object r1 = r1.mo141623x754a37bb()     // Catch: java.lang.Exception -> L7c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L7c
            r10.f243530d = r5     // Catch: java.lang.Exception -> L7c
            vd0.l3 r11 = (vd0.l3) r11     // Catch: java.lang.Exception -> L7c
            r11.getClass()     // Catch: java.lang.Exception -> L7c
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392101a     // Catch: java.lang.Exception -> L7c
            vd0.k3 r6 = new vd0.k3     // Catch: java.lang.Exception -> L7c
            r9 = 0
            r6.<init>(r7, r11, r1, r9)     // Catch: java.lang.Exception -> L7c
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r10)     // Catch: java.lang.Exception -> L7c
            if (r11 != r0) goto L5e
            return r0
        L5e:
            java.util.List r11 = (java.util.List) r11     // Catch: java.lang.Exception -> L7c
            if (r11 != 0) goto L63
            r11 = r2
        L63:
            long r0 = r8.f243542h     // Catch: java.lang.Exception -> L7c
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L94
            j75.f r0 = r8.Q6()     // Catch: java.lang.Exception -> L7c
            if (r0 == 0) goto L94
            r24.c r1 = new r24.c     // Catch: java.lang.Exception -> L7c
            java.lang.String r5 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n.T6(r8)     // Catch: java.lang.Exception -> L7c
            r1.<init>(r7, r11, r5)     // Catch: java.lang.Exception -> L7c
            r0.B3(r1)     // Catch: java.lang.Exception -> L7c
            goto L94
        L7c:
            long r0 = r8.f243542h
            int r11 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r11 != 0) goto L94
            j75.f r11 = r8.Q6()
            if (r11 == 0) goto L94
            r24.c r0 = new r24.c
            java.lang.String r1 = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.n.T6(r8)
            r0.<init>(r7, r2, r1)
            r11.B3(r0)
        L94:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.j.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
