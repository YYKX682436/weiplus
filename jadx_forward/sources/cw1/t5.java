package cw1;

/* loaded from: classes12.dex */
public final class t5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f304870e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f304871f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f304872g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f304873h;

    public t5(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, android.view.View view2, android.view.animation.Animation animation) {
        this.f304869d = view;
        this.f304870e = c13121x39a05fa9;
        this.f304871f = c22699x3dcdb352;
        this.f304872g = view2;
        this.f304873h = animation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.widget.TextView textView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View filterPanel = this.f304869d;
        int visibility = filterPanel.getVisibility();
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f304870e;
        if (visibility == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filterPanel, "$sortPanel");
            textView = c13121x39a05fa9.f177296g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortText");
                throw null;
            }
            android.view.ViewPropertyAnimator animate = this.f304871f.animate();
            animate.cancel();
            animate.rotation(0.0f);
            animate.setDuration(200L);
            animate.start();
        } else {
            filterPanel = this.f304872g;
            if (filterPanel.getVisibility() != 0) {
                yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(filterPanel, "$filterPanel");
            textView = c13121x39a05fa9.f177297h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("filterText");
                throw null;
            }
            if (c13121x39a05fa9.f177300n) {
                cw1.r5 onFilterChangeListener = c13121x39a05fa9.getOnFilterChangeListener();
                if (onFilterChangeListener != null) {
                    ((cw1.C28166x6a4337a) onFilterChangeListener).a(c13121x39a05fa9.f177301o, c13121x39a05fa9.f177302p);
                }
                c13121x39a05fa9.f177300n = false;
            }
        }
        cw1.s5 s5Var = new cw1.s5(filterPanel);
        android.view.animation.Animation animation = this.f304873h;
        animation.setAnimationListener(s5Var);
        filterPanel.startAnimation(animation);
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.a(c13121x39a05fa9, textView, false);
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
