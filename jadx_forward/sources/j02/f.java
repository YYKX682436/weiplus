package j02;

/* loaded from: classes8.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f378519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h02.a f378520e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab f378521f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378522g;

    public f(boolean z17, h02.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab, com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a) {
        this.f378519d = z17;
        this.f378520e = aVar;
        this.f378521f = c13216xc6166eab;
        this.f378522g = activityC13235x6e95dd9a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f378519d;
        k02.s sVar = k02.s.f384635a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a = this.f378522g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab = this.f378521f;
        if (z17) {
            h02.a aVar = this.f378520e;
            if (aVar != null) {
                k02.l.a(aVar.f68408x32b20428, false, null);
                sVar.c(44L, c13216xc6166eab.f178464e, c13216xc6166eab.f178467h.f178450f, c13216xc6166eab.f178465f);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.T6(activityC13235x6e95dd9a, c13216xc6166eab.f178467h);
            sVar.c(23L, c13216xc6166eab.f178464e, c13216xc6166eab.f178467h.f178450f, c13216xc6166eab.f178465f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.V6(activityC13235x6e95dd9a, c13216xc6166eab.f178466g, c13216xc6166eab.f178465f, c13216xc6166eab.f178464e, false);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$initDialog$11", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
