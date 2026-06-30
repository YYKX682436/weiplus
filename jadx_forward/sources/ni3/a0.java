package ni3;

/* loaded from: classes3.dex */
public final class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f419056f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 f419057g;

    public a0(android.view.View view, android.view.View view2, android.view.View view3, com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9) {
        this.f419054d = view;
        this.f419055e = view2;
        this.f419056f = view3;
        this.f419057g = c16559xedc507d9;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        float m66989x7bac614b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.view.View view2 = this.f419054d;
        java.lang.Object tag = view2.getTag();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1878x49b0bd5a.C16559xedc507d9 c16559xedc507d9 = this.f419057g;
        android.view.View view3 = this.f419055e;
        android.view.View view4 = this.f419056f;
        if (b17) {
            view3.animate().cancel();
            android.view.View view5 = this.f419055e;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view5.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view3.animate().alpha(1.0f).setDuration(360L).start();
            view2.animate().cancel();
            view2.animate().alpha(0.0f).setDuration(360L).start();
            view4.animate().cancel();
            android.view.ViewPropertyAnimator animate = view4.animate();
            m66989x7bac614b = c16559xedc507d9.m66989x7bac614b();
            animate.translationX(-m66989x7bac614b).setListener(new ni3.x(c16559xedc507d9)).setInterpolator(new android.view.animation.DecelerateInterpolator(1.6f)).setDuration(250L).start();
            view2.setTag(java.lang.Boolean.FALSE);
        } else {
            view2.animate().cancel();
            android.view.View view6 = this.f419054d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view6.setAlpha(((java.lang.Float) arrayList3.get(0)).floatValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.animate().alpha(1.0f).setDuration(360L).start();
            view3.animate().cancel();
            view3.animate().alpha(0.0f).setDuration(360L).start();
            view4.animate().cancel();
            view4.animate().translationX(0.0f).setListener(new ni3.y(view4, c16559xedc507d9)).setInterpolator(new android.view.animation.DecelerateInterpolator(1.6f)).setDuration(250L).start();
            c16559xedc507d9.f231004w.mo50297x7c4d7ca2(new ni3.z(c16559xedc507d9), 20L);
            view2.setTag(bool);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/monitor/FinderStreamMonitorView$clickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
