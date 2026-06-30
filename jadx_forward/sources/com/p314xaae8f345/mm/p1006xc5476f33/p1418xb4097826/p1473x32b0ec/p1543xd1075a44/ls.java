package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ls extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200504d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f200505e;

    /* renamed from: f, reason: collision with root package name */
    public int f200506f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et f200507g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.vv1 f200508h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et etVar, r45.vv1 vv1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200507g = etVar;
        this.f200508h = vv1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ls(this.f200507g, this.f200508h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ls) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a0  */
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
            int r1 = r9.f200506f
            r2 = 1
            if (r1 == 0) goto L1e
            if (r1 != r2) goto L16
            java.lang.Object r0 = r9.f200505e
            r45.uc5 r0 = (r45.uc5) r0
            java.lang.Object r1 = r9.f200504d
            com.tencent.mm.plugin.finder.live.widget.et r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lb3
        L16:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r45.vv1 r10 = r9.f200508h
            r1 = 0
            int r10 = r10.m75939xb282bd08(r1)
            com.tencent.mm.plugin.finder.live.widget.et r3 = r9.f200507g
            java.util.LinkedList r4 = r3.K
            r5 = 0
            if (r4 == 0) goto L98
            java.util.Iterator r4 = r4.iterator()
            r6 = r1
        L34:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L58
            java.lang.Object r7 = r4.next()
            r45.uc5 r7 = (r45.uc5) r7
            r8 = 3
            com.tencent.mm.protobuf.f r7 = r7.m75936x14adae67(r8)
            r45.vv1 r7 = (r45.vv1) r7
            if (r7 == 0) goto L51
            int r7 = r7.m75939xb282bd08(r1)
            if (r7 != r10) goto L51
            r7 = r2
            goto L52
        L51:
            r7 = r1
        L52:
            if (r7 == 0) goto L55
            goto L59
        L55:
            int r6 = r6 + 1
            goto L34
        L58:
            r6 = -1
        L59:
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            int r4 = r10.intValue()
            java.util.LinkedList r6 = r3.K
            if (r6 == 0) goto L6a
            e06.k r6 = kz5.c0.g(r6)
            goto L6f
        L6a:
            e06.k r6 = new e06.k
            r6.<init>(r1, r1)
        L6f:
            int r7 = r6.f327743e
            if (r4 > r7) goto L78
            int r6 = r6.f327742d
            if (r6 > r4) goto L78
            r1 = r2
        L78:
            if (r1 == 0) goto L7b
            goto L7c
        L7b:
            r10 = r5
        L7c:
            if (r10 == 0) goto L98
            int r10 = r10.intValue()
            jz5.l r1 = new jz5.l
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            java.util.LinkedList r6 = r3.K
            if (r6 == 0) goto L93
            java.lang.Object r10 = kz5.n0.a0(r6, r10)
            r45.uc5 r10 = (r45.uc5) r10
            goto L94
        L93:
            r10 = r5
        L94:
            r1.<init>(r4, r10)
            goto L99
        L98:
            r1 = r5
        L99:
            if (r1 == 0) goto La0
            java.lang.Object r10 = r1.f384367e
            r45.uc5 r10 = (r45.uc5) r10
            goto La1
        La0:
            r10 = r5
        La1:
            if (r10 == 0) goto Lc6
            r9.f200504d = r3
            r9.f200505e = r10
            r9.f200506f = r2
            java.lang.Object r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.et.e0(r3, r10, r9)
            if (r1 != r0) goto Lb0
            return r0
        Lb0:
            r0 = r10
            r10 = r1
            r1 = r3
        Lb3:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto Lc6
            r1.getClass()
            com.tencent.mm.plugin.finder.live.widget.es r10 = new com.tencent.mm.plugin.finder.live.widget.es
            r10.<init>(r1, r0)
            pm0.v.X(r10)
        Lc6:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ls.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
