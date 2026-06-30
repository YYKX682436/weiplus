package nx1;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.j f422824d;

    public h(nx1.j jVar) {
        this.f422824d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nx1.j jVar = this.f422824d;
        jVar.f422825a.dismiss();
        android.view.View view2 = jVar.f422826b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nx1.i iVar = jVar.f422827c;
        if (iVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 abstractActivityC13156x6363e8e1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) iVar;
            int c17 = nx1.b.c(abstractActivityC13156x6363e8e1.mo55332x76847179());
            if (c17 == 2) {
                if (nx1.b.d(abstractActivityC13156x6363e8e1)) {
                    abstractActivityC13156x6363e8e1.f7();
                } else {
                    nx1.d.q().h(false);
                    nx1.b.a();
                    ix1.l lVar = new ix1.l();
                    lVar.f376871s = "";
                    lVar.f376845b = false;
                    lVar.f376850g = false;
                    lVar.f376846c = 0;
                    lVar.f376852i = true;
                    nx1.d.q().b(lVar, false);
                    abstractActivityC13156x6363e8e1.d7();
                }
            } else if (c17 == 3) {
                java.util.ArrayList b17 = nx1.b.b();
                if (nx1.d.q().g(b17)) {
                    abstractActivityC13156x6363e8e1.f7();
                } else {
                    nx1.d.q().h(false);
                    nx1.d.q().s(b17, null, false, true, false, false, false);
                    abstractActivityC13156x6363e8e1.b5();
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
