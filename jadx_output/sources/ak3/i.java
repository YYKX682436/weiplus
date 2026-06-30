package ak3;

/* loaded from: classes8.dex */
public class i implements ak3.c, al5.m2 {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f5582d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.base.CustomViewPager f5583e;

    /* renamed from: f, reason: collision with root package name */
    public ak3.d f5584f;

    /* renamed from: g, reason: collision with root package name */
    public al5.g3 f5585g;

    /* renamed from: h, reason: collision with root package name */
    public ak3.a f5586h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.Rect f5587i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.Bitmap f5588m;

    /* renamed from: n, reason: collision with root package name */
    public int f5589n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f5590o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5591p;

    static {
        new ak3.e(null);
    }

    public i(android.app.Activity activity) {
        r(activity);
        o();
    }

    @Override // ak3.c
    public android.view.ViewGroup a() {
        android.app.Activity activity = getActivity();
        if (activity == null) {
            return null;
        }
        android.view.View decorView = activity.getWindow().getDecorView();
        kotlin.jvm.internal.o.e(decorView, "null cannot be cast to non-null type android.view.ViewGroup");
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
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskPageAdapter", "convertToTranslucent");
        db5.f.c(getActivity(), new ak3.g(new java.util.concurrent.atomic.AtomicInteger(0), this, bVar));
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskPageAdapter", "multiTask page convertActivityToTranslucent");
    }

    @Override // ak3.c
    public boolean g() {
        ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
        ((com.tencent.mm.plugin.multitask.i1) i95.n0.c(com.tencent.mm.plugin.multitask.i1.class)).getClass();
        if ((j62.e.g().c(new com.tencent.mm.repairer.config.multitask.RepairerConfigSwipeToMultiTask()) == 1) && (getActivity() instanceof com.tencent.mm.ui.MMActivity)) {
            android.app.Activity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // ak3.c
    public android.app.Activity getActivity() {
        return this.f5582d;
    }

    @Override // ak3.c
    public android.graphics.Bitmap getBitmap() {
        if (al3.a.f5845a.a(this.f5589n)) {
            return null;
        }
        try {
            boolean z17 = getActivity() instanceof com.tencent.mm.ui.MMActivity;
            if (getMaskView() != null) {
                return uj5.g.d(getMaskView(), (int) (r0.getWidth() / 1.0f), (int) (r0.getHeight() / 1.0f), true, android.graphics.Bitmap.Config.ARGB_8888);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MultiTaskPageAdapter", "get bitmap failed", th6);
        }
        return null;
    }

    @Override // ak3.c
    public android.view.View getContentView() {
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            android.app.Activity activity = getActivity();
            kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout() != null) {
                android.app.Activity activity2 = getActivity();
                kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                return ((com.tencent.mm.ui.MMActivity) activity2).getSwipeBackLayout();
            }
        }
        if (getActivity() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            android.app.Activity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
            if (((com.tencent.mm.ui.MMFragmentActivity) activity3).getSwipeBackLayout() != null) {
                android.app.Activity activity4 = getActivity();
                kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                return ((com.tencent.mm.ui.MMFragmentActivity) activity4).getSwipeBackLayout();
            }
        }
        return null;
    }

    @Override // ak3.c
    public android.content.Intent getIntent() {
        android.app.Activity activity = getActivity();
        if (activity != null) {
            return activity.getIntent();
        }
        return null;
    }

    @Override // ak3.c
    public android.view.View getMaskView() {
        com.tencent.mm.ui.base.CustomViewPager customViewPager;
        android.view.Window window;
        android.view.Window window2;
        android.view.View view = null;
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            android.app.Activity activity = getActivity();
            if (activity == null || (window2 = activity.getWindow()) == null) {
                return null;
            }
            return window2.getDecorView();
        }
        if (!(getActivity() instanceof com.tencent.mm.ui.MMFragmentActivity) || (customViewPager = this.f5583e) == null) {
            return null;
        }
        if (customViewPager != null) {
            return customViewPager;
        }
        android.app.Activity activity2 = getActivity();
        if (activity2 != null && (window = activity2.getWindow()) != null) {
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
            r2.f5586h = r3
            android.app.Activity r3 = r2.getActivity()
            boolean r3 = r3 instanceof com.tencent.mm.ui.MMActivity
            if (r3 == 0) goto L59
            android.app.Activity r3 = r2.getActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            kotlin.jvm.internal.o.e(r3, r0)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.mm.ui.MMActivity) r3
            com.tencent.mm.ui.widget.SwipeBackLayout r3 = r3.getSwipeBackLayout()
            if (r3 == 0) goto L59
            ak3.d r3 = r2.f5584f
            if (r3 == 0) goto L43
            rk3.i r3 = (rk3.i) r3
            com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager r3 = r3.f396522b
            if (r3 == 0) goto L27
            r3 = 1
            goto L28
        L27:
            r3 = 0
        L28:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            if (r3 == 0) goto L43
            r3.booleanValue()
            ak3.d r3 = r2.f5584f
            if (r3 == 0) goto L43
            al5.g3 r1 = r2.f5585g
            rk3.i r3 = (rk3.i) r3
            com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager r3 = r3.f396522b
            if (r3 == 0) goto L40
            r3.setSwipeBackListener(r1)
        L40:
            jz5.f0 r3 = jz5.f0.f302826a
            goto L44
        L43:
            r3 = 0
        L44:
            if (r3 != 0) goto L6a
            android.app.Activity r3 = r2.getActivity()
            kotlin.jvm.internal.o.e(r3, r0)
            com.tencent.mm.ui.MMActivity r3 = (com.tencent.mm.ui.MMActivity) r3
            com.tencent.mm.ui.widget.SwipeBackLayout r3 = r3.getSwipeBackLayout()
            al5.g3 r0 = r2.f5585g
            r3.setSwipeBackListener(r0)
            goto L6a
        L59:
            android.app.Activity r3 = r2.getActivity()
            boolean r3 = r3 instanceof com.tencent.mm.ui.MMFragmentActivity
            if (r3 == 0) goto L6a
            com.tencent.mm.ui.base.CustomViewPager r3 = r2.f5583e
            if (r3 == 0) goto L6a
            al5.g3 r0 = r2.f5585g
            r3.setSwipeBackListener(r0)
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ak3.i.h(ak3.a):void");
    }

