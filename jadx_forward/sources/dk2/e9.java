package dk2;

/* loaded from: classes3.dex */
public final class e9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.x4 f314895d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f314896e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f314897f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f314898g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f314899h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f314900i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(dk2.x4 x4Var, android.content.Context context, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.content.Intent intent, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        super(1);
        this.f314895d = x4Var;
        this.f314896e = context;
        this.f314897f = h0Var;
        this.f314898g = intent;
        this.f314899h = z17;
        this.f314900i = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        kn0.p pVar;
        r45.nw1 nw1Var;
        r45.nw1 nw1Var2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.mm.p820x32b0ec.api.C10828x8f239b6e d17 = this.f314895d.d();
        if (d17 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("curConfig liveId: ");
            sb6.append(d17.f150070e);
            sb6.append(" lastLiveId: ");
            gk2.e eVar = gk2.e.f354004n;
            sb6.append((eVar == null || (nw1Var2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r) == null) ? null : java.lang.Long.valueOf(nw1Var2.m75942xfb822ef2(0)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", sb6.toString());
            if (d17.f150070e != 0) {
                gk2.e eVar2 = gk2.e.f354004n;
                if ((eVar2 == null || (nw1Var = ((mm2.e1) eVar2.a(mm2.e1.class)).f410521r) == null || d17.f150070e != nw1Var.m75942xfb822ef2(0)) ? false : true) {
                    dk2.r9 r9Var = dk2.r9.f315558a;
                    android.content.Context context = this.f314896e;
                    dk2.x4 x4Var = this.f314895d;
                    java.lang.String str = (java.lang.String) this.f314897f.f391656d;
                    android.content.Intent intent = this.f314898g;
                    boolean z17 = this.f314899h;
                    dk2.ef efVar = dk2.ef.f314905a;
                    tn0.w0 w0Var = dk2.ef.f314911d;
                    if ((w0Var == null || (pVar = w0Var.D) == null || !pVar.f()) ? false : true) {
                        java.lang.Integer valueOf = intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("KEY_PARAMS_DO_ACTION", 0)) : null;
                        if (valueOf != null && valueOf.intValue() == 8) {
                            gk2.e eVar3 = gk2.e.f354004n;
                            mm2.f6 f6Var = eVar3 != null ? (mm2.f6) eVar3.a(mm2.f6.class) : null;
                            if (f6Var != null) {
                                f6Var.T6(true);
                            }
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", "enterSameVisitorLive performClickMiniWin");
                        ik1.h0.b(dk2.he.f315118d);
                    } else {
                        r9Var.k(context, x4Var, (r16 & 4) != 0 ? "" : str, (r16 & 8) != 0 ? "" : null, (r16 & 16) != 0 ? null : intent, (r16 & 32) != 0 ? false : z17);
                    }
                }
            }
            long j17 = d17.f150070e;
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f314900i;
            android.content.Context context2 = this.f314896e;
            if (j17 == 0 || booleanValue) {
                ym5.a1.f(new dk2.d9(context2));
                f0Var.f391649d = 2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", java.lang.String.valueOf(context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.day)));
            } else {
                dk2.ef efVar2 = dk2.ef.f314905a;
                tn0.w0 w0Var2 = dk2.ef.f314911d;
                if (w0Var2 != null && w0Var2.X()) {
                    java.lang.String string = context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e2h);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    ym5.a1.f(new dk2.b9(context2, string));
                    f0Var.f391649d = 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveJumpChecker", string);
                } else {
                    ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                    ml2.e4 e4Var = ml2.e4.f408914m;
                    r0Var.Qk(e4Var);
                    dk2.ef.T(efVar2, false, null, 3, null);
                    pm0.v.X(new dk2.c9(this.f314896e, this.f314895d, this.f314897f, this.f314898g, this.f314899h));
                    i95.m c17 = i95.n0.c(ml2.r0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ml2.r0.Ck((ml2.r0) c17, this.f314896e, e4Var, null, false, null, 28, null);
                }
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveJumpChecker", "jumpVisitorLiveUI Fail! liveConfig == null !!!");
        }
        return jz5.f0.f384359a;
    }
}
