package mx0;

/* loaded from: classes.dex */
public final class w1 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f413942d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f413943e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f413944f;

    /* renamed from: g, reason: collision with root package name */
    public final mx0.z f413945g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f413946h;

    public w1(android.view.View moreTemplateBtn, android.view.View bottomShadow, android.view.View sideShadow, mx0.z controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moreTemplateBtn, "moreTemplateBtn");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomShadow, "bottomShadow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sideShadow, "sideShadow");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f413942d = moreTemplateBtn;
        this.f413943e = bottomShadow;
        this.f413944f = sideShadow;
        this.f413945g = controller;
        this.f413946h = true;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) moreTemplateBtn.findViewById(com.p314xaae8f345.mm.R.id.f568789o14);
        c22628xfde5d61d.setBackgroundColor(-16777216);
        c22628xfde5d61d.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cpj);
        android.widget.TextView textView = (android.widget.TextView) moreTemplateBtn.findViewById(com.p314xaae8f345.mm.R.id.o1a);
        textView.setText(i65.a.r(moreTemplateBtn.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574674ly0));
        com.p314xaae8f345.mm.ui.fk.a(textView);
        moreTemplateBtn.setBackgroundColor(-16777216);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(moreTemplateBtn, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        moreTemplateBtn.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(moreTemplateBtn, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(bottomShadow, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        bottomShadow.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(bottomShadow, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(sideShadow, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sideShadow.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(sideShadow, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "<init>", "(Landroid/view/View;Landroid/view/View;Landroid/view/View;Lcom/tencent/mm/mj_publisher/finder/shoot_composing/IShootComposingController;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        moreTemplateBtn.setOnClickListener(new mx0.s1(this));
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        if (this.f413946h && i17 != this.f413942d.getVisibility()) {
            if (i17 != 0) {
                sa5.d.d(this.f413942d, 0, 0L, new mx0.t1(this, i17), 3, null);
                sa5.d.d(this.f413943e, 0, 0L, new mx0.u1(this, i17), 3, null);
                sa5.d.d(this.f413944f, 0, 0L, new mx0.v1(this, i17), 3, null);
                return;
            }
            android.view.View view = this.f413942d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view2 = this.f413942d;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sa5.d.c(this.f413942d, 0.0f, 0L, null, 7, null);
            android.view.View view3 = this.f413943e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view4 = this.f413943e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sa5.d.c(this.f413943e, 0.0f, 0L, null, 7, null);
            android.view.View view5 = this.f413944f;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList5.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            android.view.View view6 = this.f413944f;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/mj_publisher/finder/shoot_composing/MoreTemplatePlugin", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            sa5.d.c(this.f413944f, 0.0f, 0L, null, 7, null);
        }
    }
}
