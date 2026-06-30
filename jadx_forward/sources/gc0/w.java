package gc0;

/* loaded from: classes5.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f351858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351859e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f351860f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f351861g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351862h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f351863i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f351864m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Intent intent, java.lang.String str, java.lang.String str2, android.content.Context context2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f351859e = context;
        this.f351860f = f9Var;
        this.f351861g = intent;
        this.f351862h = str;
        this.f351863i = str2;
        this.f351864m = context2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gc0.w(this.f351859e, this.f351860f, this.f351861g, this.f351862h, this.f351863i, this.f351864m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gc0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
    
        if (r3 == false) goto L29;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r5.f351858d
            android.content.Intent r2 = r5.f351861g
            r3 = 1
            if (r1 == 0) goto L17
            if (r1 != r3) goto Lf
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L3d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            java.lang.String r6 = "MicroMsg.HandleRecommendRemarkSendTipClickListener"
            java.lang.String r1 = "onClickImp() called launch have img"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r6, r1)
            java.lang.Class<xs.y0> r6 = xs.y0.class
            i95.m r6 = i95.n0.c(r6)
            xs.y0 r6 = (xs.y0) r6
            java.lang.String r1 = "$ctx"
            android.content.Context r4 = r5.f351859e
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            r5.f351858d = r3
            te5.o r6 = (te5.o) r6
            com.tencent.mm.storage.f9 r1 = r5.f351860f
            java.lang.Object r6 = r6.Ai(r4, r1, r2, r5)
            if (r6 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L97
            r6 = 0
            java.lang.String r0 = r5.f351862h
            if (r0 == 0) goto L53
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L51
            goto L53
        L51:
            r0 = r6
            goto L54
        L53:
            r0 = r3
        L54:
            android.content.Context r1 = r5.f351864m
            if (r0 == 0) goto L66
            java.lang.String r0 = r5.f351863i
            if (r0 == 0) goto L64
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L63
            goto L64
        L63:
            r3 = r6
        L64:
            if (r3 != 0) goto L85
        L66:
            java.lang.Class<ct.u2> r0 = ct.u2.class
            i95.m r0 = i95.n0.c(r0)
            ct.u2 r0 = (ct.u2) r0
            bt.d r0 = (bt.d) r0
            com.tencent.mm.app.y7 r0 = r0.f105601d
            r0.m(r2, r1)
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L85
            r0 = r1
            android.app.Activity r0 = (android.app.Activity) r0
            r2 = 2130772152(0x7f0100b8, float:1.7147414E38)
            r3 = 2130771992(0x7f010018, float:1.714709E38)
            r0.overridePendingTransition(r2, r3)
        L85:
            int r0 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n
            com.tencent.mm.ui.widget.dialog.e4 r0 = new com.tencent.mm.ui.widget.dialog.e4
            r0.<init>(r1)
            r1 = 2131773847(0x7f104997, float:1.9179093E38)
            r0.d(r1)
            r0.f293312f = r6
            r0.c()
        L97:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: gc0.w.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
