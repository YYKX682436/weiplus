package df2;

/* loaded from: classes3.dex */
public final class f4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f311640e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.l4 f311641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, df2.l4 l4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311640e = c22789xd23e9a9b;
        this.f311641f = l4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.f4(this.f311640e, this.f311641f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.f4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006c  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f311639d
            java.lang.String r2 = "showAnimGuide tipPagReleased"
            java.lang.String r3 = "Finder.FinderLiveSlideToCloseGuideController"
            df2.l4 r4 = r9.f311641f
            r5 = 2
            jz5.f0 r6 = jz5.f0.f384359a
            com.tencent.mm.view.MMPAGView r7 = r9.f311640e
            r8 = 1
            if (r1 == 0) goto L26
            if (r1 == r8) goto L22
            if (r1 != r5) goto L1a
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L66
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L42
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = 0
            if (r7 == 0) goto L33
            boolean r1 = r7.getUseRfx()
            if (r1 != r8) goto L33
            r10 = r8
        L33:
            if (r10 == 0) goto L59
            vl2.s r10 = vl2.s.f519401a
            vl2.h r1 = vl2.h.f519361p0
            r9.f311639d = r8
            java.lang.Object r10 = r10.f(r1, r9)
            if (r10 != r0) goto L42
            return r0
        L42:
            com.tencent.mm.rfx.RfxPagFile r10 = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) r10
            boolean r0 = r4.f312167r
            if (r0 == 0) goto L4c
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            return r6
        L4c:
            if (r10 == 0) goto L7c
            if (r7 == 0) goto L53
            r7.mo82566x3e3ac3e8(r10)
        L53:
            if (r7 == 0) goto L7c
            r7.g()
            goto L7c
        L59:
            vl2.s r10 = vl2.s.f519401a
            vl2.h r1 = vl2.h.f519361p0
            r9.f311639d = r5
            java.lang.Object r10 = r10.e(r1, r9)
            if (r10 != r0) goto L66
            return r0
        L66:
            org.libpag.PAGFile r10 = (org.p3363xbe4143f1.C29690xfae77312) r10
            boolean r0 = r4.f312167r
            if (r0 == 0) goto L70
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            return r6
        L70:
            if (r10 == 0) goto L7c
            if (r7 == 0) goto L77
            r7.mo82568x3e3ac3e8(r10)
        L77:
            if (r7 == 0) goto L7c
            r7.g()
        L7c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.f4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
