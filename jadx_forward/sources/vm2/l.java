package vm2;

/* loaded from: classes10.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vm2.m f519628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vm2.n f519629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f519630f;

    public l(vm2.m mVar, vm2.n nVar, int i17) {
        this.f519628d = mVar;
        this.f519629e = nVar;
        this.f519630f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f519628d.f519631e.m1(this.f519629e.f519632d, this.f519630f);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/adapters/FinderLiveKTVReplayItemConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