    @Override // ak3.c
    public void i(boolean z17) {
        com.tencent.mm.ui.base.CustomViewPager customViewPager;
        com.tencent.mm.ui.base.CustomViewPager customViewPager2;
        if (z17) {
            if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
                android.app.Activity activity = getActivity();
                kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                if (((com.tencent.mm.ui.MMActivity) activity).getSwipeBackLayout() != null) {
                    android.app.Activity activity2 = getActivity();
                    kotlin.jvm.internal.o.e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    ((com.tencent.mm.ui.MMActivity) activity2).getSwipeBackLayout().setSwipeBackListener(this.f5585g);
                    return;
                }
            }
            if (!(getActivity() instanceof com.tencent.mm.ui.MMFragmentActivity) || (customViewPager2 = this.f5583e) == null || customViewPager2 == null) {
                return;
            }
            customViewPager2.setSwipeBackListener(this.f5585g);
            return;
        }
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            android.app.Activity activity3 = getActivity();
            kotlin.jvm.internal.o.e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            if (((com.tencent.mm.ui.MMActivity) activity3).getSwipeBackLayout() != null) {
                android.app.Activity activity4 = getActivity();
                kotlin.jvm.internal.o.e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                ((com.tencent.mm.ui.MMActivity) activity4).getSwipeBackLayout().setSwipeBackListener(null);
                return;
            }
        }
        if (!(getActivity() instanceof com.tencent.mm.ui.MMFragmentActivity) || (customViewPager = this.f5583e) == null || customViewPager == null) {
            return;
        }
        customViewPager.setSwipeBackListener(null);
    }

    @Override // ak3.c
    public void j(boolean z17, jk3.e helper) {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo;
        kotlin.jvm.internal.o.g(helper, "helper");
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskPageAdapter", "finish, withAnimation:%s", java.lang.Boolean.valueOf(z17));
        if (helper.a() && (multiTaskInfo = ((jk3.b) helper).f300077a) != null) {
            i95.m c17 = i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            java.lang.String field_id = multiTaskInfo.field_id;
            kotlin.jvm.internal.o.f(field_id, "field_id");
            com.tencent.mm.plugin.multitask.l0.Bd((com.tencent.mm.plugin.multitask.l0) c17, 0, field_id, multiTaskInfo.field_type, null, 8, null);
        }
        if (getActivity() instanceof com.tencent.mm.ui.MMActivity) {
            android.content.Intent intent = getIntent();
            if (intent != null) {
                if (z17) {
                    intent.putExtra("MMActivity.OverrideExitAnimation", com.tencent.mm.R.anim.f477848d6);
                    intent.putExtra("MMActivity.OverrideEnterAnimation", com.tencent.mm.R.anim.f477728p);
                } else {
                    intent.putExtra("MMActivity.OverrideExitAnimation", 0);
                    intent.putExtra("MMActivity.OverrideEnterAnimation", 0);
                }
            }
            android.app.Activity activity = getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    @Override // ak3.c
    public void k(jk3.e eVar) {
        if (getActivity() instanceof com.tencent.mm.ui.MMFragmentActivity) {
            if (this.f5584f == null) {
                com.tencent.mm.plugin.multitask.l0 l0Var = (com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class);
                android.app.Activity activity = getActivity();
                ((com.tencent.mm.plugin.multitask.p1) l0Var).getClass();
                this.f5584f = new rk3.i(activity);
            }
            ak3.d dVar = this.f5584f;
            if (dVar != null) {
                ((rk3.i) dVar).a(this, eVar);
            }
        }
    }

    @Override // ak3.c
    public void l() {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        if (this.f5591p) {
            android.app.Activity activity = getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity == null || (swipeBackLayout = mMActivity.getSwipeBackLayout()) == null) {
                return;
            }
            swipeBackLayout.setEdgeSizeAndInitEdgeTouched(this.f5590o);
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
        kotlin.jvm.internal.o.g(parent, "parent");
        return false;
    }

    public final void o() {
        android.content.res.Resources resources;
        android.util.DisplayMetrics displayMetrics;
        this.f5585g = new ak3.h(this);
        android.app.Activity activity = getActivity();
        float f17 = (activity == null || (resources = activity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null) ? 0.0f : displayMetrics.density;
        float f18 = 20 * f17;
        float B = (i65.a.B(com.tencent.mm.sdk.platformtools.x2.f193071a) / 5) - f18;
        float f19 = (100 * f17) + 0.5f;
        if (B > 0.0f) {
            f18 = B;
        }
        this.f5590o = (int) java.lang.Math.min(f19, f18);
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
        this.f5582d = activity;
    }

    public void s(android.graphics.Rect rect, android.graphics.Bitmap bitmap) {
        this.f5587i = rect;
        this.f5588m = bitmap;
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskPageAdapter", "setItemInfo");
    }

    public void t(boolean z17) {
        ak3.d dVar = this.f5584f;
        if (dVar != null) {
            com.tencent.mm.plugin.multitask.ui.base.MultiTaskViewPager multiTaskViewPager = ((rk3.i) dVar).f396522b;
            if (multiTaskViewPager != null) {
                multiTaskViewPager.setCanSlide(z17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.MultiTaskWrapper", "canSlide:%b", java.lang.Boolean.valueOf(z17));
        }
    }

    public i(android.app.Activity activity, com.tencent.mm.ui.base.CustomViewPager customViewPager) {
        r(activity);
        this.f5583e = customViewPager;
        o();
    }
}
