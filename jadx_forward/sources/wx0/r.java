package wx0;

/* loaded from: classes5.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f532064d;

    /* renamed from: e, reason: collision with root package name */
    public int f532065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wx0.c0 f532066f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f532067g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(wx0.c0 c0Var, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f532066f = c0Var;
        this.f532067g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wx0.r(this.f532066f, this.f532067g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((wx0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x00bd  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f532065e
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L22
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            java.lang.Object r0 = r11.f532064d
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r0 = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10979xd03dfd61) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto La9
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L73
        L22:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            wx0.c0 r12 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.n r1 = new wx0.n
            yz5.a r5 = r11.f532067g
            r1.<init>(r5)
            r12.m47348xc07e953d(r1)
            wx0.c0 r12 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.o r1 = new wx0.o
            wx0.c0 r5 = r11.f532066f
            r1.<init>(r5)
            r12.m47347x8e4056fc(r1)
            wx0.c0 r12 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.q r1 = new wx0.q
            wx0.c0 r5 = r11.f532066f
            r1.<init>(r5)
            r12.m47346xd6622751(r1)
            wx0.c0 r12 = r11.f532066f
            yx0.b8 r12 = r12.f531992g
            r11.f532065e = r4
            kotlinx.coroutines.y0 r5 = r12.L
            r6 = 0
            r7 = 0
            yx0.g2 r8 = new yx0.g2
            r8.<init>(r12, r2)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.f1 r12 = p3325xe03a0797.p3326xc267989b.l.b(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.g1 r12 = (p3325xe03a0797.p3326xc267989b.g1) r12
            java.lang.Object r12 = r12.k(r11)
            if (r12 != r0) goto L73
            return r0
        L73:
            nx0.y r12 = (nx0.y) r12
            wx0.c0 r1 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r1 = r1.c()
            nx0.y r1 = r1.getF151122u()
            if (r12 == r1) goto Lae
            wx0.c0 r12 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.c0 r1 = r11.f532066f
            yx0.b8 r1 = r1.f531992g
            r11.f532064d = r12
            r11.f532065e = r3
            kotlinx.coroutines.y0 r5 = r1.L
            r6 = 0
            r7 = 0
            yx0.g2 r8 = new yx0.g2
            r8.<init>(r1, r2)
            r9 = 3
            r10 = 0
            kotlinx.coroutines.f1 r1 = p3325xe03a0797.p3326xc267989b.l.b(r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.g1 r1 = (p3325xe03a0797.p3326xc267989b.g1) r1
            java.lang.Object r1 = r1.k(r11)
            if (r1 != r0) goto La7
            return r0
        La7:
            r0 = r12
            r12 = r1
        La9:
            nx0.y r12 = (nx0.y) r12
            r0.m47344x43d7a24b(r12)
        Lae:
            wx0.c0 r12 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            wx0.c0 r0 = r11.f532066f
            yx0.b8 r0 = r0.f531992g
            com.tencent.maas.camstudio.MJCamTemplateInfo r0 = r0.Q
            if (r0 != 0) goto Lbd
            goto Lbe
        Lbd:
            r4 = 0
        Lbe:
            r12.m47345x275f81ee(r4)
            wx0.c0 r12 = r11.f532066f
            com.tencent.mm.mj_publisher.finder.shoot_composing.beautify.BeautyView r12 = r12.c()
            r12.e()
            jz5.f0 r12 = jz5.f0.f384359a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: wx0.r.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
