package dk2;

/* loaded from: classes3.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315419d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f315420e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f315421f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f315422g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2495xc50a8b8b.g f315423h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.u f315424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(dk2.r4 r4Var, long j17, android.content.Context context, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, yz5.u uVar) {
        super(0);
        this.f315419d = r4Var;
        this.f315420e = j17;
        this.f315421f = context;
        this.f315422g = i17;
        this.f315423h = gVar;
        this.f315424i = uVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek2.e0 e0Var;
        dk2.x4 x4Var;
        java.lang.String str;
        android.content.Intent intent;
        java.lang.String stringExtra;
        dk2.r4 r4Var = this.f315419d;
        r45.o72 K = r4Var.K(((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
        java.lang.Long l17 = vd2.a2.f517175m;
        if (l17 != null && l17.longValue() == 0) {
            long j17 = this.f315420e;
            vd2.a2.f517175m = java.lang.Long.valueOf(j17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveDataLoader", "setLiveReportObj " + pm0.v.u(j17) + ", refObjectId:" + pm0.v.u(K.m75942xfb822ef2(9)));
            vd2.a2.f517174l = K;
        }
        java.lang.String l07 = zl2.r4.f555483a.l0("sessionBuffer");
        if (l07 == null) {
            l07 = "";
        }
        K.set(12, l07);
        android.content.Context context = this.f315421f;
        if (context != null) {
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye yeVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ye.class);
            if (yeVar != null) {
                yeVar.f218098d = K;
            }
        }
        boolean z17 = context instanceof android.app.Activity;
        android.app.Activity activity = z17 ? (android.app.Activity) context : null;
        java.lang.String str2 = (activity == null || (intent = activity.getIntent()) == null || (stringExtra = intent.getStringExtra("key_enter_live_param_source_web_url")) == null) ? "" : stringExtra;
        android.app.Activity activity2 = z17 ? (android.app.Activity) context : null;
        android.content.Intent intent2 = activity2 != null ? activity2.getIntent() : null;
        if (intent2 != null && intent2.getBooleanExtra("intent_key_ignore_back", false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4Var.f315542d, "remove INTENT_KEY_IGNORE_BACK");
            intent2.removeExtra("intent_key_ignore_back");
        }
        long m75942xfb822ef2 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        byte[] bArr = ((mm2.e1) r4Var.m(mm2.e1.class)).f410518o;
        java.lang.String f17 = xy2.c.f(r4Var.f315541c);
        long j18 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410516m;
        java.lang.String str3 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410525v;
        java.lang.String str4 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410517n;
        java.lang.String str5 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410526w;
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        int m75939xb282bd08 = g92.b.f351302e.k2().m75939xb282bd08(4);
        java.lang.String str6 = ((mm2.c1) r4Var.m(mm2.c1.class)).f410438w4;
        int i17 = ((mm2.c1) r4Var.m(mm2.c1.class)).f410446x4;
        r45.qt2 qt2Var = r4Var.f315541c;
        r45.jc1 jc1Var = ((mm2.c1) r4Var.m(mm2.c1.class)).f410360j5;
        tn0.w0 w0Var = dk2.ef.f314911d;
        java.lang.String str7 = w0Var != null ? w0Var.Z : null;
        km2.n nVar = dk2.ef.H;
        java.lang.String str8 = (nVar == null || (x4Var = nVar.f390688g) == null || (str = x4Var.f315865z) == null) ? "" : str;
        java.lang.String str9 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410528y;
        long j19 = ((mm2.e1) r4Var.m(mm2.e1.class)).f410514h;
        java.lang.String str10 = ((mm2.c1) r4Var.m(mm2.c1.class)).f410416s6;
        boolean z18 = dk2.ef.W;
        km2.n nVar2 = dk2.ef.H;
        ek2.e0 e0Var2 = new ek2.e0(m75942xfb822ef2, bArr, f17, j18, this.f315422g, str3, str4, str5, str6, i17, qt2Var, 0, jc1Var, str7, str8, m75939xb282bd08, str9, K, j19, 0, str2, this.f315423h, str10, z18, nVar2 != null ? nVar2.f390694m : 0, 526336, null);
        if (context != null) {
            pf5.z zVar2 = pf5.z.f435481a;
            boolean z19 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112;
            if (!z19) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context;
            im2.t6 t6Var = (im2.t6) zVar2.a(activityC0065xcd7aa112).a(im2.t6.class);
            e0Var = e0Var2;
            r45.gc1 gc1Var = e0Var.f334972w;
            t6Var.P6(gc1Var);
            if (!z19) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((im2.t6) zVar2.a(activityC0065xcd7aa112).a(im2.t6.class)).Q6(((mm2.e1) r4Var.m(mm2.e1.class)).f410514h, (r45.kv0) gc1Var.m75936x14adae67(1));
        } else {
            e0Var = e0Var2;
        }
        pq5.g l18 = e0Var.l();
        l18.K(new dk2.o1(this.f315419d, this.f315420e, this.f315424i, this.f315422g));
        if (r4Var.M() != null && (r4Var.M() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && !((mm2.t2) r4Var.m(mm2.t2.class)).f410961g) {
            android.content.Context M = r4Var.M();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(M, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            l18.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) M);
        }
        return jz5.f0.f384359a;
    }
}
