package rf2;

/* loaded from: classes10.dex */
public final class o1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f476369a;

    /* renamed from: b, reason: collision with root package name */
    public final df2.un f476370b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f476371c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f476372d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f476373e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f476374f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f476375g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f476376h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f476377i;

    public o1(android.view.View root, df2.un controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f476369a = root;
        this.f476370b = controller;
        this.f476371c = "Finder.MileStoneMainWidget";
        this.f476373e = new java.util.ArrayList();
    }

    public static final boolean a(rf2.o1 o1Var) {
        o1Var.getClass();
        if (!zl2.r4.f555483a.w1()) {
            return true;
        }
        android.view.View view = o1Var.f476369a;
        db5.t7.m(view.getContext(), view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dw9));
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    public final void b(r45.g02 metaInfo, boolean z17, boolean z18) {
        java.lang.Integer num;
        android.view.View view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInfo, "metaInfo");
        android.view.View view2 = this.f476369a;
        android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.j8w);
        android.view.View findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.r3i);
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.p_0);
        ?? r132 = 0;
        if (findViewById == null) {
            num = 0;
        } else {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            num = 0;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (findViewById2 == null) {
            view = findViewById3;
        } else {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            findViewById2 = findViewById2;
            view = findViewById3;
            r132 = 0;
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(r132)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z18) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById);
            this.f476370b.c7(findViewById2, findViewById, r132);
        }
        java.lang.String str = "initViews " + this.f476372d;
        java.lang.String str2 = this.f476371c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        if (!this.f476372d) {
            this.f476372d = true;
            android.view.View findViewById4 = view2.findViewById(com.p314xaae8f345.mm.R.id.bys);
            if (findViewById4 != null) {
                findViewById4.setOnClickListener(new rf2.x0(this));
            }
            android.view.View findViewById5 = view2.findViewById(com.p314xaae8f345.mm.R.id.j8w);
            this.f476374f = findViewById5 != null ? (android.widget.TextView) findViewById5.findViewById(com.p314xaae8f345.mm.R.id.odf) : null;
            this.f476375g = findViewById5 != null ? (android.widget.TextView) findViewById5.findViewById(com.p314xaae8f345.mm.R.id.cut) : null;
            this.f476377i = findViewById5 != null ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById5.findViewById(com.p314xaae8f345.mm.R.id.iry) : null;
            this.f476376h = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.fgx);
            android.widget.TextView textView = this.f476374f;
            if (textView != null) {
                com.p314xaae8f345.mm.ui.fk.a(textView);
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f476377i;
            if (c1163xf1deaba4 != 0) {
                c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext()));
                c1163xf1deaba4.setNestedScrollingEnabled(r132);
                c1163xf1deaba4.mo7960x6cab2c8d(new rf2.h1(this));
            }
        }
        d(metaInfo);
        if (z17) {
            java.util.LinkedList infos = metaInfo.f456301d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(infos, "infos");
            java.util.Iterator it = infos.iterator();
            int i17 = r132;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                int i18 = ((r45.dm4) it.next()).f454105g;
                if ((i18 == 2 || i18 == 3) ? true : r132) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "autoScroll index:" + i17);
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f476377i;
                java.lang.Object layoutManager = c1163xf1deaba42 != null ? c1163xf1deaba42.getLayoutManager() : null;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
                if (c1162x665295de != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(num);
                    arrayList4.add(java.lang.Integer.valueOf(i17));
                    java.util.Collections.reverse(arrayList4);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = c1162x665295de;
                    yj0.a.d(c1162x665295de2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    c1162x665295de.P(((java.lang.Integer) arrayList4.get(r132)).intValue(), ((java.lang.Integer) arrayList4.get(1)).intValue());
                    yj0.a.f(c1162x665295de2, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/MileStoneMainWidget", "refreshMainContent", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveMilestoneLotteryMetaInfo;ZZ)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "autoScroll index:" + i17 + " invalid");
            }
        }
        android.widget.TextView textView2 = this.f476374f;
        if (textView2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView2, 3);
        }
        android.widget.TextView textView3 = this.f476375g;
        if (textView3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.e(textView3, 4);
        }
        android.view.View findViewById6 = view2.findViewById(com.p314xaae8f345.mm.R.id.df6);
        if (findViewById6 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.f(findViewById6, 1, r132);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view2.findViewById(com.p314xaae8f345.mm.R.id.bys);
        if (c22699x3dcdb352 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.k2.c(c22699x3dcdb352, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(r45.dm4 r18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r19) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rf2.o1.c(r45.dm4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(r45.g02 metaInfo) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metaInfo, "metaInfo");
        android.widget.TextView textView = this.f476374f;
        if (textView != null) {
            java.lang.String str = metaInfo.f456305h;
            if (str == null) {
                str = "";
            }
            textView.setText(str);
        }
        android.widget.TextView textView2 = this.f476375g;
        if (textView2 != null) {
            java.lang.String str2 = metaInfo.f456306i;
            textView2.setText(str2 != null ? str2 : "");
        }
        android.widget.ImageView imageView = this.f476376h;
        if (imageView != null) {
            wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(metaInfo.f456307m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
            rf2.n1 n1Var = new rf2.n1(this, imageView);
            a17.getClass();
            a17.f529406d = n1Var;
            a17.f();
        }
        java.util.ArrayList arrayList = this.f476373e;
        arrayList.clear();
        arrayList.addAll(metaInfo.f456301d);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f476377i;
        if (c1163xf1deaba4 == null || (mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19()) == null) {
            return;
        }
        mo7946xf939df19.m8146xced61ae5();
    }
}
