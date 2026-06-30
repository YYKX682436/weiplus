package df2;

/* loaded from: classes3.dex */
public final class jd extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.od f312003e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.n72 f312004f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jd(df2.od odVar, r45.n72 n72Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312003e = odVar;
        this.f312004f = n72Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.jd(this.f312003e, this.f312004f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.jd) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
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
            int r1 = r6.f312002d
            r45.n72 r2 = r6.f312004f
            r3 = 0
            df2.od r4 = r6.f312003e
            r5 = 1
            if (r1 == 0) goto L1a
            if (r1 != r5) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L36
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            dk2.xf r7 = r4.P6()
            if (r7 == 0) goto L39
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r4.getStore()
            gk2.e r1 = r1.getLiveRoomData()
            r6.f312002d = r5
            dk2.r4 r7 = (dk2.r4) r7
            java.lang.Object r7 = r7.n0(r1, r2, r6)
            if (r7 != r0) goto L36
            return r0
        L36:
            r45.m72 r7 = (r45.m72) r7
            goto L3a
        L39:
            r7 = r3
        L3a:
            if (r7 == 0) goto L5a
            r45.d62 r7 = r4.f312490q
            jz5.g r0 = r4.f312493t
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r0.get(r2)
            r45.d62 r0 = (r45.d62) r0
            if (r0 == 0) goto L53
            if (r0 != r7) goto L53
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 == 0) goto L5a
            r4.f312490q = r3
            r4.f312491r = r3
        L5a:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.jd.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
