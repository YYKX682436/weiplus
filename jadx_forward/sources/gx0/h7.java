package gx0;

/* loaded from: classes5.dex */
public final class h7 implements nv0.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358033d;

    public h7(gx0.w8 w8Var) {
        this.f358033d = w8Var;
    }

    @Override // nv0.f
    public void v4(boolean z17, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q composingPanel, nv0.d stack) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(composingPanel, "composingPanel");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        gx0.w8 w8Var = this.f358033d;
        ((gx0.x4) ((jz5.n) w8Var.f430434o).mo141623x754a37bb()).l7();
        if (!stack.f421961b.isEmpty()) {
            android.view.View view = w8Var.f358658z;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mcBackBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup viewGroup = w8Var.U6().f324943m;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
                throw null;
            }
        }
        android.view.View view2 = w8Var.f358658z;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mcBackBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/uic/MovieMainComposingUIC$panelHiddenChanged$1", "onHiddenChange", "(ZLcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/IComposingPanel;Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/navigation/GlobalPanelStack;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.ViewGroup viewGroup2 = w8Var.U6().f324943m;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
            throw null;
        }
    }
}
