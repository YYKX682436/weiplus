package kn;

/* loaded from: classes11.dex */
public class l implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final kn.k f390945d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f390946e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f390948g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f390949h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f390950i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f390951m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f390947f = null;

    public l(android.content.Context context, kn.k kVar) {
        this.f390946e = context;
        this.f390945d = kVar;
    }

    public final void a(boolean z17, r45.af0 af0Var, int i17) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        kn.k kVar = this.f390945d;
        if (kVar != null) {
            com.p314xaae8f345.mm.p648x55baa833.ui.a2 a2Var = (com.p314xaae8f345.mm.p648x55baa833.ui.a2) kVar;
            com.p314xaae8f345.mm.p648x55baa833.ui.h1 h1Var = a2Var.f145559c;
            java.lang.String str = null;
            android.content.Context context = a2Var.f145558b;
            com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee activityC10339x9e5e23ee = a2Var.f145557a;
            if (af0Var == null || !z17) {
                int i18 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee.f145260s;
                activityC10339x9e5e23ee.getClass();
                if (context != null && (resources = context.getResources()) != null) {
                    str = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bq9);
                }
                db5.t7.i(context, str, com.p314xaae8f345.mm.R.raw.f79723x416541f0);
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p648x55baa833.ui.w1(new com.p314xaae8f345.mm.p648x55baa833.ui.y1(h1Var, i17)), 1000L);
                return;
            }
            int i19 = com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10339x9e5e23ee.f145260s;
            activityC10339x9e5e23ee.getClass();
            int i27 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            if (context != null && (resources2 = context.getResources()) != null) {
                str = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bqa);
            }
            e4Var.f293309c = str;
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 c17 = e4Var.c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "show(...)");
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p648x55baa833.ui.w1(new com.p314xaae8f345.mm.p648x55baa833.ui.z1(context, c17, h1Var, i17)), 1000L);
        }
    }

    public final void b() {
        if (this.f390948g) {
            java.lang.Runnable runnable = this.f390950i;
            if (runnable != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f390947f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f390947f = null;
            }
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f390949h);
        gm0.j1.n().f354821b.q(6217, this);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (!(m1Var instanceof kn.q) || m1Var.mo808xfb85f7b0() != 6217) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CheckFinderManagerSwithFun", "not expected scene,  type = " + m1Var.mo808xfb85f7b0());
            return;
        }
        b();
        if (i17 == 0 && i18 == 0) {
            a(true, (r45.af0) ((kn.q) m1Var).f390980e.f152244b.f152233a, 0);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.s(this.f390946e, str, "");
        }
        a(false, null, i18);
    }
}
