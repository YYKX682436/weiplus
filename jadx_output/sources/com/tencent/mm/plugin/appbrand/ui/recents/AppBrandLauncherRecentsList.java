package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class AppBrandLauncherRecentsList extends com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment {

    /* renamed from: y0, reason: collision with root package name */
    public static final /* synthetic */ int f89998y0 = 0;
    public final com.tencent.mm.sdk.platformtools.n3 A;
    public final com.tencent.mm.plugin.appbrand.ui.recents.r0 B;
    public final com.tencent.mm.plugin.appbrand.ui.recents.c2 C;
    public com.tencent.mm.plugin.appbrand.ui.recents.v0 D;
    public android.view.View E;
    public android.view.View F;
    public com.tencent.mm.plugin.appbrand.ui.recents.c G;
    public com.tencent.mm.plugin.appbrand.ui.recents.f1 H;
    public final com.tencent.mm.plugin.appbrand.ui.recents.a2 I;

    /* renamed from: J, reason: collision with root package name */
    public int f89999J;
    public int K;
    public boolean L;
    public boolean M;
    public java.lang.String N;
    public boolean P;
    public int Q;
    public final java.lang.Object R;
    public final androidx.recyclerview.widget.r1 S;
    public final com.tencent.mm.plugin.appbrand.ui.recents.s0 T;
    public final l75.q0 U;
    public final l75.q0 V;
    public final l75.q0 W;
    public final l75.q0 X;
    public final com.tencent.mm.plugin.appbrand.ui.recents.u0 Y;
    public boolean Z;

    /* renamed from: h, reason: collision with root package name */
    public final int f90000h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f90001i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f90002m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f90003n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.recents.m1 f90004o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appusage.c1 f90005p;

    /* renamed from: p0, reason: collision with root package name */
    public int f90006p0;

    /* renamed from: q, reason: collision with root package name */
    public final android.os.Bundle f90007q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f90008r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f90009s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f90010t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicLong f90011u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f90012v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView f90013w;

    /* renamed from: x, reason: collision with root package name */
    public androidx.recyclerview.widget.LinearLayoutManager f90014x;

    /* renamed from: x0, reason: collision with root package name */
    public android.app.Dialog f90015x0;

    /* renamed from: y, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.ui.recents.e2 f90016y;

    /* renamed from: z, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.recents.o1 f90017z;

    public AppBrandLauncherRecentsList() {
        this(true);
    }

    public static void p0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, boolean z17, long j17, boolean z18) {
        java.util.ArrayList arrayList;
        long j18;
        long j19;
        androidx.fragment.app.FragmentActivity activity;
        androidx.fragment.app.FragmentActivity activity2;
        if (appBrandLauncherRecentsList.f90012v.get() || (activity2 = appBrandLauncherRecentsList.getActivity()) == null || activity2.isFinishing()) {
            return;
        }
        com.tencent.mm.plugin.appbrand.ui.recents.o1 clone = appBrandLauncherRecentsList.f90017z.clone();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(clone) || z17) {
            synchronized (clone) {
                arrayList = clone.f90135e;
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
                j18 = 0;
                j19 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            } else {
                long j27 = ((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) arrayList.get(arrayList.size() - 1)).C;
                long max = java.lang.Math.max(((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) arrayList.get(0)).C, j17);
                j18 = j27;
                j19 = max;
            }
            l75.k0 k0Var = com.tencent.mm.plugin.appbrand.app.r9.hj().f76435f.f76428a.f76434e;
            java.util.Locale locale = java.util.Locale.US;
            java.util.ArrayList L0 = com.tencent.mm.plugin.appbrand.appusage.f3.L0(k0Var.D("AppBrandLauncherLayoutItem", null, java.lang.String.format(locale, "%s>=? and %s<=? and %s=?", dm.i4.COL_UPDATETIME, dm.i4.COL_UPDATETIME, com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE), new java.lang.String[]{java.lang.String.valueOf(j18), java.lang.String.valueOf(j19), java.lang.String.valueOf(2)}, null, null, java.lang.String.format(locale, " %s desc ", dm.i4.COL_UPDATETIME), 2));
            appBrandLauncherRecentsList.f90004o.getClass();
            java.util.ArrayList arrayList2 = appBrandLauncherRecentsList.f90002m ? new java.util.ArrayList(0) : appBrandLauncherRecentsList.f90001i ? ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).u0(-1, com.tencent.mm.plugin.appbrand.appusage.y5.ASC) : null;
            com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = new com.tencent.mm.plugin.appbrand.ui.recents.o1();
            nf.c.b(o1Var.f90134d, arrayList2);
            nf.c.b(o1Var.f90135e, L0);
            clone.size();
            o1Var.size();
            if (appBrandLauncherRecentsList.f90012v.get() || (activity = appBrandLauncherRecentsList.getActivity()) == null || activity.isFinishing()) {
                return;
            }
            if (com.tencent.mm.sdk.platformtools.t8.L0(o1Var)) {
                appBrandLauncherRecentsList.n0(new com.tencent.mm.plugin.appbrand.ui.recents.b0(appBrandLauncherRecentsList));
                appBrandLauncherRecentsList.w0();
            } else {
                if (com.tencent.mm.sdk.platformtools.t8.L0(clone)) {
                    appBrandLauncherRecentsList.n0(new com.tencent.mm.plugin.appbrand.ui.recents.g0(appBrandLauncherRecentsList, o1Var));
                    appBrandLauncherRecentsList.w0();
                    return;
                }
                androidx.recyclerview.widget.c0 a17 = androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.appbrand.ui.recents.p1(clone, o1Var), z18);
                int i17 = com.tencent.mm.plugin.appbrand.ui.recents.r0.f90142b;
                com.tencent.mm.plugin.appbrand.ui.recents.r0 r0Var = appBrandLauncherRecentsList.B;
                r0Var.a();
                r0Var.sendMessage(r0Var.obtainMessage(1, new com.tencent.mm.plugin.appbrand.ui.recents.h0(appBrandLauncherRecentsList, o1Var, a17)));
                appBrandLauncherRecentsList.w0();
            }
        }
    }

    public static void q0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, boolean z17) {
        appBrandLauncherRecentsList.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandLauncherRecentsList", "onFirstPageFetched fromSvr %b", java.lang.Boolean.valueOf(z17));
        android.app.Dialog dialog = appBrandLauncherRecentsList.f90015x0;
        if (dialog != null) {
            dialog.dismiss();
        }
        appBrandLauncherRecentsList.f90015x0 = null;
        boolean z18 = true;
        appBrandLauncherRecentsList.f90013w.m1(true);
        com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = appBrandLauncherRecentsList.f90017z;
        if (z17) {
            appBrandLauncherRecentsList.M = true;
            appBrandLauncherRecentsList.f90010t.set(false);
            appBrandLauncherRecentsList.H.a(com.tencent.mm.plugin.appbrand.appusage.c1.n0());
            com.tencent.mm.plugin.appbrand.ui.recents.o1 clone = o1Var.clone();
            com.tencent.mm.plugin.appbrand.ui.recents.o1 clone2 = o1Var.clone();
            clone2.h(arrayList, arrayList2);
            appBrandLauncherRecentsList.A.post(new com.tencent.mm.plugin.appbrand.ui.recents.d0(appBrandLauncherRecentsList, clone, clone2));
        } else {
            o1Var.h(arrayList, arrayList2);
            appBrandLauncherRecentsList.f90016y.notifyItemRangeChanged(0, o1Var.size());
            if (o1Var.size() > 0) {
                com.tencent.mm.plugin.appbrand.task.u0 C = com.tencent.mm.plugin.appbrand.task.u0.C();
                com.tencent.luggage.sdk.processes.LuggageServiceType luggageServiceType = com.tencent.luggage.sdk.processes.LuggageServiceType.f47627f;
                com.tencent.mm.plugin.appbrand.service.x6 x6Var = com.tencent.mm.plugin.appbrand.service.x6.f88825p;
                C.P(luggageServiceType, x6Var);
                com.tencent.mm.plugin.appbrand.task.u0.C().P(com.tencent.luggage.sdk.processes.LuggageServiceType.f47626e, x6Var);
                com.tencent.mm.plugin.appbrand.AppBrandRuntimeSuspendingMainProcessTriggerCheckEvent.f74857g.a(false);
                com.tencent.mm.plugin.appbrand.app.g2.Ui(com.tencent.mm.plugin.appbrand.app.t1.f75284h);
            }
            android.view.View view = appBrandLauncherRecentsList.E;
            if (view != null) {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onFirstPageFetched", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onFirstPageFetched", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (appBrandLauncherRecentsList.getActivity() != null && (appBrandLauncherRecentsList.getActivity() instanceof com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI) && appBrandLauncherRecentsList.getActivity().getIntent() != null && appBrandLauncherRecentsList.E != null && appBrandLauncherRecentsList.getActivity().getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false)) {
                com.tencent.mm.plugin.appbrand.ui.recents.r rVar = new com.tencent.mm.plugin.appbrand.ui.recents.r(appBrandLauncherRecentsList);
                android.view.View view2 = appBrandLauncherRecentsList.E;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                if (n3.x0.c(view2)) {
                    rVar.run();
                } else {
                    appBrandLauncherRecentsList.E.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.appbrand.ui.recents.s(appBrandLauncherRecentsList, rVar));
                }
            }
        }
        if ((z17 || o1Var.isEmpty()) && !z17) {
            z18 = false;
        }
        if (z18) {
            appBrandLauncherRecentsList.f90013w.getViewTreeObserver().addOnPreDrawListener(new com.tencent.mm.plugin.appbrand.ui.recents.f0(appBrandLauncherRecentsList, new com.tencent.mm.plugin.appbrand.ui.recents.e0(appBrandLauncherRecentsList)));
        }
    }

    public static void r0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList, java.util.ArrayList arrayList) {
        android.view.View view;
        java.util.ArrayList arrayList2;
        com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = appBrandLauncherRecentsList.f90017z;
        int size = o1Var.size();
        if (!com.tencent.mm.sdk.platformtools.t8.L0(arrayList)) {
            synchronized (o1Var) {
                arrayList2 = o1Var.f90135e;
            }
            arrayList2.addAll(arrayList);
            appBrandLauncherRecentsList.f90016y.notifyItemRangeInserted(size, arrayList.size());
            if (size > 0) {
                appBrandLauncherRecentsList.f90016y.notifyItemChanged(size - 1);
            }
        } else if (com.tencent.mm.plugin.appbrand.appusage.c1.n0()) {
            com.tencent.mm.plugin.appbrand.ui.recents.f1 f1Var = appBrandLauncherRecentsList.H;
            if (f1Var != null && (view = f1Var.f90075a) != null && view.isShown()) {
                appBrandLauncherRecentsList.m0(new com.tencent.mm.plugin.appbrand.ui.recents.y(appBrandLauncherRecentsList));
            }
        } else {
            appBrandLauncherRecentsList.H.a(false);
            android.view.View view2 = appBrandLauncherRecentsList.H.f90075a;
            if (view2 != null) {
                view2.post(new com.tencent.mm.plugin.appbrand.ui.recents.x(appBrandLauncherRecentsList));
            }
        }
        appBrandLauncherRecentsList.f90010t.set(false);
    }

    public static boolean s0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        if (appBrandLauncherRecentsList.f90016y.y() && ((appBrandLauncherRecentsList.G.c() == null || appBrandLauncherRecentsList.G.c().getVisibility() != 0) && appBrandLauncherRecentsList.getActivity() != null)) {
            ((zj1.a) appBrandLauncherRecentsList.getActivity()).H3(false);
            return false;
        }
        com.tencent.mm.plugin.appbrand.ui.recents.e2 e2Var = appBrandLauncherRecentsList.f90016y;
        if (e2Var != null && appBrandLauncherRecentsList.E != null) {
            if (e2Var.y()) {
                android.view.View view = appBrandLauncherRecentsList.E;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = appBrandLauncherRecentsList.E;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherShowRecentsTagOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        if (appBrandLauncherRecentsList.f90016y.y()) {
            if (appBrandLauncherRecentsList.F == null) {
                android.view.ViewGroup p07 = com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage.p0(appBrandLauncherRecentsList.getActivity(), appBrandLauncherRecentsList.getString(com.tencent.mm.R.string.f490186nb));
                appBrandLauncherRecentsList.F = p07;
                ((android.widget.FrameLayout) appBrandLauncherRecentsList.f89369g).addView(p07, 0);
                ((android.view.ViewGroup.MarginLayoutParams) appBrandLauncherRecentsList.F.getLayoutParams()).topMargin = appBrandLauncherRecentsList.G.c().getMeasuredHeight();
                appBrandLauncherRecentsList.F.requestLayout();
            }
            com.tencent.mm.plugin.appbrand.ui.recents.c cVar = appBrandLauncherRecentsList.G;
            if (cVar instanceof com.tencent.mm.plugin.appbrand.ui.recents.j1) {
                android.view.ViewGroup viewGroup = ((com.tencent.mm.plugin.appbrand.ui.recents.j1) cVar).f90101g;
                if (viewGroup.getChildCount() > 0) {
                    android.view.View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
                    if (childAt.getId() == com.tencent.mm.R.id.f483163ya) {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                        arrayList3.add(4);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "hideBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "hideBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            android.view.View view3 = appBrandLauncherRecentsList.H.f90075a;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = appBrandLauncherRecentsList.F;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view5 = appBrandLauncherRecentsList.F;
            if (view5 != null) {
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
                arrayList6.add(8);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.plugin.appbrand.ui.recents.c cVar2 = appBrandLauncherRecentsList.G;
            if (cVar2 instanceof com.tencent.mm.plugin.appbrand.ui.recents.j1) {
                android.view.ViewGroup viewGroup2 = ((com.tencent.mm.plugin.appbrand.ui.recents.j1) cVar2).f90101g;
                if (viewGroup2.getChildCount() > 0) {
                    android.view.View childAt2 = viewGroup2.getChildAt(viewGroup2.getChildCount() - 1);
                    if (childAt2.getId() == com.tencent.mm.R.id.f483163ya) {
                        java.util.ArrayList arrayList7 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal6 = zj0.c.f473285a;
                        arrayList7.add(0);
                        java.util.Collections.reverse(arrayList7);
                        yj0.a.d(childAt2, arrayList7.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "showBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt2.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                        yj0.a.f(childAt2, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsListHeaderController", "showBottomLine", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
            android.view.View view6 = appBrandLauncherRecentsList.H.f90075a;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal7 = zj0.c.f473285a;
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view6, arrayList8.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "whetherKeepShowListOrNot", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return true;
    }

    public static void t0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        java.util.ArrayList arrayList;
        if (appBrandLauncherRecentsList.M) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = appBrandLauncherRecentsList.f90010t;
            if (atomicBoolean.get()) {
                return;
            }
            java.util.concurrent.atomic.AtomicLong atomicLong = appBrandLauncherRecentsList.f90009s;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            atomicLong.set(java.lang.System.currentTimeMillis());
            if (com.tencent.mm.plugin.appbrand.appusage.c1.n0()) {
                com.tencent.mm.plugin.appbrand.appusage.c1.z0().s0(atomicLong.get(), false, appBrandLauncherRecentsList.f90007q, appBrandLauncherRecentsList.f89999J, appBrandLauncherRecentsList.K);
                atomicBoolean.set(true);
            } else {
                com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = appBrandLauncherRecentsList.f90017z;
                synchronized (o1Var) {
                    arrayList = o1Var.f90135e;
                }
                appBrandLauncherRecentsList.A.postToWorker(new com.tencent.mm.plugin.appbrand.ui.recents.w(appBrandLauncherRecentsList, com.tencent.mm.sdk.platformtools.t8.L0(arrayList) ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : ((com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo) arrayList.get(arrayList.size() - 1)).C));
            }
        }
    }

    public static void u0(com.tencent.mm.plugin.appbrand.ui.recents.AppBrandLauncherRecentsList appBrandLauncherRecentsList) {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = appBrandLauncherRecentsList.f90013w;
        int g17 = loadMoreRecyclerView.g1(loadMoreRecyclerView.q0(appBrandLauncherRecentsList.f90014x.w(), false));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView2 = appBrandLauncherRecentsList.f90013w;
        int g18 = loadMoreRecyclerView2.g1(loadMoreRecyclerView2.q0(appBrandLauncherRecentsList.f90014x.y(), false));
        com.tencent.mm.plugin.appbrand.ui.recents.o1 o1Var = appBrandLauncherRecentsList.f90017z;
        com.tencent.mm.plugin.appbrand.ui.recents.o1 clone = o1Var.clone();
        com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = appBrandLauncherRecentsList.C;
        if (c2Var.f90058d != null && c2Var.f90059e.size() < 20 && !clone.isEmpty()) {
            int max = java.lang.Math.max(g17, 0);
            int min = java.lang.Math.min(clone.size() - 1, g18) + 1;
            c2Var.f90059e.addAll(max > min ? java.util.Collections.emptyList() : clone.subList(max, min));
        }
        if (appBrandLauncherRecentsList.getActivity() == null || o1Var.size() <= 0) {
            return;
        }
        com.tencent.mm.plugin.appbrand.report.n0.f88122d.a(appBrandLauncherRecentsList.getActivity()).f87775f.addAll(kz5.n0.Q0(new e06.k(java.lang.Math.max(g17, 0), java.lang.Math.min(o1Var.size() - 1, g18))));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void initView() {
        com.tencent.mm.plugin.appbrand.ui.recents.p pVar = new com.tencent.mm.plugin.appbrand.ui.recents.p(this, getActivity(), 1, false);
        this.f90014x = pVar;
        pVar.setItemPrefetchEnabled(false);
        com.tencent.mm.plugin.appbrand.ui.recents.q qVar = new com.tencent.mm.plugin.appbrand.ui.recents.q(this, getContext());
        this.f90013w = qVar;
        qVar.setVerticalScrollBarEnabled(true);
        ((android.widget.FrameLayout) this.f89369g).addView(this.f90013w, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f90013w.N(new com.tencent.mm.plugin.appbrand.ui.recents.e1(this, null));
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f90013w;
        com.tencent.mm.plugin.appbrand.ui.recents.a2 a2Var = this.I;
        loadMoreRecyclerView.setItemAnimator(a2Var);
        com.tencent.mm.plugin.appbrand.ui.recents.u0 u0Var = this.Y;
        a2Var.I(u0Var);
        a2Var.I(this.T);
        com.tencent.mm.plugin.appbrand.ui.recents.e2 e2Var = new com.tencent.mm.plugin.appbrand.ui.recents.e2(this.f90017z);
        com.tencent.mm.plugin.appbrand.ui.recents.v0 v0Var = new com.tencent.mm.plugin.appbrand.ui.recents.v0(this, null);
        this.D = v0Var;
        e2Var.f90070d.put(com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo.class.hashCode(), v0Var);
        this.f90016y = e2Var;
        e2Var.setHasStableIds(true);
        this.f90016y.registerAdapterDataObserver(u0Var);
        this.f90013w.setAdapter(this.f90016y);
        this.f90013w.i(new com.tencent.mm.plugin.appbrand.ui.recents.d1(this, null));
        if (getArguments() == null || getArguments().getBoolean("showHeader", true)) {
            com.tencent.mm.plugin.appbrand.ui.recents.j1 j1Var = new com.tencent.mm.plugin.appbrand.ui.recents.j1(getActivity(), this.f90013w, false, false);
            this.G = j1Var;
            this.f90013w.addHeaderView(j1Var.f90101g);
            android.view.View c17 = this.G.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c17, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c17, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.G.e();
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f488083gi, (android.view.ViewGroup) this.f90013w, false);
            this.f90013w.addHeaderView(inflate);
            this.E = inflate;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "initHeader", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.G = new com.tencent.mm.plugin.appbrand.ui.recents.a(getActivity(), this.f90013w);
        }
        com.tencent.mm.plugin.appbrand.ui.recents.f1 f1Var = new com.tencent.mm.plugin.appbrand.ui.recents.f1(getContext(), this.f90013w);
        this.H = f1Var;
        f1Var.a(true);
        this.f90013w.setLoadingView(this.H.f90075a);
        this.f90013w.m1(false);
        this.H.getClass();
        this.f90013w.setOnLoadingStateChangedListener(new com.tencent.mm.plugin.appbrand.ui.recents.u(this));
        android.app.Dialog dialog = this.f90015x0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f90015x0 = null;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        android.view.View inflate2 = android.view.View.inflate(activity, com.tencent.mm.R.layout.f488141ia, null);
        com.tencent.mm.plugin.appbrand.ui.o5 o5Var = new com.tencent.mm.plugin.appbrand.ui.o5(activity, com.tencent.mm.R.style.f493926s);
        o5Var.setContentView(inflate2);
        o5Var.setCancelable(true);
        o5Var.setCanceledOnTouchOutside(false);
        o5Var.setOnCancelListener(new com.tencent.mm.plugin.appbrand.ui.l5(activity, o5Var));
        o5Var.setOnShowListener(new com.tencent.mm.plugin.appbrand.ui.m5(o5Var));
        this.f90015x0 = o5Var;
        o5Var.show();
        a2Var.f90029u = false;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f90008r.set(java.lang.System.currentTimeMillis());
        this.A.post(new com.tencent.mm.plugin.appbrand.ui.recents.a0(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void j0(android.content.Intent intent, int i17) {
        com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = this.C;
        c2Var.f90056b = intent;
        c2Var.f90055a = true;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void l0() {
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f90013w;
        if (loadMoreRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(loadMoreRecyclerView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
            loadMoreRecyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(loadMoreRecyclerView, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherRecentsList", "onTitleDoubleTap", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void o0(int i17) {
        this.f89367e = i17;
        this.f90007q.putInt("launcher_ui_enter_scene", i17);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null && getActivity().getIntent() != null) {
            this.f89999J = getActivity().getIntent().getIntExtra("extra_get_usage_reason", this.f89999J);
            this.K = getActivity().getIntent().getIntExtra("extra_get_usage_prescene", this.K);
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        final com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = this.C;
        c2Var.getClass();
        if (activity.getIntent().getBooleanExtra("extra_show_recents_from_task_bar", false)) {
            com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct();
            c2Var.f90058d = wAMainFrameEnterHistoryListExposeStruct;
            wAMainFrameEnterHistoryListExposeStruct.f61986o = activity.getIntent().getIntExtra("extra_desktop_open_session", 0);
            c2Var.f90059e = new java.util.LinkedHashSet();
            final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StartNearbyFromLauncherRecentsListEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.StartNearbyFromLauncherRecentsListEvent>(a0Var) { // from class: com.tencent.mm.plugin.appbrand.ui.recents.RecentsReporter$1
                {
                    this.__eventId = 665515391;
                }

                @Override // com.tencent.mm.sdk.event.IListener
                public boolean callback(com.tencent.mm.autogen.events.StartNearbyFromLauncherRecentsListEvent startNearbyFromLauncherRecentsListEvent) {
                    com.tencent.mm.autogen.mmdata.rpt.WAMainFrameEnterHistoryListExposeStruct wAMainFrameEnterHistoryListExposeStruct2 = com.tencent.mm.plugin.appbrand.ui.recents.c2.this.f90058d;
                    if (wAMainFrameEnterHistoryListExposeStruct2 == null || wAMainFrameEnterHistoryListExposeStruct2.f61977f > 0) {
                        return false;
                    }
                    wAMainFrameEnterHistoryListExposeStruct2.f61977f = 3L;
                    return false;
                }
            };
            c2Var.f90060f = iListener;
            iListener.alive();
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        c2Var.f90057c = java.lang.System.currentTimeMillis();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        ((cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.AppBrandLauncherUI)).Rj(this, iy1.a.MiniProgramList);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        android.app.Dialog dialog = this.f90015x0;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.f90015x0 = null;
        this.f90012v.set(true);
        int i17 = com.tencent.mm.plugin.appbrand.ui.recents.r0.f90142b;
        this.B.a();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = this.C;
        androidx.fragment.app.FragmentActivity activity = getActivity();
        if (c2Var.f90058d != null) {
            c2Var.a("onDestroy", activity);
        }
        com.tencent.mm.plugin.appbrand.ui.recents.c cVar = this.G;
        if (cVar != null) {
            cVar.f();
        }
        com.tencent.mm.plugin.appbrand.ui.recents.f1 f1Var = this.H;
        if (f1Var != null) {
            f1Var.f90076b = null;
            f1Var.f90078d = null;
        }
        com.tencent.mm.plugin.appbrand.ui.recents.e2 e2Var = this.f90016y;
        if (e2Var != null) {
            e2Var.unregisterAdapterDataObserver(this.Y);
        }
        com.tencent.mm.plugin.appbrand.ui.recents.v0 v0Var = this.D;
        if (v0Var != null) {
            ((java.util.HashMap) v0Var.f90162a).clear();
            this.D = null;
        }
        if (gm0.j1.b().f273254q && !gm0.m.r()) {
            k91.k4.g().remove(this.W);
            com.tencent.mm.plugin.appbrand.app.r9.hj().remove(this.V);
            ((com.tencent.mm.plugin.appbrand.appusage.w2) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appusage.w2.class)).remove(this.U);
            this.f90005p.remove(this.X);
        }
        this.A.removeCallbacksAndMessages(null);
        this.A.quit();
        this.f90008r.set(-1L);
        this.f90009s.set(-1L);
        this.f90010t.set(false);
        this.f90011u.set(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        this.I.J(this.Y);
        this.I.J(this.T);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        this.Z = false;
        super.onPause();
        com.tencent.mm.plugin.appbrand.ui.recents.c cVar = this.G;
        if (cVar != null) {
            cVar.g();
        }
        try {
            com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f90013w;
            if (loadMoreRecyclerView != null) {
                loadMoreRecyclerView.setLayoutFrozen(true);
            }
        } catch (java.lang.IllegalStateException unused) {
            android.os.Looper.myQueue().addIdleHandler(new com.tencent.mm.plugin.appbrand.ui.recents.n(this));
        }
        androidx.fragment.app.FragmentActivity activity = getActivity();
        com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = this.C;
        if (!c2Var.f90055a || c2Var.f90058d == null) {
            return;
        }
        c2Var.a("startActivity", activity);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        this.Z = true;
        super.onResume();
        com.tencent.mm.plugin.appbrand.widget.recyclerview.LoadMoreRecyclerView loadMoreRecyclerView = this.f90013w;
        if (loadMoreRecyclerView != null) {
            loadMoreRecyclerView.setLayoutFrozen(false);
        }
        int i17 = this.f90006p0 + 1;
        this.f90006p0 = i17;
        if (i17 > 1) {
            com.tencent.mm.plugin.appbrand.ui.recents.c cVar = this.G;
            if (cVar != null) {
                cVar.h();
            }
            m0(new com.tencent.mm.plugin.appbrand.ui.recents.q0(this));
        }
        this.P = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        this.Q = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        super.startActivityForResult(intent, i17, bundle);
        com.tencent.mm.plugin.appbrand.ui.recents.c2 c2Var = this.C;
        c2Var.f90056b = intent;
        c2Var.f90055a = true;
    }

    public final void w0() {
        try {
            synchronized (this.R) {
                this.R.wait(500L);
            }
        } catch (java.lang.InterruptedException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.AppBrandLauncherRecentsList", e17, "", new java.lang.Object[0]);
        }
    }

    public AppBrandLauncherRecentsList(boolean z17) {
        this.f90005p = com.tencent.mm.plugin.appbrand.appusage.c1.z0();
        this.f90007q = new android.os.Bundle();
        this.f90008r = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.f90009s = new java.util.concurrent.atomic.AtomicLong(-1L);
        this.f90010t = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f90011u = new java.util.concurrent.atomic.AtomicLong(com.tencent.wcdb.core.Database.DictDefaultMatchValue);
        this.f90012v = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f90017z = new com.tencent.mm.plugin.appbrand.ui.recents.o1();
        this.A = new com.tencent.mm.sdk.platformtools.n3("AppBrandLauncherUI#RecentsListUI");
        this.B = new com.tencent.mm.plugin.appbrand.ui.recents.r0(this);
        this.C = new com.tencent.mm.plugin.appbrand.ui.recents.c2();
        this.I = new com.tencent.mm.plugin.appbrand.ui.recents.a2();
        this.f89999J = 3;
        this.K = 0;
        this.L = false;
        this.M = false;
        this.P = false;
        this.Q = -1;
        this.R = new java.lang.Object();
        this.S = new com.tencent.mm.plugin.appbrand.ui.recents.i0(this);
        this.T = new com.tencent.mm.plugin.appbrand.ui.recents.s0(this, null);
        this.U = new com.tencent.mm.plugin.appbrand.ui.recents.j0(this);
        this.V = new com.tencent.mm.plugin.appbrand.ui.recents.l0(this);
        this.W = new com.tencent.mm.plugin.appbrand.ui.recents.m0(this);
        this.X = new com.tencent.mm.plugin.appbrand.ui.recents.p0(this);
        this.Y = new com.tencent.mm.plugin.appbrand.ui.recents.u0(this, null);
        this.Z = false;
        this.f90006p0 = 0;
        this.f90015x0 = null;
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putBoolean("showHeader", z17);
        setArguments(bundle);
        java.lang.Integer num = com.tencent.mm.plugin.appbrand.appusage.x2.f76645d;
        this.f90001i = true;
        this.f90002m = true;
        this.f90003n = z65.c.a() && gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_APP_BRAND_SHOW_HISTORY_COUNT_BOOLEAN, false);
        this.f90000h = com.tencent.mm.plugin.appbrand.appusage.x2.h();
        this.f90004o = new com.tencent.mm.plugin.appbrand.ui.recents.m1(false);
    }
}
