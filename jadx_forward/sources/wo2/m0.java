package wo2;

/* loaded from: classes2.dex */
public final class m0 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public qp2.g f529629d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f529630e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f529631f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f529632g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f529633h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f529634i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f529635m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f529630e = jz5.h.b(new wo2.r(activity));
        this.f529631f = jz5.h.b(new wo2.k0(activity));
        this.f529632g = jz5.h.b(new wo2.v(activity));
        this.f529633h = jz5.h.b(new wo2.w(activity));
        this.f529634i = jz5.h.b(new wo2.x(activity));
        this.f529635m = jz5.h.b(new wo2.l0(activity));
    }

    public static final oa.i O6(wo2.m0 m0Var, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff, java.lang.Object obj) {
        m0Var.getClass();
        int m20353x443e53f0 = c2718xca2902ff.m20353x443e53f0();
        int i17 = 0;
        while (true) {
            if (i17 >= m20353x443e53f0) {
                return null;
            }
            oa.i k17 = c2718xca2902ff.k(i17);
            if ((k17 != null ? k17.f425311a : null) instanceof wo2.q) {
                java.lang.Object obj2 = k17.f425311a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
                wo2.q qVar = (wo2.q) obj2;
                if (obj instanceof java.lang.Integer) {
                    if (qVar.f529649b == ((java.lang.Number) obj).intValue()) {
                        return k17;
                    }
                } else {
                    continue;
                }
            }
            i17++;
        }
    }

    public static final void P6(wo2.m0 m0Var, int i17) {
        if (i17 == 1) {
            android.view.View view = (android.view.View) ((jz5.n) m0Var.f529632g).mo141623x754a37bb();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((android.widget.TextView) ((jz5.n) m0Var.f529633h).mo141623x754a37bb()).setVisibility(8);
            android.view.View view2 = (android.view.View) ((jz5.n) m0Var.f529634i).mo141623x754a37bb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 == 2) {
            android.view.View view3 = (android.view.View) ((jz5.n) m0Var.f529632g).mo141623x754a37bb();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(4);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (i17 != 3) {
            m0Var.getClass();
            return;
        }
        android.view.View view4 = (android.view.View) ((jz5.n) m0Var.f529632g).mo141623x754a37bb();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) ((jz5.n) m0Var.f529633h).mo141623x754a37bb()).setVisibility(8);
        android.view.View view5 = (android.view.View) ((jz5.n) m0Var.f529634i).mo141623x754a37bb();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/finder/nearby/NearbyActionBarUIC", "setMenuType", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void Q6() {
        if (((pa0.e) ((qa0.e) i95.n0.c(qa0.e.class))).wi()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyActionBarUIC", "checkAddFootPrintRedDot: clear footprint red dot");
            zy2.fa.y0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), 1014, null, null, 6, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearbyActionBarUIC", "checkAddFootPrintRedDot: add footprint red dot");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.na) ((c61.l7) i95.n0.c(c61.l7.class)).nk().j0()).a();
        }
    }

    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6() {
        return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) ((jz5.n) this.f529635m).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        r45.qt2 V6;
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = m158354x19263085().mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        ((android.view.View) ((jz5.n) this.f529630e).mo141623x754a37bb()).setOnClickListener(new wo2.y(this));
        jz5.g gVar = this.f529631f;
        ((com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) ((jz5.n) gVar).mo141623x754a37bb()).m82546x198fa353(new wo2.a0(this));
        ((com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) ((jz5.n) gVar).mo141623x754a37bb()).m82541x74caf26a(new wo2.c0(this));
        ((android.view.View) ((jz5.n) this.f529632g).mo141623x754a37bb()).setOnClickListener(new wo2.e0(this));
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f529633h).mo141623x754a37bb();
        if (textView != null) {
            textView.setTextSize(1, 15.0f);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.class)).f202984e.size() == 2) {
            android.view.ViewGroup.LayoutParams layoutParams = ((com.p314xaae8f345.mm.p2776x373aa5.C22785xca931918) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams)).leftMargin = 0;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        int i17 = 0;
        for (java.lang.Object obj : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351) zVar.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.C14496x6858d351.class)).f202984e) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301 abstractC14499x6ba3301 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1573x2e06d1.AbstractC14499x6ba3301) obj;
            wo2.q qVar = new wo2.q(R6().l(), abstractC14499x6ba3301.f202993p);
            boolean isEmpty = android.text.TextUtils.isEmpty(abstractC14499x6ba3301.f202992o);
            android.widget.TextView textView2 = qVar.f529650c;
            if (isEmpty) {
                java.lang.String string = m80379x76847179().getString(abstractC14499x6ba3301.f202991n);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                if (textView2 != null) {
                    textView2.setText(string);
                }
            } else {
                java.lang.String title = abstractC14499x6ba3301.f202992o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
                if (textView2 != null) {
                    textView2.setText(title);
                }
            }
            R6().d(qVar.f529648a, false);
            i17 = i18;
        }
        R6().a(new wo2.s(this));
        pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.f186885J, m158354x19263085(), new wo2.f0(this));
        pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.K, m158354x19263085(), new wo2.g0(this));
        pm0.v.y(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.aa.L, m158354x19263085(), new wo2.h0(this));
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = m158358x197d1fc6();
        if (m158358x197d1fc6 != null) {
            V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.b(m158358x197d1fc6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        } else {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
            V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        }
        if (this.f529629d == null) {
            this.f529629d = new qp2.g(m80379x76847179(), 0, "", "", "", "");
        }
        qp2.g gVar2 = this.f529629d;
        if (gVar2 != null) {
            gVar2.a(V6, true, true, new wo2.u(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        qp2.g gVar = this.f529629d;
        if (gVar != null) {
            gm0.j1.d().q(4210, gVar);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
    }
}
