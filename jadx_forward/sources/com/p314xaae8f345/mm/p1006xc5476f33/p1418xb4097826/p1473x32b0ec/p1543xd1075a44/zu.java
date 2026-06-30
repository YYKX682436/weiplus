package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes5.dex */
public final class zu extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f202143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv f202144e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zu(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.dv dvVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f202144e = dvVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zu(this.f202144e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zu) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f202143d
            java.lang.String r2 = "FinderLiveRequestSongRvWidget"
            r3 = 1
            com.tencent.mm.plugin.finder.live.widget.dv r4 = r5.f202144e
            if (r1 == 0) goto L19
            if (r1 != r3) goto L11
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L32
        L11:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L19:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            r4.f199692l = r3
            java.lang.String r6 = "loading history"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            yz5.p r6 = r4.f199697q
            if (r6 == 0) goto L46
            com.tencent.mm.protobuf.g r1 = r4.f199693m
            r5.f202143d = r3
            java.lang.Object r6 = r6.mo149xb9724478(r1, r5)
            if (r6 != r0) goto L32
            return r0
        L32:
            jz5.l r6 = (jz5.l) r6
            if (r6 == 0) goto L46
            java.lang.Object r0 = r6.f384366d
            com.tencent.mm.protobuf.g r0 = (com.p314xaae8f345.mm.p2495xc50a8b8b.g) r0
            r4.f199693m = r0
            java.lang.Object r6 = r6.f384367e
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r4.f199694n = r6
        L46:
            int r6 = r4.f199694n
            if (r6 != 0) goto L54
            java.lang.String r6 = "all history data loaded"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            yz5.a r6 = r4.f199698r
            r6.mo152xb9724478()
        L54:
            r6 = 0
            r4.f199692l = r6
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zu.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
