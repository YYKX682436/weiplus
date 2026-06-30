package com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/OverScrollMultiTaskVerticalBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "<init>", "()V", "ui-multitask_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.OverScrollMultiTaskVerticalBehavior */
/* loaded from: classes8.dex */
public final class C16617x6dc79c85 extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25> {

    /* renamed from: d, reason: collision with root package name */
    public vk3.a f232115d;

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void o(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a coordinatorLayout, android.view.View view, android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 child = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinatorLayout, "coordinatorLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        if (child != target) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = child.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
        if (c1162x665295de.y() == (child.mo7946xf939df19() != null ? r4.mo1894x7e414b06() : -1) - 1 || c1162x665295de.w() == 0) {
            if (i27 > 0 && i28 == 0) {
                child.getTranslationY();
                child.animate().cancel();
                child.setTranslationY(child.getTranslationY() - (i27 / 2));
                vk3.a aVar = this.f232115d;
                if (aVar != null) {
                    ((zk3.x) aVar).a();
                    return;
                }
                return;
            }
            if (i27 >= 0 || i28 != 0) {
                return;
            }
            child.getTranslationY();
            child.animate().cancel();
            child.setTranslationY(child.getTranslationY() - (i27 / 2));
            vk3.a aVar2 = this.f232115d;
            if (aVar2 != null) {
                ((zk3.x) aVar2).a();
            }
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a coordinatorLayout, android.view.View view, android.view.View directTargetChild, android.view.View target, int i17, int i18) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 child = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coordinatorLayout, "coordinatorLayout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(directTargetChild, "directTargetChild");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
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
        if (child.getTranslationY() < 0.0f) {
            child.getTranslationY();
            oa5.b.b(child).n(0.0f).k(new yk3.j(this)).l();
        } else if (child.getTranslationY() > 0.0f) {
            child.getTranslationY();
            oa5.b.b(child).n(0.0f).k(new yk3.k(this)).l();
        }
    }
}
