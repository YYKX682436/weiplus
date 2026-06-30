package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class em extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {
    public final int A;
    public final int B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 C;
    public final zy2.h8 D;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13777x196c69c5 E;

    /* renamed from: y, reason: collision with root package name */
    public final int f188194y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f188195z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v12, types: [com.tencent.mm.plugin.finder.feed.FinderMemberTimelineUIContract$Presenter$feedProgressListener$1] */
    public em(final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, java.lang.String authorFinderUsername, int i18, int i19) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
        this.f188194y = i17;
        this.f188195z = authorFinderUsername;
        this.A = i18;
        this.B = i19;
        this.C = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w6) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w6.class)).f217840d;
        this.D = ((te2.e4) ((zy2.g8) pf5.z.f435481a.a(context).c(zy2.g8.class))).f499507d;
        this.E = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f>(context, this) { // from class: com.tencent.mm.plugin.finder.feed.FinderMemberTimelineUIContract$Presenter$feedProgressListener$1

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em f187636d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) context);
                this.f187636d = this;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
                this.f39173x3fe91575 = 1870727551;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f c5442xd807898f) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5442xd807898f event = c5442xd807898f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar = this.f187636d;
                java.lang.String str = emVar.f188102s;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("feedProgressListener localId:");
                am.ga gaVar = event.f135783g;
                sb6.append(gaVar.f88282a);
                sb6.append(", progress:");
                sb6.append(gaVar.f88283b);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = emVar.f188103t;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28) abstractC13919x46aff122 : null;
                if (abstractC13834x56f46d28 == null) {
                    return true;
                }
                abstractC13834x56f46d28.m56136x5a0b1819(gaVar.f88282a);
                return true;
            }
        };
    }

    public static final void Z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.em emVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, db5.g4 g4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        java.lang.String string;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = emVar.f187954d;
        y4Var.k(abstractActivityC21394xb3d2c0cf, g4Var, abstractC14490x69736cb5);
        y4Var.s(abstractActivityC21394xb3d2c0cf, g4Var, abstractC14490x69736cb5);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = abstractC14490x69736cb5.getFeedObject().getFeedObject();
        if ((feedObject != null ? hc2.o0.r(feedObject) : false) || abstractC14490x69736cb5.h() != 4) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = emVar.f187957g;
        if (i0Var == null || (m56068x4905e9fa = i0Var.m56068x4905e9fa()) == null) {
            string = abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gue);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        } else {
            string = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.f215168x.a(m56068x4905e9fa);
        }
        g4Var.g(116, string, com.p314xaae8f345.mm.R.raw.f80266x170729dd);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public db5.o4 A0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.bm(feed, this, sheet, holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        int i17 = this.B;
        if (!((i17 == 9 || i17 == 10 || !eo2.f.f337098a.d(java.lang.Integer.valueOf(this.A))) ? false : true) || (abstractC13919x46aff122 = this.f188103t) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public boolean F() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.C13920xa5f564aa<T> m56387xe6796cde;
        boolean F = super.F();
        if (!F) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm hmVar = i0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.hm) i0Var : null;
            if (hmVar != null) {
                int i17 = hmVar.f188461r;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
                if (i17 == ((abstractC13919x46aff122 == null || (m56387xe6796cde = abstractC13919x46aff122.m56387xe6796cde()) == 0) ? 0 : m56387xe6796cde.size()) - 1 && hmVar.f188462s) {
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.gg.class)).f216038d = false;
                    activity.finish();
                    return true;
                }
            }
        }
        return F;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 model, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj callback) {
        fc2.c n17;
        fc2.c n18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.X(model, callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cm cmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.cm(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.C;
        l0Var.N0(this.f188194y, this.f187955e, cmVar);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        zy2.h8 h8Var = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dm dmVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dm(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var).N0(dmVar, i0Var != null ? i0Var.m56068x4905e9fa() : null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var;
            s3Var.getClass();
            n17.a(s3Var);
        }
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public boolean d0() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188195z, xy2.c.e(this.f187954d)) && this.A == 2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        fc2.c n17;
        fc2.c n18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.C;
        l0Var.m56485x3f5eee52();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        zy2.h8 h8Var = this.D;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var).m56497x3f5eee52();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var;
            s3Var.getClass();
            n17.d(s3Var);
        }
        mo48814x2efc64();
        super.mo979x3f5eee52();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, android.view.MenuItem menuItem, int i17, int i18, in5.s0 holder) {
        m92.b j37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.p(feed, menuItem, i17, i18, holder);
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4 y4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.y4.f184247a;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = this.f187954d;
        if (itemId == 205) {
            if (feed.getFeedObject().m59292xa80c944c() != 0) {
                db5.t7.f(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.exx), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xl.f192618a);
                return;
            } else if ((feed.getFeedObject().getFeedObject().m76752x103fd925() & 1) == 1) {
                db5.e1.n(activity, com.p314xaae8f345.mm.R.C30867xcad56011.cq7, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.yl(this, feed), null);
                return;
            } else {
                y4Var.J(activity, feed.getFeedObject(), true);
                return;
            }
        }
        if (itemId == 206) {
            y4Var.J(activity, feed.getFeedObject(), false);
            return;
        }
        if (itemId == 303 || itemId == 304) {
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            int m75939xb282bd08 = (!hc2.t.d(context) || (j37 = g92.a.j3(g92.b.f351302e, xy2.c.e(context), false, 2, null)) == null) ? 0 : j37.u0().m75939xb282bd08(48);
            if (!(m75939xb282bd08 == 2 || m75939xb282bd08 == 3)) {
                db5.t7.g(activity, activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cw8));
                return;
            }
            boolean z17 = menuItem.getItemId() == 304;
            bb2.p0.f100473a.b(activity, feed, z17, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.am(this, z17, feed, holder));
            bb2.m0 m0Var = bb2.m0.f100451a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
            java.lang.String str = z17 ? "close_bullet_screen" : "open_bullet_screen";
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(feed.mo2128x1ed62e84()));
            m0Var.a(activity, V6, str, true, jSONObject, (r17 & 32) != 0 ? false : true, (r17 & 64) != 0 ? -1 : 0);
        }
    }
}
