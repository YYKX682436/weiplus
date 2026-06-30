package cs2;

/* loaded from: classes2.dex */
public final class i implements c50.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f303604a;

    /* renamed from: b, reason: collision with root package name */
    public final int f303605b;

    /* renamed from: c, reason: collision with root package name */
    public final es2.h0 f303606c;

    /* renamed from: d, reason: collision with root package name */
    public final cs2.g f303607d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f303608e;

    public i(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f303604a = context;
        this.f303605b = i17;
        es2.h0 h0Var = new es2.h0((yr2.k) ((jz5.n) jz5.h.b(cs2.h.f303603d)).mo141623x754a37bb(), "Grid#" + i17);
        this.f303606c = h0Var;
        cs2.g gVar = new cs2.g(this);
        this.f303607d = gVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "init " + i17);
        h0Var.f337907g.add(gVar);
    }

    public static final void a(cs2.i iVar, int i17, int i18) {
        if (i18 > 0) {
            iVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "onPreloadComplete return loading:" + i17 + " waiting:" + i18);
            return;
        }
        android.content.Context context = iVar.f303604a;
        jz5.f0 f0Var = null;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context : null;
        if (abstractActivityC22579xbed01a37 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "onPreloadComplete loading:" + i17 + " waiting:" + i18);
            android.app.Activity m81193x1252e2cf = abstractActivityC22579xbed01a37.m81193x1252e2cf();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = m81193x1252e2cf instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) m81193x1252e2cf : null;
            if (activityC0065xcd7aa112 != null) {
                if (activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799) {
                    pf5.z zVar = pf5.z.f435481a;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 fragment = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) zVar.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).m63052x8f02c6c();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                    p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.b(fragment).a(cs2.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                    ((cs2.k) a17).Q6();
                } else {
                    p012xc85e97e9.p093xedfae76a.c1 a18 = pf5.z.f435481a.a(activityC0065xcd7aa112).a(cs2.k.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a18, "get(...)");
                    ((cs2.k) a18).Q6();
                }
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                p012xc85e97e9.p093xedfae76a.c1 a19 = pf5.z.f435481a.a(abstractActivityC22579xbed01a37).a(cs2.k.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
                ((cs2.k) a19).Q6();
            }
            iVar.f303608e = false;
        }
    }

    public final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        if (((c61.l7) i95.n0.c(c61.l7.class)).ek().N) {
            if (recyclerView.getTag(com.p314xaae8f345.mm.R.id.dkl) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "attachVideoExposeToPreload: return for commentScene=" + contextObj.m75939xb282bd08(5));
            } else {
                in5.o.b(recyclerView, new cs2.e(contextObj, this), cs2.f.f303601d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "attachVideoExposeToPreload commentScene=" + contextObj.m75939xb282bd08(5));
            }
        }
    }

    public final void c(in5.j item, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        if (((c61.l7) i95.n0.c(c61.l7.class)).ek().N) {
            in5.c cVar = item.f374603a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
            if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.h() == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "itemExposeEnd: commentScene=" + contextObj.m75939xb282bd08(5) + " nick=" + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4() + " id=" + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()) + ' ');
                long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
                pm0.v.u(mo2128x1ed62e84);
                es2.h0 h0Var = this.f303606c;
                h0Var.getClass();
                h0Var.j("cancel", new es2.s(h0Var, mo2128x1ed62e84, "itemExposeEnd"));
            }
        }
    }

    public final void d(in5.j item, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        if (((c61.l7) i95.n0.c(c61.l7.class)).ek().N) {
            in5.c cVar = item.f374603a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) cVar : null;
            if (abstractC14490x69736cb5 != null && abstractC14490x69736cb5.h() == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", "itemExposeStartToPreload: commentScene=" + contextObj.m75939xb282bd08(5) + ", nick=" + abstractC14490x69736cb5.getFeedObject().getFeedObject().m76801x8010e5e4() + ", id=" + pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()));
                e(abstractC14490x69736cb5);
            }
        }
    }

    public final void e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84());
        this.f303606c.i(new ek4.b(1, -1, this.f303605b, 3, 0L, null, 1, 48, null), kz5.n0.V0(kz5.b0.c(abstractC14490x69736cb5)), 0, "Finder.GridFeedPreloadCore");
    }

    public final void f() {
        es2.h0 h0Var = this.f303606c;
        h0Var.f337903c = true;
        h0Var.f();
        h0Var.f337907g.remove(this.f303607d);
    }
}
