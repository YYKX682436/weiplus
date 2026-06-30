package rm2;

/* loaded from: classes3.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rm2.d f478969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rm2.a f478970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f478971f;

    public c(rm2.d dVar, rm2.a aVar, int i17) {
        this.f478969d = dVar;
        this.f478970e = aVar;
        this.f478971f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.p pVar = this.f478969d.f478973e;
        if (pVar != null) {
            pVar.mo149xb9724478(this.f478970e, java.lang.Integer.valueOf(this.f478971f));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/state/FinderLiveChargeModeSelectAdapter$onBindViewHolder$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
