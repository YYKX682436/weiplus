package j02;

/* loaded from: classes8.dex */
public final class t implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378547d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a) {
        this.f378547d = activityC13235x6e95dd9a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a = this.f378547d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab = activityC13235x6e95dd9a.f178757g;
        if (c13216xc6166eab == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAppInfoWrapper");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.T6(activityC13235x6e95dd9a, c13216xc6166eab.f178467h);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
