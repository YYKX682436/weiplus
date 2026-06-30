package b30;

/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final b30.z f17588a = new b30.z();

    public final void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/ecs/util/ViewExt", "hide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/ecs/util/ViewExt", "hide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b(android.view.View view, yz5.a listener) {
        kotlin.jvm.internal.o.g(view, "<this>");
        kotlin.jvm.internal.o.g(listener, "listener");
        view.setOnClickListener(new b30.y(listener));
    }

    public final void c(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/feature/ecs/util/ViewExt", "show", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/feature/ecs/util/ViewExt", "show", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
