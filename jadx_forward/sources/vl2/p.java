package vl2;

/* loaded from: classes3.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f519394d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vl2.h f519395e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f519396f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(vl2.h hVar, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f519395e = hVar;
        this.f519396f = c22789xd23e9a9b;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vl2.p(this.f519395e, this.f519396f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vl2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
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
            int r1 = r8.f519394d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 2
            r4 = 1
            com.tencent.mm.view.MMPAGView r5 = r8.f519396f
            if (r1 == 0) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L8f
        L15:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L7c
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            vl2.h r9 = vl2.h.f519352e
            java.lang.String r1 = "LiveUdrResourceLoader"
            vl2.h r6 = r8.f519395e
            if (r6 != r9) goto L45
            vl2.s r9 = vl2.s.f519401a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = r6.f519373d
            r9.append(r0)
            java.lang.String r0 = " loadMMPAG failed, resourceName is Unknown"
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            return r2
        L45:
            vl2.s r9 = vl2.s.f519401a
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r7 = "loadMMPAG resourceName:"
            r9.<init>(r7)
            java.lang.String r7 = r6.f519373d
            r9.append(r7)
            java.lang.String r7 = ", useRfx:"
            r9.append(r7)
            boolean r7 = r5.getUseRfx()
            r9.append(r7)
            r7 = 32
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r9)
            boolean r9 = r5.getUseRfx()
            if (r9 == 0) goto L84
            vl2.s r9 = vl2.s.f519401a
            r8.f519394d = r4
            java.lang.Object r9 = r9.f(r6, r8)
            if (r9 != r0) goto L7c
            return r0
        L7c:
            com.tencent.mm.rfx.RfxPagFile r9 = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) r9
            if (r9 == 0) goto L96
            r5.mo82566x3e3ac3e8(r9)
            goto L96
        L84:
            vl2.s r9 = vl2.s.f519401a
            r8.f519394d = r3
            java.lang.Object r9 = r9.e(r6, r8)
            if (r9 != r0) goto L8f
            return r0
        L8f:
            org.libpag.PAGFile r9 = (org.p3363xbe4143f1.C29690xfae77312) r9
            if (r9 == 0) goto L96
            r5.mo82568x3e3ac3e8(r9)
        L96:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vl2.p.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
