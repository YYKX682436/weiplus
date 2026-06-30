package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class yn extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh {
    public final jz5.g A1;
    public final jz5.g B1;
    public final jz5.g C1;
    public java.lang.Runnable D1;
    public long E1;

    /* renamed from: z1, reason: collision with root package name */
    public final jz5.g f186561z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yn(cw2.f8 videoCore, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 contract) {
        super(videoCore, contract, false, 301, true, 4, null);
        fc2.c Y6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoCore, "videoCore");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contract, "contract");
        this.f186561z1 = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.un.f186255d);
        this.A1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.wn(contract, this));
        this.B1 = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ln(contract));
        this.C1 = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.xn.f186496d);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = contract.getF204176d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        if (nyVar == null || (Y6 = nyVar.Y6(this.f185893h)) == null) {
            return;
        }
        Y6.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.an(contract, this));
    }

    public static final void Q1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn ynVar, in5.s0 s0Var, boolean z17) {
        ynVar.getClass();
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.frs);
        int i17 = (p17.getVisibility() != 0 || z17) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "toggleSeekBar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) s0Var.p(com.p314xaae8f345.mm.R.id.f569075oy0);
        if (seekBar != null) {
            seekBar.setVisibility(i17 != 0 ? 0 : 8);
        }
        if (i17 == 0) {
            java.lang.Runnable runnable = ynVar.D1;
            if (runnable != null) {
                ynVar.R1().mo50300x3fa464aa(runnable);
                ynVar.D1 = null;
            }
            ynVar.D1 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bn(s0Var, ynVar);
            ynVar.R1().mo50297x7c4d7ca2(ynVar.D1, 5000L);
        } else {
            java.lang.Runnable runnable2 = ynVar.D1;
            if (runnable2 != null) {
                ynVar.R1().mo50300x3fa464aa(runnable2);
                ynVar.D1 = null;
            }
        }
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.fsk);
        android.view.ViewGroup.LayoutParams layoutParams = p19 != null ? p19.getLayoutParams() : null;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams == null) {
            return;
        }
        marginLayoutParams.bottomMargin = ym5.x.a(s0Var.f374654e, i17 == 0 ? 0.0f : 16.0f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /* renamed from: O1, reason: merged with bridge method [inline-methods] */
    public void K(in5.s0 holder, so2.u1 item, int i17, int i18) {
        android.content.Intent intent;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.frs);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.frr);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.fup);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(p27, arrayList4.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p27.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88.f36135x233c02ec.a(item);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (S1()) {
            c15196x85976f5f.mo61326x26d5cbcc(true);
            c15196x85976f5f.m61498x764cf626(false);
            c15196x85976f5f.m61505x7a6ecfb9(true);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d c15195x130b2a6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15195x130b2a6d) holder.p(com.p314xaae8f345.mm.R.id.frt);
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.g99);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
        c15195x130b2a6d.m61456x5dd06d88((android.widget.ImageView) p28);
        c15195x130b2a6d.m61455x8526bc7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dn(holder));
        android.view.View p29 = holder.p(com.p314xaae8f345.mm.R.id.iqn);
        c15195x130b2a6d.m61457x69ba6e5a((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565538co4));
        c15195x130b2a6d.m61458xd759f465((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ohr));
        c15195x130b2a6d.m61361x9f2e47e9(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.en(this, holder, c15195x130b2a6d, p29));
        c15195x130b2a6d.m61360x20ee4222(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fn(p29, c15195x130b2a6d, holder));
        android.content.Context context = holder.f374654e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c15195x130b2a6d.m61362xe79c771c(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gn(this, holder, c15196x85976f5f, c15195x130b2a6d, (activity == null || (intent = activity.getIntent()) == null || intent.getIntExtra("key_comment_scene", 0) != 285) ? false : true, (((r45.mb4) kz5.n0.Z(a17.m59135x7efe73ec())) != null ? r0.m75939xb282bd08(3) : 0) * 1000, item));
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(a17.m59135x7efe73ec());
        c15195x130b2a6d.mo61298xa7077af8(mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c15196x85976f5f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f.v(c15196x85976f5f, 0, a17, c15195x130b2a6d, this.f185893h, null, null, false, false, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, null);
        c15196x85976f5f.C(c15195x130b2a6d);
        c15195x130b2a6d.m61363xdde58aa7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hn(holder));
        if (S1()) {
            cw2.da videoView = c15196x85976f5f.getVideoView();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = videoView instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView : null;
            if (c15188xd8bd4bd != null) {
                c15188xd8bd4bd.m61420xeb2d9731(1.0f);
            }
            cw2.v9.n(c15196x85976f5f, 0, null, null, 7, null);
            r45.mb4 mb4Var2 = (r45.mb4) kz5.n0.Z(a17.m59135x7efe73ec());
            if (mb4Var2 != null) {
                r45.gn2 gn2Var = (r45.gn2) mb4Var2.m75936x14adae67(45);
                if (gn2Var != null && gn2Var.m75933x41a8a7f2(1)) {
                    cw2.da videoView2 = c15196x85976f5f.getVideoView();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd2 = videoView2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) videoView2 : null;
                    if (c15188xd8bd4bd2 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd.h0(c15188xd8bd4bd2, new cw2.t4((r45.gn2) mb4Var2.m75936x14adae67(45), com.p314xaae8f345.mm.p2470x93e71c27.ui.e1.CROP), false, 2, null);
                    }
                }
            }
        }
        c15196x85976f5f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.in(c15196x85976f5f, item, this, holder));
        android.widget.SeekBar seekBar = (android.widget.SeekBar) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0);
        if (seekBar != null) {
            seekBar.setVisibility(0);
        }
        c15196x85976f5f.t(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jn(holder));
        android.view.View p37 = holder.p(com.p314xaae8f345.mm.R.id.iqj);
        if (p37 != null) {
            int i19 = item.getFeedObject().m59314x4d5c4d55() ? 0 : 8;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(p37, arrayList5.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(p37, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p37.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kn(c15196x85976f5f, holder));
        }
        android.view.View p38 = holder.p(com.p314xaae8f345.mm.R.id.iqi);
        if (p38 != null) {
            java.lang.System.nanoTime();
            boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            int i27 = z17 ? 8 : 0;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(p38, arrayList6.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(p38, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "convertMedia", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p38.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cn(holder));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public int P() {
        return 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.tencent.mm.plugin.finder.storage.y90, java.lang.Object, kotlin.jvm.internal.i] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, in5.r
    /* renamed from: P1, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.u1 item, int i17, int i18, boolean z17, java.util.List list) {
        android.content.Context context;
        java.lang.String str;
        android.content.Context context2;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f186384e.d(holder, item, i17, i18, z17, list);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", "onBindViewHolder position:" + i17 + " type:" + i18 + " holder:" + holder + ", id=" + pm0.v.u(item.mo2128x1ed62e84()));
        if (this.f185891f instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl) {
            holder.f374658i = item;
            if (holder.o() == null) {
                holder.f374659m = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) this.A1).mo141623x754a37bb();
            }
            jz5.g gVar = this.f186561z1;
            ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).clear();
            ((java.util.ArrayList) ((jz5.n) gVar).mo141623x754a37bb()).add(item);
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        if (zl5.b.f555620b) {
            itemView.setTag(com.p314xaae8f345.mm.R.id.nxc, "Finder");
            itemView.setTag(com.p314xaae8f345.mm.R.id.nxb, item);
        }
        boolean z18 = list == null || list.isEmpty();
        int i19 = 3;
        int i27 = 4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = null;
        java.lang.String str3 = "getContext(...)";
        int i28 = 2;
        android.content.Context context3 = holder.f374654e;
        if (z18) {
            context = context3;
            str = "getContext(...)";
        } else {
            boolean z19 = true;
            for (java.lang.Object obj : list) {
                if (obj instanceof jz5.l) {
                    int intValue = ((java.lang.Number) ((jz5.l) obj).f384366d).intValue();
                    if (intValue == 1) {
                        context2 = context3;
                        str2 = str3;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.M0(this, item, holder, null, 4, null);
                    } else if (intValue != i28) {
                        if (intValue == i19) {
                            context2 = context3;
                            str2 = str3;
                            nv2.n1 n1Var = nv2.n1.f422084h;
                            jz5.l k17 = n1Var.k(item.getFeedObject().getFeedObject());
                            boolean booleanValue = ((java.lang.Boolean) k17.f384366d).booleanValue();
                            boolean booleanValue2 = ((java.lang.Boolean) k17.f384367e).booleanValue();
                            I0(item, booleanValue, booleanValue2, n1Var.l(item.getFeedObject().getFeedObject()), holder, i17);
                            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("feed_like_click", holder.p(com.p314xaae8f345.mm.R.id.a_x), kz5.c1.k(new jz5.l("is_action_like", java.lang.Integer.valueOf(booleanValue ? 1 : 0)), new jz5.l("is_private", java.lang.Integer.valueOf(booleanValue2 ? 1 : 0))), 24617);
                            t1(item, holder, true, i17);
                            if (booleanValue) {
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, str2);
                                pf5.z zVar = pf5.z.f435481a;
                                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                                    throw new java.lang.IllegalStateException("Check failed.".toString());
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po poVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.po.class);
                                if (poVar != null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.xj xjVar = poVar.f217106e;
                                    if (xjVar == null) {
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("viewCallback");
                                        throw null;
                                    }
                                    com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) xjVar.f192605a.findViewById(com.p314xaae8f345.mm.R.id.ipw);
                                    if (c2678xa407981c != null) {
                                        c2678xa407981c.d(true, false, true);
                                    }
                                }
                            }
                        } else if (intValue == i27) {
                            context2 = context3;
                            str2 = str3;
                            B1(holder, item);
                            P0(holder, item);
                        } else if (intValue == 29) {
                            context2 = context3;
                            str2 = str3;
                            T0(holder);
                        } else if (intValue != 30) {
                            switch (intValue) {
                                case 9:
                                    context2 = context3;
                                    str2 = str3;
                                    U0(item, holder);
                                    break;
                                case 10:
                                    context2 = context3;
                                    str2 = str3;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = item.getFeedObject();
                                    feedObject.m59381x85124ecc(feedObject.m59246x4ec953c0() + 1);
                                    U0(item, holder);
                                    break;
                                case 11:
                                    context2 = context3;
                                    str2 = str3;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.M0(this, item, holder, null, 4, null);
                                    break;
                                case 12:
                                    context2 = context3;
                                    str2 = str3;
                                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.M0(this, item, holder, null, 4, null);
                                    U0(item, holder);
                                    nv2.n1 n1Var2 = nv2.n1.f422084h;
                                    jz5.l k18 = n1Var2.k(item.getFeedObject().getFeedObject());
                                    I0(item, ((java.lang.Boolean) k18.f384366d).booleanValue(), ((java.lang.Boolean) k18.f384367e).booleanValue(), n1Var2.l(item.getFeedObject().getFeedObject()), holder, i17);
                                    z(holder, item);
                                    J0(holder, true);
                                    break;
                            }
                        } else {
                            context2 = context3;
                            str2 = str3;
                            java.lang.Object obj2 = holder.f374658i;
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "getAssociatedObject(...)");
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.x(this, holder, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2, i17, false, 8, null);
                            T0(holder);
                        }
                        nyVar = null;
                    } else {
                        context2 = context3;
                        str2 = str3;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.n1(this, item, holder, false, 4, null);
                    }
                    str3 = str2;
                    context3 = context2;
                    i28 = 2;
                    i19 = 3;
                    i27 = 4;
                    z19 = z19;
                }
                context2 = context3;
                str2 = str3;
                z19 = false;
                continue;
                str3 = str2;
                context3 = context2;
                i28 = 2;
                i19 = 3;
                i27 = 4;
                z19 = z19;
            }
            context = context3;
            str = str3;
            if (z19) {
                return;
            }
        }
        if (!z17) {
            if (S1()) {
                l(holder);
            }
            K(holder, item, i17, i18);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.f3639x46306858, "finder_feed_item_view");
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view = holder.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[8];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(item.getFeedObject().getFeedObject().m76784x5db1b11()));
        lVarArr[1] = new jz5.l("session_buffer", item.getFeedObject().getFeedObject().m76829x97edf6c0());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar2 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : nyVar;
        lVarArr[2] = new jz5.l("comment_scene", nyVar2 != null ? java.lang.Integer.valueOf(nyVar2.f216913n) : nyVar);
        lVarArr[3] = new jz5.l("finder_username", item.getFeedObject().getFeedObject().m76836x6c03c64c());
        lVarArr[4] = new jz5.l("media_type", java.lang.Integer.valueOf(item.getFeedObject().getMediaType()));
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        lVarArr[5] = new jz5.l("video_duration_time", java.lang.String.valueOf(mb4Var != null ? mb4Var.m75939xb282bd08(3) : 0));
        lVarArr[6] = new jz5.l("long_video_id", pm0.v.u(item.mo2128x1ed62e84()));
        lVarArr[7] = new jz5.l("feed_display_type", "1");
        ((cy1.a) rVar).gk(view, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(holder.f3639x46306858, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mn(holder));
        ?? r142 = nyVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.x(this, holder, item, i17, false, 8, null);
        T0(holder);
        ya2.b2 contact = item.getContact();
        java.lang.String m176700xe5e0d2a0 = contact != null ? contact.m176700xe5e0d2a0() : r142;
        if (m176700xe5e0d2a0 == null || m176700xe5e0d2a0.length() == 0) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = item.getFeedObject().getFeedObject().m76760x76845fea();
            m176700xe5e0d2a0 = m76760x76845fea != null ? m76760x76845fea.m76175x6d346f39() : r142;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(m176700xe5e0d2a0, r142, 2, r142);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.a_4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p17, g1Var.h(mn2.f1.f411490h));
        N0(holder, item);
        nv2.n1 n1Var3 = nv2.n1.f422084h;
        jz5.l k19 = n1Var3.k(item.getFeedObject().getFeedObject());
        I0(item, ((java.lang.Boolean) k19.f384366d).booleanValue(), ((java.lang.Boolean) k19.f384367e).booleanValue(), n1Var3.l(item.getFeedObject().getFeedObject()), holder, i17);
        v(holder, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.M0(this, item, holder, null, 4, null);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.gbz);
        if (p18 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.msw);
        if (p19 != null) {
            p19.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nn(this, holder));
        }
        holder.p(com.p314xaae8f345.mm.R.id.msw).setOnLongClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.on(holder, item));
        t1(item, holder, false, i17);
        U0(item, holder);
        W0(holder);
        P0(holder, item);
        B1(holder, item);
        k1(item, holder);
        g1(item, holder);
        e0(holder, false);
        if (S1()) {
            Z0(item, holder, i17, true);
            R1().mo50302x6b17ad39(r142);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public int R(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f185891f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl) k8Var : null;
        if (tlVar == null) {
            return super.R(holder);
        }
        android.view.View findViewById = tlVar.g().f192605a.findViewById(com.p314xaae8f345.mm.R.id.iqo);
        if (findViewById != null) {
            return findViewById.getHeight();
        }
        return 0;
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 R1() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.C1).mo141623x754a37bb();
    }

    public final boolean S1() {
        return ((java.lang.Boolean) ((jz5.n) this.B1).mo141623x754a37bb()).booleanValue();
    }

    public final void T1(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.p(com.p314xaae8f345.mm.R.id.iqf);
        android.content.Context context = holder.f374654e;
        if (frameLayout != null) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b2j, (android.view.ViewGroup) null, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.video.FinderVideoLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) inflate;
            c15196x85976f5f.m61512xab2cb478(this.f184510y0);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 17;
            frameLayout.addView(c15196x85976f5f, 0, layoutParams);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rn rnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rn(this, holder);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.f565538co4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) p17);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.ohr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) p18);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.ehh);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e0e);
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
        android.widget.TextView textView3 = (android.widget.TextView) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.a8p);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306 c22604x4b44d306 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22604x4b44d306) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g9g);
        com.p314xaae8f345.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        c22604x4b44d306.m81268x8e6ff544((int) (((android.app.Activity) context).getBaseContext().getResources().getDisplayMetrics().widthPixels * 0.36f));
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
        imageView.setOnClickListener(rnVar);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(imageView, "finder_feed_avatar");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(imageView, 8, 24617);
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) holder.p(com.p314xaae8f345.mm.R.id.f568811o45);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15213xbf81077c.f212351x;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c23001x9d3a0bdc);
        c23001x9d3a0bdc.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c23001x9d3a0bdc, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.a0(c23001x9d3a0bdc)));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qn qnVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qn(this, holder);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.getMainLooper().getThread(), java.lang.Thread.currentThread())) {
            qnVar.run();
        } else {
            holder.f3639x46306858.post(qnVar);
        }
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.gbz);
        if (p19 != null) {
            if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.D1().r()).booleanValue()) {
                p19.setOnClickListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.pn.f185805d);
            }
            android.widget.TextView textView4 = (android.widget.TextView) p19.findViewById(com.p314xaae8f345.mm.R.id.lja);
            if (textView4 != null) {
                textView4.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView5 = (android.widget.TextView) p19.findViewById(com.p314xaae8f345.mm.R.id.dtx);
            if (textView5 != null) {
                textView5.setTextSize(1, 12.0f);
                textView5.setText(cu2.f0.f303924a.g());
            }
            android.widget.TextView textView6 = (android.widget.TextView) p19.findViewById(com.p314xaae8f345.mm.R.id.msm);
            if (textView6 != null) {
                textView6.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView7 = (android.widget.TextView) p19.findViewById(com.p314xaae8f345.mm.R.id.i1g);
            if (textView7 != null) {
                textView7.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView8 = (android.widget.TextView) p19.findViewById(com.p314xaae8f345.mm.R.id.f568619ng3);
            if (textView8 != null) {
                textView8.setTextSize(1, 12.0f);
            }
            android.widget.TextView textView9 = (android.widget.TextView) p19.findViewById(com.p314xaae8f345.mm.R.id.c6s);
            if (textView9 != null) {
                textView9.setTextSize(1, 12.0f);
            }
        }
        android.widget.TextView textView10 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f567094i44);
        if (textView10 != null) {
            textView10.setTextSize(1, 10.0f);
        }
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.f568621ng5);
        if (p27 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p27, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p27.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p27, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onCreateViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        r(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /* renamed from: U1, reason: merged with bridge method [inline-methods] */
    public void N0(in5.s0 holder, so2.u1 item) {
        int i17;
        java.util.LinkedList<r45.cw2> m76976x275e039f;
        r45.cw2 cw2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) holder.p(com.p314xaae8f345.mm.R.id.f568811o45);
        android.content.Context context = holder.f374654e;
        if (this.f185894i) {
            c23001x9d3a0bdc.m84183x1c5c5ff4(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        }
        java.lang.CharSequence descriptionSpan = item.getFeedObject().getDescriptionSpan();
        if (descriptionSpan == null) {
            descriptionSpan = "";
        }
        boolean z17 = true;
        if (!(descriptionSpan.length() == 0)) {
            c23001x9d3a0bdc.k(0.0f, 1.2f);
            c23001x9d3a0bdc.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sn(this, item, holder));
            c23001x9d3a0bdc.m84166xb86dec4b(android.text.TextUtils.TruncateAt.END);
            if (S1()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
                i17 = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Y2).mo141623x754a37bb()).r()).intValue();
            } else {
                i17 = 4;
            }
            c23001x9d3a0bdc.m84175x8dd5167d(i17);
            c23001x9d3a0bdc.setVisibility(0);
            item.getFeedObject().getTopicClickExtra().f184008d = new java.lang.ref.WeakReference(context);
            c23001x9d3a0bdc.b(descriptionSpan);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", "content:" + ((java.lang.Object) descriptionSpan) + " nickname:" + item.getFeedObject().getFeedObject().m76801x8010e5e4());
        } else if (c23001x9d3a0bdc != null) {
            c23001x9d3a0bdc.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.e0e);
        if (textView != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = item.getFeedObject().getFeedObject().m76802x2dd01666();
            java.lang.String m75945x2fec8307 = (m76802x2dd01666 == null || (m76976x275e039f = m76802x2dd01666.m76976x275e039f()) == null || (cw2Var = (r45.cw2) kz5.n0.Z(m76976x275e039f)) == null) ? null : cw2Var.m75945x2fec8307(0);
            if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                z17 = false;
            }
            if (z17) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec8307));
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.tn(this, holder, item));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /* renamed from: V1, reason: merged with bridge method [inline-methods] */
    public void Z0(so2.u1 item, in5.s0 holder, int i17, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ehc);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "refreshHotComment", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "refreshHotComment", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedVideo;Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        super.Z0(item, holder, i17, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.ahk;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void e0(in5.s0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        so2.u1 u1Var = (so2.u1) holder.f374658i;
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.g4n);
        int i17 = (u1Var.getFeedObject().m59314x4d5c4d55() && u1Var.h2(this.f185891f.d0())) ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "initBulletLayout", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        super.e0(holder, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        T1(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe, in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        tc2.b bVar = this.f186384e;
        bVar.getClass();
        bVar.b(holder);
        bb2.p0 p0Var = bb2.p0.f100473a;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        bb2.a1 a17 = p0Var.a(itemView);
        if (a17 != null) {
            a17.mo10139x3f5eee52();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f != null) {
            c15196x85976f5f.P();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void o0(in5.s0 holder, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = holder.f374658i;
        so2.u1 u1Var = obj instanceof so2.u1 ? (so2.u1) obj : null;
        if (u1Var == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onDeepEnjoyMedia] ");
        ya2.b2 contact = u1Var.getContact();
        sb6.append(contact != null ? contact.w0() : null);
        sb6.append(" position=");
        sb6.append(i17);
        sb6.append(" type=");
        sb6.append(i18);
        sb6.append(" source=");
        sb6.append(i19);
        sb6.append(" feedId=");
        sb6.append(pm0.v.u(u1Var.mo2128x1ed62e84()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLongVideoConvert", sb6.toString());
        if (this.f185891f.d0() || u1Var.getIsDeepEnjoy()) {
            return;
        }
        u1Var.e1(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe.G(this, holder, u1Var, false, 4, null);
        H(holder, u1Var);
        k1(u1Var, holder);
        W0(holder);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void v1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, in5.s0 holder) {
        so2.u1 item = (so2.u1) abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b8  */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(in5.s0 r11, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.yn.w(in5.s0, com.tencent.mm.plugin.finder.model.BaseFinderFeed, int, boolean):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bh, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe
    public void z0(in5.s0 holder, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        this.f186384e.f(holder, i17, i18, z17);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.frs);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.g99);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/FinderLongVideoConvert", "onUnFocusFeedCenter", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.SeekBar seekBar = (android.widget.SeekBar) holder.p(com.p314xaae8f345.mm.R.id.f569075oy0);
        if (seekBar != null) {
            seekBar.setVisibility(0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        if (c15196x85976f5f == null || c15196x85976f5f.J()) {
            return;
        }
        c15196x85976f5f.M();
    }
}
