package hr3;

/* loaded from: classes11.dex */
public final class kc extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hr3.lc f365255a;

    public kc(hr3.lc lcVar) {
        this.f365255a = lcVar;
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
        return this.f365255a.f365297m;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        hr3.lc lcVar = this.f365255a;
        if (changedView != lcVar.f365293f || i18 < lcVar.f365297m || lcVar.f365298n) {
            return;
        }
        lcVar.f365298n = true;
        android.app.Activity activity = lcVar.f365294g;
        if (activity == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mActivity");
            throw null;
        }
        activity.finish();
        android.view.View view = lcVar.f365293f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.app.Activity activity2 = lcVar.f365294g;
        if (activity2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mActivity");
            throw null;
        }
        android.view.View decorView = activity2.getWindow().getDecorView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(decorView, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/plugin/profile/ui/PullDownCloseLayout$DragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        hr3.lc lcVar = this.f365255a;
        if (top <= lcVar.f365296i) {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = lcVar.f365295h;
            if (lVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
                throw null;
            }
            lVar.s(0, 0);
        } else {
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar2 = lcVar.f365295h;
            if (lVar2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewDragHelper");
                throw null;
            }
            lVar2.s(0, lcVar.f365297m);
        }
        lcVar.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        return true;
    }
}
