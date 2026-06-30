package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class v8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f217751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 f217752e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217753f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 f217754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f217755h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.e9 e9Var, in5.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87, android.view.View view, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f217752e = e9Var;
        this.f217753f = s0Var;
        this.f217754g = c19781xd1c47b87;
        this.f217755h = view;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v8(this.f217752e, this.f217753f, this.f217754g, this.f217755h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0075 A[RETURN] */
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
            int r1 = r9.f217751d
            java.lang.String r2 = "$holder"
            in5.s0 r3 = r9.f217753f
            r4 = 2
            r5 = 1
            com.tencent.mm.plugin.finder.viewmodel.component.e9 r6 = r9.f217752e
            if (r1 == 0) goto L22
            if (r1 == r5) goto L1e
            if (r1 != r4) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L76
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L66
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r2)
            android.view.View r10 = r6.R6(r3)
            if (r10 == 0) goto L6b
            r9.f217751d = r5
            r6.getClass()
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r7 = pz5.f.b(r9)
            r1.<init>(r7, r5)
            r1.k()
            v65.n r5 = new v65.n
            r5.<init>(r1)
            android.view.ViewPropertyAnimator r10 = r10.animate()
            r7 = 0
            android.view.ViewPropertyAnimator r10 = r10.alpha(r7)
            r7 = 250(0xfa, double:1.235E-321)
            android.view.ViewPropertyAnimator r10 = r10.setDuration(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.r8 r7 = new com.tencent.mm.plugin.finder.viewmodel.component.r8
            r7.<init>(r5)
            android.view.ViewPropertyAnimator r10 = r10.setListener(r7)
            r10.start()
            java.lang.Object r10 = r1.j()
            if (r10 != r0) goto L66
            return r0
        L66:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            r10.booleanValue()
        L6b:
            r9.f217751d = r4
            r4 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.k1.b(r4, r9)
            if (r10 != r0) goto L76
            return r0
        L76:
            java.lang.String r10 = "nextTask"
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r0 = r9.f217754g
            android.view.View r1 = r9.f217755h
            r6.k7(r10, r0, r1)
            r10 = 0
            r6.f215761r = r10
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r2)
            com.tencent.mm.plugin.finder.viewmodel.component.db0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.db0.f215652e
            com.tencent.mm.plugin.finder.viewmodel.component.ib0 r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ib0.f216264d
            r6.b7(r10, r3, r0, r1)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.v8.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
