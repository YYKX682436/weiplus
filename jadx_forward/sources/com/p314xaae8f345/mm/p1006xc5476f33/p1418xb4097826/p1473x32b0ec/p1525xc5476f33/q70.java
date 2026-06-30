package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class q70 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 f195500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 f195501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f195502f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var, java.util.List list) {
        super(0);
        this.f195500d = v70Var;
        this.f195501e = gp0Var;
        this.f195502f = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.v70 v70Var = this.f195500d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var = v70Var.f196216q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var2 = this.f195501e;
        if (gp0Var == gp0Var2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "curState targetState same");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194257d;
            if (gp0Var2 == gp0Var3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "showStatePanel: targetState:" + gp0Var2);
            } else if (((mm2.o4) v70Var.P0(mm2.o4.class)).f410863x0 || !(gp0Var2 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194259f || gp0Var2 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194260g)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showStatePanel: curState:");
                sb6.append(v70Var.f196216q);
                sb6.append(" ,targetState:");
                sb6.append(gp0Var2);
                sb6.append(", contactList size:");
                java.util.List list = this.f195502f;
                sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var4 = v70Var.f196216q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553 c14314xae44553 = v70Var.f196217r;
                if (gp0Var4 == gp0Var3) {
                    v70Var.K0(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c14314xae44553, "access$getContentView$p(...)");
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14314xae44553.D;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFloatContainerV2", "showStatePanel: animate:true,currentState:" + c14314xae44553.f197406d);
                    if (c14314xae44553.f197406d == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v4.f198265e) {
                        c14314xae44553.k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.v4.f198266f);
                        c14314xae44553.setVisibility(0);
                        c14314xae44553.getViewTreeObserver().addOnGlobalLayoutListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.d5(c14314xae44553, true, null));
                    }
                }
                v70Var.f196216q = gp0Var2;
                v70Var.t1();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var5 = v70Var.f196216q;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0 gp0Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194258e;
                android.view.ViewGroup viewGroup = v70Var.f196221v;
                android.view.ViewGroup viewGroup2 = v70Var.f196219t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14327xf6cdefc6 c14327xf6cdefc6 = v70Var.f196224y;
                if (gp0Var5 == gp0Var6) {
                    ml2.q2 q2Var = ml2.q2.f409356l1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 58 ");
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
                    ((mm2.o4) v70Var.P0(mm2.o4.class)).f410863x0 = true;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "startMatch");
                    v70Var.N = list;
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = v70Var.f196225z;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(c1163xf1deaba4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "Undefined", "scrollToPosition", "(I)V");
                    v70Var.A.setVisibility(0);
                    android.view.View view = v70Var.B;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin", "startMatch", "(Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    v70Var.u1();
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.f0();
                    if (v70Var.F == null) {
                        v70Var.F = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r70(v70Var, f0Var), true);
                    }
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = v70Var.F;
                    if (b4Var != null) {
                        b4Var.c(400L, 400L);
                    }
                    android.view.View view2 = v70Var.f196218s;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c14327xf6cdefc6.setVisibility(0);
                    viewGroup2.setVisibility(8);
                    viewGroup.setVisibility(8);
                    c14314xae44553.c(true);
                } else if (gp0Var5 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194259f) {
                    ml2.q2 q2Var2 = ml2.q2.Z;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 54 ");
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var2, "", -1, -1);
                    android.view.View view3 = v70Var.f196218s;
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList4.add(0);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c14327xf6cdefc6.setVisibility(8);
                    viewGroup2.setVisibility(0);
                    viewGroup.setVisibility(8);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "stopRandomMatchConnectingTimer");
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = v70Var.V;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    v70Var.V = null;
                    ((mm2.o4) v70Var.P0(mm2.o4.class)).S7();
                    c14314xae44553.c(true);
                } else if (gp0Var5 == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.gp0.f194260g) {
                    ml2.q2 q2Var3 = ml2.q2.f409375y1;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicReportUtil", "report21054 op: 62 ");
                    ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var3, "", -1, -1);
                    android.view.View view4 = v70Var.f196218s;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList5.add(4);
                    java.util.Collections.reverse(arrayList5);
                    yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveRandomMatchLinkMicStatePlugin$showStatePanel$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    c14327xf6cdefc6.setVisibility(8);
                    viewGroup2.setVisibility(8);
                    viewGroup.setVisibility(0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "startRandomMatchConnectingTimer");
                    p3325xe03a0797.p3326xc267989b.r2 r2Var2 = v70Var.V;
                    if (r2Var2 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                    }
                    mm2.o4 o4Var = (mm2.o4) v70Var.P0(mm2.o4.class);
                    if (o4Var.f410848l1 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "startRandomMatchConnectingTimer timer is not null");
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveLinkMicSlice", "startRandomMatchConnectingTimer");
                        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var2 = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new mm2.n4(java.lang.System.currentTimeMillis(), o4Var), true);
                        o4Var.f410848l1 = b4Var2;
                        b4Var2.c(1000L, 1000L);
                    }
                    v70Var.V = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.e(v70Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.t70(v70Var, null), 3, null);
                    c14314xae44553.c(true);
                    v70Var.t1();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h70 h70Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.h70(v70Var);
                    v70Var.T = h70Var;
                    v70Var.R.postDelayed(h70Var, 5000L);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRandomMatchLinkMicStatePlugin", "skip showStatePanel: isInChattingMode:" + ((mm2.o4) v70Var.P0(mm2.o4.class)).f410863x0);
            }
        }
        return jz5.f0.f384359a;
    }
}
