package sc2;

/* loaded from: classes2.dex */
public final class u3 extends ad2.h {

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f487813x;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487812w = "FinderJumperCnyWishPag";

    /* renamed from: y, reason: collision with root package name */
    public final int f487814y = 3;

    /* renamed from: z, reason: collision with root package name */
    public final long f487815z = 150;
    public final java.util.Map A = kz5.c1.k(new jz5.l(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.tbz)), new jz5.l(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f565972tc0)), new jz5.l(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.f565973tc1)));
    public final java.util.List B = kz5.c0.k("", "", "");
    public final android.util.ArrayMap C = new android.util.ArrayMap();
    public final java.util.List D = kz5.c0.k(java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d), java.lang.Double.valueOf(0.0d));

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        xc2.p0 p0Var = this.f84680h;
        android.view.View view = this.f84676d;
        if (p0Var != null && view != null) {
            java.util.ArrayList arrayList = p0Var.Z;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if ((((xc2.p0) next).f534790s == 35 ? 1 : 0) != 0) {
                    arrayList2.add(next);
                }
            }
            int size = arrayList2.size();
            int i18 = this.f487814y;
            if (size != i18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "pag size err, need " + i18 + ", but get " + arrayList2.size());
            } else {
                for (java.lang.Object obj : arrayList2) {
                    int i19 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    xc2.p0 p0Var2 = (xc2.p0) obj;
                    java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i17));
                    com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) view.findViewById(num != null ? num.intValue() : com.p314xaae8f345.mm.R.id.tbz);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22789xd23e9a9b);
                    G(p0Var2, c22789xd23e9a9b);
                    i17 = i19;
                }
            }
        }
        f(500L, jumpView, z17, aVar);
        e(true, z17);
    }

    public final void G(xc2.p0 p0Var, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        fe0.t3 t3Var = (fe0.t3) i95.n0.c(fe0.t3.class);
        java.lang.String m76502xdae6f030 = p0Var.f534767a.m76502xdae6f030();
        ((ee0.p3) t3Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2103x1dafb926.p2109xb73a0fae.p2110x2dc211.j0.d(m76502xdae6f030);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getHalfEggCardExposedId", "com.tencent.mm.feature.sns.FinderCnyAdService");
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17);
        if (z17) {
            c22789xd23e9a9b.m82582x3ae760af(0.0d);
            c22789xd23e9a9b.d();
            c22789xd23e9a9b.n();
        }
        this.C.put(p0Var.f534767a.m76502xdae6f030(), java.lang.Boolean.valueOf(z17));
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? info.m76490xf00280e() == 3 ? gs2.a.f356585h : gs2.a.f356587m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487812w;
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
        java.lang.Object obj;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb;
        java.lang.Object obj2;
        r45.ql6 ql6Var;
        int i17;
        java.lang.Object obj3;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b;
        cl0.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        if (this.f487813x == null) {
            android.content.Context context = jumpView.getContext();
            final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d> abstractC20980x9b9ad01d = abstractActivityC21394xb3d2c0cf != null ? new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d>(abstractActivityC21394xb3d2c0cf) { // from class: com.tencent.mm.plugin.finder.feed.component.FeedJumperCnyWishPagObserver$createListener$1
                {
                    this.f39173x3fe91575 = 1918656061;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d c5452xdae2de4d) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5452xdae2de4d event = c5452xdae2de4d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    ((ku5.t0) ku5.t0.f394148d).B(new sc2.t3(this));
                    return true;
                }
            } : null;
            this.f487813x = abstractC20980x9b9ad01d;
            if (abstractC20980x9b9ad01d != null) {
                abstractC20980x9b9ad01d.mo48813x58998cd();
            }
        }
        java.util.ArrayList arrayList = infoEx.Z;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((xc2.p0) obj).f534790s == 36) {
                    break;
                }
            }
        }
        xc2.p0 p0Var = (xc2.p0) obj;
        int i18 = 2;
        if (p0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "cny wish text err, get null");
        } else {
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.f565975tc3);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = p0Var.f534767a;
            if (c19786x6a1e2862 != null && (m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb()) != null) {
                java.util.Iterator<T> it6 = m76521x7528c3fb.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    } else {
                        obj2 = it6.next();
                        if (((r45.wf6) obj2).m75939xb282bd08(2) == 36) {
                            break;
                        }
                    }
                }
                r45.wf6 wf6Var = (r45.wf6) obj2;
                if (wf6Var != null && (ql6Var = (r45.ql6) wf6Var.m75936x14adae67(45)) != null) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ql6Var.m75945x2fec8307(0))) {
                        try {
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ql6Var.m75945x2fec8307(1))) {
                                textView.setTextColor(android.graphics.Color.parseColor(ql6Var.m75945x2fec8307(1)));
                            }
                        } catch (java.lang.Throwable unused) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f487812w, "bindCnyText color err, color: " + ql6Var.m75945x2fec8307(1));
                        }
                        if (textView != null) {
                            textView.setText(ql6Var.m75945x2fec8307(0));
                        }
                        if (textView != null) {
                            textView.setVisibility(0);
                        }
                    } else if (textView != null) {
                        textView.setVisibility(8);
                    }
                }
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList.iterator();
        while (true) {
            i17 = 35;
            if (!it7.hasNext()) {
                break;
            }
            java.lang.Object next = it7.next();
            if (((xc2.p0) next).f534790s == 35) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i19 = this.f487814y;
        if (size != i19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "pag size err, need " + i19 + ", but get " + arrayList2.size());
        } else {
            java.util.Iterator it8 = arrayList2.iterator();
            int i27 = 0;
            while (it8.hasNext()) {
                java.lang.Object next2 = it8.next();
                int i28 = i27 + 1;
                if (i27 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                xc2.p0 p0Var2 = (xc2.p0) next2;
                if (i27 >= 3) {
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i27));
                com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(num != null ? num.intValue() : com.p314xaae8f345.mm.R.id.tbz);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22789xd23e9a9b2);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                c22789xd23e9a9b2.o(((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Jg).mo141623x754a37bb()).r()).booleanValue());
                c22789xd23e9a9b2.m82583xcde73672(1);
                java.util.LinkedList<r45.wf6> m76521x7528c3fb2 = p0Var2.f534767a.m76521x7528c3fb();
                if (m76521x7528c3fb2 != null) {
                    java.util.Iterator<T> it9 = m76521x7528c3fb2.iterator();
                    while (true) {
                        if (!it9.hasNext()) {
                            obj3 = null;
                            break;
                        } else {
                            obj3 = it9.next();
                            if (((r45.wf6) obj3).m75939xb282bd08(i18) == i17) {
                                break;
                            }
                        }
                    }
                    r45.wf6 wf6Var2 = (r45.wf6) obj3;
                    if (wf6Var2 == null) {
                        continue;
                    } else {
                        holder.j();
                        p3325xe03a0797.p3326xc267989b.y0 y0Var = holder.f374653d;
                        if (y0Var != null) {
                            c22789xd23e9a9b = c22789xd23e9a9b2;
                            p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new sc2.q3(this, i27, wf6Var2, c22789xd23e9a9b2, null), 3, null);
                        } else {
                            c22789xd23e9a9b = c22789xd23e9a9b2;
                        }
                        G(p0Var2, c22789xd23e9a9b);
                        c22789xd23e9a9b.setOnClickListener(new sc2.r3(holder, p0Var2));
                        xc2.p0 p0Var3 = this.f84680h;
                        xc2.o0 o0Var = p0Var3 != null ? p0Var3.f534779h : null;
                        xc2.p pVar = o0Var instanceof xc2.p ? (xc2.p) o0Var : null;
                        java.lang.Object opt = (pVar == null || (gVar = pVar.f534760f) == null) ? null : gVar.opt("report_extra_data");
                        if (opt == null) {
                            opt = "";
                        }
                        java.lang.Object obj4 = opt;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = p0Var2.f534777f;
                        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
                        android.content.Context context2 = c22789xd23e9a9b.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        pf5.z zVar = pf5.z.f435481a;
                        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                            throw new java.lang.IllegalStateException("Check failed.".toString());
                        }
                        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).c(zy2.ra.class))).V6();
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(c22789xd23e9a9b, "finder_red_packet_extract");
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(c22789xd23e9a9b, 40, 25496);
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(c22789xd23e9a9b, new sc2.s3(mo2128x1ed62e84, this, p0Var2, obj4, V6));
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(c22789xd23e9a9b, 40, 1, false);
                    }
                }
                i27 = i28;
                i18 = 2;
                i17 = 35;
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = infoEx.f534767a;
        gs2.c.f356605a.e(holder, jumpView, j(c19786x6a1e28622), c19786x6a1e28622.m76480xe2ee1ca3() == 2);
    }

    @Override // ad2.h
    public void y(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.y(holder, jumpView, infoEx, event);
        java.util.ArrayList arrayList = infoEx.Z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((xc2.p0) next).f534790s == 35) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i17 = this.f487814y;
        if (size != i17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "pag size err, need " + i17 + ", but get " + arrayList2.size());
            return;
        }
        int i18 = 0;
        for (java.lang.Object obj : arrayList2) {
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc2.p0 p0Var = (xc2.p0) obj;
            if (i18 >= 3) {
                return;
            }
            java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i18));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(num != null ? num.intValue() : com.p314xaae8f345.mm.R.id.tbz);
            android.util.ArrayMap arrayMap = this.C;
            java.util.List list = this.D;
            int i27 = event.f332492d;
            if (i27 == 11 && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(arrayMap.get(p0Var.f534767a.m76502xdae6f030()), java.lang.Boolean.TRUE)) {
                list.set(i18, java.lang.Double.valueOf(c22789xd23e9a9b.m82577x402effa3()));
                c22789xd23e9a9b.n();
            } else if (i27 == 1) {
                if ((c22789xd23e9a9b.m82577x402effa3() == ((java.lang.Number) list.get(i18)).doubleValue()) && !c22789xd23e9a9b.f() && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(arrayMap.get(p0Var.f534767a.m76502xdae6f030()), java.lang.Boolean.TRUE)) {
                    c22789xd23e9a9b.m82582x3ae760af(((java.lang.Number) list.get(i18)).doubleValue());
                    c22789xd23e9a9b.g();
                }
            }
            i18 = i19;
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
        java.util.ArrayList arrayList = infoEx.Z;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((xc2.p0) next).f534790s == 35) {
                arrayList2.add(next);
            }
        }
        int size = arrayList2.size();
        int i18 = this.f487814y;
        if (size != i18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TAG", "pag size err, need " + i18 + ", but get " + arrayList2.size());
            return;
        }
        int i19 = 0;
        for (java.lang.Object obj : arrayList2) {
            int i27 = i19 + 1;
            if (i19 < 0) {
                kz5.c0.p();
                throw null;
            }
            xc2.p0 p0Var = (xc2.p0) obj;
            if (i19 >= 3) {
                return;
            }
            java.lang.Integer num = (java.lang.Integer) this.A.get(java.lang.Integer.valueOf(i19));
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) jumpView.findViewById(num != null ? num.intValue() : com.p314xaae8f345.mm.R.id.tbz);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22789xd23e9a9b);
            java.lang.Boolean bool = (java.lang.Boolean) this.C.get(p0Var.f534767a.m76502xdae6f030());
            if (bool == null ? false : bool.booleanValue()) {
                c22789xd23e9a9b.m82582x3ae760af(0.0d);
                c22789xd23e9a9b.d();
                c22789xd23e9a9b.n();
            } else {
                if (c22789xd23e9a9b.c() / 1000 != 0) {
                    long j17 = (i17 - p0Var.E) * 1000;
                    long j18 = this.f487815z;
                    c22789xd23e9a9b.m82582x3ae760af(((float) ((j17 % (r3 - j18)) + j18)) / ((float) r3));
                    if (!c22789xd23e9a9b.f()) {
                        c22789xd23e9a9b.g();
                    }
                }
            }
            i19 = i27;
        }
    }
}
