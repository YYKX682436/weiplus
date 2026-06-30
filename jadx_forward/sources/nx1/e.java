package nx1;

/* loaded from: classes12.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.j f422821d;

    public e(nx1.j jVar) {
        this.f422821d = jVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        nx1.j jVar = this.f422821d;
        jVar.f422825a.dismiss();
        android.view.View view2 = jVar.f422826b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        nx1.i iVar = jVar.f422827c;
        if (iVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) iVar).Z6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/model/nativenote/manager/EditorOperateMenu$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
