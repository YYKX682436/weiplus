package id2;

/* loaded from: classes3.dex */
public final class b2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: g, reason: collision with root package name */
    public static r45.lk2 f372023g;

    /* renamed from: d, reason: collision with root package name */
    public fg2.i1 f372024d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f372025e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f372026f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f372025e = new java.util.ArrayList();
        this.f372026f = jz5.h.b(new id2.x1(this));
    }

    public final void O6(java.util.ArrayList arrayList, android.view.View view) {
        java.util.Iterator it = this.f372025e.iterator();
        boolean z17 = false;
        while (it.hasNext()) {
            if (((yk2.g) it.next()).f544324d.getVisibility() == 0) {
                z17 = true;
            }
        }
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveMoreOptionSettingUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveMoreOptionSettingUIC", "checkLayoutVisibility", "(Ljava/util/ArrayList;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void P6(r45.lk2 lk2Var) {
        java.util.ArrayList arrayList = this.f372025e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((yk2.g) it.next()).a(lk2Var);
        }
        fg2.i1 i1Var = this.f372024d;
        if (i1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.LinearLayout moreOptionSettingLayout = i1Var.f343619g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moreOptionSettingLayout, "moreOptionSettingLayout");
        O6(arrayList, moreOptionSettingLayout);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: getLayoutId */
    public int mo569x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.avm;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        r45.lk2 lk2Var = f372023g;
        if (lk2Var != null) {
            P6(lk2Var);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.tmm);
        int i17 = com.p314xaae8f345.mm.R.id.f6b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f6b);
        if (c22699x3dcdb352 != null) {
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
            i17 = com.p314xaae8f345.mm.R.id.fjl;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.fjl);
            if (textView != null) {
                i17 = com.p314xaae8f345.mm.R.id.g9b;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.g9b);
                if (viewOnClickListenerC22631x1cc07cc8 != null) {
                    i17 = com.p314xaae8f345.mm.R.id.g9d;
                    android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.g9d);
                    if (textView2 != null) {
                        i17 = com.p314xaae8f345.mm.R.id.r_c;
                        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.r_c);
                        if (relativeLayout != null) {
                            i17 = com.p314xaae8f345.mm.R.id.f566779h10;
                            android.widget.TextView textView3 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f566779h10);
                            if (textView3 != null) {
                                i17 = com.p314xaae8f345.mm.R.id.f566780h11;
                                android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f566780h11);
                                if (linearLayout != null) {
                                    i17 = com.p314xaae8f345.mm.R.id.hpl;
                                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hpl);
                                    if (linearLayout2 != null) {
                                        i17 = com.p314xaae8f345.mm.R.id.hpn;
                                        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hpn);
                                        if (linearLayout3 != null) {
                                            i17 = com.p314xaae8f345.mm.R.id.hpo;
                                            android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hpo);
                                            if (linearLayout4 != null) {
                                                i17 = com.p314xaae8f345.mm.R.id.hpp;
                                                android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.hpp);
                                                if (linearLayout5 != null) {
                                                    i17 = com.p314xaae8f345.mm.R.id.ru7;
                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ru7);
                                                    if (c22699x3dcdb3522 != null) {
                                                        i17 = com.p314xaae8f345.mm.R.id.ru8;
                                                        android.widget.LinearLayout linearLayout6 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ru8);
                                                        if (linearLayout6 != null) {
                                                            i17 = com.p314xaae8f345.mm.R.id.ru9;
                                                            android.widget.TextView textView4 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ru9);
                                                            if (textView4 != null) {
                                                                i17 = com.p314xaae8f345.mm.R.id.ru_;
                                                                android.widget.TextView textView5 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ru_);
                                                                if (textView5 != null) {
                                                                    i17 = com.p314xaae8f345.mm.R.id.rug;
                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.rug);
                                                                    if (c22699x3dcdb3523 != null) {
                                                                        i17 = com.p314xaae8f345.mm.R.id.ruh;
                                                                        android.widget.RelativeLayout relativeLayout2 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ruh);
                                                                        if (relativeLayout2 != null) {
                                                                            i17 = com.p314xaae8f345.mm.R.id.rui;
                                                                            android.widget.TextView textView6 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.rui);
                                                                            if (textView6 != null) {
                                                                                i17 = com.p314xaae8f345.mm.R.id.ruj;
                                                                                android.widget.TextView textView7 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ruj);
                                                                                if (textView7 != null) {
                                                                                    i17 = com.p314xaae8f345.mm.R.id.qfy;
                                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3524 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.qfy);
                                                                                    if (c22699x3dcdb3524 != null) {
                                                                                        i17 = com.p314xaae8f345.mm.R.id.qfz;
                                                                                        android.widget.RelativeLayout relativeLayout3 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.qfz);
                                                                                        if (relativeLayout3 != null) {
                                                                                            i17 = com.p314xaae8f345.mm.R.id.ruv;
                                                                                            android.widget.TextView textView8 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.ruv);
                                                                                            if (textView8 != null) {
                                                                                                i17 = com.p314xaae8f345.mm.R.id.f567158qg0;
                                                                                                android.widget.TextView textView9 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f567158qg0);
                                                                                                if (textView9 != null) {
                                                                                                    i17 = com.p314xaae8f345.mm.R.id.imc;
                                                                                                    android.widget.ProgressBar progressBar = (android.widget.ProgressBar) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.imc);
                                                                                                    if (progressBar != null) {
                                                                                                        i17 = com.p314xaae8f345.mm.R.id.uh_;
                                                                                                        android.widget.LinearLayout linearLayout7 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.uh_);
                                                                                                        if (linearLayout7 != null) {
                                                                                                            i17 = com.p314xaae8f345.mm.R.id.uha;
                                                                                                            android.widget.LinearLayout linearLayout8 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.uha);
                                                                                                            if (linearLayout8 != null) {
                                                                                                                i17 = com.p314xaae8f345.mm.R.id.l7d;
                                                                                                                android.widget.TextView textView10 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.l7d);
                                                                                                                if (textView10 != null) {
                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.l7e;
                                                                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3525 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.l7e);
                                                                                                                    if (c22699x3dcdb3525 != null) {
                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.l7f;
                                                                                                                        android.widget.TextView textView11 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.l7f);
                                                                                                                        if (textView11 != null) {
                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.f568076ux1;
                                                                                                                            android.widget.LinearLayout linearLayout9 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568076ux1);
                                                                                                                            if (linearLayout9 != null) {
                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.f568077ux2;
                                                                                                                                android.widget.TextView textView12 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568077ux2);
                                                                                                                                if (textView12 != null) {
                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.f568078ux3;
                                                                                                                                    android.widget.TextView textView13 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568078ux3);
                                                                                                                                    if (textView13 != null) {
                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.f568079ux4;
                                                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc82 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f568079ux4);
                                                                                                                                        if (viewOnClickListenerC22631x1cc07cc82 != null) {
                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.m1p;
                                                                                                                                            android.widget.LinearLayout linearLayout10 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.m1p);
                                                                                                                                            if (linearLayout10 != null) {
                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.m1q;
                                                                                                                                                com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc83 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.m1q);
                                                                                                                                                if (viewOnClickListenerC22631x1cc07cc83 != null) {
                                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.nto;
                                                                                                                                                    com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc84 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.nto);
                                                                                                                                                    if (viewOnClickListenerC22631x1cc07cc84 != null) {
                                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.qgp;
                                                                                                                                                        android.widget.TextView textView14 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.qgp);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.rbb;
                                                                                                                                                            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc85 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.rbb);
                                                                                                                                                            if (viewOnClickListenerC22631x1cc07cc85 != null) {
                                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.oah;
                                                                                                                                                                android.widget.RelativeLayout relativeLayout4 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oah);
                                                                                                                                                                if (relativeLayout4 != null) {
                                                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.oak;
                                                                                                                                                                    android.widget.TextView textView15 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oak);
                                                                                                                                                                    if (textView15 != null) {
                                                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.oap;
                                                                                                                                                                        android.widget.TextView textView16 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oap);
                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.oaw;
                                                                                                                                                                            android.widget.TextView textView17 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oaw);
                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.oax;
                                                                                                                                                                                android.widget.RelativeLayout relativeLayout5 = (android.widget.RelativeLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oax);
                                                                                                                                                                                if (relativeLayout5 != null) {
                                                                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.oaz;
                                                                                                                                                                                    android.widget.LinearLayout linearLayout11 = (android.widget.LinearLayout) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.oaz);
                                                                                                                                                                                    if (linearLayout11 != null) {
                                                                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.f569299pr5;
                                                                                                                                                                                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3526 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.f569299pr5);
                                                                                                                                                                                        if (c22699x3dcdb3526 != null) {
                                                                                                                                                                                            i17 = com.p314xaae8f345.mm.R.id.pr9;
                                                                                                                                                                                            android.widget.TextView textView18 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.pr9);
                                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                                i17 = com.p314xaae8f345.mm.R.id.pre;
                                                                                                                                                                                                android.widget.TextView textView19 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.pre);
                                                                                                                                                                                                if (textView19 != null) {
                                                                                                                                                                                                    i17 = com.p314xaae8f345.mm.R.id.prf;
                                                                                                                                                                                                    android.widget.TextView textView20 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.prf);
                                                                                                                                                                                                    if (textView20 != null) {
                                                                                                                                                                                                        i17 = com.p314xaae8f345.mm.R.id.prk;
                                                                                                                                                                                                        android.widget.TextView textView21 = (android.widget.TextView) x4.b.a(findViewById, com.p314xaae8f345.mm.R.id.prk);
                                                                                                                                                                                                        if (textView21 != null) {
                                                                                                                                                                                                            this.f372024d = new fg2.i1(frameLayout, c22699x3dcdb352, frameLayout, textView, viewOnClickListenerC22631x1cc07cc8, textView2, relativeLayout, textView3, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, c22699x3dcdb3522, linearLayout6, textView4, textView5, c22699x3dcdb3523, relativeLayout2, textView6, textView7, c22699x3dcdb3524, relativeLayout3, textView8, textView9, progressBar, linearLayout7, linearLayout8, textView10, c22699x3dcdb3525, textView11, linearLayout9, textView12, textView13, viewOnClickListenerC22631x1cc07cc82, linearLayout10, viewOnClickListenerC22631x1cc07cc83, viewOnClickListenerC22631x1cc07cc84, textView14, viewOnClickListenerC22631x1cc07cc85, relativeLayout4, textView15, textView16, textView17, relativeLayout5, linearLayout11, c22699x3dcdb3526, textView18, textView19, textView20, textView21);
                                                                                                                                                                                                            ae2.in inVar = ae2.in.f85221a;
                                                                                                                                                                                                            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.B).mo141623x754a37bb()).r()).intValue();
                                                                                                                                                                                                            java.util.ArrayList arrayList = this.f372025e;
                                                                                                                                                                                                            if (intValue == 1) {
                                                                                                                                                                                                                fg2.i1 i1Var = this.f372024d;
                                                                                                                                                                                                                if (i1Var == null) {
                                                                                                                                                                                                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                                                                    throw null;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                android.widget.LinearLayout jumpFinderLiveProductOrderCenter = i1Var.f343615c;
                                                                                                                                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpFinderLiveProductOrderCenter, "jumpFinderLiveProductOrderCenter");
                                                                                                                                                                                                                arrayList.add(new yk2.i(jumpFinderLiveProductOrderCenter));
                                                                                                                                                                                                            }
                                                                                                                                                                                                            fg2.i1 i1Var2 = this.f372024d;
                                                                                                                                                                                                            if (i1Var2 == null) {
                                                                                                                                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout jumpFinderLivePurchase = i1Var2.f343616d;
                                                                                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpFinderLivePurchase, "jumpFinderLivePurchase");
                                                                                                                                                                                                            arrayList.add(new yk2.j(jumpFinderLivePurchase));
                                                                                                                                                                                                            fg2.i1 i1Var3 = this.f372024d;
                                                                                                                                                                                                            if (i1Var3 == null) {
                                                                                                                                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout jumpFinderLiveLotteryResultRecord = i1Var3.f343614b;
                                                                                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpFinderLiveLotteryResultRecord, "jumpFinderLiveLotteryResultRecord");
                                                                                                                                                                                                            arrayList.add(new yk2.a(jumpFinderLiveLotteryResultRecord));
                                                                                                                                                                                                            fg2.i1 i1Var4 = this.f372024d;
                                                                                                                                                                                                            if (i1Var4 == null) {
                                                                                                                                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout jumpFinderLiveRewardLevel = i1Var4.f343617e;
                                                                                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpFinderLiveRewardLevel, "jumpFinderLiveRewardLevel");
                                                                                                                                                                                                            arrayList.add(new yk2.n(jumpFinderLiveRewardLevel));
                                                                                                                                                                                                            fg2.i1 i1Var5 = this.f372024d;
                                                                                                                                                                                                            if (i1Var5 == null) {
                                                                                                                                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.RelativeLayout liveIdRoot = i1Var5.f343618f;
                                                                                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveIdRoot, "liveIdRoot");
                                                                                                                                                                                                            arrayList.add(new yk2.b(liveIdRoot));
                                                                                                                                                                                                            fg2.i1 i1Var6 = this.f372024d;
                                                                                                                                                                                                            if (i1Var6 == null) {
                                                                                                                                                                                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                                                                                                                                                                                                                throw null;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            android.widget.LinearLayout moreOptionSettingLayout = i1Var6.f343619g;
                                                                                                                                                                                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(moreOptionSettingLayout, "moreOptionSettingLayout");
                                                                                                                                                                                                            O6(arrayList, moreOptionSettingLayout);
                                                                                                                                                                                                            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(m158354x19263085()), null, null, new id2.a2(this, null), 3, null);
                                                                                                                                                                                                            return;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
