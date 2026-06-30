package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f231597d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231598e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 f231599f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f231600g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f231599f = s0Var;
        this.f231600g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p0 p0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p0(this.f231599f, this.f231600g, interfaceC29045xdcb5ca57);
        p0Var.f231598e = obj;
        return p0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0059  */
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
            int r1 = r5.f231597d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 1
            com.tencent.mm.plugin.multitalk.model.s0 r4 = r5.f231599f
            if (r1 == 0) goto L1d
            if (r1 != r3) goto L15
            java.lang.Object r0 = r5.f231598e
            kotlinx.coroutines.y0 r0 = (p3325xe03a0797.p3326xc267989b.y0) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L39
        L15:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.Object r6 = r5.f231598e
            kotlinx.coroutines.y0 r6 = (p3325xe03a0797.p3326xc267989b.y0) r6
            com.tencent.mm.plugin.multitalk.model.v0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri()
            com.tencent.mm.plugin.multitalk.model.a2 r1 = r1.n()
            if (r1 == 0) goto L56
            r5.f231598e = r6
            r5.f231597d = r3
            java.lang.Object r6 = r1.d(r5)
            if (r6 != r0) goto L39
            return r0
        L39:
            jz5.l r6 = (jz5.l) r6
            if (r6 == 0) goto L56
            java.lang.Object r0 = r6.f384366d
            is0.c r0 = (is0.c) r0
            r4.f231654p = r0
            java.lang.Object r6 = r6.f384367e
            r0 = r6
            android.graphics.SurfaceTexture r0 = (android.graphics.SurfaceTexture) r0
            r4.f231653o = r0
            android.graphics.SurfaceTexture r6 = (android.graphics.SurfaceTexture) r6
            com.tencent.mm.plugin.multitalk.model.o0 r0 = new com.tencent.mm.plugin.multitalk.model.o0
            r0.<init>(r4)
            r6.setOnFrameAvailableListener(r0)
            r6 = r2
            goto L57
        L56:
            r6 = 0
        L57:
            if (r6 != 0) goto L60
            java.lang.String r6 = "MicroMsg.MultiTalkCameraManager"
            java.lang.String r0 = "startCaptureRenderer: camera texture is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r0)
        L60:
            r4.g()
            boolean r6 = r5.f231600g
            if (r6 == 0) goto L6e
            com.tencent.mm.app.w r6 = com.p314xaae8f345.mm.app.w.INSTANCE
            com.tencent.mm.app.y2 r0 = r4.f231657s
            r6.b(r0)
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.p0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
