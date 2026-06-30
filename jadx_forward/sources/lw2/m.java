package lw2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f f403109a;

    /* renamed from: b, reason: collision with root package name */
    public lw2.o f403110b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f403111c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f403112d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f403113e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 f403114f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f403115g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f403116h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f403117i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f403118j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f403119k;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f videoLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoLayout, "videoLayout");
        this.f403109a = videoLayout;
        this.f403112d = jz5.h.b(new lw2.a(this));
        this.f403113e = jz5.h.b(new lw2.k(this));
        this.f403115g = jz5.h.b(new lw2.c(this));
        this.f403116h = jz5.h.b(new lw2.l(this));
        this.f403117i = jz5.h.b(new lw2.d(this));
    }

    public final void a(boolean z17, boolean z18) {
        android.view.View findViewById;
        vx2.k m61207x8489ceb8;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleCleanUIC", "cleanScreen " + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e17 = e();
        android.view.View findViewById2 = e17 != null ? e17.findViewById(com.p314xaae8f345.mm.R.id.eg6) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View b17 = b();
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e18 = e();
        android.view.View findViewById3 = e18 != null ? e18.findViewById(com.p314xaae8f345.mm.R.id.h6o) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).f215591e).mo141623x754a37bb();
            if (viewGroup != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(8);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(viewGroup, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup O6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).O6();
            if (O6 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(O6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e19 = e();
        if (e19 != null && (findViewById = e19.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e27 = e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9 = e27 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9) e27.findViewById(com.p314xaae8f345.mm.R.id.f566429qk3) : null;
            if (c15175x44dff2e9 != null && (m61207x8489ceb8 = c15175x44dff2e9.m61207x8489ceb8()) != null) {
                vx2.k.e(m61207x8489ceb8, 0L, false, 3, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = this.f403109a;
            if (c15196x85976f5f.F()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e28 = e();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = e28 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) e28.findViewById(com.p314xaae8f345.mm.R.id.ghd) : null;
                if (c15175x44dff2e9 != null) {
                    c15175x44dff2e9.m61218xec6470b(new lw2.b(this));
                    if (!z18) {
                        android.content.Context context = c15196x85976f5f.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        pf5.z zVar2 = pf5.z.f435481a;
                        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        rc2.f fVar = (rc2.f) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(rc2.f.class);
                        if (fVar != null) {
                            fVar.Y6(c15178x4303ff90, 8);
                        }
                        c15175x44dff2e9.setVisibility(0);
                    } else if (c15178x4303ff90 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90.v(c15178x4303ff90, false, 0L, false, 6, null);
                    }
                }
            } else {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e29 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff902 = e29 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) e29.findViewById(com.p314xaae8f345.mm.R.id.ghd) : null;
        if (c15178x4303ff902 != null) {
            c15178x4303ff902.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e37 = e();
        android.view.View findViewById4 = e37 != null ? e37.findViewById(com.p314xaae8f345.mm.R.id.g1y) : null;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e38 = e();
        android.view.View findViewById5 = e38 != null ? e38.findViewById(com.p314xaae8f345.mm.R.id.kp7) : null;
        if (findViewById5 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e39 = e();
        android.view.View findViewById6 = e39 != null ? e39.findViewById(com.p314xaae8f345.mm.R.id.hih) : null;
        if (findViewById6 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e47 = e();
        android.view.View findViewById7 = e47 != null ? e47.findViewById(com.p314xaae8f345.mm.R.id.egi) : null;
        if (findViewById7 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById7, arrayList10.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e48 = e();
            android.view.View findViewById8 = e48 != null ? e48.findViewById(com.p314xaae8f345.mm.R.id.edq) : null;
            if (findViewById8 == null) {
                return;
            }
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
            arrayList11.add(8);
            java.util.Collections.reverse(arrayList11);
            android.view.View view = findViewById8;
            yj0.a.d(view, arrayList11.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "cleanScreen", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final android.view.View b() {
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl blVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.class);
        android.view.View mo144222x4ff8c0f0 = blVar.f215425e != null ? blVar.mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.e5c) : null;
        return mo144222x4ff8c0f0 != null ? mo144222x4ff8c0f0 : c().findViewById(com.p314xaae8f345.mm.R.id.ggn);
    }

    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 c() {
        return (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) ((jz5.n) this.f403112d).mo141623x754a37bb();
    }

    public final r45.qt2 d() {
        return (r45.qt2) ((jz5.n) this.f403115g).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952) ((jz5.n) this.f403113e).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 f() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) ((jz5.n) this.f403116h).mo141623x754a37bb();
    }

    public final void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleCleanUIC", "onScrollIdle");
        this.f403118j = true;
        lw2.o oVar = this.f403110b;
        if (oVar != null) {
            oVar.f();
        }
        lw2.o oVar2 = this.f403110b;
        if (oVar2 != null) {
            oVar2.f403129f = this.f403118j && this.f403119k;
        }
    }

    public final void h(int i17, boolean z17) {
        int i18;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95;
        this.f403111c = false;
        lw2.o oVar = this.f403110b;
        long currentTimeMillis = oVar != null ? oVar.R : java.lang.System.currentTimeMillis();
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        lw2.o oVar2 = this.f403110b;
        long elapsedRealtime2 = elapsedRealtime - (oVar2 != null ? oVar2.S : android.os.SystemClock.elapsedRealtime());
        android.content.Context context = this.f403109a.getContext();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context : null;
        if (abstractActivityC15087xee12defa != null && (m78735x28280f95 = abstractActivityC15087xee12defa.m78735x28280f95()) != null) {
            m78735x28280f95.m81450x8e764904(true);
        }
        lw2.o oVar3 = this.f403110b;
        if (oVar3 != null) {
            oVar3.S = 0L;
            oVar3.R = 0L;
            oVar3.f403128e = false;
            oVar3.E = false;
            oVar3.D = false;
            oVar3.f403146w = 0.0f;
            oVar3.f403147x = 0.0f;
            oVar3.f403148y = 0.0f;
            oVar3.f403149z = 0.0f;
            oVar3.B = 1.0f;
            oVar3.f403144u = 0.0f;
            oVar3.f403143t = new android.graphics.PointF();
            oVar3.f403140q = new android.graphics.PointF();
            oVar3.f403141r = 0;
            oVar3.f403142s = new android.graphics.PointF();
            oVar3.b();
        }
        android.view.View view = (android.view.View) ((jz5.n) this.f403117i).mo141623x754a37bb();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            i18 = 8;
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomToInitState", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "onZoomToInitState", "(IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setOnClickListener(lw2.j.f403106d);
        } else {
            i18 = 8;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e17 = e();
            if (e17 != null) {
                hc2.f1.x(e17);
            }
            float f17 = (float) elapsedRealtime2;
            java.lang.String valueOf = java.lang.String.valueOf(currentTimeMillis);
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            jz5.l[] lVarArr = new jz5.l[i18];
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88 = this.f403114f;
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c14989xf862ae88 != null ? c14989xf862ae88.getFeedId() : 0L));
            r45.qt2 d17 = d();
            lVarArr[1] = new jz5.l("finder_context_id", d17 != null ? d17.m75945x2fec8307(1) : null);
            r45.qt2 d18 = d();
            lVarArr[2] = new jz5.l("finder_tab_context_id", d18 != null ? d18.m75945x2fec8307(2) : null);
            r45.qt2 d19 = d();
            lVarArr[3] = new jz5.l("comment_scene", d19 != null ? java.lang.Integer.valueOf(d19.m75939xb282bd08(5)) : null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882 = this.f403114f;
            if (c14989xf862ae882 == null || (str = c14989xf862ae882.getSessionBuffer()) == null) {
                str = "";
            }
            lVarArr[4] = new jz5.l("session_buffer", str);
            lVarArr[5] = new jz5.l("finger_expand_duration_ms", java.lang.Float.valueOf(f17));
            lVarArr[6] = new jz5.l("finger_expand_exit_type", java.lang.Integer.valueOf(i17));
            lVarArr[7] = new jz5.l("finder_2finger_sid", valueOf);
            ((cy1.a) rVar).yj("finder_2finger_expand_exit", null, kz5.c1.k(lVarArr), 1, true);
        }
    }

    public final void i() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9 c15175x44dff2e9;
        android.view.View findViewById;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoScaleCleanUIC", "resetScreen");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e17 = e();
        android.view.View findViewById2 = e17 != null ? e17.findViewById(com.p314xaae8f345.mm.R.id.eg6) : null;
        if (findViewById2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View b17 = b();
        if (b17 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e18 = e();
        android.view.View findViewById3 = e18 != null ? e18.findViewById(com.p314xaae8f345.mm.R.id.h6o) : null;
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (c() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) ((jz5.n) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).f215591e).mo141623x754a37bb();
            if (viewGroup != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(viewGroup, arrayList4.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.ViewGroup O6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) zVar.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).O6();
            if (O6 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(O6, arrayList5.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                O6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(O6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e19 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90 c15178x4303ff90 = e19 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15178x4303ff90) e19.findViewById(com.p314xaae8f345.mm.R.id.ghd) : null;
        if (c15178x4303ff90 != null) {
            c15178x4303ff90.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e27 = e();
        if (e27 != null && (findViewById = e27.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3)) != null) {
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById, arrayList6.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e28 = e();
        android.view.View findViewById4 = e28 != null ? e28.findViewById(com.p314xaae8f345.mm.R.id.g1y) : null;
        if (findViewById4 != null) {
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f554818a;
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(findViewById4, arrayList7.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById4.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e29 = e();
        android.view.View findViewById5 = e29 != null ? e29.findViewById(com.p314xaae8f345.mm.R.id.kp7) : null;
        if (findViewById5 != null) {
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal8 = zj0.c.f554818a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(findViewById5, arrayList8.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById5.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(findViewById5, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e37 = e();
        android.view.View findViewById6 = e37 != null ? e37.findViewById(com.p314xaae8f345.mm.R.id.hih) : null;
        if (findViewById6 != null) {
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal9 = zj0.c.f554818a;
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(findViewById6, arrayList9.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById6.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(findViewById6, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e38 = e();
        android.view.View findViewById7 = e38 != null ? e38.findViewById(com.p314xaae8f345.mm.R.id.egi) : null;
        if (findViewById7 != null) {
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal10 = zj0.c.f554818a;
            arrayList10.add(0);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(findViewById7, arrayList10.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById7.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(findViewById7, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e39 = e();
        android.view.View findViewById8 = e39 != null ? e39.findViewById(com.p314xaae8f345.mm.R.id.edq) : null;
        if (findViewById8 != null) {
            java.util.ArrayList arrayList11 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal11 = zj0.c.f554818a;
            arrayList11.add(0);
            java.util.Collections.reverse(arrayList11);
            yj0.a.d(findViewById8, arrayList11.toArray(), "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById8.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
            yj0.a.f(findViewById8, "com/tencent/mm/plugin/finder/video/scaleclean/FinderVideoScaleCleanHelper", "resetScreen", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15285xe7032952 e47 = e();
        if (e47 == null || (c15175x44dff2e9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15175x44dff2e9) e47.findViewById(com.p314xaae8f345.mm.R.id.f566429qk3)) == null) {
            return;
        }
        android.content.Context context = c15175x44dff2e9.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rc2.f fVar = (rc2.f) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(rc2.f.class);
        if (fVar != null) {
            fVar.Y6(c15178x4303ff90, 0);
        }
        c15175x44dff2e9.setVisibility(0);
        c15175x44dff2e9.m61218xec6470b(null);
    }
}
