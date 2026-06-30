package tp0;

/* loaded from: classes.dex */
public final class k implements jc3.l {
    @Override // jc3.l
    public void a(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/magicbrush/plugin/coverview/base/CoverViewWrapper$getEmptyCoverViewDelegate$1$provideViewOperationDelegate$1", "onRequestShow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/magicbrush/plugin/coverview/base/CoverViewWrapper$getEmptyCoverViewDelegate$1$provideViewOperationDelegate$1", "onRequestShow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // jc3.l
    public void b(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/magicbrush/plugin/coverview/base/CoverViewWrapper$getEmptyCoverViewDelegate$1$provideViewOperationDelegate$1", "onRequestHide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/magicbrush/plugin/coverview/base/CoverViewWrapper$getEmptyCoverViewDelegate$1$provideViewOperationDelegate$1", "onRequestHide", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
