package ox1;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ox1.s f431134d;

    public h(ox1.s sVar) {
        this.f431134d = sVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Editor.EditorSelectManager", "copy");
        boolean z17 = ox1.s.K;
        ox1.s sVar = this.f431134d;
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: not init");
            sVar.p();
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (ox1.s.a(sVar)) {
            mx1.a aVar = sVar.f431169v;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).h7();
            }
            yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sVar.p();
        int m17 = sVar.m();
        if (m17 == 2) {
            android.text.SpannableStringBuilder f17 = sVar.f(false, null, "");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(f17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: selectedSpan is null or empty");
                sVar.r();
                yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            } else {
                ix1.l lVar = new ix1.l();
                lVar.f376871s = lx1.c.a(f17);
                lVar.f376846c = -1;
                lVar.f376845b = false;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(lVar);
                nx1.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, arrayList2);
            }
        } else if (m17 == 3) {
            java.util.ArrayList e17 = sVar.e(false, null, "");
            if (e17 == null || e17.size() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: dataList is null or empty");
                sVar.r();
            } else {
                nx1.b.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, e17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Editor.EditorSelectManager", "copy: not in select");
            sVar.r();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/multiselect/EditorSelectManager$12", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
