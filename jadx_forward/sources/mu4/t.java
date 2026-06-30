package mu4;

/* loaded from: classes7.dex */
public final class t implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412977a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ mu4.h0 f412978b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mu4.w f412979c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r f412980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412982f;

    public t(java.lang.String str, mu4.h0 h0Var, mu4.w wVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.r rVar, java.lang.String str2, java.lang.String str3) {
        this.f412977a = str;
        this.f412978b = h0Var;
        this.f412979c = wVar;
        this.f412980d = rVar;
        this.f412981e = str2;
        this.f412982f = str3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s
    public final void a(java.lang.String str, java.lang.String str2) {
        mu4.w0 t0Var;
        mu4.n nVar = mu4.w.f412985y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebJsEngine", "JsException[" + this.f412977a + "]:" + str + '\n' + str2);
        mu4.a0 a0Var = new mu4.a0();
        mu4.h0 h0Var = this.f412978b;
        h0Var.a(a0Var);
        mu4.w wVar = this.f412979c;
        mu4.x0 x0Var = ((nu4.b0) wVar).F;
        int ordinal = h0Var.f412954b.ordinal();
        java.lang.String str3 = this.f412982f;
        java.lang.String name = this.f412981e;
        if (ordinal == 0) {
            t0Var = new mu4.t0();
            java.lang.String str4 = str + '\t' + str2;
            jx3.f.INSTANCE.d(20821, str3, name, str4 != null ? r26.i0.u(str4, ',', '.', false, 4, null) : null);
        } else if (ordinal == 1) {
            t0Var = new mu4.n0();
            java.lang.String str5 = str + '\t' + str2;
            jx3.f.INSTANCE.d(20821, str3, name, str5 != null ? r26.i0.u(str5, ',', '.', false, 4, null) : null);
        } else if (ordinal != 2) {
            t0Var = new mu4.j0();
        } else {
            t0Var = new mu4.j0();
            java.lang.String str6 = str + '\t' + str2;
            jx3.f.INSTANCE.d(20821, str3, name, str6 != null ? r26.i0.u(str6, ',', '.', false, 4, null) : null);
        }
        x0Var.a(t0Var);
        int o17 = this.f412980d.o();
        wVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        cl0.g gVar = new cl0.g();
        gVar.o(dm.i4.f66865x76d1ec5a, o17);
        gVar.h(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, name);
        gVar.h(com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7, str);
        gVar.h("stackTrace", str2);
        java.lang.String gVar2 = gVar.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
        lu4.c.u(wVar, "error", gVar2, null, 4, null);
    }
}
