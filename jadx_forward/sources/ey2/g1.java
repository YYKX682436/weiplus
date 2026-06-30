package ey2;

/* loaded from: classes2.dex */
public final class g1 extends pf5.o0 implements xy2.j {

    /* renamed from: g, reason: collision with root package name */
    public r45.sd4 f338911g;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f338909e = jz5.h.b(ey2.c1.f338864d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f338912h = jz5.h.b(ey2.f1.f338904d);

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f338913i = jz5.h.b(ey2.e1.f338888d);

    /* renamed from: f, reason: collision with root package name */
    public int f338910f = gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_SWITCH_INT_SYNC, 0);

    public g1() {
        this.f338911g = new r45.sd4();
        try {
            this.f338911g = new r45.sd4();
            this.f338911g.mo11468x92b714fd(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(gm0.j1.u().c().v(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_INFO_STRING_SYNC, "")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.LongVideoVM", e17, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LongVideoVM", "init long video switch:" + this.f338910f);
    }

    public final java.util.List N6() {
        return (java.util.List) ((jz5.n) this.f338913i).mo141623x754a37bb();
    }

    public void O6(r45.xb1 resp) {
        java.lang.Object obj;
        r45.sd4 sd4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(30);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getFinder_config_item(...)");
        java.util.Iterator it = m75941xfb821914.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yy0) obj).m75945x2fec8307(0), "longvideo_info")) {
                    break;
                }
            }
        }
        r45.yy0 yy0Var = (r45.yy0) obj;
        if (yy0Var != null) {
            sd4Var = new r45.sd4();
            com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f = yy0Var.m75934xbce7f2f(1);
            if (m75934xbce7f2f != null) {
                sd4Var.mo11468x92b714fd(m75934xbce7f2f.g());
            }
        } else {
            sd4Var = new r45.sd4();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LongVideoVM", "modify longVideoInfo");
        this.f338911g = sd4Var;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_INFO_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(sd4Var.mo14344x5f01b1f6()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.R1).mo141623x754a37bb()).r()).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LongVideoVM", "modify switchValue from " + this.f338910f + " to " + intValue);
        this.f338910f = intValue;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LONG_VIDEO_SWITCH_INT_SYNC, java.lang.Integer.valueOf(this.f338910f));
    }

    public void P6(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LongVideoVM", "removeSeeLaterFeed ".concat(pm0.v.u(j17)));
        ((java.util.HashSet) ((jz5.n) this.f338912h).mo141623x754a37bb()).remove(java.lang.Long.valueOf(j17));
        java.util.List N6 = N6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(N6, "<get-seeLaterFeedList>(...)");
        pm0.v.c0(N6, new ey2.d1(j17));
    }

    public void Q6(so2.j5 feed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        if (feed instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
            N6().add(feed);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LongVideoVM", "saveSeeLaterFeed " + pm0.v.u(feed.mo2128x1ed62e84()) + ", map size=" + N6().size());
        ((java.util.HashSet) ((jz5.n) this.f338912h).mo141623x754a37bb()).add(java.lang.Long.valueOf(feed.mo2128x1ed62e84()));
    }

    @Override // pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LongVideoVM", "onCleared long video switch:" + this.f338910f);
        super.mo528x82b764cd();
    }
}
