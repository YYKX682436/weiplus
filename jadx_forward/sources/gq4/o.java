package gq4;

/* loaded from: classes11.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f356127d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f356128e;

    /* renamed from: f, reason: collision with root package name */
    public int f356129f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f356130g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f356131h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f356132i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f356133m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.p f356134n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f356135o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, long j17, boolean z17, yz5.p pVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f356131h = str;
        this.f356132i = j17;
        this.f356133m = z17;
        this.f356134n = pVar;
        this.f356135o = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gq4.o oVar = new gq4.o(this.f356131h, this.f356132i, this.f356133m, this.f356134n, this.f356135o, interfaceC29045xdcb5ca57);
        oVar.f356130g = obj;
        return oVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gq4.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        p3325xe03a0797.p3326xc267989b.f1 f1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f356129f;
        java.lang.String str = this.f356131h;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f356130g;
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
            p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new gq4.n(c0Var2, h0Var, this.f356135o, null), 3, null);
            jp5.n nVar = (jp5.n) i95.n0.c(jp5.n.class);
            this.f356130g = c0Var2;
            this.f356127d = h0Var;
            this.f356128e = b17;
            this.f356129f = 1;
            java.lang.Object Ai = ((co5.p) nVar).Ai(str, this);
            if (Ai == aVar) {
                return aVar;
            }
            f1Var = b17;
            c0Var = c0Var2;
            obj = Ai;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f1Var = (p3325xe03a0797.p3326xc267989b.f1) this.f356128e;
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f356127d;
            c0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.c0) this.f356130g;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        c0Var.f391645d = true;
        p3325xe03a0797.p3326xc267989b.p2.a(f1Var, null, 1, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) h0Var.f391656d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkUseNew: getILinkModeRet ");
        sb6.append(booleanValue);
        sb6.append(", cost ");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        sb6.append(android.os.SystemClock.elapsedRealtime() - this.f356132i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ILinkVoIP.ILinkSdkKtHelper", sb6.toString());
        if (booleanValue) {
            ((jp5.o) i95.n0.c(jp5.o.class)).u4(str, kz5.c0.d(str), this.f356133m);
        } else {
            this.f356134n.mo149xb9724478(java.lang.Boolean.FALSE, java.lang.Boolean.valueOf(gq4.v.Bi().f258091a.f257966w));
        }
        return jz5.f0.f384359a;
    }
}
