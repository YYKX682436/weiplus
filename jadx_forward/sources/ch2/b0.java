package ch2;

/* loaded from: classes10.dex */
public final class b0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f122822d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122823e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f122824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122825g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(ch2.o2 o2Var, r45.yx1 yx1Var, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122823e = o2Var;
        this.f122824f = yx1Var;
        this.f122825g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.b0(this.f122823e, this.f122824f, this.f122825g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ch2.b0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0039  */
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
            int r1 = r5.f122822d
            ch2.o2 r2 = r5.f122823e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L31
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.Class<sf2.d3> r6 = sf2.d3.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r6 = r2.m56789x25fe639c(r6)
            sf2.d3 r6 = (sf2.d3) r6
            if (r6 == 0) goto L34
            r5.f122822d = r3
            r1 = 0
            r3 = 7
            r45.yx1 r4 = r5.f122824f
            java.lang.Object r6 = r6.o7(r3, r4, r1, r5)
            if (r6 != r0) goto L31
            return r0
        L31:
            r45.mx1 r6 = (r45.mx1) r6
            goto L35
        L34:
            r6 = 0
        L35:
            yz5.l r0 = r5.f122825g
            if (r6 == 0) goto L46
            if (r0 == 0) goto L40
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r0.mo146xb9724478(r6)
        L40:
            java.lang.String r6 = "finishSing"
            r2.c7(r6)
            goto L4d
        L46:
            if (r0 == 0) goto L4d
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r0.mo146xb9724478(r6)
        L4d:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ch2.b0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
