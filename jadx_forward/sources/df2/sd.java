package df2;

/* loaded from: classes3.dex */
public final class sd implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.ud f312864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jz5.l f312865e;

    public sd(df2.ud udVar, jz5.l lVar) {
        this.f312864d = udVar;
        this.f312865e = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.o oVar;
        android.view.View view;
        r45.rk6 rk6Var = (r45.rk6) this.f312865e.f384366d;
        df2.ud udVar = this.f312864d;
        udVar.getClass();
        r45.d62 a17 = r45.d62.a(rk6Var.m75939xb282bd08(1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "forNumber(...)");
        android.view.View Z6 = udVar.Z6(a17);
        android.view.View view2 = udVar.f313046p;
        jz5.f0 f0Var = null;
        if (Z6 == null || view2 == null) {
            oVar = null;
        } else {
            android.graphics.Rect r17 = pm0.v.r(Z6);
            if (pm0.v.t(Z6)[1] > com.p314xaae8f345.mm.ui.bl.b(udVar.O6()).y / 2) {
                android.view.View view3 = udVar.f313047q;
                if (view3 != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view4 = udVar.f313048r;
                if (view4 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view4, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                int i17 = r17.left;
                oVar = new jz5.o(bool, java.lang.Integer.valueOf(i17 + ((r17.right - i17) / 2)), java.lang.Integer.valueOf(r17.top));
            } else {
                android.view.View view5 = udVar.f313047q;
                if (view5 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(0);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view6 = udVar.f313048r;
                if (view6 != null) {
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                    arrayList4.add(8);
                    java.util.Collections.reverse(arrayList4);
                    yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "getTargetLoc", "(Lcom/tencent/mm/protocal/protobuf/FinderLiveQuestCommTargetType;)Lkotlin/Triple;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
                int i18 = r17.left;
                oVar = new jz5.o(bool2, java.lang.Integer.valueOf(i18 + ((r17.right - i18) / 2)), java.lang.Integer.valueOf(r17.bottom));
            }
        }
        android.view.View view7 = udVar.f313046p;
        if (oVar != null && view7 != null) {
            df2.od.f312485w.a(udVar.getStore().getLiveRoomData(), 1, 6, udVar.f313052v, udVar.f313051u);
            android.view.View view8 = udVar.f313045o;
            if (view8 != null) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal5 = zj0.c.f554818a;
                arrayList5.add(0);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view8, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "checkLocation", "(Lcom/tencent/mm/protocal/protobuf/TargetItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "checkLocation", "(Lcom/tencent/mm/protocal/protobuf/TargetItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int width = view7.getWidth();
            int height = view7.getHeight();
            boolean booleanValue = ((java.lang.Boolean) oVar.f384374d).booleanValue();
            int intValue = ((java.lang.Number) oVar.f384375e).intValue();
            int intValue2 = ((java.lang.Number) oVar.f384376f).intValue();
            int i19 = intValue - (width / 2);
            if (i19 < 0) {
                i19 = 0;
            }
            int i27 = com.p314xaae8f345.mm.ui.bl.b(udVar.O6()).x - width;
            if (i19 > i27) {
                i19 = i27;
            }
            view7.setTranslationX(i19);
            jz5.g gVar = udVar.f313050t;
            if (booleanValue) {
                android.view.View view9 = udVar.f313048r;
                if (view9 != null) {
                    view9.setTranslationX(((intValue - view7.getTranslationX()) - view7.getPaddingLeft()) - (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() / 2));
                }
                view7.setTranslationY(intValue2 - height);
            } else {
                android.view.View view10 = udVar.f313047q;
                if (view10 != null) {
                    view10.setTranslationX(((intValue - view7.getTranslationX()) - view7.getPaddingLeft()) - (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() / 2));
                }
                view7.setTranslationY(intValue2);
            }
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var != null || (view = udVar.f313045o) == null) {
            return;
        }
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal6 = zj0.c.f554818a;
        arrayList6.add(8);
        java.util.Collections.reverse(arrayList6);
        yj0.a.d(view, arrayList6.toArray(), "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "checkLocation", "(Lcom/tencent/mm/protocal/protobuf/TargetItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorTaskBubbleController", "checkLocation", "(Lcom/tencent/mm/protocal/protobuf/TargetItem;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
