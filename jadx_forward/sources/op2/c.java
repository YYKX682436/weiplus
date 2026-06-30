package op2;

/* loaded from: classes2.dex */
public final class c extends cp2.v0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment, r45.qt2 contextObj, r45.dd2 dd2Var, java.lang.String by_pass, java.lang.String str) {
        super(activity, contextObj, by_pass, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(by_pass, "by_pass");
        this.f302466m = fragment;
        this.f302467n = dd2Var;
    }

    @Override // cp2.c
    /* renamed from: getCommentScene */
    public int mo122374x8fadefe3() {
        return this.f302461e.m75939xb282bd08(5);
    }

    @Override // cp2.v0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f302466m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(componentCallbacksC1101xa17d4670);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210 = componentCallbacksC1101xa17d4670.m7453x12a9d210();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m7453x12a9d210);
        ((op2.a) pf5.z.f435481a.b(m7453x12a9d210).a(op2.a.class)).f428770d.e();
        super.mo979x3f5eee52();
    }

    @Override // cp2.v0, cp2.c
    /* renamed from: onRefreshEnd */
    public void mo122375xb3ee2b3f(ym5.s3 reason) {
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m7453x12a9d210;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        super.mo122375xb3ee2b3f(reason);
        int mo122374x8fadefe3 = mo122374x8fadefe3();
        if (mo122374x8fadefe3 == 9500001 || mo122374x8fadefe3 == 9500002 || mo122374x8fadefe3 == 9500004 || mo122374x8fadefe3 == 9500003) {
            return;
        }
        if ((mo122374x8fadefe3() == 112) || (componentCallbacksC1101xa17d4670 = this.f302466m) == null || (m7453x12a9d210 = componentCallbacksC1101xa17d4670.m7453x12a9d210()) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07 c14513x218d4a07 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07) pf5.z.f435481a.b(m7453x12a9d210).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.C14513x218d4a07.class);
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d46702 = this.f302466m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(componentCallbacksC1101xa17d46702, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) componentCallbacksC1101xa17d46702;
        c14513x218d4a07.getClass();
        java.util.LinkedList linkedList = c14513x218d4a07.f203034o;
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (c14521x246f2bd.f203052s.m75939xb282bd08(0) == ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) it.next()).f203052s.m75939xb282bd08(0)) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        int i18 = i17 + 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd c14521x246f2bd2 = (i18 < 0 || i18 >= linkedList.size() || linkedList.size() == 0) ? null : (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1574x32b0ec.p1577xcaac591d.p1582x34628f.C14521x246f2bd) linkedList.get(i18);
        bp2.m mVar = ((op2.a) pf5.z.f435481a.b(m7453x12a9d210).a(op2.a.class)).f428770d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start delayMs:");
        int i19 = mVar.f104606b;
        sb6.append(i19);
        sb6.append(" maxCnt:");
        int i27 = mVar.f104605a;
        sb6.append(i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", sb6.toString());
        android.view.View view = mVar.f104608d;
        int[] iArr = mVar.f104609e;
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        mVar.f104610f = c14521x246f2bd2;
        int r17 = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FIRST_SHOW_NEARBY_LIVE_SQUARE_SCROLL_GUIDE_CNT_INT_SYNC, 0);
        boolean o17 = gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEVER_SCROLL_IN_LIVE_SQUARE_CNT_BOOLEAN_SYNC, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "start scrollGuideCnt:" + r17 + " isNeverScroll:" + o17 + " pos[" + iArr[0] + ", " + iArr[1] + ']');
        if (c14521x246f2bd2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "start return for nextPageFragment:" + c14521x246f2bd2);
            return;
        }
        if (!o17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "start return for isNeverScroll:" + o17);
        } else {
            if (r17 > i27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePageScrollGuideHelper", "start return for scrollGuideCnt:" + r17);
                return;
            }
            long j17 = i19;
            java.lang.Runnable runnable = mVar.f104614j;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = mVar.f104613i;
            if (runnable != null) {
                n3Var.mo50300x3fa464aa(runnable);
                mVar.f104614j = null;
            }
            bp2.l lVar = new bp2.l(mVar);
            mVar.f104614j = lVar;
            n3Var.mo50297x7c4d7ca2(lVar, j17);
        }
    }

    @Override // cp2.v0
    public int s() {
        r45.dd2 dd2Var = this.f302467n;
        return (dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0) + 15;
    }

    @Override // cp2.v0
    public int y() {
        r45.dd2 dd2Var = this.f302467n;
        return (dd2Var != null ? dd2Var.m75939xb282bd08(0) : 0) + 1001;
    }
}
