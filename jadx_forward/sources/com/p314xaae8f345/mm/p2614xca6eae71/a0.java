package com.p314xaae8f345.mm.p2614xca6eae71;

/* loaded from: classes12.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f274745d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f274746e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f274746e = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2614xca6eae71.a0(this.f274746e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2614xca6eae71.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003f  */
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
            int r1 = r5.f274745d
            java.lang.String r2 = "MicroMsg.EmojiOcrService"
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L18
            if (r1 != r3) goto L10
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L35
        L10:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L18:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlinx.coroutines.sync.d r6 = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274761d
            r1 = r6
            kotlinx.coroutines.sync.k r1 = (p3325xe03a0797.p3326xc267989b.p3332x361a9b.k) r1
            boolean r1 = r1.a()
            if (r1 != 0) goto L3b
            java.lang.String r1 = "wait working job to be finished"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1)
            r5.f274745d = r3
            java.lang.Object r6 = p3325xe03a0797.p3326xc267989b.p3332x361a9b.c.a(r6, r4, r5, r3, r4)
            if (r6 != r0) goto L35
            return r0
        L35:
            java.lang.String r6 = "the job is finished, it's the time to close the Thread"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
        L3b:
            kotlinx.coroutines.f2 r6 = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274759b
            if (r6 == 0) goto L42
            r6.close()
        L42:
            com.p314xaae8f345.mm.p2614xca6eae71.c0.f274759b = r4
            kotlinx.coroutines.y0 r6 = com.p314xaae8f345.mm.p2614xca6eae71.c0.f274760c
            p3325xe03a0797.p3326xc267989b.z0.e(r6, r4, r3, r4)
            java.lang.String r6 = "stop successfully"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            yz5.a r6 = r5.f274746e
            r6.mo152xb9724478()
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2614xca6eae71.a0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
