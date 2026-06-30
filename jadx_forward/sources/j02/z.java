package j02;

/* loaded from: classes.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dm.t3 f378555e;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, dm.t3 t3Var) {
        this.f378554d = activityC13235x6e95dd9a;
        this.f378555e = t3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k02.l.d(this.f378554d.mo55332x76847179(), this.f378555e.f68404x28d45f97, j02.y.f378553a);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
