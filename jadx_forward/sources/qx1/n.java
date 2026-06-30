package qx1;

/* loaded from: classes12.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nx1.z f448833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448835f;

    public n(qx1.q qVar, nx1.z zVar, mx1.a aVar) {
        this.f448835f = qVar;
        this.f448833d = zVar;
        this.f448834e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ix1.k kVar = new ix1.k();
        nx1.z zVar = this.f448833d;
        if (zVar != null) {
            nx1.d.q().r(kVar, zVar.c(), true, true, false, false, true);
        } else {
            nx1.d.q().r(kVar, null, true, true, false, false, true);
        }
        qx1.q.b(this.f448835f, this.f448834e);
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
