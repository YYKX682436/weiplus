package ry4;

/* loaded from: classes.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f483223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry4.c0 f483224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 f483225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f483226g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ry4.c0 c0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 c19510x90fb7cb8, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f483224e = c0Var;
        this.f483225f = c19510x90fb7cb8;
        this.f483226g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ry4.z(this.f483224e, this.f483225f, this.f483226g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ry4.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x005b  */
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
            int r1 = r9.f483223d
            r2 = 0
            r3 = 2
            r4 = 1
            ry4.c0 r5 = r9.f483224e
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L13
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L59
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L40
        L1f:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem r10 = r5.f483123e
            if (r10 == 0) goto L28
            r10 = r4
            goto L29
        L28:
            r10 = r2
        L29:
            r1 = 0
            com.tencent.mm.plugin.weclaw.shortcut.ShortcutCommandItem r6 = r9.f483225f
            if (r10 == 0) goto L47
            java.lang.String r10 = r5.f483122d
            r9.f483223d = r4
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            ry4.b0 r8 = new ry4.b0
            r8.<init>(r5, r6, r10, r1)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r7, r8, r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            goto L5e
        L47:
            java.lang.String r10 = r5.f483122d
            r9.f483223d = r3
            kotlinx.coroutines.p0 r7 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            ry4.a0 r8 = new ry4.a0
            r8.<init>(r5, r10, r6, r1)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.l.g(r7, r8, r9)
            if (r10 != r0) goto L59
            return r0
        L59:
            if (r10 == 0) goto L5d
            r10 = r4
            goto L5e
        L5d:
            r10 = r2
        L5e:
            java.lang.Object[] r0 = new java.lang.Object[r3]
            if (r10 == 0) goto L66
            java.lang.String r1 = "success"
            goto L68
        L66:
            java.lang.String r1 = "failed"
        L68:
            r0[r2] = r1
            java.lang.String r1 = r5.f483122d
            r0[r4] = r1
            java.lang.String r1 = "submitCommand network: %s, username:%s"
            java.lang.String r2 = "MicroMsg.ShortcutCommandEditUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r1, r0)
            if (r10 != 0) goto La4
            java.lang.Class<vh0.g1> r10 = vh0.g1.class
            i95.m r10 = i95.n0.c(r10)
            vh0.g1 r10 = (vh0.g1) r10
            java.lang.String r0 = r5.f483122d
            vh0.i2 r10 = (vh0.i2) r10
            vh0.f1 r10 = r10.ij(r0)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            java.lang.String r0 = r9.f483226g
            if (r0 != 0) goto L90
            java.lang.String r0 = ""
        L90:
            xh0.e r10 = (xh0.e) r10
            r10.b(r0)
            r10.a()
            java.lang.String r10 = r5.f483122d
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r0 = "rollbackLocalCache: rolled back local cache for username:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0, r10)
        La4:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: ry4.z.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
