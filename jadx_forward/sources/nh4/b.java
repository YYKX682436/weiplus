package nh4;

/* loaded from: classes8.dex */
public final class b extends ph4.j {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f418655b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ph4.f callback) {
        super(callback);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f418655b = "TaskBarSectionOtherViewLiveHelper";
    }

    @Override // ph4.j
    public int a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return com.p314xaae8f345.mm.R.C30861xcebc809e.cfy;
    }

    @Override // ph4.j
    public java.lang.String b(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.f571852ro);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // ph4.j
    public void d(int i17, ph4.b viewHolder, lh4.n viewModel) {
        java.lang.String str;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        java.lang.String str2 = this.f418655b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewModel, "viewModel");
        super.d(i17, viewHolder, viewModel);
        r45.b22 b22Var = new r45.b22();
        try {
            b22Var.mo11468x92b714fd(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((java.util.ArrayList) viewModel.f400257d).get(i17)).f66790x225a93cf);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "FinderLiveMultiTaskData parse fail", th6);
        }
        if (((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7)) == null) {
            return;
        }
        android.content.Context context = viewHolder.f3639x46306858.getContext();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19792x256d2725);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa m76760x76845fea = c19792x256d2725.m76760x76845fea();
        java.lang.CharSequence m76184x8010e5e4 = m76760x76845fea != null ? m76760x76845fea.m76184x8010e5e4() : null;
        if (m76184x8010e5e4 == null) {
            m76184x8010e5e4 = "";
        }
        if (m76184x8010e5e4.length() > 0) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str3 = ((java.lang.Object) m76184x8010e5e4) + i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.f571853rp);
            ((ke0.e) xVar).getClass();
            m76184x8010e5e4 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(context, str3);
        }
        viewHolder.f435996f.setText(m76184x8010e5e4);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666 = c19792x256d2725.m76802x2dd01666();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = (m76802x2dd01666 == null || (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) == null) ? null : (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e);
        java.lang.String m76585x66e287ae = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76585x66e287ae() : null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m76585x66e287ae == null) {
            m76585x66e287ae = "";
        }
        java.lang.String m76587x815afa6b = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76587x815afa6b() : null;
        if (m76587x815afa6b == null) {
            m76587x815afa6b = "";
        }
        java.lang.String concat = m76585x66e287ae.concat(m76587x815afa6b);
        java.lang.String m76623xd93f812f = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76623xd93f812f() : null;
        if (m76623xd93f812f == null) {
            m76623xd93f812f = "";
        }
        java.lang.String m76624x4c9b7dca = c19788xd7cfd73e != null ? c19788xd7cfd73e.m76624x4c9b7dca() : null;
        if (m76624x4c9b7dca == null) {
            m76624x4c9b7dca = "";
        }
        java.lang.String concat2 = m76623xd93f812f.concat(m76624x4c9b7dca);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
            concat = concat2;
        }
        android.widget.ImageView imageView = viewHolder.f435995e;
        imageView.setImageBitmap(null);
        mn2.g1 g1Var = mn2.g1.f411508a;
        wo0.c a17 = g1Var.e().a(((c61.i8) ((vd2.i5) i95.n0.c(vd2.i5.class))).Ai(concat, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
        a17.f529407e = new ap0.g(null, null, 3, null);
        a17.g(g1Var.h(mn2.f1.f411486d));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "<get-image>(...)");
        a17.c(imageView);
        r45.nw1 m76794xd0557130 = c19792x256d2725.m76794xd0557130();
        int m75939xb282bd08 = m76794xd0557130 != null ? m76794xd0557130.m75939xb282bd08(2) : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onBind live " + m75939xb282bd08 + ' ' + ((java.lang.Object) m76184x8010e5e4));
        if (m75939xb282bd08 == 1) {
            android.view.View view = viewHolder.f435999i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = viewHolder.f436000m;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view3 = viewHolder.f435999i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = viewHolder.f436000m;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/taskbar/ui/section/live/TaskBarSectionOtherViewLiveHelper", "onBindViewHolder", "(ILcom/tencent/mm/plugin/taskbar/ui/section/other/TaskBarSectionOtherView$BaseViewHolder;Lcom/tencent/mm/plugin/taskbar/ui/section/TaskBarSectionViewModel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            vd2.t3 t3Var = vd2.t3.f517454a;
            if (imageView != null && concat != null) {
                ((b92.d1) ((c61.zb) i95.n0.c(c61.zb.class))).tj(imageView, concat, 25);
            }
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        android.view.View view5 = viewHolder.f3639x46306858;
        jz5.l[] lVarArr = new jz5.l[5];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(c19792x256d2725.m76784x5db1b11()));
        lVarArr[1] = new jz5.l("live_id", pm0.v.u(b22Var.m75942xfb822ef2(1)));
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.q1 q1Var = ml2.q1.f409345e;
        lVarArr[2] = new jz5.l("comment_scene", "temp_15");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) b22Var.m75936x14adae67(7);
        if (c19792x256d27252 == null || (str = c19792x256d27252.m76836x6c03c64c()) == null) {
            str = "";
        }
        lVarArr[3] = new jz5.l("finder_username", str);
        java.lang.String m75945x2fec8307 = b22Var.m75945x2fec8307(6);
        lVarArr[4] = new jz5.l("session_buffer", m75945x2fec8307 != null ? m75945x2fec8307 : "");
        ((cy1.a) rVar).gk(view5, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(viewHolder.f3639x46306858, new nh4.a(c19792x256d2725));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(viewHolder.f3639x46306858, "live_room_card_wamain");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(viewHolder.f3639x46306858, 40, 26236);
    }
}
