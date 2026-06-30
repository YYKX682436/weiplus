package tl2;

/* loaded from: classes8.dex */
public final class u implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o6 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f501807d;

    /* renamed from: e, reason: collision with root package name */
    public final int f501808e;

    /* renamed from: f, reason: collision with root package name */
    public final int f501809f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f501810g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f501811h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.ref.WeakReference f501812i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f501813m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f501814n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f501815o;

    /* renamed from: p, reason: collision with root package name */
    public l81.b1 f501816p;

    /* renamed from: q, reason: collision with root package name */
    public final tl2.g f501817q;

    public u(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f501807d = activity;
        this.f501808e = com.p314xaae8f345.mm.ui.bk.p(activity);
        this.f501809f = com.p314xaae8f345.mm.ui.bl.c(activity);
        this.f501810g = new android.graphics.Rect();
        this.f501811h = new android.graphics.Rect();
        this.f501813m = jz5.h.b(tl2.h.f501780d);
        this.f501814n = jz5.h.b(tl2.s.f501805d);
        this.f501815o = jz5.h.b(new tl2.t(this));
        this.f501817q = new tl2.g(this);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        q(k(), this.f501810g, this.f501811h, 1.0f - f17);
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictVideoTransition", "[onDrawerDetach]");
        p();
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        l81.b1 b1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictVideoTransition", "[onDrawerOpen] isOpen=" + z17 + " isBegin=" + z18);
        if (!z18 || !z17) {
            if (!z18 && !z17) {
                p();
                return;
            } else {
                if (!z18 || z17) {
                    return;
                }
                g(false);
                return;
            }
        }
        g(true);
        p();
        android.graphics.Rect rect = this.f501811h;
        if (!rect.isEmpty() || (b1Var = this.f501816p) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1 halfScreenConfig = b1Var.G;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(halfScreenConfig, "halfScreenConfig");
        android.app.Activity activity = this.f501807d;
        int i18 = com.p314xaae8f345.mm.ui.bl.b(activity).y;
        int h17 = h();
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) ((jz5.n) this.f501813m).mo141623x754a37bb();
        android.graphics.Rect rect2 = this.f501810g;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getGlobalVisibleRect(rect2);
        }
        boolean n17 = n();
        int i19 = this.f501808e;
        if (n17) {
            rect.set(i19, 0, ((i18 - halfScreenConfig.f158907x) - i19) + i19, h17);
        } else {
            rect.set(0, i19, h17, ((i18 - i19) - halfScreenConfig.f158890d) + i19);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictVideoTransition", "[calculateViewRect] wh=" + h() + ':' + com.p314xaae8f345.mm.ui.bl.b(activity).y + " targetRect=" + rect + " sourceRect=" + rect2);
    }

    public final void g(boolean z17) {
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator withEndAction;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveRestrictVideoTransition", "[clearScreen] isClean=" + z17 + ' ');
        java.util.List<qo0.a> list = (java.util.List) ((jz5.n) this.f501814n).mo141623x754a37bb();
        if (list != null) {
            for (qo0.a aVar : list) {
                int w07 = aVar.w0();
                android.view.ViewGroup viewGroup = aVar.f446856d;
                if (w07 == 0) {
                    android.view.ViewPropertyAnimator animate = viewGroup.animate();
                    if (animate != null) {
                        android.view.ViewPropertyAnimator alpha = animate.alpha(z17 ? 0.0f : 1.0f);
                        if (alpha != null && (duration = alpha.setDuration(200L)) != null && (withEndAction = duration.withEndAction(new tl2.f(z17, aVar))) != null) {
                            withEndAction.start();
                        }
                    }
                } else if (z17) {
                    viewGroup.setTranslationX(Float.MAX_VALUE);
                } else {
                    viewGroup.setTranslationX(0.0f);
                }
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_SCREEN_CLEAR", z17);
        dk2.ef efVar = dk2.ef.f314905a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null) {
            k0Var.mo46557x60d69242(qo0.b.Z2, bundle);
        }
    }

    public final int h() {
        return this.f501807d.getResources().getDisplayMetrics().widthPixels;
    }

    public final android.view.View k() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f501815o).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final void l(yz5.a aVar) {
        android.app.Activity context = this.f501807d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        pl2.x xVar = (pl2.x) a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (!((pl2.x) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(pl2.x.class)).f438216f) {
            aVar.mo152xb9724478();
            return;
        }
        pl2.s sVar = xVar.f438217g;
        if (sVar != null) {
            sVar.d(0L, new tl2.r(this, aVar));
        }
    }

    public final boolean n() {
        return this.f501807d.getResources().getConfiguration().orientation == 2;
    }

    public final android.os.Bundle o(java.lang.String str) {
        java.util.List list;
        java.util.List list2;
        android.os.Bundle bundle = new android.os.Bundle();
        if (!(str == null || str.length() == 0)) {
            java.util.List g17 = new r26.t("&").g(str, 0);
            boolean isEmpty = g17.isEmpty();
            kz5.p0 p0Var = kz5.p0.f395529d;
            if (!isEmpty) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        list = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = p0Var;
            for (java.lang.String str2 : (java.lang.String[]) list.toArray(new java.lang.String[0])) {
                java.util.List g18 = new r26.t("=").g(str2, 0);
                if (!g18.isEmpty()) {
                    java.util.ListIterator listIterator2 = g18.listIterator(g18.size());
                    while (listIterator2.hasPrevious()) {
                        if (!(((java.lang.String) listIterator2.previous()).length() == 0)) {
                            list2 = kz5.n0.K0(g18, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list2 = p0Var;
                java.lang.String[] strArr = (java.lang.String[]) list2.toArray(new java.lang.String[0]);
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    if (strArr.length == 2) {
                        bundle.putString(java.net.URLDecoder.decode(strArr[0], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.net.URLDecoder.decode(strArr[1], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                    } else if (strArr.length == 1) {
                        bundle.putString(java.net.URLDecoder.decode(strArr[0], com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), "");
                    }
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
            }
        }
        return bundle;
    }

    public final void p() {
        k().setTranslationX(0.0f);
        k().setTranslationY(0.0f);
        k().setScaleX(1.0f);
        k().setScaleY(1.0f);
    }

    public final void q(android.view.View view, android.graphics.Rect rect, android.graphics.Rect rect2, float f17) {
        if (view == null) {
            return;
        }
        if (rect.bottom > rect2.bottom || n()) {
            float centerX = (rect2.centerX() - rect.centerX()) * f17;
            float centerY = ((rect2.centerY() - rect.centerY()) + ((n() || rect2.height() <= rect.height()) ? 0 : (rect2.height() - rect.height()) / 2)) * f17;
            float min = java.lang.Math.min((rect.width() + ((rect2.width() - rect.width()) * f17)) / rect.width(), (rect.height() + ((rect2.height() - rect.height()) * f17)) / rect.height());
            if (!java.lang.Float.isNaN(min)) {
                view.setScaleX(min);
                view.setScaleY(min);
            }
            view.setTranslationX(centerX);
            view.setTranslationY(centerY);
        }
    }
}
