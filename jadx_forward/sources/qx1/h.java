package qx1;

/* loaded from: classes12.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448820d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448821e;

    public h(qx1.q qVar, mx1.a aVar) {
        this.f448821e = qVar;
        this.f448820d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qx1.q qVar = this.f448821e;
        android.view.View view2 = qVar.f448841b;
        char c17 = (view2 == null || view2.getVisibility() == 8) ? (char) 0 : qVar.f448843d.getVisibility() == 0 ? (char) 3 : (char) 1;
        mx1.a aVar = this.f448820d;
        if (c17 == 1) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).k7(false, 0L);
            qVar.c(3, 100L);
        } else if (c17 == 3) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1) aVar).k7(true, 50L);
            qVar.c(1, 0L);
        } else if (c17 == 2) {
            qVar.c(3, 0L);
        }
        aVar.q0(1L);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
