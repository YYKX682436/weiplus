package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class j20 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {
    public final boolean A;
    public final sc2.i B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 C;
    public final zy2.h8 D;
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d E;
    public com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d F;
    public java.lang.String G;
    public boolean H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i20 I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f188605J;
    public float K;
    public final yz5.l L;

    /* renamed from: y, reason: collision with root package name */
    public final int f188606y;

    /* renamed from: z, reason: collision with root package name */
    public final int f188607z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j20(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17, int i18, boolean z17, boolean z18) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f188606y = i17;
        this.f188607z = i18;
        this.A = z17;
        this.B = new sc2.i();
        this.C = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w6) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.w6.class)).f217840d;
        this.D = ((te2.e4) ((zy2.g8) pf5.z.f435481a.a(context).c(zy2.g8.class))).f499507d;
        this.I = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i20(this, context);
        this.L = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.d20(context, this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void G(ym5.s3 reason) {
        java.util.ArrayList f17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        if (i0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract.ViewCallback");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20 v20Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.v20) i0Var;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0 c0Var = v20Var.f188502e;
            boolean z17 = c0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 j20Var = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20) c0Var : null;
            boolean z18 = j20Var != null ? j20Var.H : false;
            if (!z18 && reason.f545054f) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = v20Var.o().m82555x4905e9fa();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w() + 1;
                if (w17 < v20Var.a().m82898xfb7e5820().size()) {
                    m82555x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.u20(m82555x4905e9fa, w17));
                }
            }
            int i18 = v20Var.f192399s;
            if ((i18 == 16 || i18 == 23 || i18 == 24) && !reason.f545054f && (f17 = c0Var.f()) != null) {
                java.util.ListIterator listIterator = f17.listIterator(f17.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        i17 = -1;
                        break;
                    } else if (((so2.j5) listIterator.previous()) instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                        i17 = listIterator.nextIndex();
                        break;
                    }
                }
                if (i17 != -1) {
                    java.lang.Object obj = f17.get(i17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj;
                    if (abstractC14490x69736cb5.getFeedObject().m59315x31740422() && abstractC14490x69736cb5.getShowMemberScroll()) {
                        abstractC14490x69736cb5.W1(false);
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = c0Var.f187957g;
                        if (i0Var2 != null) {
                            i0Var2.a().m8152xc67946d3(i17, 1, new jz5.l(39, 1));
                        }
                    }
                }
            }
            if (z18) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20 j20Var2 = z17 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20) c0Var : null;
                if (j20Var2 == null) {
                    return;
                }
                j20Var2.H = false;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            abstractC13919x46aff122.mo56155xd210094c();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 model, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj callback) {
        fc2.c n17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa;
        fc2.c n18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.X(model, callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e20 e20Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.e20(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.C;
        l0Var.N0(this.f188606y, this.f187955e, e20Var);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.a(l0Var);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28) abstractC13919x46aff122 : null;
        sc2.i iVar = this.B;
        iVar.f487488a = abstractC13834x56f46d28;
        zy2.h8 h8Var = this.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f20 f20Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.f20(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var).N0(f20Var, i0Var != null ? i0Var.m56068x4905e9fa() : null);
        if (this.A) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var2 = this.f187957g;
            if (i0Var2 != null && (m56068x4905e9fa = i0Var2.m56068x4905e9fa()) != null) {
                m56068x4905e9fa.i(this.I);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var3 = this.f187957g;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m56068x4905e9fa2 = i0Var3 != null ? i0Var3.m56068x4905e9fa() : null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea c13728x20aad6ea = m56068x4905e9fa2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1447x5c6729a.p1448xe821e364.C13728x20aad6ea) m56068x4905e9fa2 : null;
            if (c13728x20aad6ea != null) {
                c13728x20aad6ea.m55761xe02f1f0f(this.L);
            }
        }
        if (this.f188607z == 7) {
            iVar.f487489b = context.getIntent().getIntExtra("key_activity_max_top_count", 3);
            this.G = context.getIntent().getStringExtra("key_creator_finder_name");
            final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
            com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9>(a0Var) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter$onAttach$3
                {
                    this.f39173x3fe91575 = -478908231;
                }

                @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                /* renamed from: callback */
                public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 c5150x445b2cc9) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5150x445b2cc9 event = c5150x445b2cc9;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.g20(event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20.this));
                    return false;
                }
            };
            this.E = abstractC20980x9b9ad01d;
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        final com.p314xaae8f345.mm.app.a0 a0Var2 = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae> abstractC20980x9b9ad01d2 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae>(a0Var2) { // from class: com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract$Presenter$onAttach$4
            {
                this.f39173x3fe91575 = -616994146;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae c5705xaea272ae) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5705xaea272ae event = c5705xaea272ae;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.rj rjVar = event.f136027g;
                if (!rjVar.f89355a || !eo2.f.f337098a.d(java.lang.Integer.valueOf(rjVar.f89357c))) {
                    return false;
                }
                pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.h20(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20.this, event));
                return false;
            }
        };
        this.F = abstractC20980x9b9ad01d2;
        abstractC20980x9b9ad01d2.mo48813x58998cd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar2 == null || (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) h8Var;
        s3Var.getClass();
        n17.a(s3Var);
    }

    public final void Z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13818x35e7a213 c13818x35e7a213 = abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13818x35e7a213 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13818x35e7a213) abstractC13919x46aff122 : null;
        if (c13818x35e7a213 == null || !c13818x35e7a213.f187689x) {
            return;
        }
        c13818x35e7a213.f187689x = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56344x8e35192c(c13818x35e7a213, new db2.t0(c13818x35e7a213.f187680o, c13818x35e7a213.f187681p, c13818x35e7a213.f187684s, c13818x35e7a213.m56357x44e5026c(), null, c13818x35e7a213.f187683r, c13818x35e7a213.f187685t, c13818x35e7a213.f187686u, c13818x35e7a213.f187687v, null, c13818x35e7a213.m56354xfe9224be(), 0.0f, 0.0f, 0, 0, 19, null, null, c13818x35e7a213.f187682q, 0, null, null, null, null, null, null, null, null, null, null, 1073445376, null), null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public java.lang.String b2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        ya2.b2 contact;
        if (this.A) {
            boolean z17 = false;
            if (abstractC14490x69736cb5 != null && (contact = abstractC14490x69736cb5.getContact()) != null && ya2.d.f(contact)) {
                z17 = true;
            }
            if (z17) {
                java.lang.String string = this.f187954d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhe);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                return string;
            }
        }
        return "";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8
    public boolean d0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, db5.g4 menu, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet, in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int i17 = this.f188607z;
        if (i17 == 7) {
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.G);
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
            if (!K0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.G, xy2.c.e(context))) {
                if (feed.getFeedObject().m59331xcb21161d()) {
                    menu.g(com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjf), com.p314xaae8f345.mm.R.raw.f80288x86c4bb70);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(abstractC13919x46aff122, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderTopicTimelineUIContract.Loader");
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13815x90ca5827) abstractC13919x46aff122).f187677z == 1) {
                    this.B.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                    if (feed.getFeedObject().m59292xa80c944c() > 0) {
                        menu.g(5003, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn6), com.p314xaae8f345.mm.R.raw.f80334xa4bb772d);
                    } else {
                        menu.g(5002, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f49), com.p314xaae8f345.mm.R.raw.f80332xde5160fd);
                    }
                }
            }
        }
        super.m(feed, menu, sheet, holder);
        if (i17 == 16 || i17 == 23 || i17 == 24) {
            menu.removeItem(305);
            menu.removeItem(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0, fs2.a
    /* renamed from: onDetach */
    public void mo979x3f5eee52() {
        fc2.c n17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff1222;
        java.util.Iterator it;
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny> cls;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        fc2.c n18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.l0 l0Var = this.C;
        l0Var.m56485x3f5eee52();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny> cls2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(cls2);
        boolean z17 = false;
        int i17 = 1;
        if (nyVar != null && (n18 = zy2.ra.n1(nyVar, 0, 1, null)) != null) {
            n18.d(l0Var);
        }
        if (this.A && (abstractC13919x46aff122 = this.f188103t) != null && (abstractC13919x46aff122 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13815x90ca5827)) {
            java.util.Iterator it6 = abstractC13919x46aff122.m56388xcaeb60d0().iterator();
            while (it6.hasNext()) {
                so2.j5 j5Var = (so2.j5) it6.next();
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    if (abstractC14490x69736cb5.getFeedObject().getMediaType() != 15 && abstractC14490x69736cb5.getFeedObject().getMediaType() != 2) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.rj0 tk6 = ((c61.l7) i95.n0.c(c61.l7.class)).tk();
                        long m59251x5db1b11 = abstractC14490x69736cb5.getFeedObject().m59251x5db1b11();
                        tk6.getClass();
                        long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.C13815x90ca5827) abstractC13919x46aff122).f187668q;
                        if (j17 != 0 && m59251x5db1b11 != 0) {
                            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(ey2.v2.class);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
                            ey2.v2 v2Var = (ey2.v2) a17;
                            ey2.q2 R6 = v2Var.R6(m59251x5db1b11, z17, ey2.t2.f339050g);
                            ey2.r2 r2Var = (ey2.r2) v2Var.f339090g.get(java.lang.Long.valueOf(m59251x5db1b11));
                            if (R6 != null && R6.f339013c != 0) {
                                dm.e5 e5Var = new dm.e5();
                                e5Var.f66377x1e9b0d60 = i17;
                                e5Var.f66379x7ce583b = j17;
                                e5Var.f66380xf9a02e3e = R6.f339011a;
                                e5Var.f66383xe217cbd2 = R6.f339013c;
                                e5Var.f66384xde17a869 = R6.f339016f;
                                e5Var.f66382x189d520c = R6.f339014d;
                                e5Var.f66381xa9367fec = r2Var != null ? r2Var.f339028c : 0;
                                e5Var.f66378x8c3448d7 = r2Var != null ? r2Var.f339026a : 0;
                                java.util.LinkedList linkedList = new java.util.LinkedList();
                                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                                java.util.LinkedList linkedList3 = new java.util.LinkedList();
                                p75.d dVar = dm.e5.f318151r;
                                p75.m0 i18 = dVar.i(java.lang.Long.valueOf(j17));
                                abstractC13919x46aff1222 = abstractC13919x46aff122;
                                p75.d dVar2 = dm.e5.f318150q;
                                it = it6;
                                p75.m c17 = i18.c(dVar2.i(java.lang.Long.valueOf(m59251x5db1b11)));
                                p75.n0 n0Var = dm.e5.f318148o;
                                p75.i0 g17 = n0Var.g(linkedList);
                                g17.f434190d = c17;
                                g17.f434192f = linkedList2;
                                g17.f434193g = linkedList3;
                                p75.l0 a18 = g17.a();
                                l75.k0 k0Var = tk6.f209029d;
                                dm.e5 e5Var2 = (dm.e5) a18.o(k0Var, dm.e5.class);
                                if (e5Var2 == null) {
                                    tk6.mo51731x24249762(e5Var, false);
                                    abstractActivityC21394xb3d2c0cf = context;
                                    cls = cls2;
                                    context = abstractActivityC21394xb3d2c0cf;
                                    abstractC13919x46aff122 = abstractC13919x46aff1222;
                                    it6 = it;
                                    cls2 = cls;
                                    z17 = false;
                                    i17 = 1;
                                } else {
                                    android.content.ContentValues contentValues = new android.content.ContentValues();
                                    cls = cls2;
                                    contentValues.put("businessId", (java.lang.Integer) 1);
                                    contentValues.put("courseId", java.lang.Long.valueOf(j17));
                                    contentValues.put("feedId", java.lang.Long.valueOf(m59251x5db1b11));
                                    contentValues.put("progress", java.lang.Integer.valueOf(e5Var.f66383xe217cbd2));
                                    contentValues.put("speedRatio", java.lang.Float.valueOf(e5Var.f66384xde17a869));
                                    abstractActivityC21394xb3d2c0cf = context;
                                    contentValues.put("playTimeMs", java.lang.Long.valueOf(e5Var.f66382x189d520c));
                                    int i19 = e5Var2.f66381xa9367fec;
                                    int i27 = e5Var.f66381xa9367fec;
                                    if (i19 < i27) {
                                        i19 = i27;
                                    }
                                    contentValues.put("maxProgress", java.lang.Integer.valueOf(i19));
                                    int i28 = e5Var2.f66378x8c3448d7;
                                    int i29 = e5Var.f66378x8c3448d7;
                                    if (i28 < i29) {
                                        i28 = i29;
                                    }
                                    contentValues.put("completePlayCnt", java.lang.Integer.valueOf(i28));
                                    p75.m c18 = dVar.i(java.lang.Long.valueOf(j17)).c(dVar2.i(java.lang.Long.valueOf(m59251x5db1b11)));
                                    p75.h1 j18 = n0Var.j(contentValues);
                                    j18.f434184c = c18;
                                    j18.a().f(k0Var);
                                    context = abstractActivityC21394xb3d2c0cf;
                                    abstractC13919x46aff122 = abstractC13919x46aff1222;
                                    it6 = it;
                                    cls2 = cls;
                                    z17 = false;
                                    i17 = 1;
                                }
                            }
                        }
                        abstractC13919x46aff1222 = abstractC13919x46aff122;
                        it = it6;
                        abstractActivityC21394xb3d2c0cf = context;
                        cls = cls2;
                        context = abstractActivityC21394xb3d2c0cf;
                        abstractC13919x46aff122 = abstractC13919x46aff1222;
                        it6 = it;
                        cls2 = cls;
                        z17 = false;
                        i17 = 1;
                    }
                }
                abstractC13919x46aff1222 = abstractC13919x46aff122;
                it = it6;
                abstractActivityC21394xb3d2c0cf = context;
                cls = cls2;
                context = abstractActivityC21394xb3d2c0cf;
                abstractC13919x46aff122 = abstractC13919x46aff1222;
                it6 = it;
                cls2 = cls;
                z17 = false;
                i17 = 1;
            }
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = context;
        java.lang.Class<com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny> cls3 = cls2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3 s3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.s3) this.D;
        s3Var.m56497x3f5eee52();
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = this.E;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d2 = this.F;
        if (abstractC20980x9b9ad01d2 != null) {
            abstractC20980x9b9ad01d2.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(abstractActivityC21394xb3d2c0cf2).a(cls3);
        if (nyVar2 != null && (n17 = zy2.ra.n1(nyVar2, 0, 1, null)) != null) {
            s3Var.getClass();
            n17.d(s3Var);
        }
        super.mo979x3f5eee52();
    }

    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0174  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    /* renamed from: onRefreshEnd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo56038xb3ee2b3f(ym5.s3 r24) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.j20.mo56038xb3ee2b3f(ym5.s3):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void p(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, android.view.MenuItem menuItem, int i17, int i18, in5.s0 holder) {
        r45.xl2 m76946x746418e4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = this.f187954d;
        if (itemId == 101) {
            if (this.f188607z != 7) {
                super.p(feed, menuItem, i17, i18, holder);
                return;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = feed.getFeedObject().getFeedObject().m76802x2dd01666();
            long m75942xfb822ef2 = (m76802x2dd01666 == null || (m76946x746418e4 = m76802x2dd01666.m76946x746418e4()) == null) ? 0L : m76946x746418e4.m75942xfb822ef2(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            java.lang.String format = java.lang.String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d&topic_id=%s", java.util.Arrays.copyOf(new java.lang.Object[]{68, pm0.v.u(m75942xfb822ef2)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", format);
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a.c(this.f187954d, "button_complaint", feed.mo2128x1ed62e84(), i18);
            return;
        }
        sc2.i iVar = this.B;
        switch (itemId) {
            case com.p314xaae8f345.p3006xb8ff1437.api.C26186x39dabdc4.f50820x1cfb1f28 /* 5001 */:
                iVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                iVar.f487492e = feed;
                if (iVar.f487491d == null) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) context, 1, true);
                    k0Var.r(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cjh), 17, context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja), null);
                    k0Var.f293405n = new sc2.f(context);
                    k0Var.f293414s = new sc2.g(iVar, context);
                    k0Var.f293387d = new sc2.h(iVar);
                    iVar.f487491d = k0Var;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = iVar.f487491d;
                if (k0Var2 == null || k0Var2.i()) {
                    return;
                }
                k0Var2.v();
                return;
            case 5002:
                iVar.a(context, true, feed);
                return;
            case 5003:
                iVar.a(context, false, feed);
                return;
            default:
                super.p(feed, menuItem, i17, i18, holder);
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public boolean q() {
        return false;
    }
}
