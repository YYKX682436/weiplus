package yf2;

/* loaded from: classes3.dex */
public final class i2 extends if2.b implements jm2.a {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f543250m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f543251n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f543252o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f543253p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 f543254q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f543255r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f543256s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f543257t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f543257t = jz5.h.b(new yf2.u1(this));
    }

    public final void Z6(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveTopicCoverController", "applyInviteeVisibility: invitee=" + z17);
        int i17 = z17 ? 8 : 0;
        android.view.View view = this.f543252o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.f543253p;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "applyInviteeVisibility", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void a7(int i17) {
        if (((mm2.n0) m56788xbba4bfc0(mm2.n0.class)).Q6(xy2.c.e(O6()))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveTopicCoverController", "showEdit skip: co-live invitee");
            return;
        }
        android.widget.TextView textView = this.f543250m;
        if (textView != null) {
            textView.clearFocus();
        }
        android.view.View view = this.f543255r;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "showEdit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/startlive/FinderStartLiveTopicCoverController", "showEdit", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2 = this.f543254q;
        if (c14396x9309a8f2 != null) {
            boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ENABLE_DESC_EXTEND_BOOLEAN_SYNC, false);
            java.lang.String str = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410609q).mo144003x754a37bb();
            java.lang.String str2 = (java.lang.String) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410610r).mo144003x754a37bb();
            yf2.g2 g2Var = new yf2.g2(this, i17);
            yf2.h2 h2Var = new yf2.h2(this);
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2.f199136p;
            c14396x9309a8f2.c(o17, str, str2, false, g2Var, h2Var, false, "");
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveTopicCoverController", "createView: Creating topic and cover UI");
        this.f543250m = (android.widget.TextView) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.icr);
        this.f543251n = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fga);
        this.f543252o = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.ubf);
        this.f543253p = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.f566142ti0);
        this.f543256s = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.tvc);
        android.view.View rootView = pluginLayout.getRootView();
        android.view.ViewGroup viewGroup = rootView instanceof android.view.ViewGroup ? (android.view.ViewGroup) rootView : null;
        if (viewGroup != null) {
            android.content.Context context = pluginLayout.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2(context);
            c14396x9309a8f2.setId(com.p314xaae8f345.mm.R.id.fg6);
            c14396x9309a8f2.setVisibility(8);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 80;
            c14396x9309a8f2.setLayoutParams(layoutParams);
            c14396x9309a8f2.setBackgroundColor(pluginLayout.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77909xe61cad90));
            c14396x9309a8f2.m57891x5fdf7cc0(1);
            this.f543254q = c14396x9309a8f2;
            if (viewGroup instanceof android.widget.FrameLayout) {
                viewGroup.addView(c14396x9309a8f2);
            } else {
                pluginLayout.addView(c14396x9309a8f2);
            }
        }
        this.f543255r = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.f566296fg3);
        long j17 = hl2.a.f363633b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCreateLivePrepareSwitch", "FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG: " + j17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FINDER_LIVE_CREATE_LIVE_PREPARE_SWITCH_FLAG enableDefaultTitle: ");
        long j18 = j17 & 2;
        sb6.append(j18 != 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCreateLivePrepareSwitch", sb6.toString());
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FinderLiveConfig FINDER_LIVE_START_LIVE_ENABLE_DEFAULT_TITLE_ON_FIRST_CREATE_LIVE: ");
        ae2.in inVar = ae2.in.f85221a;
        jz5.g gVar = ae2.in.f85230a8;
        sb7.append(((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveCreateLivePrepareSwitch", sb7.toString());
        boolean z17 = j18 != 0;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue();
        if (intValue != 0) {
            z17 = intValue == 1;
        }
        if (z17) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.g1) m56788xbba4bfc0(mm2.g1.class)).f410609q).k(O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575299oz4));
        }
        android.view.View view = this.f543251n;
        if (view != null) {
            view.setOnClickListener(new yf2.y1(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.a2(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.c2(this, null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.e2(this, null), 3, null);
        android.widget.TextView textView = this.f543250m;
        if (textView != null) {
            textView.setHint(zl2.q4.f555466a.n());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f22 = this.f543254q;
        if (c14396x9309a8f22 != null) {
            c14396x9309a8f22.m57891x5fdf7cc0(1);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f23 = this.f543254q;
        if (c14396x9309a8f23 != null) {
            c14396x9309a8f23.setBackgroundColor(O6().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        }
        android.widget.TextView textView2 = this.f543250m;
        if (textView2 != null) {
            textView2.setShowSoftInputOnFocus(false);
        }
        android.widget.TextView textView3 = this.f543250m;
        if (textView3 != null) {
            textView3.setOnClickListener(new yf2.v1(this));
        }
        mm2.n0 n0Var = (mm2.n0) m56788xbba4bfc0(mm2.n0.class);
        java.lang.String e17 = xy2.c.e(O6());
        Z6(n0Var.Q6(e17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.x1(n0Var, this, e17, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLiveTopicCoverController", "onViewUnmount: Cleaning up topic and cover UI");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2 = this.f543254q;
        if (c14396x9309a8f2 != null) {
            android.view.ViewParent parent = c14396x9309a8f2.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(c14396x9309a8f2);
            }
        }
        this.f543250m = null;
        this.f543251n = null;
        this.f543252o = null;
        this.f543253p = null;
        this.f543254q = null;
        this.f543255r = null;
    }
}
