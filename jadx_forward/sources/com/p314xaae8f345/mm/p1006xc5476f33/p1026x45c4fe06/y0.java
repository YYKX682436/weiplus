package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f173932d;

    /* renamed from: e, reason: collision with root package name */
    public int f173933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b1 f173934f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.b1 b1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f173934f = b1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y0(this.f173934f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00ce  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f173933e
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 3
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.appbrand.b1 r6 = r12.f173934f
            if (r1 == 0) goto L2b
            if (r1 == r5) goto L25
            if (r1 == r4) goto L20
            if (r1 != r3) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Lbd
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto Laf
        L25:
            long r7 = r12.f173932d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L46
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11807xf443363a.b()
            int r1 = r1.f158738J
            long r7 = (long) r1
            long r7 = r13.toMillis(r7)
            r12.f173932d = r7
            r12.f173933e = r5
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.k1.b(r7, r12)
            if (r13 != r0) goto L46
            return r0
        L46:
            com.tencent.mm.plugin.appbrand.ui.c9 r13 = r6.f158288b
            android.view.View r13 = r13.mo52965xfb86a31b()
            java.util.WeakHashMap r1 = n3.l1.f415895a
            boolean r13 = n3.x0.b(r13)
            if (r13 == 0) goto Le3
            com.tencent.mm.plugin.appbrand.o6 r13 = r6.f158287a
            boolean r13 = r13.f167713m2
            if (r13 != 0) goto L5c
            goto Le3
        L5c:
            r13 = 2131756492(0x7f1005cc, float:1.9143893E38)
            com.tencent.mm.plugin.appbrand.ui.c9 r1 = r6.f158288b
            r1.U(r13)
            android.widget.TextView r13 = r1.D     // Catch: java.lang.Exception -> L9d
            android.view.ViewGroup$LayoutParams r13 = r13.getLayoutParams()     // Catch: java.lang.Exception -> L9d
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r13 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) r13     // Catch: java.lang.Exception -> L9d
            r5 = 2131297454(0x7f0904ae, float:1.8212853E38)
            r13.f92428i = r5     // Catch: java.lang.Exception -> L9d
            r5 = -1
            r13.f92432k = r5     // Catch: java.lang.Exception -> L9d
            android.widget.TextView r13 = r1.D     // Catch: java.lang.Exception -> L9d
            int r5 = r13.getPaddingLeft()     // Catch: java.lang.Exception -> L9d
            android.content.Context r9 = r1.getContext()     // Catch: java.lang.Exception -> L9d
            android.content.res.Resources r9 = r9.getResources()     // Catch: java.lang.Exception -> L9d
            r10 = 2131165499(0x7f07013b, float:1.7945217E38)
            int r9 = r9.getDimensionPixelSize(r10)     // Catch: java.lang.Exception -> L9d
            android.widget.TextView r10 = r1.D     // Catch: java.lang.Exception -> L9d
            int r10 = r10.getPaddingRight()     // Catch: java.lang.Exception -> L9d
            android.widget.TextView r11 = r1.D     // Catch: java.lang.Exception -> L9d
            int r11 = r11.getPaddingBottom()     // Catch: java.lang.Exception -> L9d
            r13.setPadding(r5, r9, r10, r11)     // Catch: java.lang.Exception -> L9d
            android.widget.TextView r13 = r1.D     // Catch: java.lang.Exception -> L9d
            r13.requestLayout()     // Catch: java.lang.Exception -> L9d
        L9d:
            long r9 = r6.f158289c
            long r9 = r9 - r7
            r7 = 0
            long r7 = java.lang.Math.max(r7, r9)
            r12.f173933e = r4
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.k1.b(r7, r12)
            if (r13 != r0) goto Laf
            return r0
        Laf:
            r6.getClass()
            r12.f173933e = r3
            long r3 = r6.f158290d
            java.lang.Object r13 = p3325xe03a0797.p3326xc267989b.k1.b(r3, r12)
            if (r13 != r0) goto Lbd
            return r0
        Lbd:
            r6.getClass()
            r13 = 2131297660(0x7f09057c, float:1.8213271E38)
            com.tencent.mm.plugin.appbrand.ui.c9 r0 = r6.f158288b
            android.view.View r13 = r0.findViewById(r13)
            android.view.ViewStub r13 = (android.view.ViewStub) r13
            if (r13 != 0) goto Lce
            goto Le3
        Lce:
            android.view.View r13 = r13.inflate()
            if (r13 != 0) goto Ld5
            goto Le3
        Ld5:
            com.tencent.mm.plugin.appbrand.ui.q9 r1 = new com.tencent.mm.plugin.appbrand.ui.q9
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r0.f171161x
            com.tencent.mm.plugin.appbrand.ui.m9 r4 = new com.tencent.mm.plugin.appbrand.ui.m9
            r4.<init>(r3)
            r1.<init>(r4, r13)
            r0.f171160J = r1
        Le3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
