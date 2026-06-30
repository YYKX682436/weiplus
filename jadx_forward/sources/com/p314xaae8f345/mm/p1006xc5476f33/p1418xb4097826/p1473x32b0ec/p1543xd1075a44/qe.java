package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class qe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f201054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f201055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se f201056f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qe(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.se seVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f201055e = k0Var;
        this.f201056f = seVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qe(this.f201055e, this.f201056f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qe) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r5) {
        /*
            r4 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r4.f201054d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            goto L3d
        Ld:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L15:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r5)
            com.tencent.mm.plugin.finder.live.view.k0 r5 = r4.f201055e
            java.lang.Class<com.tencent.mm.plugin.finder.live.util.a1> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a1.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r5 = r5.mo57658x143f1b92(r1)
            com.tencent.mm.plugin.finder.live.util.a1 r5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a1) r5
            if (r5 == 0) goto L44
            com.tencent.mm.plugin.finder.live.widget.se r1 = r4.f201056f
            android.view.View r1 = r1.f201286a
            android.content.Context r1 = r1.getContext()
            boolean r3 = r1 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r3 == 0) goto L33
            com.tencent.mm.ui.MMActivity r1 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r1
            goto L34
        L33:
            r1 = 0
        L34:
            r4.f201054d = r2
            java.lang.Object r5 = r5.c7(r1, r4)
            if (r5 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            goto L45
        L44:
            r5 = 0
        L45:
            if (r5 == 0) goto L54
            java.lang.Class<s40.w0> r5 = s40.w0.class
            i95.m r5 = i95.n0.c(r5)
            s40.w0 r5 = (s40.w0) r5
            com.tencent.mm.feature.finder.live.v4 r5 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) r5
            r5.Ek()
        L54:
            jz5.f0 r5 = jz5.f0.f384359a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.qe.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
