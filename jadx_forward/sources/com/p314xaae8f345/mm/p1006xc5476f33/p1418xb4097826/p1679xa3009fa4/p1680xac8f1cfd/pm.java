package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class pm implements com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f217093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d f217094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15357x7481f361 f217095f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f217096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f217097h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float f217098i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f217099m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f217100n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f217101o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f217102p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ float f217103q;

    public pm(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15357x7481f361 c15357x7481f361, float f17, float f18, float f19, float f27, int i17, float f28, float f29, float f37) {
        this.f217093d = s0Var;
        this.f217094e = c15460x89aca30d;
        this.f217095f = c15357x7481f361;
        this.f217096g = f17;
        this.f217097h = f18;
        this.f217098i = f19;
        this.f217099m = f27;
        this.f217100n = i17;
        this.f217101o = f28;
        this.f217102p = f29;
        this.f217103q = f37;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void a(float f17) {
        if (java.lang.Float.isNaN(f17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerTranslation isNaN percent:" + f17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHorizontalVideoDrawerUIC", "onDrawerTranslation percent:" + f17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15357x7481f361 banner = this.f217095f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(banner, "$banner");
        float f18 = 1 - f17;
        float f19 = this.f217100n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15460x89aca30d c15460x89aca30d = this.f217094e;
        c15460x89aca30d.getClass();
        float f27 = this.f217098i;
        float f28 = f27 > 1.0f ? ((f27 - 1.0f) * f18) + 1.0f : f27 < 1.0f ? 1.0f - ((1.0f - f27) * f18) : 1.0f;
        float f29 = this.f217099m;
        float f37 = f29 > 1.0f ? ((f29 - 1.0f) * f18) + 1.0f : f29 < 1.0f ? 1.0f - ((1.0f - f29) * f18) : 1.0f;
        float f38 = this.f217102p + (f19 * f18);
        float f39 = this.f217103q + (this.f217101o * f18);
        banner.setPivotX(this.f217096g);
        banner.setPivotY(this.f217097h);
        banner.setScaleX(f28);
        banner.setScaleY(f37);
        banner.setTranslationX(f38);
        banner.setTranslationY(f39);
        if (0.0f <= f18 && f18 <= 0.6f) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c15460x89aca30d.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            float f47 = 1.0f - (f18 / 0.6f);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647.class)).h7(f47);
            in5.s0 s0Var = c15460x89aca30d.f215125i;
            if (s0Var != null) {
                float m62615x4ea7bf6 = (c15460x89aca30d.Q6().m62615x4ea7bf6() - c15460x89aca30d.Q6().getF213467f()) - c15460x89aca30d.Q6().m62637x6c20397b();
                android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.kp7);
                if (p17 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(f47));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(p17, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p17.setTranslationY(-m62615x4ea7bf6);
                }
                android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3);
                if (p18 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Float.valueOf(f47));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                    yj0.a.f(p18, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    p18.setTranslationY(-m62615x4ea7bf6);
                }
            }
        }
        if (0.6f <= f18 && f18 <= 1.0f) {
            float f48 = (f18 - 0.6f) / 0.4f;
            android.view.View R6 = c15460x89aca30d.R6();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(f48));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(R6, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            R6.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(R6, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            c15460x89aca30d.S6().setAlpha(f48);
            android.view.View view = (android.view.View) ((jz5.n) c15460x89aca30d.f215129p).mo141623x754a37bb();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Float.valueOf(f48));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHorizontalVideoDrawerUIC", "handleDrawerTranslation", "(Landroid/view/View;FFFFFFFFF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a
    public void c(boolean z17, boolean z18, int i17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) this.f217093d.p(com.p314xaae8f345.mm.R.id.ghd);
        if (c15178x4303ff90 != null) {
            c15178x4303ff90.t("horizontalVideoAnimClose");
        }
        this.f217094e.W6();
    }
}
