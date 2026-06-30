package ut2;

/* loaded from: classes3.dex */
public final class p4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.j5 f512585d;

    public p4(ut2.j5 j5Var) {
        this.f512585d = j5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        int i17;
        r45.k74 k74Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        ml2.f4 f4Var = ml2.f4.B;
        ut2.j5 j5Var = this.f512585d;
        ut2.j5.a(j5Var, f4Var);
        gk2.e eVar = j5Var.f512471f;
        r45.e56 e56Var = ((mm2.f6) eVar.a(mm2.f6.class)).K;
        if (e56Var != null) {
            r45.c33 c33Var = (r45.c33) e56Var.m75936x14adae67(2);
            if (c33Var == null || (str5 = c33Var.m75945x2fec8307(0)) == null) {
                str5 = "";
            }
            r45.c33 c33Var2 = (r45.c33) e56Var.m75936x14adae67(2);
            if (c33Var2 == null || (str6 = c33Var2.m75945x2fec8307(1)) == null) {
                str6 = "";
            }
            java.lang.String str7 = str5;
            long m75942xfb822ef2 = ((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
            java.lang.String anchorUserName = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o;
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            java.lang.String sessionId = java.lang.String.valueOf(((mm2.c1) eVar.a(mm2.c1.class)).f410394p2);
            java.lang.String requestId = ((mm2.c1) eVar.a(mm2.c1.class)).P3;
            java.lang.String str8 = ((mm2.c1) eVar.a(mm2.c1.class)).f410319c3;
            java.lang.String str9 = str8 != null ? str8 : "";
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestId, "requestId");
            java.lang.String obj = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.s0().toString();
            l81.b1 b1Var = new l81.b1();
            str3 = "android/view/View$OnClickListener";
            b1Var.f398547b = str7;
            b1Var.f398555f = str6;
            b1Var.f398561i = new dk2.ah();
            b1Var.f398565k = 1177;
            b1Var.f398567l = "shop_window:" + m75942xfb822ef2 + ':' + anchorUserName + "::" + sessionId + ':' + obj + ':' + requestId + ':' + str9;
            zl2.q4 q4Var = zl2.q4.f555466a;
            b1Var.f398549c = q4Var.x();
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            java.lang.String sceneNote = b1Var.f398567l;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sceneNote, "sceneNote");
            y4Var.getClass();
            y4Var.f409839n = sceneNote;
            p52.c cVar = p52.h.f433549a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
            p52.h.f433562n = obj;
            zy2.qa qaVar = (zy2.qa) i95.n0.c(zy2.qa.class);
            java.lang.String appId = b1Var.f398547b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) qaVar).Ck(3L, appId, obj, 1177L, sessionId, "shop_window", requestId);
            st2.c2.f493782a.k(b1Var);
            k91.y3 y3Var = k91.y3.POPUP;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            int m75939xb282bd08 = e56Var.m75939xb282bd08(1);
            android.view.ViewGroup viewGroup = j5Var.f512470e;
            if (m75939xb282bd08 == 0) {
                if (e56Var.m75939xb282bd08(16) == 2) {
                    b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(false, 0, null, false, null, false, null, k91.t2.f387299d, false, false, null, null, false, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, false, 0, false, false, false, false, null, null, null, false, null, null, false, -130, 2047, null);
                }
                android.content.Context context = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).c(zy2.v9.class))).U6(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), b1Var);
                dk2.q4 q4Var2 = dk2.q4.f315471a;
                android.content.Context context2 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                dk2.q4.m(q4Var2, context2, j5Var.f512471f, b1Var, true, null, 16, null);
            } else if (e56Var.m75939xb282bd08(1) == 1) {
                i95.m c17 = i95.n0.c(c61.yb.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.yb ybVar = (c61.yb) c17;
                android.content.Context context3 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862();
                c19786x6a1e2862.m76550x2592a27b(6);
                r45.o74 o74Var = (r45.o74) e56Var.m75936x14adae67(3);
                if (o74Var != null) {
                    k74Var = new r45.k74();
                    str4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
                    k74Var.set(0, o74Var.m75945x2fec8307(0));
                    k74Var.set(1, o74Var.m75945x2fec8307(1));
                    i17 = 2;
                    k74Var.set(2, java.net.URLDecoder.decode(o74Var.m75945x2fec8307(2), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                } else {
                    str4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
                    i17 = 2;
                    k74Var = null;
                }
                c19786x6a1e2862.m76551x3af0573b(k74Var);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8 c19800x7f8d35f8 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19800x7f8d35f8();
                c19800x7f8d35f8.m77198x4310efb(b1Var.f398547b);
                c19800x7f8d35f8.m77212x764e93a7(b1Var.f398555f);
                r45.c33 c33Var3 = (r45.c33) e56Var.m75936x14adae67(i17);
                c19800x7f8d35f8.m77199x891f0c35(c33Var3 != null ? c33Var3.m75945x2fec8307(i17) : null);
                c19800x7f8d35f8.m77221x911fffc3(q4Var.x());
                c19786x6a1e2862.m76552x7d3cf1b2(c19800x7f8d35f8);
                android.content.Context context4 = viewGroup.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                pf5.z zVar2 = pf5.z.f435481a;
                if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.aa) ((zy2.v9) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).c(zy2.v9.class))).T6(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), c19786x6a1e2862);
                c61.yb.nd(ybVar, context3, c19786x6a1e2862, b1Var, 0, null, 24, null);
                j5Var.f512469d.u();
                yj0.a.h(this, str4, str3, str2, str);
            }
        } else {
            str = "(Landroid/view/View;)V";
            str2 = "onClick";
            str3 = "android/view/View$OnClickListener";
        }
        str4 = "com/tencent/mm/plugin/finder/shopping/holder/ShoppingPanelHeaderHolder$checkShopWindow$setShopWindowJump$1";
        j5Var.f512469d.u();
        yj0.a.h(this, str4, str3, str2, str);
    }
}
