package vw0;

/* loaded from: classes5.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb f522348d;

    public v(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p899x36452d.p900x854b442e.C10953xe6406afb c10953xe6406afb) {
        this.f522348d = c10953xe6406afb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rw0.e eVar = this.f522348d.f150870d;
        if (eVar != null) {
            eVar.S();
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subviews/SetTitleView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
