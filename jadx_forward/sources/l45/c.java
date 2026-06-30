package l45;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l45.d f397971d;

    public c(l45.d dVar) {
        this.f397971d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View m177309xb3ec347 = this.f397971d.f397972a.f397993a.m177309xb3ec347();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m177309xb3ec347, arrayList.toArray(), "com/tencent/mm/presenter/DrawingPresenter$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m177309xb3ec347.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m177309xb3ec347, "com/tencent/mm/presenter/DrawingPresenter$3$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
