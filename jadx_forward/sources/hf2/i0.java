package hf2;

/* loaded from: classes5.dex */
public final class i0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f362614d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hf2.l0 f362615e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v65.n f362616f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(hf2.l0 l0Var, v65.n nVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f362615e = l0Var;
        this.f362616f = nVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hf2.i0(this.f362615e, this.f362616f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hf2.i0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0081  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f362614d
            jz5.f0 r2 = jz5.f0.f384359a
            r3 = 2
            hf2.l0 r4 = r12.f362615e
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 == r5) goto L1c
            if (r1 != r3) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L77
        L14:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            goto L5f
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r12.f362614d = r5
            r4.getClass()
            kotlinx.coroutines.r r13 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r1 = pz5.f.b(r12)
            r13.<init>(r1, r5)
            r13.k()
            v65.n r1 = new v65.n
            r1.<init>(r13)
            java.lang.Class<pp0.q0> r5 = pp0.q0.class
            i95.m r5 = i95.n0.c(r5)
            java.lang.String r6 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r6)
            pp0.q0 r5 = (pp0.q0) r5
            hf2.j0 r8 = new hf2.j0
            r8.<init>(r1)
            r7 = 0
            az0.i5 r6 = az0.i5.f97090a
            r9 = 0
            r10 = 4
            r11 = 0
            az0.i5.s(r6, r7, r8, r9, r10, r11)
            java.lang.Object r13 = r13.j()
            if (r13 != r0) goto L5b
            goto L5c
        L5b:
            r13 = r2
        L5c:
            if (r13 != r0) goto L5f
            return r0
        L5f:
            java.lang.Class<pp0.n0> r13 = pp0.n0.class
            i95.m r13 = i95.n0.c(r13)
            pp0.n0 r13 = (pp0.n0) r13
            r12.f362614d = r3
            yy0.q7 r13 = (yy0.q7) r13
            r13.getClass()
            az0.l2 r13 = az0.l2.f97189a
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L77
            return r0
        L77:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            v65.n r0 = r12.f362616f
            if (r13 == 0) goto L98
            com.tencent.maas.lowerthird.MJLowerThirdImageGenerator r13 = r4.f362631a
            if (r13 != 0) goto L92
            android.os.Handler r13 = r4.f362633c
            if (r13 == 0) goto L8f
            com.tencent.maas.lowerthird.MJLowerThirdImageGenerator r1 = new com.tencent.maas.lowerthird.MJLowerThirdImageGenerator
            r1.<init>(r13)
            goto L90
        L8f:
            r1 = 0
        L90:
            r4.f362631a = r1
        L92:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            r0.a(r13)
            goto Lab
        L98:
            java.lang.String r13 = "Finder.LiveAnchorStickerMaasLogic"
            java.lang.String r1 = "load maas so error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r13, r1)
            android.os.HandlerThread r13 = r4.f362632b
            if (r13 == 0) goto La6
            r13.quitSafely()
        La6:
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r0.a(r13)
        Lab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: hf2.i0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
