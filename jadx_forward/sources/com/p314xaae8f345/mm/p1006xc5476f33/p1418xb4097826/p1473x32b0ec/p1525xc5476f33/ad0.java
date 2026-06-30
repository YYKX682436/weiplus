package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ad0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f193404d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 f193405e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nd0 nd0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193405e = nd0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad0(this.f193405e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003b, code lost:
    
        if (r5.f391825f == r3) goto L18;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r8) {
        /*
            r7 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r7.f193404d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            goto L52
        Ld:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L15:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r8)
            com.tencent.mm.plugin.finder.live.plugin.nd0 r8 = r7.f193405e
            java.lang.Class<mm2.n0> r1 = mm2.n0.class
            androidx.lifecycle.c1 r1 = r8.P0(r1)
            mm2.n0 r1 = (mm2.n0) r1
            kotlinx.coroutines.flow.f3 r1 = r1.f410804p
            if (r1 == 0) goto L52
            com.tencent.mm.plugin.finder.live.plugin.yc0 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yc0.f196718d
            kotlinx.coroutines.flow.d0 r4 = p3325xe03a0797.p3326xc267989b.p3328x30012e.d0.f391759d
            r5 = 2
            p3321xbce91901.jvm.p3324x21ffc6bd.m0.e(r3, r5)
            boolean r5 = r1 instanceof p3325xe03a0797.p3326xc267989b.p3328x30012e.i
            if (r5 == 0) goto L3e
            r5 = r1
            kotlinx.coroutines.flow.i r5 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.i) r5
            yz5.l r6 = r5.f391824e
            if (r6 != r4) goto L3e
            yz5.p r5 = r5.f391825f
            if (r5 != r3) goto L3e
            goto L44
        L3e:
            kotlinx.coroutines.flow.i r5 = new kotlinx.coroutines.flow.i
            r5.<init>(r1, r4, r3)
            r1 = r5
        L44:
            com.tencent.mm.plugin.finder.live.plugin.zc0 r3 = new com.tencent.mm.plugin.finder.live.plugin.zc0
            r3.<init>(r8)
            r7.f193404d = r2
            java.lang.Object r8 = r1.a(r3, r7)
            if (r8 != r0) goto L52
            return r0
        L52:
            jz5.f0 r8 = jz5.f0.f384359a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
