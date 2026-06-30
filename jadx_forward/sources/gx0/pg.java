package gx0;

/* loaded from: classes5.dex */
public final class pg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358390d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.bh f358391e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg(gx0.bh bhVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358391e = bhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.pg(this.f358391e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.pg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0036, code lost:
    
        if (((java.lang.Boolean) r11).booleanValue() == true) goto L17;
     */
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
            int r1 = r10.f358390d
            gx0.bh r2 = r10.f358391e
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L18
            if (r1 != r4) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L30
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kz5.q r11 = r2.L
            java.lang.Object r11 = r11.j()
            jx0.h0 r11 = (jx0.h0) r11
            if (r11 == 0) goto L39
            com.tencent.maas.model.time.MJTime r1 = r2.H
            r10.f358390d = r4
            java.lang.Object r11 = r11.c(r3, r1, r10)
            if (r11 != r0) goto L30
            return r0
        L30:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != r4) goto L39
            goto L3a
        L39:
            r4 = r3
        L3a:
            if (r4 != 0) goto L5b
            gx0.w8 r11 = r2.a7()
            com.tencent.maas.model.time.MJTime r0 = com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16094x2a998d44
            java.lang.String r1 = "InvalidTime"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r11.getClass()
            kotlinx.coroutines.y0 r4 = r11.m158345xefc66565()
            r5 = 0
            r6 = 0
            gx0.j5 r7 = new gx0.j5
            r1 = 0
            r7.<init>(r3, r11, r0, r1)
            r8 = 3
            r9 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r4, r5, r6, r7, r8, r9)
        L5b:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.pg.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
