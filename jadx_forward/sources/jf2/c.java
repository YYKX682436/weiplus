package jf2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.m f380892d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f380893e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jf2.g f380894f;

    public c(jf2.m mVar, int i17, jf2.g gVar) {
        this.f380892d = mVar;
        this.f380893e = i17;
        this.f380894f = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f380892d.e(this.f380893e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this.f380894f, false, 1, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/bottomoption/FinderLiveVisitorBottomFolderPanel$mAdapter$2$1$onBindViewHolder$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
