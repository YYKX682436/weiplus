package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes.dex */
public final class n4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f203363d;

    /* renamed from: e, reason: collision with root package name */
    public int f203364e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f203365f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f203365f = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.n4(this.f203365f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.n4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
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
            int r1 = r9.f203364e
            long r2 = r9.f203365f
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r1 == 0) goto L2f
            if (r1 == r7) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r4) goto L1b
            java.lang.Object r0 = r9.f203363d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lb4
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f203363d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L98
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L79
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r45.ni2 r10 = new r45.ni2
            r10.<init>()
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            r10.set(r5, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r10.set(r4, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r8 = 10243(0x2803, float:1.4354E-41)
            r1.f152200d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/findermodrecentwatchlive"
            r1.f152199c = r8
            r1.f152197a = r10
            r45.oi2 r10 = new r45.oi2
            r10.<init>()
            r1.f152198b = r10
            com.tencent.mm.modelbase.o r10 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r10)
            r9.f203364e = r7
            java.lang.Object r10 = xg2.g.d(r1, r6, r9, r7, r6)
            if (r10 != r0) goto L79
            return r0
        L79:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L98
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L88
            oz5.l r10 = r9.mo48699x76847179()
        L88:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4 r7 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.m4
            r7.<init>(r1, r6, r2)
            r9.f203363d = r1
            r9.f203364e = r5
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r7, r9)
            if (r10 != r0) goto L98
            return r0
        L98:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Lb4
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto La4
            oz5.l r10 = r9.mo48699x76847179()
        La4:
            com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4 r5 = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.l4
            r5.<init>(r1, r6, r2)
            r9.f203363d = r1
            r9.f203364e = r4
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r5, r9)
            if (r10 != r0) goto Lb4
            return r0
        Lb4:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.n4.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
