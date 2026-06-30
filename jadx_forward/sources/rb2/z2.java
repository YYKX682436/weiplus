package rb2;

/* loaded from: classes10.dex */
public final class z2 extends rb2.m0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter, long j17) {
        super(presenter, j17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
    }

    public static final void B(rb2.z2 z2Var, in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, android.view.ViewGroup viewGroup, android.view.View view, android.view.View view2, android.view.View view3, boolean z17) {
        z2Var.getClass();
        pm0.v.X(new rb2.p1(z17, viewGroup, view2, view3, view, z2Var, s0Var, j17, j18, j60Var));
    }

    public final void C(android.view.View view, float f17, float f18) {
        view.clearAnimation();
        view.setTranslationX(f18);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "animateViewMove", "(Landroid/view/View;FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "animateViewMove", "(Landroid/view/View;FF)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.animate().translationX(0.0f).alpha(1.0f).setDuration(300L).setListener(new rb2.n1(view)).start();
    }

    public final void D(in5.s0 s0Var, so2.y0 y0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter = this.f475219e;
        boolean r17 = nPresenter.r();
        boolean x17 = nPresenter.x();
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.uca);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) s0Var.p(com.p314xaae8f345.mm.R.id.v2_);
        if (!r17 || !y0Var.f492236d.d1()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (x17) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if ((y0Var.f492236d.u0().m76072xefec40f7() & 2) != 0) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
                K(true, c22699x3dcdb352);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
                K(false, c22699x3dcdb352);
            }
        } else {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "setStar", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;ZZLcom/tencent/mm/plugin/finder/model/FinderFeedComment;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        s0Var.p(com.p314xaae8f345.mm.R.id.uca).setOnClickListener(new rb2.r1(y0Var, this, s0Var));
    }

    public final void E(android.view.View view, java.lang.String str, so2.y0 y0Var, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.mvi)).setText(str);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.mvf);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.mvh);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new rb2.s1(findViewById, findViewById2, this, y0Var, i17));
    }

    public final void F(in5.s0 s0Var, long j17, long j18, r45.j60 j60Var, boolean z17) {
        android.widget.ImageView imageView;
        int i17;
        java.lang.String m75945x2fec8307;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.swj);
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.u3z);
        android.view.View p18 = s0Var.p(com.p314xaae8f345.mm.R.id.u3l);
        android.view.View p19 = s0Var.p(com.p314xaae8f345.mm.R.id.u3m);
        android.widget.ImageView imageView2 = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.c7_);
        if (z17) {
            viewGroup.setVisibility(0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            imageView = imageView2;
            i17 = 0;
            yj0.a.d(p18, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p19, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p19, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(p17, arrayList3.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "loadCommentImage", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;JJLcom/tencent/mm/protocal/protobuf/CommentImageInfo;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            imageView = imageView2;
            i17 = 0;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.g0();
        g0Var.f391654d = 1L;
        java.lang.String m75945x2fec83072 = j60Var.m75945x2fec8307(7);
        if (((m75945x2fec83072 == null || m75945x2fec83072.length() == 0) ? 1 : i17) != 0) {
            h0Var.f391656d = j60Var.m75945x2fec8307(i17);
            m75945x2fec8307 = j60Var.m75945x2fec8307(1);
            g0Var.f391654d = 0L;
        } else {
            h0Var.f391656d = j60Var.m75945x2fec8307(7);
            m75945x2fec8307 = j60Var.m75945x2fec8307(8);
        }
        java.lang.String str = m75945x2fec8307;
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.f0().r()).booleanValue()) {
            h0Var.f391656d = "failedTest:" + ((java.lang.String) h0Var.f391656d);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadCommentImage ");
        sb6.append((java.lang.String) h0Var.f391656d);
        sb6.append(str == null ? "" : str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", sb6.toString());
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
        ya2.l lVar = ya2.l.f542035a;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append((java.lang.String) h0Var.f391656d);
        sb7.append(str != null ? str : "");
        wo0.c a17 = d1Var.a(lVar.e(sb7.toString(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        rb2.t1 t1Var = new rb2.t1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19);
        a17.getClass();
        a17.f529406d = t1Var;
        a17.f529412j = new rb2.u1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19, currentTimeMillis, h0Var, str, g0Var);
        a17.f529411i = new rb2.v1(this, s0Var, j17, j18, j60Var, viewGroup, p17, p18, p19);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.b(imageView, z17);
    }

    public final void G(in5.s0 s0Var, so2.y0 y0Var, java.lang.Object obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter) {
        r45.j60 j60Var;
        java.util.LinkedList m75941xfb821914;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.swi);
        if (viewGroup == null) {
            return;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.c7_);
        r45.e60 v07 = y0Var.f492236d.v0();
        r45.j60 j60Var2 = (v07 == null || (m75941xfb821914 = v07.m75941xfb821914(1)) == null) ? null : (r45.j60) kz5.n0.Z(m75941xfb821914);
        if (y0Var.f492236d.j1() || y0Var.f492236d.w0() != 2 || j60Var2 == null) {
            viewGroup.setOnClickListener(null);
            viewGroup.setVisibility(8);
            return;
        }
        viewGroup.setVisibility(0);
        viewGroup.setAlpha(1.0f);
        android.content.Context context = s0Var.f374654e;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561195c0);
        int min = java.lang.Math.min(j60Var2.m75939xb282bd08(2), j60Var2.m75939xb282bd08(3));
        float max = min == 0 ? 1.0f : java.lang.Math.max(j60Var2.m75939xb282bd08(2), j60Var2.m75939xb282bd08(3)) / min;
        if (max > 1.3333334f) {
            max = 1.3333334f;
        }
        if (j60Var2.m75939xb282bd08(3) > j60Var2.m75939xb282bd08(2)) {
            viewGroup.getLayoutParams().width = dimensionPixelSize;
            viewGroup.getLayoutParams().height = (int) (dimensionPixelSize * max);
        } else {
            viewGroup.getLayoutParams().width = (int) (dimensionPixelSize * max);
            viewGroup.getLayoutParams().height = dimensionPixelSize;
        }
        java.util.LinkedList Q0 = y0Var.f492236d.Q0();
        java.lang.String m75945x2fec8307 = (Q0 == null || (j60Var = (r45.j60) kz5.n0.Z(Q0)) == null) ? null : j60Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
            F(s0Var, y0Var.f492236d.t0(), y0Var.f492236d.f68959xf9a02e3e, j60Var2, !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 6));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "use localImage");
            ((android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.swj)).setVisibility(8);
            mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            wo0.c d17 = d1Var.d(ya2.l.f542035a.e(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            d17.b(imageView, !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 5));
        }
        viewGroup.setOnClickListener(new rb2.o2(nPresenter, y0Var));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(viewGroup, "image_comment");
        aVar.Tj(viewGroup, 40, 1, false);
        aVar.gk(viewGroup, kz5.c1.l(new jz5.l("comment_scene", java.lang.Integer.valueOf(nPresenter.mo56026x8fadefe3())), new jz5.l("comment_id", pm0.v.u(y0Var.f492236d.t0())), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("feed_id", pm0.v.u(y0Var.f492236d.f68959xf9a02e3e))));
        L(s0Var, y0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(android.view.ViewGroup viewGroup, in5.s0 s0Var, so2.y0 y0Var, java.lang.Object obj, boolean z17) {
        int i17;
        int i18;
        r45.k60 m76073x14544c = y0Var.f492236d.u0().m76073x14544c();
        java.util.LinkedList m75941xfb821914 = m76073x14544c != null ? m76073x14544c.m75941xfb821914(0) : null;
        int i19 = 8;
        if ((m75941xfb821914 == null || m75941xfb821914.isEmpty()) == true) {
            viewGroup.setVisibility(8);
            viewGroup.setOnClickListener(null);
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.tyd);
        if (textView == null) {
            return;
        }
        int visibility = viewGroup.getVisibility();
        android.content.Context context = s0Var.f374654e;
        if (visibility == 8 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 3)) {
            viewGroup.clearAnimation();
            viewGroup.setAlpha(0.0f);
            viewGroup.setTranslationY(-i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz));
            viewGroup.animate().alpha(1.0f).translationY(0.0f).setDuration(300L).setListener(new rb2.u2(viewGroup)).start();
        }
        viewGroup.setVisibility(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        n3.t1 t1Var = new n3.t1(viewGroup);
        while (t1Var.hasNext()) {
            android.view.View view = (android.view.View) t1Var.next();
            if (view instanceof android.widget.ImageView) {
                arrayList.add(view);
            }
        }
        int i27 = 0;
        int i28 = 0;
        for (java.lang.Object obj2 : arrayList) {
            int i29 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.widget.ImageView imageView = (android.widget.ImageView) obj2;
            if (i27 >= m75941xfb821914.size()) {
                ((android.widget.ImageView) arrayList.get(i27)).setVisibility(i19);
            } else {
                ((android.widget.ImageView) arrayList.get(i27)).setVisibility(0);
                i28++;
                java.lang.String m75945x2fec8307 = ((r45.h60) m75941xfb821914.get(i27)).m75945x2fec8307(0);
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Bi(imageView, m75945x2fec8307, true);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "[setLikeAvatar] " + i27 + ", " + m75945x2fec8307);
            }
            i27 = i29;
            i19 = 8;
        }
        r45.h60 h60Var = (r45.h60) kz5.n0.k0(m75941xfb821914);
        java.lang.String m75945x2fec83072 = h60Var != null ? h60Var.m75945x2fec8307(0) : null;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(m75945x2fec83072, true);
        tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String P0 = n17.P0();
        ((sg3.a) v0Var).getClass();
        java.lang.String f17 = c01.a2.f(m75945x2fec83072, P0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        sb6.append(hc2.x0.f(f17, 6));
        sb6.append(' ');
        java.lang.String sb7 = sb6.toString();
        android.widget.TextView textView2 = (android.widget.TextView) s0Var.p(com.p314xaae8f345.mm.R.id.tyb);
        if (m75941xfb821914.size() == 1) {
            java.lang.String string = textView2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1r);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            android.content.Context context2 = textView2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            textView2.setText(hc2.x0.k(string, context2, '#', com.p314xaae8f345.mm.R.raw.f80143xebd704ef, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19, (int) textView2.getTextSize(), (int) textView2.getTextSize(), 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.f565938tb5, textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nnp));
            i17 = i28;
        } else {
            i17 = i28;
            java.lang.String h17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.h(m75941xfb821914.size());
            java.lang.String string2 = textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573570f10, h17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            android.content.Context context3 = textView2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
            textView2.setText(hc2.x0.k(string2, context3, '#', com.p314xaae8f345.mm.R.raw.f80143xebd704ef, com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19, (int) textView2.getTextSize(), (int) textView2.getTextSize(), 0, 0, 0, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null));
            viewGroup.setTag(com.p314xaae8f345.mm.R.id.f565938tb5, textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o2o, h17));
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z18 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i37 = a17.f278668a;
        if (!z18 && i37 > (i18 = a17.f278669b)) {
            i37 = i18;
        }
        int f18 = i37 - (y0Var.h() == 2 ? i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.by) : i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo));
        float measureText = textView2.getPaint().measureText(textView2.getText().toString());
        float f19 = i17 * i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1);
        float f27 = f18;
        if (textView.getPaint().measureText(sb7) + measureText + f19 > f27) {
            sb7 = hc2.x0.f(f17, 3) + ' ';
            if (textView.getPaint().measureText(sb7) + measureText + f19 > f27) {
                sb7 = "";
            }
        }
        textView.setText(sb7);
        viewGroup.setTag(com.p314xaae8f345.mm.R.id.tb6, sb7);
        viewGroup.setOnClickListener(new rb2.v2(m75941xfb821914, s0Var));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(viewGroup, "friend_recommend_comment");
        aVar.Tj(viewGroup, 40, 1, false);
        aVar.gk(viewGroup, kz5.c1.l(new jz5.l("comment_id", pm0.v.u(y0Var.mo2128x1ed62e84())), new jz5.l("feed_id", pm0.v.u(this.f475220f)), new jz5.l("is_my_recommend_comment", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("friend_recommend_cnt", java.lang.Integer.valueOf(y0Var.f492236d.I0()))));
    }

    public final boolean I(so2.y0 item, boolean z17, in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter presenter, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        nv2.h1 h1Var = nv2.n1.f422083g;
        boolean j17 = nv2.n1.f422084h.j(presenter.z0().f66939xc8a07680, item.f492236d);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.uc9);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) holder.p(com.p314xaae8f345.mm.R.id.tyc);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.iht);
        boolean contains = presenter.w().contains(java.lang.Long.valueOf(item.mo2128x1ed62e84()));
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        boolean d17 = hc2.t.d(context);
        boolean g17 = so2.g0.g(item, contains, j17, z17, false);
        if (!g17 || d17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (!d17 || !g17) {
                viewGroup.setVisibility(8);
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
            H(viewGroup, holder, item, obj, j17);
            return false;
        }
        if (!contains) {
            presenter.w().add(java.lang.Long.valueOf(item.mo2128x1ed62e84()));
        }
        if (p17.getVisibility() == 8 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 2)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p18);
            C(p18, 0.0f, p18.getWidth());
            C(p17, 0.0f, p18.getWidth());
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(p17, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(p17, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert", "refreshRecommendLayout", "(Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;ZLcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/presenter/contract/CommentDrawerContract$NPresenter;Ljava/lang/Object;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        boolean h07 = presenter.h0();
        int color = j17 ? h07 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741, null) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, null) : h07 ? context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77696x3cb0741, null) : context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aju, null);
        if (hc2.l.g(presenter.z0().m59299x6bf53a6c())) {
            p17.setPadding(p17.getPaddingLeft(), p17.getPaddingTop(), context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), p17.getPaddingBottom());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f568093lo4);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uxf);
        android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
        if (layoutParams != null) {
            int h17 = i65.a.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            layoutParams.width = h17;
            layoutParams.height = h17;
        }
        c22699x3dcdb352.m82040x7541828(color);
        c22699x3dcdb352.setImageResource(j17 ? com.p314xaae8f345.mm.R.raw.f79774xc850a2af : com.p314xaae8f345.mm.R.raw.f79472xe7e9e18e);
        textView.setTextColor(color);
        if (j17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nnp);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nnh);
        }
        if (j17 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, 3)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p18);
            C(p18, 1.0f, i65.a.h(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
        }
        p17.setOnClickListener(new rb2.w2(presenter, item, j17, c22699x3dcdb352));
        p17.post(new rb2.x2(obj, z17, this, holder, p17));
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(p17, "recommend_comment_button");
        aVar.Tj(p17, 40, 1, false);
        aVar.gk(p17, kz5.c1.l(new jz5.l("comment_id", pm0.v.u(item.mo2128x1ed62e84())), new jz5.l("feed_id", pm0.v.u(item.f492236d.f68959xf9a02e3e)), new jz5.l("is_my_like_comment", java.lang.Integer.valueOf(z17 ? 1 : 0)), new jz5.l("recommend_type", java.lang.Integer.valueOf(!j17 ? 1 : 0)), new jz5.l("friend_recommend_cnt", java.lang.Integer.valueOf(item.f492236d.I0()))));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        H(viewGroup, holder, item, obj, j17);
        return true;
    }

    public final void J(in5.s0 s0Var, so2.y0 y0Var, int i17, android.view.View view, boolean z17, android.view.View view2, java.lang.CharSequence charSequence) {
        java.lang.CharSequence charSequence2;
        ym5.a1.h(view, new rb2.y2(s0Var, y0Var, z17, i17));
        view2.setTag(com.p314xaae8f345.mm.R.id.e79, charSequence);
        view2.setTag(com.p314xaae8f345.mm.R.id.e5n, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.k(s0Var.f374654e, y0Var.f492236d.y0() * 1000));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176 c15258xcd50c176 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15258xcd50c176) s0Var.p(com.p314xaae8f345.mm.R.id.c6d);
        if (c15258xcd50c176 == null || (charSequence2 = c15258xcd50c176.getCom.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT java.lang.String()) == null) {
            charSequence2 = "";
        }
        view2.setTag(com.p314xaae8f345.mm.R.id.e5l, charSequence2);
        if (y0Var.h() == 1) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(s0Var.f3639x46306858, "finder_comment_item_view");
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            android.view.View view3 = s0Var.f3639x46306858;
            jz5.l[] lVarArr = new jz5.l[6];
            lVarArr[0] = new jz5.l("feed_id", pm0.v.u(y0Var.f492236d.f68959xf9a02e3e));
            lVarArr[1] = new jz5.l("comment_id", java.lang.Long.valueOf(y0Var.f492236d.t0()));
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.iy iyVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.L1;
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e17 = iyVar.e(context);
            lVarArr[2] = new jz5.l("behaviour_session_id", e17 != null ? e17.f216918q : null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e18 = iyVar.e(context);
            lVarArr[3] = new jz5.l("finder_context_id", e18 != null ? e18.f216915p : null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny e19 = iyVar.e(context);
            lVarArr[4] = new jz5.l("finder_tab_context_id", e19 != null ? e19.f216919r : null);
            lVarArr[5] = new jz5.l("finder_username", y0Var.f492236d.Z0());
            ((cy1.a) rVar).gk(view3, kz5.c1.k(lVarArr));
        }
    }

    public final void K(boolean z17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        if (z17) {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81144x59b043ef, com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su);
        } else {
            c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f81147x500d5aaf, com.p314xaae8f345.mm.R.C30859x5a72f63.adg);
        }
    }

    public final void L(in5.s0 s0Var, so2.y0 y0Var) {
        android.widget.ImageView imageView;
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) s0Var.p(com.p314xaae8f345.mm.R.id.swk);
        if (c22803x544dcce2 == null || (imageView = (android.widget.ImageView) s0Var.p(com.p314xaae8f345.mm.R.id.c7_)) == null) {
            return;
        }
        if (y0Var.f492236d.f68965x29d3a50c != 3) {
            c22803x544dcce2.setVisibility(8);
            imageView.setForeground(null);
        } else {
            c22803x544dcce2.setVisibility(0);
            c22803x544dcce2.m82733x3ae760af(y0Var.f492236d.f209932y1);
            imageView.setForeground(new android.graphics.drawable.ColorDrawable(s0Var.f374654e.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c)));
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.drp;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0889, code lost:
    
        if (((r2.f492236d.z0() & 16) != 0 ? r9 : false) != false) goto L149;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0a82  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0b4a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0b60  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0bf5  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0c43  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0c8d  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0ca7  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0e84  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0cad  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0bc0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0aef  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0562  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x08db  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r56, in5.c r57, int r58, int r59, boolean r60, java.util.List r61) {
        /*
            Method dump skipped, instructions count: 3760
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rb2.z2.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        if (i17 == 1) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.p314xaae8f345.mm.R.id.a_z), "finder_feed_first_comment_awesome_iv");
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(holder.p(com.p314xaae8f345.mm.R.id.a_z), "finder_feed_second_comment_awesome_iv");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b c15302x70e49e3b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15302x70e49e3b) holder.p(com.p314xaae8f345.mm.R.id.rrw);
        if (c15302x70e49e3b != null) {
            c15302x70e49e3b.m62114x5691fb54(new rb2.e2(this));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.v2_);
        if (c22699x3dcdb352 != null) {
            java.lang.Object tag = c22699x3dcdb352.getTag();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
                c22699x3dcdb352.setTag(bool);
                c22699x3dcdb352.post(new d92.a(c22699x3dcdb352));
            }
        }
        o(holder);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        sc2.a8 a8Var = (sc2.a8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(sc2.a8.class);
        a8Var.getClass();
        a8Var.f7(holder);
        da2.g gVar = this.f475221g;
        if (gVar != null) {
            gVar.j();
        }
        this.f475221g = null;
    }
}
