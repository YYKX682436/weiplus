package nh2;

/* loaded from: classes10.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418638d;

    /* renamed from: e, reason: collision with root package name */
    public int f418639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 f418640f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152 c14230x50345152, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418640f = c14230x50345152;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nh2.g(this.f418640f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nh2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0072 A[RETURN] */
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
            int r1 = r6.f418639e
            r2 = 2
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r5 = r6.f418640f
            if (r1 == 0) goto L28
            if (r1 == r4) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r0 = r6.f418638d
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L6a
        L18:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L20:
            java.lang.Object r0 = r6.f418638d
            com.tencent.mm.plugin.finder.live.ktv.view.render.KtvRenderLayoutView r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.p1505xc84b4196.C14230x50345152) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L43
        L28:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            boolean r7 = r5.f193214p
            if (r7 == 0) goto L56
            com.tencent.mm.rfx.RfxPagFile r7 = r5.B
            if (r7 != 0) goto L47
            vl2.s r7 = vl2.s.f519401a
            vl2.h r1 = vl2.h.M
            r6.f418638d = r5
            r6.f418639e = r4
            java.lang.Object r7 = r7.f(r1, r6)
            if (r7 != r0) goto L42
            return r0
        L42:
            r0 = r5
        L43:
            com.tencent.mm.rfx.RfxPagFile r7 = (com.p314xaae8f345.mm.rfx.C20942x379cf5ee) r7
            r0.B = r7
        L47:
            int r7 = r5.f193222x
            if (r7 == r4) goto L4c
            return r3
        L4c:
            com.tencent.mm.rfx.RfxPagFile r7 = r5.B
            if (r7 == 0) goto L7c
            com.tencent.mm.view.MMPAGView r0 = r5.f193217s
            r0.mo82566x3e3ac3e8(r7)
            goto L7c
        L56:
            org.libpag.PAGFile r7 = r5.f193224z
            if (r7 != 0) goto L6e
            vl2.s r7 = vl2.s.f519401a
            vl2.h r1 = vl2.h.M
            r6.f418638d = r5
            r6.f418639e = r2
            java.lang.Object r7 = r7.e(r1, r6)
            if (r7 != r0) goto L69
            return r0
        L69:
            r0 = r5
        L6a:
            org.libpag.PAGFile r7 = (org.p3363xbe4143f1.C29690xfae77312) r7
            r0.f193224z = r7
        L6e:
            int r7 = r5.f193222x
            if (r7 == r4) goto L73
            return r3
        L73:
            org.libpag.PAGFile r7 = r5.f193224z
            if (r7 == 0) goto L7c
            com.tencent.mm.view.MMPAGView r0 = r5.f193217s
            r0.mo82568x3e3ac3e8(r7)
        L7c:
            com.tencent.mm.view.MMPAGView r7 = r5.f193217s
            r0 = 0
            r7.m82582x3ae760af(r0)
            com.tencent.mm.view.MMPAGView r7 = r5.f193217s
            r7.m82583xcde73672(r4)
            com.tencent.mm.view.MMPAGView r7 = r5.f193217s
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L95
            com.tencent.mm.view.MMPAGView r7 = r5.f193217s
            r7.g()
        L95:
            com.tencent.mm.view.MMPAGView r7 = r5.f193217s
            r0 = 0
            r7.setVisibility(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: nh2.g.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
