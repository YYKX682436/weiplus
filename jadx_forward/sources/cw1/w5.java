package cw1;

/* loaded from: classes5.dex */
public final class w5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f305011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f305012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f305013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f305014h;

    public w5(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, android.view.animation.Animation animation, android.view.animation.Animation animation2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        this.f305010d = view;
        this.f305011e = c13121x39a05fa9;
        this.f305012f = animation;
        this.f305013g = animation2;
        this.f305014h = c22699x3dcdb352;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f305010d;
        boolean z17 = view2.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f305011e;
        android.view.View view3 = c13121x39a05fa9.f177295f;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
            throw null;
        }
        view3.callOnClick();
        if (!z17) {
            android.view.View view4 = c13121x39a05fa9.f177295f;
            if (view4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f305010d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = c13121x39a05fa9.f177296g;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sortText");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.a(c13121x39a05fa9, textView, true);
            android.view.View view6 = c13121x39a05fa9.f177295f;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
                throw null;
            }
            view6.startAnimation(this.f305012f);
            view2.startAnimation(this.f305013g);
            android.view.ViewPropertyAnimator animate = this.f305014h.animate();
            animate.cancel();
            animate.rotation(180.0f);
            animate.setDuration(200L);
            animate.start();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
