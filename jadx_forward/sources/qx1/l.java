package qx1;

/* loaded from: classes12.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mx1.a f448829d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qx1.q f448830e;

    public l(qx1.q qVar, mx1.a aVar) {
        this.f448830e = qVar;
        this.f448829d = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        qx1.q qVar = this.f448830e;
        qVar.f448846g.setPressed(false);
        qVar.f448845f.setPressed(false);
        if (qVar.f448851l || qVar.f448852m) {
            qVar.f448850k = false;
        }
        px1.c cVar = px1.v.f440395c;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(!qVar.f448850k);
        nx1.z zVar = qVar.f448840a;
        if (zVar != null) {
            zVar.d(cVar, valueOf);
        }
        boolean z17 = !qVar.f448850k;
        qVar.f448850k = z17;
        qx1.q.a(qVar, view, z17);
        qx1.q.b(qVar, this.f448829d);
        qVar.f448851l = false;
        qVar.f448852m = false;
        yj0.a.h(this, "com/tencent/mm/plugin/component/editor/widget/EditorFooterPanel$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
