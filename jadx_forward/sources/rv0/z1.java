package rv0;

/* loaded from: classes5.dex */
public final class z1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f481881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f481882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f481883f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(rv0.n1 n1Var, ex0.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f481882e = n1Var;
        this.f481883f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new rv0.z1(this.f481882e, this.f481883f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((rv0.z1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ac  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            pz5.a r8 = pz5.a.f440719d
            int r0 = r7.f481881d
            ex0.a0 r9 = r7.f481883f
            r10 = 0
            r1 = 2
            r2 = 0
            r3 = 1
            rv0.n1 r11 = r7.f481882e
            if (r0 == 0) goto L25
            if (r0 == r3) goto L21
            if (r0 != r1) goto L19
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            goto La6
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L21:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            goto L35
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r19)
            gx0.bf r0 = r11.p7()
            r7.f481881d = r3
            java.lang.Object r0 = gx0.bf.t7(r0, r10, r7, r3, r2)
            if (r0 != r8) goto L35
            return r8
        L35:
            r9.getClass()
            java.lang.Class<pp0.l0> r0 = pp0.l0.class
            i95.m r0 = i95.n0.c(r0)
            pp0.l0 r0 = (pp0.l0) r0
            yy0.m7 r0 = (yy0.m7) r0
            kotlinx.coroutines.y0 r12 = r0.Di()
            r13 = 0
            r14 = 0
            yy0.z4 r15 = new yy0.z4
            r15.<init>(r0, r2)
            r16 = 3
            r17 = 0
            p3325xe03a0797.p3326xc267989b.l.d(r12, r13, r14, r15, r16, r17)
            boolean r0 = r9.B()
            r3 = r0 ^ 1
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "toggleImageDigiZoom: "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = " -> "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r0 = r4.toString()
            java.lang.String r4 = "TimelineViewModel"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            r9.R(r3)
            gx0.kh r0 = r11.q7()
            android.app.Activity r3 = r11.m80379x76847179()
            r4 = 2131771323(0x7f103fbb, float:1.9173974E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            r0.r7(r3, r2)
            gx0.bf r0 = r11.p7()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 7
            r6 = 0
            r7.f481881d = r1
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r18
            java.lang.Object r0 = gx0.bf.d7(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r8) goto La6
            return r8
        La6:
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel r0 = r11.f150773i
            rv0.j r0 = (rv0.j) r0
            if (r0 == 0) goto Laf
            r0.F()
        Laf:
            boolean r0 = r9.B()
            if (r0 == 0) goto Lb9
            r0 = 2131771343(0x7f103fcf, float:1.9174014E38)
            goto Lbc
        Lb9:
            r0 = 2131771342(0x7f103fce, float:1.9174012E38)
        Lbc:
            android.app.Activity r1 = r11.m80379x76847179()
            int[] r2 = new int[r10]
            by0.t.a(r1, r0, r2)
            jz5.f0 r0 = jz5.f0.f384359a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv0.z1.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
