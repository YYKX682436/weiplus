package j02;

/* loaded from: classes8.dex */
public final class w implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a f378549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f378550e;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a, long j17) {
        this.f378549d = activityC13235x6e95dd9a;
        this.f378550e = j17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.f178753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a activityC13235x6e95dd9a = this.f378549d;
        activityC13235x6e95dd9a.W6().f98345k.setVisibility(0);
        vz.a2 a2Var = (vz.a2) i95.n0.c(vz.a2.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC13235x6e95dd9a.mo55332x76847179();
        long j17 = this.f378550e;
        j02.v vVar = new j02.v();
        ((uz.c2) a2Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.j1.f(mo55332x76847179, j17, false, false, false, vVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab = activityC13235x6e95dd9a.f178757g;
        if (c13216xc6166eab == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAppInfoWrapper");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui.ActivityC13235x6e95dd9a.V6(activityC13235x6e95dd9a, c13216xc6166eab.f178466g, c13216xc6166eab.f178465f, c13216xc6166eab.f178464e, false);
        k02.s sVar = k02.s.f384635a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13216xc6166eab c13216xc6166eab2 = activityC13235x6e95dd9a.f178757g;
        if (c13216xc6166eab2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mAppInfoWrapper");
            throw null;
        }
        sVar.c(23L, c13216xc6166eab2.f178464e, c13216xc6166eab2.f178467h.f178450f, c13216xc6166eab2.f178465f);
        yj0.a.h(this, "com/tencent/mm/plugin/downloader/ui/GameCloudAppDownloadUI$mDownloadListener$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
