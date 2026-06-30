package zk;

/* loaded from: classes5.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f554927d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f554928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982 f554929f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f554930g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982 c5090xb499f982, java.util.List list, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f554929f = c5090xb499f982;
        this.f554930g = list;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        zk.j jVar = new zk.j(this.f554929f, this.f554930g, interfaceC29045xdcb5ca57);
        jVar.f554928e = obj;
        return jVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zk.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0078  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f554927d
            kz5.p0 r2 = kz5.p0.f395529d
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L73
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            java.lang.Object r1 = r6.f554928e
            kotlinx.coroutines.y0 r1 = (p3325xe03a0797.p3326xc267989b.y0) r1
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L36
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.Object r7 = r6.f554928e
            kotlinx.coroutines.y0 r7 = (p3325xe03a0797.p3326xc267989b.y0) r7
            r6.f554928e = r7
            r6.f554927d = r4
            com.tencent.mm.app.provider.ShareableChatRecordsProvider r7 = r6.f554929f
            java.lang.Object r7 = com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982.a(r7, r6)
            if (r7 != r0) goto L36
            return r0
        L36:
            ct.q2 r7 = (ct.q2) r7
            if (r7 != 0) goto L42
            java.lang.String r7 = "MicroMsg.ShareableChatRecordsProvider"
            java.lang.String r0 = "[-] writeCdnInfos: service is null after retry"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r7, r0)
            return r2
        L42:
            java.util.ArrayList r1 = new java.util.ArrayList
            r4 = 10
            java.util.List r5 = r6.f554930g
            int r4 = kz5.d0.q(r5, r4)
            r1.<init>(r4)
            java.util.Iterator r4 = r5.iterator()
        L53:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            zk.b r5 = (zk.b) r5
            com.tencent.mm.storage.f9 r5 = r5.f554883b
            r1.add(r5)
            goto L53
        L65:
            r4 = 0
            r6.f554928e = r4
            r6.f554927d = r3
            qg5.l0 r7 = (qg5.l0) r7
            java.lang.Object r7 = r7.bj(r1, r6)
            if (r7 != r0) goto L73
            return r0
        L73:
            java.util.List r7 = (java.util.List) r7
            if (r7 != 0) goto L78
            goto L79
        L78:
            r2 = r7
        L79:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: zk.j.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
