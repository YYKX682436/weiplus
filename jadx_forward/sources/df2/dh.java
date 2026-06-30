package df2;

/* loaded from: classes3.dex */
public final class dh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f311510d;

    /* renamed from: e, reason: collision with root package name */
    public int f311511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f311512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.hh f311513g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, df2.hh hhVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311512f = c22789xd23e9a9b;
        this.f311513g = hhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.dh(this.f311512f, this.f311513g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.dh) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x007d  */
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
            int r1 = r9.f311511e
            java.lang.String r2 = "showAnimGuide tipPagReleased"
            df2.hh r3 = r9.f311513g
            r4 = 2
            r5 = 1
            java.lang.String r6 = "Finder.LiveDoubleClickLikeGuideController"
            com.tencent.mm.view.MMPAGView r7 = r9.f311512f
            jz5.f0 r8 = jz5.f0.f384359a
            if (r1 == 0) goto L2e
            if (r1 == r5) goto L26
            if (r1 != r4) goto L1e
            java.lang.Object r0 = r9.f311510d
            vl2.h r0 = (vl2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L79
        L1e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L26:
            java.lang.Object r0 = r9.f311510d
            vl2.h r0 = (vl2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L48
        L2e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            vl2.h r10 = vl2.h.G
            boolean r1 = r7.getUseRfx()
            if (r1 == 0) goto L6a
            vl2.s r1 = vl2.s.f519401a
            r9.f311510d = r10
            r9.f311511e = r5
            java.lang.Object r1 = r1.f(r10, r9)
            if (r1 != r0) goto L46
            return r0
        L46:
            r0 = r10
            r10 = r1
        L48:
            com.tencent.mm.rfx.RfxPagFile r10 = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) r10
            if (r10 != 0) goto L5e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "showAnimGuide loadRfxPagFile failed, file is null, resource="
            r10.<init>(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r10)
            return r8
        L5e:
            boolean r0 = r3.f311863q
            if (r0 == 0) goto L66
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2)
            return r8
        L66:
            r7.mo82566x3e3ac3e8(r10)
            goto L9a
        L6a:
            vl2.s r1 = vl2.s.f519401a
            r9.f311510d = r10
            r9.f311511e = r4
            java.lang.Object r1 = r1.e(r10, r9)
            if (r1 != r0) goto L77
            return r0
        L77:
            r0 = r10
            r10 = r1
        L79:
            org.libpag.PAGFile r10 = (org.p3363xbe4143f1.C29690xfae77312) r10
            if (r10 != 0) goto L8f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = "showAnimGuide loadPagFile failed, file is null, resource="
            r10.<init>(r1)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r10)
            return r8
        L8f:
            boolean r0 = r3.f311863q
            if (r0 == 0) goto L97
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r2)
            return r8
        L97:
            r7.mo82568x3e3ac3e8(r10)
        L9a:
            r7.g()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.dh.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
