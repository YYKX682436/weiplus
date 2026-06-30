package qr3;

/* loaded from: classes3.dex */
public final class b implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f447607a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qr3.o f447608b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb f447609c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f447610d;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, qr3.o oVar, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb, boolean z17) {
        this.f447607a = c0Var;
        this.f447608b = oVar;
        this.f447609c = c21560x1fce98fb;
        this.f447610d = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f447607a.f391645d = true;
        qr3.o oVar = this.f447608b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = oVar.f447641i;
        if (u3Var != null) {
            u3Var.dismiss();
            oVar.f447641i = null;
        }
        if (oVar.m158354x19263085().isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "activity.isFinishing");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoSettingJsApiUIC", "mode: cgi result: " + fVar.f152148a + ", " + fVar.f152149b);
            if (fVar.f152149b != 0 || fVar.f152148a != 0) {
                db5.t7.g(oVar.m80379x76847179(), oVar.m80379x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bc_));
                ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21541x1c1b08fe) this.f447609c).S(!this.f447610d);
            }
        }
        return jz5.f0.f384359a;
    }
}
