package xt2;

/* loaded from: classes3.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538386d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f538387e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xt2.m f538388f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538389g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f538390h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f538391i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f538392m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f538393n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f538394o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.Object obj, xt2.m mVar, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, android.widget.ImageView imageView, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538387e = obj;
        this.f538388f = mVar;
        this.f538389g = c22789xd23e9a9b;
        this.f538390h = c0Var;
        this.f538391i = h0Var;
        this.f538392m = h0Var2;
        this.f538393n = imageView;
        this.f538394o = h0Var3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.l(this.f538387e, this.f538388f, this.f538389g, this.f538390h, this.f538391i, this.f538392m, this.f538393n, this.f538394o, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538386d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f538389g;
        xt2.m mVar = this.f538388f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            xt2.h hVar = new xt2.h(mVar, c22789xd23e9a9b, null);
            this.f538386d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 == 2) {
                    p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                }
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.Object obj2 = this.f538387e;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f538390h;
        if (obj2 == null) {
            java.lang.String str = mVar.f538411g;
            if (str == null || str.length() == 0) {
                java.lang.String k17 = mVar.k();
                if (k17.length() == 0) {
                    java.lang.String str2 = mVar.f538415n;
                    int i18 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "play animate with pag name: pagName.isEmpty() = True", null);
                    return null;
                }
                ym5.l2 l2Var = ym5.l2.f544957a;
                ym5.j2[] j2VarArr = ym5.j2.f544925d;
                c0Var.f391645d = ae2.in.f85221a.a(ym5.f6.f544838e);
                c22789xd23e9a9b.o(c0Var.f391645d);
                mVar.getClass();
                vl2.h hVar2 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k17, "finder_live_shopping_entrance_fire") ? vl2.h.Z : vl2.h.f519352e;
                if (hVar2 == vl2.h.f519352e) {
                    java.lang.String str3 = mVar.f538415n;
                    java.lang.String str4 = "play animate with pag name: " + k17 + " not in UDR, load from assets, useRfx = " + c0Var.f391645d;
                    int i19 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str4, null);
                    android.content.res.AssetManager assets = mVar.f538408d.getContext().getAssets();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
                    c22789xd23e9a9b.k(assets, k17);
                } else {
                    java.lang.String str5 = mVar.f538415n;
                    java.lang.String str6 = "play animate with pag name: useRfx = " + c0Var.f391645d;
                    int i27 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str5, str6, null);
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = mVar.f538414m;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    mVar.f538414m = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(mVar.f538410f, null, null, new xt2.i(hVar2, c22789xd23e9a9b, null), 3, null);
                }
            } else {
                c0Var.f391645d = ae2.in.f85221a.a(ym5.f6.f544838e);
                java.lang.String str7 = mVar.f538415n;
                java.lang.String str8 = "play animate with new default: useRfx = " + c0Var.f391645d;
                int i28 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str7, str8, null);
                ym5.l2 l2Var2 = ym5.l2.f544957a;
                ym5.j2[] j2VarArr2 = ym5.j2.f544925d;
                c22789xd23e9a9b.o(c0Var.f391645d);
                c22789xd23e9a9b.mo82567x3e3ac3e8(mVar.f538411g);
            }
        } else {
            java.lang.String str9 = mVar.f538415n;
            java.lang.String str10 = "play animate with fenwei " + c0Var.f391645d;
            int i29 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str9, str10, null);
            if (c0Var.f391645d) {
                c22789xd23e9a9b.mo82566x3e3ac3e8((com.p314xaae8f345.mm.rfx.C20942x379cf5ee) this.f538391i.f391656d);
            } else {
                c22789xd23e9a9b.mo82568x3e3ac3e8((org.p3363xbe4143f1.C29690xfae77312) this.f538392m.f391656d);
            }
        }
        c22789xd23e9a9b.d();
        c22789xd23e9a9b.m82583xcde73672(1);
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var2 = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        xt2.k kVar = new xt2.k(this.f538389g, this.f538393n, this.f538388f, this.f538394o, null);
        this.f538386d = 2;
        obj = p3325xe03a0797.p3326xc267989b.l.g(g3Var2, kVar, this);
        return obj == aVar ? aVar : obj;
    }
}
