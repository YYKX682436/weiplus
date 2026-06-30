package wu3;

/* loaded from: classes3.dex */
public final class e1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu3.f1 f531264d;

    public e1(wu3.f1 f1Var) {
        this.f531264d = f1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog$initNotifySnsBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wu3.f1 f1Var = this.f531264d;
        yz5.a aVar = f1Var.f531274s;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        f1Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/ui/editor/EditorMoreDialog$initNotifySnsBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
