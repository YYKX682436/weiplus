package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI */
/* loaded from: classes12.dex */
public class ActivityC13477xb2a3ecd7 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a implements q32.e, com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.b7, q32.f, p32.k {
    public static int V = 128;
    public int A;
    public java.util.List B;
    public java.util.ArrayList C;
    public java.util.ArrayList D;
    public boolean E;
    public boolean F;
    public java.lang.String G;
    public java.lang.String H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f180865J;
    public java.lang.String K;
    public java.lang.String L;
    public boolean M;
    public boolean N;
    public boolean P;
    public r45.dh7 Q;
    public r45.ri5 R;
    public p32.l S;
    public int U;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f180866d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i5 f180867e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f180868f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 f180869g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13475x54dd56d1 f180870h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f180871i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageView f180872m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f180873n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f180874o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.ViewGroup f180875p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f180876q;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f180879t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f180880u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f180881v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f180882w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f180883x;

    /* renamed from: y, reason: collision with root package name */
    public r32.a f180884y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f180885z;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f180877r = null;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.Map f180878s = new java.util.HashMap();
    public final h32.b T = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.m6(this);

    public static void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7, r45.ri5 ri5Var) {
        r45.za7 za7Var;
        activityC13477xb2a3ecd7.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankExtInfoView() called with: rankExtInfo = [" + ri5Var + "]");
        activityC13477xb2a3ecd7.f180875p.setVisibility(8);
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(activityC13477xb2a3ecd7.f180875p, "wesport_rank_header_jumper");
        dy1.r ik6 = aVar.ik(activityC13477xb2a3ecd7.f180875p, 32, 32337);
        android.view.ViewGroup viewGroup = activityC13477xb2a3ecd7.f180875p;
        a42.g gVar = a42.g.f82739a;
        r45.ri5 ri5Var2 = activityC13477xb2a3ecd7.R;
        java.lang.String str = (ri5Var2 == null || (za7Var = ri5Var2.f466471d) == null) ? null : za7Var.f473414m;
        if (str == null) {
            str = "";
        }
        ((cy1.a) ik6).fk(viewGroup, "wesport_task_jumper_txt", gVar.a(str));
        if (ri5Var == null) {
            activityC13477xb2a3ecd7.f180875p.setVisibility(8);
            return;
        }
        r45.za7 za7Var2 = ri5Var.f466471d;
        if (za7Var2 != null) {
            activityC13477xb2a3ecd7.f180875p.setVisibility(0);
            activityC13477xb2a3ecd7.f180873n.setText(za7Var2.f473413i);
            gVar.c(activityC13477xb2a3ecd7.f180873n, 14.0f);
            activityC13477xb2a3ecd7.f180874o.setText(za7Var2.f473414m);
            gVar.c(activityC13477xb2a3ecd7.f180874o, 14.0f);
            android.widget.ImageView imageView = activityC13477xb2a3ecd7.f180872m;
            if (imageView != null) {
                imageView.setOutlineProvider(new a42.e(0.5f));
            }
            if (imageView != null) {
                imageView.setClipToOutline(true);
            }
            n11.a b17 = n11.a.b();
            java.lang.String str2 = za7Var2.f473412h;
            android.widget.ImageView imageView2 = activityC13477xb2a3ecd7.f180872m;
            o11.f fVar = new o11.f();
            fVar.f423610a = true;
            fVar.f423611b = true;
            fVar.f423629t = true;
            b17.h(str2, imageView2, fVar.a());
            activityC13477xb2a3ecd7.f180875p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.n6(activityC13477xb2a3ecd7, za7Var2));
            cy1.a aVar2 = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar2.pk(activityC13477xb2a3ecd7.f180875p, "wesport_rank_header_jumper");
            dy1.r ik7 = aVar2.ik(activityC13477xb2a3ecd7.f180875p, 8, 32337);
            android.view.ViewGroup viewGroup2 = activityC13477xb2a3ecd7.f180875p;
            r45.za7 za7Var3 = ri5Var.f466471d;
            java.lang.String str3 = za7Var3 != null ? za7Var3.f473414m : null;
            ((cy1.a) ik7).fk(viewGroup2, "wesport_task_jumper_txt", gVar.a(str3 != null ? str3 : ""));
        }
    }

    public static void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        android.view.View view = activityC13477xb2a3ecd7.f180879t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateFooterView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.String W6() {
        java.util.List list = this.B;
        if (list == null) {
            return null;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r32.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) it.next()).f180980a;
            if (dVar != null && dVar.f67220xaedf8d95 == 1) {
                return dVar.f67224xdec927b;
            }
        }
        return null;
    }

    public void X6(java.lang.String str) {
        ve4.g.a(6);
        android.content.Intent intent = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714.class);
        intent.putExtra(dm.i4.f66875xa013b0d5, str);
        intent.putExtra("usernickname", (java.lang.String) ((java.util.HashMap) this.f180878s).get(str));
        intent.putExtra("app_username", this.f180882w);
        intent.putExtra("rank_id", this.f180883x);
        startActivityForResult(intent, 4);
    }

    public final void Y6() {
        r32.a aVar = this.f180884y;
        if (aVar == null) {
            this.f180871i.setImageResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560399jc);
            this.L = null;
            return;
        }
        java.lang.String str = this.L;
        java.lang.String str2 = aVar.f66505x850adc81;
        if (str != str2) {
            if (str == null || !str.equals(str2)) {
                android.widget.ImageView imageView = this.f180871i;
                java.lang.String str3 = this.f180884y.f66505x850adc81;
                iz5.a.g(null, imageView != null);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    p32.g.b(this, imageView, str3, com.p314xaae8f345.mm.R.C30859x5a72f63.f560399jc);
                } else {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new p32.d(this, imageView, str3, com.p314xaae8f345.mm.R.C30859x5a72f63.f560399jc));
                }
                this.L = this.f180884y.f66505x850adc81;
            }
        }
    }

    public final void Z6(boolean z17) {
        if (z17) {
            java.lang.String W6 = W6();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W6)) {
                this.f180885z = W6;
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180882w)) {
            this.f180870h.setVisibility(8);
        } else {
            this.f180870h.a(this.f180885z);
            this.f180870h.setVisibility(0);
        }
    }

    public final void a7() {
        java.lang.String str;
        java.lang.String valueOf;
        r45.dh7 dh7Var;
        r32.a y07;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180865J) && (y07 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.wi().y0(this.f180880u)) != null) {
            this.f180865J = y07.f66505x850adc81;
        }
        r32.d c17 = this.f180867e.c(this.f180880u, this.D);
        if (c17 != null) {
            str = java.lang.String.valueOf(c17.f67220xaedf8d95);
            valueOf = java.lang.String.valueOf(c17.f67221x29cc1f0d);
        } else {
            str = "--";
            valueOf = (c17 != null || (dh7Var = this.Q) == null) ? "0" : java.lang.String.valueOf(dh7Var.f454009e);
        }
        new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f3().b(this, str, valueOf, this.f180865J, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.g6(this));
    }

    @Override // q32.e
    public void b3(java.lang.String str, q32.d dVar) {
        iz5.a.g(null, (dVar == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) ? false : true);
        if (!"HardDeviceRankInfo".equals(str)) {
            if ("HardDeviceChampionInfo".equals(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180885z) && this.f180885z.equals(dVar.f441464b)) {
                this.f180884y = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.wi().y0(this.f180885z);
                runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.a6(this));
                return;
            }
            return;
        }
        java.lang.String str2 = this.f180883x;
        if (str2 == null || !str2.equals(dVar.f441463a)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "onRankChange, rankId(%s).", this.f180883x);
        d7(true);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180885z) || !this.f180885z.equals(W6())) {
            java.lang.String W6 = W6();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(W6)) {
                this.f180885z = W6;
            }
            this.f180884y = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.wi().y0(this.f180885z);
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.y5(this));
        }
        runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.z5(this));
    }

    public final void b7() {
        java.util.List list;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "try2LocateToUser, locate2User(%s), username(%s).", this.K, this.f180880u);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.K)) {
            return;
        }
        java.lang.String str = this.K;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser, locate2User(%s), username(%s).", str, this.f180880u);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (list = this.B) == null || ((java.util.ArrayList) list).size() == 0) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.B).size(); i17++) {
            r32.d dVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) ((java.util.ArrayList) this.B).get(i17)).f180980a;
            int i18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.e7) ((java.util.ArrayList) this.B).get(i17)).f180982c;
            if (dVar != null && str.equalsIgnoreCase(dVar.f67224xdec927b) && !str.equalsIgnoreCase(this.f180880u) && (i18 & 2) != 2) {
                android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
                getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i19 = displayMetrics.heightPixels;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "locateToUser pos(%d).(h : %d)", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i19));
                this.f180866d.setSelectionFromTop(i17, i19 / 4);
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.i5 i5Var = this.f180867e;
                i5Var.f181041h = str;
                i5Var.g(this.Q);
                this.f180867e.notifyDataSetInvalidated();
                e7();
                return;
            }
        }
        this.f180867e.f181041h = null;
    }

    public final void c7() {
        java.lang.String str;
        r32.a aVar = this.f180884y;
        if (aVar != null && (str = this.f180880u) != null && str.equals(aVar.f66506xdec927b) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180884y.f66505x850adc81)) {
            android.view.View view = this.f180876q;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25 = this.f180869g;
            if (c13478xcdc36e25 != null) {
                c13478xcdc36e25.m55089xdbb477d6(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r6(this));
                return;
            }
            return;
        }
        android.view.View view2 = this.f180876q;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r32.a aVar2 = this.f180884y;
        if (aVar2 != null) {
            java.lang.String str2 = aVar2.f66506xdec927b;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str2 == null) {
                str2 = "";
            }
            if (str2.equals(this.f180880u) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f180884y.f66505x850adc81)) {
                return;
            }
            this.f180869g.m55089xdbb477d6(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s6(this));
        }
    }

    public final void d7(boolean z17) {
        if (!this.F || z17) {
            this.D = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.cj().a(this.f180883x);
            java.util.ArrayList J0 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.Ri().J0();
            this.C = J0;
            this.B = this.f180867e.a(J0, this.D, this.I);
            runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.b6(this));
        }
    }

    public final void e7() {
        android.view.View childAt = this.f180866d.getChildAt(0);
        int[] iArr = new int[2];
        if (childAt != null) {
            if (this.f180866d.getFirstVisiblePosition() == 0) {
                childAt.getLocationOnScreen(iArr);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.K) && V == 128) {
                    V = iArr[1];
                }
                int i17 = iArr[1];
                if (i17 > 0) {
                    int i18 = V;
                    float f17 = i17 >= i18 ? 1.0f : i17 / i18;
                    this.f180870h.setAlpha(f17);
                    this.f180870h.setVisibility(0);
                    android.view.View view = this.f180876q;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    return;
                }
            }
            this.f180870h.setAlpha(0.0f);
            android.view.View view2 = this.f180876q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "updateHeaderEffect", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            this.f180870h.setVisibility(8);
        }
    }

    public final void f7() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ExdeviceRankInfoUI", "updateRankInfoUIFromServer");
        p32.l lVar = new p32.l(this.f180883x, this.f180882w, this.f180885z, this.E, this.T);
        this.S = lVar;
        lVar.f433034z = this;
        gm0.j1.n().f354821b.g(this.S);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.a_f;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        this.f180868f = findViewById(com.p314xaae8f345.mm.R.id.f567694ke5);
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25 c13478xcdc36e25 = new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13478xcdc36e25(this);
        android.graphics.Rect rect = new android.graphics.Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        int i17 = rect.top;
        if (i17 == 0) {
            i17 = a42.i.d(this, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561278e2));
        }
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int dimensionPixelSize = displayMetrics.widthPixels > displayMetrics.heightPixels ? getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561155ax) : getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay);
        android.view.Display defaultDisplay = getWindowManager().getDefaultDisplay();
        int height = ((defaultDisplay.getHeight() / 2) - i17) - dimensionPixelSize;
        if (defaultDisplay.getHeight() <= 0 || height <= 0) {
            height = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561272dw);
        }
        c13478xcdc36e25.setMinimumHeight(height);
        c13478xcdc36e25.setMinimumWidth(defaultDisplay.getWidth());
        c13478xcdc36e25.setTag(java.lang.Integer.valueOf(height));
        this.f180869g = c13478xcdc36e25;
        this.f180875p = (android.view.ViewGroup) c13478xcdc36e25.findViewById(com.p314xaae8f345.mm.R.id.f565801rk4);
        this.f180873n = (android.widget.TextView) this.f180869g.findViewById(com.p314xaae8f345.mm.R.id.okx);
        this.f180874o = (android.widget.TextView) this.f180869g.findViewById(com.p314xaae8f345.mm.R.id.s9f);
        this.f180872m = (android.widget.ImageView) this.f180869g.findViewById(com.p314xaae8f345.mm.R.id.hlr);
        this.f180875p.setVisibility(8);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = (com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c) findViewById(com.p314xaae8f345.mm.R.id.lcx);
        this.f180866d = (android.widget.ListView) findViewById(com.p314xaae8f345.mm.R.id.dja);
        this.f180870h = (com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.C13475x54dd56d1) findViewById(com.p314xaae8f345.mm.R.id.beg);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mn7);
        this.f180876q = findViewById;
        findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t6(this));
        this.f180869g.m55087xb46aa992(false);
        c7();
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79085xcc8bf2ed(false);
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79098x563f5e7a(false);
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79082x1e1922a0(false);
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79085xcc8bf2ed(false);
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79088x648e109b(false);
        boolean z17 = true;
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79083x49531bcc(true);
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79091x1c9bae30(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.r5(this));
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79078x1c273745(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.s5(this));
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79093x6fa959a(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.t5(this));
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79079xcab5c565(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u5(this));
        this.f180866d.setOnScrollListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.v5(this));
        this.f180866d.addHeaderView(this.f180869g, null, false);
        android.view.View inflate = getLayoutInflater().inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a_d, (android.view.ViewGroup) null);
        this.f180879t = inflate.findViewById(com.p314xaae8f345.mm.R.id.hes);
        inflate.findViewById(com.p314xaae8f345.mm.R.id.her).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.w5(this));
        android.view.View view = this.f180879t;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f180866d.addFooterView(inflate);
        java.util.ArrayList arrayList2 = this.C;
        int size = arrayList2 != null ? arrayList2.size() : 0;
        java.util.ArrayList arrayList3 = this.D;
        if (size + (arrayList3 != null ? arrayList3.size() : 0) == 0) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            this.B = arrayList4;
            this.f180867e.f181038e = arrayList4;
        }
        this.f180877r = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.x5(this));
        this.f180866d.setAdapter((android.widget.ListAdapter) this.f180867e);
        this.f180867e.f181042i = this;
        if (this.A == 1) {
            this.f180866d.setVisibility(0);
            android.view.View view2 = this.f180868f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view2, arrayList5.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f180866d.setVisibility(8);
            android.view.View view3 = this.f180868f;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view3, arrayList6.toArray(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/exdevice/ui/ExdeviceRankInfoUI", "handleHardwareType", "(I)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z17 = false;
        }
        if (!z17) {
            finish();
            return;
        }
        this.f180871i = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.diw);
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79083x49531bcc(false);
        int B = i65.a.B(this);
        int intValue = ((java.lang.Integer) this.f180869g.getTag()).intValue();
        if (this.I) {
            intValue += (getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561286ea) / 2) + getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.e_);
        }
        this.f180871i.setLayoutParams(new android.widget.FrameLayout.LayoutParams(B, intValue));
        Y6();
        Z6(false);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (!p32.g.a(this, i17, i18, intent, this.f180882w) && i18 == -1) {
            if (i17 == 1) {
                if (intent == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.ExdeviceRankInfoUI", "onActivityResult, data is null.(reqestCode : %d)", java.lang.Integer.valueOf(i17));
                    return;
                }
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                if (stringExtra == null || stringExtra.length() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Sport.ExdeviceRankInfoUI", "select conversation failed, toUser is null.");
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.f3.c(this, stringExtra, new com.p314xaae8f345.mm.vfs.r6(getCacheDir(), "sport_share_bitmap.jpg").o(), intent.getStringExtra("custom_send_text"), this.H);
                db5.e1.T(mo55332x76847179(), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
                return;
            }
            if (i17 == 2) {
                db5.e1.T(mo55332x76847179(), getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572093yi));
                return;
            }
            if (i17 != 3) {
                if (i17 == 4 && intent != null && intent.getBooleanExtra("KeyNeedUpdateRank", false)) {
                    f7();
                    return;
                }
                return;
            }
            if (intent != null) {
                java.util.ArrayList P1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(intent.getStringExtra("received_card_name").split(","));
                java.lang.String stringExtra2 = intent.getStringExtra("custom_send_text");
                java.util.Iterator it = P1.iterator();
                while (it.hasNext()) {
                    java.lang.String str = (java.lang.String) it.next();
                    ((dk5.s5) tg3.t1.a()).Di("gh_43f2581f6fd6", str, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str), null);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361 c5990xd50ae361 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5990xd50ae361();
                        am.mt mtVar = c5990xd50ae361.f136285g;
                        mtVar.f88895a = str;
                        mtVar.f88896b = stringExtra2;
                        mtVar.f88897c = c01.e2.C(str);
                        mtVar.f88898d = 0;
                        c5990xd50ae361.e();
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0372  */
    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instructions count: 1346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        this.N = true;
        if (this.f180867e != null) {
            ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
            db5.d5 d5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f253306a;
            if (d5Var != null) {
                d5Var.dismiss();
                com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.f253306a = null;
            }
        }
        super.onDestroy();
        p32.l lVar = this.S;
        if (lVar != null) {
            lVar.f433034z = null;
        }
        q32.a hj6 = com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.hj();
        hj6.getClass();
        android.util.SparseArray sparseArray = hj6.f441458a;
        if (sparseArray != null) {
            sparseArray.remove(hashCode());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.cj().f441462d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.l3.cj().getClass();
        int i17 = this.U;
        if (i17 > 0) {
            jx3.f.INSTANCE.d(13168, 0, java.lang.Integer.valueOf(i17), 0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Activity
    public void onRestart() {
        super.onRestart();
        d7(true);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(z32.a0.class);
        hashSet.add(y32.c.class);
    }
}
