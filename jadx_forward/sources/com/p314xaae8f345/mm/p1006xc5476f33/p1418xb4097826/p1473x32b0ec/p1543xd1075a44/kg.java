package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class kg extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200370d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f200371e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh f200372f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.bh bhVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f200372f = bhVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kg kgVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kg(this.f200372f, interfaceC29045xdcb5ca57);
        kgVar.f200371e = obj;
        return kgVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kg) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008a  */
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
            int r1 = r9.f200370d
            r2 = 0
            r3 = 3
            com.tencent.mm.plugin.finder.live.widget.bh r4 = r9.f200372f
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2f
            if (r1 == r6) goto L2b
            if (r1 == r5) goto L23
            if (r1 != r3) goto L1b
            java.lang.Object r0 = r9.f200371e
            xg2.h r0 = (xg2.h) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto La2
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            java.lang.Object r1 = r9.f200371e
            xg2.h r1 = (xg2.h) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L86
        L2b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L67
        L2f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f200371e
            kotlinx.coroutines.y0 r10 = (p3325xe03a0797.p3326xc267989b.y0) r10
            r45.aq1 r1 = new r45.aq1
            r1.<init>()
            db2.t4 r7 = db2.t4.f309704a
            r8 = 11250(0x2bf2, float:1.5765E-41)
            r45.kv0 r7 = r7.a(r8)
            r1.set(r6, r7)
            android.content.Context r7 = r4.getContext()
            java.lang.String r8 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            java.lang.String r7 = xy2.c.e(r7)
            r1.set(r5, r7)
            com.tencent.mm.modelbase.i r1 = r1.d()
            oz5.l r10 = r10.getF93115e()
            r9.f200370d = r6
            java.lang.Object r10 = xg2.g.b(r1, r10, r9)
            if (r10 != r0) goto L67
            return r0
        L67:
            r1 = r10
            xg2.h r1 = (xg2.h) r1
            boolean r10 = r1 instanceof xg2.i
            if (r10 == 0) goto L86
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L76
            oz5.l r10 = r9.mo48699x76847179()
        L76:
            com.tencent.mm.plugin.finder.live.widget.jg r6 = new com.tencent.mm.plugin.finder.live.widget.jg
            r6.<init>(r1, r2, r4)
            r9.f200371e = r1
            r9.f200370d = r5
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r6, r9)
            if (r10 != r0) goto L86
            return r0
        L86:
            boolean r10 = r1 instanceof xg2.b
            if (r10 == 0) goto La2
            oz5.l r10 = r1.f535925a
            if (r10 != 0) goto L92
            oz5.l r10 = r9.mo48699x76847179()
        L92:
            com.tencent.mm.plugin.finder.live.widget.ig r5 = new com.tencent.mm.plugin.finder.live.widget.ig
            r5.<init>(r1, r2, r4)
            r9.f200371e = r1
            r9.f200370d = r3
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r10, r5, r9)
            if (r10 != r0) goto La2
            return r0
        La2:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.kg.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
