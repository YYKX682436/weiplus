package r02;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.j f449832d;

    public g(r02.j jVar) {
        this.f449832d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f449832d.f449840b.f178914p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "hideLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
