package lw0;

/* loaded from: classes5.dex */
public abstract class l extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k implements mw0.h {

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f403074n;

    /* renamed from: o, reason: collision with root package name */
    public mv0.d f403075o;

    /* renamed from: p, reason: collision with root package name */
    public lw0.d f403076p;

    /* renamed from: q, reason: collision with root package name */
    public final lw0.j f403077q;

    /* renamed from: r, reason: collision with root package name */
    public final lw0.k f403078r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f403074n = jz5.h.b(new lw0.i(this));
        this.f403075o = mv0.d.f413068d;
        this.f403077q = new lw0.j(this);
        this.f403078r = new lw0.k();
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 Y6() {
        return new lw0.c(m158354x19263085());
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void Z6(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        lw0.c panel = (lw0.c) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new mv0.e(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lln), mv0.d.f413068d, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d(m158354x19263085(), null, 0, 6, null)));
        arrayList.add(new mv0.e(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.llo), mv0.d.f413069e, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2(m158354x19263085(), null, 0, 6, null)));
        lw0.j tabChangeListener = this.f403077q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tabChangeListener, "tabChangeListener");
        lw0.k whenWhereCallback = this.f403078r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(whenWhereCallback, "whenWhereCallback");
        gv0.d dVar = new gv0.d(arrayList);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e m160993x520b995a = panel.m160993x520b995a();
        if (m160993x520b995a != null) {
            panel.L = tabChangeListener;
            java.util.ArrayList arrayList2 = panel.f403063J;
            arrayList2.clear();
            arrayList2.addAll(arrayList);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe = panel.I;
            if (c1190x18d3c3fe == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            c1190x18d3c3fe.m8315x6cab2c8d(dVar);
            p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe c1190x18d3c3fe2 = panel.I;
            if (c1190x18d3c3fe2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewPager");
                throw null;
            }
            m160993x520b995a.m47221xfd22d5dc(c1190x18d3c3fe2);
            m160993x520b995a.m47211xed4b2ce4(panel.K);
        }
        panel.m146400x2dcea882(this);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void a7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6) {
        lw0.c panel = (lw0.c) abstractC10936x89d53ec6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 m146398x95ce11a9 = panel.m146398x95ce11a9();
        if (m146398x95ce11a9 == null) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            m146398x95ce11a9 = null;
        }
        if (m146398x95ce11a9 == null) {
            return;
        }
        mv0.d dVar = this.f403075o;
        mv0.d dVar2 = mv0.d.f413068d;
        if (dVar == dVar2) {
            s7();
        }
        this.f403076p = o7();
        nw0.h n76 = n7();
        lw0.d dVar3 = this.f403076p;
        p3325xe03a0797.p3326xc267989b.l.d(n76.f422301b, null, null, new nw0.d(n76, dVar3 != null ? dVar3.f403064a : null, null), 3, null);
        p7(panel);
        java.util.Iterator it = panel.f403063J.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if (((mv0.e) it.next()).f413072b == dVar2) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10962x80d4584e m160993x520b995a = panel.m160993x520b995a();
        if (m160993x520b995a != null) {
            m160993x520b995a.e(i17, false);
        }
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    public void b7() {
        mv0.c cVar;
        lw0.c cVar2 = (lw0.c) this.f150773i;
        if (cVar2 == null || (cVar = cVar2.m146399x6dbe567e()) == null) {
            cVar = mv0.c.f413066e;
        }
        int ordinal = cVar.ordinal();
        if (ordinal == 0) {
            t7();
        } else if (ordinal == 1) {
            u7();
        }
        n7().e();
    }

    @Override // mw0.h
    public void e3(kw0.a stickerData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stickerData, "stickerData");
        nw0.h n76 = n7();
        n76.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(n76.f422301b, null, null, new nw0.e(stickerData, n76, kw0.b.f394325f, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k7(com.p314xaae8f345.p457x3304c6.p479x4179489f.e r18, long r19) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lw0.l.k7(com.tencent.maas.moviecomposing.e, long):void");
    }

    public boolean l7(kw0.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        return false;
    }

    public final void m7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5) {
        lw0.c cVar = (lw0.c) this.f150773i;
        if (cVar != null) {
            lw0.g gVar = new lw0.g(this);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10949xcd11d34d K = cVar.K();
            if (K != null) {
                K.removeAllViews();
                com.p314xaae8f345.mm.ui.id.b(K.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dgh, K);
                android.widget.TextView textView = (android.widget.TextView) K.findViewById(com.p314xaae8f345.mm.R.id.qb8);
                if (textView != null) {
                    textView.setText(c4186x9bb007e5 != null ? c4186x9bb007e5.m34563xfb82e301() : null);
                }
                android.widget.ImageView imageView = (android.widget.ImageView) K.findViewById(com.p314xaae8f345.mm.R.id.q7q);
                if (imageView != null) {
                    imageView.setOnClickListener(new mw0.k(gVar));
                }
            }
        }
    }

    public final nw0.h n7() {
        return (nw0.h) ((jz5.n) this.f403074n).mo141623x754a37bb();
    }

    public abstract lw0.d o7();

    @Override // pf5.o, pf5.e, p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        n7().d();
    }

    public void p7(lw0.c panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        n7().f422304e.mo7806x9d92d11c(W6(), new lw0.h(this, panel));
    }

    public abstract void q7(java.util.Calendar calendar);

    public abstract void r7(com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4186x9bb007e5 c4186x9bb007e5);

    public abstract void s7();

    public abstract void t7();

    public abstract void u7();

    public void v7(lw0.c panel, kw0.e state) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        panel.m146402x68b9052(state);
    }
}
