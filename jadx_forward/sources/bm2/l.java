package bm2;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m f103587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f103589f;

    public l(bm2.m mVar, int i17, dk2.vg vgVar) {
        this.f103587d = mVar;
        this.f103588e = i17;
        this.f103589f = vgVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        bm2.m mVar = this.f103587d;
        java.lang.String str = mVar.f103608i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLongClickListener position:");
        int i17 = this.f103588e;
        sb6.append(i17);
        sb6.append(",descDataList.size:");
        sb6.append(mVar.f103610n.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.q qVar = mVar.f103614r;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            qVar.mo147xb9724478(view, java.lang.Integer.valueOf(i17 - mVar.f103610n.size()), this.f103589f);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$3", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
