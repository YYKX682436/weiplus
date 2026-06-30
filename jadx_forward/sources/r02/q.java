package r02;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r02.r f449854d;

    public q(r02.r rVar) {
        this.f449854d = rVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1361x4500da17.ui.ActivityC13242xdf6880d5 activityC13242xdf6880d5 = this.f449854d.f449856d;
        if (activityC13242xdf6880d5.f178914p == null) {
            android.view.View findViewById = activityC13242xdf6880d5.findViewById(com.p314xaae8f345.mm.R.id.imn);
            activityC13242xdf6880d5.f178914p = findViewById;
            activityC13242xdf6880d5.f178914p = ((android.view.ViewStub) findViewById).inflate();
        }
        android.view.View view = activityC13242xdf6880d5.f178914p;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/downloader_app/ui/DownloadMainUI", "showLoadingView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
