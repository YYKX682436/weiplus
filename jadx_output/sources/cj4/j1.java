package cj4;

/* loaded from: classes.dex */
public abstract class j1 {
    public static final void a(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        view.setTag(com.tencent.mm.R.id.f487286o52, java.lang.Integer.valueOf(view.getVisibility()));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "markAndGone", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "markAndGone", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public static final void b(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "<this>");
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f487286o52);
        if (tag instanceof java.lang.Integer) {
            int intValue = ((java.lang.Number) tag).intValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "resumeVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/textstatus/logic/BaseStatusLoadLogicKt", "resumeVisibility", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
