package mw4;

/* loaded from: classes7.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f413328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mw4.w f413329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f413330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.s83 f413331g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, mw4.w wVar, java.lang.String str, r45.s83 s83Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413328d = h0Var;
        this.f413329e = wVar;
        this.f413330f = str;
        this.f413331g = s83Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mw4.u(this.f413328d, this.f413329e, this.f413330f, this.f413331g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mw4.u uVar = (mw4.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        uVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        mw4.w wVar = this.f413329e;
        java.lang.String mo120156xb5887639 = wVar.c().f263449a.mo120156xb5887639();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f413328d;
        h0Var.f391656d = mo120156xb5887639;
        boolean z17 = true;
        if (r26.i0.p(this.f413330f, (java.lang.String) h0Var.f391656d, true)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("WebView-Trace Spa notify auth：");
            r45.s83 s83Var = this.f413331g;
            sb6.append(s83Var.f467078d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizMpVideoInterceptor", sb6.toString());
            wVar.c().f0().a(s83Var.f467078d);
            nw4.n jsApiHandler = wVar.c().g0();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsApiHandler, "jsApiHandler");
            java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.o0.f267935e;
            if (str != null && str.length() != 0) {
                z17 = false;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiDoAuthCurrentUrl", "lastCallBackID is null");
            } else {
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.n0(jsApiHandler, "doAuthCurrentUrl:ok"));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BizMpVideoInterceptor", "WebView-Trace Spa auth host not match");
        }
        return jz5.f0.f384359a;
    }
}
