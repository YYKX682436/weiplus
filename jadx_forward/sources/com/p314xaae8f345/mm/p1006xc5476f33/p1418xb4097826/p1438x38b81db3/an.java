package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class an extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public long f184427g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 f184428h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn f184429i;

    public an(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar) {
        this.f184428h = k8Var;
        this.f184429i = ynVar;
    }

    @Override // fc2.d
    public boolean E0() {
        return false;
    }

    @Override // fc2.d
    public boolean F0(fc2.c dispatcher, fc2.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return (event instanceof ec2.f) || ((event instanceof fc2.s) && ((fc2.s) event).f342513d == 2) || (event instanceof fc2.t);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fc2.d
    public void G0(fc2.a ev6) {
        in5.s0 s0Var;
        in5.s0 s0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        boolean z17 = ev6 instanceof ec2.f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f184428h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar = this.f184429i;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl) k8Var : null;
            if (tlVar == null || (s0Var2 = tlVar.f()) == null) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = ynVar.f185890J;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4 != null ? c1163xf1deaba4.mo7946xf939df19() : null;
                com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = mo7946xf939df19 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df19 : null;
                if (c22848x6ddd90cf == null || (s0Var2 = (in5.s0) in5.n0.Y(c22848x6ddd90cf, ((ec2.f) ev6).f332498j, false, 2, null)) == null) {
                    return;
                }
            }
            ec2.f fVar = (ec2.f) ev6;
            int i17 = fVar.f332492d;
            if (i17 == 2) {
                if (fVar.f332498j == ((so2.j5) s0Var2.f374658i).mo2128x1ed62e84()) {
                    ynVar.o0(s0Var2, s0Var2.m8183xf806b362(), s0Var2.m8185xcdaf1228(), 0);
                    return;
                }
                return;
            }
            if (i17 == 3 && fVar.f332498j == ((so2.j5) s0Var2.f374658i).mo2128x1ed62e84()) {
                int i18 = fVar.f332497i;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                if (i18 > t70Var.q2() && fVar.f332496h >= t70Var.q2() / 2) {
                    java.lang.Object obj = s0Var2.f374658i;
                    so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
                    if (u1Var != null && fVar.f332496h >= t70Var.q2() && !u1Var.getIsDeepEnjoy()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", "onEventHappen: VIDEO_PROGRESS long video total = " + fVar.f332497i + ", offset = " + fVar.f332496h + ", feedId=" + pm0.v.u(fVar.f332498j));
                        ynVar.o0(s0Var2, s0Var2.m8183xf806b362(), s0Var2.m8185xcdaf1228(), 1);
                    }
                }
                if (fVar.f332496h >= ynVar.T()) {
                    java.lang.Object obj2 = s0Var2.f374658i;
                    so2.u1 u1Var2 = obj2 instanceof so2.u1 ? (so2.u1) obj2 : null;
                    if (u1Var2 == null || u1Var2.getHasShowFollowAnim()) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", "onEventHappen: VIDEO_PROGRESS ten sec enjoy offset = " + fVar.f332496h + ", feedId=" + pm0.v.u(fVar.f332498j));
                    ynVar.y0(s0Var2);
                    return;
                }
                return;
            }
            return;
        }
        if (ev6 instanceof fc2.s) {
            fc2.s sVar = (fc2.s) ev6;
            if (sVar.f342513d == 2) {
                if (sVar.f342515f != sVar.f342517h) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar2 = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl) k8Var : null;
                    if (tlVar2 != null) {
                        ynVar.p0(tlVar2.f());
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (ev6 instanceof fc2.t) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = ynVar.f185890J;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c1163xf1deaba42 != null ? c1163xf1deaba42.mo7946xf939df19() : null;
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf2 = mo7946xf939df192 instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) mo7946xf939df192 : null;
            if (c22848x6ddd90cf2 == null) {
                return;
            }
            fc2.t tVar = (fc2.t) ev6;
            int i19 = tVar.f342518d;
            if (i19 == 6) {
                if (this.f184427g != tVar.f342525k) {
                    in5.s0 s0Var3 = ynVar.f185908z;
                    if (s0Var3 != null) {
                        ynVar.z0(s0Var3, s0Var3.m8183xf806b362(), s0Var3.m8185xcdaf1228(), true);
                    }
                    long j17 = tVar.f342525k;
                    this.f184427g = j17;
                    in5.s0 s0Var4 = (in5.s0) in5.n0.Y(c22848x6ddd90cf2, j17, false, 2, null);
                    if (s0Var4 != null) {
                        ynVar.p0(s0Var4);
                    }
                }
                ynVar.R1().mo50302x6b17ad39(null);
                return;
            }
            if (i19 == 10) {
                in5.s0 s0Var5 = (in5.s0) in5.n0.Y(c22848x6ddd90cf2, tVar.f342525k, false, 2, null);
                if (s0Var5 != null) {
                    if (!(s0Var5.f374658i instanceof so2.i1)) {
                        ynVar.z0(s0Var5, s0Var5.m8183xf806b362(), s0Var5.m8185xcdaf1228(), false);
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLongVideoConvert", "FinderFeedLiveList info:lastCenterFeedId:" + this.f184427g);
                    return;
                }
                return;
            }
            if (i19 != 9) {
                if (i19 != 0 || (s0Var = (in5.s0) in5.n0.Y(c22848x6ddd90cf2, tVar.f342525k, false, 2, null)) == null) {
                    return;
                }
                ynVar.x0(tVar.f342525k, s0Var);
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = ynVar.f185890J;
            if (c1163xf1deaba43 != null) {
                int childCount = c1163xf1deaba43.getChildCount();
                for (int i27 = 0; i27 < childCount; i27++) {
                    android.view.View childAt = c1163xf1deaba43.getChildAt(i27);
                    if ((childAt != null && childAt.getVisibility() == 0) == false && childAt != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(childAt, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert$1", "onEventHappen", "(Lcom/tencent/mm/plugin/finder/event/base/Event;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
            }
        }
    }

    @Override // fc2.d
    public void H0() {
        this.f184429i.R1().mo50302x6b17ad39(null);
    }
}
