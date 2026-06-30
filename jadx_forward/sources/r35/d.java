package r35;

/* loaded from: classes5.dex */
public class d implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.i3 f450600d;

    public d(r35.a aVar, db5.i3 i3Var) {
        this.f450600d = i3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/applet/AddContact$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f450600d.B();
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/applet/AddContact$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
