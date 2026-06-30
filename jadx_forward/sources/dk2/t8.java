package dk2;

/* loaded from: classes3.dex */
public final class t8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f315645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315646e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f315647f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f315648g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315649h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(dk2.x4 x4Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Intent intent, java.lang.String str) {
        super(1);
        this.f315645d = x4Var;
        this.f315646e = context;
        this.f315647f = h0Var;
        this.f315648g = intent;
        this.f315649h = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.nw1 nw1Var;
        ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d17 = this.f315645d.d();
        if (d17 != null) {
            long j17 = d17.f150070e;
            dk2.r9 r9Var = dk2.r9.f315558a;
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f315647f;
            if (j17 != 0) {
                gk2.e eVar = gk2.e.f354004n;
                if ((eVar == null || (nw1Var = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null || d17.f150070e != nw1Var.m75942xfb822ef2(0)) ? false : true) {
                    dk2.r9.i(r9Var, this.f315646e, this.f315645d, (java.lang.String) h0Var.f391656d, null, this.f315648g, 8, null);
                }
            }
            boolean rk6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).rk();
            android.content.Context context = this.f315646e;
            if (rk6) {
                android.content.Intent intent = this.f315648g;
                if (!(intent != null && intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE"))) {
                    if (!(intent != null && intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE_FROM_SIDEBAR"))) {
                        db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmy), 0).show();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cmy)));
                    }
                }
                r9Var.h(this.f315646e, this.f315645d, (java.lang.String) h0Var.f391656d, this.f315649h, this.f315648g);
            } else if (((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) ((s40.w0) i95.n0.c(s40.w0.class))).fk()) {
                db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.day), 0).show();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.day)));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveJumpChecker", "jumpAnchorLiveUI Fail! liveConfig == null !!!");
        }
        return jz5.f0.f384359a;
    }
}
