package bm2;

/* loaded from: classes3.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.m f103554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f103555e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f103556f;

    public k(bm2.m mVar, int i17, dk2.vg vgVar) {
        this.f103554d = mVar;
        this.f103555e = i17;
        this.f103556f = vgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.m mVar = this.f103554d;
        java.lang.String str = mVar.f103608i;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemClickListener position:");
        int i17 = this.f103555e;
        sb6.append(i17);
        sb6.append(",descDataList.size:");
        sb6.append(mVar.f103610n.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.q qVar = mVar.f103613q;
        if (qVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
            qVar.mo147xb9724478(view, java.lang.Integer.valueOf(i17 - mVar.f103610n.size()), this.f103556f);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter$onBindMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
