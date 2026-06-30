package sp2;

/* loaded from: classes2.dex */
public final class y0 implements sp2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492817a;

    public y0(sp2.o2 o2Var) {
        this.f492817a = o2Var;
    }

    @Override // sp2.k
    public java.util.List a() {
        return sp2.o2.c(this.f492817a, "getOutsideAllContainerContextList");
    }

    @Override // sp2.k
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = this.f492817a.f492672j;
        if (c14595xffb7e034 != null) {
            return c14595xffb7e034;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
        throw null;
    }

    @Override // sp2.k
    public void c(android.os.Bundle chnlExtraBundle, so2.j5 j5Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chnlExtraBundle, "chnlExtraBundle");
        sp2.o2.a(this.f492817a, j5Var, chnlExtraBundle);
    }

    @Override // sp2.k
    public void d(vp2.s data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "onSingEntranceClick: 处理唱一唱入口点击");
        sp2.o2 o2Var = this.f492817a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        rq2.w wVar = (rq2.w) pf5.z.f435481a.a(activity).a(rq2.w.class);
        cl0.g gVar = new cl0.g();
        gVar.s("sing_num", java.lang.Integer.valueOf(sp2.o2.d(o2Var, data.f520487d.m75945x2fec8307(2))));
        boolean z17 = true;
        java.lang.String m75945x2fec8307 = o2Var.f492660d.m75945x2fec8307(1);
        java.lang.String gVar2 = gVar.toString();
        wVar.Q6(m75945x2fec8307, "live_square_sing_btn", gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
        sp2.d3 d3Var = o2Var.D;
        if (d3Var != null) {
            by1.d b17 = by1.c.f117886b.a().b("nearby_live_ktv_cache", new aq2.h("nearby_live_ktv_cache", null));
            aq2.h hVar = b17 instanceof aq2.h ? (aq2.h) b17 : null;
            if (hVar == null) {
                hVar = new aq2.h("nearby_live_ktv_cache", null);
            }
            boolean z18 = hVar.f117894b != null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearLiveKtvCache", "isKtvCacheValid: 缓存有效性=" + z18);
            if (z18) {
                java.util.LinkedList linkedList = (java.util.LinkedList) hVar.f117894b;
                if (linkedList != null && !linkedList.isEmpty()) {
                    z17 = false;
                }
                if (!z17) {
                    linkedList.size();
                    d3Var.c(linkedList);
                    hVar.f117894b = null;
                    hVar.f117895c = 0L;
                    return;
                }
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d3Var.f492540a;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = abstractActivityC21394xb3d2c0cf instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? abstractActivityC21394xb3d2c0cf : null;
            if (abstractActivityC21394xb3d2c0cf2 != null) {
                d3Var.d(abstractActivityC21394xb3d2c0cf2);
            }
            new cq2.e().a(d3Var.f492543d, new sp2.v2(d3Var));
        }
    }

    @Override // sp2.k
    public int e() {
        r45.s92 s92Var;
        r45.dk2 dk2Var = this.f492817a.A;
        if (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) {
            return 0;
        }
        return s92Var.m75939xb282bd08(1);
    }

    @Override // sp2.k
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f() {
        r45.dk2 dk2Var = this.f492817a.A;
        if (dk2Var != null) {
            return dk2Var.m75934xbce7f2f(6);
        }
        return null;
    }

    @Override // sp2.k
    public r45.dk2 g() {
        return this.f492817a.A;
    }

    @Override // sp2.k
    public void h(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i18, yz5.l gciListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(gciListener, "gciListener");
        int i19 = i18 > 0 ? i18 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "loadData: InnerAdapterLinkOutsideOperator, containerId=" + i17 + ", pullType=" + i19 + ", containerNextPagePullType=" + i18);
        rq2.o oVar = rq2.o.f480380a;
        rq2.o.f480389j = true;
        sp2.o2.w(this.f492817a, false, i17, i19, 0L, gciListener, null, null, null, 232, null);
    }

    @Override // sp2.k
    public boolean i() {
        return this.f492817a.v();
    }

    @Override // sp2.k
    public void j(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = this.f492817a.f492672j;
        if (c14595xffb7e034 != null) {
            c14595xffb7e034.m58541xc7d4965e(z17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
    }

    @Override // sp2.k
    public boolean k() {
        return ((r40.i) ((tc.e) i95.n0.c(tc.e.class))).Bi();
    }

    @Override // sp2.k
    public void l(so2.j5 feed, int i17, org.json.JSONObject jsonObject) {
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        cq2.r rVar = cq2.r.f302977a;
        sp2.o2 o2Var = this.f492817a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
        r45.dk2 dk2Var = o2Var.A;
        rVar.a(abstractActivityC21394xb3d2c0cf, i17, feed, jsonObject, (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? 0 : 0, (r21 & 128) != 0 ? true : o2Var.v());
        o2Var.i(jsonObject, feed);
    }

    @Override // sp2.k
    public r45.h81 m() {
        this.f492817a.getClass();
        return null;
    }

    @Override // sp2.k
    public void n(dk2.ic option, int i17, vp2.h0 item) {
        dk2.bc bcVar;
        dk2.hc hcVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(option, "option");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        sp2.o2 o2Var = this.f492817a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((so2.j5) kz5.n0.a0(o2Var.f492678m, i17), item)) {
            o2Var.f492678m.remove(i17);
            up2.h hVar = o2Var.f492684p;
            if (hVar != null) {
                hVar.m8155x27702c4(i17);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "commitNpsCardOption: " + option + " pos=" + i17);
        try {
            bcVar = item.f520458e;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveEntranceFragmentViewCallback", "commitNpsCardOption: " + e17);
        }
        if (bcVar != null && (hcVar = bcVar.f314789c) != null) {
            dk2.dc dcVar = item.f520459f;
            if (dcVar != null) {
                dcVar.c(hcVar);
            }
            dk2.dc dcVar2 = item.f520459f;
            if (dcVar2 != null) {
                dcVar2.b(hcVar, kz5.b0.c(option));
            }
            dk2.hc hcVar2 = option.f315157c;
            if (hcVar2 == null) {
                item.a(o2Var.f492654a, i17);
                return;
            }
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(hcVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollQuestion");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.pt(abstractActivityC21394xb3d2c0cf, hcVar2, new sp2.u0(item), new sp2.v0(item, o2Var, i17), new sp2.w0(item, o2Var, i17)), null, false, 0, 7, null);
            try {
                dk2.dc dcVar3 = item.f520459f;
                if (dcVar3 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(hcVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.model.FinderLiveQcPollQuestion");
                    dcVar3.d(hcVar2);
                }
                item.c(o2Var.f492654a);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.LiveEntranceFragmentViewCallback", "onDismissedWithoutResponse: " + e18);
            }
        }
    }

    @Override // sp2.k
    public void o(so2.j5 item, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: container feed list empty, removing container. item.hashCode=" + item.hashCode() + ", itemType=" + item.getClass().getSimpleName() + ", containerId=" + i17);
        sp2.o2 o2Var = this.f492817a;
        java.util.Iterator it = o2Var.f492678m.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((so2.j5) it.next(), item)) {
                break;
            } else {
                i18++;
            }
        }
        if (i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: container not found in dataList");
            return;
        }
        o2Var.f492678m.remove(i18);
        up2.h hVar = o2Var.f492684p;
        if (!(hVar instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf)) {
            hVar = null;
        }
        int a07 = hVar != null ? hVar.a0() : 0;
        up2.h hVar2 = o2Var.f492684p;
        if (hVar2 != null) {
            hVar2.m8155x27702c4(a07 + i18);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: removed container at index=" + i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "[NearbyEndLive] onContainerFeedListEmpty: removed " + kz5.h0.B(o2Var.f492682o, new sp2.x0(i17)) + " container(s) from cardContainerList, containerId=" + i17);
        sp2.o2.b(o2Var);
    }

    @Override // sp2.k
    public void p(vp2.s data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "onChatEntranceClick: 处理聊一聊入口点击");
        sp2.o2 o2Var = this.f492817a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = o2Var.f492654a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f435481a;
        rq2.w wVar = (rq2.w) zVar.a(activity).a(rq2.w.class);
        cl0.g gVar = new cl0.g();
        gVar.s("chat_num", java.lang.Integer.valueOf(sp2.o2.d(o2Var, data.f520487d.m75945x2fec8307(2))));
        java.lang.String m75945x2fec8307 = o2Var.f492660d.m75945x2fec8307(1);
        java.lang.String gVar2 = gVar.toString();
        wVar.Q6(m75945x2fec8307, "live_square_chat_btn", gVar2 != null ? r26.i0.t(gVar2, ",", ";", false) : null);
        i95.m c17 = i95.n0.c(zy2.zb.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity2 = o2Var.f492654a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
        zy2.zb.qd(zbVar, 2, 17, ((im2.p4) ((zy2.m8) zVar.a(activity2).c(zy2.m8.class))).f374030q.f544543c, null, 8, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", "report21017ForAnchorLivePath chat entrance click success");
        sp2.d3 d3Var = o2Var.D;
        if (d3Var != null) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = d3Var.f492540a;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xy2.c.e(abstractActivityC21394xb3d2c0cf))) {
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new sp2.s2(d3Var, abstractActivityC21394xb3d2c0cf, null), 3, null);
                return;
            }
            sp2.p pVar = new sp2.p(d3Var.f492540a, d3Var.f492544e, d3Var.f492545f, new sp2.a3(d3Var), sp2.b3.f492522d);
            pVar.f492709h = sp2.z2.f492832d;
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.e3) ((jz5.n) pVar.f492707f).mo141623x754a37bb()).i();
            i95.m c18 = i95.n0.c(zy2.zb.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb.qd((zy2.zb) c18, 17, pVar.f492704c, pVar.f492703b, null, 8, null);
        }
    }

    @Override // sp2.k
    public org.json.JSONObject q(android.view.View view, int i17, so2.j5 feed) {
        org.json.JSONObject d17;
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        cq2.r rVar = cq2.r.f302977a;
        sp2.o2 o2Var = this.f492817a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o2Var.f492654a;
        r45.dk2 dk2Var = o2Var.A;
        d17 = rVar.d(abstractActivityC21394xb3d2c0cf, i17, feed, (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 16) != 0 ? 0 : 0, (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? true : o2Var.v(), (r21 & 128) != 0);
        o2Var.i(d17, feed);
        return d17;
    }
}
