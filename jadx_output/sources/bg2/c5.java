package bg2;

/* loaded from: classes2.dex */
public final class c5 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.q f19980e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f19981f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f19982g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19983h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(tc2.g store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f19980e = new bg2.b5(this);
    }

    @Override // tc2.c
    public void P6() {
        r45.kz3 kz3Var;
        r45.kz3 kz3Var2;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams;
        r45.kr0 d17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject2;
        com.tencent.mm.protocal.protobuf.FinderObject feedObject3;
        r45.dm2 object_extend;
        r45.t94 t94Var;
        java.util.LinkedList list;
        java.lang.Object obj;
        java.util.LinkedList list2;
        java.lang.Object obj2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject4;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject4 = baseFinderFeed.getFeedObject()) == null) ? null : feedObject4.getFinderObject();
        r45.kr0 d18 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
        if (d18 == null || (list2 = d18.getList(12)) == null) {
            kz3Var = null;
        } else {
            java.util.Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                r45.kz3 kz3Var3 = (r45.kz3) obj2;
                if (kz3Var3.getInteger(0) == 13 && ((r45.pg6) kz3Var3.getCustom(5)) != null) {
                    break;
                }
            }
            kz3Var = (r45.kz3) obj2;
        }
        this.f19981f = kz3Var != null;
        if (d18 == null || (list = d18.getList(12)) == null) {
            kz3Var2 = null;
        } else {
            java.util.Iterator it6 = list.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                r45.kz3 kz3Var4 = (r45.kz3) obj;
                if (kz3Var4.getInteger(0) == 15 && ((r45.cg6) kz3Var4.getCustom(7)) != null) {
                    break;
                }
            }
            kz3Var2 = (r45.kz3) obj;
        }
        this.f19982g = kz3Var2 != null;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = gVar.f417148h;
        this.f19983h = (baseFinderFeed2 == null || (feedObject2 = baseFinderFeed2.getFeedObject()) == null || (feedObject3 = feedObject2.getFeedObject()) == null || (object_extend = feedObject3.getObject_extend()) == null || (t94Var = (r45.t94) object_extend.getCustom(44)) == null || !t94Var.getBoolean(0)) ? false : true;
        in5.s0 s0Var = gVar.f417149i;
        android.content.Context context = s0Var != null ? s0Var.f293121e : null;
        if (context != null) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = gVar.f417148h;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (baseFinderFeed3 == null || (feedObject = baseFinderFeed3.getFeedObject()) == null) ? null : feedObject.getFinderObject();
            boolean z17 = ((finderObject2 == null || (d17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject2)) == null) ? 0 : d17.getInteger(0)) > 0;
            uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
            android.view.View Y6 = gVar2 != null ? ((sb2.l) gVar2).Y6() : null;
            if (z17) {
                java.lang.Object layoutParams = Y6 != null ? Y6.getLayoutParams() : null;
                marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i65.a.b(context, 96);
                }
            } else {
                java.lang.Object layoutParams2 = Y6 != null ? Y6.getLayoutParams() : null;
                marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.bottomMargin = i65.a.b(context, 80);
                }
            }
        }
        Z6();
    }

    @Override // tc2.c
    public void Q6() {
        Y6();
    }

    @Override // tc2.c
    public void U6() {
        in5.s0 s0Var = this.f417141d.f417149i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.f484260dk3) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onUnFocusFeedCenter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        uc2.g gVar = (uc2.g) O6(uc2.g.class);
        cw2.da Z6 = gVar != null ? ((sb2.l) gVar).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        if (finderLivePlayView == null) {
            return;
        }
        finderLivePlayView.setOnVideoLayoutChangeCallback(null);
    }

    public final void Y6() {
        r45.kr0 d17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        tc2.g gVar = this.f417141d;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        if (((finderObject == null || (d17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject)) == null) ? 0 : d17.getInteger(0)) > 0 || this.f19981f || this.f19982g || this.f19983h) {
            in5.s0 s0Var = gVar.f417149i;
            android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.f484260dk3) : null;
            if (p17 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkAndShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkAndShow", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        zy2.g5 Z6 = gVar2 != null ? ((sb2.l) gVar2).Z6() : null;
        com.tencent.mm.plugin.finder.video.FinderLivePlayView finderLivePlayView = Z6 instanceof com.tencent.mm.plugin.finder.video.FinderLivePlayView ? (com.tencent.mm.plugin.finder.video.FinderLivePlayView) Z6 : null;
        if (finderLivePlayView == null) {
            return;
        }
        finderLivePlayView.setOnVideoLayoutChangeCallback(this.f19980e);
    }

    public final void Z6() {
        in5.s0 s0Var;
        in5.s0 s0Var2;
        r45.kr0 d17;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f417141d.f417148h;
        android.view.View view = null;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
        if (((finderObject == null || (d17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject)) == null) ? 0 : d17.getInteger(0)) > 0 || this.f19981f || this.f19982g || this.f19983h) {
            uc2.g gVar = (uc2.g) O6(uc2.g.class);
            if (gVar != null && (s0Var2 = ((sb2.l) gVar).f417141d.f417149i) != null) {
                view = s0Var2.p(com.tencent.mm.R.id.f484484ee1);
            }
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = view;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        uc2.g gVar2 = (uc2.g) O6(uc2.g.class);
        if (gVar2 != null && (s0Var = ((sb2.l) gVar2).f417141d.f417149i) != null) {
            view = s0Var.p(com.tencent.mm.R.id.f484484ee1);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        android.view.View view3 = view;
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "checkFooterVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // tc2.h
    public void onLiveEnd() {
        tc2.g gVar = this.f417141d;
        in5.s0 s0Var = gVar.f417149i;
        android.view.View p17 = s0Var != null ? s0Var.p(com.tencent.mm.R.id.f484260dk3) : null;
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        in5.s0 s0Var2 = gVar.f417149i;
        android.view.View p18 = s0Var2 != null ? s0Var2.p(com.tencent.mm.R.id.djz) : null;
        if (p18 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(p18, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(p18, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        in5.s0 s0Var3 = gVar.f417149i;
        android.view.View p19 = s0Var3 != null ? s0Var3.p(com.tencent.mm.R.id.f484259dk2) : null;
        if (p19 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(p19, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        p19.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(p19, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveConvertUIInitController", "onLiveEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
