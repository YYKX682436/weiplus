package nz4;

/* loaded from: classes12.dex */
public class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nz4.y f423157d;

    public i(nz4.y yVar) {
        this.f423157d = yVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NoteSelectManager", "delete");
        boolean z17 = nz4.y.M;
        nz4.y yVar = this.f423157d;
        if (!z17 || !yVar.f423176a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("NoteSelectManager", "delete: not init or not editable");
            yVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (nz4.y.a(yVar)) {
                lz4.a aVar = yVar.f423197v;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar).w7();
                }
                yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            lz4.a aVar2 = yVar.f423197v;
            if (aVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3 activityC19519x7af4daf3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) aVar2;
                db5.e1.A(activityC19519x7af4daf3, activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_p), "", activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_o), activityC19519x7af4daf3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_n), new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.p0(activityC19519x7af4daf3), null);
            } else {
                yVar.d();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/wenote/model/nativenote/multiselect/NoteSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
