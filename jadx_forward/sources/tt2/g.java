package tt2;

/* loaded from: classes3.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tt2.i f503440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f503441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503442f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tt2.e f503443g;

    public g(tt2.i iVar, in5.r0 r0Var, int i17, tt2.e eVar) {
        this.f503440d = iVar;
        this.f503441e = r0Var;
        this.f503442f = i17;
        this.f503443g = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        tt2.i.E(this.f503440d, this.f503441e, this.f503442f, this.f503443g);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/adapter/FinderLiveShoppingEditAdapter$_onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
