package bm2;

/* loaded from: classes3.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.t f103815d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.p f103816e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f103817f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.vg f103818g;

    public s(bm2.t tVar, bm2.p pVar, int i17, dk2.vg vgVar) {
        this.f103815d = tVar;
        this.f103816e = pVar;
        this.f103817f = i17;
        this.f103818g = vgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter$onBindEditMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bm2.t tVar = this.f103815d;
        tVar.getClass();
        dk2.vg vgVar = this.f103818g;
        boolean z17 = !vgVar.f315791e;
        vgVar.f315791e = z17;
        bm2.p pVar = this.f103816e;
        pVar.f103742e.setChecked(z17);
        yz5.q qVar = tVar.f103836r;
        if (qVar != null) {
            android.view.View itemView = pVar.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            qVar.mo147xb9724478(itemView, java.lang.Integer.valueOf(this.f103817f), vgVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter$onBindEditMusicHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
