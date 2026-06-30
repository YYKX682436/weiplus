package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class b1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0 {
    public final boolean A;
    public long B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13689xc7915f3c C;

    /* renamed from: s, reason: collision with root package name */
    public final cw2.z9 f184448s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 f184449t;

    /* renamed from: u, reason: collision with root package name */
    public final int f184450u;

    /* renamed from: v, reason: collision with root package name */
    public final r45.en2 f184451v;

    /* renamed from: w, reason: collision with root package name */
    public final yz5.a f184452w;

    /* renamed from: x, reason: collision with root package name */
    public final yz5.q f184453x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f184454y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f184455z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1] */
    public b1(cw2.z9 videoCore, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.i0 i0Var, int i18, r45.en2 en2Var, java.lang.String vmKey, yz5.a bigCardAvailableSize, yz5.q onTriggerSpeedChanged) {
        super(contract, false, i0Var, i18, en2Var, vmKey, i17, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCore, "videoCore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vmKey, "vmKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bigCardAvailableSize, "bigCardAvailableSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onTriggerSpeedChanged, "onTriggerSpeedChanged");
        this.f184448s = videoCore;
        this.f184449t = i0Var;
        this.f184450u = i18;
        this.f184451v = en2Var;
        this.f184452w = bigCardAvailableSize;
        this.f184453x = onTriggerSpeedChanged;
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        this.f184454y = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209215ef).mo141623x754a37bb()).r()).booleanValue();
        cq.k1.a();
        this.f184455z = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209253gf).mo141623x754a37bb()).r()).booleanValue();
        cq.k1.a();
        this.A = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209234ff).mo141623x754a37bb()).r()).booleanValue();
        final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f204176d = contract.getF204176d();
        this.C = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a>(f204176d) { // from class: com.tencent.mm.plugin.finder.convert.FinderColumnCardVideoConvert$videoFinishListener$1$1
            {
                this.f39173x3fe91575 = -1291074182;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a c5441x35e2cf6a) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5441x35e2cf6a event = c5441x35e2cf6a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                boolean z17 = event.f135782g.f88194d;
                return true;
            }
        };
    }

    public static final void v(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.b1 b1Var, in5.s0 s0Var, boolean z17) {
        b1Var.getClass();
        float f17 = z17 ? 0.0f : 1.0f;
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.skp);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p17.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.uwr);
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p18.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.ufp);
        if (p19 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p19.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p27 = s0Var.p(com.p314xaae8f345.mm.R.id.oup);
        if (p27 != null) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
            arrayList4.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p27.setAlpha(((java.lang.Float) arrayList4.get(0)).floatValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p28 = s0Var.p(com.p314xaae8f345.mm.R.id.a_x);
        if (p28 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
            arrayList5.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p28, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            p28.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(p28, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        android.view.View p29 = s0Var.p(com.p314xaae8f345.mm.R.id.f566991u85);
        if (p29 == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(p29, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        p29.setAlpha(((java.lang.Float) arrayList6.get(0)).floatValue());
        yj0.a.f(p29, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "transparentViewsAboveVideo", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // in5.r
    public int e() {
        return this.f184454y ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e5x : com.p314xaae8f345.mm.R.C30864xbddafb2a.f570318e61;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13689xc7915f3c c13689xc7915f3c = this.C;
        if (c13689xc7915f3c != null) {
            c13689xc7915f3c.mo48813x58998cd();
        }
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.util.ArrayList arrayList;
        so2.u1 item = (so2.u1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        o(holder, item, i17, i18, z17, list);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Finder.FinderColumnCardVideoConvert-onBindViewHolder position=");
        sb6.append(i17);
        sb6.append(" type=");
        sb6.append(i18);
        sb6.append(" isHotPatch=");
        sb6.append(z17);
        sb6.append(' ');
        sb6.append(hc2.b0.d(item, i17));
        sb6.append(" payloads:");
        if (list != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                jz5.l lVar = (jz5.l) it.next();
                arrayList.add(((java.lang.Number) lVar.f384366d).intValue() + " - " + lVar.f384367e);
            }
        } else {
            arrayList = null;
        }
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderColumnCardVideoConvert", sb6.toString());
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it6.next(), "speedChanged")) {
                    android.view.View view = holder.f3639x46306858;
                    long j17 = this.B;
                    float f17 = (j17 == 0 || j17 == item.getFeedObject().getFeedObject().m76784x5db1b11()) ? 1.0f : 0.0f;
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList3.add(java.lang.Float.valueOf(f17));
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
            return;
        }
        if (!z17) {
            r(holder, item, i17, i18);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f566991u85);
        if (this.f184455z) {
            if (p17 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s.f206870a;
                int i19 = this.f184450u;
                r45.en2 en2Var = this.f184451v;
                java.util.Map a17 = sVar.a(item, i17, i19, en2Var != null ? (r45.ey0) en2Var.m75936x14adae67(11) : null, this.f184451v);
                ey2.u s17 = s();
                android.content.Context context = holder.f374654e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                d2Var.n(p17, "column_card_detail", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : a17, (r20 & 128) != 0 ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r(s17, item, context, this.f185590o));
            }
            if (p17 != null) {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(p17, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (p17 != null) {
                p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z0(holder, this, i17));
            }
        } else if (p17 != null) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p17, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderColumnCardVideoConvert", "refreshJumpToFeedListUI", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.jdk);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 c15379x1d4ea971 = p18 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15379x1d4ea971) p18 : null;
        if (c15379x1d4ea971 == null || !this.A) {
            return;
        }
        long m76784x5db1b11 = item.getFeedObject().getFeedObject().m76784x5db1b11();
        c15379x1d4ea971.m62501xa4648272(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.v0(holder, c15379x1d4ea971, this, m76784x5db1b11));
        c15379x1d4ea971.m62504x769d3274(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w0(holder, this, c15379x1d4ea971, m76784x5db1b11, i17, item));
        c15379x1d4ea971.m62502x198fa353(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x0(this, i17, item));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        if (this.f184454y) {
            holder.f3639x46306858.getLayoutParams().width = -1;
            android.view.View view = holder.f3639x46306858;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15259xa9f9699e c15259xa9f9699e = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15259xa9f9699e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15259xa9f9699e) view : null;
            android.content.Context context = holder.f374654e;
            if (c15259xa9f9699e != null) {
                com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                java.lang.System.nanoTime();
                boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
                java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                int i19 = a17.f278668a;
                if (!z17 && i19 > (i18 = a17.f278669b)) {
                    i19 = i18;
                }
                c15259xa9f9699e.m61752x8e6ff544(i19 - (context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn) * 2));
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15324x3354d808);
            android.view.ViewGroup.LayoutParams layoutParams = c15324x3354d808.getLayoutParams();
            if (layoutParams == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            layoutParams.width = -1;
            layoutParams.height = -1;
            c15324x3354d808.setLayoutParams(layoutParams);
            holder.f3639x46306858.setOutlineProvider(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.y0(context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)));
            holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.tuy, java.lang.Integer.valueOf(i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn)));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.g99);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setFocusable(false);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.w7, in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.C13689xc7915f3c c13689xc7915f3c = this.C;
        if (c13689xc7915f3c != null) {
            c13689xc7915f3c.mo48814x2efc64();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0, in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.l(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0
    public void q(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!this.f184454y || abstractC14490x69736cb5 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        float f17 = bu2.z.f(abstractC14490x69736cb5.getFeedObject().m59264x7efe73ec(), "Finder.FinderColumnCardVideoConvert", false, 2, null);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.jdk);
        if (p17 != null) {
            p17.setTranslationY(0.0f);
            if (f17 < 1.0f) {
                p17.setTranslationY((-i18) * 0.05f);
            }
        }
        if (c15324x3354d808 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = c15324x3354d808.getLayoutParams();
            android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.gravity = 17;
            }
            android.view.ViewGroup.LayoutParams layoutParams3 = c15324x3354d808.c().getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.width = i17;
                layoutParams3.height = (int) (i17 * f17);
            }
            c15324x3354d808.requestLayout();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0
    public android.util.Size t(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        if (!this.f184454y) {
            return super.t(holder);
        }
        android.util.Size size = (android.util.Size) this.f184452w.mo152xb9724478();
        android.view.View view = holder.f3639x46306858;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15259xa9f9699e c15259xa9f9699e = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15259xa9f9699e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15259xa9f9699e) view : null;
        if (c15259xa9f9699e == null) {
            return super.t(holder);
        }
        int width = size.getWidth();
        int height = size.getHeight();
        boolean z17 = false;
        if (c15259xa9f9699e.aspectRatio <= 0.0f) {
            return new android.util.Size(0, 0);
        }
        int i17 = c15259xa9f9699e.maxWidth;
        int min = i17 > 0 ? java.lang.Math.min(width, i17) : width;
        int b17 = a06.d.b(min / c15259xa9f9699e.aspectRatio);
        if (b17 > height) {
            min = a06.d.b(height * c15259xa9f9699e.aspectRatio);
            int i18 = c15259xa9f9699e.maxWidth;
            if (1 <= i18 && i18 < min) {
                z17 = true;
            }
            if (z17) {
                height = a06.d.b(i18 / c15259xa9f9699e.aspectRatio);
                min = i18;
            }
        } else {
            height = b17;
        }
        if (min > width) {
            height = a06.d.b(width / c15259xa9f9699e.aspectRatio);
        } else {
            width = min;
        }
        return new android.util.Size(width, height);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr u() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.qr.f214440f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.n0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void r(in5.s0 holder, so2.u1 item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808 c15324x3354d808 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15324x3354d808) holder.p(com.p314xaae8f345.mm.R.id.fs6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y yVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.y();
        yVar.f214901d = this.f184448s;
        yVar.f214899b = this.f185590o;
        yVar.f214903f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t0(holder);
        yVar.f214902e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.u0(holder, item, this);
        c15324x3354d808.a(item, yVar);
    }
}
