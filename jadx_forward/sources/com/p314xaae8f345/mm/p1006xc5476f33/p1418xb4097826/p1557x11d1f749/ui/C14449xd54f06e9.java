package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/megavideo/ui/OverScrollVerticalBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.megavideo.ui.OverScrollVerticalBehavior */
/* loaded from: classes5.dex */
public final class C14449xd54f06e9 extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25> {

    /* renamed from: d, reason: collision with root package name */
    public int f202598d;

    /* renamed from: e, reason: collision with root package name */
    public int f202599e;

    /* renamed from: f, reason: collision with root package name */
    public int f202600f;

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void o(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a coordinatorLayout, android.view.View view, android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 child = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinatorLayout, "coordinatorLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (child != target) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = child.mo7951xfd37656d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo7951xfd37656d, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d).y() != (child.mo7946xf939df19() != null ? r3.mo1894x7e414b06() : -1) - 1) {
            return;
        }
        if (i27 > 0 && i28 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OverScrollVerticalBehavior", "onNestedScroll: start nested scroll dyUnconsumed = " + i27 + ", currTranslateY = " + child.getTranslationY());
            child.animate().cancel();
            child.setTranslationY(child.getTranslationY() - ((float) (i27 / 2)));
            this.f202600f = 0;
        }
        this.f202599e += i19;
        this.f202600f += i27;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a coordinatorLayout, android.view.View view, android.view.View directTargetChild, android.view.View target, int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 child = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinatorLayout, "coordinatorLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(directTargetChild, "directTargetChild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        this.f202599e = 0;
        this.f202600f = 0;
        return child == target && (i17 & 2) != 0 && i18 == 0;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void w(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a coordinatorLayout, android.view.View view, android.view.View target, int i17) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 child = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinatorLayout, "coordinatorLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (i17 != 0) {
            return;
        }
        if (this.f202598d == 0) {
            this.f202598d = android.view.ViewConfiguration.get(target.getContext()).getScaledTouchSlop() * 10;
        }
        if (child.getTranslationY() < 0.0f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("OverScrollVerticalBehavior", "onStopNestedScroll: start anim translateY = " + child.getTranslationY());
            child.animate().translationY(0.0f).start();
            if (java.lang.Math.abs(child.getTranslationY()) > this.f202598d) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = child.mo7951xfd37656d();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d : null;
                if (c1162x665295de != null) {
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 q07 = child.q0(c1162x665295de.y(), false);
                    if ((q07 instanceof in5.s0 ? (in5.s0) q07 : null) != null) {
                        db5.t7.m123882x26a183b(child.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f573429el3, 0).show();
                    }
                }
            }
        }
        int i18 = this.f202600f;
        if (i18 < 0 && java.lang.Math.abs(i18) > java.lang.Math.abs(this.f202599e)) {
            java.lang.Math.abs(this.f202600f);
        }
        this.f202600f = 0;
        this.f202599e = 0;
    }
}
