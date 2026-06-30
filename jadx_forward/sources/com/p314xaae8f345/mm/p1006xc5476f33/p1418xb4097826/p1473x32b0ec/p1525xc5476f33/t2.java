package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class t2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f195860d;

    /* renamed from: e, reason: collision with root package name */
    public int f195861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 f195863g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v3 v3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f195862f = str;
        this.f195863g = v3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t2(this.f195862f, this.f195863g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f195861e
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L31
            if (r2 == r5) goto L2b
            if (r2 == r4) goto L23
            if (r2 != r3) goto L1b
            java.lang.Object r1 = r0.f195860d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            goto L92
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L23:
            java.lang.Object r2 = r0.f195860d
            xg2.h r2 = (xg2.h) r2
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            goto L76
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            r2 = r22
            goto L56
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r22)
            db2.b1 r2 = new db2.b1
            r8 = 0
            r9 = 0
            java.lang.String r10 = r0.f195862f
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 2043(0x7fb, float:2.863E-42)
            r20 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r0.f195861e = r5
            java.lang.Object r2 = xg2.g.d(r2, r6, r0, r5, r6)
            if (r2 != r1) goto L56
            return r1
        L56:
            xg2.h r2 = (xg2.h) r2
            boolean r5 = r2 instanceof xg2.i
            if (r5 == 0) goto L76
            oz5.l r5 = r2.f535925a
            if (r5 != 0) goto L64
            oz5.l r5 = r21.mo48699x76847179()
        L64:
            com.tencent.mm.plugin.finder.live.plugin.s2 r7 = new com.tencent.mm.plugin.finder.live.plugin.s2
            com.tencent.mm.plugin.finder.live.plugin.v3 r8 = r0.f195863g
            r7.<init>(r2, r6, r8)
            r0.f195860d = r2
            r0.f195861e = r4
            java.lang.Object r4 = p3325xe03a0797.p3326xc267989b.l.g(r5, r7, r0)
            if (r4 != r1) goto L76
            return r1
        L76:
            boolean r4 = r2 instanceof xg2.b
            if (r4 == 0) goto L92
            oz5.l r4 = r2.f535925a
            if (r4 != 0) goto L82
            oz5.l r4 = r21.mo48699x76847179()
        L82:
            com.tencent.mm.plugin.finder.live.plugin.r2 r5 = new com.tencent.mm.plugin.finder.live.plugin.r2
            r5.<init>(r2, r6)
            r0.f195860d = r2
            r0.f195861e = r3
            java.lang.Object r2 = p3325xe03a0797.p3326xc267989b.l.g(r4, r5, r0)
            if (r2 != r1) goto L92
            return r1
        L92:
            jz5.f0 r1 = jz5.f0.f384359a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
