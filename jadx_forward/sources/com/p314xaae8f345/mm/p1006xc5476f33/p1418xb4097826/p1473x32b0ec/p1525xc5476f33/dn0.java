package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes.dex */
public final class dn0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f193841d;

    /* renamed from: e, reason: collision with root package name */
    public int f193842e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 f193843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wn0 wn0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193843f = wn0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dn0(this.f193843f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dn0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
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
            int r1 = r9.f193842e
            r2 = 0
            r3 = 3
            com.tencent.mm.plugin.finder.live.plugin.wn0 r4 = r9.f193843f
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r9.f193841d
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto Laa
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f193841d
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L8e
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L6f
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r45.sr1 r10 = new r45.sr1
            r10.<init>()
            java.lang.Class<mm2.c1> r1 = mm2.c1.class
            androidx.lifecycle.c1 r1 = r4.P0(r1)
            mm2.c1 r1 = (mm2.c1) r1
            java.lang.String r1 = r1.f410385o
            r10.set(r6, r1)
            java.lang.Class<mm2.e1> r1 = mm2.e1.class
            androidx.lifecycle.c1 r1 = r4.P0(r1)
            mm2.e1 r1 = (mm2.e1) r1
            long r7 = r1.f410516m
            java.lang.Long r1 = java.lang.Long.valueOf(r7)
            r10.set(r5, r1)
            r45.tr1 r1 = new r45.tr1
            r1.<init>()
            java.lang.String r7 = "/cgi-bin/micromsg-bin/finderlivegetboardevententry"
            r8 = 12465(0x30b1, float:1.7467E-41)
            az2.j r10 = xg2.g.a(r10, r7, r8, r1)
            kotlinx.coroutines.p0 r1 = p3325xe03a0797.p3326xc267989b.q1.f392101a
            kotlinx.coroutines.g3 r1 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a
            r9.f193842e = r6
            java.lang.Object r10 = xg2.g.b(r10, r1, r9)
            if (r10 != r0) goto L6f
            return r0
        L6f:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L8e
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L7e
            oz5.l r10 = r9.mo48699x76847179()
        L7e:
            com.tencent.mm.plugin.finder.live.plugin.cn0 r6 = new com.tencent.mm.plugin.finder.live.plugin.cn0
            r6.<init>(r1, r2, r4)
            r9.f193841d = r1
            r9.f193842e = r5
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r6, r9)
            if (r10 != r0) goto L8e
            return r0
        L8e:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto Laa
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L9a
            oz5.l r10 = r9.mo48699x76847179()
        L9a:
            com.tencent.mm.plugin.finder.live.plugin.bn0 r5 = new com.tencent.mm.plugin.finder.live.plugin.bn0
            r5.<init>(r1, r2, r4)
            r9.f193841d = r1
            r9.f193842e = r3
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r5, r9)
            if (r10 != r0) goto Laa
            return r0
        Laa:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dn0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
