package tg2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tg2.b f500688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tg2.i f500689e;

    public a(tg2.b bVar, tg2.i iVar) {
        this.f500688d = bVar;
        this.f500689e = iVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/FinderLiveChooseGiftConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yz5.l lVar = this.f500688d.f500691f;
        tg2.i iVar = this.f500689e;
        lVar.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.lj(iVar.f500708d, iVar.f500709e, iVar.f500710f));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/FinderLiveChooseGiftConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
