package m55;

/* loaded from: classes10.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f405853d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m55.b f405854e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ og3.d f405855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ og3.e f405856g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(m55.b bVar, og3.d dVar, og3.e eVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f405854e = bVar;
        this.f405855f = dVar;
        this.f405856g = eVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new m55.a(this.f405854e, this.f405855f, this.f405856g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((m55.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f405853d
            og3.e r2 = r8.f405856g
            og3.d r3 = r8.f405855f
            m55.b r4 = r8.f405854e
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L22
            if (r1 == r6) goto L1e
            if (r1 != r5) goto L16
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L4c
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L2e
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            r8.f405853d = r6
            java.lang.Object r9 = r4.d(r3, r2, r8)
            if (r9 != r0) goto L2e
            return r0
        L2e:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372) r9
            r9.getClass()
            og3.h r1 = og3.h.f426699f
            og3.h r7 = r9.f230135d
            if (r7 != r1) goto L3a
            goto L3b
        L3a:
            r6 = 0
        L3b:
            if (r6 == 0) goto L5f
            m55.c r9 = r4.f405857a
            if (r9 == 0) goto L50
            r8.f405853d = r5
            m55.b r9 = (m55.b) r9
            java.lang.Object r9 = r9.c(r3, r2, r8)
            if (r9 != r0) goto L4c
            return r0
        L4c:
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1861x73c1b2ca.p1862x2eefaa.C16504x377e8372) r9
            if (r9 != 0) goto L5f
        L50:
            r2 = -1
            java.lang.String r3 = "no chain handle video remux"
            com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo r9 = new com.tencent.mm.plugin.mediabasic.data.MediaErrorInfo
            og3.h r1 = og3.h.f426697d
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L5f:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m55.a.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
