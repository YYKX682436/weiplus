package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class df extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe {

    /* renamed from: l1, reason: collision with root package name */
    public int f184680l1;

    /* renamed from: p1, reason: collision with root package name */
    public int f184681p1;

    /* renamed from: x1, reason: collision with root package name */
    public int f184682x1;

    /* renamed from: y0, reason: collision with root package name */
    public int f184683y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f184684y1;

    /* renamed from: z1, reason: collision with root package name */
    public boolean f184685z1;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public df(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 r2, boolean r3, int r4, boolean r5, int r6, p3321xbce91901.jvm.p3324x21ffc6bd.i r7) {
        /*
            r1 = this;
            r7 = r6 & 2
            r0 = 0
            if (r7 == 0) goto L6
            r3 = r0
        L6:
            r7 = r6 & 4
            if (r7 == 0) goto Lb
            r4 = r0
        Lb:
            r6 = r6 & 8
            if (r6 == 0) goto L10
            r5 = r0
        L10:
            java.lang.String r6 = "contract"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r6)
            r1.<init>(r2, r3, r4, r5)
            r2 = -1
            r1.f184683y0 = r2
            r1.f184680l1 = r2
            r1.f184681p1 = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df.<init>(com.tencent.mm.plugin.finder.feed.k8, boolean, int, boolean, int, kotlin.jvm.internal.i):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0157, code lost:
    
        if (r4 == false) goto L34;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(in5.s0 r22, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.df.K(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, int):void");
    }

    public final void O1(in5.s0 s0Var) {
        android.view.ViewGroup viewGroup;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.gbz);
        if (p17 == null || (viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.f566019ee3)) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) s0Var.p(com.p314xaae8f345.mm.R.id.f566402fs3);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.h8n);
        if (p18 != null) {
            p18.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.re(s0Var, abstractC15229x2dc379, p18, viewGroup, p17));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public int P() {
        return 2;
    }

    @Override // in5.r
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.d1 item, int i17, int i18, boolean z17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullVideoConvert", "onBindViewHolder position=" + i17 + " type=" + i18 + " isHotPatch=" + z17);
        o(holder, item, i17, i18, z17, list);
    }

    public final void Q1(in5.s0 holder, so2.d1 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 mediaLayout, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaLayout, "mediaLayout");
        if (this.f184685z1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L0).mo141623x754a37bb()).r()).intValue() == 0) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullImageConvert", "[reportExposed]");
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.qt2 d17 = xy2.c.d(context);
            hc2.v0.d(mediaLayout, "finder_feed_photo", null, true, kz5.c1.k(new jz5.l("feedid", pm0.v.u(item.mo2128x1ed62e84())), new jz5.l("finder_feed_photo_exp_type", java.lang.Integer.valueOf(i17)), new jz5.l("feed_photo_index", java.lang.Integer.valueOf(i18)), new jz5.l("feed_source_photo_index", java.lang.Integer.valueOf(i19)), new jz5.l("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(item.mo2128x1ed62e84(), item.w(), d17 != null ? d17.m75939xb282bd08(5) : 0))), null, 18, null);
        }
    }

    public final void R1(in5.s0 holder, so2.d1 item, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 mediaLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaLayout, "mediaLayout");
        if (this.f184680l1 == -1 || !this.f184685z1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L0).mo141623x754a37bb()).r()).intValue() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullImageConvert", "[reportUnExposed]");
            android.content.Context context = holder.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            r45.qt2 d17 = xy2.c.d(context);
            java.lang.String ek6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(item.mo2128x1ed62e84(), item.w(), d17 != null ? d17.m75939xb282bd08(5) : 0);
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j17 = this.f184684y1;
            hc2.v0.d(mediaLayout, "finder_feed_photo", "view_unexp", true, kz5.c1.k(new jz5.l("feedid", pm0.v.u(item.mo2128x1ed62e84())), new jz5.l("finder_feed_photo_exp_type", java.lang.Integer.valueOf(this.f184682x1)), new jz5.l("feed_photo_index", java.lang.Integer.valueOf(this.f184680l1)), new jz5.l("feed_source_photo_index", java.lang.Integer.valueOf(this.f184681p1)), new jz5.l("stay_time_ms", java.lang.Long.valueOf(1 <= j17 && j17 < elapsedRealtime ? elapsedRealtime - j17 : 0L)), new jz5.l("session_buffer", ek6)), null, 16, null);
        }
    }

    @Override // in5.r
    public int e() {
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue() ? com.p314xaae8f345.mm.R.C30864xbddafb2a.drs : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569379o;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        android.view.KeyEvent.Callback k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.k(com.p314xaae8f345.mm.R.id.fs6);
        if (c15324x3354d808 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr qrVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214439e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0 s0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.s0();
        s0Var.f214523c = this.f185891f.getG();
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.M1().r()).booleanValue()) {
            com.p314xaae8f345.mm.p2776x373aa5.C22793x8500e7df c22793x8500e7df = (com.p314xaae8f345.mm.p2776x373aa5.C22793x8500e7df) holder.k(com.p314xaae8f345.mm.R.id.h8n);
            if (c22793x8500e7df != null) {
                c22793x8500e7df.setVisibility(8);
            }
            k17 = holder.k(com.p314xaae8f345.mm.R.id.u3d);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f c15407x15c8ab5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f) k17;
            if (c15407x15c8ab5f != null) {
                c15407x15c8ab5f.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f c15407x15c8ab5f2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1668x6e3e17e.C15407x15c8ab5f) holder.k(com.p314xaae8f345.mm.R.id.u3d);
            if (c15407x15c8ab5f2 != null) {
                c15407x15c8ab5f2.setVisibility(8);
            }
            k17 = holder.k(com.p314xaae8f345.mm.R.id.h8n);
            com.p314xaae8f345.mm.p2776x373aa5.C22793x8500e7df c22793x8500e7df2 = (com.p314xaae8f345.mm.p2776x373aa5.C22793x8500e7df) k17;
            if (c22793x8500e7df2 != null) {
                c22793x8500e7df2.setVisibility(0);
            }
        }
        if (k17 != null) {
            s0Var.f214522b = (ym5.o1) k17;
        }
        s0Var.f214521a = recyclerView;
        c15324x3354d808.b(qrVar, s0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.l(holder);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        if (c15324x3354d808 != null) {
            c15324x3354d808.m62197x3d6fab31().h();
        }
        this.f184683y0 = -1;
        this.f184680l1 = -1;
        this.f184681p1 = -1;
        this.f184682x1 = 0;
        this.f184684y1 = 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w7
    public boolean p() {
        return ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L0().r()).booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void p0(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.p0(holder);
        this.f184685z1 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379 abstractC15229x2dc379 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15229x2dc379) holder.p(com.p314xaae8f345.mm.R.id.f566402fs3);
        if (abstractC15229x2dc379 != null) {
            java.lang.Object obj = holder.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj : null;
            if (abstractC14490x69736cb5 != null && (abstractC14490x69736cb5 instanceof so2.d1)) {
                so2.e1 e1Var = ((so2.d1) abstractC14490x69736cb5).f491844e;
                e1Var.f491857a.clear();
                e1Var.f491858b.clear();
                e1Var.f491859c.clear();
                e1Var.f491860d = abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec().size();
                e1Var.f491857a.put(java.lang.Integer.valueOf(abstractC15229x2dc379.getFocusPosition()), java.lang.Integer.valueOf(((java.lang.Number) e1Var.f491857a.getOrDefault(java.lang.Integer.valueOf(abstractC15229x2dc379.getFocusPosition()), 0)).intValue() + 1));
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f185890J;
        if (c1163xf1deaba4 != null) {
            int childCount = c1163xf1deaba4.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c1163xf1deaba4.getChildAt(i17);
                if (childAt != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 w07 = c1163xf1deaba4.w0(childAt);
                    in5.s0 s0Var = w07 instanceof in5.s0 ? (in5.s0) w07 : null;
                    if (s0Var != null && s0Var.m8185xcdaf1228() == 2) {
                        O1(s0Var);
                    }
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void t(in5.s0 holder) {
        android.view.View p17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        O1(holder);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.g1y);
        if (p18 == null || (p17 = holder.p(com.p314xaae8f345.mm.R.id.h8n)) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderFeedFullImageConvert", "adjustSeekLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.se(holder, p17, p18, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void w(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, boolean z17) {
        int bottom;
        android.view.ViewParent parent;
        so2.d1 item = (so2.d1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.M0).mo141623x754a37bb()).r()).booleanValue()) {
            super.w(holder, item, i17, z17);
            return;
        }
        android.content.Context context = holder.f374654e;
        if ((context instanceof android.app.Activity ? (android.app.Activity) context : null) == null) {
            return;
        }
        if (hc2.f1.f361853f) {
            bottom = com.p314xaae8f345.mm.ui.bl.b(context).y;
        } else {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = holder.o();
            java.lang.Object parent2 = (o17 == null || (parent = o17.getParent()) == null) ? null : parent.getParent();
            android.view.View view = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
            bottom = view != null ? view.getBottom() : context.getResources().getDisplayMetrics().heightPixels;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c15324x3354d808.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = 0;
        layoutParams2.bottomMargin = 0;
        layoutParams2.gravity = 8388723;
        layoutParams2.height = -1;
        android.view.ViewGroup.LayoutParams layoutParams3 = c15324x3354d808.c().getLayoutParams();
        layoutParams3.width = -1;
        layoutParams3.height = -1;
        android.widget.FrameLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams3 : null;
        if (layoutParams4 != null) {
            layoutParams4.topMargin = 0;
            layoutParams4.bottomMargin = 0;
            layoutParams4.gravity = 17;
        }
        c15324x3354d808.m62197x3d6fab31().getImageAdapter().f504005g = bottom;
        c15324x3354d808.requestLayout();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void w0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 holder) {
        so2.d1 item = (so2.d1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.w0(item, holder);
        O1(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.z0(holder, i17, i18, z17);
        this.f184685z1 = false;
    }
}
