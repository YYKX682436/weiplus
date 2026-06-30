package ak3;

/* loaded from: classes8.dex */
public class i implements ak3.c, al5.m2 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f87115d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d f87116e;

    /* renamed from: f, reason: collision with root package name */
    public ak3.d f87117f;

    /* renamed from: g, reason: collision with root package name */
    public al5.g3 f87118g;

    /* renamed from: h, reason: collision with root package name */
    public ak3.a f87119h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f87120i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f87121m;

    /* renamed from: n, reason: collision with root package name */
    public int f87122n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f87123o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f87124p;

    static {
        new ak3.e(null);
    }

    public i(android.app.Activity activity) {
        r(activity);
        o();
    }

    @Override // ak3.c
    public android.view.ViewGroup a() {
        android.app.Activity mo2157x19263085 = mo2157x19263085();
        if (mo2157x19263085 == null) {
            return null;
        }
        android.view.View decorView = mo2157x19263085.getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
        return (android.view.ViewGroup) decorView;
    }

    @Override // ak3.c
    public int b() {
        return -1;
    }

    @Override // ak3.c
    public boolean c() {
        return true;
    }

    @Override // al5.m2
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
    }

    @Override // al5.m2
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
    }

    @Override // ak3.c
    public void f(ak3.b bVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskPageAdapter", "convertToTranslucent");
        db5.f.c(mo2157x19263085(), new ak3.g(new java.util.concurrent.atomic.AtomicInteger(0), this, bVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskPageAdapter", "multiTask page convertActivityToTranslucent");
    }

    @Override // ak3.c
    public boolean g() {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).getClass();
        if ((j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2553xb81dc63e.C20566xca5347a5()) == 1) && (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            android.app.Activity mo2157x19263085 = mo2157x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x19263085).m78735x28280f95() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // ak3.c
    /* renamed from: getActivity */
    public android.app.Activity mo2157x19263085() {
        return this.f87115d;
    }

    @Override // ak3.c
    /* renamed from: getBitmap */
    public android.graphics.Bitmap mo2158x12501425() {
        if (al3.a.f87378a.a(this.f87122n)) {
            return null;
        }
        try {
            boolean z17 = mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
            if (mo2161x8c409d27() != null) {
                return uj5.g.d(mo2161x8c409d27(), (int) (r0.getWidth() / 1.0f), (int) (r0.getHeight() / 1.0f), true, android.graphics.Bitmap.Config.ARGB_8888);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskPageAdapter", "get bitmap failed", th6);
        }
        return null;
    }

    @Override // ak3.c
    /* renamed from: getContentView */
    public android.view.View mo2159xc2a54588() {
        if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.app.Activity mo2157x19263085 = mo2157x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x19263085).m78735x28280f95() != null) {
                android.app.Activity mo2157x192630852 = mo2157x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                return ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x192630852).m78735x28280f95();
            }
        }
        if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            android.app.Activity mo2157x192630853 = mo2157x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            if (((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) mo2157x192630853).m78735x28280f95() != null) {
                android.app.Activity mo2157x192630854 = mo2157x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x192630854, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                return ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) mo2157x192630854).m78735x28280f95();
            }
        }
        return null;
    }

    @Override // ak3.c
    /* renamed from: getIntent */
    public android.content.Intent mo2160x1e885992() {
        android.app.Activity mo2157x19263085 = mo2157x19263085();
        if (mo2157x19263085 != null) {
            return mo2157x19263085.getIntent();
        }
        return null;
    }

    @Override // ak3.c
    /* renamed from: getMaskView */
    public android.view.View mo2161x8c409d27() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d;
        android.view.Window window;
        android.view.Window window2;
        android.view.View view = null;
        if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.app.Activity mo2157x19263085 = mo2157x19263085();
            if (mo2157x19263085 == null || (window2 = mo2157x19263085.getWindow()) == null) {
                return null;
            }
            return window2.getDecorView();
        }
        if (!(mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) || (c21470xb673f8d = this.f87116e) == null) {
            return null;
        }
        if (c21470xb673f8d != null) {
            return c21470xb673f8d;
        }
        android.app.Activity mo2157x192630852 = mo2157x19263085();
        if (mo2157x192630852 != null && (window = mo2157x192630852.getWindow()) != null) {
            view = window.getDecorView();
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    @Override // ak3.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(ak3.a r3) {
        /*
            r2 = this;
            r2.f87119h = r3
            android.app.Activity r3 = r2.mo2157x19263085()
            boolean r3 = r3 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
            if (r3 == 0) goto L59
            android.app.Activity r3 = r2.mo2157x19263085()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r3, r0)
            com.tencent.mm.ui.MMActivity r3 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r3
            com.tencent.mm.ui.widget.SwipeBackLayout r3 = r3.m78735x28280f95()
            if (r3 == 0) goto L59
            ak3.d r3 = r2.f87117f
            if (r3 == 0) goto L43
            rk3.i r3 = (rk3.i) r3
            com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager r3 = r3.f478055b
            if (r3 == 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            if (r3 == 0) goto L43
            r3.booleanValue()
            ak3.d r3 = r2.f87117f
            if (r3 == 0) goto L43
            al5.g3 r1 = r2.f87118g
            rk3.i r3 = (rk3.i) r3
            com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager r3 = r3.f478055b
            if (r3 == 0) goto L40
            r3.m78875x372c76d3(r1)
        L40:
            jz5.f0 r3 = jz5.f0.f384359a
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 != 0) goto L6a
            android.app.Activity r3 = r2.mo2157x19263085()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r3, r0)
            com.tencent.mm.ui.MMActivity r3 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) r3
            com.tencent.mm.ui.widget.SwipeBackLayout r3 = r3.m78735x28280f95()
            al5.g3 r0 = r2.f87118g
            r3.m81456x372c76d3(r0)
            goto L6a
        L59:
            android.app.Activity r3 = r2.mo2157x19263085()
            boolean r3 = r3 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f
            if (r3 == 0) goto L6a
            com.tencent.mm.ui.base.CustomViewPager r3 = r2.f87116e
            if (r3 == 0) goto L6a
            al5.g3 r0 = r2.f87118g
            r3.m78875x372c76d3(r0)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak3.i.h(ak3.a):void");
    }

    @Override // ak3.c
    public void i(boolean z17) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d2;
        if (z17) {
            if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
                android.app.Activity mo2157x19263085 = mo2157x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x19263085).m78735x28280f95() != null) {
                    android.app.Activity mo2157x192630852 = mo2157x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x192630852, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x192630852).m78735x28280f95().m81456x372c76d3(this.f87118g);
                    return;
                }
            }
            if (!(mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) || (c21470xb673f8d2 = this.f87116e) == null || c21470xb673f8d2 == null) {
                return;
            }
            c21470xb673f8d2.m78875x372c76d3(this.f87118g);
            return;
        }
        if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.app.Activity mo2157x192630853 = mo2157x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x192630853, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x192630853).m78735x28280f95() != null) {
                android.app.Activity mo2157x192630854 = mo2157x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo2157x192630854, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x192630854).m78735x28280f95().m81456x372c76d3(null);
                return;
            }
        }
        if (!(mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) || (c21470xb673f8d = this.f87116e) == null || c21470xb673f8d == null) {
            return;
        }
        c21470xb673f8d.m78875x372c76d3(null);
    }

    @Override // ak3.c
    public void j(boolean z17, jk3.e helper) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(helper, "helper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskPageAdapter", "finish, withAnimation:%s", java.lang.Boolean.valueOf(z17));
        if (helper.a() && (c16601x7ed0e40c = ((jk3.b) helper).f381610a) != null) {
            i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.Bd((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) c17, 0, field_id, c16601x7ed0e40c.f66793x2262335f, null, 8, null);
        }
        if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            android.content.Intent mo2160x1e885992 = mo2160x1e885992();
            if (mo2160x1e885992 != null) {
                if (z17) {
                    mo2160x1e885992.putExtra("MMActivity.OverrideExitAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
                    mo2160x1e885992.putExtra("MMActivity.OverrideEnterAnimation", com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                } else {
                    mo2160x1e885992.putExtra("MMActivity.OverrideExitAnimation", 0);
                    mo2160x1e885992.putExtra("MMActivity.OverrideEnterAnimation", 0);
                }
            }
            android.app.Activity mo2157x19263085 = mo2157x19263085();
            if (mo2157x19263085 != null) {
                mo2157x19263085.finish();
            }
        }
    }

    @Override // ak3.c
    public void k(jk3.e eVar) {
        if (mo2157x19263085() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) {
            if (this.f87117f == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0 l0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class);
                android.app.Activity mo2157x19263085 = mo2157x19263085();
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) l0Var).getClass();
                this.f87117f = new rk3.i(mo2157x19263085);
            }
            ak3.d dVar = this.f87117f;
            if (dVar != null) {
                ((rk3.i) dVar).a(this, eVar);
            }
        }
    }

    @Override // ak3.c
    public void l() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        if (this.f87124p) {
            android.app.Activity mo2157x19263085 = mo2157x19263085();
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mo2157x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) mo2157x19263085 : null;
            if (abstractActivityC21394xb3d2c0cf == null || (m78735x28280f95 = abstractActivityC21394xb3d2c0cf.m78735x28280f95()) == null) {
                return;
            }
            m78735x28280f95.m81449xa390ef9a(this.f87123o);
        }
    }

    @Override // al5.m2
    public boolean m(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17) {
        if (!q()) {
            return false;
        }
        if (((i19 != 0 || i17 >= 0) && (java.lang.Math.abs(i19 - i28) >= 160 || i17 >= 0)) || i18 != 0) {
            return false;
        }
        l();
        return false;
    }

    public boolean n(int i17, android.view.ViewGroup parent, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        return false;
    }

    public final void o() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f87118g = new ak3.h(this);
        android.app.Activity mo2157x19263085 = mo2157x19263085();
        float f17 = (mo2157x19263085 == null || (resources = mo2157x19263085.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = 20 * f17;
        float B = (i65.a.B(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) / 5) - f18;
        float f19 = (100 * f17) + 0.5f;
        if (B > 0.0f) {
            f18 = B;
        }
        this.f87123o = (int) java.lang.Math.min(f19, f18);
        if (p()) {
            l();
        }
    }

    public boolean p() {
        return this instanceof pa3.r;
    }

    public boolean q() {
        return this instanceof pa3.r;
    }

    public void r(android.app.Activity activity) {
        this.f87115d = activity;
    }

    public void s(android.graphics.Rect rect, android.graphics.Bitmap bitmap) {
        this.f87120i = rect;
        this.f87121m = bitmap;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskPageAdapter", "setItemInfo");
    }

    public void t(boolean z17) {
        ak3.d dVar = this.f87117f;
        if (dVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1898x2e06d1.C16606xc6010f80 c16606xc6010f80 = ((rk3.i) dVar).f478055b;
            if (c16606xc6010f80 != null) {
                c16606xc6010f80.m78873x6e5cce43(z17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskWrapper", "canSlide:%b", java.lang.Boolean.valueOf(z17));
        }
    }

    public i(android.app.Activity activity, com.p314xaae8f345.mm.ui.p2642x2e06d1.C21470xb673f8d c21470xb673f8d) {
        r(activity);
        this.f87116e = c21470xb673f8d;
        o();
    }
}
