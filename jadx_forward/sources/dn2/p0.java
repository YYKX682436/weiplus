package dn2;

/* loaded from: classes3.dex */
public final class p0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f323488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.f1 f323489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f323490f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 f323491g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dn2.s0 f323492h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.pj1 f323493i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(p3325xe03a0797.p3326xc267989b.f1 f1Var, android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, dn2.s0 s0Var, r45.pj1 pj1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f323489e = f1Var;
        this.f323490f = view;
        this.f323491g = k0Var;
        this.f323492h = s0Var;
        this.f323493i = pj1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dn2.p0(this.f323489e, this.f323490f, this.f323491g, this.f323492h, this.f323493i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dn2.p0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0034  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r10.f323488d
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            goto L25
        Ld:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L15:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r11)
            kotlinx.coroutines.f1 r11 = r10.f323489e
            if (r11 == 0) goto L31
            r10.f323488d = r2
            java.lang.Object r11 = r11.k(r10)
            if (r11 != r0) goto L25
            return r0
        L25:
            r45.bv1 r11 = (r45.bv1) r11
            if (r11 == 0) goto L31
            r0 = 3
            com.tencent.mm.protobuf.f r11 = r11.m75936x14adae67(r0)
            r45.y23 r11 = (r45.y23) r11
            goto L32
        L31:
            r11 = 0
        L32:
            if (r11 == 0) goto L6e
            st2.c2 r3 = st2.c2.f493782a
            r5 = 1177(0x499, float:1.65E-42)
            r6 = 0
            java.lang.String r7 = ""
            r8 = 0
            r9 = 1
            r4 = r11
            l81.b1 r0 = r3.c(r4, r5, r6, r7, r8, r9)
            dk2.q4 r1 = dk2.q4.f315471a
            android.view.View r3 = r10.f323490f
            android.content.Context r3 = r3.getContext()
            java.lang.String r4 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            com.tencent.mm.plugin.finder.live.view.k0 r4 = r10.f323491g
            gk2.e r5 = r4.m57654xd7793f26()
            r1.n(r3, r5, r0, r4)
            ml2.f4 r0 = ml2.f4.N
            r1 = 17
            java.lang.String r11 = r11.m75945x2fec8307(r1)
            if (r11 != 0) goto L64
            java.lang.String r11 = ""
        L64:
            dn2.s0 r1 = r10.f323492h
            r45.pj1 r3 = r10.f323493i
            r1.g(r0, r3, r11)
            r1.f(r3, r2)
        L6e:
            jz5.f0 r11 = jz5.f0.f384359a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: dn2.p0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
