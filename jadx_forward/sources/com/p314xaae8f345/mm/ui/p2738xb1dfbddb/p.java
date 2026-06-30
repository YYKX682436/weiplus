package com.p314xaae8f345.mm.ui.p2738xb1dfbddb;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c f291481d;

    public p(com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c c22490xdfa0051c) {
        this.f291481d = c22490xdfa0051c;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2738xb1dfbddb.C22490xdfa0051c tipsBarList = this.f291481d;
        if (tipsBarList.f291445n || tipsBarList.f291446o) {
            yj0.a.h(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        int ordinal = tipsBarList.f291447p.f291458a.ordinal();
        if (ordinal == 0) {
            android.widget.RelativeLayout relativeLayout = tipsBarList.f291439e;
            int height = relativeLayout.getHeight();
            tipsBarList.c();
            relativeLayout.setClipToOutline(true);
            android.view.View view2 = tipsBarList.f291443i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToExpandMode", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            tipsBarList.f291446o = true;
            android.view.ViewPropertyAnimator alpha = tipsBarList.f291443i.animate().alpha(1.0f);
            alpha.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
            alpha.setDuration(250L);
            alpha.start();
            alpha.setUpdateListener(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.g(tipsBarList, height));
            alpha.setListener(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.h(tipsBarList, alpha));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarList, "tipsBarList");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_list_open", tipsBarList, null, 26356);
        } else if (ordinal == 1) {
            int height2 = tipsBarList.f291439e.getHeight();
            tipsBarList.d();
            android.view.View view3 = tipsBarList.f291443i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup", "animToFoldMode", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view4 = tipsBarList.f291444m;
            android.view.ViewGroup.LayoutParams layoutParams = view4.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = height2;
                view4.setLayoutParams(layoutParams);
            }
            tipsBarList.f291445n = true;
            tipsBarList.f291443i.post(new com.p314xaae8f345.mm.ui.p2738xb1dfbddb.l(tipsBarList, height2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tipsBarList, "tipsBarList");
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_list_close", tipsBarList, null, 26356);
        }
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/ChatTipsBarGroup$selfClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
