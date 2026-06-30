package j02;

/* loaded from: classes8.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f378551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378552e;

    public x(long j17, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a) {
        this.f378551d = j17;
        this.f378552e = activityC13235x6e95dd9a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        k02.l.a(this.f378551d, false, null);
        k02.s sVar = k02.s.f384635a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab = this.f378552e.f178757g;
        if (c13216xc6166eab == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAppInfoWrapper");
            throw null;
        }
        java.lang.String str = c13216xc6166eab.f178464e;
        if (c13216xc6166eab == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAppInfoWrapper");
            throw null;
        }
        java.lang.String str2 = c13216xc6166eab.f178467h.f178450f;
        if (c13216xc6166eab == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAppInfoWrapper");
            throw null;
        }
        sVar.c(44L, str, str2, c13216xc6166eab.f178465f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
