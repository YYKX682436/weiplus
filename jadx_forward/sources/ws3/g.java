package ws3;

/* loaded from: classes9.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb f530709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ws3.j f530710e;

    public g(ws3.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.p1980x300cc4.C16961xa9bd4cfb c16961xa9bd4cfb) {
        this.f530710e = jVar;
        this.f530709d = c16961xa9bd4cfb;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        ws3.j jVar = this.f530710e;
        jVar.f530715b = jVar.f530717d.getItem(i17);
        if (jVar.f530715b != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CommonHintViewConfig", "onItemClick record.record " + jVar.f530715b.f521408a + ", record.name " + jVar.f530715b.f521409b);
            jVar.f530718e = true;
            jVar.b(jVar.f530715b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CommonHintViewConfig", "record is null");
        }
        this.f530709d.dismissDropDown();
        yj0.a.h(this, "com/tencent/mm/plugin/recharge/ui/form/MallCommonHintViewConfig$MobileConfigure$4", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
