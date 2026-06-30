package gx0;

/* loaded from: classes5.dex */
public final class nb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f358297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f358298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f358299f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb(gx0.ac acVar, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358298e = acVar;
        this.f358299f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.nb(this.f358298e, this.f358299f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.nb) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ab A[RETURN] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r18) {
        /*
            r17 = this;
            r7 = r17
            pz5.a r8 = pz5.a.f440719d
            int r0 = r7.f358297d
            jz5.f0 r9 = jz5.f0.f384359a
            ex0.a0 r1 = r7.f358299f
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            gx0.ac r10 = r7.f358298e
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L29
            if (r0 == r3) goto L25
            if (r0 != r2) goto L1d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto Lac
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto L7c
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            goto L3e
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r18)
            gx0.bf r0 = r10.c8()
            r7.f358297d = r5
            r6 = 0
            java.lang.Object r0 = gx0.bf.t7(r0, r6, r7, r5, r4)
            if (r0 != r8) goto L3e
            return r8
        L3e:
            du0.v0 r0 = r10.R6()
            pp0.l0 r0 = r0.O6()
            yy0.m7 r0 = (yy0.m7) r0
            kotlinx.coroutines.y0 r11 = r0.Di()
            r12 = 0
            r13 = 0
            yy0.k4 r14 = new yy0.k4
            r14.<init>(r0, r4)
            r15 = 3
            r16 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r11, r12, r13, r14, r15, r16)
            jz5.l r0 = r1.P()
            java.lang.Object r5 = r0.f384366d
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Object r0 = r0.f384367e
            java.util.List r0 = (java.util.List) r0
            if (r5 != 0) goto L6c
            return r9
        L6c:
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392103c
            gx0.mb r6 = new gx0.mb
            r6.<init>(r0, r10, r4)
            r7.f358297d = r3
            java.lang.Object r0 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r7)
            if (r0 != r8) goto L7c
            return r8
        L7c:
            gx0.kh r0 = r10.d8()
            android.app.Activity r3 = r10.m80379x76847179()
            r5 = 2131771447(0x7f104037, float:1.9174225E38)
            java.lang.String r3 = r3.getString(r5)
            java.lang.String r5 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)
            r0.r7(r3, r4)
            ex0.i0.m(r1)
            gx0.bf r0 = r10.c8()
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r7.f358297d = r2
            r2 = r3
            r3 = r4
            r4 = r17
            java.lang.Object r0 = gx0.bf.d7(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto Lac
            return r8
        Lac:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.narration.timeline.NarrationTimelineView r0 = r10.A7()
            r0.a()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.nb.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
