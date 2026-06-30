package if2;

/* loaded from: classes3.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f372638a;

    /* renamed from: b, reason: collision with root package name */
    public final if2.m0 f372639b;

    /* renamed from: c, reason: collision with root package name */
    public int f372640c;

    /* renamed from: d, reason: collision with root package name */
    public int f372641d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f372642e;

    public d0(android.view.View view, if2.m0 checkVisibleCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(checkVisibleCallback, "checkVisibleCallback");
        this.f372638a = view;
        this.f372639b = checkVisibleCallback;
        this.f372640c = view.getVisibility();
    }

    public void a(int i17) {
        this.f372640c = i17;
        android.view.View view = this.f372638a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f372638a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view2.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "forceVisible", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void b(int i17) {
        int i18 = this.f372641d;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        int i19 = (~i17) & i18;
        this.f372641d = i19;
        if (this.f372642e && i19 == 0) {
            android.view.View view = this.f372638a;
            int i27 = this.f372640c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i27));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "removeBarrier", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "removeBarrier", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f372642e = false;
        }
    }

    public void c(int i17, int i18) {
        int i19 = this.f372641d;
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        this.f372641d = i18 | i19;
        android.view.View view = this.f372638a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setBarrier", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setBarrier", "(II)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f372642e = true;
    }

    public void d(int i17) {
        this.f372640c = i17;
        if (!this.f372639b.k()) {
            android.view.View view = this.f372638a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (this.f372642e) {
            return;
        }
        android.view.View view2 = this.f372638a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/base/VisibleBarrier", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
