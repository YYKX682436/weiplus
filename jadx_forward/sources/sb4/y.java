package sb4;

/* loaded from: classes4.dex */
public final class y extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f487121d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f487122e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f487123f;

    public y(android.app.Activity context, java.lang.String userName, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f487121d = context;
        this.f487122e = kz5.p0.f395529d;
        this.f487123f = com.p314xaae8f345.mm.p2621x8fb0427b.s7.a();
        if (z17) {
            s7Var = com.p314xaae8f345.mm.p2621x8fb0427b.s7.a();
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(userName, true);
            s7Var = (n17 == null || !n17.r2()) ? new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_stranger") : new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_friend");
        }
        this.f487123f = s7Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getItemCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        int size = this.f487122e.size();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getItemCount", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        return size;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBindViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) this.f487122e.get(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarSlotAdapter", "onBindViewHolder >> position: " + i17 + ", feedId: " + c17933xe8d1b226.m70367x7525eefd());
        holder.f3639x46306858.setOnClickListener(new sb4.x(this));
        if (c17933xe8d1b226.m70371x485d7().f39014x86965dde != null) {
            java.util.LinkedList MediaObjList = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451373h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(MediaObjList, "MediaObjList");
            com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(this.f487123f.f276845a);
            s7Var.f276846b = c17933xe8d1b226.f68883xac3be4e;
            sb4.i0 i0Var = (sb4.i0) holder;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
            i0Var.k().setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            android.view.View view = i0Var.f487061g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i0Var.j().setVisibility(8);
            i0Var.l().setVisibility(8);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRightBottomCorner", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRightBottomCorner", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
            android.view.View view2 = i0Var.f487063i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "initViewHolder", "(Lcom/tencent/mm/plugin/sns/ui/adapter/StarSlotItemViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
            int i18 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e;
            android.app.Activity activity = this.f487121d;
            if (i18 == 28 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 59) {
                r45.kv2 finderShareObject = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451377o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderShareObject, "finderShareObject");
                if (finderShareObject.m75939xb282bd08(5) == 1) {
                    i0Var.j().setVisibility(0);
                    le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
                    java.lang.String str2 = finderShareObject.m75945x2fec8307(4) + "";
                    float textSize = i0Var.j().getTextSize();
                    ((ke0.e) xVar).getClass();
                    i0Var.j().setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, str2, textSize));
                    i0Var.k().setVisibility(8);
                } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(finderShareObject.m75941xfb821914(7))) {
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.h(((r45.iv2) finderShareObject.m75941xfb821914(7).get(0)).m75945x2fec8307(2), i0Var.k(), mn2.f1.B);
                    i0Var.k().setVisibility(0);
                    if (finderShareObject.m75939xb282bd08(5) == 4 || finderShareObject.m75939xb282bd08(5) == 2) {
                        i0Var.l().setVisibility(0);
                    }
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 36) {
                r45.ek4 megaVideoShareObject = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451382t;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(megaVideoShareObject, "megaVideoShareObject");
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(megaVideoShareObject.m75941xfb821914(6))) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((r45.dk4) megaVideoShareObject.m75941xfb821914(6).get(0)).m75945x2fec8307(4))) {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ya2.l.f542035a.h(((r45.dk4) megaVideoShareObject.m75941xfb821914(6).get(0)).m75945x2fec8307(1), i0Var.k(), mn2.f1.B);
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ya2.l.f542035a.h(((r45.dk4) megaVideoShareObject.m75941xfb821914(6).get(0)).m75945x2fec8307(4), i0Var.k(), mn2.f1.B);
                    }
                    i0Var.k().setVisibility(0);
                    i0Var.l().setVisibility(0);
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 29 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 37) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451378p != null) {
                    r45.jj4 jj4Var = new r45.jj4();
                    jj4Var.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451378p.m75945x2fec8307(2);
                    jj4Var.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451378p.m75945x2fec8307(2);
                    jj4Var.f459389e = 2;
                    jj4Var.f459395m = 1;
                    r45.lj4 lj4Var = new r45.lj4();
                    jj4Var.f459398p = lj4Var;
                    jj4Var.f459392h = 1;
                    lj4Var.f461053d = 0.0f;
                    lj4Var.f461054e = 0.0f;
                    jj4Var.f459388d = c17933xe8d1b226.m70367x7525eefd();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    i0Var.k().setVisibility(0);
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 38) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451380r != null) {
                    r45.jj4 jj4Var2 = new r45.jj4();
                    java.lang.Object obj = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451380r.m75941xfb821914(3).get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                    java.lang.Object obj2 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451380r.m75941xfb821914(4).get(0);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                    java.lang.String concat = ((java.lang.String) obj).concat((java.lang.String) obj2);
                    jj4Var2.f459391g = concat;
                    jj4Var2.f459393i = concat;
                    jj4Var2.f459389e = 2;
                    jj4Var2.f459395m = 1;
                    r45.lj4 lj4Var2 = new r45.lj4();
                    jj4Var2.f459398p = lj4Var2;
                    jj4Var2.f459392h = 1;
                    lj4Var2.f461053d = 0.0f;
                    lj4Var2.f461054e = 0.0f;
                    jj4Var2.f459388d = c17933xe8d1b226.m70367x7525eefd();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var2, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    i0Var.k().setVisibility(0);
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 53) {
                r45.hd2 hd2Var = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451388z;
                if (hd2Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(hd2Var.m75945x2fec8307(2))) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(i0Var.k(), -1, com.p314xaae8f345.mm.R.raw.f78435x7b83bce4, activity.hashCode());
                } else {
                    r45.jj4 jj4Var3 = new r45.jj4();
                    java.lang.String m75945x2fec8307 = hd2Var.m75945x2fec8307(2);
                    jj4Var3.f459391g = m75945x2fec8307;
                    jj4Var3.f459393i = m75945x2fec8307;
                    jj4Var3.f459389e = 2;
                    jj4Var3.f459395m = 1;
                    r45.lj4 lj4Var3 = new r45.lj4();
                    jj4Var3.f459398p = lj4Var3;
                    jj4Var3.f459392h = 1;
                    lj4Var3.f461053d = 0.0f;
                    lj4Var3.f461054e = 0.0f;
                    jj4Var3.f459388d = c17933xe8d1b226.m70367x7525eefd();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var3, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                }
                i0Var.k().setVisibility(0);
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 33) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451379q != null) {
                    r45.jj4 jj4Var4 = new r45.jj4();
                    jj4Var4.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451379q.f454876h;
                    jj4Var4.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451379q.f454876h;
                    jj4Var4.f459389e = 2;
                    jj4Var4.f459395m = 1;
                    r45.lj4 lj4Var4 = new r45.lj4();
                    jj4Var4.f459398p = lj4Var4;
                    jj4Var4.f459392h = 1;
                    lj4Var4.f461053d = 0.0f;
                    lj4Var4.f461054e = 0.0f;
                    jj4Var4.f459388d = c17933xe8d1b226.m70367x7525eefd();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var4, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    i0Var.k().setVisibility(0);
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 34 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 45 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 43) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451381s != null) {
                    r45.jj4 jj4Var5 = new r45.jj4();
                    jj4Var5.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451381s.m75945x2fec8307(5);
                    jj4Var5.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451381s.m75945x2fec8307(5);
                    jj4Var5.f459389e = 2;
                    jj4Var5.f459395m = 1;
                    r45.lj4 lj4Var5 = new r45.lj4();
                    jj4Var5.f459398p = lj4Var5;
                    jj4Var5.f459392h = 1;
                    lj4Var5.f461053d = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451381s.m75938x746dc8a6(6);
                    jj4Var5.f459398p.f461054e = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451381s.m75938x746dc8a6(7);
                    jj4Var5.f459388d = c17933xe8d1b226.m70367x7525eefd();
                    ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                    ya2.l.f542035a.h(c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451381s.m75945x2fec8307(5), i0Var.k(), mn2.f1.B);
                }
                i0Var.k().setVisibility(0);
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 39) {
                int i19 = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451383u;
                if (i19 != 3) {
                    if (i19 == 100000000 && c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451378p != null) {
                        r45.jj4 jj4Var6 = new r45.jj4();
                        jj4Var6.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451378p.m75945x2fec8307(2);
                        jj4Var6.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451378p.m75945x2fec8307(2);
                        jj4Var6.f459389e = 2;
                        jj4Var6.f459395m = 1;
                        r45.lj4 lj4Var6 = new r45.lj4();
                        jj4Var6.f459398p = lj4Var6;
                        jj4Var6.f459392h = 1;
                        lj4Var6.f461053d = 0.0f;
                        lj4Var6.f461054e = 0.0f;
                        jj4Var6.f459388d = c17933xe8d1b226.m70367x7525eefd();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var6, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                        i0Var.k().setVisibility(0);
                    }
                } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451384v != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451384v.m75945x2fec8307(2))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(i0Var.k(), -1, com.p314xaae8f345.mm.R.raw.f79523x40dce586, activity.hashCode());
                    } else {
                        r45.jj4 jj4Var7 = new r45.jj4();
                        jj4Var7.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451384v.m75945x2fec8307(2);
                        jj4Var7.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451384v.m75945x2fec8307(2);
                        jj4Var7.f459389e = 2;
                        jj4Var7.f459395m = 1;
                        r45.lj4 lj4Var7 = new r45.lj4();
                        jj4Var7.f459398p = lj4Var7;
                        jj4Var7.f459392h = 1;
                        lj4Var7.f461053d = 0.0f;
                        lj4Var7.f461054e = 0.0f;
                        jj4Var7.f459388d = c17933xe8d1b226.m70367x7525eefd();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var7, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 46 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 51) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451387y != null) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451387y.m75945x2fec8307(2))) {
                        r45.jj4 jj4Var8 = new r45.jj4();
                        jj4Var8.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451387y.m75945x2fec8307(2);
                        jj4Var8.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451387y.m75945x2fec8307(2);
                        jj4Var8.f459389e = 2;
                        jj4Var8.f459395m = 1;
                        r45.lj4 lj4Var8 = new r45.lj4();
                        jj4Var8.f459398p = lj4Var8;
                        jj4Var8.f459392h = 1;
                        lj4Var8.f461053d = 0.0f;
                        lj4Var8.f461054e = 0.0f;
                        jj4Var8.f459388d = c17933xe8d1b226.m70367x7525eefd();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var8, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(i0Var.k(), -1, com.p314xaae8f345.mm.R.C30861xcebc809e.aqs, hashCode());
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 52) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.C != null) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b226.m70371x485d7().f39014x86965dde.C.m75945x2fec8307(2))) {
                        r45.jj4 jj4Var9 = new r45.jj4();
                        jj4Var9.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.C.m75945x2fec8307(2);
                        jj4Var9.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.C.m75945x2fec8307(2);
                        jj4Var9.f459389e = 2;
                        jj4Var9.f459395m = 1;
                        r45.lj4 lj4Var9 = new r45.lj4();
                        jj4Var9.f459398p = lj4Var9;
                        jj4Var9.f459392h = 1;
                        lj4Var9.f461053d = 0.0f;
                        lj4Var9.f461054e = 0.0f;
                        jj4Var9.f459388d = c17933xe8d1b226.m70367x7525eefd();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var9, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(i0Var.k(), -1, com.p314xaae8f345.mm.R.C30861xcebc809e.aqs, hashCode());
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 44) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451386x != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451386x.m75945x2fec8307(5))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(i0Var.k(), -1, com.p314xaae8f345.mm.R.raw.f80155x9d99890d, activity.hashCode());
                    } else {
                        r45.jj4 jj4Var10 = new r45.jj4();
                        jj4Var10.f459391g = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451386x.m75945x2fec8307(5);
                        jj4Var10.f459393i = c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451386x.m75945x2fec8307(5);
                        jj4Var10.f459389e = 2;
                        jj4Var10.f459395m = 1;
                        r45.lj4 lj4Var10 = new r45.lj4();
                        jj4Var10.f459398p = lj4Var10;
                        jj4Var10.f459392h = 1;
                        lj4Var10.f461053d = 0.0f;
                        lj4Var10.f461054e = 0.0f;
                        jj4Var10.f459388d = c17933xe8d1b226.m70367x7525eefd();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().d0(jj4Var10, i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    }
                    i0Var.k().setVisibility(0);
                }
            } else if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 55 || c17933xe8d1b226.m70371x485d7().f39014x86965dde.f451370e == 56) {
                if (c17933xe8d1b226.m70371x485d7().f39014x86965dde.E != null) {
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b226.m70371x485d7().f39014x86965dde.E.m75945x2fec8307(3))) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().S(i0Var.k(), -1, com.p314xaae8f345.mm.R.raw.f78435x7b83bce4, activity.hashCode());
                    } else {
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ya2.l.f542035a.h(c17933xe8d1b226.m70371x485d7().f39014x86965dde.E.m75945x2fec8307(3), i0Var.k(), mn2.f1.B);
                        i0Var.k().setVisibility(0);
                    }
                }
            } else if (c17933xe8d1b226.m70373x5384133c() == 2) {
                i0Var.j().setVisibility(0);
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                java.lang.String str3 = c17933xe8d1b226.m70371x485d7().f39013x4c306a8a + "";
                float textSize2 = i0Var.j().getTextSize();
                ((ke0.e) xVar2).getClass();
                i0Var.j().setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, str3, textSize2));
            } else if (c17933xe8d1b226.m70373x5384133c() == 26) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarItemFlIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarItemFlIv", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                i0Var.f487062h.setImageResource(com.p314xaae8f345.mm.R.raw.f79837xc851a30a);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStarItemFl", "com.tencent.mm.plugin.sns.ui.adapter.StarSlotItemViewHolder");
                android.view.View view3 = i0Var.f487061g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/adapter/SnsStarSlotAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                if (!MediaObjList.isEmpty()) {
                    md4.e eVar = md4.e.f407410a;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b226.m70371x485d7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m70371x485d7, "getTimeLine(...)");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().g0(c17933xe8d1b226.m70367x7525eefd(), eVar.d(m70371x485d7), i0Var.k(), activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
                    if (c17933xe8d1b226.f68895x2262335f == 15) {
                        i0Var.l().setVisibility(0);
                    }
                }
                i0Var.k().setVisibility(0);
            }
            str = "onBindViewHolder";
        } else {
            str = "onBindViewHolder";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bmh, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        sb4.i0 i0Var = new sb4.i0(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreateViewHolder", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        return i0Var;
    }

    public final void x(java.util.List infoList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarSlotDataList", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoList, "infoList");
        this.f487122e = infoList;
        m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarSlotDataList", "com.tencent.mm.plugin.sns.ui.adapter.SnsStarSlotAdapter");
    }
}
