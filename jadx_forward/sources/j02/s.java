package j02;

/* loaded from: classes8.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f378546e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, long j17) {
        this.f378545d = activityC13235x6e95dd9a;
        this.f378546e = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.f178753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a = this.f378545d;
        activityC13235x6e95dd9a.W6().f98345k.setVisibility(8);
        ((uz.c2) ((vz.a2) i95.n0.c(vz.a2.class))).wi(activityC13235x6e95dd9a.mo55332x76847179(), this.f378546e, true, true, new j02.r());
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
