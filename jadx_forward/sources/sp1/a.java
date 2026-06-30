package sp1;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sp1.b f492479d;

    public a(sp1.b bVar) {
        this.f492479d = bVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d m165018x9aa04c3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/view/item/FloatBallViewNormalItem$setOnDeleteListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onViewDeleteButtonClick ");
        sp1.b bVar = this.f492479d;
        sb6.append(bVar.f492480d.f438926d.f174582g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallViewNormalItem", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s H0 = com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1274x7643c6b5.s.H0();
        m165018x9aa04c3 = bVar.m165018x9aa04c3();
        H0.U(m165018x9aa04c3);
        yj0.a.h(this, "com/tencent/mm/plugin/ball/view/item/FloatBallViewNormalItem$setOnDeleteListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
