package qx1;

/* loaded from: classes12.dex */
public class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448837e;

    public o(qx1.q qVar, mx1.a aVar) {
        this.f448837e = qVar;
        this.f448836d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qx1.q qVar = this.f448837e;
        qVar.f448844e.setPressed(false);
        qVar.f448845f.setPressed(false);
        if (qVar.f448851l || qVar.f448850k) {
            qVar.f448852m = false;
        }
        px1.s sVar = px1.v.f440394b;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!qVar.f448852m);
        nx1.z zVar = qVar.f448840a;
        if (zVar != null) {
            zVar.d(sVar, valueOf);
        }
        boolean z17 = !qVar.f448852m;
        qVar.f448852m = z17;
        qx1.q.a(qVar, view, z17);
        qx1.q.b(qVar, this.f448836d);
        qVar.f448851l = false;
        qVar.f448850k = false;
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
