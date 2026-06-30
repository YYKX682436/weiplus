package ox1;

/* loaded from: classes12.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431132d;

    public f(ox1.s sVar) {
        this.f431132d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "delete");
        boolean z17 = ox1.s.K;
        ox1.s sVar = this.f431132d;
        if (!z17 || !sVar.f431148a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "delete: not init or not editable");
            sVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            if (ox1.s.a(sVar)) {
                mx1.a aVar = sVar.f431169v;
                if (aVar != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).h7();
                }
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            mx1.a aVar2 = sVar.f431169v;
            if (aVar2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar2;
                db5.e1.A(abstractActivityC13156x6363e8e1, abstractActivityC13156x6363e8e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boi), "", abstractActivityC13156x6363e8e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.boh), abstractActivityC13156x6363e8e1.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bog), new com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.y0(abstractActivityC13156x6363e8e1), null);
            } else {
                sVar.d();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
