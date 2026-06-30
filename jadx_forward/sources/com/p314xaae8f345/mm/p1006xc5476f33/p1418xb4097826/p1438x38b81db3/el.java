package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public class el extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.afg;
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ffc);
        p17.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.dl(p17));
    }

    @Override // in5.r
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void h(in5.s0 holder, so2.v1 item, int i17, int i18, boolean z17, java.util.List list) {
        android.view.View view;
        java.lang.String str;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc;
        java.lang.String str2;
        boolean z18;
        java.lang.String m75945x2fec8307;
        java.lang.String str3;
        r45.kj kjVar;
        r45.kj kjVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.ffc);
        ya2.b2 b2Var = item.f492178d;
        int i19 = b2Var.K2 & 4;
        mn2.g1 g1Var = mn2.g1.f411508a;
        android.content.Context context = holder.f374654e;
        if (i19 > 0) {
            android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
            android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbq);
            android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.a89);
            android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f564832a85);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.frp);
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.eom);
            vo0.d a17 = g1Var.a();
            str = "";
            view = p17;
            mn2.n nVar = new mn2.n(b2Var.u0(), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
            a17.c(nVar, imageView, g1Var.h(mn2.f1.f411490h));
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            r45.xk b17 = ya2.d.b(b2Var, false);
            java.lang.String m75945x2fec83072 = b17 != null ? b17.m75945x2fec8307(1) : null;
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, m75945x2fec83072));
            r45.xk b18 = ya2.d.b(b2Var, false);
            int m75939xb282bd08 = (b18 == null || (kjVar2 = (r45.kj) b18.m75936x14adae67(5)) == null) ? 0 : kjVar2.m75939xb282bd08(0);
            textView2.setVisibility(8);
            textView3.setVisibility(0);
            r45.xk b19 = ya2.d.b(b2Var, false);
            java.lang.String m75945x2fec83073 = b19 != null ? b19.m75945x2fec8307(6) : null;
            if (m75945x2fec83073 == null || m75945x2fec83073.length() == 0) {
                m75945x2fec8307 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572261aj1);
                z18 = false;
            } else {
                z18 = false;
                r45.xk b27 = ya2.d.b(b2Var, false);
                m75945x2fec8307 = b27 != null ? b27.m75945x2fec8307(6) : null;
            }
            textView3.setText(m75945x2fec8307);
            r45.xk b28 = ya2.d.b(b2Var, z18);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc e17 = b28 != null ? ya2.d.e(b28) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            o(c22699x3dcdb352, imageView2, b2Var, e17, context);
            if (m75939xb282bd08 == 1) {
                r45.xk b29 = ya2.d.b(b2Var, false);
                if (b29 == null || (kjVar = (r45.kj) b29.m75936x14adae67(5)) == null || (str3 = kjVar.m75945x2fec8307(2)) == null) {
                    str3 = str;
                }
                if (str3.length() > 0) {
                    textView2.setVisibility(0);
                    textView2.setText(str3);
                }
            } else if (m75939xb282bd08 == 2) {
                textView2.setVisibility(8);
            } else if (m75939xb282bd08 != 100) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollowConvert", "biz unSupport iconType: " + m75939xb282bd08);
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(8);
            }
        } else {
            view = p17;
            str = "";
            android.widget.ImageView imageView3 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.a_4);
            android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.kbq);
            android.widget.TextView textView5 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.a89);
            android.widget.ImageView imageView4 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.f564832a85);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.frp);
            android.widget.TextView textView6 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.eom);
            vo0.d a18 = g1Var.a();
            mn2.n nVar2 = new mn2.n(b2Var.m176700xe5e0d2a0(), null, 2, null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView3);
            a18.c(nVar2, imageView3, g1Var.h(mn2.f1.f411490h));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String w07 = b2Var.w0();
            ((ke0.e) xVar2).getClass();
            textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, w07));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2 = b2Var.f69300x731cac1b;
            int m76027x1cbb0791 = c19780xceb4c4dc2 != null ? c19780xceb4c4dc2.m76027x1cbb0791() : 0;
            textView5.setVisibility(8);
            textView6.setVisibility(8);
            r45.xk b37 = ya2.d.b(b2Var, false);
            if (b37 == null || (c19780xceb4c4dc = ya2.d.e(b37)) == null) {
                c19780xceb4c4dc = b2Var.f69300x731cac1b;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            o(c22699x3dcdb3522, imageView4, b2Var, c19780xceb4c4dc, context);
            if (m76027x1cbb0791 == 1) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc3 = b2Var.f69300x731cac1b;
                if (c19780xceb4c4dc3 == null || (str2 = c19780xceb4c4dc3.m76029xad9975ba()) == null) {
                    str2 = str;
                }
                if (str2.length() > 0) {
                    textView5.setVisibility(0);
                    textView5.setText(str2);
                }
            } else if (m76027x1cbb0791 != 2) {
                if (m76027x1cbb0791 != 100) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFollowConvert", "unSupport iconType: " + m76027x1cbb0791);
                    textView5.setVisibility(8);
                } else {
                    textView5.setVisibility(8);
                }
            }
        }
        if (b2Var.f69325xed074063 != 1) {
            android.view.View view2 = view;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.lang.Object parent = view2.getParent();
            android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view3 == null) {
                return;
            }
            view3.setTouchDelegate(null);
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        java.lang.String str4 = str;
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = view;
        view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/finder/convert/FinderFollowConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFollowData;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(view4, "living_label");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(view4, 40, 26236);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).gk(view4, kz5.c1.k(new jz5.l("feed_id", str4), new jz5.l("live_id", str4), new jz5.l("comment_scene", "12"), new jz5.l("finder_username", b2Var.D0()), new jz5.l("session_buffer", " ")));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(view4, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bl.f184516a);
        view4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.cl(view4, holder, item, b2Var));
    }

    public final void o(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.widget.ImageView imageView, ya2.b2 b2Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc, android.content.Context context) {
        r45.ub1 ub1Var = b2Var.L2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc c19780xceb4c4dc2 = ub1Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19780xceb4c4dc) ub1Var.m75936x14adae67(1) : null;
        boolean z17 = ub1Var != null && ub1Var.m75939xb282bd08(0) == 1;
        if (!((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.L1().r()).booleanValue()) {
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            if (imageView != null) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                zy2.tb.a(ya2.m1.f542044a, imageView, c19780xceb4c4dc, 0, 4, null);
                return;
            }
            return;
        }
        if (c22699x3dcdb352 == null || imageView == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.c3.f183585a;
        if (c19780xceb4c4dc2 == null) {
            c19780xceb4c4dc2 = c19780xceb4c4dc;
        }
        c3Var.a(c22699x3dcdb352, imageView, z17, c19780xceb4c4dc2, (b2Var.K2 & 2) > 0, context);
    }
}
