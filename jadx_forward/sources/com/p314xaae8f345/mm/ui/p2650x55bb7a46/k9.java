package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class k9 extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9 f283433a;

    public k9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9 l9Var) {
        this.f283433a = l9Var;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int a(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int b(android.view.View child, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public int d(android.view.View child) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return this.f283433a.f283462m;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        android.view.Window window;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9 l9Var = this.f283433a;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.j9 m79762xcdfbcd79 = l9Var.m79762xcdfbcd79();
        if (m79762xcdfbcd79 != null) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.cb) m79762xcdfbcd79).f280056a;
            int i28 = dbVar.f281959f - i18;
            dbVar.f281970t = java.lang.Integer.valueOf(i28);
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.ta) dbVar.f281958e).b(i28, dbVar.f281959f);
        }
        if (changedView != l9Var.f283458f || i18 < l9Var.f283462m || l9Var.f283463n) {
            return;
        }
        l9Var.f283463n = true;
        android.app.Activity activity = l9Var.f283459g;
        if (activity != null) {
            activity.finish();
        }
        android.view.View view = l9Var.f283458f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.Activity activity2 = l9Var.f283459g;
        android.view.View decorView = (activity2 == null || (window = activity2.getWindow()) == null) ? null : window.getDecorView();
        if (decorView == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        android.view.View view2 = decorView;
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/DialogActivityPullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.l9 l9Var = this.f283433a;
        if (top <= l9Var.f283461i) {
            l9Var.m79762xcdfbcd79();
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = l9Var.f283460h;
            if (lVar != null) {
                lVar.s(0, 0);
            }
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.j9 m79762xcdfbcd79 = l9Var.m79762xcdfbcd79();
            if (m79762xcdfbcd79 != null) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.cb) m79762xcdfbcd79).f280056a;
                dbVar.f281971u = true;
                ((jz5.n) dbVar.f281966p).mo141623x754a37bb();
            }
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar2 = l9Var.f283460h;
            if (lVar2 != null) {
                lVar2.s(0, l9Var.f283462m);
            }
        }
        l9Var.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        android.view.ViewGroup viewGroup = this.f283433a.f283457e;
        if (viewGroup == null) {
            return true;
        }
        viewGroup.setBackgroundColor(0);
        return true;
    }
}
