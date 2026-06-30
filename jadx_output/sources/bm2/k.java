package bm2;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m f22021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22022e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f22023f;

    public k(bm2.m mVar, int i17, dk2.vg vgVar) {
        this.f22021d = mVar;
        this.f22022e = i17;
        this.f22023f = vgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.m mVar = this.f22021d;
        java.lang.String str = mVar.f22075i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClickListener position:");
        int i17 = this.f22022e;
        sb6.append(i17);
        sb6.append(",descDataList.size:");
        sb6.append(mVar.f22077n.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.q qVar = mVar.f22080q;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(view);
            qVar.invoke(view, java.lang.Integer.valueOf(i17 - mVar.f22077n.size()), this.f22023f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
