package sh2;

/* loaded from: classes3.dex */
public final class b extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f489544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sh2.c f489545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sh2.h f489546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(sh2.c cVar, sh2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489545e = cVar;
        this.f489546f = hVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sh2.b(this.f489545e, this.f489546f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sh2.b) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
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
            int r1 = r6.f489544d
            sh2.c r2 = r6.f489545e
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L39
        Lf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            dk2.ef r7 = dk2.ef.f314905a
            com.tencent.mm.plugin.finder.live.view.k0 r1 = dk2.ef.f314913e
            dk2.xf r7 = r7.j(r1)
            if (r7 == 0) goto L3c
            boolean r1 = r2.f489548e
            if (r1 == 0) goto L2a
            r1 = r3
            goto L2b
        L2a:
            r1 = 2
        L2b:
            r6.f489544d = r3
            dk2.r4 r7 = (dk2.r4) r7
            r4 = 3
            int r5 = r2.f489549f
            java.lang.Object r7 = r7.G(r4, r1, r5, r6)
            if (r7 != r0) goto L39
            return r0
        L39:
            r45.od1 r7 = (r45.od1) r7
            goto L3d
        L3c:
            r7 = 0
        L3d:
            sh2.h r0 = r6.f489546f
            if (r7 == 0) goto L50
            fp0.u r7 = fp0.u.f346823f
            sh2.i r0 = (sh2.i) r0
            r0.getClass()
            sh2.j r0 = r0.f489558a
            r0.b(r7)
            sh2.d r7 = r2.f489541a
            goto L84
        L50:
            fp0.u r7 = fp0.u.f346824g
            sh2.i r0 = (sh2.i) r0
            r0.getClass()
            sh2.j r0 = r0.f489558a
            r0.b(r7)
            sh2.d r7 = r2.f489541a
            if (r7 == 0) goto L84
            df2.vm r7 = (df2.vm) r7
            df2.cn r7 = r7.f313150a
            java.lang.String r0 = r7.f311425p
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "like action failed: "
            r1.<init>(r4)
            boolean r2 = r2.f489548e
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData r7 = r7.f311430u
            r0 = r2 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.mo7808x76db6cb1(r0)
        L84:
            jz5.f0 r7 = jz5.f0.f384359a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sh2.b.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
