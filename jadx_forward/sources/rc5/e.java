package rc5;

/* loaded from: classes11.dex */
public final class e extends p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rc5.m f475687a;

    public e(rc5.m mVar) {
        this.f475687a = mVar;
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
        return this.f475687a.f475706i;
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changedView, "changedView");
        rc5.m mVar = this.f475687a;
        android.view.View view = mVar.f475712r;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUIRootView");
            throw null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(changedView, view) || mVar.f475714t || i18 < mVar.f475706i) {
            return;
        }
        mVar.f475714t = true;
        android.view.View view2 = mVar.f475712r;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mUIRootView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View decorView = mVar.f475703f.m158354x19263085().getWindow().getDecorView();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(decorView, arrayList2.toArray(), "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/ui/chatting/half/ExpandableHalfScreenChattingUIC$InteractAuxLayout$ViewDragCallback", "onViewPositionChanged", "(Landroid/view/View;IIII)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        rc5.n nVar = mVar.f475710p;
        if (nVar != null) {
            ((rc5.q) nVar).f475721a.m158354x19263085().finish();
        }
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(releasedChild, "releasedChild");
        int top = releasedChild.getTop();
        rc5.m mVar = this.f475687a;
        if (top <= mVar.f475707m) {
            mVar.f475711q.s(0, 0);
        } else {
            mVar.f475711q.s(0, mVar.f475706i);
        }
        mVar.invalidate();
    }

    @Override // p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k
    public boolean k(android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        this.f475687a.f475703f.m158354x19263085().getWindow().getDecorView().setBackgroundColor(0);
        return true;
    }
}
