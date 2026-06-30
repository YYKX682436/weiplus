package dk2;

/* loaded from: classes3.dex */
public final class j8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f315179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f315182g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f315183h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(dk2.x4 x4Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Intent intent, yz5.p pVar) {
        super(1);
        this.f315179d = x4Var;
        this.f315180e = context;
        this.f315181f = h0Var;
        this.f315182g = intent;
        this.f315183h = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.nw1 nw1Var;
        ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d17 = this.f315179d.d();
        yz5.p pVar = this.f315183h;
        if (d17 != null) {
            long j17 = d17.f150070e;
            dk2.r9 r9Var = dk2.r9.f315558a;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f315181f;
            if (j17 != 0) {
                gk2.e eVar = gk2.e.f354004n;
                if ((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null || d17.f150070e != nw1Var.m75942xfb822ef2(0)) ? false : true) {
                    dk2.r9.i(r9Var, this.f315180e, this.f315179d, (java.lang.String) h0Var.f391656d, null, this.f315182g, 8, null);
                    pVar.mo149xb9724478(java.lang.Boolean.FALSE, "same live");
                }
            }
            boolean rk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk();
            android.content.Context context = this.f315180e;
            if (rk6) {
                android.content.Intent intent = this.f315182g;
                if (!(intent != null && intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE"))) {
                    if (!(intent != null && intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE_FROM_SIDEBAR"))) {
                        db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmy), 0).show();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmy)));
                        pVar.mo149xb9724478(java.lang.Boolean.FALSE, "visitor_living");
                    }
                }
                r9Var.h(this.f315180e, this.f315179d, (java.lang.String) h0Var.f391656d, "", this.f315182g);
                pVar.mo149xb9724478(java.lang.Boolean.FALSE, "KEY_PARAMS_POST_CREATE_LIVE");
            } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.day), 0).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.day)));
                pVar.mo149xb9724478(java.lang.Boolean.FALSE, "anchor_living");
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveJumpChecker", "jumpAnchorLiveUI Fail! liveConfig == null !!!");
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, "config_null");
        }
        return jz5.f0.f384359a;
    }
}
