package ku3;

/* loaded from: classes.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f393692d;

    public a(android.view.View view) {
        this.f393692d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View view = this.f393692d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin$hideIndicator$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/recordvideo/plugin/professional/CameraKitIndicatorPlugin$hideIndicator$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
