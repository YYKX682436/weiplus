package fk3;

/* loaded from: classes8.dex */
public final class o extends ek3.a {

    /* renamed from: a, reason: collision with root package name */
    public ak3.c f345118a;

    /* renamed from: b, reason: collision with root package name */
    public jk3.e f345119b;

    /* renamed from: c, reason: collision with root package name */
    public ek3.d f345120c;

    /* renamed from: d, reason: collision with root package name */
    public ek3.e f345121d;

    /* renamed from: e, reason: collision with root package name */
    public kk3.d f345122e;

    /* renamed from: f, reason: collision with root package name */
    public long f345123f = -1;

    /* renamed from: g, reason: collision with root package name */
    public boolean f345124g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f345125h;

    @Override // ek3.a
    public void a(int i17) {
        b(i17, true, true);
    }

    public final void b(int i17, boolean z17, boolean z18) {
        if (!c().c()) {
            kk3.d dVar = this.f345122e;
            if (dVar == null || dVar == null) {
                return;
            }
            dVar.e(i17);
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
            kk3.d dVar2 = this.f345122e;
            if (dVar2 == null || dVar2 == null) {
                return;
            }
            dVar2.e(i17);
            return;
        }
        c().f(new fk3.g(this));
        if (z18) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new fk3.h(this, i17, z17));
            return;
        }
        ek3.d dVar3 = this.f345120c;
        if ((dVar3 != null ? dVar3.f335140v : null) != null) {
            d(i17, z17, this.f345122e);
            return;
        }
        kk3.d dVar4 = this.f345122e;
        if (dVar4 == null || dVar4 == null) {
            return;
        }
        dVar4.e(i17);
    }

    public final ak3.c c() {
        ak3.c cVar = this.f345118a;
        if (cVar != null) {
            return cVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageAdapter");
        throw null;
    }

    public final void d(int i17, boolean z17, kk3.d dVar) {
        ek3.d dVar2;
        android.graphics.Rect rect;
        float width;
        float f17;
        ek3.e eVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "initMaskView, way:%d", java.lang.Integer.valueOf(i17));
        if (c().mo2161x8c409d27() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page mask view is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        if (c().mo2159xc2a54588() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page content view is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        if (c().a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page root view is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        if (this.f345125h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "isExitAnimating now!");
            return;
        }
        c();
        android.graphics.Bitmap mo2158x12501425 = c().mo2158x12501425();
        if (mo2158x12501425 == null || mo2158x12501425.isRecycled() || mo2158x12501425.getWidth() == 0 || mo2158x12501425.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "doMaskAnimation, page get bitmap is null");
            if (dVar != null) {
                dVar.e(i17);
                return;
            }
            return;
        }
        ek3.e eVar2 = this.f345121d;
        if (eVar2 == null || eVar2.getParent() == null) {
            ek3.e eVar3 = new ek3.e(c().mo2157x19263085(), mo2158x12501425);
            this.f345121d = eVar3;
            eVar3.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.view.ViewGroup a17 = c().a();
            if (a17 != null) {
                a17.setBackgroundColor(0);
            }
            if (a17 != null) {
                a17.addView(this.f345121d, a17.getChildCount());
            }
        }
        jk3.e eVar4 = this.f345119b;
        java.lang.String q17 = eVar4 != null ? ((jk3.b) eVar4).q(i17) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17)) {
            if (i17 == 4) {
                jk3.e eVar5 = this.f345119b;
                if (eVar5 != null) {
                    q17 = eVar5.e();
                }
                q17 = null;
            } else {
                jk3.e eVar6 = this.f345119b;
                if (eVar6 != null) {
                    q17 = eVar6.mo141063xa86cd69f();
                }
                q17 = null;
            }
        }
        if (q17 != null) {
            try {
                java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(q17, 0).toArray(new java.lang.String[0]);
                if (strArr.length == 4 && (dVar2 = this.f345120c) != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(strArr[0]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "valueOf(...)");
                    int intValue = valueOf.intValue();
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(strArr[1]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf2, "valueOf(...)");
                    int intValue2 = valueOf2.intValue();
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(strArr[2]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf3, "valueOf(...)");
                    int intValue3 = valueOf3.intValue();
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(strArr[3]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf4, "valueOf(...)");
                    dVar2.f335140v = new android.graphics.Rect(new android.graphics.Rect(intValue, intValue2, intValue3, valueOf4.intValue()));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperMS", "refreshPosition, get pos failed, %s", e17.getMessage());
            }
        }
        android.view.View mo2159xc2a54588 = c().mo2159xc2a54588();
        if (mo2159xc2a54588 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo2159xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS", "initMaskView", "(IZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo2159xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo2159xc2a54588, "com/tencent/mm/plugin/multitask/animation/swipeback/multiscene/MultiTaskSwipeBackAnimWrapperMS", "initMaskView", "(IZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17) {
            if (dVar != null) {
                ek3.e eVar7 = this.f345121d;
                dVar.d(eVar7 != null ? eVar7.m127794x8c4fcf52() : null, true, i17);
                return;
            }
            return;
        }
        jk3.e eVar8 = this.f345119b;
        boolean f18 = eVar8 != null ? eVar8.f() : false;
        int i18 = f18 ? 90 : 0;
        this.f345125h = true;
        int width2 = (int) (mo2158x12501425.getWidth() * 1.0f);
        int height = (int) (mo2158x12501425.getHeight() * 1.0f);
        android.graphics.Rect rect2 = new android.graphics.Rect(0, 0, width2, height);
        ek3.d dVar3 = this.f345120c;
        if (dVar3 == null || (rect = dVar3.f335140v) == null) {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect3 = rect;
        int width3 = rect3.left + (rect3.width() / 2);
        int height2 = rect3.top + (rect3.height() / 2);
        if (f18) {
            width = rect3.height();
            f17 = height;
        } else {
            width = rect3.width();
            f17 = width2;
        }
        float f19 = width / f17;
        rect3.width();
        float width4 = (width3 - (rect2.left + (rect2.width() / 2))) * f19;
        float height3 = (height2 - (rect2.top + (rect2.height() / 2))) * f19;
        if (f18 && (eVar = this.f345121d) != null) {
            eVar.m127796x9a37e4be(android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT);
        }
        oa5.b.b(this.f345121d).m(width4).n(height3).e(f19).f(f19).k(new fk3.j(f18, width2, height, f19, rect3, this, width3, height2, i18)).h(new android.view.animation.AccelerateInterpolator()).p(new fk3.k(this, dVar, mo2158x12501425, i17)).o(new fk3.m(this, dVar, mo2158x12501425, i17)).g(250L).l();
    }

    public void e(ak3.c pageAdapter, jk3.e multiTaskHelper, kk3.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(multiTaskHelper, "multiTaskHelper");
        this.f345118a = pageAdapter;
        this.f345119b = multiTaskHelper;
        this.f345122e = dVar;
        c().h(new fk3.n(this, multiTaskHelper));
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(c().mo2157x19263085(), com.p314xaae8f345.mm.R.C30854x2dc211.f559355cg);
        android.view.ViewGroup a17 = c().a();
        if (a17 != null) {
            pm0.v.X(new fk3.i(this, a17, loadInterpolator));
        }
    }
}
