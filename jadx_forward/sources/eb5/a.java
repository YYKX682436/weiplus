package eb5;

/* loaded from: classes5.dex */
public class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eb5.e f332450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb5.d f332451e;

    public a(eb5.d dVar, eb5.e eVar) {
        this.f332451e = dVar;
        this.f332450d = eVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        eb5.d dVar = this.f332451e;
        if (dVar.f332455e != null) {
            eb5.e eVar = this.f332450d;
            int m8183xf806b362 = ((eb5.e) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) eVar.f3639x46306858.getParent()).m0(eVar.f3639x46306858)).m8183xf806b362();
            if (m8183xf806b362 < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecyclerViewAdapterBase", "[onBindViewHolder#setOnClickListener] pos=%s", java.lang.Integer.valueOf(m8183xf806b362));
                yj0.a.h(this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            dVar.f332455e.b(m8183xf806b362, view, dVar.x(m8183xf806b362));
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/adapter/RecyclerViewAdapterBase$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
