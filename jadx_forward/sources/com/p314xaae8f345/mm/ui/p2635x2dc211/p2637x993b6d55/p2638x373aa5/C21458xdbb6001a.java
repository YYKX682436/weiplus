package com.p314xaae8f345.mm.ui.p2635x2dc211.p2637x993b6d55.p2638x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/ui/anim/transition/view/TransitionAnimImageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Lya5/a;", "Landroid/view/View;", "f", "Landroid/view/View;", "getBindingLayout", "()Landroid/view/View;", "setBindingLayout", "(Landroid/view/View;)V", "bindingLayout", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.anim.transition.view.TransitionAnimImageView */
/* loaded from: classes2.dex */
public final class C21458xdbb6001a extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0085xa15044fd implements ya5.a {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public android.view.View bindingLayout;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21458xdbb6001a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final android.view.View getBindingLayout() {
        return this.bindingLayout;
    }

    @Override // ya5.a
    public void k(boolean z17) {
        if (!z17) {
            android.view.View view = this.bindingLayout;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        android.view.View view2 = this.bindingLayout;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.bindingLayout;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/ui/anim/transition/view/TransitionAnimImageView", "showBindView", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // ya5.a
    public void q() {
        android.view.View view = this.bindingLayout;
        if (view instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) view;
            if (imageView.getDrawable() != null) {
                setImageDrawable(imageView.getDrawable());
            }
        }
    }

    /* renamed from: setBindingLayout */
    public final void m78850x6fe500cd(android.view.View view) {
        this.bindingLayout = view;
    }
}
