package ck3;

/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ck3.j f124022a = new ck3.j();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f124023b;

    public final void a(android.app.Activity activity, android.view.View view, android.widget.TextView textView) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskAnimHelper", "dealCancel");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimCanceled", "(Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimCanceled", "(Landroid/app/Activity;Landroid/view/View;Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.hbl);
        if (textView2 != null) {
            textView2.setVisibility(8);
        }
        textView.setVisibility(0);
        textView.setAlpha(1.0f);
        zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activity);
        if (Ai != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).T6(false);
        }
    }

    public final void b(android.app.Activity activity, android.view.View view, android.view.View view2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimFinished", "(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimFinished", "(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimFinished", "(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimFinished", "(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimFinished", "(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitask/animation/floatball/MultiTaskAnimHelper", "dealAnimFinished", "(Landroid/app/Activity;Landroid/view/View;Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        zk3.c Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(activity);
        if (Ai != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).T6(true);
        }
        c();
    }

    public final void c() {
        f124023b = false;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).getClass();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").putBoolean(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class)).Di() ? "multitask_new_tips_show" : "multitask_tips_show", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAnimHelper", "finishAnim");
    }
}
