package cw1;

/* loaded from: classes5.dex */
public final class x5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f305034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 f305035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f305036f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.animation.Animation f305037g;

    public x5(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9, android.view.animation.Animation animation, android.view.animation.Animation animation2) {
        this.f305034d = view;
        this.f305035e = c13121x39a05fa9;
        this.f305036f = animation;
        this.f305037g = animation2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f305034d;
        boolean z17 = view2.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9 c13121x39a05fa9 = this.f305035e;
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
            yj0.a.d(view4, arrayList2.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = this.f305034d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$5", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.TextView textView = c13121x39a05fa9.f177297h;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("filterText");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1323x5a5b649.ui.p1327x81c871ea.C13121x39a05fa9.a(c13121x39a05fa9, textView, true);
            android.view.View view6 = c13121x39a05fa9.f177295f;
            if (view6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("background");
                throw null;
            }
            view6.startAnimation(this.f305036f);
            view2.startAnimation(this.f305037g);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/clean/ui/fileindexui/CleanFilterDialog$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
