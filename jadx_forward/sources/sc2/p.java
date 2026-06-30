package sc2;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f487668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f487669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xa4 f487670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.r f487671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, r45.xa4 xa4Var, sc2.r rVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487669e = c22789xd23e9a9b;
        this.f487670f = xa4Var;
        this.f487671g = rVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sc2.p(this.f487669e, this.f487670f, this.f487671g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00b8  */
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
            int r1 = r8.f487668d
            r2 = 2
            com.tencent.mm.view.MMPAGView r3 = r8.f487669e
            r4 = 1
            r45.xa4 r5 = r8.f487670f
            sc2.r r6 = r8.f487671g
            r7 = 0
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r2) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L97
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L51
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            if (r3 == 0) goto L31
            boolean r9 = r3.getUseRfx()
            if (r9 != r4) goto L31
            r9 = r4
            goto L32
        L31:
            r9 = r7
        L32:
            java.lang.String r1 = ""
            if (r9 == 0) goto L7c
            nn2.d r9 = nn2.d.f420204a
            rj.j r9 = r9.a()
            java.lang.String r2 = r5.m75945x2fec8307(r7)
            if (r2 != 0) goto L43
            goto L44
        L43:
            r1 = r2
        L44:
            java.lang.String r2 = r6.f487713z
            r8.f487668d = r4
            b51.m r9 = (b51.m) r9
            java.lang.Object r9 = r9.j(r1, r2, r8)
            if (r9 != r0) goto L51
            return r0
        L51:
            com.tencent.mm.rfx.RfxPagFile r9 = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) r9
            java.lang.String r0 = r6.f487713z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.m75945x2fec8307(r7)
            r1.append(r2)
            java.lang.String r2 = " loading finish. rfxPagFile: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            if (r9 == 0) goto Lc1
            java.lang.String r0 = r5.m75945x2fec8307(r7)
            r6.A = r0
            r3.mo82566x3e3ac3e8(r9)
            goto Lc1
        L7c:
            nn2.d r9 = nn2.d.f420204a
            rj.j r9 = r9.a()
            java.lang.String r4 = r5.m75945x2fec8307(r7)
            if (r4 != 0) goto L89
            goto L8a
        L89:
            r1 = r4
        L8a:
            java.lang.String r4 = r6.f487713z
            r8.f487668d = r2
            b51.m r9 = (b51.m) r9
            java.lang.Object r9 = r9.h(r1, r4, r8)
            if (r9 != r0) goto L97
            return r0
        L97:
            org.libpag.PAGFile r9 = (org.p3363xbe4143f1.C29690xfae77312) r9
            java.lang.String r0 = r6.f487713z
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r5.m75945x2fec8307(r7)
            r1.append(r2)
            java.lang.String r2 = " loading finish. pagFile: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            if (r9 == 0) goto Lc1
            java.lang.String r0 = r5.m75945x2fec8307(r7)
            r6.A = r0
            r3.mo82568x3e3ac3e8(r9)
        Lc1:
            jz5.f0 r9 = jz5.f0.f384359a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.p.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
