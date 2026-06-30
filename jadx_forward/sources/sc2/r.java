package sc2;

/* loaded from: classes2.dex */
public final class r extends sc2.f2 {
    public java.lang.String A;
    public double B;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f487713z = "CNYFeedLoadingJumperObserver";

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        f(250L, jumpView, z17, aVar);
        e(true, z17);
        ((com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eae)).setVisibility(0);
    }

    @Override // sc2.f2, ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? info.m76490xf00280e() == 3 ? gs2.a.f356585h : gs2.a.f356587m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487713z;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        g(250L, jumpView, z17, aVar);
        e(false, z17);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eae);
        c22789xd23e9a9b.setVisibility(8);
        c22789xd23e9a9b.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.xa4 xa4Var;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        cl0.g gVar;
        r45.wf6 wf6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var2 = this.f84682m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = infoEx.f534767a;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e28622.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).m75939xb282bd08(2) == 11) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        if (!o(holder, c19786x6a1e28622)) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487713z, "[onBindView] priority not ok");
            return;
        }
        if (wf6Var2 == null || (xa4Var = (r45.xa4) wf6Var2.m75936x14adae67(17)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eae);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        cw2.da videoView = c15196x85976f5f != null ? c15196x85976f5f.getVideoView() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
        int mo56686xe906e26b = (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(source, "timeline") || c15188xd8bd4bd == null) ? 0 : c15188xd8bd4bd.mo56686xe906e26b();
        int i17 = infoEx.F - infoEx.E;
        if ((c22789xd23e9a9b != null ? c22789xd23e9a9b.m82574xa7d55074() : null) == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.A, xa4Var.m75945x2fec8307(0))) {
            if (c22789xd23e9a9b != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                c22789xd23e9a9b.o(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Jg).mo141623x754a37bb()).r()).booleanValue());
            }
            c22789xd23e9a9b.m82583xcde73672(1);
            boolean z17 = c22789xd23e9a9b.getUseRfx();
            android.content.Context context = holder.f374654e;
            if (z17) {
                c22789xd23e9a9b.mo82566x3e3ac3e8(com.p314xaae8f345.mm.rfx.C20942x379cf5ee.m77390x243906(context.getAssets(), "cny_redpack_loading.pag"));
            } else {
                c22789xd23e9a9b.mo82568x3e3ac3e8(org.p3363xbe4143f1.C29690xfae77312.m154715x243906(context.getAssets(), "cny_redpack_loading.pag"));
            }
            holder.j();
            p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new sc2.p(c22789xd23e9a9b, xa4Var, this, null), 3, null);
            }
            if (mo56686xe906e26b < infoEx.E || mo56686xe906e26b >= infoEx.F) {
                c19786x6a1e2862 = c19786x6a1e28622;
            } else {
                c19786x6a1e2862 = c19786x6a1e28622;
                c22789xd23e9a9b.m82582x3ae760af((((r14 - i17) + mo56686xe906e26b) - infoEx.E) / (c22789xd23e9a9b.c() / 1000000));
            }
            c22789xd23e9a9b.g();
        } else {
            c19786x6a1e2862 = c19786x6a1e28622;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        xc2.p0 p0Var = this.f84680h;
        xc2.o0 o0Var = p0Var != null ? p0Var.f534779h : null;
        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
        java.lang.Object opt = (pVar == null || (gVar = pVar.f534760f) == null) ? null : gVar.opt("report_extra_data");
        if (opt == null) {
            opt = "";
        }
        android.content.Context context2 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).V6();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(jumpView, "red_preview_icon");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(jumpView, 40, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(jumpView, new sc2.q(mo2128x1ed62e84, opt, V6));
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eaf);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xa4Var.m75945x2fec8307(1))) {
            if (textView != null) {
                textView.setText(xa4Var.m75945x2fec8307(1));
            }
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else if (textView != null) {
            textView.setVisibility(8);
        }
        gs2.c.f356605a.e(holder, jumpView, j(c19786x6a1e2862), c19786x6a1e2862.m76480xe2ee1ca3() == 2);
    }

    @Override // ad2.h
    public void y(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.y(holder, jumpView, infoEx, event);
        int i17 = event.f332492d;
        if (i17 == 11) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eae);
            this.B = c22789xd23e9a9b.m82577x402effa3();
            c22789xd23e9a9b.n();
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eae);
            if (c22789xd23e9a9b2.f()) {
                return;
            }
            double m82577x402effa3 = c22789xd23e9a9b2.m82577x402effa3();
            double d17 = this.B;
            if (m82577x402effa3 == d17) {
                c22789xd23e9a9b2.m82582x3ae760af(d17);
                c22789xd23e9a9b2.g();
            }
        }
    }

    @Override // ad2.h
    public void z(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.z(holder, jumpView, infoEx, i17);
        if (i17 < infoEx.E || i17 >= infoEx.F) {
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eae);
        long c17 = c22789xd23e9a9b.c() / 1000000;
        if (java.lang.Math.abs((((i17 * 1000) * 1000) - infoEx.E) - (((int) (c22789xd23e9a9b.m82577x402effa3() * c22789xd23e9a9b.c())) - ((((int) (c17 - (infoEx.F - infoEx.E))) * 1000) * 1000))) >= 1000000) {
            c22789xd23e9a9b.m82582x3ae760af(((i17 + r12) - infoEx.E) / c17);
        }
        if (c22789xd23e9a9b.f()) {
            return;
        }
        c22789xd23e9a9b.g();
    }
}
