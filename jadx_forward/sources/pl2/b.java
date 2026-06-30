package pl2;

/* loaded from: classes3.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pl2.s f438151d;

    public b(pl2.s sVar) {
        this.f438151d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildBody$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pl2.s sVar = this.f438151d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(sVar.f438180b, "click close btn");
        android.content.Context b17 = sVar.b();
        pf5.z zVar = pf5.z.f435481a;
        if (!(b17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((pl2.x) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) b17).a(pl2.x.class)).f438220m.f438211h = 1;
        pl2.s.e(this.f438151d, 0L, null, 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildBody$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
