package pa3;

/* loaded from: classes8.dex */
public final class r extends ak3.i {

    /* renamed from: q, reason: collision with root package name */
    public android.app.Activity f434532q;

    public r(android.app.Activity activity) {
        super(activity);
        this.f434532q = activity;
    }

    @Override // ak3.i, ak3.c
    public boolean g() {
        return true;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getActivity */
    public android.app.Activity mo2157x19263085() {
        return this.f434532q;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo2158x12501425() {
        android.view.View mo2161x8c409d27 = mo2161x8c409d27();
        if (mo2161x8c409d27 != null) {
            return pa3.w.b(pa3.w.f434545a, mo2161x8c409d27, java.lang.Integer.valueOf(mo2161x8c409d27.getWidth()), java.lang.Integer.valueOf(mo2161x8c409d27.getHeight()), null, 8, null);
        }
        return null;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        android.app.Activity activity = this.f434532q;
        com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = activity instanceof com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 ? (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) activity : null;
        if (activityC10454x40355150 != null) {
            return activityC10454x40355150.f146491d;
        }
        return null;
    }

    @Override // ak3.i, ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        android.view.Window window;
        android.app.Activity activity = this.f434532q;
        if (activity == null || (window = activity.getWindow()) == null) {
            return null;
        }
        return window.getDecorView();
    }

    @Override // ak3.i, ak3.c
    public void h(ak3.a aVar) {
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab;
        jz5.f0 f0Var;
        super.h(aVar);
        ak3.d dVar = this.f87117f;
        pa3.q qVar = null;
        if (dVar != null) {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((rk3.i) dVar).f478055b != null);
            if (valueOf != null) {
                valueOf.booleanValue();
                ak3.d dVar2 = this.f87117f;
                if (dVar2 != null) {
                    al5.g3 g3Var = this.f87118g;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f80 = ((rk3.i) dVar2).f478055b;
                    if (c16606xc6010f80 != null) {
                        c16606xc6010f80.m78875x372c76d3(g3Var);
                    }
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var != null) {
                    return;
                }
            }
        }
        android.app.Activity activity = this.f434532q;
        com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = activity instanceof com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 ? (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) activity : null;
        if (activityC10454x40355150 == null || (c10455x858f5ab = activityC10454x40355150.f146491d) == null) {
            return;
        }
        if (this.f87118g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskPageAdapter", "swipeBackListener is null");
        } else {
            qVar = new pa3.q(this);
        }
        c10455x858f5ab.m43755x372c76d3(qVar);
    }

    @Override // ak3.i, ak3.c
    public void i(boolean z17) {
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab;
        android.app.Activity activity = this.f434532q;
        pa3.q qVar = null;
        com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = activity instanceof com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 ? (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) activity : null;
        if (activityC10454x40355150 == null || (c10455x858f5ab = activityC10454x40355150.f146491d) == null) {
            return;
        }
        c10455x858f5ab.m43749x8e764904(z17);
        if (z17) {
            if (this.f87118g == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskPageAdapter", "swipeBackListener is null");
            } else {
                qVar = new pa3.q(this);
            }
        }
        c10455x858f5ab.m43755x372c76d3(qVar);
    }

    @Override // ak3.i, ak3.c
    public void j(boolean z17, jk3.e helper) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        super.j(z17, helper);
        android.app.Activity activity = this.f434532q;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // ak3.i, ak3.c
    public void k(jk3.e eVar) {
        if (this.f87117f == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            android.app.Activity activity = this.f434532q;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
            this.f87117f = new rk3.i(activity);
        }
        ak3.d dVar = this.f87117f;
        if (dVar != null) {
            ((rk3.i) dVar).a(this, eVar);
        }
    }

    @Override // ak3.i, ak3.c
    public void l() {
        com.p314xaae8f345.mm.ext.ui.C10455x858f5ab c10455x858f5ab;
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        android.app.Activity activity = this.f434532q;
        com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 activityC10454x40355150 = activity instanceof com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150 ? (com.p314xaae8f345.mm.ext.ui.ActivityC10454x40355150) activity : null;
        if (activityC10454x40355150 == null || (c10455x858f5ab = activityC10454x40355150.f146491d) == null) {
            return;
        }
        float f17 = (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = 20 * f17;
        float B = (i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 5) - f18;
        float f19 = (100 * f17) + 0.5f;
        if (B > 0.0f) {
            f18 = B;
        }
        c10455x858f5ab.m43748xa390ef9a((int) java.lang.Math.min(f19, f18));
    }

    @Override // ak3.i
    public void r(android.app.Activity activity) {
        this.f434532q = activity;
    }
}
