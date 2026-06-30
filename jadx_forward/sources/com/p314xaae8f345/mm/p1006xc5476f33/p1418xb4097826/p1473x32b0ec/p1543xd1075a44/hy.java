package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes.dex */
public final class hy extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f200136d;

    /* renamed from: e, reason: collision with root package name */
    public int f200137e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f200138f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f200139g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 f200140h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(r45.xn1 xn1Var, long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14411xc4c352f7 c14411xc4c352f7, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200138f = xn1Var;
        this.f200139g = j17;
        this.f200140h = c14411xc4c352f7;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hy(this.f200138f, this.f200139g, this.f200140h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hy) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f200137e
            r2 = 0
            com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorActiveDetailWidget r3 = r10.f200140h
            r4 = 1
            r45.xn1 r5 = r10.f200138f
            r6 = 3
            r7 = 2
            if (r1 == 0) goto L31
            if (r1 == r4) goto L2d
            if (r1 == r7) goto L25
            if (r1 != r6) goto L1d
            java.lang.Object r0 = r10.f200136d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto Lb8
        L1d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L25:
            java.lang.Object r1 = r10.f200136d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L9c
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L7d
        L31:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            r45.s41 r11 = new r45.s41
            r11.<init>()
            r11.set(r7, r5)
            long r8 = r10.f200139g
            java.lang.Long r1 = java.lang.Long.valueOf(r8)
            r11.set(r6, r1)
            com.tencent.mm.modelbase.l r1 = new com.tencent.mm.modelbase.l
            r1.<init>()
            r8 = 9052(0x235c, float:1.2685E-41)
            r1.f152200d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/findergetaudienceliveinfo"
            r1.f152199c = r8
            r1.f152197a = r11
            r45.t41 r11 = new r45.t41
            r11.<init>()
            r1.f152198b = r11
            com.tencent.mm.modelbase.o r11 = r1.a()
            java.lang.Class<zy2.x5> r1 = zy2.x5.class
            i95.m r1 = i95.n0.c(r1)
            zy2.x5 r1 = (zy2.x5) r1
            pc2.e r1 = (pc2.e) r1
            com.tencent.mm.modelbase.i r1 = r1.wi()
            r1.p(r11)
            kotlinx.coroutines.p0 r11 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r11 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r10.f200137e = r4
            java.lang.Object r11 = xg2.g.b(r1, r11, r10)
            if (r11 != r0) goto L7d
            return r0
        L7d:
            r1 = r11
            xg2.h r1 = (xg2.h) r1
            boolean r11 = r1 instanceof xg2.i
            if (r11 == 0) goto L9c
            oz5.l r11 = r1.f535925a
            if (r11 != 0) goto L8c
            oz5.l r11 = r10.mo48699x76847179()
        L8c:
            com.tencent.mm.plugin.finder.live.widget.gy r4 = new com.tencent.mm.plugin.finder.live.widget.gy
            r4.<init>(r1, r2, r3, r5)
            r10.f200136d = r1
            r10.f200137e = r7
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r4, r10)
            if (r11 != r0) goto L9c
            return r0
        L9c:
            boolean r11 = r1 instanceof xg2.b
            if (r11 == 0) goto Lb8
            oz5.l r11 = r1.f535925a
            if (r11 != 0) goto La8
            oz5.l r11 = r10.mo48699x76847179()
        La8:
            com.tencent.mm.plugin.finder.live.widget.fy r4 = new com.tencent.mm.plugin.finder.live.widget.fy
            r4.<init>(r1, r2, r3, r5)
            r10.f200136d = r1
            r10.f200137e = r6
            java.lang.Object r11 = p3325xe03a0797.p3326xc267989b.l.g(r11, r4, r10)
            if (r11 != r0) goto Lb8
            return r0
        Lb8:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.hy.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
