package bm2;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m f22054d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f22055e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f22056f;

    public l(bm2.m mVar, int i17, dk2.vg vgVar) {
        this.f22054d = mVar;
        this.f22055e = i17;
        this.f22056f = vgVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        bm2.m mVar = this.f22054d;
        java.lang.String str = mVar.f22075i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClickListener position:");
        int i17 = this.f22055e;
        sb6.append(i17);
        sb6.append(",descDataList.size:");
        sb6.append(mVar.f22077n.size());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        yz5.q qVar = mVar.f22081r;
        if (qVar != null) {
            kotlin.jvm.internal.o.d(view);
            qVar.invoke(view, java.lang.Integer.valueOf(i17 - mVar.f22077n.size()), this.f22056f);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
