package yx0;

/* loaded from: classes5.dex */
public final class n2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f549006d;

    /* renamed from: e, reason: collision with root package name */
    public int f549007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f549008f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(yx0.b8 b8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549008f = b8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yx0.n2(this.f549008f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx0.n2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x006d  */
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
            int r1 = r9.f549007e
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L20
            if (r1 == r3) goto L1c
            if (r1 != r2) goto L14
            java.lang.Object r0 = r9.f549006d
            jz5.l r0 = (jz5.l) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L59
        L14:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L2e
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            yx0.b8 r10 = r9.f549008f
            r9.f549007e = r3
            java.lang.Object r10 = yx0.b8.i(r10, r9)
            if (r10 != r0) goto L2e
            return r0
        L2e:
            jz5.l r10 = (jz5.l) r10
            java.lang.Class<e42.e0> r1 = e42.e0.class
            i95.m r1 = i95.n0.c(r1)
            e42.e0 r1 = (e42.e0) r1
            com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigSimLoadingTemplateListBadNetEnable r4 = new com.tencent.mm.repairer.config.mjpublisher.shoot_composing.RepairerConfigSimLoadingTemplateListBadNetEnable
            r4.<init>()
            h62.d r1 = (h62.d) r1
            int r1 = r1.nj(r4)
            if (r1 != r3) goto L5a
            int r1 = s26.a.f483901f
            s26.d r1 = s26.d.f483906h
            long r3 = s26.c.e(r3, r1)
            r9.f549006d = r10
            r9.f549007e = r2
            java.lang.Object r1 = p3325xe03a0797.p3326xc267989b.k1.c(r3, r9)
            if (r1 != r0) goto L58
            return r0
        L58:
            r0 = r10
        L59:
            r10 = r0
        L5a:
            yx0.b8 r0 = r9.f549008f
            xx0.i r7 = new xx0.i
            java.util.concurrent.locks.ReentrantLock r1 = yx0.b8.f548704c2
            int r2 = r0.R()
            vt3.n r3 = new vt3.n
            yx0.b8 r1 = r9.f549008f
            r45.q23 r1 = r1.N1
            r4 = 0
            if (r1 == 0) goto L70
            java.lang.String r1 = r1.f465118d
            goto L71
        L70:
            r1 = r4
        L71:
            yx0.b8 r5 = r9.f549008f
            java.lang.Long r6 = r5.L1
            mx0.q3 r5 = r5.P1
            if (r5 == 0) goto L7b
            java.lang.String r4 = r5.f413788h
        L7b:
            yx0.b8 r5 = r9.f549008f
            java.lang.Long r8 = r5.M1
            r3.<init>(r1, r6, r4, r8)
            java.lang.Object r1 = r10.f384366d
            r4 = r1
            vt3.r r4 = (vt3.r) r4
            java.lang.Object r10 = r10.f384367e
            java.util.List r10 = (java.util.List) r10
            mx0.p3 r6 = r5.f548711e
            r1 = r7
            r5 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            r0.J1 = r7
            java.lang.Class<pp0.q0> r10 = pp0.q0.class
            i95.m r10 = i95.n0.c(r10)
            pp0.q0 r10 = (pp0.q0) r10
            yy0.k8 r10 = (yy0.k8) r10
            r10.getClass()
            az0.i5 r10 = az0.i5.f97090a
            az0.i5.f97106q = r7
            java.lang.String r10 = "MicroMsg.ShootComposingCorePlugin"
            java.lang.String r0 = "reportLoadTemplateListFinished"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r10, r0)
            java.lang.Class<w40.e> r10 = w40.e.class
            i95.m r10 = i95.n0.c(r10)
            w40.e r10 = (w40.e) r10
            qs2.q r10 = (qs2.q) r10
            java.lang.String r0 = "SCLoadTemplateList"
            r1 = 0
            java.lang.String r2 = "MJShootComposing"
            java.lang.String r3 = ""
            r10.rj(r0, r2, r3, r1)
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.n2.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
