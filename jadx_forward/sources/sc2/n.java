package sc2;

/* loaded from: classes2.dex */
public final class n extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487620w = "CNYFeedBariableButtonJumperObserver";

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f487621x;

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        android.view.View a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        xc2.p0 p0Var = this.f84680h;
        if (p0Var != null) {
            G(p0Var, jumpView);
        }
        e(true, z17);
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue()) {
            in5.s0 s0Var = this.f84681i;
            if (s0Var != null) {
                bw2.o oVar = bw2.o.f106402a;
                a17 = ((bw2.t) ((yz5.l) ((jz5.n) bw2.o.f106413l).mo141623x754a37bb()).mo146xb9724478(s0Var)).a();
            }
            a17 = null;
        } else {
            in5.s0 s0Var2 = this.f84681i;
            if (s0Var2 != null) {
                a17 = s0Var2.p(com.p314xaae8f345.mm.R.id.e_2);
            }
            a17 = null;
        }
        if (a17 == null) {
            return;
        }
        int dimensionPixelOffset = holder.f374654e.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        android.view.ViewTreeObserver viewTreeObserver = a17.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(new sc2.k(a17, jumpView, dimensionPixelOffset));
        }
        f(500L, jumpView, z17, aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.Object] */
    public final void G(xc2.p0 p0Var, android.view.View view) {
        r45.xd xdVar;
        java.lang.Object obj;
        r45.fq fqVar;
        r45.wf6 wf6Var;
        r45.wf6 wf6Var2 = this.f84682m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).m75939xb282bd08(2) == 13) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        if (wf6Var2 == null || (xdVar = (r45.xd) wf6Var2.m75936x14adae67(21)) == null) {
            return;
        }
        fe0.t3 t3Var = (fe0.t3) i95.n0.c(fe0.t3.class);
        java.lang.String m76492xa70ddde9 = p0Var.f534767a.m76492xa70ddde9();
        ((ee0.p3) t3Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.j0.d(m76492xa70ddde9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ^ true ? 2 : 1;
        java.util.LinkedList m75941xfb821914 = xdVar.m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getBraiable_button_list(...)");
        java.util.Iterator it6 = m75941xfb821914.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it6.next();
                if (((r45.wd) obj).m75939xb282bd08(0) == i17) {
                    break;
                }
            }
        }
        r45.wd wdVar = (r45.wd) obj;
        if (wdVar == null || (fqVar = (r45.fq) wdVar.m75936x14adae67(1)) == null) {
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.eez);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.eey);
        if (textView != null) {
            textView.setText(fqVar.m75945x2fec8307(0));
        }
        if (findViewById != null) {
            try {
                findViewById.setBackgroundColor(android.graphics.Color.parseColor(fqVar.m75945x2fec8307(2)));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CNYFeedBariableButton", th6, "parse color crash, bg_color=" + fqVar.m75945x2fec8307(2) + "， font_color=" + fqVar.m75945x2fec8307(1), new java.lang.Object[0]);
            }
        }
        if (textView != null) {
            textView.setTextColor(android.graphics.Color.parseColor(fqVar.m75945x2fec8307(1)));
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView != null ? textView.getPaint() : null, 0.8f);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBindView refreshButtonStatus buttonTv=");
        sb6.append((java.lang.Object) (textView != null ? textView.getText() : null));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487620w, sb6.toString());
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? info.m76490xf00280e() == 3 ? gs2.a.f356585h : gs2.a.f356587m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487620w;
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
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        cl0.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.Object obj = null;
        if (this.f487621x == null) {
            android.content.Context context = jumpView.getContext();
            final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d> abstractC20980x9b9ad01d = abstractActivityC21394xb3d2c0cf != null ? new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d>(abstractActivityC21394xb3d2c0cf) { // from class: com.tencent.mm.plugin.finder.feed.component.CNYFeedBariableButtonJumperObserver$createListener$1
                {
                    this.f39173x3fe91575 = 1918656061;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d c5452xdae2de4d) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d event = c5452xdae2de4d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    ((ku5.t0) ku5.t0.f394148d).B(new sc2.j(this));
                    return true;
                }
            } : null;
            this.f487621x = abstractC20980x9b9ad01d;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48813x58998cd();
            }
        }
        G(infoEx, jumpView);
        xc2.p0 p0Var = this.f84680h;
        xc2.o0 o0Var = p0Var != null ? p0Var.f534779h : null;
        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
        if (pVar != null && (gVar = pVar.f534760f) != null) {
            obj = gVar.opt("report_extra_data");
        }
        java.lang.Object obj2 = obj == null ? "" : obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        android.content.Context context2 = jumpView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).V6();
        fe0.t3 t3Var = (fe0.t3) i95.n0.c(fe0.t3.class);
        java.lang.String m76492xa70ddde9 = infoEx.f534767a.m76492xa70ddde9();
        ((ee0.p3) t3Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.j0.d(m76492xa70ddde9);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        boolean z17 = !(d17 == null || d17.length() == 0);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(jumpView, "finder_bariable_button");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(jumpView, 40, 25496);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(jumpView, 40, 1, false);
        java.lang.Object obj3 = obj2;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(jumpView, new sc2.l(V6, mo2128x1ed62e84, infoEx, obj3, z17));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Vj(jumpView, 40, new sc2.m(this, mo2128x1ed62e84, z17, obj3, V6));
    }
}
