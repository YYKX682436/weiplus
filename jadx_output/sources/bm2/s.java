package bm2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.t f22282d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.p f22283e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f22284f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f22285g;

    public s(bm2.t tVar, bm2.p pVar, int i17, dk2.vg vgVar) {
        this.f22282d = tVar;
        this.f22283e = pVar;
        this.f22284f = i17;
        this.f22285g = vgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter$onBindEditMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.t tVar = this.f22282d;
        tVar.getClass();
        dk2.vg vgVar = this.f22285g;
        boolean z17 = !vgVar.f234258e;
        vgVar.f234258e = z17;
        bm2.p pVar = this.f22283e;
        pVar.f22209e.setChecked(z17);
        yz5.q qVar = tVar.f22303r;
        if (qVar != null) {
            android.view.View itemView = pVar.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            qVar.invoke(itemView, java.lang.Integer.valueOf(this.f22284f), vgVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter$onBindEditMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
