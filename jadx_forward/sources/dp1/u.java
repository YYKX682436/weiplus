package dp1;

/* loaded from: classes8.dex */
public class u implements dp1.x {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f323710d;

    /* renamed from: f, reason: collision with root package name */
    public dp1.v f323712f;

    /* renamed from: i, reason: collision with root package name */
    public int f323715i;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f323713g = java.lang.Boolean.FALSE;

    /* renamed from: h, reason: collision with root package name */
    public boolean f323714h = false;

    /* renamed from: e, reason: collision with root package name */
    public al5.g3 f323711e = new dp1.r(this);

    public u(android.app.Activity activity) {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f323715i = 0;
        this.f323710d = new java.lang.ref.WeakReference(activity);
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        android.app.Activity mo50327x19263085 = mo50327x19263085();
        ((ov.p0) j0Var).getClass();
        int c17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20559x7c368045());
        float f17 = (mo50327x19263085 == null || (resources = mo50327x19263085.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = ((c17 <= 0 || c17 >= 100) ? 20 : c17) * f17;
        float B = (i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 5) - f18;
        this.f323715i = (int) java.lang.Math.min((100 * f17) + 0.5f, B > 0.0f ? B : f18);
        if (w()) {
            y();
        }
    }

    @Override // dp1.x
    public android.view.ViewGroup a() {
        android.app.Activity mo50327x19263085 = mo50327x19263085();
        if (mo50327x19263085 == null) {
            return null;
        }
        return (android.view.ViewGroup) mo50327x19263085.getWindow().getDecorView();
    }

    @Override // dp1.x
    public int b() {
        return -1;
    }

    @Override // dp1.x
    public boolean c() {
        return true;
    }

    @Override // dp1.x
    public boolean f() {
        return false;
    }

    @Override // dp1.x
    public void g(dp1.v vVar) {
        android.app.Activity mo50327x19263085 = mo50327x19263085();
        boolean z17 = mo50327x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
        if (z17) {
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085).m78735x28280f95();
        }
        if (z17) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085;
            if (abstractActivityC21394xb3d2c0cf.m78735x28280f95() != null) {
                abstractActivityC21394xb3d2c0cf.m78735x28280f95().m81456x372c76d3(this.f323711e);
                this.f323712f = vVar;
            }
        }
    }

    @Override // dp1.x
    /* renamed from: getActivity */
    public android.app.Activity mo50327x19263085() {
        if (this.f323710d.get() == null) {
            return null;
        }
        return (android.app.Activity) this.f323710d.get();
    }

    @Override // dp1.x
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo50328x12501425() {
        return uj5.g.c(mo50330x8c409d27());
    }

    @Override // dp1.x
    /* renamed from: getContentView */
    public android.view.View mo50329xc2a54588() {
        android.app.Activity mo50327x19263085 = mo50327x19263085();
        if (!(mo50327x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            return null;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085;
        if (abstractActivityC21394xb3d2c0cf.m78735x28280f95() != null) {
            return abstractActivityC21394xb3d2c0cf.m78735x28280f95().m81444x1eccc7b7();
        }
        return null;
    }

    @Override // dp1.x
    /* renamed from: getIntent */
    public android.content.Intent mo54480x1e885992() {
        android.app.Activity mo50327x19263085 = mo50327x19263085();
        if (mo50327x19263085 == null) {
            return null;
        }
        return mo50327x19263085.getIntent();
    }

    @Override // dp1.x
    /* renamed from: getMaskView */
    public android.view.View mo50330x8c409d27() {
        android.app.Activity mo50327x19263085 = mo50327x19263085();
        if (mo50327x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            return ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085).m78510xe15784dd();
        }
        return null;
    }

    @Override // dp1.x
    public boolean h() {
        return this instanceof kd2.a0;
    }

    @Override // dp1.x
    public boolean i() {
        return this instanceof kd2.a0;
    }

    @Override // dp1.x
    public void j(dp1.w wVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAdapter", "convertToTranslucent");
        db5.f.c(mo50327x19263085(), new dp1.t(this, new java.util.concurrent.atomic.AtomicInteger(0), wVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAdapter", "float ball page convertActivityToTranslucent");
    }

    @Override // dp1.x
    public boolean k() {
        return this.f323714h;
    }

    @Override // dp1.x
    public void l(int i17) {
        java.lang.String str;
        try {
            ((ov.p0) ((pv.j0) i95.n0.c(pv.j0.class))).getClass();
            str = j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20563xb0e4db7());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getExptString(...)");
        } catch (java.lang.Exception unused) {
            str = null;
        }
        boolean z17 = false;
        if (str != null && !str.isEmpty()) {
            if (!com.p176xb6135e39.p177xcca8366f.gms.p238x68ac49f.p240x4e139522.C2426x7e760204.f7430xad573197.equals(str)) {
                for (java.lang.String str2 : str.split(",")) {
                    if (!str2.trim().isEmpty()) {
                        if (java.lang.String.valueOf(i17).equals(str2.trim())) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAdapter", "enable expand edgeSize. type: " + i17);
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAdapter", "disable expand edgeSize. type: " + i17);
                        }
                    }
                }
            }
            z17 = true;
            break;
        }
        this.f323713g = java.lang.Boolean.valueOf(z17);
    }

    @Override // dp1.x
    public android.graphics.Bitmap n() {
        return null;
    }

    @Override // dp1.x
    public int o() {
        if (a() != null) {
            return a().getHeight();
        }
        return 0;
    }

    @Override // dp1.x
    public boolean p() {
        return this instanceof kd2.a0;
    }

    @Override // dp1.x
    public void q(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAdapter", "finish, withAnimation:%s", java.lang.Boolean.valueOf(z17));
        if (mo54480x1e885992() != null) {
            if (z17) {
                mo54480x1e885992().putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
                mo54480x1e885992().putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            } else {
                mo54480x1e885992().putExtra("MMActivity.OverrideExitAnimation", 0);
                mo54480x1e885992().putExtra("MMActivity.OverrideEnterAnimation", 0);
            }
        }
        if (mo50327x19263085() != null) {
            mo50327x19263085().finish();
        }
    }

    @Override // dp1.x
    public boolean r() {
        return true;
    }

    @Override // dp1.x
    public android.view.View s() {
        return null;
    }

    @Override // dp1.x
    public boolean t() {
        ((ov.p0) ((pv.j0) i95.n0.c(pv.j0.class))).getClass();
        return (j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20566xca5347a5()) == 0) && (mo50327x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) && ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085()).m78735x28280f95() != null;
    }

    @Override // dp1.x
    public android.view.View u() {
        android.view.ViewGroup a17 = a();
        if (a17 == null || a17.getChildCount() <= 0) {
            return null;
        }
        return a17.getChildAt(0);
    }

    @Override // dp1.x
    public int v() {
        if (a() != null) {
            return a().getWidth();
        }
        return 0;
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAdapter", "float ball onOverScrolled");
        if (!this.f323713g.booleanValue() || mo50327x19263085() == null || !(mo50327x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) || ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085()).m78735x28280f95() == null) {
            return;
        }
        ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo50327x19263085()).m78735x28280f95().m81449xa390ef9a(this.f323715i);
    }
}
