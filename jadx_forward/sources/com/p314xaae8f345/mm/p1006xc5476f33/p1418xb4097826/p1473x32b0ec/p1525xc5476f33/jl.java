package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class jl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f194665d;

    /* renamed from: e, reason: collision with root package name */
    public int f194666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ az2.j f194667f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm f194668g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vg2.m f194669h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(az2.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar, vg2.m mVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f194667f = jVar;
        this.f194668g = hmVar;
        this.f194669h = mVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jl(this.f194667f, this.f194668g, this.f194669h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jl) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0079  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f194666e
            vg2.m r3 = r0.f194669h
            com.tencent.mm.plugin.finder.live.plugin.hm r4 = r0.f194668g
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r2 == 0) goto L35
            if (r2 == r7) goto L2f
            if (r2 == r6) goto L27
            if (r2 != r5) goto L1f
            java.lang.Object r1 = r0.f194665d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            goto L91
        L1f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L27:
            java.lang.Object r2 = r0.f194665d
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            goto L75
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            r2 = r17
            goto L57
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r17)
            az2.j r2 = r0.f194667f
            android.view.ViewGroup r9 = r4.f446856d
            android.content.Context r10 = r9.getContext()
            java.lang.String r9 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, r9)
            r11 = 0
            r12 = 0
            r14 = 6
            r15 = 0
            r9 = r2
            az2.j.u(r9, r10, r11, r12, r14, r15)
            r0.f194666e = r7
            java.lang.Object r2 = xg2.g.d(r2, r8, r0, r7, r8)
            if (r2 != r1) goto L57
            return r1
        L57:
            xg2.h r2 = (xg2.h) r2
            boolean r7 = r2 instanceof xg2.i
            if (r7 == 0) goto L75
            oz5.l r7 = r2.f535925a
            if (r7 != 0) goto L65
            oz5.l r7 = r16.mo48699x76847179()
        L65:
            com.tencent.mm.plugin.finder.live.plugin.il r9 = new com.tencent.mm.plugin.finder.live.plugin.il
            r9.<init>(r2, r8, r4, r3)
            r0.f194665d = r2
            r0.f194666e = r6
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r7, r9, r0)
            if (r4 != r1) goto L75
            return r1
        L75:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto L91
            oz5.l r4 = r2.f535925a
            if (r4 != 0) goto L81
            oz5.l r4 = r16.mo48699x76847179()
        L81:
            com.tencent.mm.plugin.finder.live.plugin.hl r6 = new com.tencent.mm.plugin.finder.live.plugin.hl
            r6.<init>(r2, r8, r3)
            r0.f194665d = r2
            r0.f194666e = r5
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r4, r6, r0)
            if (r2 != r1) goto L91
            return r1
        L91:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.jl.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
