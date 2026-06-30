package zv0;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f557690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f557691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zv0.r f557692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f557693g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ex0.j0 f557694h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zv0.f0 f557695i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(rv0.n1 n1Var, zv0.r rVar, ex0.a0 a0Var, ex0.j0 j0Var, zv0.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f557691e = n1Var;
        this.f557692f = rVar;
        this.f557693g = a0Var;
        this.f557694h = j0Var;
        this.f557695i = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zv0.c(this.f557691e, this.f557692f, this.f557693g, this.f557694h, this.f557695i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((zv0.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0053  */
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
            int r1 = r6.f557690d
            rv0.n1 r2 = r6.f557691e
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L49
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L30
        L1e:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            gx0.bf r7 = r2.p7()
            r6.f557690d = r4
            r1 = 0
            r5 = 0
            java.lang.Object r7 = gx0.bf.t7(r7, r1, r6, r4, r5)
            if (r7 != r0) goto L30
            return r0
        L30:
            jz5.g r7 = r2.f481669x
            jz5.n r7 = (jz5.n) r7
            java.lang.Object r7 = r7.mo141623x754a37bb()
            zv0.y r7 = (zv0.y) r7
            r6.f557690d = r3
            ex0.a0 r1 = r6.f557693g
            ex0.j0 r2 = r6.f557694h
            zv0.r r3 = r6.f557692f
            java.lang.Object r7 = r7.e(r3, r1, r2, r6)
            if (r7 != r0) goto L49
            return r0
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            jz5.f0 r0 = jz5.f0.f384359a
            if (r7 != 0) goto L70
            zv0.f0 r7 = r6.f557695i
            android.content.Context r1 = r7.getContext()
            int r2 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n
            com.tencent.mm.ui.widget.dialog.e4 r2 = new com.tencent.mm.ui.widget.dialog.e4
            r2.<init>(r1)
            android.content.Context r7 = r7.getContext()
            r1 = 2131771497(0x7f104069, float:1.9174327E38)
            java.lang.String r7 = r7.getString(r1)
            r2.f293309c = r7
            r2.c()
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zv0.c.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
