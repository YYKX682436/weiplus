package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f199480d;

    /* renamed from: e, reason: collision with root package name */
    public int f199481e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 f199482f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h3 h3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f199482f = h3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c3(this.f199482f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
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
            int r1 = r9.f199481e
            r2 = 3
            com.tencent.mm.plugin.finder.live.widget.h3 r3 = r9.f199482f
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L2f
            if (r1 == r5) goto L2b
            if (r1 == r4) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r0 = r9.f199480d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Lb9
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f199480d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L9d
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L7e
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r45.dw1 r10 = new r45.dw1
            r10.<init>()
            com.tencent.mm.plugin.finder.live.plugin.l r1 = r3.f200046b
            java.lang.Class<mm2.e1> r7 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r1.P0(r7)
            mm2.e1 r1 = (mm2.e1) r1
            long r7 = r1.f410516m
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r10.set(r4, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r7 = 9526(0x2536, float:1.3349E-41)
            r1.f152200d = r7
            java.lang.String r7 = "/cgi-bin/micromsg-bin/finderliveguidefollowadinfo"
            r1.f152199c = r7
            r1.f152197a = r10
            r45.ew1 r10 = new r45.ew1
            r10.<init>()
            r1.f152198b = r10
            com.tencent.mm.modelbase.o r10 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r10)
            r9.f199481e = r5
            java.lang.Object r10 = xg2.g.d(r1, r6, r9, r5, r6)
            if (r10 != r0) goto L7e
            return r0
        L7e:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L9d
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L8d
            oz5.l r10 = r9.mo48699x76847179()
        L8d:
            com.tencent.mm.plugin.finder.live.widget.b3 r5 = new com.tencent.mm.plugin.finder.live.widget.b3
            r5.<init>(r1, r6, r3)
            r9.f199480d = r1
            r9.f199481e = r4
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r5, r9)
            if (r10 != r0) goto L9d
            return r0
        L9d:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Lb9
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto La9
            oz5.l r10 = r9.mo48699x76847179()
        La9:
            com.tencent.mm.plugin.finder.live.widget.a3 r4 = new com.tencent.mm.plugin.finder.live.widget.a3
            r4.<init>(r1, r6, r3)
            r9.f199480d = r1
            r9.f199481e = r2
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r4, r9)
            if (r10 != r0) goto Lb9
            return r0
        Lb9:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c3.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
