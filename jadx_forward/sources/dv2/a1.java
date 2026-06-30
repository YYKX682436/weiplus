package dv2;

/* loaded from: classes2.dex */
public final class a1 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f325339d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f325340e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f325341f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f325342g;

    /* renamed from: h, reason: collision with root package name */
    public aw2.n f325343h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f325344i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.c1() != 1 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Cb).mo141623x754a37bb()).r()).intValue() != 1) {
            z17 = false;
        }
        this.f325339d = z17;
        this.f325340e = new java.util.ArrayList();
        this.f325341f = "";
    }

    public static final int O6(dv2.a1 a1Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de) {
        a1Var.getClass();
        int t17 = c1162x665295de.t();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRedPackCoverUIC", "[findFirstCompletelyVisibleItemPosition] pos:" + t17);
        if (t17 < 0) {
            return 0;
        }
        return t17;
    }

    public final r45.m66 P6(int i17) {
        r45.m66 m66Var = new r45.m66();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
        c19786x6a1e2862.m76548x666e700a("abcdefg");
        c19786x6a1e2862.m76527x75c48317(8);
        java.util.LinkedList<r45.wf6> linkedList = new java.util.LinkedList<>();
        r45.wf6 wf6Var = new r45.wf6();
        wf6Var.set(2, 15);
        wf6Var.set(1, 1);
        r45.v50 v50Var = new r45.v50();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        r45.wf6 wf6Var2 = new r45.wf6();
        wf6Var2.set(2, 0);
        r45.iw4 iw4Var = new r45.iw4();
        iw4Var.set(0, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_red_33083e7d0307413dbeac8f9cdd22ba66.png");
        iw4Var.set(1, "领取红包封面");
        wf6Var2.set(3, iw4Var);
        linkedList2.add(wf6Var2);
        r45.wf6 wf6Var3 = new r45.wf6();
        wf6Var3.set(2, 5);
        wf6Var3.set(11, 5);
        r45.su suVar = new r45.su();
        suVar.set(0, "https://mmcomm.qpic.cn/wx_redskin/srAemkSSszmqgpIypB1o8wY0ENmzDLb2BIzhJugRaAKMsoTAAxawbYUX3xfjouQK/");
        suVar.set(1, "领取wo购物日记的红包封面");
        suVar.set(2, "23123人已领取");
        suVar.set(4, "领取");
        suVar.set(8, "#FFFFFF");
        suVar.set(7, "#282828");
        wf6Var3.set(8, suVar);
        linkedList2.add(wf6Var3);
        v50Var.set(0, linkedList2);
        wf6Var.set(24, v50Var);
        linkedList.add(wf6Var);
        c19786x6a1e2862.m76568x53b6de6f(linkedList);
        m66Var.set(3, c19786x6a1e2862);
        m66Var.set(0, "https://mmcomm.qpic.cn/wx_redskin/srAemkSSszmqgpIypB1o8wY0ENmzDLb2BIzhJugRaAKMsoTAAxawbYUX3xfjouQK/");
        m66Var.set(1, "https://dldir1v6.qq.com/weixin/checkresupdate/icons_filled_red_33083e7d0307413dbeac8f9cdd22ba66.png");
        m66Var.set(2, java.lang.Integer.valueOf(i17));
        return m66Var;
    }

    public final void Q6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 item) {
        java.util.LinkedList<r45.wf6> m76521x7528c3fb;
        r45.wf6 wf6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean z17 = true;
        if (!(this.f325339d && (this.f325340e.isEmpty() ^ true))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRedPackCoverUIC", "onEnterPreviewUI disable");
            return;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f325342g;
        if (c19786x6a1e2862 == null || (m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb()) == null || (wf6Var = (r45.wf6) kz5.n0.Z(m76521x7528c3fb)) == null) {
            return;
        }
        int m75939xb282bd08 = wf6Var.m75939xb282bd08(1);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        if ((m158354x19263085 instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085 : null) == null) {
            return;
        }
        item.m59234x84f51d21().set(3, 0);
        item.m59234x84f51d21().set(0, "");
        item.m59234x84f51d21().set(1, "");
        long m59233x87980ca = item.m59233x87980ca();
        if (item.getFeedObject().m76752x103fd925() == 0) {
            item.getFeedObject().m76845x3750d31(4);
        }
        java.lang.String m76501xf2fd2296 = c19786x6a1e2862.m76501xf2fd2296();
        if (m76501xf2fd2296 != null && m76501xf2fd2296.length() != 0) {
            z17 = false;
        }
        if (z17) {
            c19786x6a1e2862.m76548x666e700a(m59233x87980ca + "_business_type_" + c19786x6a1e2862.m76480xe2ee1ca3());
        }
        p012xc85e97e9.p093xedfae76a.j0 W6 = ((xc2.k0) pf5.u.f435469a.e(zy2.b6.class).a(xc2.k0.class)).W6(m59233x87980ca, 62, item.m59229xb5af1dd5());
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(c19786x6a1e2862);
        xc2.t tVar = new xc2.t(62, m59233x87980ca, m75939xb282bd08, linkedList, false, null, 48, null);
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add(tVar);
        W6.mo7808x76db6cb1(hashSet);
    }

    public final void R6() {
        if (!this.f325339d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostRedPackCoverUIC", "request red pack cover is disable");
            return;
        }
        java.lang.String e17 = xy2.c.e(m158354x19263085());
        pq5.g l17 = new db2.i2(e17).l();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) m158354x19263085);
        l17.K(new dv2.v0(e17, this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        R6();
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
        if (this.f325340e.isEmpty()) {
            R6();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.c1() != 1 && ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Cb).mo141623x754a37bb()).r()).intValue() != 1) {
            z17 = false;
        }
        this.f325339d = z17;
        this.f325340e = new java.util.ArrayList();
        this.f325341f = "";
    }
}
